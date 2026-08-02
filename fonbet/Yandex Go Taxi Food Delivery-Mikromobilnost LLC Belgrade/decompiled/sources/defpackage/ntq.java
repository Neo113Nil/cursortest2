package defpackage;

/* loaded from: classes6.dex */
public final class ntq {
    public final String a;
    public final String b;
    public final String c;

    public ntq(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntq)) {
            return false;
        }
        ntq ntqVar = (ntq) obj;
        return jl40.l(this.a, ntqVar.a) && jl40.l(this.b, ntqVar.b) && jl40.l(this.c, ntqVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(false) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("FeedbackOption(id=", this.a, ", text=", this.b, ", iconTag="), this.c, ", isSelected=false)");
    }
}
