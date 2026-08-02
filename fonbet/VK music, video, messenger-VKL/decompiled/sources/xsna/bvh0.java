package xsna;

/* compiled from: SearchHistoryItemViewParams.kt */
/* loaded from: classes3.dex */
public final class bvh0 {
    public static final bvh0 c = new bvh0(null, Boolean.FALSE);
    public final String a;
    public final Boolean b;

    public bvh0(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvh0)) {
            return false;
        }
        bvh0 bvh0Var = (bvh0) obj;
        return epx.f(this.a, bvh0Var.a) && epx.f(this.b, bvh0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleParams(text=");
        sb.append(this.a);
        sb.append(", isExplicit=");
        return tn.a(sb, this.b, ')');
    }
}
