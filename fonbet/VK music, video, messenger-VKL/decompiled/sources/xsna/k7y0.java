package xsna;

/* compiled from: ZstdConfig.kt */
/* loaded from: classes.dex */
public final class k7y0 {
    public final boolean a;
    public final boolean b;
    public final String c;

    public k7y0() {
        this(false, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7y0)) {
            return false;
        }
        k7y0 k7y0Var = (k7y0) obj;
        return this.a == k7y0Var.a && this.b == k7y0Var.b && epx.f(this.c, k7y0Var.c);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZstdConfig(zstdEnabled=");
        sb.append(this.a);
        sb.append(", statEnabled=");
        sb.append(this.b);
        sb.append(", overrideDictVersion=");
        return ho8.a(sb, this.c, ')');
    }

    public k7y0(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }
}
