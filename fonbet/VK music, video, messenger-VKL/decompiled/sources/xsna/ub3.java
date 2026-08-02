package xsna;

import android.app.Activity;
import xsna.c63;
import xsna.nb3;

/* compiled from: AppUtils.kt */
/* loaded from: classes11.dex */
public final class ub3 extends c63.b {
    public final /* synthetic */ ns b;

    public ub3(ns nsVar) {
        this.b = nsVar;
    }

    @Override // xsna.c63.b
    public final void m(Activity activity) {
        c63 c63Var = c63.a;
        c63.c(this);
        nb3.a.getClass();
        if (nb3.e != null) {
            boolean b = o25.a().b();
            ns nsVar = this.b;
            if (b) {
                nsVar.a(o25.a().c(), new fb3(0));
            }
            nb3.b bVar = new nb3.b(nsVar);
            nb3.e = bVar;
            c63.a(bVar);
        }
    }
}
