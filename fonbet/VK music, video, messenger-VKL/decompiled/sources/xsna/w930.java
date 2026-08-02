package xsna;

import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;

/* compiled from: MoreSuggestsViewHolder.kt */
/* loaded from: classes16.dex */
public final class w930 extends vfz<v930> {
    public final lgb l;
    public final VkButton m;

    public w930(View view, com.vk.channels.impl.list.f fVar) {
        super(view);
        this.l = fVar;
        this.m = (VkButton) view.findViewById(R.id.im_channels_show_more_suggests_button);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(v930 v930Var) {
        VkButton.Size size = VkButton.Size.Medium;
        VkButton vkButton = this.m;
        vkButton.setSize(size);
        vkButton.setMode(VkButton.Mode.Tertiary);
        vkButton.setAppearance(VkButton.Appearance.Accent);
        vkButton.setText(R.string.vkim_channels_suggests_show_more);
        vkButton.setOnClickListener(new gmp(this, 5));
    }
}
