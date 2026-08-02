package xsna;

/* compiled from: SearchDatabaseListItem.kt */
/* loaded from: classes5.dex */
public final class iph0 implements hfz {
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public iph0(int i, String str, String str2, boolean z, int i2) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iph0)) {
            return false;
        }
        iph0 iph0Var = (iph0) obj;
        return this.b == iph0Var.b && epx.f(this.c, iph0Var.c) && epx.f(this.d, iph0Var.d) && this.e == iph0Var.e && this.f == iph0Var.f;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        return Integer.hashCode(this.f) + qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchDatabaseListItem(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", isSelected=");
        sb.append(this.e);
        sb.append(", itemIndex=");
        return vu5.b(sb, this.f, ')');
    }
}
