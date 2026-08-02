package defpackage;

import android.graphics.RectF;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class pfs0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final RectF k;

    public pfs0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, RectF rectF) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = f;
        this.k = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfs0)) {
            return false;
        }
        pfs0 pfs0Var = (pfs0) obj;
        return this.a == pfs0Var.a && this.b == pfs0Var.b && this.c == pfs0Var.c && this.d == pfs0Var.d && this.e == pfs0Var.e && this.f == pfs0Var.f && this.g == pfs0Var.g && this.h == pfs0Var.h && this.i == pfs0Var.i && Float.compare(this.j, pfs0Var.j) == 0 && jl40.l(this.k, pfs0Var.k);
    }

    public final int hashCode() {
        int c = g8e.c(this.j, oyr.b(this.i, oyr.b(this.h, oyr.b(this.g, oyr.b(this.f, oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        RectF rectF = this.k;
        return c + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "SimplifiedCardStyleUiState(backgroundColor=", ", titleColor=", ", carPlateBackgroundColor=");
        vfc.u(this.c, this.d, ", carPlateTextColor=", ", shimmerTitleColor=", s);
        vfc.u(this.e, this.f, ", outlineIconBackgroundColor=", ", secondaryButtonBackgroundColor=", s);
        vfc.u(this.g, this.h, ", secondaryButtonTintColor=", ", ratingStarColor=", s);
        s.append(this.i);
        s.append(", verticalPaddingFraction=");
        s.append(this.j);
        s.append(", externalSpacings=");
        s.append(this.k);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
