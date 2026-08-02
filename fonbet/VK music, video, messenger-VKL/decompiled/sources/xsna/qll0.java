package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: StorefrontContentUtils.kt */
/* loaded from: classes18.dex */
public final class qll0 implements d160 {
    public final /* synthetic */ rg50 b;
    public final /* synthetic */ rg50 c;
    public final /* synthetic */ rg50 d;
    public final /* synthetic */ mtk0<Boolean> e;

    /* compiled from: StorefrontContentUtils.kt */
    @b6l(c = "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontContentUtilsKt$rememberNestedScrollConnection$1$1", f = "StorefrontContentUtils.kt", l = {62, 70}, m = "onPostFling-RZ2iAVY")
    public static final class a extends ContinuationImpl {
        int I$0;
        int I$1;
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
            return qll0.this.m0(0L, 0L, this);
        }
    }

    public qll0(rg50 rg50Var, rg50 rg50Var2, rg50 rg50Var3, mtk0<Boolean> mtk0Var) {
        this.b = rg50Var;
        this.c = rg50Var2;
        this.d = rg50Var3;
        this.e = mtk0Var;
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        return 0L;
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        int intBitsToFloat = (int) Float.intBitsToFloat((int) (j & 4294967295L));
        boolean booleanValue = this.e.getValue().booleanValue();
        rg50 rg50Var = this.b;
        rg50Var.C(booleanValue ? 0 : swe0.g(rg50Var.getIntValue() + intBitsToFloat, -this.c.getIntValue(), 0));
        rg50 rg50Var2 = this.d;
        rg50Var2.C(rg50Var2.getIntValue() + intBitsToFloat);
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (xsna.nkn0.c(r1.getIntValue(), r4, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r7, r7, r8, 4) == r10) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        a aVar;
        int i;
        long j3;
        long j4;
        a aVar2;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                a aVar3 = aVar;
                Object obj = aVar3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar3.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (this.e.getValue().booleanValue()) {
                        j3 = j;
                        j4 = j2;
                        aVar2 = aVar3;
                    } else {
                        rg50 rg50Var = this.b;
                        int intValue = rg50Var.getIntValue();
                        rg50 rg50Var2 = this.c;
                        int i3 = intValue > (-rg50Var2.getIntValue()) / 2 ? 1 : 0;
                        int i4 = i3 != 0 ? 0 : -rg50Var2.getIntValue();
                        dtp0 d = jq2.d(250, 0, null, 6);
                        dv4 dv4Var = new dv4(rg50Var, 10);
                        j3 = j;
                        aVar3.J$0 = j3;
                        j4 = j2;
                        aVar3.J$1 = j4;
                        aVar3.I$0 = i3;
                        aVar3.I$1 = i4;
                        aVar3.label = 1;
                        aVar2 = aVar3;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    long j5 = aVar3.J$1;
                    long j6 = aVar3.J$0;
                    kotlin.a.a(obj);
                    j4 = j5;
                    aVar2 = aVar3;
                    j3 = j6;
                }
                long j7 = j3;
                long j8 = j4;
                aVar2.J$0 = j7;
                aVar2.J$1 = j8;
                aVar2.label = 2;
                Object m0 = super.m0(j7, j8, aVar2);
                return m0 != coroutineSingletons ? coroutineSingletons : m0;
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        a aVar32 = aVar;
        Object obj2 = aVar32.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar32.label;
        if (i != 0) {
        }
        long j72 = j3;
        long j82 = j4;
        aVar2.J$0 = j72;
        aVar2.J$1 = j82;
        aVar2.label = 2;
        Object m02 = super.m0(j72, j82, aVar2);
        if (m02 != coroutineSingletons2) {
        }
    }
}
