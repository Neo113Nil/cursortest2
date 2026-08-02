package xsna;

/* compiled from: PhotoViewer.kt */
/* loaded from: classes3.dex */
public final class atf0 {
    public final float a;
    public final float b;

    public atf0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atf0)) {
            return false;
        }
        atf0 atf0Var = (atf0) obj;
        return Float.compare(this.a, atf0Var.a) == 0 && Float.compare(this.b, atf0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativePosition(x=");
        sb.append(this.a);
        sb.append(", y=");
        return xq.c(')', this.b, sb);
    }
}
