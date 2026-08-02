package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SegmentedSlider.kt */
/* loaded from: classes2.dex */
public final class r0k0 implements gho {
    public final u5i0 a;
    public final wh50 b = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final p0k0 c = new p0k0(this);
    public final ni50 d = new ni50();

    public r0k0(u5i0 u5i0Var) {
        this.a = u5i0Var;
    }

    @Override // xsna.gho
    public final Object a(MutatePriority mutatePriority, wzs wzsVar, ContinuationImpl continuationImpl) {
        Object d = zvj.d(new n0k0(this, mutatePriority, wzsVar, null), continuationImpl);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
