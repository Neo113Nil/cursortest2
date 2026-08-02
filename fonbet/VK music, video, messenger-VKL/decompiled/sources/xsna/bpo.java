package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;

/* compiled from: DynamicContentHeightBottomSheetCallback.kt */
/* loaded from: classes3.dex */
public final class bpo extends ModalBottomSheetBehavior.d {
    public static final int b = iah0.a(56);
    public final View a;

    public bpo(View view) {
        this.a = view;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
        float f2 = ((f * (r3 - r0)) + ((int) (iah0.f().heightPixels * 0.5f))) - b;
        View view2 = this.a;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.height = (int) f2;
        view2.setLayoutParams(layoutParams);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
    }
}
