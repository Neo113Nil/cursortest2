package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.core.view.mediapicker.VkMediaPicker;

/* compiled from: VkMediaPicker.kt */
/* loaded from: classes17.dex */
public final class v3v0 extends GridLayoutManager.c {
    public final /* synthetic */ VkMediaPicker d;

    public v3v0(VkMediaPicker vkMediaPicker) {
        this.d = vkMediaPicker;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        VkMediaPicker vkMediaPicker = this.d;
        gt10 gt10Var = vkMediaPicker.h;
        xp10 xp10Var = gt10Var != null ? (xp10) gt10Var.c.c(i) : null;
        if (xp10Var == null || !xp10Var.c()) {
            return 1;
        }
        return vkMediaPicker.m;
    }
}
