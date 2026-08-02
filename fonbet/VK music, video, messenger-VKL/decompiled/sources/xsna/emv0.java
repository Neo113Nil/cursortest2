package xsna;

import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkStepsDataSourceStore.kt */
@b6l(c = "com.vk.superapp.vksteps.data.store.VkStepsDataSourceStore$getSelectedDatasource$2", f = "VkStepsDataSourceStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class emv0 extends SuspendLambda implements wzs<yvj, spj<? super SelectedDataSource>, Object> {
    int label;
    final /* synthetic */ gmv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emv0(gmv0 gmv0Var, spj<? super emv0> spjVar) {
        super(2, spjVar);
        this.this$0 = gmv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new emv0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super SelectedDataSource> spjVar) {
        return ((emv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        try {
            tw8 tw8Var = this.this$0.a;
            qcy<Object> qcyVar = gmv0.b[0];
            return SelectedDataSource.valueOf(tw8Var.b());
        } catch (Throwable th) {
            xgx0 xgx0Var = xgx0.a;
            StringBuilder sb = new StringBuilder("VkStepsDataSourceStore.getSelectedDatasource() -> selectedDatasourcePrefProperty: ");
            tw8 tw8Var2 = this.this$0.a;
            qcy<Object> qcyVar2 = gmv0.b[0];
            sb.append(tw8Var2.b());
            sb.append(", thread: ");
            sb.append(Thread.currentThread().getName());
            String sb2 = sb.toString();
            xgx0Var.getClass();
            xgx0.c(sb2, th);
            return null;
        }
    }
}
