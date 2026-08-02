package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class nya0 implements tsr, r30 {
    public uya0 a;
    public ea20 b;
    public l40 c;

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        Activity activity = (Activity) ((wrr) l40Var).b;
        uya0 uya0Var = this.a;
        if (uya0Var != null) {
            uya0Var.c = activity;
        }
        this.c = l40Var;
        ((wrr) l40Var).a(uya0Var);
        ((wrr) this.c).b(this.a);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        Context context = ssrVar.a;
        this.a = new uya0(context);
        ea20 ea20Var = new ea20(ssrVar.c, "flutter.baseflow.com/permissions/methods");
        this.b = ea20Var;
        ea20Var.b(new c9v(context, new zoy0(), this.a, new jzz()));
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        uya0 uya0Var = this.a;
        if (uya0Var != null) {
            uya0Var.c = null;
        }
        l40 l40Var = this.c;
        if (l40Var != null) {
            ((wrr) l40Var).k(uya0Var);
            l40 l40Var2 = this.c;
            ((HashSet) ((wrr) l40Var2).w).remove(this.a);
        }
        this.c = null;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        this.b.b(null);
        this.b = null;
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        onAttachedToActivity(l40Var);
    }
}
