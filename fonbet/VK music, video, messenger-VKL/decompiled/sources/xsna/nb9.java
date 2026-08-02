package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Builders.kt */
/* loaded from: classes11.dex */
public final class nb9<T> extends tya<T> {
    public final SuspendLambda f;

    /* compiled from: Builders.kt */
    @b6l(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    public static final class a extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return nb9.this.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nb9(wzs<? super zhd0<? super T>, ? super spj<? super s3q0>, ? extends Object> wzsVar, kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        super(wzsVar, dVar, i, bufferOverflow);
        this.f = (SuspendLambda) wzsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.tya, xsna.sya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(zhd0<? super T> zhd0Var, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    aVar.L$0 = zhd0Var;
                    aVar.label = 1;
                    if (super.c(zhd0Var, aVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zhd0Var = (zhd0) aVar.L$0;
                    kotlin.a.a(obj);
                }
                if (zhd0Var.d()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return s3q0.a;
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        if (zhd0Var.d()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.tya, xsna.sya
    public final sya<T> f(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return new nb9(this.f, dVar, i, bufferOverflow);
    }
}
