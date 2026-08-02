package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class uwt0 {
    public static final void a(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
