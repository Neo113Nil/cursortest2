package xsna;

import android.content.Context;
import com.vk.masks.MasksController;
import xsna.i3x0;
import xsna.k5x0;
import xsna.l5x0;

/* compiled from: VoipMaskControllerImpl.kt */
/* loaded from: classes7.dex */
public final class qrw0 extends rnw0 {
    public final io.reactivex.rxjava3.subjects.d<Boolean> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrw0(Context context, xgw0 xgw0Var, rrw0 rrw0Var, a000 a000Var) {
        super(context, xgw0Var, rrw0Var, a000Var, i3x0.d.a.b, MasksController.MasksCatalogType.VOIP_MASKS);
        i3x0.d.a.getClass();
        this.t = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
        this.g.setOnMasksUpdatedCallback(new xau0(this, 7));
        this.g.setMasksAnalytics(new nr2());
        this.g.setOnAuthorClicked(new z7t0(this, 8));
        rrw0Var.g.getClass();
        io.reactivex.rxjava3.subjects.d<l5x0.b> dVar = com.vk.voip.ui.c.h0().b;
        Integer valueOf = epx.f(dVar.P0().a, k5x0.a.c) ? null : Integer.valueOf(dVar.P0().a.a);
        if (valueOf != null) {
            this.g.setOnNewDataListener(new prw0(this, valueOf.intValue()));
        }
    }

    @Override // xsna.rnw0
    public final boolean d() {
        return !this.d.d().b();
    }
}
