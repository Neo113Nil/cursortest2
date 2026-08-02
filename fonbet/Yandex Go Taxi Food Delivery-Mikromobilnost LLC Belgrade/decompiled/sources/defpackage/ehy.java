package defpackage;

/* loaded from: classes.dex */
public final class ehy {
    public static final ehy d = new ehy(bhy.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public ehy(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehy)) {
            return false;
        }
        ehy ehyVar = (ehy) obj;
        float f = ehyVar.a;
        float f2 = bhy.b;
        return Float.compare(this.a, f) == 0 && this.b == ehyVar.b && this.c == ehyVar.c;
    }

    public final int hashCode() {
        float f = bhy.b;
        return Integer.hashCode(this.c) + oyr.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) bhy.b(this.a));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
