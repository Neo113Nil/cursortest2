package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.gdl0;
import xsna.woo;

/* compiled from: StickersIndicatorPositionAnimator.kt */
/* loaded from: classes6.dex */
public final class kal0 {
    public final gdl0.b a;
    public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public smk0 c;
    public boolean d;

    public kal0(gdl0.b bVar) {
        this.a = bVar;
    }

    public final void a(int i) {
        vmk0 vmk0Var;
        if (!this.d) {
            smk0 smk0Var = this.c;
            if (smk0Var != null) {
                smk0Var.d();
            }
            this.b = i + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (this.d) {
                this.a.invoke();
                return;
            }
            return;
        }
        float f = i + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        smk0 smk0Var2 = this.c;
        if (epx.d((smk0Var2 == null || (vmk0Var = smk0Var2.u) == null) ? null : Float.valueOf((float) vmk0Var.i), f)) {
            return;
        }
        smk0 smk0Var3 = this.c;
        if (smk0Var3 != null) {
            smk0Var3.d();
        }
        float f2 = this.b;
        vmk0 vmk0Var2 = new vmk0(f * 100.0f);
        vmk0Var2.a(1.0f);
        vmk0Var2.b(600.0f);
        smk0 smk0Var4 = new smk0(new qqr(f2 * 100.0f));
        smk0Var4.u = vmk0Var2;
        smk0Var4.c(new woo.l() { // from class: xsna.jal0
            @Override // xsna.woo.l
            public final void f(float f3) {
                kal0 kal0Var = kal0.this;
                kal0Var.b = f3 / 100.0f;
                kal0Var.a.invoke();
            }
        });
        this.c = smk0Var4;
        smk0Var4.h();
    }
}
