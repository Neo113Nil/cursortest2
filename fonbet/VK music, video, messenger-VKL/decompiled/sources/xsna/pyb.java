package xsna;

import android.content.Context;
import com.vk.im.chat.api.ChatAnalyticsParamsNoLogging;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ChatRouter.kt */
/* loaded from: classes2.dex */
public interface pyb {
    static void b(pyb pybVar, Context context, Long l, long j, String str, List list, String str2, ChatAnalyticsParamsNoLogging chatAnalyticsParamsNoLogging, int i) {
        Long l2 = (i & 2) != 0 ? null : l;
        String str3 = (i & 8) != 0 ? "" : str;
        EmptyList emptyList = EmptyList.b;
        pybVar.a(context, l2, j, str3, emptyList, (i & 64) != 0 ? emptyList : list, (i & 128) != 0 ? "" : "market_item", (i & 256) != 0 ? "" : str2, (i & 1024) != 0 ? null : "send_message_to_owner", (i & 2097152) != 0 ? null : chatAnalyticsParamsNoLogging);
    }

    void a(Context context, Long l, long j, String str, List list, List list2, String str2, String str3, String str4, ChatAnalyticsParamsNoLogging chatAnalyticsParamsNoLogging);
}
