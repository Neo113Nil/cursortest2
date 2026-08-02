package xsna;

import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: Bullet.kt */
/* loaded from: classes11.dex */
public final class bdc implements r5j0 {
    public static final bdc a = new bdc();

    @Override // xsna.r5j0
    public final androidx.compose.ui.graphics.c a(long j, LayoutDirection layoutDirection, azl azlVar) {
        float c = mxj0.c(j) / 2.0f;
        long floatToRawIntBits = (Float.floatToRawIntBits(c) << 32) | (Float.floatToRawIntBits(c) & 4294967295L);
        return new c.C0013c(ne7.e(p490.e(0L, j), floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits));
    }
}
