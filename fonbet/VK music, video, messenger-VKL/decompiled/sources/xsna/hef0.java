package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.block.music.impl.recommended.entity.RecommendedPlaylistState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;

/* compiled from: RecommendedPlaylistLegacyStateMapper.kt */
/* loaded from: classes.dex */
public final class hef0 implements n8a<RecommendedPlaylistState> {
    public final u2b0 b;

    public hef0(u2b0 u2b0Var) {
        this.b = u2b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        r4 = r4.Ab(xsna.iah0.a(265), false);
     */
    @Override // xsna.n8a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RecommendedPlaylistState a(CatalogBlockVariant catalogBlockVariant, UIBlock uIBlock) {
        String Qb;
        if (!(uIBlock instanceof UIBlockMusicPlaylist)) {
            return null;
        }
        String w = uIBlock.w();
        UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
        Float Rb = uIBlockMusicPlaylist.Rb();
        String Sb = uIBlockMusicPlaylist.Sb();
        Playlist Ub = uIBlockMusicPlaylist.Ub();
        u2b0 u2b0Var = this.b;
        PlayingState h = uzp.h(Ub, u2b0Var);
        Thumb Tb = uIBlockMusicPlaylist.Tb();
        if (Tb == null || Qb == null) {
            Qb = uIBlockMusicPlaylist.Qb();
        }
        String str = Qb;
        MusicTrack b = u2b0Var.b();
        return new RecommendedPlaylistState(BlockId.Simple.a(w), catalogBlockVariant, uIBlock.v0(), Rb, Sb, h, uIBlockMusicPlaylist.Ub(), uIBlockMusicPlaylist.Vb(), str, b != null ? b.Fb() : null);
    }
}
