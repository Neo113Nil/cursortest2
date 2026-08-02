package xsna;

import android.view.View;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.core.view.mediapicker.views.AspectRatioLinearLayout;
import xsna.gt10;

/* compiled from: CameraCellViewHolder.kt */
/* loaded from: classes17.dex */
public final class qg9 extends hf6<og9> {
    public final gt10.a m;

    public qg9(View view, VkMediaPicker.CellAspectRation cellAspectRation, VkMediaPicker vkMediaPicker) {
        super(view);
        this.m = vkMediaPicker;
        ((AspectRatioLinearLayout) view).setAspectRation(cellAspectRation.i());
        view.setOnClickListener(new wz5(this, 2));
    }

    @Override // xsna.hf6
    public final void W5(og9 og9Var) {
        View view = this.itemView;
        boolean z = og9Var.a;
        view.setEnabled(z);
        this.itemView.setAlpha(z ? 1.0f : 0.64f);
    }
}
