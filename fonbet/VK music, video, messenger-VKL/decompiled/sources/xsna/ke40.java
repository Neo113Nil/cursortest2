package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.music.Playlist;
import java.util.List;

/* compiled from: MusicCategoryOfflineAlbumsDataProvider.kt */
/* loaded from: classes16.dex */
public final class ke40 implements qe40 {
    public final lq40 a;

    public ke40(lq40 lq40Var) {
        this.a = lq40Var;
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> a(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).l(new ie40(new hyu(this, 7), 0));
    }

    @Override // xsna.qe40
    public final boolean b(UIBlockLink uIBlockLink, yj40 yj40Var) {
        return (yj40Var instanceof n8b0) || (yj40Var instanceof fi40) || (yj40Var instanceof hiy);
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> c(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).l(new he40(new uuz(this, 9), 0));
    }

    public final io.reactivex.rxjava3.core.x<List<Playlist>> d(UIBlockLink uIBlockLink) {
        boolean D = drm0.D(uIBlockLink.y.e, "kids_section", false);
        lq40 lq40Var = this.a;
        return D ? lq40Var.b().l(new je40(new c220(this, 5), 0)) : lq40Var.b();
    }
}
