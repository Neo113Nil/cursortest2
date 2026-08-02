package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TopAppBarScrollBehavior.kt */
/* loaded from: classes17.dex */
public final class f5q implements d160 {
    public final /* synthetic */ g5q b;

    /* compiled from: TopAppBarScrollBehavior.kt */
    @b6l(c = "com.vk.core.compose.component.topbar.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", f = "TopAppBarScrollBehavior.kt", l = {354, 355}, m = "onPostFling-RZ2iAVY")
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
            return f5q.this.m0(0L, 0L, this);
        }
    }

    public f5q(g5q g5qVar) {
        this.b = g5qVar;
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        g5q g5qVar = this.b;
        if (!g5qVar.d.invoke().booleanValue()) {
            return 0L;
        }
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        float b = g5qVar.a.b();
        x6p0 x6p0Var = g5qVar.a;
        x6p0Var.e(Float.intBitsToFloat(i2) + x6p0Var.b());
        if (b == g5qVar.a.b()) {
            return 0L;
        }
        return ov70.a(2, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        g5q g5qVar = this.b;
        if (!g5qVar.d.invoke().booleanValue()) {
            return 0L;
        }
        x6p0 x6p0Var = g5qVar.a;
        int i2 = (int) (j & 4294967295L);
        x6p0Var.d(Float.intBitsToFloat(i2) + ((Number) ((zak0) x6p0Var.a).getValue()).floatValue());
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat(i2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float b = g5qVar.a.b();
            x6p0 x6p0Var2 = g5qVar.a;
            x6p0Var2.e(Float.intBitsToFloat(i2) + x6p0Var2.b());
            float b2 = g5qVar.a.b() - b;
            floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            floatToRawIntBits2 = Float.floatToRawIntBits(b2);
        } else {
            if (Float.intBitsToFloat(i2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Float.intBitsToFloat(i3) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                g5qVar.a.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (Float.intBitsToFloat(i3) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return 0L;
            }
            float b3 = g5qVar.a.b();
            x6p0 x6p0Var3 = g5qVar.a;
            x6p0Var3.e(Float.intBitsToFloat(i3) + x6p0Var3.b());
            float b4 = g5qVar.a.b() - b3;
            floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            floatToRawIntBits2 = Float.floatToRawIntBits(b4);
        }
        return (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r15 != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        a aVar;
        int i;
        long j3;
        f5q f5qVar;
        long j4;
        long j5;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    aVar2.J$0 = j;
                    aVar2.J$1 = j2;
                    aVar2.label = 1;
                    j3 = j;
                    obj = super.m0(j3, j2, aVar2);
                    f5qVar = this;
                    if (obj != coroutineSingletons) {
                        j4 = j2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j6 = aVar2.J$0;
                    kotlin.a.a(obj);
                    j5 = j6;
                    return new jmr0(jmr0.e(j5, ((jmr0) obj).a));
                }
                j4 = aVar2.J$1;
                long j7 = aVar2.J$0;
                kotlin.a.a(obj);
                j3 = j7;
                f5qVar = this;
                j5 = ((jmr0) obj).a;
                g5q g5qVar = f5qVar.b;
                x6p0 x6p0Var = g5qVar.a;
                float c = jmr0.c(j3);
                float c2 = jmr0.c(j4);
                l7l<Float> l7lVar = g5qVar.c;
                xmk0 xmk0Var = g5qVar.b;
                aVar2.J$0 = j5;
                aVar2.label = 2;
                obj = m200.B(x6p0Var, c, c2, l7lVar, xmk0Var, aVar2);
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        a aVar22 = aVar;
        Object obj2 = aVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar22.label;
        if (i != 0) {
        }
        j5 = ((jmr0) obj2).a;
        g5q g5qVar2 = f5qVar.b;
        x6p0 x6p0Var2 = g5qVar2.a;
        float c3 = jmr0.c(j3);
        float c22 = jmr0.c(j4);
        l7l<Float> l7lVar2 = g5qVar2.c;
        xmk0 xmk0Var2 = g5qVar2.b;
        aVar22.J$0 = j5;
        aVar22.label = 2;
        obj2 = m200.B(x6p0Var2, c3, c22, l7lVar2, xmk0Var2, aVar22);
    }
}
