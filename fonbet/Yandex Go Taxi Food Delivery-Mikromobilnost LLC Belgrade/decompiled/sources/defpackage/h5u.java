package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes11.dex */
public final class h5u extends BottomSheetBehavior.a {
    public final BottomSheetBehavior a;
    public final no01 b;
    public final float c = 0.5f;

    public h5u(BottomSheetBehavior bottomSheetBehavior, no01 no01Var) {
        this.a = bottomSheetBehavior;
        this.b = no01Var;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        no01 no01Var = this.b;
        boolean z = no01Var.a;
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (z && ((!no01Var.d && i == 3) || (!no01Var.e && i == 4))) {
            bottomSheetBehavior.W(6);
        }
        if (i == 4) {
            float f = this.c;
            if (f == Float.MIN_VALUE) {
                bottomSheetBehavior.S(f);
            }
        }
    }
}
