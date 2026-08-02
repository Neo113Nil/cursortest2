package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: TouchHelper.java */
/* loaded from: classes3.dex */
public final class fdp0 {

    /* compiled from: TouchHelper.java */
    public interface a {
        boolean a(View view);
    }

    public static final boolean a(float f, float f2, View view, a aVar) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f > i && f < view.getWidth() + i && f2 > i2 && f2 < view.getHeight() + i2) {
            if (!aVar.a(view)) {
                if ((view instanceof ViewGroup) && view.getVisibility() == 0) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        if (!a(f, f2, viewGroup.getChildAt(i3), aVar)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
