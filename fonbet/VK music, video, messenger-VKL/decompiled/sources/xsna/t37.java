package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Binder.kt */
@b6l(c = "com.vk.mvi.binder.compose.BinderKt$Events$2$1$job$1", f = "Binder.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class t37 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ a47<Object> $binderScope;
    final /* synthetic */ yzs<z37<Object>, Object, spj<? super s3q0>, Object> $events;
    final /* synthetic */ wh50<ksr<Object>> $eventsFlow$delegate;
    int label;

    /* compiled from: Binder.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ yzs<z37<Object>, Object, spj<? super s3q0>, Object> b;
        public final /* synthetic */ a47<Object> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(yzs<? super z37<Object>, Object, ? super spj<? super s3q0>, ? extends Object> yzsVar, a47<Object> a47Var) {
            this.b = yzsVar;
            this.c = a47Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            bdn bdnVar = bdn.a;
            Object k = myc0.k(ie00.a.U(), new s37(this.b, this.c, (pk50) obj, null), spjVar);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t37(wh50<ksr<Object>> wh50Var, yzs<? super z37<Object>, Object, ? super spj<? super s3q0>, ? extends Object> yzsVar, a47<Object> a47Var, spj<? super t37> spjVar) {
        super(2, spjVar);
        this.$eventsFlow$delegate = wh50Var;
        this.$events = yzsVar;
        this.$binderScope = a47Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new t37(this.$eventsFlow$delegate, this.$events, this.$binderScope, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((t37) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ksr<Object> value = this.$eventsFlow$delegate.getValue();
            if (value != null) {
                a aVar = new a(this.$events, this.$binderScope);
                this.label = 1;
                if (value.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
