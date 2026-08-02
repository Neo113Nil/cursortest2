package xsna;

import android.view.View;
import java.util.HashMap;

/* compiled from: VisibilityPropagation.java */
/* loaded from: classes12.dex */
public abstract class z4u0 extends bnp0 {
    public static final String[] a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int c(gnp0 gnp0Var, int i) {
        int[] iArr;
        if (gnp0Var == null || (iArr = (int[]) gnp0Var.a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // xsna.bnp0
    public final void a(gnp0 gnp0Var) {
        View view = gnp0Var.b;
        HashMap hashMap = gnp0Var.a;
        Integer num = (Integer) hashMap.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        hashMap.put("android:visibilityPropagation:visibility", num);
        int[] iArr = {r5, 0};
        view.getLocationOnScreen(iArr);
        int round = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + round;
        int round2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = round2;
        iArr[1] = (view.getHeight() / 2) + round2;
        hashMap.put("android:visibilityPropagation:center", iArr);
    }
}
