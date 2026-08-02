package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;

/* compiled from: Blur.kt */
/* loaded from: classes11.dex */
public final class tg7 extends Lambda implements izs<tdu, s3q0> {
    final /* synthetic */ boolean $clip;
    final /* synthetic */ r5j0 $edgeTreatment = androidx.compose.ui.graphics.e.a;
    final /* synthetic */ float $radiusX;
    final /* synthetic */ float $radiusY;
    final /* synthetic */ int $tileMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg7(float f, float f2, int i, boolean z) {
        super(1);
        this.$radiusX = f;
        this.$radiusY = f2;
        this.$tileMode = i;
        this.$clip = z;
    }

    @Override // xsna.izs
    public final s3q0 invoke(tdu tduVar) {
        tdu tduVar2 = tduVar;
        float I0 = tduVar2.I0(this.$radiusX);
        float I02 = tduVar2.I0(this.$radiusY);
        tduVar2.s((I0 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || I02 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? null : new qg7(I0, I02, this.$tileMode));
        r5j0 r5j0Var = this.$edgeTreatment;
        if (r5j0Var == null) {
            r5j0Var = androidx.compose.ui.graphics.e.a;
        }
        tduVar2.X(r5j0Var);
        tduVar2.f(this.$clip);
        return s3q0.a;
    }
}
