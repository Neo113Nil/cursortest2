package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import xsna.sb40;

/* compiled from: MusicBigPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class pb40 extends e.a {
    public final /* synthetic */ qb40 b;

    public pb40(qb40 qb40Var) {
        this.b = qb40Var;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        MusicTrack f;
        MusicTrack f2;
        qb40 qb40Var = this.b;
        com.vk.music.track.a aVar = qb40Var.b;
        qb40Var.b(new sb40.g(aVar.i(fVar != null ? fVar.f() : null), aVar.i0(fVar != null ? fVar.f() : null) && qb40Var.c, aVar.i0(fVar != null ? fVar.f() : null)));
        if (fVar != null && (f2 = fVar.f()) != null) {
            qb40Var.b(new sb40.c(f2.P));
        }
        if (fVar == null || !fVar.n() || (f = fVar.f()) == null || f.Jb() != null) {
            return;
        }
        qb40Var.b(new sb40.a(0));
    }
}
