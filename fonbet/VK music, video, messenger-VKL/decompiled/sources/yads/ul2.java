package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import xsna.b04;
import xsna.bv9;
import xsna.sgr;

/* loaded from: classes10.dex */
public final class ul2 implements jy0 {
    public final iy0 a;
    public final Handler b;
    public du3 c;

    public /* synthetic */ ul2(iy0 iy0Var) {
        this(iy0Var, new Handler(Looper.getMainLooper()));
    }

    public static final void a(ul2 ul2Var) {
        du3 du3Var = ul2Var.c;
        if (du3Var != null) {
            new CallbackStackTraceMarker(new yt3(du3Var));
        }
    }

    public static final void b(ul2 ul2Var) {
        du3 du3Var = ul2Var.c;
        if (du3Var != null) {
            new CallbackStackTraceMarker(new zt3(du3Var));
        }
    }

    public static final void c(ul2 ul2Var) {
        du3 du3Var = ul2Var.c;
        if (du3Var != null) {
            new CallbackStackTraceMarker(new cu3(du3Var));
        }
        iy0 iy0Var = ul2Var.a;
        if (iy0Var != null) {
            iy0Var.onAdShown();
        }
    }

    @Override // yads.jy0
    public final void onAdClicked() {
        this.b.post(new bv9(this, 19));
    }

    @Override // yads.jy0
    public final void onAdDismissed() {
        this.b.post(new xsna.tw3(this, 28));
    }

    @Override // yads.jy0
    public final void onAdShown() {
        this.b.post(new b04(this, 21));
    }

    public ul2(iy0 iy0Var, Handler handler) {
        this.a = iy0Var;
        this.b = handler;
    }

    public final void a(n7 n7Var) {
        this.b.post(new xsna.aw(8, n7Var, this));
    }

    public static final void a(n7 n7Var, ul2 ul2Var) {
        String str = n7Var.b;
        du3 du3Var = ul2Var.c;
        if (du3Var != null) {
            new CallbackStackTraceMarker(new au3(du3Var, new ar3(str)));
        }
    }

    @Override // yads.jy0
    public final void a(j5 j5Var) {
        this.b.post(new sgr(4, this, j5Var));
    }

    public static final void a(ul2 ul2Var, j5 j5Var) {
        du3 du3Var = ul2Var.c;
        if (du3Var != null) {
            new CallbackStackTraceMarker(new bu3(du3Var, j5Var != null ? new ps3(j5Var) : null));
        }
    }
}
