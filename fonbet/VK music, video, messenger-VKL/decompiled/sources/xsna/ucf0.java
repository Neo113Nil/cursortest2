package xsna;

import com.vk.feed.core.models.channels.ChannelsRecommendations;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: RecommendedChannelsHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class ucf0 extends ol60 {
    public final ChannelsRecommendations h;
    public final boolean i;
    public final bwy j;
    public final String k;

    public ucf0(ChannelsRecommendations channelsRecommendations, boolean z, bwy bwyVar, String str) {
        super(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 0, 0, 0, null);
        this.h = channelsRecommendations;
        this.i = z;
        this.j = bwyVar;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucf0)) {
            return false;
        }
        ucf0 ucf0Var = (ucf0) obj;
        return epx.f(this.h, ucf0Var.h) && this.i == ucf0Var.i && epx.f(this.j, ucf0Var.j) && epx.f(this.k, ucf0Var.k);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + qoy.b(this.h.hashCode() * 31, 31, this.i)) * 31;
        String str = this.k;
        return Integer.hashCode(0) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedChannelsHolderUiDto(channelsRecommendations=");
        sb.append(this.h);
        sb.append(", isAsync=");
        sb.append(this.i);
        sb.append(", lazyLoadState=");
        sb.append(this.j);
        sb.append(", trackCode=");
        return i5s.a(sb, this.k, ", seqId=0)");
    }
}
