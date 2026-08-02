package ru.rustore.sdk.pushclient.m;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.core.retry.RequestRetryComponent;
import kotlin.jvm.internal.Lambda;
import xsna.aaz0;
import xsna.bpn0;
import xsna.d4z0;
import xsna.gzs;
import xsna.iay0;
import xsna.iid;
import xsna.jay0;
import xsna.kvy0;
import xsna.miy0;
import xsna.p2z0;
import xsna.qzy0;
import xsna.s101;
import xsna.s9y0;
import xsna.x8z0;
import xsna.yoy0;

/* loaded from: classes9.dex */
public final class c {
    public static final Logger a;
    public static final bpn0 b;

    public static final class a extends Lambda implements gzs<ru.rustore.sdk.pushclient.a.a> {
        public static final a i = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final ru.rustore.sdk.pushclient.a.a invoke() {
            jay0 c = h.c();
            Logger logger = p.a;
            Logger logger2 = c.a;
            ru.rustore.sdk.pushclient.s.b bVar = new ru.rustore.sdk.pushclient.s.b(c, logger2);
            iid iidVar = new iid((yoy0) h.l.getValue());
            qzy0 qzy0Var = new qzy0(new x8z0(new n(1, null)));
            kvy0 kvy0Var = (kvy0) h.s.getValue();
            Logger logger3 = p.a;
            return new ru.rustore.sdk.pushclient.a.a(new b(1, null), c, bVar, iidVar, new p2z0(qzy0Var, new miy0(logger3, RequestRetryComponent.Companion.createDefaultBackOffForRequest()), kvy0Var, logger3), new d4z0((iay0) h.g.getValue(), (s9y0) h.c.getValue(), logger3), h.b(), (AnalyticsTimingsStore) h.p.getValue(), (ru.rustore.sdk.pushclient.k.b) h.e.getValue(), logger2);
        }
    }

    static {
        Logger defaultLogger;
        aaz0 aaz0Var = s101.f;
        if (aaz0Var == null || (defaultLogger = aaz0Var.c) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        a = defaultLogger;
        b = new bpn0(a.i);
    }
}
