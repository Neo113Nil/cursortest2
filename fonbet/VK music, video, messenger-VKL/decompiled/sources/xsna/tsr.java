package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Channels.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class tsr {

    /* compiled from: Channels.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return tsr.a(null, null, false, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:12:0x0034, B:14:0x0061, B:20:0x0076, B:22:0x007e, B:32:0x0052, B:35:0x005d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xsna.lsr] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0090 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object a(lsr<? super T> lsrVar, b9f0<? extends T> b9f0Var, boolean z, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        o0b<? extends T> it;
        o0b<? extends T> o0bVar;
        ?? r2;
        Object a2;
        try {
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
                        if (lsrVar instanceof cso0) {
                            throw ((cso0) lsrVar).b;
                        }
                        it = b9f0Var.iterator();
                        aVar.L$0 = lsrVar;
                        aVar.L$1 = b9f0Var;
                        aVar.L$2 = it;
                        aVar.Z$0 = z;
                        aVar.label = 1;
                        a2 = it.a(aVar);
                        if (a2 != coroutineSingletons) {
                        }
                    } else if (i == 1) {
                        z = aVar.Z$0;
                        o0bVar = (o0b) aVar.L$2;
                        b9f0Var = (b9f0) aVar.L$1;
                        lsr lsrVar2 = (lsr) aVar.L$0;
                        kotlin.a.a(obj);
                        r2 = lsrVar2;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = aVar.Z$0;
                        o0bVar = (o0b) aVar.L$2;
                        b9f0Var = (b9f0) aVar.L$1;
                        lsr<? super T> lsrVar3 = (lsr) aVar.L$0;
                        kotlin.a.a(obj);
                        lsr<? super T> lsrVar4 = lsrVar3;
                        it = o0bVar;
                        lsrVar = lsrVar4;
                        aVar.L$0 = lsrVar;
                        aVar.L$1 = b9f0Var;
                        aVar.L$2 = it;
                        aVar.Z$0 = z;
                        aVar.label = 1;
                        a2 = it.a(aVar);
                        if (a2 != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        r2 = lsrVar;
                        o0bVar = it;
                        obj = a2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                b9f0Var.b(null);
                            }
                            return s3q0.a;
                        }
                        T next = o0bVar.next();
                        aVar.L$0 = r2;
                        aVar.L$1 = b9f0Var;
                        aVar.L$2 = o0bVar;
                        aVar.Z$0 = z;
                        aVar.label = 2;
                        Object emit = r2.emit(next, aVar);
                        lsrVar4 = r2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
    }
}
