package xsna;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.woo;

/* compiled from: SpringAnimation.java */
/* loaded from: classes12.dex */
public final class smk0 extends woo<smk0> {
    public vmk0 u;
    public float v;
    public boolean w;

    public smk0() {
        throw null;
    }

    public smk0(qqr qqrVar) {
        super(qqrVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
        this.w = false;
    }

    @Override // xsna.woo
    public final void h() {
        vmk0 vmk0Var = this.u;
        if (vmk0Var == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) vmk0Var.i;
        if (d > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double d2 = this.j * 0.75f;
        vmk0Var.getClass();
        double abs = Math.abs(d2);
        vmk0Var.d = abs;
        vmk0Var.e = abs * 62.5d;
        super.h();
    }

    @Override // xsna.woo
    public final boolean i(long j) {
        if (this.w) {
            float f = this.v;
            if (f != Float.MAX_VALUE) {
                this.u.i = f;
                this.v = Float.MAX_VALUE;
            }
            this.b = (float) this.u.i;
            this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.w = false;
            return true;
        }
        if (this.v != Float.MAX_VALUE) {
            vmk0 vmk0Var = this.u;
            double d = vmk0Var.i;
            long j2 = j / 2;
            woo.j c = vmk0Var.c(j2, this.b, this.a);
            vmk0 vmk0Var2 = this.u;
            vmk0Var2.i = this.v;
            this.v = Float.MAX_VALUE;
            woo.j c2 = vmk0Var2.c(j2, c.a, c.b);
            this.b = c2.a;
            this.a = c2.b;
        } else {
            woo.j c3 = this.u.c(j, this.b, this.a);
            this.b = c3.a;
            this.a = c3.b;
        }
        float max = Math.max(this.b, this.h);
        this.b = max;
        this.b = Math.min(max, this.g);
        float f2 = this.a;
        vmk0 vmk0Var3 = this.u;
        vmk0Var3.getClass();
        if (Math.abs(f2) >= vmk0Var3.e || Math.abs(r1 - ((float) vmk0Var3.i)) >= vmk0Var3.d) {
            return false;
        }
        this.b = (float) this.u.i;
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return true;
    }

    public final void j(float f) {
        if (this.f) {
            this.v = f;
            return;
        }
        if (this.u == null) {
            this.u = new vmk0(f);
        }
        this.u.i = f;
        h();
    }

    public final void k() {
        if (this.u.b <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f) {
            this.w = true;
        }
    }

    public smk0(Object obj, woo.m mVar, float f) {
        super(obj, mVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
        this.w = false;
        this.u = new vmk0(f);
    }
}
