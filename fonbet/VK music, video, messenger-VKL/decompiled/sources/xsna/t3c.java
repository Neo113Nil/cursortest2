package xsna;

import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CheckoutContent.kt */
@b6l(c = "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutContentKt$CheckoutFormContent$3$1", f = "CheckoutContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class t3c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yvj $coroutineScope;
    final /* synthetic */ f5z $lifecycleOwner;
    final /* synthetic */ xvy $listState;
    final /* synthetic */ Object $scrollChannel;
    final /* synthetic */ v8s $state;
    final /* synthetic */ l5c $this_CheckoutFormContent;
    int label;

    /* compiled from: CheckoutContent.kt */
    @b6l(c = "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutContentKt$CheckoutFormContent$3$1$1$1", f = "CheckoutContent.kt", l = {201}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ xvy $listState;
        final /* synthetic */ h8c $patch;
        final /* synthetic */ l5c $this_CheckoutFormContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xvy xvyVar, int i, h8c h8cVar, l5c l5cVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$listState = xvyVar;
            this.$index = i;
            this.$patch = h8cVar;
            this.$this_CheckoutFormContent = l5cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$listState, this.$index, this.$patch, this.$this_CheckoutFormContent, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (!x3c.e(this.$listState, this.$index)) {
                    xvy xvyVar = this.$listState;
                    int i2 = this.$index;
                    this.label = 1;
                    if (xvyVar.f(i2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            h8c h8cVar = this.$patch;
            if (h8cVar.b) {
                l5c l5cVar = this.$this_CheckoutFormContent;
                rwr rwrVar = (rwr) ((Map) ((zak0) l5cVar.a).getValue()).get(h8cVar.a);
                if (rwrVar != null) {
                    rwr.b(rwrVar);
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3c(Object obj, f5z f5zVar, v8s v8sVar, yvj yvjVar, xvy xvyVar, l5c l5cVar, spj<? super t3c> spjVar) {
        super(2, spjVar);
        this.$scrollChannel = obj;
        this.$lifecycleOwner = f5zVar;
        this.$state = v8sVar;
        this.$coroutineScope = yvjVar;
        this.$listState = xvyVar;
        this.$this_CheckoutFormContent = l5cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new t3c(this.$scrollChannel, this.$lifecycleOwner, this.$state, this.$coroutineScope, this.$listState, this.$this_CheckoutFormContent, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((t3c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ((wj50) this.$scrollChannel).a(new aa9(this.$state, this.$coroutineScope, this.$listState, this.$this_CheckoutFormContent, 1), this.$lifecycleOwner);
        return s3q0.a;
    }
}
