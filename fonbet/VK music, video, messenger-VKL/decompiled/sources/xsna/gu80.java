package xsna;

/* compiled from: OrdCustomMessage.kt */
/* loaded from: classes6.dex */
public final class gu80 {
    public final boolean a;
    public final String b;
    public final String c;

    public gu80(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu80)) {
            return false;
        }
        gu80 gu80Var = (gu80) obj;
        return this.a == gu80Var.a && epx.f(this.b, gu80Var.b) && epx.f(this.c, gu80Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdCustomMessage(isAddOrd=");
        sb.append(this.a);
        sb.append(", predId=");
        sb.append(this.b);
        sb.append(", erId=");
        return ho8.a(sb, this.c, ')');
    }
}
