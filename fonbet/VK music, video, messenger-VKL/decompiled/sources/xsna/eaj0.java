package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;

/* compiled from: MviEvents.kt */
@b6l(c = "com.vk.mvi.SharedFlowMviEvents$collect$1", f = "MviEvents.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class eaj0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<pk50, s3q0> $onEvent;
    int label;
    final /* synthetic */ faj0<pk50> this$0;

    /* compiled from: MviEvents.kt */
    public static final /* synthetic */ class a implements lsr, g0t {
        public final /* synthetic */ izs<pk50, s3q0> b;

        public a(izs<pk50, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            this.b.invoke((pk50) obj);
            s3q0 s3q0Var = s3q0.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s3q0Var;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lsr) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.b, epx.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/vk/mvi/MviEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaj0(faj0<pk50> faj0Var, izs<pk50, s3q0> izsVar, spj<? super eaj0> spjVar) {
        super(2, spjVar);
        this.this$0 = faj0Var;
        this.$onEvent = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new eaj0(this.this$0, this.$onEvent, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((eaj0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 caj0Var = this.this$0.b;
            a aVar = new a(this.$onEvent);
            this.label = 1;
            caj0Var.getClass();
            if (caj0.k(caj0Var, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}
