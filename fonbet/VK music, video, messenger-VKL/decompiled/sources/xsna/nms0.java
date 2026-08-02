package xsna;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import xsna.vmr;

/* compiled from: VideoFrameReleaseHelper.java */
/* loaded from: classes12.dex */
public final class nms0 {
    public final vmr a;
    public final Context b;

    @Nullable
    public a c;
    public boolean d;

    @Nullable
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;

    /* compiled from: VideoFrameReleaseHelper.java */
    public static final class b extends a implements Choreographer.FrameCallback {
        @Override // xsna.nms0.a
        public final void a() {
            long j;
            this.c.registerDisplayListener(this, y2r0.o(null));
            this.b.postFrameCallback(this);
            if (this.c.getDisplay(0) != null) {
                j = (long) (1.0E9d / r0.getRefreshRate());
            } else {
                ahn.F("Unable to query display refresh rate");
                j = C.TIME_UNSET;
            }
            this.e = j;
        }

        @Override // xsna.nms0.a
        public final void b() {
            this.c.unregisterDisplayListener(this);
            this.b.removeFrameCallback(this);
            this.d = C.TIME_UNSET;
            this.e = C.TIME_UNSET;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.d = j;
            this.b.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            long j;
            if (i == 0) {
                this.b.postFrameCallback(this);
                if (this.c.getDisplay(0) != null) {
                    j = (long) (1.0E9d / r5.getRefreshRate());
                } else {
                    ahn.F("Unable to query display refresh rate");
                    j = C.TIME_UNSET;
                }
                this.e = j;
            }
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    public static final class c extends a implements Choreographer$VsyncCallback {
        public final Handler f;

        public c(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
            this.f = y2r0.o(null);
        }

        @Override // xsna.nms0.a
        public final void a() {
            this.c.registerDisplayListener(this, y2r0.o(null));
            this.b.postVsyncCallback(this);
        }

        @Override // xsna.nms0.a
        public final void b() {
            this.c.unregisterDisplayListener(this);
            this.f.removeCallbacksAndMessages(null);
            this.b.removeVsyncCallback(this);
            this.d = C.TIME_UNSET;
            this.e = C.TIME_UNSET;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                this.b.postVsyncCallback(this);
            }
        }

        public final void onVsync(Choreographer.FrameData frameData) {
            long frameTimeNanos;
            Choreographer.FrameTimeline[] frameTimelines;
            long expectedPresentationTimeNanos;
            long expectedPresentationTimeNanos2;
            frameTimeNanos = frameData.getFrameTimeNanos();
            this.d = frameTimeNanos;
            frameTimelines = frameData.getFrameTimelines();
            int length = frameTimelines.length;
            long j = C.TIME_UNSET;
            if (length >= 2) {
                expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
                expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
                long j2 = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
                if (j2 != 0) {
                    j = j2;
                }
                this.e = j;
            } else {
                this.e = C.TIME_UNSET;
            }
            this.f.postDelayed(new jk9(this, 16), 500L);
        }
    }

    public nms0(Context context) {
        this.b = context;
        vmr vmrVar = new vmr();
        vmrVar.a = new vmr.a();
        vmrVar.b = new vmr.a();
        vmrVar.d = C.TIME_UNSET;
        this.a = vmrVar;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !surface.isValid()) {
            return;
        }
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        try {
            this.e.setFrameRate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        } catch (IllegalStateException e) {
            ahn.o("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public final void b() {
        this.m = 0L;
        this.q = -1L;
        this.n = -1L;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        float f;
        float f2;
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
            return;
        }
        vmr vmrVar = this.a;
        if (!vmrVar.a.a()) {
            f = this.f;
        } else if (vmrVar.a.a()) {
            f = (float) (1.0E9d / (vmrVar.a.e != 0 ? r2.f / r4 : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (vmrVar.a.a()) {
                if ((vmrVar.a.a() ? vmrVar.a.f : C.TIME_UNSET) >= 5000000000L) {
                    f2 = 0.1f;
                    if (Math.abs(f - this.g) < f2) {
                        return;
                    }
                }
            }
            f2 = 1.0f;
            if (Math.abs(f - this.g) < f2) {
            }
        } else if (f == -1.0f && vmrVar.e < 30) {
            return;
        }
        this.g = f;
        d(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        try {
            if (this.d) {
                float f2 = this.g;
                if (f2 != -1.0f) {
                    f = f2 * this.i;
                    if (z && this.h == f) {
                        return;
                    }
                    this.h = f;
                    this.e.setFrameRate(f, f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
                    return;
                }
            }
            this.e.setFrameRate(f, f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
            return;
        } catch (IllegalStateException e) {
            ahn.o("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            return;
        }
        f = 0.0f;
        if (z) {
        }
        this.h = f;
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    public static abstract class a implements DisplayManager.DisplayListener {
        public final Choreographer b;
        public final DisplayManager c;
        public volatile long d = C.TIME_UNSET;
        public volatile long e = C.TIME_UNSET;

        public a(Choreographer choreographer, DisplayManager displayManager) {
            this.b = choreographer;
            this.c = displayManager;
        }

        public abstract void a();

        public abstract void b();

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }
}
