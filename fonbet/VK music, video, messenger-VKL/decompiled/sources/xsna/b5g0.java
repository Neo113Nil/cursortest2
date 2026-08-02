package xsna;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: ReportBottomSheetDialog.kt */
/* loaded from: classes4.dex */
public final class b5g0 extends BottomSheetBehavior.d {
    public final /* synthetic */ a5g0 a;

    public b5g0(a5g0 a5g0Var) {
        this.a = a5g0Var;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        if (i == 5) {
            int i2 = a5g0.k1;
            a5g0 a5g0Var = this.a;
            a5g0Var.fo(new e550(a5g0Var, 21));
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
    }
}
