package xsna;

import com.vk.log.L;
import com.vk.music.player.error.ErrorType;
import com.vk.music.player.error.VkPlayerException;

/* compiled from: LoggingMusicPlayerListener.kt */
/* loaded from: classes3.dex */
public final class f200 extends vtl {
    @Override // xsna.vtl, xsna.px40
    public final void B(ky40 ky40Var) {
        bn40.f("preparedMeta=" + ky40Var);
        super.B(ky40Var);
    }

    @Override // xsna.vtl, xsna.px40
    public final void D(v0q<? extends kw40> v0qVar) {
        bn40.f("state=" + v0qVar);
        super.D(v0qVar);
    }

    @Override // xsna.vtl, xsna.px40
    public final void F(cz40 cz40Var) {
        bn40.f("onBufferingComplete playerType=" + cz40Var);
        super.F(cz40Var);
    }

    @Override // xsna.vtl, xsna.px40
    public final void a(ry40 ry40Var) {
        bn40 bn40Var = bn40.a;
        boolean c = ry40Var.c();
        l9h l9hVar = new l9h(ry40Var, 29);
        bn40Var.getClass();
        if (c) {
            bn40.c.invoke("LoggingMusicPlayerListener", l9hVar);
        } else {
            L.n("LoggingMusicPlayerListener", l9hVar);
        }
        super.a(ry40Var);
    }

    @Override // xsna.vtl, xsna.px40
    public final void d(cz40 cz40Var) {
        bn40.f("newId=" + cz40Var);
        super.d(cz40Var);
    }

    @Override // xsna.vtl, xsna.px40
    public final void l(cz40 cz40Var) {
        bn40.f("playerId=" + cz40Var);
        super.l(cz40Var);
    }

    @Override // xsna.vtl, xsna.px40
    public final void onStop() {
        bn40.f("onStop");
        super.onStop();
    }

    @Override // xsna.vtl, xsna.px40
    public final void q(ky40 ky40Var) {
        bn40.f("preparedMeta=" + ky40Var);
        super.q(ky40Var);
    }

    @Override // xsna.vtl, xsna.px40
    public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
        StringBuilder sb = new StringBuilder("playerId=");
        sb.append(cz40Var);
        sb.append(", errorType=");
        ErrorType d = vkPlayerException.d();
        sb.append(d != null ? d.toString() : null);
        bn40.d(sb.toString());
        super.v(cz40Var, vkPlayerException);
    }
}
