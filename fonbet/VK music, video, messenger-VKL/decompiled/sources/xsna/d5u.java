package xsna;

/* compiled from: GoodItem.kt */
/* loaded from: classes18.dex */
public final class d5u {
    public final String a;
    public final String b;
    public final String c;

    public d5u(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5u)) {
            return false;
        }
        d5u d5uVar = (d5u) obj;
        return epx.f(this.a, d5uVar.a) && epx.f(this.b, d5uVar.b) && epx.f(this.c, d5uVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodItemPrice(amount=");
        sb.append(this.a);
        sb.append(", oldAmount=");
        sb.append(this.b);
        sb.append(", loyaltyAmount=");
        return ho8.a(sb, this.c, ')');
    }
}
