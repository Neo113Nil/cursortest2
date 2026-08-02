package xsna;

import android.content.Context;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.network.PusherHostProvider;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Lambda;
import okhttp3.Interceptor;

/* compiled from: NetworkModule.kt */
/* loaded from: classes.dex */
public final class o460 {
    public static final bpn0 a = new bpn0(c.i);
    public static final bpn0 b = new bpn0(b.i);
    public static final bpn0 c = new bpn0(a.i);
    public static final bpn0 d = new bpn0(d.i);
    public static final bpn0 e = new bpn0(e.i);

    /* compiled from: NetworkModule.kt */
    public static final class a extends Lambda implements gzs<HttpClient> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final HttpClient invoke() {
            Logger defaultLogger;
            BaseHttpHeadersHolder baseHttpHeadersHolder = (BaseHttpHeadersHolder) o460.b.getValue();
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            Logger logger = defaultLogger;
            VkpnsPushConfig vkpnsPushConfig2 = qxi.b;
            if (vkpnsPushConfig2 == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig2.a.getApplicationContext();
            Logger logger2 = v6g0.a;
            return new HttpClient(0, 0, baseHttpHeadersHolder, null, null, applicationContext, false, false, v6g0.b(), logger, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null);
        }
    }

    /* compiled from: NetworkModule.kt */
    public static final class b extends Lambda implements gzs<BaseHttpHeadersHolder> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final BaseHttpHeadersHolder invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new BaseHttpHeadersHolder("host_sdk/7.4.0-rc01", vkpnsPushConfig.a.getApplicationContext().getPackageName(), null, 4, null);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: NetworkModule.kt */
    public static final class c extends Lambda implements gzs<okhttp3.o> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final okhttp3.o invoke() {
            hpt0 hpt0Var = new hpt0();
            bpn0 bpn0Var = o460.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null || vkpnsPushConfig.c == null) {
                new DefaultLogger("VkpnsPushProviderSdk");
            }
            return hpt0.j(hpt0Var, rl3.I(new Interceptor[]{null, ad0.j((BaseHttpHeadersHolder) o460.b.getValue())}));
        }
    }

    /* compiled from: NetworkModule.kt */
    public static final class d extends Lambda implements gzs<HttpClient> {
        public static final d i = new d(0);

        @Override // xsna.gzs
        public final HttpClient invoke() {
            Logger defaultLogger;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            BaseHttpHeadersHolder baseHttpHeadersHolder = new BaseHttpHeadersHolder("host_sdk/7.4.0-rc01", vkpnsPushConfig.a.getApplicationContext().getPackageName(), BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
            VkpnsPushConfig vkpnsPushConfig2 = qxi.b;
            if (vkpnsPushConfig2 == null || (defaultLogger = vkpnsPushConfig2.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            Logger logger = defaultLogger;
            VkpnsPushConfig vkpnsPushConfig3 = qxi.b;
            if (vkpnsPushConfig3 == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig3.a.getApplicationContext();
            Logger logger2 = v6g0.a;
            return new HttpClient(0, 0, baseHttpHeadersHolder, null, null, applicationContext, false, false, v6g0.b(), logger, 27, null);
        }
    }

    /* compiled from: NetworkModule.kt */
    public static final class e extends Lambda implements gzs<HttpClient> {
        public static final e i = new e(0);

        @Override // xsna.gzs
        public final HttpClient invoke() {
            Logger defaultLogger;
            BaseHttpHeadersHolder baseHttpHeadersHolder = (BaseHttpHeadersHolder) o460.b.getValue();
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            Logger logger = defaultLogger;
            VkpnsPushConfig vkpnsPushConfig2 = qxi.b;
            if (vkpnsPushConfig2 == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig2.a.getApplicationContext();
            Logger logger2 = v6g0.a;
            return new HttpClient(10000, 10000, baseHttpHeadersHolder, null, null, applicationContext, false, false, v6g0.b(), logger, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, null);
        }
    }

    public static MasterHostApi a() {
        HttpClient httpClient = (HttpClient) c.getValue();
        if (qxi.b != null) {
            return new MasterHostApi(httpClient, new PusherHostProvider(), null, 4, null);
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }
}
