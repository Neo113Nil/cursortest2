package ru.ok.gl.effects.media.controller.video;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.media3.exoplayer.l;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.TreeSet;
import ru.ok.gl.effects.media.controller.util.ConditionLock;
import xsna.lhg;
import xsna.o7j;
import xsna.tw3;

/* loaded from: classes9.dex */
public class MoviePlayer {
    private static final String TAG = "MoviePlayer";
    private static final boolean VERBOSE = false;
    private MediaCodec decoder;
    private MediaExtractor extractor;
    private o7j<Runnable> mAudioLooper;
    private l mAudioPlayer;
    FrameCallback mFrameCallback;
    private volatile boolean mLoop;
    private final Surface mOutputSurface;
    private final File mSourceFile;
    private final int mVideoHeight;
    private final int mVideoWidth;
    private boolean pauseAfterFirstFrame;
    private PlayTask.PlayerFeedback playerFeedback;
    private final boolean waitAfterFinish;
    private final MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();
    private final ConditionLock stoppingLock = new ConditionLock(false);
    private volatile boolean mIsStopRequested = false;
    private volatile boolean stopAfterRender = false;
    private volatile boolean finish = false;
    private volatile boolean videoPlaybackIsFinished = false;
    private final TreeSet<Long> keyFrames = new TreeSet<>();
    private boolean firstFrameRenderer = false;
    private long startMs = 0;
    private boolean start = true;
    private boolean stillSeeking = false;
    private float speed = 1.0f;
    private float operatingRate = -1.0f;

    public interface FrameCallback {
        void loopReset();

        void paures(boolean z);

        void postRender();

        void preRender(long j);

        void reset();

        void setSpeed(float f);
    }

    public static class PlayTask implements Runnable {
        private boolean mDoLoop;
        private MoviePlayer mPlayer;
        private final Object mStopLock = new Object();
        private boolean mStopped = false;
        private Thread mThread;

        public interface PlayerFeedback {
            void onFirstFrame();

            void onVideoFinished();
        }

        public PlayTask(MoviePlayer moviePlayer, PlayerFeedback playerFeedback) {
            this.mPlayer = moviePlayer;
            moviePlayer.setPlayerFeedback(playerFeedback);
        }

        public void execute() {
            Thread thread = new Thread(this, "Movie Player");
            this.mThread = thread;
            thread.start();
        }

        public long getNextClosestKeyFramePts(long j) {
            return this.mPlayer.getNextClosestKeyFramePts(j);
        }

        public void release() {
            this.mPlayer.stop(false, 0L);
            waitForStop();
        }

        public void requestContinue() {
            this.mPlayer.requestContinue();
        }

        public void requestStop() {
            this.mPlayer.requestStop();
        }

        public void restart(long j) {
            this.mPlayer.stop(true, j);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mPlayer.play();
                this.mPlayer.mIsStopRequested = true;
                this.mPlayer.videoPlaybackIsFinished = true;
                synchronized (this.mStopLock) {
                    this.mStopped = true;
                    this.mStopLock.notifyAll();
                }
            } catch (Exception unused) {
                this.mPlayer.mIsStopRequested = true;
                this.mPlayer.videoPlaybackIsFinished = true;
                synchronized (this.mStopLock) {
                    this.mStopped = true;
                    this.mStopLock.notifyAll();
                }
            } catch (Throwable th) {
                this.mPlayer.mIsStopRequested = true;
                this.mPlayer.videoPlaybackIsFinished = true;
                synchronized (this.mStopLock) {
                    this.mStopped = true;
                    this.mStopLock.notifyAll();
                    throw th;
                }
            }
        }

        public void setLoopMode(boolean z) {
            this.mDoLoop = z;
        }

