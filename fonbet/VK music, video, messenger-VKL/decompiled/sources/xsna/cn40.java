package xsna;

import com.vk.music.player.PlayState;
import com.vk.music.player.e;

/* compiled from: MusicLongTapSeeker.kt */
/* loaded from: classes3.dex */
public final class cn40 extends e.a {
    public final /* synthetic */ dn40 b;

    public cn40(dn40 dn40Var) {
        this.b = dn40Var;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        dn40 dn40Var = this.b;
        if (fVar != null && !fVar.n()) {
            dn40Var.c(false);
        } else {
            if (fVar == null || !fVar.n() || dn40Var.g) {
                return;
            }
            dn40Var.c(true);
        }
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void onError(String str) {
        this.b.c(false);
    }
}
