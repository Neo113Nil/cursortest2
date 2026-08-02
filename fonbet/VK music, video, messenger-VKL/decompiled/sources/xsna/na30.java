package xsna;

/* compiled from: MotionItem.kt */
/* loaded from: classes8.dex */
public final class na30 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public na30(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na30)) {
            return false;
        }
        na30 na30Var = (na30) obj;
        return epx.f(this.a, na30Var.a) && epx.f(this.b, na30Var.b) && epx.f(this.c, na30Var.c) && epx.f(this.d, na30Var.d) && epx.f(this.e, na30Var.e) && epx.f(this.f, na30Var.f) && epx.f(this.g, na30Var.g) && epx.f(this.h, na30Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.h.hashCode() + urd0.a(urd0.a(urd0.a((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder a = xe9.a("MotionItem(id=", this.a, ", price=", this.b, ", oldPrice=");
        n6j.b(a, this.c, ", discount=", this.d, ", currency=");
        n6j.b(a, this.e, ", image=", this.f, ", text=");
        return h5s.d(a, this.g, ", ctaText=", this.h, ")");
    }
}
