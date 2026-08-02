package ru.rustore.sdk.pushclient.f;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.BaseAnalyticsSender;
import com.vk.push.core.feature.FeatureManager;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.pushclient.k.c;
import xsna.hl20;
import xsna.izs;
import xsna.jl20;
import xsna.kq9;
import xsna.lq9;
import xsna.qz9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.yuj0;

/* loaded from: classes9.dex */
public final class a extends BaseAnalyticsSender {
    public final hl20 e;
    public final c f;

    /* renamed from: ru.rustore.sdk.pushclient.f.a$a, reason: collision with other inner class name */
    public static final class C2402a extends Lambda implements izs<Throwable, s3q0> {
        public static final C2402a i = new C2402a();

        public C2402a() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            return s3q0.a;
        }
    }

    public static final class b extends Lambda implements izs<s3q0, s3q0> {
        public final /* synthetic */ kq9<s3q0> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lq9 lq9Var) {
            super(1);
            this.a = lq9Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(s3q0 s3q0Var) {
            kq9<s3q0> kq9Var = this.a;
            s3q0 s3q0Var2 = s3q0.a;
            if (kq9Var.isActive()) {
                kq9Var.resumeWith(s3q0Var2);
            }
            return s3q0Var2;
        }
    }

    public a(hl20 hl20Var, c cVar, AnalyticsTimingsStore analyticsTimingsStore, FeatureManager featureManager, Logger logger) {
        super(featureManager, analyticsTimingsStore, logger.createLogger("ClientAnalyticsSender"), null, 8, null);
        this.e = hl20Var;
        this.f = cVar;
    }

    @Override // com.vk.push.core.analytics.BaseAnalyticsSender
    public final Object getBaseParams(spj<? super Map<String, String>> spjVar) {
        return this.f.a(spjVar);
    }

    @Override // com.vk.push.core.analytics.BaseAnalyticsSender
    public final Object sendImpl(BaseAnalyticsEvent baseAnalyticsEvent, Map<String, String> map, spj<? super s3q0> spjVar) {
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        qz9.f(new yuj0(this.e.a(new jl20(baseAnalyticsEvent.getEventName(), map)), C2402a.i), new b(lq9Var));
        Object n = lq9Var.n();
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }
}
