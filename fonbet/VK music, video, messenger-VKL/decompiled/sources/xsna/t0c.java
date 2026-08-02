package xsna;

import com.vk.push.core.feature.CommonFeaturesKt;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManager;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* compiled from: CheckServiceAliveInteractor.kt */
/* loaded from: classes5.dex */
public final class t0c {
    public final x0c a;
    public final FeatureManager b;
    public final hpj c;
    public volatile yok0 d;

    /* compiled from: CheckServiceAliveInteractor.kt */
    public static final class a {
        public static final C3710a c = new C3710a();
        public final boolean a;
        public final long b;

        /* compiled from: CheckServiceAliveInteractor.kt */
        /* renamed from: xsna.t0c$a$a, reason: collision with other inner class name */
        public static final class C3710a {
        }

        public a(boolean z, long j) {
            this.a = z;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return Long.hashCode(this.b) + (r0 * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ServiceAnalyticsConfig(isEnabled=");
            sb.append(this.a);
            sb.append(", checkIntervalMs=");
            return vu5.a(')', this.b, sb);
        }
    }

    public t0c(x0c x0cVar, FeatureManager featureManager) {
        bdn bdnVar = bdn.a;
        hpj a2 = zvj.a(wgl.c);
        this.a = x0cVar;
        this.b = featureManager;
        this.c = a2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(1:9)(2:22|23))(2:24|(1:26)(1:27))|10|11|12|13|(1:18)(2:15|16)))|28|6|(0)(0)|10|11|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        r6 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t0c t0cVar, ContinuationImpl continuationImpl) {
        u0c u0cVar;
        int i;
        a.C3710a c3710a;
        t0cVar.getClass();
        if (continuationImpl instanceof u0c) {
            u0cVar = (u0c) continuationImpl;
            int i2 = u0cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0cVar.label = i2 - Integer.MIN_VALUE;
                Object obj = u0cVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = u0cVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    a.C3710a c3710a2 = a.c;
                    FeatureManager featureManager = t0cVar.b;
                    Feature.StringFeature serviceActiveCheckConfig = CommonFeaturesKt.getServiceActiveCheckConfig();
                    u0cVar.L$0 = c3710a2;
                    u0cVar.label = 1;
                    Object featureValue = featureManager.getFeatureValue(serviceActiveCheckConfig, u0cVar);
                    if (featureValue == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = featureValue;
                    c3710a = c3710a2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3710a = (a.C3710a) u0cVar.L$0;
                    kotlin.a.a(obj);
                }
                String str = (String) obj;
                c3710a.getClass();
                JSONObject jSONObject = new JSONObject(str);
                Object failure = new a(jSONObject.getBoolean("is_enabled"), jSONObject.getLong("check_interval_ms"));
                return Result.a(failure) != null ? failure : new a(false, Long.MAX_VALUE);
            }
        }
        u0cVar = new u0c(t0cVar, continuationImpl);
        Object obj2 = u0cVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = u0cVar.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        c3710a.getClass();
        JSONObject jSONObject2 = new JSONObject(str2);
        Object failure2 = new a(jSONObject2.getBoolean("is_enabled"), jSONObject2.getLong("check_interval_ms"));
        if (Result.a(failure2) != null) {
        }
    }
}
