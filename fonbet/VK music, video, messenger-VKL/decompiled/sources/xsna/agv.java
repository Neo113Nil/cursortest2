package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.BaseAnalyticsSender;
import com.vk.push.core.feature.FeatureManager;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;

/* compiled from: HostAnalyticsSender.kt */
/* loaded from: classes.dex */
public final class agv extends BaseAnalyticsSender {
    public final hl20 e;
    public final fe6 f;

    /* compiled from: HostAnalyticsSender.kt */
    public static final class a extends Lambda implements izs<Throwable, s3q0> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
            return s3q0.a;
        }
    }

    /* compiled from: HostAnalyticsSender.kt */
    public static final class b extends Lambda implements izs<s3q0, s3q0> {
        final /* synthetic */ kq9<s3q0> $continuation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lq9 lq9Var) {
            super(1);
            this.$continuation = lq9Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(s3q0 s3q0Var) {
            kq9<s3q0> kq9Var = this.$continuation;
            s3q0 s3q0Var2 = s3q0.a;
            if (kq9Var.isActive()) {
                kq9Var.resumeWith(s3q0Var2);
            }
            return s3q0Var2;
        }
    }

    public agv(hl20 hl20Var, fe6 fe6Var, AnalyticsTimingsStore analyticsTimingsStore, FeatureManager featureManager, Logger logger) {
        super(featureManager, analyticsTimingsStore, logger.createLogger("HostAnalyticsSender"), null, 8, null);
        this.e = hl20Var;
        this.f = fe6Var;
    }

    @Override // com.vk.push.core.analytics.BaseAnalyticsSender
    public final Object getBaseParams(spj<? super Map<String, String>> spjVar) {
        return this.f.a(spjVar);
    }

    @Override // com.vk.push.core.analytics.BaseAnalyticsSender
    public final Object sendImpl(BaseAnalyticsEvent baseAnalyticsEvent, Map<String, String> map, spj<? super s3q0> spjVar) {
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        qz9.f(new yuj0(this.e.a(new jl20(baseAnalyticsEvent.getEventName(), map)), a.i), new b(lq9Var));
        Object n = lq9Var.n();
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }
}
