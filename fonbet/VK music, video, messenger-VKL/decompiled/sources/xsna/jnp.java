package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class jnp extends Lambda implements izs<tdu, s3q0> {
    final /* synthetic */ boolean $disableClip;
    final /* synthetic */ gzs<Boolean> $isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnp(boolean z, gzs<Boolean> gzsVar) {
        super(1);
        this.$disableClip = z;
        this.$isEnabled = gzsVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(tdu tduVar) {
        tduVar.f(!this.$disableClip && this.$isEnabled.invoke().booleanValue());
        return s3q0.a;
    }
}
