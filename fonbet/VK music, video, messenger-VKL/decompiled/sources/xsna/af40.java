package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockLink;

/* compiled from: MusicCategoryOfflinePodcastsDataProvider.kt */
/* loaded from: classes16.dex */
public final class af40 implements qe40 {
    public final lq40 a;

    public af40(lq40 lq40Var) {
        this.a = lq40Var;
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> a(UIBlockLink uIBlockLink) {
        return this.a.h().l(new iu4(new juz(this), 23));
    }

    @Override // xsna.qe40
    public final boolean b(UIBlockLink uIBlockLink, yj40 yj40Var) {
        return (yj40Var instanceof tt1) || (yj40Var instanceof hiy);
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> c(UIBlockLink uIBlockLink) {
        return this.a.h().l(new nz(new q520(this, 2), 29));
    }
}
