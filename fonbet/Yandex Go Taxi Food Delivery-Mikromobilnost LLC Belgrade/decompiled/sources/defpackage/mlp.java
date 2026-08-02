package defpackage;

/* loaded from: classes2.dex */
public final class mlp implements rlp {
    public final qlp a;
    public final String b;

    public mlp(qlp qlpVar, String str) {
        this.a = qlpVar;
        this.b = str;
    }

    @Override // defpackage.rlp
    public final Object read() {
        return this.a.d(this.b);
    }
}
