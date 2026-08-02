package xsna;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: BiometricsLockPinFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class b77 extends AdaptedFunctionReference implements izs<com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a, s3q0> {
    public b77(vk50 vk50Var) {
        super(1, vk50Var, com.vk.biometrics.lock.impl.presentation.base.mvi.pin.b.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0);
    }

    @Override // xsna.izs
    public final s3q0 invoke(com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a aVar) {
        ((com.vk.biometrics.lock.impl.presentation.base.mvi.pin.b) this.receiver).C(aVar);
        return s3q0.a;
    }
}
