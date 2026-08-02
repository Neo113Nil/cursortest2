package xsna;

import android.os.Parcelable;
import com.vk.push.core.base.AidlResult;
import com.vk.push.pushsdk.masterhost.ipc.HostAppInfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MasterSelectionComponentImpl.kt */
@b6l(c = "com.vk.push.pushsdk.domain.component.MasterSelectionComponentImpl$getHostInfo$1", f = "MasterSelectionComponentImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class hk10 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<AidlResult<? extends Parcelable>, s3q0> $onResult;
    int label;
    final /* synthetic */ nk10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hk10(nk10 nk10Var, izs<? super AidlResult<? extends Parcelable>, s3q0> izsVar, spj<? super hk10> spjVar) {
        super(2, spjVar);
        this.this$0 = nk10Var;
        this.$onResult = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hk10(this.this$0, this.$onResult, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hk10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        HostAppInfo.b bVar = HostAppInfo.Companion;
        String packageName = this.this$0.b.getPackageName();
        boolean isIgnoringBatteryOptimizations = this.this$0.b.isIgnoringBatteryOptimizations();
        bVar.getClass();
        this.$onResult.invoke(AidlResult.Companion.success(HostAppInfo.b.a(packageName, isIgnoringBatteryOptimizations)));
        return s3q0.a;
    }
}
