package xsna;

/* compiled from: VideoFragmentFormat.kt */
/* loaded from: classes3.dex */
public final class gye0 {
    public final String a;
    public final String b;
    public final String c;

    public gye0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gye0)) {
            return false;
        }
        gye0 gye0Var = (gye0) obj;
        return epx.f(this.a, gye0Var.a) && epx.f(this.b, gye0Var.b) && epx.f(this.c, gye0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RawColorInfo(colorSpaceName=");
        sb.append(this.a);
        sb.append(", colorRangeName=");
        sb.append(this.b);
        sb.append(", colorTransferName=");
        return ho8.a(sb, this.c, ')');
    }
}
