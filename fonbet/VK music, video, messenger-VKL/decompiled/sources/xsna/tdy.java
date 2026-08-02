package xsna;

/* compiled from: KeyParams.kt */
/* loaded from: classes3.dex */
public final class tdy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public tdy(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdy)) {
            return false;
        }
        tdy tdyVar = (tdy) obj;
        return this.a == tdyVar.a && this.b == tdyVar.b && this.c == tdyVar.c && this.d == tdyVar.d && this.e == tdyVar.e && this.f == tdyVar.f && this.g == tdyVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyParams(keyBackgroundRes=");
        sb.append(this.a);
        sb.append(", marginStart=");
        sb.append(this.b);
        sb.append(", marginTop=");
        sb.append(this.c);
        sb.append(", marginEnd=");
        sb.append(this.d);
        sb.append(", marginBottom=");
        sb.append(this.e);
        sb.append(", textStyle=");
        sb.append(this.f);
        sb.append(", maxSizeDiff=");
        return vu5.b(sb, this.g, ')');
    }
}
