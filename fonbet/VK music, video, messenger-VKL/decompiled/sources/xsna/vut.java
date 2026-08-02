package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.health.js.bridge.api.events.GetSteps$Parameters;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetStepsGoogleFitDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsGoogleFitDelegate$executeInternal$1", f = "GetStepsGoogleFitDelegate.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class vut extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ GetSteps$Parameters $params;
    final /* synthetic */ String $requestId;
    Object L$0;
    int label;
    final /* synthetic */ uut this$0;

    /* compiled from: GetStepsGoogleFitDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileServicesType.values().length];
            try {
                iArr[MobileServicesType.GOOGLE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileServicesType.HUAWEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileServicesType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vut(uut uutVar, FragmentActivity fragmentActivity, GetSteps$Parameters getSteps$Parameters, String str, spj<? super vut> spjVar) {
        super(1, spjVar);
        this.this$0 = uutVar;
        this.$activity = fragmentActivity;
        this.$params = getSteps$Parameters;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new vut(this.this$0, this.$activity, this.$params, this.$requestId, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((vut) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
    
        if (xsna.uut.c(r4, r5, r6, r8, r10, r12) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r13.a(r1, r12) == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SelectedDataSource selectedDataSource;
        SelectedDataSource selectedDataSource2;
        long g;
        long currentTimeMillis;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            int i2 = a.$EnumSwitchMapping$0[this.this$0.e.h(this.$activity).ordinal()];
            if (i2 == 1) {
                selectedDataSource = SelectedDataSource.GOOGLE_FIT;
            } else if (i2 == 2) {
                selectedDataSource = SelectedDataSource.HUAWEI_HEALTH;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                selectedDataSource = SelectedDataSource.UNKNOWN;
            }
            selectedDataSource2 = selectedDataSource;
            gmv0 gmv0Var = this.this$0.g;
            this.L$0 = selectedDataSource2;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            selectedDataSource2 = (SelectedDataSource) this.L$0;
            kotlin.a.a(obj);
        }
        SelectedDataSource selectedDataSource3 = selectedDataSource2;
        uut uutVar = this.this$0;
        String c = this.$params.c();
        zrp zrpVar = uut.j;
        uutVar.getClass();
        Long i3 = qvo0.i(qvo0.a, c);
        if (i3 != null) {
            currentTimeMillis = qvo0.b(i3.longValue());
            g = qvo0.e(i3.longValue());
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
        uut uutVar2 = this.this$0;
        String str = this.$requestId;
        this.L$0 = null;
        this.label = 2;
    }
}
