package xsna;

/* compiled from: VoipImage.kt */
/* loaded from: classes7.dex */
public final class eqw0 {
    public final int a;
    public final int b;
    public final String c;

    public eqw0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqw0)) {
            return false;
        }
        eqw0 eqw0Var = (eqw0) obj;
        return this.a == eqw0Var.a && this.b == eqw0Var.b && epx.f(this.c, eqw0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipImage(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", url=");
        return ho8.a(sb, this.c, ')');
    }
}
