package xsna;

/* compiled from: AuthorHeaderHeaderContent.kt */
/* loaded from: classes5.dex */
public final class m95 {
    public final boolean a;
    public final boolean b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public m95(boolean z, boolean z2, float f, boolean z3, boolean z4, int i, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = z3;
        this.e = z4;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m95)) {
            return false;
        }
        m95 m95Var = (m95) obj;
        return this.a == m95Var.a && this.b == m95Var.b && pco.b(this.c, m95Var.c) && this.d == m95Var.d && this.e == m95Var.e && this.f == m95Var.f && this.g == m95Var.g && this.h == m95Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + shy.a(this.g, shy.a(this.f, qoy.b(qoy.b(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, false), 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorHeaderInternalLayoutConfig(hasMiniAvatar=");
        sb.append(this.a);
        sb.append(", hasStatus=");
        sb.append(this.b);
        sb.append(", topOverlayHeight=");
        oq.f(this.c, ", useFullScreenPictureClickBounds=", sb);
        sb.append(this.d);
        sb.append(", isTouchableAreaVisible=false, isPictureLayerElevated=");
        sb.append(this.e);
        sb.append(", mainSlotBottomInsetPx=");
        sb.append(this.f);
        sb.append(", mainSlotStartInsetPx=");
        sb.append(this.g);
        sb.append(", mainSlotEndInsetPx=");
        return vu5.b(sb, this.h, ')');
    }
}
