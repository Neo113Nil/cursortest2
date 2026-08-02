package xsna;

import xsna.y8g;

/* compiled from: UiMarkupColor.kt */
/* loaded from: classes4.dex */
public final class jzp0 {
    public final y8g a;
    public final boolean b;

    public jzp0(y8g.c cVar, boolean z) {
        this.a = cVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzp0)) {
            return false;
        }
        jzp0 jzp0Var = (jzp0) obj;
        return epx.f(this.a, jzp0Var.a) && this.b == jzp0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UiMarkupColor(color=" + this.a + ", isSelected=" + this.b + ")";
    }
}
