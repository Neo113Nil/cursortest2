package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.music.MusicTrack;
import java.util.List;

/* compiled from: MusicCategoryOfflineTracksDataProvider.kt */
/* loaded from: classes16.dex */
public final class bf40 implements qe40 {
    public final lq40 a;

    public bf40(lq40 lq40Var) {
        this.a = lq40Var;
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> a(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).l(new z8(new x620(this), 22));
    }

    @Override // xsna.qe40
    public final boolean b(UIBlockLink uIBlockLink, yj40 yj40Var) {
        return (yj40Var instanceof ib50) || (yj40Var instanceof gc50) || (yj40Var instanceof gi40) || (yj40Var instanceof hiy);
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> c(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).l(new b9(new sux(this, 5), 24));
    }

    public final io.reactivex.rxjava3.core.x<List<MusicTrack>> d(UIBlockLink uIBlockLink) {
        boolean D = drm0.D(uIBlockLink.y.e, "kids_section", false);
        lq40 lq40Var = this.a;
        return D ? lq40Var.A().l(new d9(new n9w(this, 8), 23)) : lq40Var.A();
    }
}
