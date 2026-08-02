package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: EqualizerGraph.kt */
/* loaded from: classes3.dex */
public final class j06 implements a.e {
    public final int a;

    public j06(int i) {
        this.a = i;
    }

    @Override // androidx.compose.foundation.layout.a.e, androidx.compose.foundation.layout.a.n
    public final float a() {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.a.e
    public final void b(azl azlVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        int i2 = i / (this.a + 1);
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = i4 + 1;
            iArr2[i4] = (i5 * i2) - (iArr[i3] / 2);
            i3++;
            i4 = i5;
        }
    }
}
