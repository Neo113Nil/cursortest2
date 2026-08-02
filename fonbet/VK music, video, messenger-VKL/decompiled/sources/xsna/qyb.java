package xsna;

import android.content.Context;
import com.vk.im.chat.api.ChatAnalyticsParamsNoLogging;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.fragments.chat.ChatAnalyticsParams;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ChatRouterImpl.kt */
/* loaded from: classes2.dex */
public final class qyb implements pyb {
    @Override // xsna.pyb
    public final void a(Context context, Long l, long j, String str, List list, List list2, String str2, String str3, String str4, ChatAnalyticsParamsNoLogging chatAnalyticsParamsNoLogging) {
        g2v.c().b().w(context, l, j, null, str, MsgListOpenAtUnreadMode.b, false, list, list2, EmptyList.b, str2, str3, null, str4, null, null, null, null, null, null, false, null, null, null, chatAnalyticsParamsNoLogging != null ? new ChatAnalyticsParams(chatAnalyticsParamsNoLogging.b, chatAnalyticsParamsNoLogging.c, chatAnalyticsParamsNoLogging.d, chatAnalyticsParamsNoLogging.e, chatAnalyticsParamsNoLogging.f, chatAnalyticsParamsNoLogging.g, chatAnalyticsParamsNoLogging.h, null, chatAnalyticsParamsNoLogging.i) : null, false, null, null);
    }
}
