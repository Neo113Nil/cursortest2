package xsna;

/* compiled from: AsrItem.kt */
/* loaded from: classes7.dex */
public final class ev3 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final Integer e;
    public final String f;

    public ev3(int i, String str, String str2, String str3, String str4, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = num;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev3)) {
            return false;
        }
        ev3 ev3Var = (ev3) obj;
        return epx.f(this.a, ev3Var.a) && epx.f(this.b, ev3Var.b) && epx.f(this.c, ev3Var.c) && this.d == ev3Var.d && epx.f(this.e, ev3Var.e) && epx.f(this.f, ev3Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int a = shy.a(this.d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.e;
        int hashCode3 = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsrItem(docId=");
        sb.append(this.a);
        sb.append(", docName=");
        sb.append(this.b);
        sb.append(", docUrl=");
        sb.append(this.c);
        sb.append(", date=");
        sb.append(this.d);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", chatName=");
        return ho8.a(sb, this.f, ')');
    }
}
