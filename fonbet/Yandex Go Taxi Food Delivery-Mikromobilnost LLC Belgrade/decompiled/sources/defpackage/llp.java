package defpackage;

/* loaded from: classes8.dex */
public final class llp implements rlp {
    public final qlp a;
    public final String b;

    public llp(qlp qlpVar, String str) {
        this.a = qlpVar;
        this.b = str;
    }

    @Override // defpackage.rlp
    public final Object read() {
        return this.a.a(this.b);
    }
}
