package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StoreFlowExt.kt */
@b6l(c = "com.vk.mvi.flow.StoreFlowExtKt$asFlow$1", f = "StoreFlowExt.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class jil0 extends SuspendLambda implements wzs<zhd0<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<izs<Object, s3q0>, uic> $producer;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: StoreFlowExt.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((uic) this.receiver).clear();
            return s3q0.a;
        }
    }

    /* compiled from: StoreFlowExt.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Object, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Object obj) {
            ((zhd0) this.receiver).f(obj);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jil0(izs<? super izs<Object, s3q0>, ? extends uic> izsVar, spj<? super jil0> spjVar) {
        super(2, spjVar);
        this.$producer = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jil0 jil0Var = new jil0(this.$producer, spjVar);
        jil0Var.L$0 = obj;
        return jil0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<Object> zhd0Var, spj<? super s3q0> spjVar) {
        return ((jil0) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zhd0 zhd0Var = (zhd0) this.L$0;
            a aVar = new a(0, this.$producer.invoke(new b(1, zhd0Var, zhd0.class, "trySend", "trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;", 8)), uic.class, "clear", "clear()V", 0);
            this.label = 1;
            if (phd0.a(zhd0Var, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
