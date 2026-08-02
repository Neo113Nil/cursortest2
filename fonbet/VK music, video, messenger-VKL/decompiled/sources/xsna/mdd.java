package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.slot.Slot;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;

/* compiled from: ClipTrailingSlot.kt */
/* loaded from: classes16.dex */
public final class mdd implements Slot<Object> {
    public final VkButton b;
    public final VkImage c;
    public final FrameLayout d;

    public mdd(Context context) {
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setVisibility(8);
        vkButton.setMode(VkButton.Mode.Secondary);
        vkButton.setAppearance(VkButton.Appearance.Overlay);
        vkButton.setSize(VkButton.Size.Small);
        vkButton.setCornerRadius(Float.valueOf(e3m.a(R.dimen.clips_author_cell_button_corner_radius, context)));
        this.b = vkButton;
        VkImage vkImage = new VkImage(context, null, 6, 0);
        vkImage.setVisibility(8);
        vkImage.setImageResource(R.drawable.vk_icon_more_horizontal_24);
        gpo0.f(vkImage, Integer.valueOf(R.attr.vk_ui_icon_contrast));
        this.c = vkImage;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.addView(vkButton, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.addView(vkImage, new FrameLayout.LayoutParams(e3m.a(R.dimen.clips_author_cell_button_more_button_size, context), e3m.a(R.dimen.clips_author_cell_button_more_button_size, context), 17));
    }

    @Override // com.vk.core.view.components.cell.slot.Slot
    public final View getView() {
        return this.d;
    }

    @Override // xsna.too0
    public final void Ng() {
    }

    @Override // com.vk.core.view.components.cell.slot.Slot
    public final void Ad(Slot.Size size) {
    }
}
