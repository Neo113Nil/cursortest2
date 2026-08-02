package xsna;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.pushsdk.VkpnsPushConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushMessagesReceiverFactory.kt */
/* loaded from: classes5.dex */
public final class bke0 {
    public static final bpn0 a = new bpn0(b.i);
    public static final bpn0 b = new bpn0(a.i);

    /* compiled from: PushMessagesReceiverFactory.kt */
    public static final class a extends Lambda implements gzs<zje0> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final zje0 invoke() {
            Logger defaultLogger;
            Logger defaultLogger2;
            a2p0 a2p0Var = (a2p0) bke0.a.getValue();
            ske0 c = mwk.c();
            Logger logger = v6g0.a;
            don0 f = v6g0.f();
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            long j = vkpnsPushConfig.e;
            VkpnsPushConfig vkpnsPushConfig2 = qxi.b;
            if (vkpnsPushConfig2 == null || (defaultLogger = vkpnsPushConfig2.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            VkpnsPushConfig vkpnsPushConfig3 = qxi.b;
            if (vkpnsPushConfig3 == null || (defaultLogger2 = vkpnsPushConfig3.c) == null) {
                defaultLogger2 = new DefaultLogger("VkpnsPushProviderSdk");
            }
            return new h4w0(defaultLogger, new j4w0(defaultLogger2, a2p0Var, (u8x0) v6g0.d.getValue()), j, c, f);
        }
    }

    /* compiled from: PushMessagesReceiverFactory.kt */
    public static final class b extends Lambda implements gzs<r5w0> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final r5w0 invoke() {
            Logger defaultLogger;
            ske0 c = mwk.c();
            g790 a = mwk.a();
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            return new r5w0(c, a, defaultLogger);
        }
    }

    public static d5w0 a(pk70 pk70Var) {
        Logger defaultLogger;
        Logger defaultLogger2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(b());
        if (pk70Var != null) {
            arrayList.add(pk70Var);
        }
        VkpnsPushConfig vkpnsPushConfig = qxi.b;
        if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
            defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
        }
        Logger logger = defaultLogger;
        VkpnsPushConfig vkpnsPushConfig2 = qxi.b;
        if (vkpnsPushConfig2 == null || (defaultLogger2 = vkpnsPushConfig2.c) == null) {
            defaultLogger2 = new DefaultLogger("VkpnsPushProviderSdk");
        }
        f920 f920Var = new f920(arrayList, defaultLogger2);
        Logger logger2 = ycx.a;
        vie0 vie0Var = (vie0) ycx.c.getValue();
        ske0 c = mwk.c();
        Logger logger3 = v6g0.a;
        AnalyticsSender a2 = v6g0.a();
        don0 f = v6g0.f();
        sul a3 = yfq0.a();
        v6g0.e();
        return new d5w0(new bz8(f920Var, vie0Var, c, f, a2, a3, new dqz0(mwk.b()), (ly1) v6g0.B.getValue(), (tje0) v6g0.A.getValue(), v6g0.c(), logger));
    }

    public static zje0 b() {
        return (zje0) b.getValue();
    }
}
