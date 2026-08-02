package xsna;

/* compiled from: LazyGridIntervalContent.kt */
/* loaded from: classes11.dex */
public final class wqy extends androidx.compose.foundation.lazy.layout.a<vqy> implements rry {
    public static final gre d = new gre(4);
    public final xry a = new xry(this);
    public final p8v b = new p8v(1);
    public boolean c;

    public wqy(izs<? super rry, s3q0> izsVar) {
        izsVar.invoke(this);
    }

    @Override // xsna.rry
    public final void a(int i, izs izsVar, izs izsVar2, jai jaiVar) {
        this.b.a(i, new vqy(izsVar, d, izsVar2, jaiVar));
    }

    @Override // xsna.rry
    public final void f(Object obj, izs izsVar, jai jaiVar) {
        this.b.a(1, new vqy(obj != null ? new iou(obj, 9) : null, izsVar != null ? new shf(izsVar, 2, (byte) 0) : d, new bz(28), new jai(-291643851, new s7p(jaiVar, 1), true)));
        if (izsVar != null) {
            this.c = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.a
    public final p8v l() {
        return this.b;
    }
}
