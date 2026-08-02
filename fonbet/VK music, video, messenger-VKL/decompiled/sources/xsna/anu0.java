package xsna;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: VkConsentScreenBottomSheetFragment.kt */
/* loaded from: classes15.dex */
public final class anu0 extends BottomSheetBehavior.d {
    public final /* synthetic */ com.vk.auth.ui.consent.b a;
    public final /* synthetic */ BottomSheetBehavior<View> b;

    public anu0(com.vk.auth.ui.consent.b bVar, BottomSheetBehavior<View> bottomSheetBehavior) {
        this.a = bVar;
        this.b = bottomSheetBehavior;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        if (i == 3) {
            com.vk.auth.ui.consent.b bVar = this.a;
            if (bVar.F) {
                bVar.F = false;
                this.b.Q(this);
                bVar.Ln(view);
                view.requestLayout();
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
    }
}
