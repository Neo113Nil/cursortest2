package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class b12 implements gho {
    public final a a;
    public final /* synthetic */ c12<Object> b;

    /* compiled from: AnchoredDraggable.kt */
    public static final class a implements pgo {
        public final /* synthetic */ c12<Object> a;

        public a(c12<Object> c12Var) {
            this.a = c12Var;
        }

        @Override // xsna.pgo
        public final void a(float f) {
            c12<Object> c12Var = this.a;
            s02 s02Var = c12Var.l;
            vak0 vak0Var = (vak0) c12Var.h;
            float f2 = swe0.f((Float.isNaN(vak0Var.getFloatValue()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : vak0Var.getFloatValue()) + f, c12Var.b().d(), c12Var.b().e());
            c12<Object> c12Var2 = s02Var.a;
            ((vak0) c12Var2.h).g(f2);
            ((vak0) c12Var2.i).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public b12(c12<Object> c12Var) {
        this.b = c12Var;
        this.a = new a(c12Var);
    }

    @Override // xsna.gho
    public final Object a(MutatePriority mutatePriority, wzs wzsVar, ContinuationImpl continuationImpl) {
        Object a2 = this.b.a(mutatePriority, new y02(this, wzsVar, null), continuationImpl);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }
}
