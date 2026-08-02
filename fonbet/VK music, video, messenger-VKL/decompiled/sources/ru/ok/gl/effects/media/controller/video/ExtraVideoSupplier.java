package ru.ok.gl.effects.media.controller.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.datasource.c;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.source.n;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier;
import ru.ok.gl.effects.media.controller.video.MoviePlayer;
import ru.ok.gl.objects.SimpleGLProgramEx;
import ru.ok.gleffects.EffectVideoController;
import xsna.b630;
import xsna.fxc0;
import xsna.jwa0;
import xsna.kr10;
import xsna.mgq;
import xsna.o1;
import xsna.o7j;
import xsna.uel;

/* loaded from: classes9.dex */
public class ExtraVideoSupplier implements EffectVideoController {
    private static final String TAG = "ExtraVideoSupplier";
    private final boolean DEBUG;
    private volatile boolean allowAudio;
    private final Handler audioHandler;
    private volatile long audioResumeTimings;
    private final Context context;
    private SimpleGLProgramEx converter;
    private volatile float duetSpeed;
    private int expectedPlaybackDelayMillis;
    private File galleryVideoFile;
    private volatile boolean headsets;
    private volatile CopyOnWriteArraySet<EffectVideoController.OnFirstFrameListener> listeners;
    private final o7j<Boolean> recordingConsumer;
    private volatile boolean removeDuetTranscoding;
    private Video selected;
    private final SparseArray<Video> videos;

