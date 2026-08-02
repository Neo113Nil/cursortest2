package xsna;

import com.vk.log.L;
import com.vk.network.proxy.VkProxyProvider;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class fev0 implements izs {
    public final /* synthetic */ VkProxyProvider b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkProxyProvider vkProxyProvider = this.b;
        ReentrantLock reentrantLock = vkProxyProvider.g;
        reentrantLock.lock();
        try {
            if (vkProxyProvider.f.compareTo(VkProxyProvider.State.Verification) <= 0) {
                L.e("New proxy configuration");
                int i = VkProxyProvider.a.$EnumSwitchMapping$1[vkProxyProvider.f.ordinal()];
                if (i == 1) {
                    vkProxyProvider.f();
                } else if (i == 2 || i == 3) {
                    vkProxyProvider.d();
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            return s3q0.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
