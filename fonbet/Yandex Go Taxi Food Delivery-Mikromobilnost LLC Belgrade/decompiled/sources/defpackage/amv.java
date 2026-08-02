package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class amv implements gov {
    public static final zlv Companion = new zlv();
    public final String a;
    public final String b;
    public final Boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public /* synthetic */ amv(int i, String str, String str2, Boolean bool, boolean z, boolean z2, String str3) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, ylv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = z;
        this.e = z2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amv)) {
            return false;
        }
        amv amvVar = (amv) obj;
        return jl40.l(this.a, amvVar.a) && jl40.l(this.b, amvVar.b) && jl40.l(this.c, amvVar.c) && this.d == amvVar.d && this.e == amvVar.e && jl40.l(this.f, amvVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Boolean bool = this.c;
        int e = unr0.e(unr0.e((b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeOptionStatusResponse(trackId=");
        sb.append(this.a);
        sb.append(", optionId=");
        sb.append(this.b);
        sb.append(", currentStatus=");
        sb.append(this.c);
        sb.append(", disabled=");
        sb.append(this.d);
        sb.append(", show=");
        sb.append(this.e);
        sb.append(", errorMessage=");
        return b64.p(sb, this.f, ')');
    }

    public amv(String str, String str2, Boolean bool, boolean z, boolean z2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = z;
        this.e = z2;
        this.f = str3;
    }
}
