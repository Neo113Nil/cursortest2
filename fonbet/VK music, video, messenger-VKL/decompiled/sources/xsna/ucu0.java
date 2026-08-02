package xsna;

/* compiled from: VkAuthSignUpResult.kt */
/* loaded from: classes6.dex */
public final class ucu0 {
    public final int a;
    public final String b;
    public final String c;

    public ucu0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucu0)) {
            return false;
        }
        ucu0 ucu0Var = (ucu0) obj;
        return this.a == ucu0Var.a && epx.f(this.b, ucu0Var.b) && epx.f(this.c, ucu0Var.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthSignUpResult(mid=");
        sb.append(this.a);
        sb.append(", directAuthHash=");
        sb.append(this.b);
        sb.append(", csrfHash=");
        return ho8.a(sb, this.c, ')');
    }
}
