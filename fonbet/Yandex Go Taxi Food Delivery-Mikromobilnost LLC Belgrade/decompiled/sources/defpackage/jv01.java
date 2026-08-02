package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class jv01 extends BottomSheetBehavior.a {
    public final /* synthetic */ TransfersDashboardFragment a;

    public jv01(TransfersDashboardFragment transfersDashboardFragment) {
        this.a = transfersDashboardFragment;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
        this.a.updateBoundary();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        r0 r0Var;
        Object value;
        a access$getViewModel = TransfersDashboardFragment.access$getViewModel(this.a);
        access$getViewModel.getClass();
        if (scc.g(4, 3, 6).contains(Integer.valueOf(i))) {
            cv01 cv01Var = access$getViewModel.E;
            Integer valueOf = Integer.valueOf(i);
            boolean z = ((vv01) access$getViewModel.X()).f;
            cv01Var.getClass();
            if (i == 4 && !cv01Var.e) {
                cv01Var.b(z);
            }
            rt1 rt1Var = cv01Var.a.r0;
            rt1Var.a.a("transfers_dashboard.bottom_sheet.swipe", g8e.w(1, "new_state", cv01.a(valueOf)));
        }
        pz40 Y = access$getViewModel.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, vv01.a((vv01) value, null, Integer.valueOf(i), false, false, false, 59)));
    }
}
