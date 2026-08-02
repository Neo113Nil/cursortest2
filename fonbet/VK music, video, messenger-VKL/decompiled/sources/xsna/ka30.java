package xsna;

/* compiled from: MotionHeader.kt */
/* loaded from: classes8.dex */
public final class ka30 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final boolean g;

    public ka30(String str, String str2, String str3, boolean z, boolean z2, float f, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = f;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka30)) {
            return false;
        }
        ka30 ka30Var = (ka30) obj;
        return epx.f(this.a, ka30Var.a) && epx.f(this.b, ka30Var.b) && epx.f(this.c, ka30Var.c) && this.d == ka30Var.d && this.e == ka30Var.e && Float.compare(this.f, ka30Var.f) == 0 && this.g == ka30Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + io.reactivex.rxjava3.subjects.b.a(this.f, qoy.b(qoy.b(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder a = xe9.a("MotionHeader(icon=", this.a, ", title=", this.b, ", subtitle=");
        a.append(this.c);
        a.append(", hasAdChoice=");
        a.append(this.d);
        a.append(", allowClose=");
        a.append(this.e);
        a.append(", allowCloseDelay=");
        a.append(this.f);
        a.append(", isSkipAvailable=");
        return n23.b(a, this.g, ")");
    }
}
