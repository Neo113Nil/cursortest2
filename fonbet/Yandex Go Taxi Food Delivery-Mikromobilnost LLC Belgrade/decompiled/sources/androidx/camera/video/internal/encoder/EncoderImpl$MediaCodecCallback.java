package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import defpackage.c7z0;
import defpackage.d6z;
import defpackage.d94;
import defpackage.dy31;
import defpackage.fzn;
import defpackage.go31;
import defpackage.gzn;
import defpackage.ho31;
import defpackage.mq61;
import defpackage.ni91;
import defpackage.pyn;
import defpackage.sgb1;
import defpackage.syn;
import defpackage.vbj;
import defpackage.xyn;
import defpackage.yci0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
class EncoderImpl$MediaCodecCallback extends MediaCodec.Callback {
    private boolean mIsFirstVideoOutput;
    private boolean mReachStopTimeAsEos;
    private final ho31 mVideoTimestampConverter;
    final /* synthetic */ j this$0;
    private boolean mHasSendStartCallback = false;
    private boolean mHasFirstData = false;
    private boolean mHasEndData = false;
    private long mLastPresentationTimeUs = 0;
    private long mLastSentAdjustedTimeUs = 0;
    private boolean mIsOutputBufferInPauseState = false;
    private boolean mIsKeyFrameRequired = false;
    private boolean mStopped = false;

