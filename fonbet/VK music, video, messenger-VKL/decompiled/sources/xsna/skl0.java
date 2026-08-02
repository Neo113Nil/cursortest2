package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StorefrontAlbumsScreen.kt */
@b6l(c = "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsScreenKt$StorefrontAlbumsScreen$2$1", f = "StorefrontAlbumsScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class skl0 extends SuspendLambda implements yzs<z37<sjl0>, xjl0, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<xjl0, s3q0> $onEvent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public skl0(izs<? super xjl0, s3q0> izsVar, spj<? super skl0> spjVar) {
        super(3, spjVar);
        this.$onEvent = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<sjl0> z37Var, xjl0 xjl0Var, spj<? super s3q0> spjVar) {
        skl0 skl0Var = new skl0(this.$onEvent, spjVar);
        skl0Var.L$0 = xjl0Var;
        return skl0Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xjl0 xjl0Var = (xjl0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onEvent.invoke(xjl0Var);
        return s3q0.a;
    }
}
