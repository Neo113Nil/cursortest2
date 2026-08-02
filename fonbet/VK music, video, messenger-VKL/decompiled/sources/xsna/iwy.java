package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class iwy implements kgn {
    public final /* synthetic */ jwy a;
    public final /* synthetic */ Object b;

    public iwy(jwy jwyVar, Object obj) {
        this.a = jwyVar;
        this.b = obj;
    }

    @Override // xsna.kgn
    public final void dispose() {
        this.a.d.k(this.b);
    }
}
