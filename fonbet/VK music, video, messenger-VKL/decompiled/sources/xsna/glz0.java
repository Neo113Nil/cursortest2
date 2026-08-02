package xsna;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class glz0 extends zmz0 {
    public final WeakReference a;

    public glz0(jlz0 jlz0Var) {
        this.a = new WeakReference(jlz0Var);
    }

    @Override // xsna.aoz0
    public final void V(com.google.android.gms.signin.internal.zak zakVar) {
        jlz0 jlz0Var = (jlz0) this.a.get();
        if (jlz0Var == null) {
            return;
        }
        flz0 flz0Var = new flz0(this, jlz0Var, jlz0Var, zakVar);
        zlz0 zlz0Var = jlz0Var.a.g;
        zlz0Var.sendMessage(zlz0Var.obtainMessage(1, flz0Var));
    }
}
