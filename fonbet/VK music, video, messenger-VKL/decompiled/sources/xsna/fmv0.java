package xsna;

import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkStepsDataSourceStore.kt */
@b6l(c = "com.vk.superapp.vksteps.data.store.VkStepsDataSourceStore$setSelectedDatasource$2", f = "VkStepsDataSourceStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class fmv0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ SelectedDataSource $selectedDataSource;
    int label;
    final /* synthetic */ gmv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmv0(gmv0 gmv0Var, SelectedDataSource selectedDataSource, spj<? super fmv0> spjVar) {
        super(2, spjVar);
        this.this$0 = gmv0Var;
        this.$selectedDataSource = selectedDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fmv0(this.this$0, this.$selectedDataSource, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fmv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        gmv0 gmv0Var = this.this$0;
        String obj2 = this.$selectedDataSource.toString();
        tw8 tw8Var = gmv0Var.a;
        qcy<Object> qcyVar = gmv0.b[0];
        tw8Var.g(obj2);
        return s3q0.a;
    }
}
