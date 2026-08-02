package xsna;

/* compiled from: GeoLocationListItem.kt */
/* loaded from: classes5.dex */
public final class ykt implements hfz {
    public final int b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Integer h;

    public ykt(int i, String str, Integer num, boolean z, boolean z2, boolean z3, Integer num2) {
        this.b = i;
        this.c = str;
        this.d = num;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykt)) {
            return false;
        }
        ykt yktVar = (ykt) obj;
        yktVar.getClass();
        return this.b == yktVar.b && epx.f(this.c, yktVar.c) && epx.f(this.d, yktVar.d) && this.e == yktVar.e && this.f == yktVar.f && this.g == yktVar.g && epx.f(this.h, yktVar.h);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 1;
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(1) * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int b = qoy.b(qoy.b(qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        Integer num2 = this.h;
        return b + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoLocationListItem(id=1, itemIndex=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", subtitleResId=");
        sb.append(this.d);
        sb.append(", isMultilineSubtitle=");
        sb.append(this.e);
        sb.append(", isSelected=");
        sb.append(this.f);
        sb.append(", isInProgress=");
        sb.append(this.g);
        sb.append(", actionTitleResId=");
        return uqi.b(sb, this.h, ')');
    }
}
