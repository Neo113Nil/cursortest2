package xsna;

import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.BuildConfig;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.metrics.eventtracking.Event;
import kotlin.Pair;
import xsna.pq8;

/* compiled from: BotKeyboardReporterImpl.kt */
/* loaded from: classes5.dex */
public final class f38 implements e38 {
    public final ohp0 a;
    public final b25 b;
    public final g3j c;
    public final Object d = pn00.k(new Pair(BotButton.Location.class, "location"), new Pair(BotButton.Text.class, BuildConfig.FLAVOR), new Pair(BotButton.Link.class, "link"), new Pair(BotButton.VkApps.class, MBridgeConstans.DYNAMIC_VIEW_WX_APP), new Pair(BotButton.VkPay.class, "vk_pay"), new Pair(BotButton.ModalView.class, "modal_view"));

    public f38(ohp0 ohp0Var, b25 b25Var, g3j g3jVar) {
        this.a = ohp0Var;
        this.b = b25Var;
        this.c = g3jVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.e38
    public final void a(long j, MsgSendSource msgSendSource) {
        String str;
        pq8.a aVar;
        if (msgSendSource instanceof MsgSendSource.b) {
            MsgSendSource.b bVar = (MsgSendSource.b) msgSendSource;
            if (bVar instanceof MsgSendSource.a) {
                str = "message_send_from_keyboard";
            } else if (!(bVar instanceof MsgSendSource.c)) {
                return;
            } else {
                str = "vkm_carousel_click";
            }
            String str2 = str;
            String str3 = (String) this.d.get(bVar.a.getClass());
            if (str3 == null) {
                str3 = "unknown";
            }
            if (str3.equals("modal_view") && !((Boolean) this.c.invoke()).booleanValue()) {
                str3 = "link";
            }
            String str4 = str3;
            BotButton botButton = bVar.a;
            Integer num = null;
            MsgSendSource.c cVar = msgSendSource instanceof MsgSendSource.c ? (MsgSendSource.c) msgSendSource : null;
            if (cVar != null && (aVar = cVar.c) != null) {
                num = Integer.valueOf(aVar.d);
            }
            c(str2, str4, j, botButton, num);
        }
    }

    @Override // xsna.e38
    public final void b(int i, long j, String str) {
        c("vkm_carousel_click", str, j, null, Integer.valueOf(i));
    }

    public final void c(String str, String str2, long j, BotButton botButton, Integer num) {
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g(str);
        aVar.c("type", str2);
        aVar.b("peer_id", Long.valueOf(j));
        aVar.a(this.b.c(), "from_id");
        if (num != null) {
            aVar.b("card_position", num);
        }
        if (botButton != null) {
            aVar.a(Boolean.valueOf(botButton.Bb()), "inline");
        }
        if (com.vk.dto.common.b.a(j) && botButton != null) {
            aVar.b("mentioned_id", Long.valueOf(botButton.Ab().d));
        }
        if (botButton instanceof BotButton.VkApps) {
            BotButton.VkApps vkApps = (BotButton.VkApps) botButton;
            aVar.b("app_id", Integer.valueOf(vkApps.j));
            String str3 = vkApps.k;
            if (str3 == null) {
                str3 = "";
            }
            aVar.c("app_owner_id", str3);
        }
        aVar.i("StatlogTracker");
        this.a.k(aVar.e());
    }
}