        public void waitForStop() {
            synchronized (this.mStopLock) {
                while (!this.mStopped) {
                    try {
                        this.mStopLock.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public MoviePlayer(File file, Surface surface, FrameCallback frameCallback, boolean z, boolean z2) throws IOException {
        this.mSourceFile = file;
        this.mOutputSurface = surface;
        this.mFrameCallback = frameCallback;
        this.pauseAfterFirstFrame = !z;
        this.waitAfterFinish = z2;
        MediaExtractor mediaExtractor = null;
        try {
            MediaExtractor mediaExtractor2 = new MediaExtractor();
            try {
                mediaExtractor2.setDataSource(file.toString());
                int selectTrack = selectTrack(mediaExtractor2);
                if (selectTrack < 0) {
                    throw new RuntimeException("No video track found in " + file);
                }
                mediaExtractor2.selectTrack(selectTrack);
                MediaFormat trackFormat = mediaExtractor2.getTrackFormat(selectTrack);
                this.mVideoWidth = trackFormat.getInteger("width");
                this.mVideoHeight = trackFormat.getInteger("height");
                mediaExtractor2.release();
            } catch (Throwable th) {
                th = th;
                mediaExtractor = mediaExtractor2;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void doExtract(MediaExtractor mediaExtractor, int i, MediaCodec mediaCodec, FrameCallback frameCallback) {
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int dequeueInputBuffer;
        MediaCodec mediaCodec2 = mediaCodec;
        ByteBuffer[] inputBuffers = mediaCodec2.getInputBuffers();
        long j2 = -1;
        boolean z6 = false;
        long j3 = -1;
        boolean z7 = false;
        boolean z8 = false;
        while (!z7) {
            if (!this.mIsStopRequested) {
                long j4 = j3;
                if (z8 || (dequeueInputBuffer = mediaCodec2.dequeueInputBuffer(10000L)) < 0) {
                    z = true;
                    j = 10000;
                    j3 = j4;
                } else {
                    if (j4 == j2) {
                        j4 = System.nanoTime();
                    }
                    long j5 = j4;
                    int readSampleData = mediaExtractor.readSampleData(inputBuffers[dequeueInputBuffer], z6 ? 1 : 0);
                    if (readSampleData < 0) {
                        z8 = true;
                        j = 10000;
                        mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        mediaCodec2 = mediaCodec;
                        z = true;
                    } else {
                        j = 10000;
                        mediaExtractor.getSampleTrackIndex();
                        long sampleTime = mediaExtractor.getSampleTime();
                        if ((mediaExtractor.getSampleFlags() & 1) != 0) {
                            this.keyFrames.add(Long.valueOf(sampleTime));
                        }
                        z = true;
                        mediaCodec2 = mediaCodec;
                        mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, 0);
                        mediaExtractor.advance();
                    }
                    j3 = j5;
                }
                if (z7) {
                    j2 = -1;
                    z6 = false;
                } else {
                    int dequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(this.mBufferInfo, j);
                    if (dequeueOutputBuffer != -1 && dequeueOutputBuffer != -3) {
                        if (dequeueOutputBuffer == -2) {
                            mediaCodec2.getOutputFormat();
                        } else {
                            if (dequeueOutputBuffer < 0) {
                                throw new RuntimeException(lhg.a(dequeueOutputBuffer, "unexpected result from decoder.dequeueOutputBuffer: "));
                            }
                            if (j3 != 0) {
                                System.nanoTime();
                                j3 = 0;
                            }
                            if ((this.mBufferInfo.flags & 4) != 0) {
                                if (this.mLoop) {
                                    z3 = z;
                                } else {
                                    if (this.waitAfterFinish) {
                                        this.mIsStopRequested = z;
                                        this.videoPlaybackIsFinished = z;
                                    } else {
                                        this.videoPlaybackIsFinished = z;
                                        z7 = z;
                                    }
                                    z3 = false;
                                }
                                this.playerFeedback.onVideoFinished();
                            } else {
                                z3 = false;
                            }
                            MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
                            boolean z9 = bufferInfo.size != 0 ? z : false;
                            if (this.stillSeeking) {
                                z4 = z7;
                                if (this.startMs * 1000 <= bufferInfo.presentationTimeUs) {
                                    this.stillSeeking = false;
                                    z5 = true;
                                } else {
                                    z5 = false;
                                    z9 = false;
                                }
                            } else {
                                z4 = z7;
                                z5 = false;
                            }
                            if (z9 && frameCallback != null) {
                                z5 |= !this.firstFrameRenderer && this.pauseAfterFirstFrame;
                                frameCallback.preRender(bufferInfo.presentationTimeUs);
                            }
                            mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer, z9);
                            if (!z9 || frameCallback == null) {
                                z2 = false;
                            } else {
                                if (this.stopAfterRender) {
                                    this.mIsStopRequested = true;
                                    z2 = false;
                                    this.stopAfterRender = false;
                                } else {
                                    z2 = false;
                                }
                                frameCallback.postRender();
                            }
                            if (z3) {
                                mediaExtractor.seekTo(0L, 2);
                                o7j<Runnable> o7jVar = this.mAudioLooper;
                                if (o7jVar != null) {
                                    o7jVar.accept(new tw3(this, 13));
                                }
                                mediaCodec2.flush();
                                frameCallback.loopReset();
                                z8 = z2;
                            }
                            if (z5) {
                                frameCallback.paures(true);
                                this.mIsStopRequested = true;
                            }
                            if (!this.firstFrameRenderer) {
                                this.playerFeedback.onFirstFrame();
                            }
                            this.firstFrameRenderer |= z9;
                            z7 = z4;
                            z6 = z2;
                            j2 = -1;
                        }
                    }
                    z2 = false;
                    z6 = z2;
                    j2 = -1;
                }
            } else {
                if (this.finish) {
                    this.finish = z6;
                    return;
                }
                if (!this.stoppingLock.get()) {
                    this.stoppingLock.set(true);
                }
                synchronized (this.stoppingLock) {
                    try {
                        this.stoppingLock.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    private void doSetSpeed() {
        if (this.speed == 1.0f) {
            return;
        }
        int i = -1;
        for (int i2 = 0; i2 < this.extractor.getTrackCount(); i2++) {
            try {
                i = Math.max(i, this.extractor.getTrackFormat(i2).getInteger("frame-rate"));
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        if (i != -1) {
            Bundle bundle = new Bundle();
            float f = i;
            bundle.putFloat("operating-rate", this.speed * f);
            this.operatingRate = f * this.speed;
            this.decoder.setParameters(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doExtract$0() {
        l lVar = this.mAudioPlayer;
        if (lVar != null) {
            lVar.x(0L);
        }
    }

    private void requestBreak() {
        this.finish = true;
        this.mIsStopRequested = true;
        synchronized (this.stoppingLock) {
            this.stoppingLock.notify();
        }
    }

    private void requestResume() {
        this.mIsStopRequested = false;
        synchronized (this.stoppingLock) {
            this.stoppingLock.notify();
        }
    }

    private void reset() {
        this.mFrameCallback.reset();
        this.decoder.flush();
        this.extractor.seekTo(this.startMs * 1000, 0);
        this.stillSeeking = true;
        this.firstFrameRenderer = false;
        this.videoPlaybackIsFinished = false;
        requestResume();
    }

    private static int selectTrack(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                return i;
            }
        }
        return -1;
    }

    public long getNextClosestKeyFramePts(long j) {
        Long ceiling = this.keyFrames.ceiling(Long.valueOf(j));
        return ceiling != null ? ceiling.longValue() : j;
    }

    public int getVideoHeight() {
        return this.mVideoHeight;
    }

    public int getVideoWidth() {
        return this.mVideoWidth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void play() throws IOException {
        this.extractor = null;
        if (!this.mSourceFile.canRead()) {
            throw new FileNotFoundException("Unable to read " + this.mSourceFile);
        }
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.extractor = mediaExtractor;
            mediaExtractor.setDataSource(this.mSourceFile.toString());
            int selectTrack = selectTrack(this.extractor);
            if (selectTrack < 0) {
                throw new RuntimeException("No video track found in " + this.mSourceFile);
            }
            this.extractor.selectTrack(selectTrack);
            MediaFormat trackFormat = this.extractor.getTrackFormat(selectTrack);
            this.decoder = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
            doSetSpeed();
            float f = this.operatingRate;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                trackFormat.setFloat("operating-rate", f);
            }
            this.decoder.configure(trackFormat, this.mOutputSurface, (MediaCrypto) null, 0);
            this.decoder.start();
            boolean z = true;
            while (this.start) {
                this.start = false;
                if (z) {
                    z = false;
                } else {
                    reset();
                }
                doExtract(this.extractor, selectTrack, this.decoder, this.mFrameCallback);
            }
            MediaCodec mediaCodec = this.decoder;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                    this.decoder.release();
                } catch (IllegalStateException unused) {
                }
                this.decoder = null;
            }
            MediaExtractor mediaExtractor2 = this.extractor;
            if (mediaExtractor2 != null) {
                mediaExtractor2.release();
                this.extractor = null;
            }
        } finally {
        }
    }

    public void requestContinue() {
        if (this.videoPlaybackIsFinished) {
            return;
        }
        this.stoppingLock.set(false);
        this.stopAfterRender = false;
        requestResume();
    }

    public void requestStop() {
        if (this.mIsStopRequested) {
            return;
        }
        this.stopAfterRender = true;
        this.stoppingLock.await(true);
    }

    public void setAudioPlayer(l lVar, o7j<Runnable> o7jVar) {
        this.mAudioPlayer = lVar;
        this.mAudioLooper = o7jVar;
    }

    public void setLoopMode(boolean z) {
        this.mLoop = z;
    }

    public void setPlayerFeedback(PlayTask.PlayerFeedback playerFeedback) {
        this.playerFeedback = playerFeedback;
    }

    public void setSpeed(float f) {
        this.speed = f;
        this.mFrameCallback.setSpeed(f);
    }

    public void stop(boolean z, long j) {
        if (z) {
            this.start = true;
            this.startMs = j;
        }
        requestBreak();
    }
}
