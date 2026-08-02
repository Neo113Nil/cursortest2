package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.ui.payments.result.PaymentsResultFlexModalView;

/* loaded from: classes13.dex */
public final class doa0 extends m230 implements bgc0 {
    public final Context E;
    public final boa0 F;
    public final ioa0 G;
    public final w030 H;
    public final boolean I;

    public doa0(Context context, boa0 boa0Var, ioa0 ioa0Var, w030 w030Var) {
        super(null);
        this.E = context;
        this.F = boa0Var;
        this.G = ioa0Var;
        this.H = w030Var;
        this.I = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.H;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.I;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        coa0 coa0Var = (coa0) obj;
        jsj jsjVar = new jsj(this.E);
        y7c0 y7c0Var = coa0Var.a;
        String str = coa0Var.b;
        yj70 yj70Var = new yj70(this);
        dt20 dt20Var = this.G.a;
        hoa0 hoa0Var = new hoa0(str, yj70Var, y7c0Var, jsjVar, (dac0) ((xvf0) dt20Var.b).get(), (w2h) ((vqa0) dt20Var.c).get(), (oep0) ((xvf0) dt20Var.w).get(), (wbc0) ((xvf0) dt20Var.x).get());
        y4a0 y4a0Var = this.F.a;
        return new PaymentsResultFlexModalView((Context) ((x4g) y4a0Var.b).get(), (c2x0) ((z4g) y4a0Var.c).get(), hoa0Var, jsjVar);
    }

    @Override // defpackage.bgc0
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.bgc0
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        return true;
    }
}
