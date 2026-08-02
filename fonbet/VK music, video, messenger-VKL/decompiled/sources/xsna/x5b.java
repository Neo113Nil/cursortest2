package xsna;

import android.widget.ImageView;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.toggle.features.ImFeatures;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x5b implements gzs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a6b c;
    public final /* synthetic */ ImageView d;
    public final /* synthetic */ j6b e;

    public /* synthetic */ x5b(boolean z, a6b a6bVar, ImageView imageView, j6b j6bVar) {
        this.b = z;
        this.c = a6bVar;
        this.d = imageView;
        this.e = j6bVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        VkOnboardingCampaign e;
        a6b a6bVar = this.c;
        q7v0 q7v0Var = a6bVar.a;
        if (this.b) {
            e = q7v0Var.e("me:channel_donut_setting");
        } else {
            ImFeatures imFeatures = ImFeatures.DONUTS_EASY_FLOW_IN_CHANNEL;
            imFeatures.getClass();
            e = com.vk.toggle.b.A.a(imFeatures) ? q7v0Var.e("me:channel_donut_setting_disabled_android") : null;
        }
        VkOnboardingCampaign vkOnboardingCampaign = e;
        if (vkOnboardingCampaign != null && q7v0Var.d(vkOnboardingCampaign) && q7v0Var.b(vkOnboardingCampaign, false)) {
            a6bVar.b = true;
            a6bVar.c.post(new y5b(a6bVar, this.d, vkOnboardingCampaign, this.e, 0));
        }
        return s3q0.a;
    }
}
