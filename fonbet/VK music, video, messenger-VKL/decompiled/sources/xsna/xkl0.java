package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StorefrontAlbumsSuccess.kt */
@b6l(c = "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsSuccessKt$HandlePagination$1$1", f = "StorefrontAlbumsSuccess.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class xkl0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $onPaginationScrollTrigger;
    final /* synthetic */ boolean $shouldLoadMore;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: StorefrontAlbumsSuccess.kt */
    @b6l(c = "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsSuccessKt$HandlePagination$1$1$1", f = "StorefrontAlbumsSuccess.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<s3q0> $onPaginationScrollTrigger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gzs<s3q0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$onPaginationScrollTrigger = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$onPaginationScrollTrigger, spjVar);
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
            this.$onPaginationScrollTrigger.invoke();
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkl0(boolean z, gzs<s3q0> gzsVar, spj<? super xkl0> spjVar) {
        super(2, spjVar);
        this.$shouldLoadMore = z;
        this.$onPaginationScrollTrigger = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xkl0 xkl0Var = new xkl0(this.$shouldLoadMore, this.$onPaginationScrollTrigger, spjVar);
        xkl0Var.L$0 = obj;
        return xkl0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xkl0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
            myc0.h(yvjVar, null, null, new a(this.$onPaginationScrollTrigger, null), 3);
        }
        return s3q0.a;
    }
}
