package xsna;

/* compiled from: DialogConvertIncognitoIntoUserLpTask.kt */
/* loaded from: classes2.dex */
public final class zcm extends e500 {
    public final w2w c;
    public final long d;
    public final int e;

    public zcm(w2w w2wVar, long j, int i) {
        super("DialogConvertIncognitoIntoUserLpTask");
        this.c = w2wVar;
        this.d = j;
        this.e = i;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        new mjm(this.d, this.e).o(this.c);
    }
}
