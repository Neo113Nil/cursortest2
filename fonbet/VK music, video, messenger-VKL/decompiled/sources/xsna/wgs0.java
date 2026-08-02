package xsna;

import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;

/* compiled from: VideoDiscoveryRepositoryStore.kt */
/* loaded from: classes7.dex */
public final class wgs0 {
    public final vit0 a;
    public final bzs0 b;
    public final eis0 c;
    public final u9t0 d;
    public final VideoAdvertisementsRepository e;
    public final lyr0 f;
    public final jsf0 g;
    public final com.vk.video.kidsprofile.restricteduseractions.a h;
    public final cgs0 i;

    public wgs0(vit0 vit0Var, bzs0 bzs0Var, eis0 eis0Var, u9t0 u9t0Var, VideoAdvertisementsRepository videoAdvertisementsRepository, lyr0 lyr0Var, jsf0 jsf0Var, com.vk.video.kidsprofile.restricteduseractions.a aVar, cgs0 cgs0Var) {
        this.a = vit0Var;
        this.b = bzs0Var;
        this.c = eis0Var;
        this.d = u9t0Var;
        this.e = videoAdvertisementsRepository;
        this.f = lyr0Var;
        this.g = jsf0Var;
        this.h = aVar;
        this.i = cgs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgs0)) {
            return false;
        }
        wgs0 wgs0Var = (wgs0) obj;
        return epx.f(this.a, wgs0Var.a) && epx.f(this.b, wgs0Var.b) && epx.f(this.c, wgs0Var.c) && epx.f(this.d, wgs0Var.d) && epx.f(this.e, wgs0Var.e) && epx.f(this.f, wgs0Var.f) && epx.f(this.g, wgs0Var.g) && epx.f(this.h, wgs0Var.h) && this.i.equals(wgs0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VideoDiscoveryRepositoryStore(subscriptionRepository=" + this.a + ", offlineImagesRepository=" + this.b + ", downloadsRepository=" + this.c + ", promoRepository=" + this.d + ", adRepository=" + this.e + ", adBannerRepository=" + this.f + ", relatedMusicInVideoInteractor=" + this.g + ", restrictedUserActionsRepository=" + this.h + ", discoveryCommentsRepository=" + this.i + ')';
    }
}
