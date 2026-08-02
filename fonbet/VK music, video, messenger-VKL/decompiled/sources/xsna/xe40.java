package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.music.Playlist;
import java.util.List;

/* compiled from: MusicCategoryOfflinePlaylistsAndAlbumsDataProvider.kt */
/* loaded from: classes16.dex */
public final class xe40 implements qe40 {
    public final lq40 a;

    public xe40(lq40 lq40Var) {
        this.a = lq40Var;
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> a(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).l(new h8(new svz(this), 26));
    }

    @Override // xsna.qe40
    public final boolean b(UIBlockLink uIBlockLink, yj40 yj40Var) {
        return (yj40Var instanceof n8b0) || (yj40Var instanceof fi40) || (yj40Var instanceof hiy);
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> c(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).l(new j630(new rvq(this, 11), 2));
    }

    public final io.reactivex.rxjava3.core.x<List<Playlist>> d(UIBlockLink uIBlockLink) {
        boolean D = drm0.D(uIBlockLink.y.e, "kids_section", false);
        lq40 lq40Var = this.a;
        return D ? lq40Var.k().l(new ps2(new vsq(this), 26)) : lq40Var.k();
    }
}
