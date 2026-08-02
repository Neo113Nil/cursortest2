package xsna;

import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalItemLoggingInfo;

/* compiled from: MsgSearchResultMixer.kt */
/* loaded from: classes2.dex */
public final class fy30 {
    public static gyh0 a(int i, gyh0 gyh0Var) {
        ImSearchItemLoggingInfo imSearchItemLoggingInfo = gyh0Var.b;
        if (!(imSearchItemLoggingInfo instanceof ImSearchLocalItemLoggingInfo)) {
            return gyh0Var;
        }
        ImSearchLocalItemLoggingInfo imSearchLocalItemLoggingInfo = (ImSearchLocalItemLoggingInfo) imSearchItemLoggingInfo;
        return gyh0.a(gyh0Var, new ImSearchLocalItemLoggingInfo(imSearchLocalItemLoggingInfo.b, imSearchLocalItemLoggingInfo.c + i, imSearchLocalItemLoggingInfo.d, imSearchLocalItemLoggingInfo.e));
    }
}
