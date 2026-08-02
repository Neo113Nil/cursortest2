package xsna;

import android.view.View;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.MediaPickerBottomSheetBehavior;

/* compiled from: View.kt */
/* loaded from: classes4.dex */
public final class koc0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ enc0 b;

    public koc0(enc0 enc0Var) {
        this.b = enc0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        enc0 enc0Var = this.b;
        VkInputSelect vkInputSelect = enc0Var.n;
        MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior = enc0Var.A;
        if (mediaPickerBottomSheetBehavior == null || mediaPickerBottomSheetBehavior.k != 4) {
            f4m.v(0, vkInputSelect);
        } else {
            f4m.v(enc0Var.c.getHeight() - (enc0Var.q.getTop() + enc0Var.d0), vkInputSelect);
        }
    }
}
