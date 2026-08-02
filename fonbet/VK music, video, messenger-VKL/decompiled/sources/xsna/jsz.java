package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import xsna.fsz;
import xsna.ksz;
import xsna.osz;

/* compiled from: LoaderScreenFeature.kt */
/* loaded from: classes6.dex */
public final class jsz extends wk50<nsz, msz, fsz, ksz> {
    public final String f;
    public final noe0 g;
    public final qoe0 h;
    public final mui0 i;
    public final int j;
    public final ovj k;
    public final f4z l;
    public final hpj m;
    public final isz n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsz(String str, noe0 noe0Var, qoe0 qoe0Var, mui0 mui0Var, lsz lszVar) {
        super((str == null || drm0.N(str)) ? fsz.c.b : fsz.b.b, lszVar);
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        this.f = str;
        this.g = noe0Var;
        this.h = qoe0Var;
        this.i = mui0Var;
        this.j = 3;
        this.k = wglVar;
        this.l = new f4z();
        this.m = zvj.a(d.a.a(whn0.a(), ie00.a.U()));
        this.n = new isz(this);
    }

    @Override // xsna.wk50
    public final void N(msz mszVar, fsz fszVar) {
        fsz fszVar2 = fszVar;
        if (fszVar2.equals(fsz.b.b)) {
            T(ksz.c.b);
            myc0.h(this.m, this.k.plus(this.n), null, new hsz(this, null), 2);
            return;
        }
        boolean equals = fszVar2.equals(fsz.c.b);
        f4z f4zVar = this.l;
        if (equals) {
            f4zVar.b(osz.c.a);
            T(ksz.d.b);
        } else {
            if (!fszVar2.equals(fsz.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(osz.a.a);
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        zvj.c(this.m, null);
    }
}
