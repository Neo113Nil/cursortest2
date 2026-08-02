package xsna;

import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import xsna.e8v0;

/* compiled from: VkOnboardingTooltip.kt */
/* loaded from: classes17.dex */
public final class a9v0 implements gzs<s3q0> {
    public final /* synthetic */ VkOnboardingStat$Delegate b;
    public final /* synthetic */ gzs<s3q0> c;

    public a9v0(VkOnboardingStat$Delegate vkOnboardingStat$Delegate, gzs<s3q0> gzsVar) {
        this.b = vkOnboardingStat$Delegate;
        this.c = gzsVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        VkOnboardingStat$Delegate vkOnboardingStat$Delegate = this.b;
        if (vkOnboardingStat$Delegate != null) {
            vkOnboardingStat$Delegate.d4(e8v0.e.b);
        }
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        return s3q0.a;
    }
}
