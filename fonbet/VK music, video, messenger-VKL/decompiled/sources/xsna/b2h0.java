package xsna;

import xsna.nyt0;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes3.dex */
public final class b2h0<VM extends nyt0> extends androidx.lifecycle.a {
    public final fuc0 c;

    public b2h0(z1h0 z1h0Var, fuc0 fuc0Var) {
        super(z1h0Var);
        this.c = fuc0Var;
    }

    @Override // androidx.lifecycle.a
    public final nyt0 e(Class cls, androidx.lifecycle.w wVar) {
        nyt0 nyt0Var = (nyt0) this.c.invoke(wVar);
        if (cls.isAssignableFrom(nyt0Var.getClass())) {
            return nyt0Var;
        }
        throw new IllegalArgumentException("Unknown ViewModel class " + fpf0.a(nyt0Var.getClass()).l() + " need " + cls.getCanonicalName());
    }
}
