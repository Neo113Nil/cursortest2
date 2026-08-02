package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.vk.core.view.components.button.VkHorizontalArrow;

/* compiled from: VkHorizontalArrow.kt */
/* loaded from: classes17.dex */
public final class oyu0 extends ViewOutlineProvider {
    public final /* synthetic */ VkHorizontalArrow a;

    public oyu0(VkHorizontalArrow vkHorizontalArrow) {
        this.a = vkHorizontalArrow;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a.j;
        if (i <= 0) {
            int min = Math.min(view.getWidth(), view.getHeight());
            outline.setRoundRect(0, 0, min, min, min / 2.0f);
            return;
        }
        int width = (view.getWidth() - i) / 2;
        int height = (view.getHeight() - i) / 2;
        outline.setRoundRect(width, height, width + i, height + i, i / 2.0f);
    }
}