    public EncoderImpl$MediaCodecCallback(j jVar) {
        this.this$0 = jVar;
        this.mReachStopTimeAsEos = true;
        boolean z = jVar.c;
        this.mIsFirstVideoOutput = z;
        if (z) {
            this.mVideoTimestampConverter = new ho31(jVar.r, jVar.q, (CameraUseInconsistentTimebaseQuirk) vbj.a.b(CameraUseInconsistentTimebaseQuirk.class));
        } else {
            this.mVideoTimestampConverter = null;
        }
        if (((CodecStuckOnFlushQuirk) vbj.a.b(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(jVar.e.getString("mime"))) {
            return;
        }
        this.mReachStopTimeAsEos = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    private boolean checkBufferInfo(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        boolean z2;
        Timebase timebase;
        String str;
        String str2;
        if (this.mHasEndData) {
            sgb1.g(3, this.this$0.a);
            return false;
        }
        if (bufferInfo.size <= 0) {
            sgb1.g(3, this.this$0.a);
            return false;
        }
        if ((bufferInfo.flags & 2) != 0) {
            sgb1.g(3, this.this$0.a);
            return false;
        }
        ho31 ho31Var = this.mVideoTimestampConverter;
        if (ho31Var != null) {
            long j = bufferInfo.presentationTimeUs;
            c7z0 c7z0Var = ho31Var.a;
            if (ho31Var.e == null) {
                Timebase timebase2 = ho31Var.b;
                if (ho31Var.c != null) {
                    sgb1.g(5, "VideoTimebaseConverter");
                    z2 = false;
                } else if (c7z0Var.c() - c7z0Var.d() > 3000000) {
                    z2 = true;
                } else {
                    z = false;
                    ho31Var.e = timebase2;
                }
                Timebase timebase3 = Math.abs(j - c7z0Var.c()) < Math.abs(j - c7z0Var.d()) ? Timebase.REALTIME : Timebase.UPTIME;
                if (!z2 || timebase3 == timebase2) {
                    z = false;
                    timebase = timebase3;
                    Objects.toString(timebase);
                    sgb1.g(3, "VideoTimebaseConverter");
                } else {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        z = false;
                        StringBuilder sb = new StringBuilder(", SOC: ");
                        str2 = Build.SOC_MODEL;
                        sb.append(str2);
                        str = sb.toString();
                    } else {
                        z = false;
                        str = "";
                    }
                    timebase = timebase3;
                    sgb1.d("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i), str, ho31Var.b, timebase));
                }
                timebase2 = timebase;
                ho31Var.e = timebase2;
            } else {
                z = false;
            }
            int i2 = go31.a[ho31Var.e.ordinal()];
            if (i2 == 1) {
                if (ho31Var.d == -1) {
                    long j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                    long j3 = 0;
                    for (?? r12 = z; r12 < 3; r12++) {
                        long d = c7z0Var.d();
                        long c = c7z0Var.c();
                        long d2 = c7z0Var.d();
                        long j4 = d2 - d;
                        if (r12 == 0 || j4 < j2) {
                            j3 = c - ((d + d2) >> 1);
                            j2 = j4;
                        }
                    }
                    ho31Var.d = Math.max(0L, j3);
                    sgb1.g(3, "VideoTimebaseConverter");
                }
                j -= ho31Var.d;
            } else if (i2 != 2) {
                dy31.p(ho31Var.e, "Unknown timebase: ");
                return z;
            }
            bufferInfo.presentationTimeUs = j;
        } else {
            z = false;
        }
        long j5 = bufferInfo.presentationTimeUs;
        if (j5 <= this.mLastPresentationTimeUs) {
            sgb1.g(3, this.this$0.a);
            return z;
        }
        this.mLastPresentationTimeUs = j5;
        if (!this.this$0.x.contains((Range) Long.valueOf(j5))) {
            sgb1.g(3, this.this$0.a);
            j jVar = this.this$0;
            if (!jVar.z || bufferInfo.presentationTimeUs < ((Long) jVar.x.getUpper()).longValue()) {
                return z;
            }
            ScheduledFuture scheduledFuture = this.this$0.B;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.this$0.A = Long.valueOf(bufferInfo.presentationTimeUs);
            this.this$0.k();
            boolean z3 = z;
            this.this$0.z = z3;
            return z3;
        }
        boolean z4 = z;
        boolean updatePauseRangeStateAndCheckIfBufferPaused = updatePauseRangeStateAndCheckIfBufferPaused(bufferInfo);
        j jVar2 = this.this$0;
        if (updatePauseRangeStateAndCheckIfBufferPaused) {
            sgb1.g(3, jVar2.a);
            return z4;
        }
        long j6 = jVar2.y;
        long j7 = bufferInfo.presentationTimeUs;
        if (j6 > 0) {
            j7 -= j6;
        }
        if (j7 <= this.mLastSentAdjustedTimeUs) {
            sgb1.g(3, jVar2.a);
            if (!this.this$0.c || (bufferInfo.flags & 1) == 0) {
                return false;
            }
            this.mIsKeyFrameRequired = true;
            return false;
        }
        if (!this.mHasFirstData && !this.mIsKeyFrameRequired && jVar2.c) {
            this.mIsKeyFrameRequired = true;
        }
        if (!this.mIsKeyFrameRequired) {
            return true;
        }
        if ((bufferInfo.flags & 1) != 0) {
            this.mIsKeyFrameRequired = false;
            return true;
        }
        sgb1.g(3, jVar2.a);
        this.this$0.h();
        return false;
    }

    private boolean isEndOfStream(MediaCodec.BufferInfo bufferInfo) {
        Range range = j.H;
        if ((bufferInfo.flags & 4) == 0 || shouldSkipPrematureEos()) {
            return this.mReachStopTimeAsEos && isEosSignalledAndStopTimeReached(bufferInfo);
        }
        return true;
    }

    private boolean isEosSignalledAndStopTimeReached(MediaCodec.BufferInfo bufferInfo) {
        j jVar = this.this$0;
        return jVar.F && bufferInfo.presentationTimeUs > ((Long) jVar.x.getUpper()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onError$4(MediaCodec.CodecException codecException) {
        switch (this.this$0.w.ordinal()) {
            case 0:
            case 7:
            case 8:
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                j jVar = this.this$0;
                jVar.getClass();
                jVar.b(1, codecException.getMessage(), codecException);
                break;
            default:
                yci0.t(this.this$0.w, "Unknown state: ");
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onInputBufferAvailable$0(int i) {
        boolean z = this.mStopped;
        j jVar = this.this$0;
        if (z) {
            sgb1.g(5, jVar.a);
        }
        switch (jVar.w.ordinal()) {
            case 0:
            case 7:
            case 8:
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.this$0.l.offer(Integer.valueOf(i));
                this.this$0.d();
                break;
            default:
                yci0.t(this.this$0.w, "Unknown state: ");
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onOutputBufferAvailable$1(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        j jVar;
        xyn xynVar;
        Executor executor;
        boolean z = this.mStopped;
        j jVar2 = this.this$0;
        if (z) {
            sgb1.g(5, jVar2.a);
            return;
        }
        switch (jVar2.w.ordinal()) {
            case 0:
            case 7:
            case 8:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                synchronized (this.this$0.b) {
                    jVar = this.this$0;
                    xynVar = jVar.u;
                    executor = jVar.v;
                }
                if (jVar.c && jVar.c()) {
                    bufferInfo.presentationTimeUs = this.this$0.n(bufferInfo.presentationTimeUs);
                }
                int i2 = 1;
                if (!this.mHasSendStartCallback) {
                    this.mHasSendStartCallback = true;
                    try {
                        Objects.requireNonNull(xynVar);
                        executor.execute(new gzn(xynVar, i2));
                    } catch (RejectedExecutionException e) {
                        sgb1.e(this.this$0.a, "Unable to post to the supplied executor.", e);
                    }
                }
                if (checkBufferInfo(bufferInfo)) {
                    if (!this.mHasFirstData) {
                        this.mHasFirstData = true;
                        j jVar3 = this.this$0;
                        String str = jVar3.a;
                        long j = bufferInfo.presentationTimeUs;
                        Objects.toString(jVar3.q);
                        SystemClock.uptimeMillis();
                        SystemClock.elapsedRealtime();
                        sgb1.g(3, str);
                    }
                    MediaCodec.BufferInfo resolveOutputBufferInfo = resolveOutputBufferInfo(bufferInfo);
                    this.mLastSentAdjustedTimeUs = resolveOutputBufferInfo.presentationTimeUs;
                    try {
                        sendEncodedData(new pyn(mediaCodec, i, resolveOutputBufferInfo), xynVar, executor);
                    } catch (MediaCodec.CodecException e2) {
                        j jVar4 = this.this$0;
                        jVar4.getClass();
                        jVar4.b(1, e2.getMessage(), e2);
                        return;
                    }
                } else {
                    try {
                        this.this$0.f.releaseOutputBuffer(i, false);
                    } catch (MediaCodec.CodecException e3) {
                        j jVar5 = this.this$0;
                        jVar5.getClass();
                        jVar5.b(1, e3.getMessage(), e3);
                        return;
                    }
                }
                if (!this.mHasEndData && isEndOfStream(bufferInfo)) {
                    reachEndData();
                }
                if (this.mIsFirstVideoOutput) {
                    this.mIsFirstVideoOutput = false;
                    return;
                }
                return;
            default:
                yci0.t(this.this$0.w, "Unknown state: ");
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MediaFormat lambda$onOutputFormatChanged$5(MediaFormat mediaFormat) {
        return mediaFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onOutputFormatChanged$6(xyn xynVar, MediaFormat mediaFormat) {
        xynVar.w(new h(mediaFormat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onOutputFormatChanged$7(MediaFormat mediaFormat) {
        xyn xynVar;
        Executor executor;
        boolean z = this.mStopped;
        j jVar = this.this$0;
        if (z) {
            sgb1.g(5, jVar.a);
            return;
        }
        switch (jVar.w.ordinal()) {
            case 0:
            case 7:
            case 8:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                j jVar2 = this.this$0;
                if (jVar2.c && jVar2.c()) {
                    mediaFormat.setInteger("time-lapse-enable", 1);
                    mediaFormat.setInteger("time-lapse-fps", ((d94) this.this$0.d).g);
                }
                synchronized (this.this$0.b) {
                    j jVar3 = this.this$0;
                    xynVar = jVar3.u;
                    executor = jVar3.v;
                }
                try {
                    executor.execute(new a(2, xynVar, mediaFormat));
                    return;
                } catch (RejectedExecutionException e) {
                    sgb1.e(this.this$0.a, "Unable to post to the supplied executor.", e);
                    return;
                }
            default:
                yci0.t(this.this$0.w, "Unknown state: ");
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reachEndData$2(Executor executor, xyn xynVar) {
        if (this.this$0.w == EncoderImpl$InternalState.ERROR) {
            return;
        }
        try {
            Objects.requireNonNull(xynVar);
            executor.execute(new gzn(xynVar, 0));
        } catch (RejectedExecutionException e) {
            sgb1.e(this.this$0.a, "Unable to post to the supplied executor.", e);
        }
    }

    private MediaCodec.BufferInfo resolveOutputBufferInfo(MediaCodec.BufferInfo bufferInfo) {
        long j = this.this$0.y;
        long j2 = j > 0 ? bufferInfo.presentationTimeUs - j : bufferInfo.presentationTimeUs;
        if (bufferInfo.presentationTimeUs == j2) {
            return bufferInfo;
        }
        d6z.y(null, j2 > this.mLastSentAdjustedTimeUs);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, j2, bufferInfo.flags);
        return bufferInfo2;
    }

    private void sendEncodedData(pyn pynVar, xyn xynVar, Executor executor) {
        this.this$0.o.add(pynVar);
        ni91.a(ni91.g(pynVar.x), new i(this, pynVar), this.this$0.i);
        try {
            executor.execute(new a(1, xynVar, pynVar));
        } catch (RejectedExecutionException e) {
            sgb1.e(this.this$0.a, "Unable to post to the supplied executor.", e);
            pynVar.close();
        }
    }

    private boolean shouldSkipPrematureEos() {
        return this.mIsFirstVideoOutput && vbj.a.b(PrematureEndOfStreamVideoQuirk.class) != null;
    }

    private boolean updatePauseRangeStateAndCheckIfBufferPaused(MediaCodec.BufferInfo bufferInfo) {
        int i;
        boolean z;
        Executor executor;
        xyn xynVar;
        Range range;
        j jVar = this.this$0;
        long j = bufferInfo.presentationTimeUs;
        ArrayDeque arrayDeque = jVar.p;
        while (!arrayDeque.isEmpty()) {
            Range range2 = (Range) arrayDeque.getFirst();
            if (j <= ((Long) range2.getUpper()).longValue()) {
                break;
            }
            arrayDeque.removeFirst();
            long longValue = (((Long) range2.getUpper()).longValue() - ((Long) range2.getLower()).longValue()) + jVar.y;
            jVar.y = longValue;
            String str = jVar.a;
            mq61.g(longValue);
            sgb1.g(3, str);
        }
        j jVar2 = this.this$0;
        long j2 = bufferInfo.presentationTimeUs;
        Iterator it = jVar2.p.iterator();
        do {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            range = (Range) it.next();
            if (range.contains((Range) Long.valueOf(j2))) {
                z = true;
                break;
            }
        } while (j2 >= ((Long) range.getLower()).longValue());
        z = false;
        boolean z2 = this.mIsOutputBufferInPauseState;
        if (!z2 && z) {
            sgb1.g(3, this.this$0.a);
            this.mIsOutputBufferInPauseState = true;
            synchronized (this.this$0.b) {
                j jVar3 = this.this$0;
                executor = jVar3.v;
                xynVar = jVar3.u;
            }
            Objects.requireNonNull(xynVar);
            executor.execute(new gzn(xynVar, i));
            j jVar4 = this.this$0;
            if (jVar4.w == EncoderImpl$InternalState.PAUSED && ((jVar4.c || vbj.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.this$0.c || vbj.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                syn synVar = this.this$0.g;
                if (synVar instanceof fzn) {
                    ((fzn) synVar).d(false);
                }
                j jVar5 = this.this$0;
                jVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("drop-input-frames", 1);
                sgb1.g(3, jVar5.a);
                jVar5.f.setParameters(bundle);
            }
            this.this$0.A = Long.valueOf(bufferInfo.presentationTimeUs);
            j jVar6 = this.this$0;
            if (jVar6.z) {
                ScheduledFuture scheduledFuture = jVar6.B;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                this.this$0.k();
                this.this$0.z = false;
            }
        } else if (z2 && !z) {
            sgb1.g(3, this.this$0.a);
            this.mIsOutputBufferInPauseState = false;
            if (this.this$0.c && (bufferInfo.flags & 1) == 0) {
                this.mIsKeyFrameRequired = true;
            }
        }
        return this.mIsOutputBufferInPauseState;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.this$0.i.execute(new a(this, codecException, 3));
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
        this.this$0.i.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.f
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl$MediaCodecCallback.this.lambda$onInputBufferAvailable$0(i);
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
        this.this$0.i.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.g
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl$MediaCodecCallback.this.lambda$onOutputBufferAvailable$1(bufferInfo, mediaCodec, i);
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        String str = this.this$0.a;
        Objects.toString(mediaFormat);
        mq61.d(mediaFormat.getByteBuffer("csd-0"));
        if (mediaFormat.containsKey("csd-1")) {
            mq61.d(mediaFormat.getByteBuffer("csd-1"));
        }
        if (mediaFormat.containsKey("csd-2")) {
            mq61.d(mediaFormat.getByteBuffer("csd-2"));
        }
        sgb1.g(3, str);
        this.this$0.i.execute(new a(this, mediaFormat, 4));
    }

    public void reachEndData() {
        j jVar;
        xyn xynVar;
        Executor executor;
        sgb1.g(3, this.this$0.a);
        if (this.mHasEndData) {
            return;
        }
        int i = 1;
        this.mHasEndData = true;
        ScheduledFuture scheduledFuture = this.this$0.G;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.this$0.G = null;
        }
        synchronized (this.this$0.b) {
            jVar = this.this$0;
            xynVar = jVar.u;
            executor = jVar.v;
        }
        jVar.m(new e(i, this, executor, xynVar));
    }

    public void stop() {
        this.mStopped = true;
    }
}
