package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.music.Playlist;
import java.util.List;

/* compiled from: MusicCategoryOfflinePlaylistsDataProvider.kt */
/* loaded from: classes16.dex */
public final class ze40 implements qe40 {
    public final lq40 a;

    public ze40(lq40 lq40Var) {
        this.a = lq40Var;
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> a(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).l(new d810(new gzn(this), 4));
    }

    @Override // xsna.qe40
    public final boolean b(UIBlockLink uIBlockLink, yj40 yj40Var) {
        return (yj40Var instanceof n8b0) || (yj40Var instanceof fi40) || (yj40Var instanceof hiy);
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> c(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).l(new gv(new ye40(this, 0), 29));
    }

    public final io.reactivex.rxjava3.core.x<List<Playlist>> d(UIBlockLink uIBlockLink) {
        boolean D = drm0.D(uIBlockLink.y.e, "kids_section", false);
        lq40 lq40Var = this.a;
        return D ? lq40Var.l().l(new kf3(new xsq(this, 16), 29)) : lq40Var.l();
    }
}
