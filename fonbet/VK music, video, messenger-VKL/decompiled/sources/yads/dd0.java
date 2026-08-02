package yads;

import android.os.Handler;
import android.os.Looper;
import xsna.nek;
import xsna.nu4;

/* loaded from: classes10.dex */
public final class dd0 implements sk0 {
    public final pk0 b;
    public nk0 c;
    public boolean d;
    public final /* synthetic */ gd0 e;

    public dd0(gd0 gd0Var, pk0 pk0Var) {
        this.e = gd0Var;
        this.b = pk0Var;
    }

    public final void a(nx0 nx0Var) {
        Handler handler = this.e.u;
        handler.getClass();
        handler.post(new nek(8, this, nx0Var));
    }

    public final void b(nx0 nx0Var) {
        gd0 gd0Var = this.e;
        if (gd0Var.p == 0 || this.d) {
            return;
        }
        Looper looper = gd0Var.t;
        looper.getClass();
        this.c = gd0Var.a(looper, this.b, nx0Var, false);
        this.e.n.add(this);
    }

    @Override // yads.sk0
    public final void release() {
        Handler handler = this.e.u;
        handler.getClass();
        mc3.a(handler, (Runnable) new nu4(this, 13));
    }

    public final /* synthetic */ void a() {
        if (this.d) {
            return;
        }
        nk0 nk0Var = this.c;
        if (nk0Var != null) {
            nk0Var.a(this.b);
        }
        this.e.n.remove(this);
        this.d = true;
    }
}
