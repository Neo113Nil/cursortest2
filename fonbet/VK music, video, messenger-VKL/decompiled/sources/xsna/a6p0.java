package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: Tooltip.kt */
/* loaded from: classes11.dex */
public final class a6p0 implements fxb0 {
    public final int b;

    public a6p0(int i) {
        this.b = i;
    }

    @Override // xsna.fxb0
    public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
        int i = (int) (j2 >> 32);
        int b = x9.b(l9xVar.d(), i, 2, l9xVar.a);
        if (b < 0) {
            b = l9xVar.a;
        } else if (b + i > ((int) (j >> 32))) {
            b = l9xVar.c - i;
        }
        int i2 = l9xVar.b - ((int) (j2 & 4294967295L));
        int i3 = this.b;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = l9xVar.d + i3;
        }
        return (i4 & 4294967295L) | (b << 32);
    }
}
