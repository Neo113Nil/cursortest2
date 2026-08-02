package defpackage;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class lkr0 implements tsr, r30 {
    public fcj0 a;
    public zlr0 b;
    public ea20 c;

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        zlr0 zlr0Var = this.b;
        if (zlr0Var == null) {
            zlr0Var = null;
        }
        wrr wrrVar = (wrr) l40Var;
        wrrVar.a(zlr0Var);
        fcj0 fcj0Var = this.a;
        (fcj0Var != null ? fcj0Var : null).b = (Activity) wrrVar.b;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.c = new ea20(ssrVar.c, "dev.fluttercommunity.plus/share");
        zlr0 zlr0Var = new zlr0();
        zlr0Var.b = new AtomicBoolean(true);
        this.b = zlr0Var;
        fcj0 fcj0Var = new fcj0(ssrVar.a, zlr0Var);
        this.a = fcj0Var;
        zlr0 zlr0Var2 = this.b;
        if (zlr0Var2 == null) {
            zlr0Var2 = null;
        }
        c9v c9vVar = new c9v(28, fcj0Var, zlr0Var2);
        ea20 ea20Var = this.c;
        (ea20Var != null ? ea20Var : null).b(c9vVar);
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        fcj0 fcj0Var = this.a;
        if (fcj0Var == null) {
            fcj0Var = null;
        }
        fcj0Var.b = null;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.c;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        onAttachedToActivity(l40Var);
    }
}
