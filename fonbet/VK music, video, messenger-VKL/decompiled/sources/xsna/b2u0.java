package xsna;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* loaded from: classes12.dex */
public class b2u0 extends bis {
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;
    public static boolean i = true;

    @SuppressLint({"NewApi"})
    public void r(View view, Matrix matrix) {
        if (f) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void s(View view, int i2, int i3, int i4, int i5) {
        if (i) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void t(View view, Matrix matrix) {
        if (g) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void u(View view, Matrix matrix) {
        if (h) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
