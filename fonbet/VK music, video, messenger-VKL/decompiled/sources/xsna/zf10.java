package xsna;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BasicMarquee.kt */
@b6l(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", l = {413}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class zf10 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ yf10 this$0;

    /* compiled from: BasicMarquee.kt */
    @b6l(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", l = {427, CommonGatewayClient.CODE_TOO_MANY_REQUESTS, 433, 433}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<Float, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ yf10 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yf10 yf10Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = yf10Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Float f, spj<? super s3q0> spjVar) {
            return ((a) create(f, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(1:(1:(1:(1:(2:7|8)(2:10|11))(3:12|13|14))(5:15|16|17|18|19))(1:31))(2:43|(2:45|46)(4:47|(1:49)(1:54)|50|(2:52|21)(1:53)))|32|33|34|35|36|37|(2:39|21)|18|19) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00d6, code lost:
        
            if (r15.e(r0, r14) != r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
        
            r12 = r14;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00f7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            iq2 a;
            Float f;
            a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Float f2 = (Float) this.L$0;
                if (f2 == null) {
                    return s3q0.a;
                }
                int i2 = this.this$0.p;
                float floatValue = f2.floatValue();
                yf10 yf10Var = this.this$0;
                int i3 = yf10Var.r;
                int i4 = yf10Var.q;
                dtp0 dtp0Var = new dtp0((int) Math.ceil(floatValue / (Math.abs(itl.f(yf10Var).z.I0(yf10Var.s)) / 1000.0f)), i4, luo.d);
                long j = ((-i4) + i3) * (-1);
                a = i2 == Integer.MAX_VALUE ? jq2.a(2, j, null, dtp0Var) : jq2.b(i2, dtp0Var, null, j, 4);
                if2<Float, sq2> if2Var = this.this$0.A;
                Float f3 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.L$0 = f2;
                this.L$1 = a;
                this.label = 1;
                if (if2Var.e(f3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                f = f2;
            } else if (i == 1) {
                a = (iq2) this.L$1;
                Float f4 = (Float) this.L$0;
                kotlin.a.a(obj);
                f = f4;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.L$0;
                    kotlin.a.a(obj);
                    throw th;
                }
                try {
                    kotlin.a.a(obj);
                    aVar = this;
                    if2<Float, sq2> if2Var2 = aVar.this$0.A;
                    Float f5 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    aVar.label = 3;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = this;
                    if2<Float, sq2> if2Var3 = aVar.this$0.A;
                    Float f6 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    aVar.L$0 = th;
                    aVar.L$1 = null;
                    aVar.label = 4;
                    if (if2Var3.e(f6, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    throw th;
                }
            }
            iq2 iq2Var = a;
            if2<Float, sq2> if2Var4 = this.this$0.A;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            aVar = this;
            obj = if2.c(if2Var4, f, iq2Var, null, aVar, 12);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            if2<Float, sq2> if2Var22 = aVar.this$0.A;
            Float f52 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            aVar.label = 3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf10(yf10 yf10Var, spj<? super zf10> spjVar) {
        super(2, spjVar);
        this.this$0 = yf10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zf10(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zf10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new enh(this.this$0, 26));
            a aVar = new a(this.this$0, null);
            this.label = 1;
            if (rsr.k(M, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
