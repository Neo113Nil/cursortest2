package xsna;

import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;

/* compiled from: SuperAppTileWidgetBackgroundIconHolder.kt */
/* loaded from: classes6.dex */
public final class hcn0 extends fcn0 implements lhp0 {
    public final VkImage C;

    public hcn0(View view, u7n0 u7n0Var) {
        super(view, u7n0Var);
        this.C = (VkImage) this.itemView.findViewById(R.id.background_image);
        VkButton.Appearance appearance = VkButton.Appearance.Overlay;
        VkButton.Mode mode = VkButton.Mode.Primary;
        VkButton vkButton = this.u;
        vkButton.setAppearance(appearance);
        vkButton.setMode(mode);
    }

    @Override // xsna.fcn0, xsna.hf6
    /* renamed from: g6 */
    public final void W5(men0 men0Var) {
        this.itemView.post(new e6(7, this, men0Var));
        super.W5(men0Var);
    }
}
