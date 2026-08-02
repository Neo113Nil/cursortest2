package xsna;

/* compiled from: WidgetState.kt */
/* loaded from: classes17.dex */
public final class rmx0 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;

    public rmx0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmx0)) {
            return false;
        }
        rmx0 rmx0Var = (rmx0) obj;
        return epx.f(this.a, rmx0Var.a) && epx.f(this.b, rmx0Var.b) && epx.f(this.c, rmx0Var.c) && epx.f(this.d, rmx0Var.d) && epx.f(this.e, rmx0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetContainerState(title=");
        sb.append(this.a);
        sb.append(", titleUrl=");
        sb.append(this.b);
        sb.append(", titleCounter=");
        sb.append(this.c);
        sb.append(", more=");
        sb.append(this.d);
        sb.append(", moreUrl=");
        return ho8.a(sb, this.e, ')');
    }

    public /* synthetic */ rmx0(int i) {
        this(null, null, null, null, null);
    }

    public rmx0(String str, String str2, Integer num, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = str4;
    }
}
