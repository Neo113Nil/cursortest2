package xsna;

/* compiled from: AddToChatAppDto.kt */
/* loaded from: classes18.dex */
public final class do0 {
    public final long a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;

    public do0(long j, Integer num, String str, String str2, String str3) {
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
        if (!(obj instanceof do0)) {
            return false;
        }
        do0 do0Var = (do0) obj;
        return this.a == do0Var.a && epx.f(this.b, do0Var.b) && epx.f(this.c, do0Var.c) && epx.f(this.d, do0Var.d) && epx.f(this.e, do0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(Long.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddToChatAppDto(appId=");
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
