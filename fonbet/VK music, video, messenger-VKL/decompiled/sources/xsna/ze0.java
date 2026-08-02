package xsna;

import com.vk.dto.common.InstreamAd;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;

/* compiled from: AdDelegate.kt */
/* loaded from: classes18.dex */
public final class ze0 {
    public final InstreamAd a;
    public final od0 b;
    public final VideoAdvertisementsRepository c;

    public ze0(InstreamAd instreamAd, od0 od0Var, VideoAdvertisementsRepository videoAdvertisementsRepository) {
        this.a = instreamAd;
        this.b = od0Var;
        this.c = videoAdvertisementsRepository;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze0)) {
            return false;
        }
        ze0 ze0Var = (ze0) obj;
        return epx.f(this.a, ze0Var.a) && epx.f(this.b, ze0Var.b) && epx.f(this.c, ze0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AdDependencies(ad=" + this.a + ", adChoiceProtocol=" + this.b + ", videoAdRepository=" + this.c + ')';
    }
}
