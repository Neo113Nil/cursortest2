package defpackage;

/* loaded from: classes2.dex */
public final class osu0 {
    public final String a;
    public final String b;

    public osu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osu0)) {
            return false;
        }
        osu0 osu0Var = (osu0) obj;
        return this.a.equals(osu0Var.a) && this.b.equals(osu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Param(key=");
        sb.append(this.a);
        sb.append(", value=");
        return b64.p(sb, this.b, ')');
    }
}
