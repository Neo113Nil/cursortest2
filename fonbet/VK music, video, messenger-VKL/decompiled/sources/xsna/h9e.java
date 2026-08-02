package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;

/* compiled from: ClipsFooterLoadingViewProvider.kt */
/* loaded from: classes17.dex */
public final class h9e extends x6s {
    @Override // xsna.x6s
    public final View a(Context context, ViewGroup viewGroup) {
        VkScreenSpinner vkScreenSpinner = new VkScreenSpinner(context, null, 6);
        vkScreenSpinner.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        bwt0.b0(17, vkScreenSpinner);
        vkScreenSpinner.setSpinnerState(VkSpinnerContent.SpinnerState.Loading);
        vkScreenSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size56);
        vkScreenSpinner.setBackgroundColorful(false);
        vkScreenSpinner.setContentColorful(false);
        vkScreenSpinner.setSpinnerMode(VkScreenSpinner.SpinnerMode.Overlay);
        return vkScreenSpinner;
    }
}
