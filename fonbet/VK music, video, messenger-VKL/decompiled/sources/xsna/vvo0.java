package xsna;

/* compiled from: TimeZonePickerModel.kt */
/* loaded from: classes7.dex */
public final class vvo0 implements hfz {
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public vvo0(String str, String str2, String str3, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvo0)) {
            return false;
        }
        vvo0 vvo0Var = (vvo0) obj;
        return epx.f(this.b, vvo0Var.b) && epx.f(this.c, vvo0Var.c) && epx.f(this.d, vvo0Var.d) && this.e == vvo0Var.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeZonePickerModel(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
