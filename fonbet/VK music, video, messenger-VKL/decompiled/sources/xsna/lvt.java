package xsna;

import com.vk.superapp.health.js.bridge.api.events.GetSteps$Parameters;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetStepsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsHealthConnectDelegate$execute$1", f = "GetStepsHealthConnectDelegate.kt", l = {130, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class lvt extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ GetSteps$Parameters $params;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ kvt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvt(kvt kvtVar, GetSteps$Parameters getSteps$Parameters, String str, spj<? super lvt> spjVar) {
        super(1, spjVar);
        this.this$0 = kvtVar;
        this.$params = getSteps$Parameters;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new lvt(this.this$0, this.$params, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((lvt) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (xsna.kvt.c(r4, r5, r6, r8, r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        if (r12.a(r1, r11) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long g;
        long currentTimeMillis;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            gmv0 gmv0Var = this.this$0.h;
            SelectedDataSource selectedDataSource = SelectedDataSource.HEALTH_CONNECT;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        kvt kvtVar = this.this$0;
        String c = this.$params.c();
        zrp zrpVar = kvt.o;
        kvtVar.getClass();
        Long i2 = qvo0.i(qvo0.a, c);
        if (i2 != null) {
            currentTimeMillis = qvo0.b(i2.longValue());
            g = qvo0.e(i2.longValue());
            if (currentTimeMillis > System.currentTimeMillis()) {
                currentTimeMillis = System.currentTimeMillis();
            }
        } else {
            g = qvo0.g();
            currentTimeMillis = System.currentTimeMillis();
        }
        Pair pair = new Pair(Long.valueOf(g), Long.valueOf(currentTimeMillis));
        long longValue = ((Number) pair.d()).longValue();
        long longValue2 = ((Number) pair.g()).longValue();
        kvt kvtVar2 = this.this$0;
        String str = this.$requestId;
        this.label = 2;
    }
}
