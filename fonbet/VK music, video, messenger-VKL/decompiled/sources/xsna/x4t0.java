package xsna;

import android.view.View;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class x4t0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ Image b;
    public final /* synthetic */ VkAvatar c;

    public x4t0(Image image, VkAvatar vkAvatar) {
        this.b = image;
        this.c = vkAvatar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str;
        view.removeOnLayoutChangeListener(this);
        ImageSize Cb = this.b.Cb(view.getWidth(), true, false);
        if (Cb == null || (str = Cb.d.d) == null) {
            return;
        }
        this.c.o0(str, null);
    }
}