    /* renamed from: ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$gleffects$EffectVideoController$RenderMode;

        static {
            int[] iArr = new int[EffectVideoController.RenderMode.values().length];
            $SwitchMap$ru$ok$gleffects$EffectVideoController$RenderMode = iArr;
            try {
                iArr[EffectVideoController.RenderMode.DEFAULT_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$gleffects$EffectVideoController$RenderMode[EffectVideoController.RenderMode.DUET_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$ok$gleffects$EffectVideoController$RenderMode[EffectVideoController.RenderMode.UGC_BACKGROUND_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$ok$gleffects$EffectVideoController$RenderMode[EffectVideoController.RenderMode.CELEBRITY_CALL_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$ok$gleffects$EffectVideoController$RenderMode[EffectVideoController.RenderMode.EPICA_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class Video {

        @Nullable
        l audioPlayer;
        final boolean callOnFirstFrameAfterSeeking;
        SpeedControlCallback callback;
        final int[] frameBuffer;
        final int height;
        final int id;
        final boolean isDuet;
        MoviePlayer.PlayTask mPlayTask;
        String path;
        final SurfaceTextureWrapper st;
        final Surface surface;
        final int textureId;
        final int width;
        volatile boolean firstRenderered = false;
        volatile boolean callFirstFrameListener = false;
        volatile boolean anewFrame = false;
        volatile int playAfterFirstFrame = 0;

        public Video(int i, int i2, File file, int i3, int i4, boolean z, boolean z2, boolean z3, float f, boolean z4, boolean z5) throws IOException {
            this.path = file.getAbsolutePath();
            this.isDuet = z3;
            this.id = i;
            this.textureId = i2;
            this.width = i3;
            this.height = i4;
            this.callOnFirstFrameAfterSeeking = z4;
            int[] iArr = new int[1];
            this.frameBuffer = iArr;
            GLES20.glGenFramebuffers(1, iArr, 0);
            GLES20.glBindFramebuffer(36160, iArr[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
            GLES20.glBindFramebuffer(36160, 0);
            SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper();
            this.st = surfaceTextureWrapper;
            surfaceTextureWrapper.init();
            Surface surface = new Surface(surfaceTextureWrapper.getSurfaceTexture());
            this.surface = surface;
            SpeedControlCallback speedControlCallback = new SpeedControlCallback();
            this.callback = speedControlCallback;
            try {
                MoviePlayer moviePlayer = new MoviePlayer(file, surface, speedControlCallback, z, !z);
                moviePlayer.setLoopMode(z5);
                moviePlayer.setSpeed(f);
                if (z2) {
                    ExoPlayer.b bVar = new ExoPlayer.b(ExtraVideoSupplier.this.context);
                    bVar.c(Looper.myLooper());
                    fxc0.z(!bVar.y);
                    bVar.y = true;
                    this.audioPlayer = new l(bVar);
                    c.a aVar = new c.a(ExtraVideoSupplier.this.context);
                    b630 b630Var = new b630(new uel(), 8);
                    androidx.media3.exoplayer.upstream.a aVar2 = new androidx.media3.exoplayer.upstream.a();
                    kr10 b = kr10.b(Uri.fromFile(file));
                    b.b.getClass();
                    b.b.getClass();
                    b.b.getClass();
                    this.audioPlayer.r(new n(b, aVar, b630Var, androidx.media3.exoplayer.drm.b.a, aVar2, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null));
                    this.audioPlayer.A(new jwa0(f));
                    this.audioPlayer.prepare();
                    moviePlayer.setAudioPlayer(this.audioPlayer, new o7j() { // from class: xsna.ngq
                        @Override // xsna.o7j
                        public final void accept(Object obj) {
                            ExtraVideoSupplier.this.postToAudioPlayer((Runnable) obj);
                        }
                    });
                }
                this.mPlayTask = new MoviePlayer.PlayTask(moviePlayer, new MoviePlayer.PlayTask.PlayerFeedback() { // from class: ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier.Video.1
                    @Override // ru.ok.gl.effects.media.controller.video.MoviePlayer.PlayTask.PlayerFeedback
                    public void onFirstFrame() {
                        Video.this.onFirstFrame();
                    }

                    @Override // ru.ok.gl.effects.media.controller.video.MoviePlayer.PlayTask.PlayerFeedback
                    public void onVideoFinished() {
                        Video.this.onVideoFinished();
                    }
                });
                surfaceTextureWrapper.getSurfaceTexture().setDefaultBufferSize(i3, i4);
                surfaceTextureWrapper.getSurfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ru.ok.gl.effects.media.controller.video.b
                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                        ExtraVideoSupplier.Video.this.lambda$new$0(surfaceTexture);
                    }
                });
                this.mPlayTask.execute();
            } catch (IOException e) {
                Log.e(ExtraVideoSupplier.TAG, "Unable to play movie", e);
                this.surface.release();
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture) {
            this.anewFrame = true;
        }

        private void playWhenReady(boolean z) {
            if (!z) {
                ExtraVideoSupplier.this.audioHandler.removeCallbacksAndMessages(null);
                this.callback.paures(true);
                this.mPlayTask.requestStop();
                l lVar = this.audioPlayer;
                if (lVar != null) {
                    lVar.setPlayWhenReady(false);
                    ExtraVideoSupplier.this.audioResumeTimings = this.audioPlayer.getCurrentPosition();
                    return;
                }
                return;
            }
            l lVar2 = this.audioPlayer;
            if (lVar2 == null) {
                this.callback.paures(false);
                this.mPlayTask.requestContinue();
                return;
            }
            ExtraVideoSupplier.this.audioResumeTimings = lVar2.getCurrentPosition();
            Handler handler = ExtraVideoSupplier.this.audioHandler;
            final ExtraVideoSupplier extraVideoSupplier = ExtraVideoSupplier.this;
            handler.postDelayed(new Runnable() { // from class: ru.ok.gl.effects.media.controller.video.a
                @Override // java.lang.Runnable
                public final void run() {
                    ExtraVideoSupplier.access$700(ExtraVideoSupplier.this);
                }
            }, 2L);
            this.audioPlayer.setPlayWhenReady(true);
        }

        public void muteAudio(boolean z) {
            l lVar = this.audioPlayer;
            if (lVar != null) {
                if (z) {
                    lVar.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    lVar.setVolume(1.0f);
                }
            }
        }

        public void onFirstFrame() {
            this.callFirstFrameListener = !this.firstRenderered || this.callOnFirstFrameAfterSeeking;
            this.firstRenderered = true;
            if (this.playAfterFirstFrame == 1) {
                playWhenReady(true);
            }
            this.playAfterFirstFrame = 2;
        }

        public void onVideoFinished() {
            if (ExtraVideoSupplier.this.recordingConsumer != null) {
                ExtraVideoSupplier.this.recordingConsumer.accept(Boolean.FALSE);
            }
        }

        public void release() {
            l lVar = this.audioPlayer;
            if (lVar != null) {
                lVar.release();
            }
            this.mPlayTask.release();
            this.st.release();
            this.surface.release();
            GLES20.glDeleteFramebuffers(1, this.frameBuffer, 0);
            this.frameBuffer[0] = -1;
        }

        public void render(int i) {
            boolean andSetNewFrame = this.callback.getAndSetNewFrame();
            if (this.frameBuffer[0] == -1 || !andSetNewFrame) {
                return;
            }
            this.st.updateFrame();
            GLES20.glBindFramebuffer(36160, this.frameBuffer[0]);
            GLES20.glViewport(0, 0, this.width, this.height);
            ExtraVideoSupplier.this.converter.setTextureId(this.st.getTextureId());
            ExtraVideoSupplier.this.converter.render();
            GLES20.glBindFramebuffer(36160, 0);
            if (this.callFirstFrameListener) {
                Iterator it = ExtraVideoSupplier.this.listeners.iterator();
                while (it.hasNext()) {
                    ((EffectVideoController.OnFirstFrameListener) it.next()).onFirstFrame(i);
                }
                this.callFirstFrameListener = false;
            }
        }

        public boolean setPlayWhenReady(boolean z) {
            if (this.audioPlayer == null) {
                if (z) {
                    this.callback.paures(false);
                    this.mPlayTask.requestContinue();
                } else {
                    this.callback.paures(true);
                    this.mPlayTask.requestStop();
                }
                return false;
            }
            if (z) {
                if (this.playAfterFirstFrame == 0) {
                    this.playAfterFirstFrame = 1;
                }
            } else if (this.playAfterFirstFrame == 1) {
                this.playAfterFirstFrame = 0;
            }
            if (this.firstRenderered) {
                playWhenReady(z);
            }
            return true;
        }
    }

    public ExtraVideoSupplier(Context context, @Nullable o7j<Boolean> o7jVar, boolean z) {
        this.listeners = new CopyOnWriteArraySet<>();
        this.expectedPlaybackDelayMillis = -1;
        this.allowAudio = true;
        this.headsets = true;
        this.duetSpeed = 1.0f;
        this.removeDuetTranscoding = false;
        this.videos = new SparseArray<>();
        this.audioResumeTimings = 0L;
        this.context = context;
        this.audioHandler = new Handler(Looper.myLooper());
        this.recordingConsumer = o7jVar;
        this.DEBUG = z;
    }

    public static /* synthetic */ void access$700(ExtraVideoSupplier extraVideoSupplier) {
        extraVideoSupplier.audioStartListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void audioStartListener() {
        if (this.selected.audioPlayer.getCurrentPosition() <= this.audioResumeTimings + getExpectedPlaybackDelayMillis(this.context)) {
            this.audioHandler.postDelayed(new o1(this, 8), 2L);
            return;
        }
        this.selected.callback.paures(false);
        this.selected.mPlayTask.requestContinue();
        o7j<Boolean> o7jVar = this.recordingConsumer;
        if (o7jVar != null) {
            o7jVar.accept(Boolean.TRUE);
        }
    }

    private void configureMatrices(EffectVideoController.RenderMode renderMode) {
        int i = AnonymousClass1.$SwitchMap$ru$ok$gleffects$EffectVideoController$RenderMode[renderMode.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                }
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(this.galleryVideoFile.getAbsolutePath());
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            this.converter.setTexMat(fArr);
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            Matrix.rotateM(fArr2, 0, parseInt, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.converter.setMVPMat(fArr2);
            return;
        }
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.scaleM(fArr3, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr3, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.converter.setTexMat(fArr3);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        this.converter.setMVPMat(fArr4);
    }

    private Video createBackgroundVideo(int i, int i2, int i3, int i4) throws IOException {
        File file = this.galleryVideoFile;
        if (file != null) {
            return new Video(i, i2, file, i3, i4, false, true, false, 1.0f, false, true);
        }
        Log.e(TAG, "Gallery video file is null");
        return null;
    }

    private Video createCelebrityCallVideo(int i, int i2, int i3, int i4, File file) throws IOException {
        File prepareVideoFile = prepareVideoFile(i, file);
        if (prepareVideoFile != null) {
            return new Video(i, i2, prepareVideoFile, i3, i4, false, false, false, 1.0f, true, false);
        }
        return null;
    }

    private Video createDefaultVideo(int i, int i2, int i3, int i4, File file) throws IOException {
        File prepareVideoFile = prepareVideoFile(i, file);
        if (prepareVideoFile != null) {
            return new Video(i, i2, prepareVideoFile, i3, i4, true, false, false, 1.0f, true, true);
        }
        return null;
    }

    private Video createDuetVideo(int i, int i2, int i3, int i4, File file) throws IOException {
        File prepareVideoFile = prepareVideoFile(i, file);
        if (prepareVideoFile != null) {
            return new Video(i, i2, prepareVideoFile, i3, i4, false, this.allowAudio, true, this.duetSpeed, true, false);
        }
        return null;
    }

    private Video createEpicaVideo(int i, int i2, int i3, int i4) throws IOException {
        File file = this.galleryVideoFile;
        if (file != null) {
            return new Video(i, i2, file, i3, i4, false, false, false, 1.0f, false, false);
        }
        Log.e(TAG, "Gallery video file is null");
        return null;
    }

    private Video createVideo(int i, int i2, int i3, int i4, File file, EffectVideoController.RenderMode renderMode) {
        try {
            configureMatrices(renderMode);
            int i5 = AnonymousClass1.$SwitchMap$ru$ok$gleffects$EffectVideoController$RenderMode[renderMode.ordinal()];
            if (i5 == 1) {
                return createDefaultVideo(i, i2, i3, i4, file);
            }
            if (i5 == 2) {
                return createDuetVideo(i, i2, i3, i4, file);
            }
            if (i5 == 3) {
                return createBackgroundVideo(i, i2, i3, i4);
            }
            if (i5 == 4) {
                return createCelebrityCallVideo(i, i2, i3, i4, file);
            }
            if (i5 != 5) {
                return null;
            }
            return createEpicaVideo(i, i2, i3, i4);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private int getExpectedPlaybackDelayMillis(Context context) {
        if (this.headsets) {
            return 0;
        }
        int i = this.expectedPlaybackDelayMillis;
        if (i != -1) {
            return i;
        }
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
        if (context.getPackageManager().hasSystemFeature("android.hardware.audio.pro")) {
            this.expectedPlaybackDelayMillis = 13;
        } else if (hasSystemFeature) {
            this.expectedPlaybackDelayMillis = 30;
        } else {
            this.expectedPlaybackDelayMillis = 100;
        }
        return this.expectedPlaybackDelayMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$prepareVideoFile$0(File file, String str) {
        return str.endsWith(".mp4") || str.endsWith(".m4v");
    }

    private File prepareVideoFile(int i, File file) {
        File file2 = new File(file, "video");
        String[] list = file2.list(new mgq());
        if (list == null) {
            Log.e(TAG, "No videos folder/videos");
            return null;
        }
        Arrays.sort(list);
        File file3 = new File(file2, "sparse_" + list[i]);
        return (this.removeDuetTranscoding || this.duetSpeed <= 1.0f || !file3.isFile()) ? new File(file2, list[i]) : file3;
    }

    @Override // ru.ok.gleffects.EffectVideoController
    public void addOnFirstFrameListener(EffectVideoController.OnFirstFrameListener onFirstFrameListener) {
        this.listeners.add(onFirstFrameListener);
    }

    public void allowAudio(boolean z) {
        this.allowAudio = z;
    }

    @Override // ru.ok.gleffects.EffectVideoController
    public void clear() {
        for (int i = 0; i < this.videos.size(); i++) {
            Video valueAt = this.videos.valueAt(i);
            if (valueAt != null) {
                valueAt.release();
            }
        }
        this.videos.clear();
    }

    @Override // ru.ok.gleffects.EffectVideoController
    public void controlVideo(int i, int i2, int i3, int i4, File file, EffectVideoController.RenderMode renderMode) {
        if (renderMode == EffectVideoController.RenderMode.UGC_BACKGROUND_VIDEO || renderMode == EffectVideoController.RenderMode.EPICA_VIDEO) {
            clear();
        }
        Video video = this.videos.get(i);
        if (i2 < 0) {
            if (video != null) {
                video.release();
                this.videos.remove(i);
                return;
            }
            return;
        }
        if (video != null) {
            if (video.textureId == i2) {
                return;
            } else {
                video.release();
            }
        }
        if (this.converter == null) {
            this.converter = new SimpleGLProgramEx();
        }
        Video createVideo = createVideo(i, i2, i3, i4, file, renderMode);
        if (createVideo != null) {
            this.videos.put(i, createVideo);
        }
    }

    public long getCurrentAudioTimestamp() {
        l lVar;
        for (int i = 0; i < this.videos.size(); i++) {
            Video valueAt = this.videos.valueAt(i);
            if (valueAt != null && (lVar = valueAt.audioPlayer) != null) {
                return lVar.getCurrentPosition();
            }
        }
        return 0L;
    }

    public long getCurrentVideoTimestampMs() {
        for (int i = 0; i < this.videos.size(); i++) {
            Video valueAt = this.videos.valueAt(i);
            if (valueAt != null) {
                return valueAt.callback.getCurrentTimestamp() / 1000;
            }
        }
        return 0L;
    }

    @Override // ru.ok.gleffects.EffectVideoController
    public void interrupt() {
        clear();
    }

    public boolean isFirstRendered() {
        if (this.videos.size() != 0) {
            for (int i = 0; i < this.videos.size(); i++) {
                Video valueAt = this.videos.valueAt(i);
                if (valueAt != null) {
                    return valueAt.firstRenderered;
                }
            }
        }
        return false;
    }

    public void muteAudio(boolean z) {
        for (int i = 0; i < this.videos.size(); i++) {
            this.videos.valueAt(i).muteAudio(z);
        }
    }

    @Override // ru.ok.gleffects.EffectVideoController
    public void onRender() {
        for (int i = 0; i < this.videos.size(); i++) {
            this.videos.valueAt(i).render(this.videos.keyAt(i));
        }
    }

    public void postToAudioPlayer(Runnable runnable) {
        this.audioHandler.post(runnable);
    }

    @Override // ru.ok.gleffects.EffectVideoController
    public void registerGalleryVideoPath(String str) {
        this.galleryVideoFile = new File(str);
    }

    @Override // ru.ok.gleffects.EffectVideoController
    public void removeOnFirstFrameListener(EffectVideoController.OnFirstFrameListener onFirstFrameListener) {
        this.listeners.remove(onFirstFrameListener);
    }

    public long restart(long j) {
        for (int i = 0; i < this.videos.size(); i++) {
            Video valueAt = this.videos.valueAt(i);
            valueAt.mPlayTask.restart(j);
            l lVar = valueAt.audioPlayer;
            if (lVar != null) {
                lVar.setPlayWhenReady(false);
                valueAt.audioPlayer.x(j);
            }
        }
        return j;
    }

    public void seekAudio(long j) {
        for (int i = 0; i < this.videos.size(); i++) {
            Video valueAt = this.videos.valueAt(i);
            l lVar = valueAt != null ? valueAt.audioPlayer : null;
            if (lVar != null) {
                lVar.x(j / 1000);
            }
        }
    }

    @Override // ru.ok.gleffects.EffectVideoController
    public void setDuetSpeed(float f, boolean z) {
        this.duetSpeed = f;
        this.removeDuetTranscoding = z;
        for (int i = 0; i < this.videos.size(); i++) {
            Video valueAt = this.videos.valueAt(i);
            if (valueAt.isDuet) {
                valueAt.release();
                SparseArray<Video> sparseArray = this.videos;
                sparseArray.put(sparseArray.keyAt(i), createVideo(valueAt.id, valueAt.textureId, valueAt.width, valueAt.height, new File(valueAt.path).getParentFile().getParentFile(), EffectVideoController.RenderMode.DUET_VIDEO));
            }
        }
    }

    public void setHeadsets(boolean z) {
        this.headsets = z;
    }

    @Override // ru.ok.gleffects.EffectVideoController
    public void setPlayWhenReady(boolean z) {
        for (int i = 0; i < this.videos.size(); i++) {
            Video valueAt = this.videos.valueAt(i);
            if (valueAt.setPlayWhenReady(z)) {
                this.selected = valueAt;
            }
        }
    }

    public void syncAudioWithVideo() {
        for (int i = 0; i < this.videos.size(); i++) {
            Video valueAt = this.videos.valueAt(i);
            l lVar = valueAt != null ? valueAt.audioPlayer : null;
            if (lVar != null) {
                lVar.x(valueAt.callback.getCurrentTimestamp() / 1000);
            }
        }
    }

    public ExtraVideoSupplier(Context context, @Nullable o7j<Boolean> o7jVar) {
        this(context, o7jVar, false);
    }
}
