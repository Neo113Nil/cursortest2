package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WindowRecomposer.android.kt */
@b6l(c = "androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1", f = "WindowRecomposer.android.kt", l = {446}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ga30 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ttk0<Float> $durationScaleStateFlow;
    int label;
    final /* synthetic */ ha30 this$0;

    /* compiled from: WindowRecomposer.android.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ ha30 b;

        public a(ha30 ha30Var) {
            this.b = ha30Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            ((vak0) this.b.d).g(((Number) obj).floatValue());
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga30(ttk0<Float> ttk0Var, ha30 ha30Var, spj<? super ga30> spjVar) {
        super(2, spjVar);
        this.$durationScaleStateFlow = ttk0Var;
        this.this$0 = ha30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ga30(this.$durationScaleStateFlow, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ga30) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ttk0<Float> ttk0Var = this.$durationScaleStateFlow;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (ttk0Var.collect(aVar, this) == coroutineSingletons) {
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
