package xsna;

import android.content.Context;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.core.domain.usecase.GetInitializedHostPackagesUseCase;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;

/* compiled from: InteractorModule.kt */
/* loaded from: classes5.dex */
public final class ycx {
    public static final Logger a;
    public static final bpn0 b;
    public static final bpn0 c;
    public static final bpn0 d;

    /* compiled from: InteractorModule.kt */
    public static final class a extends Lambda implements gzs<t0c> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final t0c invoke() {
            Logger logger = yfq0.a;
            x0c x0cVar = new x0c((coi0) v6g0.H.getValue(), (w80) v6g0.I.getValue(), ycx.a);
            Logger logger2 = v6g0.a;
            return new t0c(x0cVar, v6g0.c());
        }
    }

    /* compiled from: InteractorModule.kt */
    public static final class b extends Lambda implements gzs<nj10> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final nj10 invoke() {
            Logger logger = ycx.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            Logger logger2 = v6g0.a;
            bk10 d = v6g0.d();
            bpn0 bpn0Var = o460.a;
            MasterHostApi a = o460.a();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Logger logger3 = yfq0.a;
            return new nj10(logger, applicationContext, d, v6g0.a(), (AnalyticsTimingsStore) v6g0.b.getValue(), a, concurrentHashMap, new lec(v6g0.g()), new wp9(v6g0.g()), new yiz(), yfq0.c(logger), new ok10(), new smy(), new GetInitializedHostPackagesUseCase(v6g0.e()), yfq0.b());
        }
    }

    /* compiled from: InteractorModule.kt */
    public static final class c extends Lambda implements gzs<aje0> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final aje0 invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new aje0(vkpnsPushConfig.a.getApplicationContext(), ycx.a);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    static {
        Logger defaultLogger;
        VkpnsPushConfig vkpnsPushConfig = qxi.b;
        if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
            defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
        }
        a = defaultLogger;
        b = new bpn0(b.i);
        c = new bpn0(c.i);
        d = new bpn0(a.i);
    }

    public static nj10 a() {
        return (nj10) b.getValue();
    }

    public static w5h0 b(Logger logger) {
        Logger logger2 = v6g0.a;
        ezx0 g = v6g0.g();
        Logger logger3 = yfq0.a;
        return new w5h0(g, new y6i(v6g0.g()), logger);
    }

    public static oqk0 c(Logger logger) {
        Logger logger2 = yfq0.a;
        ia80 ia80Var = new ia80((ugd0) v6g0.q.getValue());
        os9 os9Var = new os9(mwk.c(), 9);
        Logger logger3 = v6g0.a;
        return new oqk0(ia80Var, os9Var, v6g0.d(), logger);
    }

    public static StopPushServiceInteractor d(Logger logger) {
        ssr ssrVar = new ssr(Boolean.TRUE);
        Logger logger2 = yfq0.a;
        return new StopPushServiceInteractor(ssrVar, new os9(mwk.c(), 9), logger);
    }
}
