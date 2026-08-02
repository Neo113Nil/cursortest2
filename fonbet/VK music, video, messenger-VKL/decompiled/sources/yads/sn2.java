package yads;

import android.content.Context;
import xsna.qcy;

/* loaded from: classes10.dex */
public abstract class sn2 extends i11 implements pm3 {
    public boolean A;
    public final rn2 B;
    public final wc1 y;
    public final xb z;

    public /* synthetic */ sn2(Context context, wc1 wc1Var, w5 w5Var) {
        this(context, wc1Var, w5Var, new xb(wc1Var));
    }

    @Override // yads.zn, yads.wd2
    public final void a(sd2 sd2Var) {
        super.a(sd2Var);
        q();
    }

    @Override // yads.zn
    public final void b(l4 l4Var) {
        super.b(l4Var);
        int i = l4Var.a;
        if (5 == i || 2 == i) {
            return;
        }
        q();
    }

    @Override // yads.zn
    public void c() {
        super.c();
        this.y.removeVisibilityChangeListener(this);
        this.A = false;
        this.g.removeCallbacks(this.B);
    }

    @Override // yads.zn
    public final void j() {
        super.j();
        q();
    }

    public final void p() {
        q();
    }

    public final void q() {
        this.g.removeCallbacks(this.B);
        v9 v9Var = this.v;
        if (v9Var != null && v9Var.K && this.A && this.p.a()) {
            mn2 mn2Var = this.z.a;
            qcy qcyVar = xb.b[0];
            wc1 wc1Var = (wc1) mn2Var.a.get();
            if (wc1Var == null || om3.b(wc1Var)) {
                return;
            }
            this.g.postDelayed(this.B, v9Var.I);
        }
    }

    public sn2(Context context, wc1 wc1Var, w5 w5Var, xb xbVar) {
        super(context, wc1Var.getAdConfiguration$mobileads_externalRelease(), wc1Var.getSdkEnvironmentModule$mobileads_externalRelease(), w5Var);
        this.y = wc1Var;
        this.z = xbVar;
        this.A = true;
        this.B = new rn2(this);
        wc1Var.addVisibilityChangeListener(this);
    }
}
