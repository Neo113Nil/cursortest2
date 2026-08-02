package defpackage;

/* loaded from: classes8.dex */
public final class pkd0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public pkd0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkd0)) {
            return false;
        }
        pkd0 pkd0Var = (pkd0) obj;
        return this.a.equals(pkd0Var.a) && this.b.equals(pkd0Var.b) && this.c.equals(pkd0Var.c) && this.d.equals(pkd0Var.d) && this.e.equals(pkd0Var.e) && this.f.equals(pkd0Var.f) && this.g.equals(pkd0Var.g) && this.h.equals(pkd0Var.h) && this.i.equals(pkd0Var.i) && this.j.equals(pkd0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        return vuu0.c("\n            sessionId=" + this.a + "\n            timestamp=" + this.b + "\n            tag=" + this.c + "\n            level=" + this.d + "\n            rawLevel=" + this.e + "\n            message=" + this.f + "\n            location=" + this.g + "\n            function=" + this.h + "\n            thread=" + this.i + "\n            threadSequence=" + this.j + "\n        ");
    }
}
