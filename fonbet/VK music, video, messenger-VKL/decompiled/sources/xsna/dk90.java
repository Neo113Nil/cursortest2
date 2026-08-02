package xsna;

import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vkontakte.android.R;
import xsna.gt10;

/* compiled from: PartMediaPermissionWarningHolder.kt */
/* loaded from: classes17.dex */
public final class dk90 extends hf6<ek90> {
    public final gt10.a m;
    public final VkButton n;

    public dk90(View view, VkMediaPicker vkMediaPicker) {
        super(view);
        this.m = vkMediaPicker;
        this.n = (VkButton) view.findViewById(R.id.part_media_permission_warning_button);
    }

    @Override // xsna.hf6
    public final void W5(ek90 ek90Var) {
        this.n.setOnClickListener(new x16(this, 13));
    }
}
