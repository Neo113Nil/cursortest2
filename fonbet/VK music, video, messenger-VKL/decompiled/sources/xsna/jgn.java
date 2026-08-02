package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class jgn implements huf0 {
    public final izs<lgn, kgn> b;
    public kgn c;

    /* JADX WARN: Multi-variable type inference failed */
    public jgn(izs<? super lgn, ? extends kgn> izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.huf0
    public final void e() {
        this.c = this.b.invoke(bap.a);
    }

    @Override // xsna.huf0
    public final void f() {
        kgn kgnVar = this.c;
        if (kgnVar != null) {
            kgnVar.dispose();
        }
        this.c = null;
    }

    @Override // xsna.huf0
    public final void d() {
    }
}
