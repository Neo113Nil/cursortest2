package xsna;

import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import xsna.k840;

/* compiled from: PlayerDelegate.kt */
/* loaded from: classes4.dex */
public final class w0b0 extends e.a {
    public final yo20 b;
    public final k7y c;
    public final u2b0 d;

    public w0b0(yo20 yo20Var, k7y k7yVar) {
        this.b = yo20Var;
        this.c = k7yVar;
        u2b0 b = k840.a.g().b();
        this.d = b;
        b.P0(this, false);
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        this.b.invoke(hu40.b);
    }
}
