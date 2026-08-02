package xsna;

import com.vk.music.player.error.VkPlayerException;
import xsna.ry40;
import xsna.z550;

/* compiled from: ConfigMusicPlayerListenerDelegate.kt */
/* loaded from: classes3.dex */
public final class rxi implements px40 {
    public final /* synthetic */ z550.a b;
    public final hw3 c;
    public final /* synthetic */ sxi d;

    public rxi(sxi sxiVar, rx40 rx40Var) {
        this.d = sxiVar;
        this.b = (z550.a) sxiVar.b;
        this.c = new hw3(rx40Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.px40
    public final void D(v0q<? extends kw40> v0qVar) {
        hw3 hw3Var = this.c;
        if (((rx40) hw3Var.a).b) {
            ry40 ry40Var = (ry40) v0qVar;
            pcp a = hw3Var.a(ry40Var);
            if (a == null || a.b != 2) {
                if (a == null || a.b != 3) {
                    hw3Var.c(ry40Var, 2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.px40
    public final void a(ry40 ry40Var) {
        hw3 hw3Var = this.c;
        rx40 rx40Var = (rx40) hw3Var.a;
        if (rx40Var.a && (ry40Var instanceof v0q) && ((v0q) ry40Var).a().a.e) {
            return;
        }
        if (rx40Var.b && !(ry40Var instanceof ry40.a.b) && !(ry40Var instanceof ry40.a.C3641a) && !(ry40Var instanceof ry40.e.a)) {
            pcp a = hw3Var.a(ry40Var);
            if (a != null && a.b == 1) {
                return;
            }
            if (a != null && a.b == 3) {
                return;
            } else {
                hw3Var.c(ry40Var, 1);
            }
        }
        ((z550.a) this.d.b).a(ry40Var);
    }

    @Override // xsna.px40
    public final void i(ly40 ly40Var) {
        this.b.i(ly40Var);
    }

    @Override // xsna.px40
    public final void onStop() {
        this.b.onStop();
    }

    @Override // xsna.px40
    public final void q(ky40 ky40Var) {
        this.b.q(ky40Var);
    }

    @Override // xsna.px40
    public final void G() {
    }

    @Override // xsna.px40
    public final void B(ky40 ky40Var) {
    }

    @Override // xsna.px40
    public final void F(cz40 cz40Var) {
    }

    @Override // xsna.px40
    public final void d(cz40 cz40Var) {
    }

    @Override // xsna.px40
    public final void l(cz40 cz40Var) {
    }

    @Override // xsna.px40
    public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
    }

    @Override // xsna.px40
    public final void n(cz40 cz40Var, int i, long j) {
    }
}
