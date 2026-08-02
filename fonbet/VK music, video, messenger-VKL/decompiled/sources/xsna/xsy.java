package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyLayoutItemAnimation.kt */
@b6l(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class xsy extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mdu $layer;
    final /* synthetic */ phr<Float> $spec;
    int label;
    final /* synthetic */ wsy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsy(wsy wsyVar, phr<Float> phrVar, mdu mduVar, spj<? super xsy> spjVar) {
        super(2, spjVar);
        this.this$0 = wsyVar;
        this.$spec = phrVar;
        this.$layer = mduVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xsy(this.this$0, this.$spec, this.$layer, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xsy) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xsy xsyVar;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            try {
                if2<Float, sq2> if2Var = this.this$0.p;
                Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                phr<Float> phrVar = this.$spec;
                n9 n9Var = new n9(12, this.$layer, this.this$0);
                this.label = 1;
                xsyVar = this;
                try {
                    if (if2.c(if2Var, f, phrVar, n9Var, xsyVar, 4) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    wsy wsyVar = xsyVar.this$0;
                    int i2 = wsy.t;
                    wsyVar.f(false);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                xsyVar = this;
                th = th;
                wsy wsyVar2 = xsyVar.this$0;
                int i22 = wsy.t;
                wsyVar2.f(false);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                kotlin.a.a(obj);
                xsyVar = this;
            } catch (Throwable th4) {
                th = th4;
                xsyVar = this;
                wsy wsyVar22 = xsyVar.this$0;
                int i222 = wsy.t;
                wsyVar22.f(false);
                throw th;
            }
        }
        ((zak0) xsyVar.this$0.k).setValue(Boolean.TRUE);
        xsyVar.this$0.f(false);
        return s3q0.a;
    }
}
