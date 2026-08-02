package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SnapshotFlow.kt */
@b6l(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {72, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class fbk0 extends SuspendLambda implements wzs<qhd0<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ kotlin.coroutines.d $context;
    final /* synthetic */ ksr<Object> $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: SnapshotFlow.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ qhd0<Object> b;

        public a(qhd0<Object> qhd0Var) {
            this.b = qhd0Var;
        }

        @Override // xsna.lsr
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            this.b.setValue(t);
            return s3q0.a;
        }
    }

    /* compiled from: SnapshotFlow.kt */
    @b6l(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ qhd0<Object> $$this$produceState;
        final /* synthetic */ ksr<Object> $this_collectAsState;
        int label;

        /* compiled from: SnapshotFlow.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ qhd0<Object> b;

            public a(qhd0<Object> qhd0Var) {
                this.b = qhd0Var;
            }

            @Override // xsna.lsr
            public final Object emit(T t, spj<? super s3q0> spjVar) {
                this.b.setValue(t);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ksr<Object> ksrVar, qhd0<Object> qhd0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$this_collectAsState = ksrVar;
            this.$$this$produceState = qhd0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$this_collectAsState, this.$$this$produceState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ksr<Object> ksrVar = this.$this_collectAsState;
                a aVar = new a(this.$$this$produceState);
                this.label = 1;
                if (ksrVar.collect(aVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbk0(kotlin.coroutines.d dVar, ksr<Object> ksrVar, spj<? super fbk0> spjVar) {
        super(2, spjVar);
        this.$context = dVar;
        this.$this_collectAsState = ksrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        fbk0 fbk0Var = new fbk0(this.$context, this.$this_collectAsState, spjVar);
        fbk0Var.L$0 = obj;
        return fbk0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(qhd0<Object> qhd0Var, spj<? super s3q0> spjVar) {
        return ((fbk0) create(qhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r1.collect(r2, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (xsna.myc0.k(r1, r3, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            qhd0 qhd0Var = (qhd0) this.L$0;
            if (epx.f(this.$context, EmptyCoroutineContext.b)) {
                ksr<Object> ksrVar = this.$this_collectAsState;
                a aVar = new a(qhd0Var);
                this.label = 1;
            } else {
                kotlin.coroutines.d dVar = this.$context;
                b bVar = new b(this.$this_collectAsState, qhd0Var, null);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
