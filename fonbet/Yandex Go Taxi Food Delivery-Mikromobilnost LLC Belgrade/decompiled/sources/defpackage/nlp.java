package defpackage;

/* loaded from: classes8.dex */
public final class nlp implements rlp {
    public final qlp a;
    public final String b;

    public nlp(qlp qlpVar, String str) {
        this.a = qlpVar;
        this.b = str;
    }

    @Override // defpackage.rlp
    public final Object read() {
        return this.a.e(this.b);
    }
}
