package xsna;

/* compiled from: EasterEggAnimation.kt */
/* loaded from: classes18.dex */
public final class nuo {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public nuo(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuo)) {
            return false;
        }
        nuo nuoVar = (nuo) obj;
        return epx.f(this.a, nuoVar.a) && this.b == nuoVar.b && this.c == nuoVar.c && this.d == nuoVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EasterEggAnimation(url=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        return vu5.b(sb, this.d, ')');
    }
}
