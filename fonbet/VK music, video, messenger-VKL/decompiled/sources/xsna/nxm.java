package xsna;

/* compiled from: DiffPoint.kt */
/* loaded from: classes18.dex */
public final class nxm {
    public final float a;
    public final float b;

    public nxm(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxm)) {
            return false;
        }
        nxm nxmVar = (nxm) obj;
        return Float.compare(this.a, nxmVar.a) == 0 && Float.compare(this.b, nxmVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiffPoint(dx=");
        sb.append(this.a);
        sb.append(", dy=");
        return xq.c(')', this.b, sb);
    }
}
