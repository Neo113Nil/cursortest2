package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class pk1 {
    public final String a;
    public final float b;

    public pk1(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk1)) {
            return false;
        }
        pk1 pk1Var = (pk1) obj;
        return epx.f(this.a, pk1Var.a) && Float.compare(this.b, pk1Var.b) == 0;
    }

    public final int hashCode() {
        String str = this.a;
        return Float.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Media(htmlContent=" + this.a + ", aspectRatio=" + this.b + ")";
    }
}
