package defpackage;

/* loaded from: classes8.dex */
public final class plp implements rlp {
    public final qlp a;
    public final String b;

    public plp(qlp qlpVar, String str) {
        this.a = qlpVar;
        this.b = str;
    }

    @Override // defpackage.rlp
    public final Object read() {
        return this.a.c(this.b);
    }
}
