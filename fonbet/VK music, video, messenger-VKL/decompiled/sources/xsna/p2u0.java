package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: view_helpers.kt */
/* loaded from: classes16.dex */
public final class p2u0 {
    public static final void a(FrameLayout frameLayout, ConstraintLayout constraintLayout) {
        zmp0.b(frameLayout);
        biq biqVar = new biq();
        biqVar.setDuration(250L);
        zmp0.a(frameLayout, biqVar);
        View childAt = frameLayout.getChildCount() == 0 ? null : frameLayout.getChildAt(0);
        frameLayout.addView(constraintLayout, new FrameLayout.LayoutParams(-1, -1));
        if (childAt != null) {
            frameLayout.removeView(childAt);
        }
    }
}
