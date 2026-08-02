package xsna;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;

/* compiled from: PrimaryButton.kt */
/* loaded from: classes16.dex */
public class h9d0 implements vbp0 {
    public final VkButton a;

    static {
        int[] iArr = VkButton.W;
    }

    public h9d0(Context context, gzs<s3q0> gzsVar) {
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setId(R.id.topshelf_button_primary);
        vkButton.setText(R.string.watch);
        vkButton.setAppearance(VkButton.Appearance.Overlay);
        vkButton.setMode(VkButton.Mode.Primary);
        vkButton.setSize(VkButton.Size.Medium);
        vkButton.setLayoutParams(new ConstraintLayout.b(0, e3m.a(R.dimen.video_topshelf_button_height, context)));
        bwt0.i0(vkButton, new i750(gzsVar, 17));
        this.a = vkButton;
    }

    @Override // xsna.vbp0
    public final View getView() {
        return this.a;
    }

    @Override // xsna.vbp0
    public final void destroy() {
    }
}
