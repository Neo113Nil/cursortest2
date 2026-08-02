package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.wml0;

/* compiled from: StorefrontServicesUtils.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesUtilsKt$handlePagination$1$1", f = "StorefrontServicesUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class wol0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<wml0, s3q0> $onAction;
    final /* synthetic */ boolean $shouldLoadMore;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: StorefrontServicesUtils.kt */
    @b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesUtilsKt$handlePagination$1$1$1", f = "StorefrontServicesUtils.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<wml0, s3q0> $onAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super wml0, s3q0> izsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$onAction, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onAction.invoke(wml0.c.b);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wol0(spj spjVar, izs izsVar, boolean z) {
        super(2, spjVar);
        this.$shouldLoadMore = z;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        wol0 wol0Var = new wol0(spjVar, this.$onAction, this.$shouldLoadMore);
        wol0Var.L$0 = obj;
        return wol0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wol0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$shouldLoadMore) {
            myc0.h(yvjVar, null, null, new a(this.$onAction, null), 3);
        }
        return s3q0.a;
    }
}
