package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ContentProductsInlineActor.kt */
@b6l(c = "com.vk.ecomm.contentproducts.ContentProductsInlineActor$addToCart$1", f = "ContentProductsInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class hkj extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ hpd0 $productItem;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gkj this$0;

    /* compiled from: ContentProductsInlineActor.kt */
    @b6l(c = "com.vk.ecomm.contentproducts.ContentProductsInlineActor$addToCart$1$1", f = "ContentProductsInlineActor.kt", l = {292}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ hpd0 $productItem;
        int label;
        final /* synthetic */ gkj this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gkj gkjVar, hpd0 hpd0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = gkjVar;
            this.$productItem = hpd0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$productItem, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            xy2 a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                a = this.this$0.f.f.a(fkq0.a(this.$productItem.b), (int) this.$productItem.a, 1, null, null, null);
                iz2 A = yfb.A(a);
                this.label = 1;
                if (evj.p(A, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.this$0.f.b.c("ProductInContentBottomSheet");
            gkj gkjVar = this.this$0;
            rdi.y(gkjVar, new bi0(12, gkjVar, this.$productItem));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkj(gkj gkjVar, hpd0 hpd0Var, spj<? super hkj> spjVar) {
        super(2, spjVar);
        this.this$0 = gkjVar;
        this.$productItem = hpd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        hkj hkjVar = new hkj(this.this$0, this.$productItem, spjVar);
        hkjVar.L$0 = obj;
        return hkjVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hkj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        try {
            myc0.h(yvjVar, hqu0.b(), null, new a(this.this$0, this.$productItem, null), 2);
        } catch (Exception unused) {
            zvj.e(yvjVar);
        }
        return s3q0.a;
    }
}
