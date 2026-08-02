package xsna;

/* compiled from: VideoGrowthListingViewConfig.kt */
/* loaded from: classes6.dex */
public final class pos0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Integer e;

    public pos0(boolean z, String str, String str2, boolean z2, Integer num) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pos0)) {
            return false;
        }
        pos0 pos0Var = (pos0) obj;
        return this.a == pos0Var.a && epx.f(this.b, pos0Var.b) && epx.f(this.c, pos0Var.c) && this.d == pos0Var.d && epx.f(this.e, pos0Var.e);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGrowthListingViewConfig(downloadState=");
        sb.append(this.a);
        sb.append(", textTitle=");
        sb.append(this.b);
        sb.append(", textFirstButton=");
        sb.append(this.c);
        sb.append(", forceDarkTheme=");
        sb.append(this.d);
        sb.append(", buttonIconResId=");
        return uqi.b(sb, this.e, ')');
    }
}
