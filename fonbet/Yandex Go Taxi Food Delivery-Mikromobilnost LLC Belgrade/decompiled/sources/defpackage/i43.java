package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class i43 implements h43, k43 {
    public final float a;
    public final boolean b;
    public final j43 c;
    public final float w;

    public i43(float f, boolean z, j43 j43Var) {
        this.a = f;
        this.b = z;
        this.c = j43Var;
        this.w = f;
    }

    @Override // defpackage.h43, defpackage.k43
    public final float b() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i43)) {
            return false;
        }
        i43 i43Var = (i43) obj;
        return y7m.b(this.a, i43Var.a) && this.b == i43Var.b && jl40.l(this.c, i43Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(Float.hashCode(this.a) * 31, 31, this.b);
        j43 j43Var = this.c;
        return e + (j43Var == null ? 0 : j43Var.hashCode());
    }

    @Override // defpackage.k43
    public final void m(fwi fwiVar, int i, int[] iArr, int[] iArr2) {
        u(fwiVar, i, iArr, LayoutDirection.Ltr, iArr2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) y7m.c(this.a));
        sb.append(Extension.FIX_SPACE);
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.h43
    public final void u(fwi fwiVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int f0 = fwiVar.f0(this.a);
        boolean z = this.b && layoutDirection == LayoutDirection.Rtl;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int max = Math.max(0, i - iArr[i3]);
                iArr2[i5] = max;
                i4 = Math.min(f0, max);
                i = iArr2[i5] - i4;
                i3++;
                i5++;
            }
            i2 = i + i4;
        } else {
            int length2 = iArr.length;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                int min = Math.min(i7, i - i10);
                iArr2[i9] = min;
                int min2 = Math.min(f0, (i - min) - i10);
                int i11 = iArr2[i9] + i10 + min2;
                i6++;
                i8 = min2;
                i7 = i11;
                i9++;
            }
            i2 = i - (i7 - i8);
        }
        j43 j43Var = this.c;
        if (j43Var == null || i2 <= 0) {
            return;
        }
        int b = j43Var.b(i2, layoutDirection);
        if (z) {
            b -= i2;
        }
        if (b != 0) {
            int length3 = iArr2.length;
            for (int i12 = 0; i12 < length3; i12++) {
                iArr2[i12] = iArr2[i12] + b;
            }
        }
    }
}
