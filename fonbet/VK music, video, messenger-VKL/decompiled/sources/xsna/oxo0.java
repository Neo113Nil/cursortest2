package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: Timeout.kt */
/* loaded from: classes8.dex */
public final class oxo0 {

    /* compiled from: Timeout.kt */
    @b6l(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {102}, m = "withTimeoutOrNull")
    public static final class a<T> extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return oxo0.c(0L, null, this);
        }
    }

    public static final <U, T extends U> Object a(nxo0<U, ? super T> nxo0Var, wzs<? super yvj, ? super spj<? super T>, ? extends Object> wzsVar) {
        iyx.g(nxo0Var, new ygn(qsl.d(nxo0Var.e.getContext()).J(nxo0Var.f, nxo0Var, nxo0Var.d)));
        return e2l.c(nxo0Var, false, nxo0Var, wzsVar);
    }

    public static final Object b(long j, wzs wzsVar, ContinuationImpl continuationImpl) {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object a2 = a(new nxo0(j, continuationImpl), wzsVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, xsna.nxo0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object c(long j, wzs<? super yvj, ? super spj<? super T>, ? extends Object> wzsVar, spj<? super T> spjVar) {
        a aVar;
        int i;
        Ref$ObjectRef ref$ObjectRef;
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
                    if (j <= 0) {
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    try {
                        aVar.L$0 = wzsVar;
                        aVar.L$1 = ref$ObjectRef2;
                        aVar.J$0 = j;
                        aVar.label = 1;
                        ?? r2 = (T) new nxo0(j, aVar);
                        ref$ObjectRef2.element = r2;
                        Object a2 = a(r2, wzsVar);
                        return a2 == coroutineSingletons ? coroutineSingletons : a2;
                    } catch (TimeoutCancellationException e) {
                        e = e;
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) aVar.L$1;
                    try {
                        kotlin.a.a(obj);
                        return obj;
                    } catch (TimeoutCancellationException e2) {
                        e = e2;
                    }
                }
                if (e.b != ref$ObjectRef.element) {
                    return null;
                }
                throw e;
            }
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        if (e.b != ref$ObjectRef.element) {
        }
    }
}
