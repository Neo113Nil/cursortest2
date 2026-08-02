package xsna;

import android.app.Dialog;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vkontakte.android.R;
import xsna.aem0;
import xsna.xn50;

/* compiled from: StoryStatisticsBottomSheet.kt */
/* loaded from: classes6.dex */
public final class iem0 extends ModalBottomSheetBehavior.d {
    public final float a;
    public final /* synthetic */ hem0 b;

    public iem0(hem0 hem0Var) {
        iz8 cadreSize;
        this.b = hem0Var;
        uov uovVar = hem0Var.u1;
        this.a = (uovVar == null || (cadreSize = uovVar.getCadreSize()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : cadreSize.d;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
        hem0 hem0Var = this.b;
        pfm0 pfm0Var = hem0Var.k1;
        if (pfm0Var == null) {
            return;
        }
        Dialog dialog = hem0Var.s;
        CoordinatorLayout coordinatorLayout = dialog != null ? (CoordinatorLayout) dialog.findViewById(R.id.coordinator) : null;
        if (f == -1.0f) {
            if (coordinatorLayout != null) {
                coordinatorLayout.removeView(pfm0Var);
                return;
            }
            return;
        }
        if ((coordinatorLayout == null || coordinatorLayout.indexOfChild(pfm0Var) == -1) && coordinatorLayout != null) {
            coordinatorLayout.addView(pfm0Var, 0);
        }
        hem0Var.bc();
        float L = ModalBottomSheetBehavior.H(view).L() - view.getPaddingTop();
        if (f < -1.0f || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setAlpha(1.0f);
            xn50.a.c(hem0Var, new aem0.g(true));
            pfm0Var.P4(1.0f, (int) L);
            return;
        }
        xn50.a.c(hem0Var, new aem0.g(false));
        float L2 = (ModalBottomSheetBehavior.H(view).L() * (1 + f)) - view.getPaddingTop();
        float f2 = this.a;
        if (L2 < f2 || L == f2) {
            pfm0Var.P4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) f2);
            return;
        }
        float f3 = (L2 - f2) / (L - f2);
        view.setAlpha(swe0.f(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        pfm0Var.P4(f3, (int) L2);
        int i = hem0Var.o1;
        if (i != hem0Var.n1) {
            n7b0 n7b0Var = hem0Var.v1;
            if (n7b0Var != null) {
                n7b0Var.invoke(Integer.valueOf(i));
            }
            hem0Var.n1 = hem0Var.o1;
        }
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        View findViewById;
        Dialog dialog = this.b.s;
        if (dialog == null || (findViewById = dialog.findViewById(R.id.touch_outside)) == null) {
            return;
        }
        if (i == 4) {
            f4m.j(findViewById);
        } else {
            findViewById.setVisibility(0);
        }
    }
}
