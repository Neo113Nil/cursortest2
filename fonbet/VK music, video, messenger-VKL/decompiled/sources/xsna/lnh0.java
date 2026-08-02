package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;

/* compiled from: SearchBlockBuilder.kt */
/* loaded from: classes2.dex */
public final class lnh0 {
    public final PeersSearchBlock a;
    public final ProfilesSimpleInfo b;

    public lnh0(PeersSearchBlock peersSearchBlock, ProfilesSimpleInfo profilesSimpleInfo) {
        this.a = peersSearchBlock;
        this.b = profilesSimpleInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnh0)) {
            return false;
        }
        lnh0 lnh0Var = (lnh0) obj;
        return epx.f(this.a, lnh0Var.a) && epx.f(this.b, lnh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchBlockWithProfiles(block=" + this.a + ", profiles=" + this.b + ')';
    }
}
