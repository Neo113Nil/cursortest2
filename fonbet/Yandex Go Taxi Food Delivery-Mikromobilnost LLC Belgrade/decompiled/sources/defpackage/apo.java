package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.messaging.views.ExpandedBottomSheetDialog;

/* loaded from: classes15.dex */
public final class apo extends BottomSheetBehavior.a {
    public final /* synthetic */ ExpandedBottomSheetDialog a;

    public apo(ExpandedBottomSheetDialog expandedBottomSheetDialog) {
        this.a = expandedBottomSheetDialog;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }
}
