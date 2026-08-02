package xsna;

import android.view.View;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import xsna.m8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ewm implements Runnable {
    public final /* synthetic */ fwm b;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ VkOnboardingCampaign d;
    public final /* synthetic */ View e;
    public final /* synthetic */ String f;
    public final /* synthetic */ gzs g;

    public /* synthetic */ ewm(fwm fwmVar, gzs gzsVar, VkOnboardingCampaign vkOnboardingCampaign, View view, String str, gzs gzsVar2) {
        this.b = fwmVar;
        this.c = gzsVar;
        this.d = vkOnboardingCampaign;
        this.e = view;
        this.f = str;
        this.g = gzsVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fwm fwmVar = this.b;
        gzs gzsVar = this.c;
        VkOnboardingCampaign vkOnboardingCampaign = this.d;
        View view = this.e;
        String str = this.f;
        gzs gzsVar2 = this.g;
        try {
            if (((Boolean) gzsVar.invoke()).booleanValue() && fwmVar.a.b(vkOnboardingCampaign, false)) {
                int i = m8v0.M;
                m8v0.a.a(view, str, gzsVar2, null, VkTooltip$MarkerSize.Size56, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new it8(view, fwmVar, vkOnboardingCampaign, 2), new h57(9, fwmVar, vkOnboardingCampaign), null, null, new na7(14, fwmVar, vkOnboardingCampaign), new u6(16, fwmVar, vkOnboardingCampaign), null, 0, false, null, null, false, null, false, 16763944);
            }
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }
}
