package defpackage;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class iiu extends pgd {
    public final Context F;
    public final w030 G;
    public final q6r0 H;
    public final mu5 I;

    public iiu(Context context, w030 w030Var, q6r0 q6r0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = q6r0Var;
        this.I = new mu5(new giu(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((hiu) obj);
        q6r0 q6r0Var = this.H;
        q6r0Var.getClass();
        q6r0Var.a.a("Settings.HidePhoneConfirmModal.Shown", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.I;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
