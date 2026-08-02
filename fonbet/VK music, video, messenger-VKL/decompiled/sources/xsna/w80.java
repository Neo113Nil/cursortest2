package xsna;

import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.feature.CommonFeaturesKt;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.filedatastore.FileDataSource;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ActivityAnalyticsRepository.kt */
/* loaded from: classes5.dex */
public final class w80 {
    public final AnalyticsSender a;
    public final FeatureManager b;
    public final FileDataSource c;
    public final String d;
    public final hpj e;

    /* compiled from: ActivityAnalyticsRepository.kt */
    public static final class a {
        public final long a;
        public final List<Long> b;
        public final long c;

        public a(List list, long j, long j2) {
            this.a = j;
            this.b = list;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + fw3.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ServiceActiveAnalyticsModel(activeForMs=");
            sb.append(this.a);
            sb.append(", activityTimings=");
            sb.append(this.b);
            sb.append(", lastTimeEventSent=");
            return vu5.a(')', this.c, sb);
        }
    }

    public w80(AnalyticsSender analyticsSender, FeatureManager featureManager, FileDataSource fileDataSource, String str) {
        bdn bdnVar = bdn.a;
        hpj a2 = zvj.a(wgl.c);
        this.a = analyticsSender;
        this.b = featureManager;
        this.c = fileDataSource;
        this.d = str;
        this.e = a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(w80 w80Var, ContinuationImpl continuationImpl) {
        x80 x80Var;
        int i;
        TimeUnit timeUnit;
        w80Var.getClass();
        if (continuationImpl instanceof x80) {
            x80Var = (x80) continuationImpl;
            int i2 = x80Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x80Var.label = i2 - Integer.MIN_VALUE;
                Object obj = x80Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = x80Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    TimeUnit timeUnit2 = TimeUnit.MINUTES;
                    FeatureManager featureManager = w80Var.b;
                    Feature.IntFeature analyticsActiveCheckIntervalMinutes = CommonFeaturesKt.getAnalyticsActiveCheckIntervalMinutes();
                    x80Var.L$0 = timeUnit2;
                    x80Var.label = 1;
                    Object featureValue = featureManager.getFeatureValue(analyticsActiveCheckIntervalMinutes, x80Var);
                    if (featureValue == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = featureValue;
                    timeUnit = timeUnit2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    timeUnit = (TimeUnit) x80Var.L$0;
                    kotlin.a.a(obj);
                }
                return new Long(timeUnit.toMillis(((Number) obj).intValue()));
            }
        }
        x80Var = new x80(w80Var, continuationImpl);
        Object obj2 = x80Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = x80Var.label;
        if (i != 0) {
        }
        return new Long(timeUnit.toMillis(((Number) obj2).intValue()));
    }
}
