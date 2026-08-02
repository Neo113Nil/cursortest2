package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ServicesItem.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.ServicesItemKt$ListServiceItem$1$1", f = "ServicesItem.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class bsi0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<wml0, s3q0> $onAction;
    final /* synthetic */ zni0 $service;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bsi0(izs<? super wml0, s3q0> izsVar, zni0 zni0Var, spj<? super bsi0> spjVar) {
        super(2, spjVar);
        this.$onAction = izsVar;
        this.$service = zni0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new bsi0(this.$onAction, this.$service, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((bsi0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onAction.invoke(new xml0(this.$service.a));
        return s3q0.a;
    }
}
