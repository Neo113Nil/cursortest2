package xsna;

import com.vk.channels.api.ChannelFilter;

/* compiled from: ClearChannelsLocalHistoryCmd.kt */
/* loaded from: classes2.dex */
public final class xhc extends le6<s3q0> {
    public final ChannelFilter b;

    public xhc(ChannelFilter channelFilter) {
        this.b = channelFilter;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.I0().a().M(this.b);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhc) && this.b == ((xhc) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ClearChannelsLocalHistoryCmd(channelFilter=" + this.b + ')';
    }
}
