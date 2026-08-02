package xsna;

import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;

/* compiled from: CommunityProfileSideEffectDeeplinkParams.kt */
/* loaded from: classes5.dex */
public final class uth {
    public final CommunityProfileDeeplinkParams a;
    public final String b;

    public uth(CommunityProfileDeeplinkParams communityProfileDeeplinkParams, String str) {
        this.a = communityProfileDeeplinkParams;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uth)) {
            return false;
        }
        uth uthVar = (uth) obj;
        return epx.f(this.a, uthVar.a) && epx.f(this.b, uthVar.b);
    }

    public final int hashCode() {
        CommunityProfileDeeplinkParams communityProfileDeeplinkParams = this.a;
        int hashCode = (communityProfileDeeplinkParams == null ? 0 : communityProfileDeeplinkParams.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityProfileSideEffectDeeplinkParams(deeplinkParams=");
        sb.append(this.a);
        sb.append(", joinGroupSignature=");
        return ho8.a(sb, this.b, ')');
    }
}
