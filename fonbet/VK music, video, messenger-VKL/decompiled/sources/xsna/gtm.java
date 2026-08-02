package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: DialogsListProfiles.kt */
/* loaded from: classes18.dex */
public final class gtm {
    public final ProfilesInfo a;
    public final Set<Peer> b;

    public gtm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtm)) {
            return false;
        }
        gtm gtmVar = (gtm) obj;
        return epx.f(this.a, gtmVar.a) && epx.f(this.b, gtmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsListProfiles(profiles=");
        sb.append(this.a);
        sb.append(", updatedIds=");
        return ur.c(sb, this.b, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gtm(ProfilesInfo profilesInfo, Set<? extends Peer> set) {
        this.a = profilesInfo;
        this.b = set;
    }

    public gtm(int i) {
        this(new ProfilesInfo(), EmptySet.b);
    }
}
