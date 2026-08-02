package yads;

import android.os.Handler;
import android.os.Looper;
import xsna.kyc;
import xsna.w3t;

/* loaded from: classes10.dex */
public final class x02 implements g1 {
    public final Handler a;
    public z00 b;

    public /* synthetic */ x02() {
        this(new Handler(Looper.getMainLooper()));
    }

    public static final void c(x02 x02Var) {
        z00 z00Var = x02Var.b;
        if (z00Var != null) {
            z00Var.onReturnedToApplication();
        }
    }

    public final void a() {
        this.a.post(new xsna.ux3(this, 12));
    }

    public final void b() {
        this.a.post(new kyc(this, 15));
    }

    @Override // yads.g1
    public final void onReturnedToApplication() {
        this.a.post(new xsna.x52(this, 19));
    }

    public static final void a(x02 x02Var) {
        z00 z00Var = x02Var.b;
        if (z00Var != null) {
            z00Var.closeNativeAd();
        }
    }

    public static final void b(x02 x02Var) {
        z00 z00Var = x02Var.b;
        if (z00Var != null) {
            z00Var.onAdClicked();
        }
        z00 z00Var2 = x02Var.b;
        if (z00Var2 != null) {
            z00Var2.onLeftApplication();
        }
    }

    public x02(Handler handler) {
        this.a = handler;
    }

    public final void a(j5 j5Var) {
        this.a.post(new w3t(5, this, j5Var));
    }

    public static final void a(x02 x02Var, j5 j5Var) {
        z00 z00Var = x02Var.b;
        if (z00Var != null) {
            z00Var.a(j5Var);
        }
    }
}
