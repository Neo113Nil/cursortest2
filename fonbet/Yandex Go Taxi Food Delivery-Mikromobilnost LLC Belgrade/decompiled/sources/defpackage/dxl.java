package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import flex.engine.a;
import flex.feature.document.fragment.DocumentBottomSheetFragment;

/* loaded from: classes4.dex */
public final class dxl extends BottomSheetBehavior.a {
    public final /* synthetic */ DocumentBottomSheetFragment a;

    public dxl(DocumentBottomSheetFragment documentBottomSheetFragment) {
        this.a = documentBottomSheetFragment;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
        a engine;
        engine = this.a.getEngine();
        if (engine != null) {
            engine.n();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
    }
}
