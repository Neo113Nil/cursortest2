package xsna;

/* compiled from: CityParameterItem.kt */
/* loaded from: classes5.dex */
public final class uec implements hfz {
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public uec(int i, String str, String str2, String str3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uec)) {
            return false;
        }
        uec uecVar = (uec) obj;
        return this.b == uecVar.b && epx.f(this.c, uecVar.c) && epx.f(this.d, uecVar.d) && epx.f(this.e, uecVar.e);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CityParameterItem(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", region=");
        sb.append(this.d);
        sb.append(", area=");
        return ho8.a(sb, this.e, ')');
    }
}
