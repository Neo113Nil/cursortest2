package defpackage;

/* loaded from: classes2.dex */
public final class olp implements rlp {
    public final qlp a;
    public final String b;

    public olp(qlp qlpVar, String str) {
        this.a = qlpVar;
        this.b = str;
    }

    @Override // defpackage.rlp
    public final Object read() {
        return this.a.b(this.b);
    }
}
