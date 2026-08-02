package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import xsna.awj;
import xsna.dzg0;
import xsna.epx;
import xsna.eyx;
import xsna.ezg0;
import xsna.i370;
import xsna.iyx;
import xsna.lsr;
import xsna.oco;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xqm0;

/* compiled from: SafeCollector.kt */
/* loaded from: classes11.dex */
public final class SafeCollector<T> extends ContinuationImpl implements lsr<T> {
    public final d collectContext;
    public final int collectContextSize;
    public final lsr<T> collector;
    private spj<? super s3q0> completion_;
    private d lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(lsr<? super T> lsrVar, d dVar) {
        super(i370.b, EmptyCoroutineContext.b);
        this.collector = lsrVar;
        this.collectContext = dVar;
        this.collectContextSize = ((Number) dVar.fold(0, new dzg0(0))).intValue();
    }

    public final Object a(spj<? super s3q0> spjVar, T t) {
        d context = spjVar.getContext();
        iyx.e(context);
        d dVar = this.lastEmissionContext;
        if (dVar != context) {
            if (dVar instanceof oco) {
                throw new IllegalStateException(xqm0.g("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((oco) dVar).c + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new wzs() { // from class: xsna.fzg0
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
                
                    if (r1 == null) goto L17;
                 */
                @Override // xsna.wzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
                    int intValue = ((Integer) obj).intValue();
                    d.b bVar = (d.b) obj2;
                    d.c<?> key = bVar.getKey();
                    d.b bVar2 = SafeCollector.this.collectContext.get(key);
                    if (key != eyx.a.b) {
                        if (bVar != bVar2) {
                            intValue = Integer.MIN_VALUE;
                        }
                        intValue++;
                    } else {
                        eyx eyxVar = (eyx) bVar2;
                        eyx eyxVar2 = (eyx) bVar;
                        while (true) {
                            if (eyxVar2 != null) {
                                if (eyxVar2 == eyxVar || !(eyxVar2 instanceof z9h0)) {
                                    break;
                                }
                                r9c r9cVar = (r9c) pyx.c.get((z9h0) eyxVar2);
                                eyxVar2 = r9cVar != null ? r9cVar.getParent() : null;
                            } else {
                                eyxVar2 = null;
                                break;
                            }
                        }
                        if (eyxVar2 != eyxVar) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + eyxVar2 + ", expected child of " + eyxVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                    }
                    return Integer.valueOf(intValue);
                }
            })).intValue() != this.collectContextSize) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.lastEmissionContext = context;
        }
        this.completion_ = spjVar;
        Object invoke = ezg0.a.invoke(this.collector, t, this);
        if (!epx.f(invoke, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.completion_ = null;
        }
        return invoke;
    }

    @Override // xsna.lsr
    public final Object emit(T t, spj<? super s3q0> spjVar) {
        try {
            Object a = a(spjVar, t);
            return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
        } catch (Throwable th) {
            this.lastEmissionContext = new oco(spjVar.getContext(), th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, xsna.awj
    public final awj getCallerFrame() {
        spj<? super s3q0> spjVar = this.completion_;
        if (spjVar instanceof awj) {
            return (awj) spjVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, xsna.spj
    public final d getContext() {
        d dVar = this.lastEmissionContext;
        return dVar == null ? EmptyCoroutineContext.b : dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable a = Result.a(obj);
        if (a != null) {
            this.lastEmissionContext = new oco(getContext(), a);
        }
        spj<? super s3q0> spjVar = this.completion_;
        if (spjVar != null) {
            spjVar.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
