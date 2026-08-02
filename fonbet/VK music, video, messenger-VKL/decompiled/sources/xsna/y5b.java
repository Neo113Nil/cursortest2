package xsna;

import android.widget.ImageView;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils;
import androidx.lifecycle.Lifecycle;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import xsna.m8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class y5b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y5b(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                a6b a6bVar = (a6b) obj4;
                ImageView imageView = (ImageView) obj3;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) obj2;
                j6b j6bVar = (j6b) obj;
                ImFeatures imFeatures = ImFeatures.DONUTS_EASY_FLOW_IN_CHANNEL;
                imFeatures.getClass();
                int i2 = com.vk.toggle.b.A.a(imFeatures) ? R.string.vkim_donut_setting_onboarding_tooltip_title : R.string.vkim_donut_setting_onboarding_tooltip;
                int i3 = m8v0.M;
                m8v0.a.a(imageView, imageView.getContext().getResources().getString(i2), null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.TopLeft, VkTooltip$BalloonTilt.Left, new z5b(j6bVar, a6bVar, vkOnboardingCampaign, 0), new u6(6, a6bVar, vkOnboardingCampaign), null, null, new d50(5, a6bVar, vkOnboardingCampaign), new kp5(2, a6bVar, vkOnboardingCampaign), null, 0, false, null, null, false, null, false, 16763908);
                break;
            default:
                Lifecycle lifecycle = (Lifecycle) obj4;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) obj3;
                String str = (String) obj2;
                RemoteUtils.a aVar = (RemoteUtils.a) obj;
                if (lifecycle != null && lifecycle.getCurrentState().a(Lifecycle.State.CREATED)) {
                    RemoteUtils.b(iOnDoneCallback, str, aVar);
                    break;
                } else {
                    RemoteUtils.e(iOnDoneCallback, new IllegalStateException("Lifecycle is not at least created when dispatching " + aVar), str);
                    break;
                }
                break;
        }
    }
}
