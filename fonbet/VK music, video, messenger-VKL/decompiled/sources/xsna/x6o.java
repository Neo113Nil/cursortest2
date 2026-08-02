package xsna;

/* compiled from: DoubleTapAnimation.kt */
/* loaded from: classes18.dex */
public final class x6o {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;

    public x6o(int i, String str, String str2, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6o)) {
            return false;
        }
        x6o x6oVar = (x6o) obj;
        return this.a.equals(x6oVar.a) && this.b == x6oVar.b && this.c == x6oVar.c && this.d.equals(x6oVar.d) && this.e == x6oVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoubleTapAnimation(name=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", raw=");
        sb.append(this.d);
        sb.append(", animateSceneInteraction=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
