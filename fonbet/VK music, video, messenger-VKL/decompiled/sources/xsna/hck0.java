package xsna;

import com.vk.music.player.PlayState;
import com.vk.music.player.error.VkPlayerException;
import java.util.Iterator;
import xsna.ry40;

/* compiled from: SnippetPlayerModel.kt */
/* loaded from: classes3.dex */
public final class hck0 implements px40 {
    public final /* synthetic */ ick0 b;

    public hck0(ick0 ick0Var) {
        this.b = ick0Var;
    }

    @Override // xsna.px40
    public final void a(ry40 ry40Var) {
        boolean z = ry40Var instanceof ry40.e.a;
        ick0 ick0Var = this.b;
        if (z) {
            com.vk.music.player.f H = ick0Var.H();
            H.p(0, (int) ((ry40.e.a) ry40Var).e);
            Iterator it = ick0Var.i.iterator();
            while (it.hasNext()) {
                ((com.vk.music.player.e) it.next()).W3(H);
            }
            return;
        }
        if (ry40Var.j()) {
            ick0Var.y(PlayState.PLAYING);
            return;
        }
        if (ry40Var.i()) {
            ick0Var.y(PlayState.PAUSED);
        } else if (ry40Var instanceof ry40.f) {
            ick0Var.y(PlayState.STOPPED);
        } else if (ry40Var instanceof ry40.b) {
            ick0Var.y(PlayState.IDLE);
        }
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
    public final void i(ly40 ly40Var) {
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
