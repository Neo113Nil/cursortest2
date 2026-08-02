package xsna;

/* compiled from: BackgroundPainterWithOverflowImage.kt */
/* loaded from: classes18.dex */
public final class hwv {
    public final lg90 a;
    public final lg90 b;
    public final float c;
    public final long d;

    public hwv(lg90 lg90Var, lg90 lg90Var2, float f, long j) {
        this.a = lg90Var;
        this.b = lg90Var2;
        this.c = f;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hwv) {
            hwv hwvVar = (hwv) obj;
            return epx.f(this.a, hwvVar.a) && epx.f(this.b, hwvVar.b) && pco.b(this.c, hwvVar.c) && this.d == hwvVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IllustrationParams(lightImagePainter=");
        sb.append(this.a);
        sb.append(", darkImagePainter=");
        sb.append(this.b);
        sb.append(", illustrationSize=");
        oq.f(this.c, ", illustrationOffset=", sb);
        sb.append((Object) rco.d(this.d));
        sb.append(')');
        return sb.toString();
    }
}
