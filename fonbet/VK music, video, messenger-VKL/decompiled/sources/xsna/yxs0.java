package xsna;

/* compiled from: MapperExt.kt */
/* loaded from: classes3.dex */
public final class yxs0 {
    public final String a;
    public final String b;

    public yxs0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxs0)) {
            return false;
        }
        yxs0 yxs0Var = (yxs0) obj;
        return epx.f(this.a, yxs0Var.a) && epx.f(this.b, yxs0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoNavigationSource(sourceScreen=");
        sb.append(this.a);
        sb.append(", sourceBlock=");
        return ho8.a(sb, this.b, ')');
    }
}
