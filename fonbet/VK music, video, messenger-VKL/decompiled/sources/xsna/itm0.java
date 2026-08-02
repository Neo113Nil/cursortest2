package xsna;

import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;

/* compiled from: StyleThemeTagRule.kt */
/* loaded from: classes.dex */
public final class itm0 implements ppo0 {
    public final SparseArray<int[]> a;

    public itm0(SparseArray<int[]> sparseArray) {
        this.a = sparseArray;
    }

    @Override // xsna.ppo0
    public final void a(SparseIntArray sparseIntArray, AttributeSet attributeSet) {
        int[] iArr = this.a.get(attributeSet.getStyleAttribute());
        if (iArr == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 > iArr.length) {
                return;
            }
            sparseIntArray.append(iArr[i], iArr[i2]);
            i += 2;
        }
    }
}
