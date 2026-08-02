package defpackage;

@gsq0
/* loaded from: classes6.dex */
public final class a0j0 {
    public static final zzi0 Companion = new zzi0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ a0j0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, yzi0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        return oyr.t(b64.v("ReorderParam(sessionId='", this.a, "', orderId='", this.b, "', decisionId='"), this.c, "')");
    }

    public a0j0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
