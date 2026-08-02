package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: ViewUtil.kt */
/* loaded from: classes6.dex */
public final class r1u0 {
    public static final int a(View view) {
        if (view.isAccessibilityFocused()) {
            return view.getId();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                int a = a(viewGroup.getChildAt(i));
                if (a != -1) {
                    return a;
                }
            }
        }
        return -1;
    }
}
