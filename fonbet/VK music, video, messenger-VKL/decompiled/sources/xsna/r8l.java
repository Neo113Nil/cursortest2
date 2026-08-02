package xsna;

/* compiled from: DecodersConfig.kt */
/* loaded from: classes8.dex */
public final class r8l {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public r8l() {
        this(false, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8l)) {
            return false;
        }
        r8l r8lVar = (r8l) obj;
        return this.a == r8lVar.a && this.b == r8lVar.b && this.c == r8lVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return n23.b(gp.c("DecodersConfig(isVP9Supported=", ", isAV1Supported=", ", isOpusSupported=", this.a, this.b), this.c, ")");
    }

    public r8l(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? p8l.b.a() : z;
        z2 = (i & 2) != 0 ? p8l.c.a() : z2;
        boolean a = p8l.d.a();
        this.a = z;
        this.b = z2;
        this.c = a;
    }
}
