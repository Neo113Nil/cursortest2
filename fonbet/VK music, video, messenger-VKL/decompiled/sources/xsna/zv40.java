package xsna;

import com.vk.music.player.error.VkPlayerException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MusicPlayerCompositeImpl.kt */
/* loaded from: classes4.dex */
public final class zv40 implements px40 {
    public final ArrayList b = new ArrayList();

    @Override // xsna.px40
    public final void B(ky40 ky40Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((px40) it.next()).B(ky40Var);
        }
    }

    @Override // xsna.px40
    public final void D(v0q<? extends kw40> v0qVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((px40) it.next()).D(v0qVar);
        }
    }

    @Override // xsna.px40
    public final void a(ry40 ry40Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((px40) it.next()).a(ry40Var);
        }
    }

    @Override // xsna.px40
    public final void d(cz40 cz40Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((px40) it.next()).d(cz40Var);
        }
    }

    @Override // xsna.px40
    public final void i(ly40 ly40Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((px40) it.next()).i(ly40Var);
        }
    }

    @Override // xsna.px40
    public final void l(cz40 cz40Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((px40) it.next()).l(cz40Var);
        }
    }

    @Override // xsna.px40
    public final void n(cz40 cz40Var, int i, long j) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((px40) it.next()).n(cz40Var, i, j);
        }
    }

    @Override // xsna.px40
    public final void onStop() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((px40) it.next()).onStop();
        }
    }

    @Override // xsna.px40
    public final void q(ky40 ky40Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((px40) it.next()).q(ky40Var);
        }
    }

    @Override // xsna.px40
    public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((px40) it.next()).v(cz40Var, vkPlayerException);
        }
    }

    @Override // xsna.px40
    public final void G() {
    }

    @Override // xsna.px40
    public final void F(cz40 cz40Var) {
    }
}
