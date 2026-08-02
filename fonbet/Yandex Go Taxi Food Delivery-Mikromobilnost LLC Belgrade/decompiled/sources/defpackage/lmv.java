package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class lmv implements gov {
    public static final kmv Companion = new kmv();
    public final String a;
    public final String b;
    public final Boolean c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ lmv(int i, String str, String str2, Boolean bool, boolean z, boolean z2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, jmv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmv)) {
            return false;
        }
        lmv lmvVar = (lmv) obj;
        return jl40.l(this.a, lmvVar.a) && jl40.l(this.b, lmvVar.b) && jl40.l(this.c, lmvVar.c) && this.d == lmvVar.d && this.e == lmvVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Boolean bool = this.c;
        return Boolean.hashCode(this.e) + unr0.e((b + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionStatusResponse(trackId=");
        sb.append(this.a);
        sb.append(", optionId=");
        sb.append(this.b);
        sb.append(", currentStatus=");
        sb.append(this.c);
        sb.append(", disabled=");
        sb.append(this.d);
        sb.append(", show=");
        return unr0.u(sb, this.e, ')');
    }

    public lmv(String str, String str2, Boolean bool, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = z;
        this.e = z2;
    }
}
