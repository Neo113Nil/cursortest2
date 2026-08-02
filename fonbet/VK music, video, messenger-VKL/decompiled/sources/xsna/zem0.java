package xsna;

/* compiled from: StoryStatisticsHeaderItem.kt */
/* loaded from: classes6.dex */
public final class zem0 implements hfz, s3u0 {
    public final String b;
    public final String c;

    public zem0(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zem0)) {
            return false;
        }
        zem0 zem0Var = (zem0) obj;
        return epx.f(this.b, zem0Var.b) && epx.f(this.c, zem0Var.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsHeaderItem(title=");
        sb.append(this.b);
        sb.append(", buttonText=");
        return ho8.a(sb, this.c, ')');
    }
}
