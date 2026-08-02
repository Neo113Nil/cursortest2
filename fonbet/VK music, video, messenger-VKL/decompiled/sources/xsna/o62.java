package xsna;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class o62 {
    public static final a a = a.i;

    /* compiled from: AndroidComposeView.android.kt */
    public static final class a extends Lambda implements izs<oua0, oua0> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final oua0 invoke(oua0 oua0Var) {
            return oua0Var;
        }
    }

    public static final boolean a(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final float b(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final void c(float[] fArr, float[] fArr2) {
        float b = b(0, 0, fArr2, fArr);
        float b2 = b(0, 1, fArr2, fArr);
        float b3 = b(0, 2, fArr2, fArr);
        float b4 = b(0, 3, fArr2, fArr);
        float b5 = b(1, 0, fArr2, fArr);
        float b6 = b(1, 1, fArr2, fArr);
        float b7 = b(1, 2, fArr2, fArr);
        float b8 = b(1, 3, fArr2, fArr);
        float b9 = b(2, 0, fArr2, fArr);
        float b10 = b(2, 1, fArr2, fArr);
        float b11 = b(2, 2, fArr2, fArr);
        float b12 = b(2, 3, fArr2, fArr);
        float b13 = b(3, 0, fArr2, fArr);
        float b14 = b(3, 1, fArr2, fArr);
        float b15 = b(3, 2, fArr2, fArr);
        float b16 = b(3, 3, fArr2, fArr);
        fArr[0] = b;
        fArr[1] = b2;
        fArr[2] = b3;
        fArr[3] = b4;
        fArr[4] = b5;
        fArr[5] = b6;
        fArr[6] = b7;
        fArr[7] = b8;
        fArr[8] = b9;
        fArr[9] = b10;
        fArr[10] = b11;
        fArr[11] = b12;
        fArr[12] = b13;
        fArr[13] = b14;
        fArr[14] = b15;
        fArr[15] = b16;
    }
}
