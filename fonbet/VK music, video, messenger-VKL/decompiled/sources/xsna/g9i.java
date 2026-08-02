package xsna;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.pushsdk.VkpnsPushConfig;
import kotlin.jvm.internal.Lambda;

/* compiled from: ComponentModule.kt */
/* loaded from: classes5.dex */
public final class g9i {
    public static final Logger a;
    public static final bpn0 b;

    /* compiled from: ComponentModule.kt */
    public static final class a extends Lambda implements gzs<nhe0> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final nhe0 invoke() {
            Logger logger = g9i.a;
            Logger logger2 = ycx.a;
            vie0 vie0Var = (vie0) ycx.c.getValue();
            g790 a = mwk.a();
            fje0 b = mwk.b();
            ske0 c = mwk.c();
            Logger logger3 = v6g0.a;
            return new nhe0(vie0Var, a, b, c, v6g0.f(), logger, yfq0.a(), v6g0.b(), v6g0.a(), (AnalyticsTimingsStore) v6g0.b.getValue(), (u8x0) v6g0.d.getValue());
        }
    }

    static {
        Logger defaultLogger;
        VkpnsPushConfig vkpnsPushConfig = qxi.b;
        if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
            defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
        }
        a = defaultLogger;
        b = new bpn0(a.i);
    }

    public static nhe0 a() {
        return (nhe0) b.getValue();
    }
}
