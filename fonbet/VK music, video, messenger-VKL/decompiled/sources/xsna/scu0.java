package xsna;

import android.view.View;
import com.vk.auth.ui.VkAuthPasswordView;

/* compiled from: VkAuthPasswordView.kt */
/* loaded from: classes15.dex */
public final class scu0 extends hk {
    public final /* synthetic */ VkAuthPasswordView b;

    public scu0(VkAuthPasswordView vkAuthPasswordView) {
        this.b = vkAuthPasswordView;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        amVar.B(" ");
        amVar.r(" ");
        VkAuthPasswordView vkAuthPasswordView = this.b;
        CharSequence text = vkAuthPasswordView.getEditText().getText();
        if (drm0.N(text)) {
            text = vkAuthPasswordView.getEditText().getHint();
        }
        amVar.A(text);
    }
}
