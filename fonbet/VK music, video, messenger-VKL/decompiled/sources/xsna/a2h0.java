package xsna;

import kotlin.Lazy;
import xsna.nyt0;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes3.dex */
public final class a2h0<VM extends nyt0> extends androidx.lifecycle.a {
    public final Object c;

    public a2h0(z1h0 z1h0Var, Lazy<? extends izs<? super androidx.lifecycle.w, ? extends VM>> lazy) {
        super(z1h0Var);
        this.c = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.lifecycle.a
    public final nyt0 e(Class cls, androidx.lifecycle.w wVar) {
        nyt0 nyt0Var = (nyt0) ((izs) this.c.getValue()).invoke(wVar);
        if (cls.isAssignableFrom(nyt0Var.getClass())) {
            return nyt0Var;
        }
        throw new IllegalArgumentException("Unknown ViewModel class " + nyt0Var.getClass().getCanonicalName() + " need " + cls.getCanonicalName());
    }
}
