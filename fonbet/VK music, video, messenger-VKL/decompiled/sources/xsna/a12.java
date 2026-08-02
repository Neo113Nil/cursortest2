package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes17.dex */
public final class a12 implements gho {
    public final a a;
    public final /* synthetic */ e12<Object> b;

    /* compiled from: AnchoredDraggable.kt */
    public static final class a implements pgo {
        public final /* synthetic */ e12<Object> a;

        public a(e12<Object> e12Var) {
            this.a = e12Var;
        }

        @Override // xsna.pgo
        public final void a(float f) {
            e12<Object> e12Var = this.a;
            e12Var.m.a(e12Var.f(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public a12(e12<Object> e12Var) {
        this.b = e12Var;
        this.a = new a(e12Var);
    }

    @Override // xsna.gho
    public final Object a(MutatePriority mutatePriority, wzs wzsVar, ContinuationImpl continuationImpl) {
        Object a2 = this.b.a(mutatePriority, new x02(this, wzsVar, null), continuationImpl);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }
}
