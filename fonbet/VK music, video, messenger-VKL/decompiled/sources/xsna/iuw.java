package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.tabs.VkTabs;
import xsna.woo;

/* compiled from: IndicatorPositionAnimator.kt */
/* loaded from: classes17.dex */
public final class iuw {
    public final VkTabs.a a;
    public final boolean b = true;
    public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public smk0 d;
    public boolean e;

    public iuw(VkTabs.a aVar) {
        this.a = aVar;
    }

    public final void a(int i) {
        vmk0 vmk0Var;
        if (!this.e || !this.b) {
            smk0 smk0Var = this.d;
            if (smk0Var != null) {
                smk0Var.d();
            }
            this.c = i + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (this.e) {
                this.a.invoke();
                return;
            }
            return;
        }
        float f = i + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        smk0 smk0Var2 = this.d;
        if (epx.d((smk0Var2 == null || (vmk0Var = smk0Var2.u) == null) ? null : Float.valueOf((float) vmk0Var.i), f)) {
            return;
        }
        smk0 smk0Var3 = this.d;
        if (smk0Var3 != null) {
            smk0Var3.d();
        }
        float f2 = this.c;
        vmk0 vmk0Var2 = new vmk0(f * 100.0f);
        vmk0Var2.a(1.0f);
        vmk0Var2.b(600.0f);
        smk0 smk0Var4 = new smk0(new qqr(f2 * 100.0f));
        smk0Var4.u = vmk0Var2;
        smk0Var4.c(new woo.l() { // from class: xsna.huw
            @Override // xsna.woo.l
            public final void f(float f3) {
                iuw iuwVar = iuw.this;
                iuwVar.c = f3 / 100.0f;
                iuwVar.a.invoke();
            }
        });
        this.d = smk0Var4;
        smk0Var4.h();
    }
}
