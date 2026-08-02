package xsna;

import com.vk.channels.api.CommentsHistory;

/* compiled from: CommentsOrderItem.kt */
/* loaded from: classes16.dex */
public final class wfg implements hfz {
    public final CommentsHistory.Order b;
    public final boolean c;

    public wfg(CommentsHistory.Order order, boolean z) {
        this.b = order;
        this.c = z;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }
}
