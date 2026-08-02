package xsna;

/* compiled from: ConfigureItemListItem.kt */
/* loaded from: classes18.dex */
public final class xzi {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public xzi(long j, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzi)) {
            return false;
        }
        xzi xziVar = (xzi) obj;
        return this.a == xziVar.a && epx.f(this.b, xziVar.b) && epx.f(this.c, xziVar.c) && epx.f(this.d, xziVar.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigureItemListItem(itemId=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", price=");
        return ho8.a(sb, this.d, ')');
    }
}
