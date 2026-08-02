package xsna;

import android.content.Context;
import com.vk.superapp.qr.web2app.data.CheckSignInOpenArguments;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import xsna.h1c;
import xsna.j1c;
import xsna.y0c;

/* compiled from: CheckSignInFeature.kt */
/* loaded from: classes6.dex */
public final class g1c extends wk50<l1c, k1c, y0c, h1c> {
    public final Context f;
    public final CheckSignInOpenArguments g;
    public final noe0 h;
    public final mui0 i;
    public final ovj j;
    public final hpj k;
    public final f4z l;
    public yok0 m;
    public final f1c n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1c(Context context, CheckSignInOpenArguments checkSignInOpenArguments, noe0 noe0Var, mui0 mui0Var, i1c i1cVar) {
        super(y0c.c.b, i1cVar);
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        hpj a = zvj.a(d.a.a(whn0.a(), ie00.a.U()));
        this.f = context;
        this.g = checkSignInOpenArguments;
        this.h = noe0Var;
        this.i = mui0Var;
        this.j = wglVar;
        this.k = a;
        this.l = new f4z();
        this.n = new f1c(this);
    }

    @Override // xsna.wk50
    public final void N(k1c k1cVar, y0c y0cVar) {
        y0c y0cVar2 = y0cVar;
        boolean equals = y0cVar2.equals(y0c.c.b);
        hpj hpjVar = this.k;
        f1c f1cVar = this.n;
        ovj ovjVar = this.j;
        if (equals) {
            T(h1c.c.b);
            yok0 yok0Var = this.m;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            this.m = myc0.h(hpjVar, ovjVar.plus(f1cVar), null, new e1c(this, null), 2);
            return;
        }
        boolean equals2 = y0cVar2.equals(y0c.a.b);
        f4z f4zVar = this.l;
        if (equals2) {
            f4zVar.b(j1c.b.a);
        } else {
            if (!y0cVar2.equals(y0c.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(j1c.c.a);
            myc0.h(hpjVar, ovjVar.plus(f1cVar).plus(whn0.a()), null, new d1c(this, null), 2);
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        zvj.c(this.k, null);
    }
}
