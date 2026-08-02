package xsna;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class mlz0 extends de {
    public final WeakReference b;

    public mlz0(nlz0 nlz0Var) {
        this.b = new WeakReference(nlz0Var);
    }

    @Override // xsna.de
    public final void p0() {
        nlz0 nlz0Var = (nlz0) this.b.get();
        if (nlz0Var == null) {
            return;
        }
        nlz0Var.r();
    }
}
