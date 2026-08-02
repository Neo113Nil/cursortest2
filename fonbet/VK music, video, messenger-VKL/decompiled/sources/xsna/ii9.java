package xsna;

/* compiled from: CameraEffectWrap.kt */
/* loaded from: classes3.dex */
public final class ii9 {
    public final String a;
    public final boolean b;
    public final int c;
    public final String d;

    public ii9(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii9)) {
            return false;
        }
        ii9 ii9Var = (ii9) obj;
        return epx.f(this.a, ii9Var.a) && this.b == ii9Var.b && this.c == ii9Var.c && epx.f(this.d, ii9Var.d);
    }

    public final int hashCode() {
        int a = shy.a(this.c, qoy.b(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraEffectWrap(effectName=");
        sb.append(this.a);
        sb.append(", isOkEffect=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", fullId=");
        return ho8.a(sb, this.d, ')');
    }
}
