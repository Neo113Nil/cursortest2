package xsna;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes8.dex */
public final class df extends de {
    public final de b;
    public final /* synthetic */ ef c;
    public final /* synthetic */ String d;

    public df(ef efVar, String str) {
        this.c = efVar;
        this.d = str;
        this.b = efVar.c.b;
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void A(byte b) {
        q0(String.valueOf(b & 255));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final de c() {
        return this.b;
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void j(short s) {
        q0(String.valueOf(s & 65535));
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void o(int i) {
        q0(Integer.toUnsignedString(i));
    }

    public final void q0(String str) {
        this.c.j0(this.d, new o9y(str, false, null));
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void u(long j) {
        q0(Long.toUnsignedString(j));
    }
}
