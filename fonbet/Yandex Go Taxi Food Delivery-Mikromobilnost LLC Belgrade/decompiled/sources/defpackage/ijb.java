package defpackage;

/* loaded from: classes2.dex */
public final class ijb {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public ijb(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijb)) {
            return false;
        }
        ijb ijbVar = (ijb) obj;
        return jl40.l(this.a, ijbVar.a) && jl40.l(this.b, ijbVar.b) && jl40.l(this.c, ijbVar.c) && this.d == ijbVar.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferSwitch(originalOptionText=");
        sb.append(this.a);
        sb.append(", suggestedOptionText=");
        sb.append(this.b);
        sb.append(", badgeText=");
        sb.append(this.c);
        sb.append(", isSuggestedOptionSelected=");
        return unr0.u(sb, this.d, ')');
    }
}
