package xsna;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes12.dex */
public class c2u0 extends b2u0 {
    public static boolean j = true;

    @Override // xsna.bis
    @SuppressLint({"NewApi"})
    public void n(int i, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.n(i, view);
        } else if (j) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }
}
