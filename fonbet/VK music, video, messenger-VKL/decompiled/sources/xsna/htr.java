package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: Limit.kt */
/* loaded from: classes11.dex */
public final class htr<T> implements lsr {
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ lsr<T> c;
    public final /* synthetic */ SuspendLambda d;

    /* compiled from: Limit.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, 35, 37}, m = "emit")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ htr<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(htr<? super T> htrVar, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = htrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public htr(Ref$BooleanRef ref$BooleanRef, lsr<? super T> lsrVar, wzs<? super T, ? super spj<? super Boolean>, ? extends Object> wzsVar) {
        this.b = ref$BooleanRef;
        this.c = lsrVar;
        this.d = (SuspendLambda) wzsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r6.c.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.lsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        htr<T> htrVar;
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
                    if (this.b.element) {
                        aVar.label = 1;
                    } else {
                        aVar.L$0 = this;
                        aVar.L$1 = t;
                        aVar.label = 2;
                        obj = this.d.invoke(t, aVar);
                        if (obj != coroutineSingletons) {
                            htrVar = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                t = (T) aVar.L$1;
                htrVar = (htr) aVar.L$0;
                kotlin.a.a(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return s3q0.a;
                }
                htrVar.b.element = true;
                lsr<T> lsrVar = htrVar.c;
                aVar.L$0 = null;
                aVar.L$1 = null;
                aVar.label = 3;
            }
        }
        aVar = new a(this, spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
    }
}
