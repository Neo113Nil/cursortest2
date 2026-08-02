package xsna;

import com.vk.music.player.error.VkPlayerException;
import xsna.ry40;

/* compiled from: InnerAudioMusicPlayerPixelTracker.kt */
/* loaded from: classes4.dex */
public final class w0x implements px40 {
    public final cs4 b;
    public ry40 c = ry40.c.d;
    public boolean d;

    public w0x(cs4 cs4Var) {
        this.b = cs4Var;
    }

    @Override // xsna.px40
    public final void a(ry40 ry40Var) {
        this.c = ry40Var;
        if (this.d && (ry40Var instanceof ry40.d)) {
            this.d = false;
        } else {
            this.b.a(ry40Var);
        }
    }

    @Override // xsna.px40
    public final void l(cz40 cz40Var) {
        this.b.b(this.c);
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
    public final void q(ky40 ky40Var) {
    }

    @Override // xsna.px40
    public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
    }

    @Override // xsna.px40
    public final void n(cz40 cz40Var, int i, long j) {
    }
}
