package xsna;

import com.vk.music.player.error.VkPlayerException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.kck0;
import xsna.ry40;

/* compiled from: MusicSnippetsFeature.kt */
/* loaded from: classes3.dex */
public final class q650 implements px40 {
    public final /* synthetic */ l650 b;

    public q650(l650 l650Var) {
        this.b = l650Var;
    }

    @Override // xsna.px40
    public final void a(ry40 ry40Var) {
        LinkedHashSet linkedHashSet = this.b.j.b;
        if (ry40Var instanceof ry40.a.c) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((kck0.a) it.next()).g4();
            }
            return;
        }
        if (ry40Var instanceof ry40.e.b) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                ((kck0.a) it2.next()).n4(ry40Var.c.b.d, false);
            }
            return;
        }
        if (ry40Var instanceof ry40.e.a) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((kck0.a) it3.next()).r((int) ((ry40.e.a) ry40Var).e);
            }
        } else if (ry40Var.i()) {
            Iterator it4 = linkedHashSet.iterator();
            while (it4.hasNext()) {
                ((kck0.a) it4.next()).s1(false);
            }
        } else if (ry40Var.h()) {
            Iterator it5 = linkedHashSet.iterator();
            while (it5.hasNext()) {
                ((kck0.a) it5.next()).L0();
            }
        }
    }

    @Override // xsna.px40
    public final void i(ly40 ly40Var) {
        this.b.i.d = ly40Var.b;
    }

    @Override // xsna.px40
    public final void G() {
    }

    @Override // xsna.px40
    public final void onStop() {
    }

    @Override // xsna.px40
    public final void B(ky40 ky40Var) {
    }

    @Override // xsna.px40
    public final void D(v0q<? extends kw40> v0qVar) {
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
    public final void q(ky40 ky40Var) {
    }

    @Override // xsna.px40
    public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
    }

    @Override // xsna.px40
    public final void n(cz40 cz40Var, int i, long j) {
    }
}
