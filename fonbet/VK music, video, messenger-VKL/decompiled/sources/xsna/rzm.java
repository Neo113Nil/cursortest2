package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DirectedScrollSpanBehavior.kt */
/* loaded from: classes3.dex */
public final class rzm implements d160 {
    public final /* synthetic */ szm b;

    /* compiled from: DirectedScrollSpanBehavior.kt */
    @b6l(c = "com.vk.music.playlist.framework.presentation.DirectedScrollSpanBehavior$nestedScrollConnection$1", f = "DirectedScrollSpanBehavior.kt", l = {111, 112}, m = "onPostFling-RZ2iAVY")
    public static final class a extends ContinuationImpl {
        long J$0;
        long J$1;
        long J$2;
        long J$3;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return rzm.this.m0(0L, 0L, this);
        }
    }

    public rzm(szm szmVar) {
        this.b = szmVar;
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        szm szmVar = this.b;
        y6p0 y6p0Var = szmVar.a;
        if (!szmVar.c.invoke().booleanValue()) {
            return 0L;
        }
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        float b = y6p0Var.b();
        y6p0Var.c(Float.intBitsToFloat(i2) + y6p0Var.b());
        if (b == y6p0Var.b()) {
            return 0L;
        }
        return ov70.a(2, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        szm szmVar = this.b;
        y6p0 y6p0Var = szmVar.a;
        if (!szmVar.c.invoke().booleanValue()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        ((vak0) y6p0Var.b).g(Float.intBitsToFloat(i2) + ((vak0) y6p0Var.b).getFloatValue());
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat(i2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float b = y6p0Var.b();
            y6p0Var.c(Float.intBitsToFloat(i2) + y6p0Var.b());
            float b2 = y6p0Var.b() - b;
            return (Float.floatToRawIntBits(b2) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
        }
        if (Float.intBitsToFloat(i2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Float.intBitsToFloat(i3) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ((vak0) y6p0Var.b).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (Float.intBitsToFloat(i3) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        float b3 = y6p0Var.b();
        y6p0Var.c(Float.intBitsToFloat(i3) + y6p0Var.b());
        float b4 = y6p0Var.b() - b3;
        return (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(b4) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        a aVar;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        rzm rzmVar;
        long j3;
        long j4;
        long j5;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                obj = aVar2.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    aVar2.J$0 = j;
                    aVar2.J$1 = j2;
                    aVar2.label = 1;
                    rzmVar = this;
                    obj = super.m0(j, j2, aVar2);
                    if (obj != coroutineSingletons) {
                        j3 = j;
                        j4 = j2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j5 = aVar2.J$3;
                    kotlin.a.a(obj);
                    return new jmr0(jmr0.e(j5, ((jmr0) obj).a));
                }
                j4 = aVar2.J$1;
                j3 = aVar2.J$0;
                kotlin.a.a(obj);
                rzmVar = this;
                long j6 = ((jmr0) obj).a;
                szm szmVar = rzmVar.b;
                y6p0 y6p0Var = szmVar.a;
                float c = jmr0.c(j3);
                float c2 = jmr0.c(j4);
                xmk0 xmk0Var = szmVar.b;
                aVar2.J$0 = j3;
                aVar2.J$1 = j4;
                aVar2.J$2 = j6;
                aVar2.J$3 = j6;
                aVar2.label = 2;
                obj = fdi.e(y6p0Var, c, c2, xmk0Var, aVar2);
                if (obj != coroutineSingletons) {
                    j5 = j6;
                    return new jmr0(jmr0.e(j5, ((jmr0) obj).a));
                }
                return coroutineSingletons;
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        a aVar22 = aVar;
        obj = aVar22.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar22.label;
        if (i != 0) {
        }
        long j62 = ((jmr0) obj).a;
        szm szmVar2 = rzmVar.b;
        y6p0 y6p0Var2 = szmVar2.a;
        float c3 = jmr0.c(j3);
        float c22 = jmr0.c(j4);
        xmk0 xmk0Var2 = szmVar2.b;
        aVar22.J$0 = j3;
        aVar22.J$1 = j4;
        aVar22.J$2 = j62;
        aVar22.J$3 = j62;
        aVar22.label = 2;
        obj = fdi.e(y6p0Var2, c3, c22, xmk0Var2, aVar22);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
