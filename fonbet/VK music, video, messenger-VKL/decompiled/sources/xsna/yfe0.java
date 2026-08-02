package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PullRefreshState.kt */
@b6l(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {196}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class yfe0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ zfe0 this$0;

    /* compiled from: PullRefreshState.kt */
    @b6l(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", l = {197}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ float $offset;
        int label;
        final /* synthetic */ zfe0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zfe0 zfe0Var, float f, spj<? super a> spjVar) {
            super(1, spjVar);
            this.this$0 = zfe0Var;
            this.$offset = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new a(this.this$0, this.$offset, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                float floatValue = ((vak0) this.this$0.e).getFloatValue();
                float f = this.$offset;
                f9h f9hVar = new f9h(this.this$0, 10);
                this.label = 1;
                if (nkn0.c(floatValue, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, f9hVar, this, 12) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfe0(zfe0 zfe0Var, float f, spj<? super yfe0> spjVar) {
        super(2, spjVar);
        this.this$0 = zfe0Var;
        this.$offset = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new yfe0(this.this$0, this.$offset, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((yfe0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zfe0 zfe0Var = this.this$0;
            ni50 ni50Var = zfe0Var.i;
            a aVar = new a(zfe0Var, this.$offset, null);
            this.label = 1;
            if (ni50Var.b(MutatePriority.Default, aVar, this) == coroutineSingletons) {
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
