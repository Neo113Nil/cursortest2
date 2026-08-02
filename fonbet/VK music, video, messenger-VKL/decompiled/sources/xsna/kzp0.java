package xsna;

import xsna.jio0;

/* compiled from: UiMarkupFont.kt */
/* loaded from: classes4.dex */
public final class kzp0 {
    public final jio0.a a;
    public final boolean b;

    public kzp0(jio0.a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzp0)) {
            return false;
        }
        kzp0 kzp0Var = (kzp0) obj;
        return epx.f(this.a, kzp0Var.a) && this.b == kzp0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UiMarkupFont(fontInfo=" + this.a + ", isSelected=" + this.b + ")";
    }
}
