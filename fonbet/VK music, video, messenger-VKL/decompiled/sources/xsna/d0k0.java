package xsna;

import android.view.View;
import com.vk.superapp.browser.ui.slide.bottomsheet.SlideBottomSheetBehavior;
import xsna.t1u0;

/* compiled from: SlideBottomSheetBehavior.java */
/* loaded from: classes6.dex */
public final class d0k0 implements t1u0.b {
    public final /* synthetic */ SlideBottomSheetBehavior a;

    public d0k0(SlideBottomSheetBehavior slideBottomSheetBehavior) {
        this.a = slideBottomSheetBehavior;
    }

    @Override // xsna.t1u0.b
    public final bqx0 a(View view, bqx0 bqx0Var, t1u0.c cVar) {
        View view2;
        int i = bqx0Var.a.k().d;
        SlideBottomSheetBehavior slideBottomSheetBehavior = this.a;
        slideBottomSheetBehavior.b = i;
        if (slideBottomSheetBehavior.l != null) {
            slideBottomSheetBehavior.f = slideBottomSheetBehavior.k - (i > 0 ? Math.max(0, i) : 0);
            if (slideBottomSheetBehavior.g == 4 && (view2 = (View) slideBottomSheetBehavior.l.get()) != null) {
                view2.requestLayout();
            }
        }
        return bqx0Var;
    }
}
