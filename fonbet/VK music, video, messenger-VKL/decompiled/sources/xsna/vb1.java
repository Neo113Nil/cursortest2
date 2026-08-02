package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonVideoStat$AssistantType;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.Iterator;

/* compiled from: AiAssistantAnalytics.kt */
/* loaded from: classes16.dex */
public final class vb1 {
    public static CommonVideoStat$AssistantType a(String str) {
        Object obj;
        Iterator<E> it = CommonVideoStat$AssistantType.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (brm0.w(((CommonVideoStat$AssistantType) obj).name(), str, true)) {
                break;
            }
        }
        CommonVideoStat$AssistantType commonVideoStat$AssistantType = (CommonVideoStat$AssistantType) obj;
        return commonVideoStat$AssistantType == null ? CommonVideoStat$AssistantType.COMMON : commonVideoStat$AssistantType;
    }

    public static void b(SchemeStat$TypeView.b bVar, String str, String str2) {
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO_AI_ASSISTANT, null, null, null, null, null, 62, null), str, str2, null, bVar, 8)).q();
    }
}
