package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class z02 implements gho {
    public final a a;
    public final /* synthetic */ d12<Object> b;

    /* compiled from: AnchoredDraggable.kt */
    public static final class a implements pgo {
        public final /* synthetic */ d12<Object> a;

        public a(d12<Object> d12Var) {
            this.a = d12Var;
        }

        @Override // xsna.pgo
        public final void a(float f) {
            d12<Object> d12Var = this.a;
            d12Var.n.a(d12Var.f(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public z02(d12<Object> d12Var) {
        this.b = d12Var;
        this.a = new a(d12Var);
    }

    @Override // xsna.gho
    public final Object a(MutatePriority mutatePriority, wzs wzsVar, ContinuationImpl continuationImpl) {
        Object a2 = this.b.a(mutatePriority, new w02(this, wzsVar, null), continuationImpl);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }
}
