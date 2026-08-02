package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TopAppBarScrollBehavior.kt */
/* loaded from: classes17.dex */
public final class qmp implements d160 {
    public final /* synthetic */ rmp b;

    /* compiled from: TopAppBarScrollBehavior.kt */
    @b6l(c = "com.vk.core.compose.component.topbar.EnterAlwaysScrollBehavior$nestedScrollConnection$1", f = "TopAppBarScrollBehavior.kt", l = {259, 260}, m = "onPostFling-RZ2iAVY")
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
            return qmp.this.m0(0L, 0L, this);
        }
    }

    public qmp(rmp rmpVar) {
        this.b = rmpVar;
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        rmp rmpVar = this.b;
        x6p0 x6p0Var = rmpVar.a;
        if (!rmpVar.d.invoke().booleanValue()) {
            return 0L;
        }
        float b = x6p0Var.b();
        x6p0Var.e(Float.intBitsToFloat((int) (4294967295L & j)) + x6p0Var.b());
        if (b == x6p0Var.b()) {
            return 0L;
        }
        return ov70.a(2, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        rmp rmpVar = this.b;
        x6p0 x6p0Var = rmpVar.a;
        if (!rmpVar.d.invoke().booleanValue()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        x6p0Var.d(Float.intBitsToFloat(i2) + ((Number) ((zak0) x6p0Var.a).getValue()).floatValue());
        if ((x6p0Var.b() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || x6p0Var.b() == x6p0Var.c()) && Float.intBitsToFloat(i2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Float.intBitsToFloat((int) (j2 & 4294967295L)) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            x6p0Var.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        x6p0Var.e(Float.intBitsToFloat(i2) + x6p0Var.b());
        return 0L;
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
        qmp qmpVar;
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
                    qmpVar = this;
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
                qmpVar = this;
                j5 = ((jmr0) obj).a;
                rmp rmpVar = qmpVar.b;
                x6p0 x6p0Var = rmpVar.a;
                float c = jmr0.c(j3);
                float c2 = jmr0.c(j4);
                l7l<Float> l7lVar = rmpVar.c;
                iq2<Float> iq2Var = rmpVar.b;
                aVar2.J$0 = j5;
                aVar2.label = 2;
                obj = m200.B(x6p0Var, c, c2, l7lVar, iq2Var, aVar2);
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
        rmp rmpVar2 = qmpVar.b;
        x6p0 x6p0Var2 = rmpVar2.a;
        float c3 = jmr0.c(j3);
        float c22 = jmr0.c(j4);
        l7l<Float> l7lVar2 = rmpVar2.c;
        iq2<Float> iq2Var2 = rmpVar2.b;
        aVar22.J$0 = j5;
        aVar22.label = 2;
        obj2 = m200.B(x6p0Var2, c3, c22, l7lVar2, iq2Var2, aVar22);
    }
}
