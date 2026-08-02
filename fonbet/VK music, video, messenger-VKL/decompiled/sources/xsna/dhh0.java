package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Scrollable.kt */
/* loaded from: classes11.dex */
public final class dhh0 implements d160 {
    public final zhh0 b;
    public boolean c;

    /* compiled from: Scrollable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {1008}, m = "onPostFling-RZ2iAVY", v = 1)
    public static final class a extends ContinuationImpl {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return dhh0.this.m0(0L, 0L, this);
        }
    }

    public dhh0(zhh0 zhh0Var, boolean z) {
        this.b = zhh0Var;
        this.c = z;
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        if (!this.c) {
            return 0L;
        }
        zhh0 zhh0Var = this.b;
        if (zhh0Var.a.a()) {
            return 0L;
        }
        return zhh0Var.h(zhh0Var.d(zhh0Var.a.d(zhh0Var.d(zhh0Var.g(j2)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        a aVar;
        int i;
        long j3;
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
                    j3 = 0;
                    if (this.c) {
                        zhh0 zhh0Var = this.b;
                        if (!zhh0Var.i) {
                            aVar.J$0 = j2;
                            aVar.label = 1;
                            obj = zhh0Var.a(j2, aVar);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        j3 = jmr0.d(j2, j3);
                    }
                    return new jmr0(j3);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = aVar.J$0;
                kotlin.a.a(obj);
                j3 = ((jmr0) obj).a;
                j3 = jmr0.d(j2, j3);
                return new jmr0(j3);
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        j3 = ((jmr0) obj2).a;
        j3 = jmr0.d(j2, j3);
        return new jmr0(j3);
    }
}
