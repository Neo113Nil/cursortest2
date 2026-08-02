package xsna;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class i7i0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public i7i0(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public static i7i0 a(i7i0 i7i0Var, String str) {
        boolean z = i7i0Var.a;
        String str2 = i7i0Var.b;
        String str3 = i7i0Var.c;
        String str4 = i7i0Var.d;
        String str5 = i7i0Var.f;
        i7i0Var.getClass();
        return new i7i0(str2, str3, str4, str, str5, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7i0)) {
            return false;
        }
        i7i0 i7i0Var = (i7i0) obj;
        return this.a == i7i0Var.a && epx.f(this.b, i7i0Var.b) && epx.f(this.c, i7i0Var.c) && epx.f(this.d, i7i0Var.d) && epx.f(this.e, i7i0Var.e) && epx.f(this.f, i7i0Var.f);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectFieldInfo(isRequired=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", placeholder=");
        sb.append(this.d);
        sb.append(", error=");
        sb.append(this.e);
        sb.append(", requiredErrorMsg=");
        return ho8.a(sb, this.f, ')');
    }
}
