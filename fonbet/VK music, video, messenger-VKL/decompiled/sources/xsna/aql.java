package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.ykp0;

/* compiled from: TransformableState.kt */
/* loaded from: classes11.dex */
public final class aql implements alp0 {
    public final blp0 a;
    public final zpl b = new zpl(this);
    public final ni50 c = new ni50();
    public final wh50<Boolean> d = androidx.compose.runtime.k.b(Boolean.FALSE);

    public aql(blp0 blp0Var) {
        this.a = blp0Var;
    }

    @Override // xsna.alp0
    public final Object a(MutatePriority mutatePriority, ykp0.a.C4108a.C4109a c4109a, ykp0.a.C4108a c4108a) {
        Object d = zvj.d(new ypl(this, mutatePriority, c4109a, null), c4108a);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
