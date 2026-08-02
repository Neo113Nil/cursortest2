package xsna;

import com.vk.core.preference.Preference;
import com.vk.network.proxy.verifier.VkProxyPoll;

/* compiled from: VkProxyVerifiers.kt */
/* loaded from: classes.dex */
public final class hdv0 implements qev0 {
    public final cj00 b;
    public final pev0 c;

    public hdv0(cj00 cj00Var, pev0 pev0Var) {
        this.b = cj00Var;
        this.c = pev0Var;
    }

    @Override // xsna.qev0
    public final VkProxyPoll d() {
        cj00 cj00Var = this.b;
        return (!this.c.a.a.invoke().booleanValue() || Preference.d("NetworkProxy", "proxy_user_state_changed", false)) ? cj00Var.a("vk.ru") ? VkProxyPoll.ERROR : !enj.n(cj00Var.a) ? VkProxyPoll.CANCEL : VkProxyPoll.NEXT : VkProxyPoll.SUCCESS;
    }
}
