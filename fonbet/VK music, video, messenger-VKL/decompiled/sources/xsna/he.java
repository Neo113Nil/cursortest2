package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* compiled from: Flow.kt */
/* loaded from: classes11.dex */
public abstract class he<T> implements ksr<T> {

    /* compiled from: Flow.kt */
    @b6l(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "collect")
    public static final class a extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ he<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(he<T> heVar, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = heVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.ksr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(lsr<? super T> lsrVar, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        Throwable th;
        SafeCollector safeCollector;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    SafeCollector safeCollector2 = new SafeCollector(lsrVar, aVar.getContext());
                    try {
                        aVar.L$0 = safeCollector2;
                        aVar.label = 1;
                        Object invoke = ((izg0) this).b.invoke(safeCollector2, aVar);
                        if (invoke != obj2) {
                            invoke = s3q0.a;
                        }
                        if (invoke == obj2) {
                            return obj2;
                        }
                        safeCollector = safeCollector2;
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    safeCollector = (SafeCollector) aVar.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                safeCollector.releaseIntercepted();
                return s3q0.a;
            }
        }
        aVar = new a(this, spjVar);
        Object obj3 = aVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        safeCollector.releaseIntercepted();
        return s3q0.a;
    }
}
