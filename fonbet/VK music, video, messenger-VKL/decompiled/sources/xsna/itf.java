package xsna;

/* compiled from: ClipsWrapperReducer.kt */
/* loaded from: classes17.dex */
public final class itf extends dm50<uuf, ttf, isf> {
    public final jsf d;
    public final vuf e;

    public itf(isf isfVar, jsf jsfVar, vuf vufVar) {
        super(isfVar);
        this.d = jsfVar;
        this.e = vufVar;
    }

    @Override // xsna.dm50
    public final isf c(isf isfVar, ttf ttfVar) {
        return this.d.b(isfVar, ttfVar);
    }

    @Override // xsna.dm50
    public final uuf d() {
        return new uuf(e(new ix2(this, 29)), e(new j9(this, 27)));
    }

    @Override // xsna.dm50
    public final void h(isf isfVar, uuf uufVar) {
        isf isfVar2 = isfVar;
        uuf uufVar2 = uufVar;
        f(uufVar2.a, isfVar2);
        f(uufVar2.b, isfVar2);
    }
}
