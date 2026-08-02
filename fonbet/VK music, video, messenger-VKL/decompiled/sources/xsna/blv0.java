package xsna;

import com.vk.core.snackbar.HideReason;

/* compiled from: VkSnackbarHost.kt */
/* loaded from: classes17.dex */
public final class blv0 implements izs<Throwable, s3q0> {
    public final /* synthetic */ clv0 b;

    public blv0(clv0 clv0Var) {
        this.b = clv0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        Object obj = flv0.a;
        flv0.b(this.b, HideReason.RootViewDetached);
        return s3q0.a;
    }
}
