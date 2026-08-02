package xsna;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class pbb implements com.vk.im.ui.components.msg_search.vc.a {
    public final long b;

    public pbb(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbb) && this.b == ((pbb) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("ChannelSearchSkeletonItem(itemId="));
    }
}
