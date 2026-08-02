package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import xsna.ds4;
import xsna.qye;
import xsna.w9j;
import xsna.wq8;

/* loaded from: classes10.dex */
public final class wl2 implements jy0, rs2 {
    public final iy0 a;
    public final Handler b;
    public iv3 c;

    public /* synthetic */ wl2(iy0 iy0Var) {
        this(iy0Var, new Handler(Looper.getMainLooper()));
    }

    public static final void a(wl2 wl2Var) {
        iv3 iv3Var = wl2Var.c;
        if (iv3Var != null) {
            new CallbackStackTraceMarker(new cv3(iv3Var));
        }
    }

    public static final void b(wl2 wl2Var) {
        iv3 iv3Var = wl2Var.c;
        if (iv3Var != null) {
            new CallbackStackTraceMarker(new dv3(iv3Var));
        }
    }

    public static final void c(wl2 wl2Var) {
        iv3 iv3Var = wl2Var.c;
        if (iv3Var != null) {
            new CallbackStackTraceMarker(new gv3(iv3Var));
        }
        iy0 iy0Var = wl2Var.a;
        if (iy0Var != null) {
            iy0Var.onAdShown();
        }
    }

    @Override // yads.jy0
    public final void onAdClicked() {
        this.b.post(new xsna.nx3(this, 24));
    }

    @Override // yads.jy0
    public final void onAdDismissed() {
        this.b.post(new ds4(this, 8));
    }

    @Override // yads.jy0
    public final void onAdShown() {
        this.b.post(new xsna.wc2(this, 24));
    }

    public wl2(iy0 iy0Var, Handler handler) {
        this.a = iy0Var;
        this.b = handler;
    }

    public final void a(n7 n7Var) {
        this.b.post(new wq8(12, n7Var, this));
    }

    public static final void a(n7 n7Var, wl2 wl2Var) {
        String str = n7Var.b;
        iv3 iv3Var = wl2Var.c;
        if (iv3Var != null) {
            new CallbackStackTraceMarker(new ev3(iv3Var, new ar3(str)));
        }
    }

    @Override // yads.jy0
    public final void a(j5 j5Var) {
        this.b.post(new w9j(9, this, j5Var));
    }

    public static final void a(wl2 wl2Var, j5 j5Var) {
        iv3 iv3Var = wl2Var.c;
        if (iv3Var != null) {
            new CallbackStackTraceMarker(new fv3(iv3Var, j5Var != null ? new ps3(j5Var) : null));
        }
    }

    @Override // yads.rs2
    public final void a(fx2 fx2Var) {
        this.b.post(new qye(16, this, fx2Var));
    }

    public static final void a(wl2 wl2Var, qr2 qr2Var) {
        iv3 iv3Var = wl2Var.c;
        if (iv3Var != null) {
            new CallbackStackTraceMarker(new hv3(iv3Var, new av3(qr2Var)));
        }
    }
}
