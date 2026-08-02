package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: SuggestedVideoSingleSkeletonHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class d6n0 extends ol60 {
    public final NewsEntry h;

    public d6n0(NewsEntry newsEntry) {
        super(Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 0, 0, 0, null);
        this.h = newsEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6n0) && epx.f(this.h, ((d6n0) obj).h);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.h.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestedVideoSingleSkeletonHolderUiDto(entry=" + this.h + ", seqId=0)";
    }
}
