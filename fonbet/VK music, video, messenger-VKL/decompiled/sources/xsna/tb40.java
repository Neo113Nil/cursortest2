package xsna;

import com.vk.music.player.domain.state.LyricsMode;
import com.vk.music.player.domain.state.LyricsScrollMode;
import com.vk.music.player.domain.state.MusicBigPlayerPage;
import com.vk.music.player.domain.state.PlayerControlsMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.sb40;

/* compiled from: MusicBigPlayerReducer.kt */
@ozl
/* loaded from: classes3.dex */
public final class tb40 {
    public izs<? super com.vk.music.player.domain.state.a, s3q0> a;
    public com.vk.music.player.domain.state.a b;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(sb40 sb40Var) {
        com.vk.music.player.domain.state.a a;
        com.vk.music.player.domain.state.a aVar = this.b;
        if (sb40Var instanceof sb40.b) {
            MusicBigPlayerPage musicBigPlayerPage = ((sb40.b) sb40Var).a;
            a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, musicBigPlayerPage, musicBigPlayerPage != MusicBigPlayerPage.TRACK_LIST ? 1 : 0, false, null, null, null, null, null, false, false, false, false, 0, 2096383);
        } else if (sb40Var instanceof sb40.f) {
            a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, null, null, null, null, ((sb40.f) sb40Var).a, false, false, false, false, 0, 2064383);
        } else if (sb40Var instanceof sb40.g) {
            sb40.g gVar = (sb40.g) sb40Var;
            a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, null, null, null, null, null, gVar.a, gVar.b, gVar.c, false, 0, 1638399);
        } else if (sb40Var instanceof sb40.c) {
            a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, null, null, null, null, null, false, false, false, ((sb40.c) sb40Var).a, 0, 1572863);
        } else if (sb40Var instanceof sb40.a) {
            a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, null, null, null, null, null, false, false, false, false, ((sb40.a) sb40Var).a, 1048575);
        } else if (sb40Var instanceof sb40.d) {
            sb40.d dVar = (sb40.d) sb40Var;
            if (dVar instanceof sb40.d.C3658d) {
                a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, LyricsMode.LOADING, null, null, null, null, false, false, false, false, 0, 2095103);
            } else if (dVar instanceof sb40.d.a) {
                a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, LyricsMode.COLLAPSED, null, null, null, null, false, false, false, false, 0, 2095103);
            } else if (dVar instanceof sb40.d.e) {
                a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, LyricsMode.PLACEHOLDER, null, null, null, null, false, false, false, false, 0, 2095103);
            } else if (dVar instanceof sb40.d.c) {
                a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, LyricsMode.ERROR, null, null, null, null, false, false, false, false, 0, 2095103);
            } else {
                if (!(dVar instanceof sb40.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, LyricsMode.CONTENT, ((sb40.d.b) dVar).a, LyricsScrollMode.AUTO, null, null, false, false, false, false, 0, 2082815);
            }
        } else if (sb40Var instanceof sb40.e) {
            sb40.e eVar = (sb40.e) sb40Var;
            if (eVar instanceof sb40.e.b) {
                a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, null, null, LyricsScrollMode.MANUAL, null, null, false, false, false, false, 0, 2088959);
            } else {
                if (!(eVar instanceof sb40.e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.vk.music.player.domain.state.a a2 = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, null, null, LyricsScrollMode.AUTO, PlayerControlsMode.SHOWN, null, false, false, false, false, 0, 2072575);
                da00 da00Var = a2.m;
                com.vk.music.player.f fVar = aVar.a;
                da00Var.a(fVar != null ? fVar.h() : 0);
                a = a2;
            }
        } else {
            if (!(sb40Var instanceof sb40.h)) {
                throw new NoWhenBranchMatchedException();
            }
            sb40.h hVar = (sb40.h) sb40Var;
            if (hVar instanceof sb40.h.b) {
                a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, null, null, null, PlayerControlsMode.SHOWN, null, false, false, false, false, 0, 2080767);
            } else {
                if (!(hVar instanceof sb40.h.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a = com.vk.music.player.domain.state.a.a(aVar, null, null, null, false, null, null, false, false, null, null, null, PlayerControlsMode.HIDDEN, null, false, false, false, false, 0, 2080767);
            }
        }
        this.b = a;
        this.a.invoke(a);
    }
}
