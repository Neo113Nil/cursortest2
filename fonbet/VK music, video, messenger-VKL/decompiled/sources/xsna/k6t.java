package xsna;

/* compiled from: GameBannerElementData.kt */
/* loaded from: classes17.dex */
public final class k6t {
    public final boolean a;
    public final b7t b;
    public final int c;
    public final int d;

    public k6t(boolean z, b7t b7tVar, int i, int i2) {
        this.a = z;
        this.b = b7tVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6t)) {
            return false;
        }
        k6t k6tVar = (k6t) obj;
        return this.a == k6tVar.a && epx.f(this.b, k6tVar.b) && this.c == k6tVar.c && this.d == k6tVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameBannerElementData(isHighResolution=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", elementIndex=");
        sb.append(this.c);
        sb.append(", page=");
        return vu5.b(sb, this.d, ')');
    }
}
