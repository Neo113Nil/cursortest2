package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class jka0 {
    public static final ika0 Companion = new ika0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ jka0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (111 != (i & 111)) {
            qje.Z(i, 111, hka0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jka0)) {
            return false;
        }
        jka0 jka0Var = (jka0) obj;
        return jl40.l(this.a, jka0Var.a) && jl40.l(this.b, jka0Var.b) && jl40.l(this.c, jka0Var.c) && jl40.l(this.d, jka0Var.d) && jl40.l(this.e, jka0Var.e) && jl40.l(this.f, jka0Var.f) && jl40.l(this.g, jka0Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentSubmitRequestDto(dataSignature=");
        sb.append(this.a);
        sb.append(", origin=");
        sb.append(this.b);
        sb.append(", purchaseData=");
        sb.append(this.c);
        sb.append(", eventSessionId=");
        sb.append(this.d);
        sb.append(", batchPositionId=");
        sb.append(this.e);
        sb.append(", positionId=");
        sb.append(this.f);
        sb.append(", externalCallerPayload=");
        return b64.p(sb, this.g, ')');
    }

    public jka0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }
}
