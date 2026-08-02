package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.music.audiobook.AudioBook;
import java.util.List;

/* compiled from: MusicCategoryOfflineAudioBooksDataProvider.kt */
/* loaded from: classes16.dex */
public final class le40 implements qe40 {
    public final lq40 a;

    public le40(lq40 lq40Var) {
        this.a = lq40Var;
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> a(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).l(new i3u(new d4r(this, 13), 4));
    }

    @Override // xsna.qe40
    public final boolean b(UIBlockLink uIBlockLink, yj40 yj40Var) {
        return (yj40Var instanceof st1) || (yj40Var instanceof hiy);
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> c(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).l(new l340(new tuq(this, 15), 1));
    }

    public final io.reactivex.rxjava3.core.x<List<AudioBook>> d(UIBlockLink uIBlockLink) {
        boolean D = drm0.D(uIBlockLink.y.e, "kids_section", false);
        lq40 lq40Var = this.a;
        return D ? lq40Var.i().l(new com.vk.movika.sdk.base.ui.p0(new com(this, 18), 26)) : lq40Var.i();
    }
}
