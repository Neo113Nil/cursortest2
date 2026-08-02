package xsna;

/* compiled from: ReplyFromData.kt */
/* loaded from: classes18.dex */
public final class f4g0 {
    public final boolean a;
    public final String b;
    public final boolean c;

    public f4g0(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4g0)) {
            return false;
        }
        f4g0 f4g0Var = (f4g0) obj;
        return this.a == f4g0Var.a && epx.f(this.b, f4g0Var.b) && this.c == f4g0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyFromData(isFromOwnName=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
