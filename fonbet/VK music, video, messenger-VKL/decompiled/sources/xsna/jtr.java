package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: Limit.kt */
/* loaded from: classes8.dex */
public final class jtr<T> implements lsr {
    public final /* synthetic */ Ref$IntRef b;
    public final /* synthetic */ lsr<T> c;
    public final /* synthetic */ Object d;

    /* compiled from: Limit.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {59, 61}, m = "emit")
    public static final class a extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ jtr<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(jtr<? super T> jtrVar, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = jtrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public jtr(Ref$IntRef ref$IntRef, lsr lsrVar, Object obj) {
        this.b = ref$IntRef;
        this.c = lsrVar;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r7.emit(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (xsna.ktr.a(r7, r6, r5.d, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.lsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, spj<? super s3q0> spjVar) {
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
                if (i == 0) {
                    if (i == 1) {
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                Ref$IntRef ref$IntRef = this.b;
                int i3 = ref$IntRef.element + 1;
                ref$IntRef.element = i3;
                lsr<T> lsrVar = this.c;
                if (i3 < 1) {
                    aVar.label = 1;
                } else {
                    aVar.label = 2;
                }
                return coroutineSingletons;
            }
        }
        aVar = new a(this, spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i == 0) {
        }
    }
}
