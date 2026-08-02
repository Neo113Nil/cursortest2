package xsna;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.voip.ui.utils.StaticBottomSheetFragment;

/* compiled from: StaticBottomSheetFragment.kt */
/* loaded from: classes7.dex */
public final class uxk0 extends BottomSheetBehavior.d {
    public final /* synthetic */ StaticBottomSheetFragment a;

    public uxk0(StaticBottomSheetFragment staticBottomSheetFragment) {
        this.a = staticBottomSheetFragment;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        if (i == 5) {
            this.a.xn();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
    }
}
