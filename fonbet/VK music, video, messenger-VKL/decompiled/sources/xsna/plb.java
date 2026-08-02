package xsna;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes8.dex */
public final class plb extends fbd0<Character, char[], llb> {
    public static final plb c = new plb(zlb.a);

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // xsna.u4g, xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        llb llbVar = (llb) obj;
        char q = ssiVar.q(this.b, i);
        llbVar.b(llbVar.d() + 1);
        char[] cArr = llbVar.a;
        int i2 = llbVar.b;
        llbVar.b = i2 + 1;
        cArr[i2] = q;
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        llb llbVar = new llb();
        llbVar.a = cArr;
        llbVar.b = cArr.length;
        llbVar.b(10);
        return llbVar;
    }

    @Override // xsna.fbd0
    public final char[] j() {
        return new char[0];
    }

    @Override // xsna.fbd0
    public final void k(cti ctiVar, char[] cArr, int i) {
        char[] cArr2 = cArr;
        for (int i2 = 0; i2 < i; i2++) {
            ctiVar.O(this.b, i2, cArr2[i2]);
        }
    }
}
