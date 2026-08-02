package defpackage;

/* loaded from: classes12.dex */
public final class k73 implements n73 {
    public final String a;
    public final String b;

    public k73(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k73)) {
            return false;
        }
        k73 k73Var = (k73) obj;
        return jl40.l(this.a, k73Var.a) && jl40.l(this.b, k73Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
