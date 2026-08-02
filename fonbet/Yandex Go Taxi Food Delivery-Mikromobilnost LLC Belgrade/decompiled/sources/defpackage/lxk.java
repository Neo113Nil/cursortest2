package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lxk {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final float d;

    public lxk(int i, float f, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxk)) {
            return false;
        }
        lxk lxkVar = (lxk) obj;
        return this.a == lxkVar.a && this.b == lxkVar.b && this.c == lxkVar.c && Float.compare(this.d, lxkVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + unr0.e(unr0.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "DivKitCollapsingToolbarLayoutViewState(toolbarCollapsedHeightDp=" + this.a + ", isAnchored=" + this.b + ", isToolbarScrollEnabled=" + this.c + ", parallaxMultiplier=" + this.d + Extension.C_BRAKE;
    }
}
