package xsna;

/* compiled from: BannerListItem.kt */
/* loaded from: classes16.dex */
public final class k26 implements hfz {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public k26(String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k26)) {
            return false;
        }
        k26 k26Var = (k26) obj;
        return epx.f(this.b, k26Var.b) && epx.f(this.c, k26Var.c) && epx.f(this.d, k26Var.d) && epx.f(this.e, k26Var.e) && epx.f(this.f, k26Var.f);
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 2147483645;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerListItem(title=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", foregroundColor=");
        sb.append(this.e);
        sb.append(", image=");
        return ho8.a(sb, this.f, ')');
    }
}
