package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BottomSheetLayout.kt */
/* loaded from: classes18.dex */
public final class qmn0<T> implements d160 {
    public final f12<T> b;

    /* compiled from: BottomSheetLayout.kt */
    @b6l(c = "com.vk.ecomm.cart.impl.common.ui.compose.SwipeWithinBottomSheetNestedScrollConnection", f = "BottomSheetLayout.kt", l = {361}, m = "onPostFling-RZ2iAVY")
    public static final class a extends ContinuationImpl {
        long J$0;
        long J$1;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return qmn0.this.m0(0L, 0L, this);
        }
    }

    /* compiled from: BottomSheetLayout.kt */
    @b6l(c = "com.vk.ecomm.cart.impl.common.ui.compose.SwipeWithinBottomSheetNestedScrollConnection", f = "BottomSheetLayout.kt", l = {350}, m = "onPreFling-QWom1Mo")
    public static final class b extends ContinuationImpl {
        float F$0;
        long J$0;
        int label;
        /* synthetic */ Object result;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return qmn0.this.M(0L, this);
        }
    }

    public qmn0(f12<T> f12Var) {
        this.b = f12Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(long j, spj<? super jmr0> spjVar) {
        b bVar;
        int i;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    float c = jmr0.c(j);
                    if (c < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f12<T> f12Var = this.b;
                        if (f12Var.f() > f12Var.c().e()) {
                            bVar.J$0 = j;
                            bVar.F$0 = c;
                            bVar.label = 1;
                            if (f12Var.h(c, bVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    j = 0;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = bVar.J$0;
                    kotlin.a.a(obj);
                }
                return new jmr0(j);
            }
        }
        bVar = new b((ContinuationImpl) spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        return new jmr0(j);
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i != 1) {
            return 0L;
        }
        float b2 = this.b.b(intBitsToFloat);
        return (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (4294967295L & Float.floatToRawIntBits(b2));
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        float b2 = this.b.b(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        return (4294967295L & Float.floatToRawIntBits(b2)) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
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
                    float c = jmr0.c(j2);
                    aVar.J$0 = j;
                    aVar.J$1 = j2;
                    aVar.label = 1;
                    if (this.b.h(c, aVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = aVar.J$1;
                    kotlin.a.a(obj);
                }
                return new jmr0(j2);
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        return new jmr0(j2);
    }
}
