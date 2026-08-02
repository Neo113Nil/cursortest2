package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalItemLoggingInfo;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class t9f0 implements com.vk.im.ui.components.msg_search.vc.a {
    public final ImSearchItemLoggingInfo b;

    public t9f0(ImSearchLocalItemLoggingInfo imSearchLocalItemLoggingInfo) {
        this.b = imSearchLocalItemLoggingInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9f0) && epx.f(this.b, ((t9f0) obj).b);
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return Long.valueOf(C.TIME_UNSET);
    }

    public final int hashCode() {
        ImSearchItemLoggingInfo imSearchItemLoggingInfo = this.b;
        if (imSearchItemLoggingInfo == null) {
            return 0;
        }
        return imSearchItemLoggingInfo.hashCode();
    }

    public final String toString() {
        return "RecentTitleItem(searchLoggingInfo=" + this.b + ')';
    }
}
