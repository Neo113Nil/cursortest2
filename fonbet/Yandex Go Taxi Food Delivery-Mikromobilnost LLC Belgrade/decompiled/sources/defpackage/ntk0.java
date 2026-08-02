package defpackage;

/* loaded from: classes6.dex */
public final class ntk0 {
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final CharSequence g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public ntk0(int i, boolean z, String str, String str2, String str3, String str4, CharSequence charSequence, String str5, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = charSequence;
        this.h = str5;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoadOption{optionId=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", title='");
        g8e.D(sb, this.c, "', time='", this.d, "', isFreeRoadLoading=");
        nnm.v(", isEnabled=", ", isTollRoadInLoading=", sb, this.i, this.j);
        unr0.A(", subtitleText=", this.e, ", price='", sb, this.k);
        sb.append((Object) this.g);
        sb.append("', price='");
        sb.append(this.f);
        sb.append("', cashback='");
        return oyr.t(sb, this.h, "'}");
    }
}
