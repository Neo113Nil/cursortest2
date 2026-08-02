package xsna;

/* compiled from: AddToChatAppData.kt */
/* loaded from: classes6.dex */
public final class co0 {
    public final long a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;

    public co0(long j, Integer num, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co0)) {
            return false;
        }
        co0 co0Var = (co0) obj;
        return this.a == co0Var.a && epx.f(this.b, co0Var.b) && epx.f(this.c, co0Var.c) && epx.f(this.d, co0Var.d) && epx.f(this.e, co0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(Long.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddToChatAppData(appId=");
        sb.append(this.a);
        sb.append(", actionTitle=");
        sb.append(this.b);
        sb.append(", iconId=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", hash=");
        return ho8.a(sb, this.e, ')');
    }
}
