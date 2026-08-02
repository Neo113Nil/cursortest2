package ru.rustore.sdk.pushclient.m;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import com.vk.push.core.network.http.HttpClient;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Lambda;
import xsna.aaz0;
import xsna.bpn0;
import xsna.gzs;
import xsna.s101;

/* loaded from: classes9.dex */
public final class g {
    public static final bpn0 a = new bpn0(b.i);
    public static final bpn0 b = new bpn0(a.i);
    public static final bpn0 c = new bpn0(c.i);

    public static final class a extends Lambda implements gzs<HttpClient> {
        public static final a i = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final HttpClient invoke() {
            Logger defaultLogger;
            BaseHttpHeadersHolder baseHttpHeadersHolder = (BaseHttpHeadersHolder) g.a.getValue();
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null || (defaultLogger = aaz0Var.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsClientSdk");
            }
            Logger logger = defaultLogger;
            aaz0 aaz0Var2 = s101.f;
            if (aaz0Var2 != null) {
                return new HttpClient(0, 0, baseHttpHeadersHolder, null, null, aaz0Var2.a.getApplicationContext(), false, false, (CrashReporterRepository) h.v.getValue(), logger, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    public static final class b extends Lambda implements gzs<BaseHttpHeadersHolder> {
        public static final b i = new b();

        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final BaseHttpHeadersHolder invoke() {
            aaz0 aaz0Var = s101.f;
            if (aaz0Var != null) {
                return new BaseHttpHeadersHolder("client_sdk/7.4.0-rc01", aaz0Var.a.getApplicationContext().getPackageName(), null, 4, null);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    public static final class c extends Lambda implements gzs<HttpClient> {
        public static final c i = new c();

        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final HttpClient invoke() {
            Logger defaultLogger;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            BaseHttpHeadersHolder baseHttpHeadersHolder = new BaseHttpHeadersHolder("client_sdk/7.4.0-rc01", aaz0Var.a.getApplicationContext().getPackageName(), BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
            aaz0 aaz0Var2 = s101.f;
            if (aaz0Var2 == null || (defaultLogger = aaz0Var2.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsClientSdk");
            }
            Logger logger = defaultLogger;
            aaz0 aaz0Var3 = s101.f;
            if (aaz0Var3 != null) {
                return new HttpClient(0, 0, baseHttpHeadersHolder, null, null, aaz0Var3.a.getApplicationContext(), false, false, (CrashReporterRepository) h.v.getValue(), logger, 27, null);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }
}
