package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;

/* compiled from: MorePicture.kt */
/* loaded from: classes7.dex */
public final class r930 implements VkCell.d {
    public static final int b = iah0.a(16);
    public final VkButton a;

    public r930(Context context) {
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setSize(VkButton.Size.Small);
        vkButton.setMode(VkButton.Mode.Secondary);
        vkButton.setAppearance(VkButton.Appearance.Accent);
        vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_more_vertical_16));
        vkButton.setIconSize(Integer.valueOf(b));
        vkButton.setContentDescription(context.getString(R.string.voip_accessibility_more_options));
        this.a = vkButton;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        if (fVar instanceof p930) {
            this.a.setOnClickListener(new mo3(fVar, 9));
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
