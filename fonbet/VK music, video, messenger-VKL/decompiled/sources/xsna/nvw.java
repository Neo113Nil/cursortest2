package xsna;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.im.engine.models.InfoBar;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationBannerView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.ArrayList;

/* compiled from: InfoBarReporterImpl.kt */
/* loaded from: classes5.dex */
public final class nvw implements mvw {
    public static final nvw a = new nvw();

    @Override // xsna.mvw
    public final void a(InfoBar infoBar) {
        String str = infoBar.b;
        String str2 = epx.f(str, "dialogs_list_info_bar_msg_push_disabled") ? "vkm_conversations_bar_push_action" : epx.f(str, "private_dialog_info_bar_msg_push_disabled") ? "vkm_conversation_bar_push_action" : null;
        if (str2 == null) {
            return;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g(str2);
        aVar.c("action", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        com.vk.movika.sdk.base.model.n.c(aVar, thp0.c, bVar);
    }

    @Override // xsna.mvw
    public final void b(InfoBar infoBar) {
        String str = infoBar.b;
        String str2 = epx.f(str, "dialogs_list_info_bar_msg_push_disabled") ? "vkm_conversations_bar_push_action" : epx.f(str, "private_dialog_info_bar_msg_push_disabled") ? "vkm_conversation_bar_push_action" : null;
        if (str2 == null) {
            return;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g(str2);
        aVar.c("action", "button");
        com.vk.movika.sdk.base.model.n.c(aVar, thp0.c, bVar);
    }

    @Override // xsna.mvw
    public final void c(String str) {
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CONVERSATION, null, null, null, null, null, 62, null), String.valueOf(0L), String.valueOf(0L), null, new MobileOfficialAppsImStat$TypeImConversationBannerView(str, null, 2, null), 8)).q();
    }

    @Override // xsna.mvw
    public final void d(long j, InfoBar.ButtonType buttonType) {
        if (InfoBar.ButtonType.GIFTS_LINK == buttonType) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.g("gifts_im_birthday_banner");
            aVar.c("action", "click");
            aVar.b("peer_id", Long.valueOf(j));
            aVar.i("StatlogTracker");
            bVar.k(aVar.e());
        }
    }

    @Override // xsna.mvw
    public final void e(long j, ArrayList arrayList) {
        if (arrayList.contains(InfoBar.ButtonType.GIFTS_LINK)) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.g("gifts_im_birthday_banner");
            aVar.c("action", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            aVar.b("peer_id", Long.valueOf(j));
            aVar.i("StatlogTracker");
            bVar.k(aVar.e());
        }
    }
}
