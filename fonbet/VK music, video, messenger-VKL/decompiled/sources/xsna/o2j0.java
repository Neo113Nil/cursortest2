package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SettingsInteractor.kt */
/* loaded from: classes7.dex */
public final class o2j0 implements n2j0 {
    public final baq0 a;

    public o2j0(baq0 baq0Var) {
        this.a = baq0Var;
    }

    @Override // xsna.n2j0
    public final Object a(boolean z, k2j0 k2j0Var) {
        Object q = this.a.q(z, k2j0Var);
        return q == CoroutineSingletons.COROUTINE_SUSPENDED ? q : s3q0.a;
    }
}
