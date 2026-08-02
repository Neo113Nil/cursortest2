package xsna;

import android.view.View;

/* compiled from: ProfileTooltipManagerImpl.kt */
/* loaded from: classes5.dex */
public final class n0e0 implements izs<etv0, s3q0> {
    public final /* synthetic */ View b;

    public n0e0(View view) {
        this.b = view;
    }

    @Override // xsna.izs
    public final s3q0 invoke(etv0 etv0Var) {
        etv0Var.b(false);
        this.b.callOnClick();
        return s3q0.a;
    }
}
