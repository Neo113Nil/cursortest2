package xsna;

import com.vk.log.L;
import com.vk.network.proxy.verifier.VkProxyPoll;

/* compiled from: VkProxyCompositeVerifiers.kt */
/* loaded from: classes.dex */
public final class kev0 implements qev0 {
    public final qev0[] b;

    public kev0(qev0... qev0VarArr) {
        this.b = qev0VarArr;
    }

    @Override // xsna.qev0
    public final VkProxyPoll d() {
        for (qev0 qev0Var : this.b) {
            VkProxyPoll d = qev0Var.d();
            L.e("Proxy verification: Mode - Serial | Step - " + qjg.a(qev0Var) + " | Result - " + d);
            if (d != VkProxyPoll.NEXT) {
                return d;
            }
        }
        return VkProxyPoll.SUCCESS;
    }
}
