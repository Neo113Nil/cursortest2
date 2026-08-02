package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InternalSlider.kt */
/* loaded from: classes17.dex */
public final class s0k0 implements gho {
    public final yuo a;
    public final wh50 b = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final q0k0 c = new q0k0(this);
    public final ni50 d = new ni50();

    public s0k0(yuo yuoVar) {
        this.a = yuoVar;
    }

    @Override // xsna.gho
    public final Object a(MutatePriority mutatePriority, wzs wzsVar, ContinuationImpl continuationImpl) {
        Object d = zvj.d(new o0k0(this, mutatePriority, wzsVar, null), continuationImpl);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
