package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes8.dex */
public final class y2q0<T> implements lsr<T> {
    public final kotlin.coroutines.d b;
    public final Object c;
    public final a d;

    /* compiled from: ChannelFlow.kt */
    @b6l(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<T, spj<? super s3q0>, Object> {
        final /* synthetic */ lsr<T> $downstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(lsr<? super T> lsrVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$downstream = lsrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$downstream, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((a) create(obj, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Object obj2 = this.L$0;
                lsr<T> lsrVar = this.$downstream;
                this.label = 1;
                if (lsrVar.emit(obj2, this) == coroutineSingletons) {
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

    public y2q0(lsr<? super T> lsrVar, kotlin.coroutines.d dVar) {
        this.b = dVar;
        this.c = dVar.fold(0, mqo0.b);
        this.d = new a(lsrVar, null);
    }

    @Override // xsna.lsr
    public final Object emit(T t, spj<? super s3q0> spjVar) {
        Object w = ao8.w(this.b, t, this.c, this.d, spjVar);
        return w == CoroutineSingletons.COROUTINE_SUSPENDED ? w : s3q0.a;
    }
}
