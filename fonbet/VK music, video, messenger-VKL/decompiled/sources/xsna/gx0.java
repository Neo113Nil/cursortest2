package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.text.VkText;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class gx0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ VkText b;

    public gx0(VkText vkText) {
        this.b = vkText;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        VkText vkText = this.b;
        ViewGroup.LayoutParams layoutParams = vkText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = vkText.getWidth();
        vkText.setLayoutParams(layoutParams);
    }
}
