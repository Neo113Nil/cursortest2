package xsna;

/* compiled from: CloseableReferenceObserver.kt */
/* loaded from: classes17.dex */
public final class wvf<T> implements huf0 {
    public final wh50 b = androidx.compose.runtime.k.b(null);

    @Override // xsna.huf0
    public final void d() {
        f();
    }

    @Override // xsna.huf0
    public final void f() {
        wh50 wh50Var = this.b;
        uvf uvfVar = (uvf) ((zak0) wh50Var).getValue();
        if (uvfVar != null) {
            uvfVar.close();
        }
        ((zak0) wh50Var).setValue(null);
    }

    @Override // xsna.huf0
    public final void e() {
    }
}
