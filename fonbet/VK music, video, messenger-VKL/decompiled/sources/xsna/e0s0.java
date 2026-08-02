package xsna;

/* compiled from: VideoAdsSuspendBottomSheetVS.kt */
/* loaded from: classes6.dex */
public final class e0s0 {
    public final String a;
    public final String b;
    public final String c;

    public e0s0(String str, String str2, String str3, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0s0)) {
            return false;
        }
        e0s0 e0s0Var = (e0s0) obj;
        return epx.f(this.a, e0s0Var.a) && this.b.equals(e0s0Var.b) && epx.f(this.c, e0s0Var.c);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(false) + ((a + (str == null ? 0 : str.hashCode())) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAdsSuspendBottomSheetVS(title=");
        sb.append(this.a);
        sb.append(", actionButtonTitle=");
        sb.append(this.b);
        sb.append(", cancelButtonTitle=");
        return i5s.a(sb, this.c, ", subtitle=null, forceDarkTheme=false)");
    }
}
