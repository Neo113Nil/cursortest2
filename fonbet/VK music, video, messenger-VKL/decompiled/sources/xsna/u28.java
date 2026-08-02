package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.ButtonColor;
import com.vk.im.engine.models.conversations.ButtonType;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: BotsJsonSerializer.kt */
/* loaded from: classes2.dex */
public final class u28 {

    /* compiled from: BotsJsonSerializer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonType.values().length];
            try {
                iArr[ButtonType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonType.LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonType.VKPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonType.VKAPP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonType.CALLBACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonType.MODAL_VIEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ButtonType.UNSUPPORTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static BotButton a(JSONObject jSONObject) {
        ButtonType.a aVar = ButtonType.Companion;
        int optInt = jSONObject.optInt("type");
        aVar.getClass();
        switch (a.$EnumSwitchMapping$0[ButtonType.a.a(optInt).ordinal()]) {
            case 1:
                String optString = jSONObject.optString("payload");
                int optInt2 = jSONObject.optInt(TtmlNode.TAG_SPAN);
                String optString2 = jSONObject.optString("key");
                ButtonColor.a aVar2 = ButtonColor.Companion;
                int optInt3 = jSONObject.optInt("color_id");
                aVar2.getClass();
                ButtonColor a2 = ButtonColor.a.a(optInt3);
                boolean optBoolean = jSONObject.optBoolean("inline");
                Serializer.c<Peer> cVar = Peer.CREATOR;
                return new BotButton.Text(ButtonType.TEXT, optString, optInt2, optString2, a2, optBoolean, Peer.a.b(jSONObject.optLong("author")));
            case 2:
                String optString3 = jSONObject.optString("payload");
                int optInt4 = jSONObject.optInt(TtmlNode.TAG_SPAN);
                boolean optBoolean2 = jSONObject.optBoolean("inline");
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                return new BotButton.Location(ButtonType.LOCATION, optString3, optInt4, optBoolean2, Peer.a.b(jSONObject.optLong("author")));
            case 3:
                String optString4 = jSONObject.optString("payload");
                int optInt5 = jSONObject.optInt(TtmlNode.TAG_SPAN);
                String optString5 = jSONObject.optString("hash");
                boolean optBoolean3 = jSONObject.optBoolean("inline");
                Serializer.c<Peer> cVar3 = Peer.CREATOR;
                return new BotButton.VkPay(ButtonType.VKPAY, optString4, optInt5, optString5, optBoolean3, Peer.a.b(jSONObject.optLong("author")));
            case 4:
                String optString6 = jSONObject.optString("payload");
                int optInt6 = jSONObject.optInt(TtmlNode.TAG_SPAN);
                jSONObject.optString("key");
                jSONObject.optString("link");
                ButtonColor.a aVar3 = ButtonColor.Companion;
                int optInt7 = jSONObject.optInt("color_id");
                aVar3.getClass();
                ButtonColor.a.a(optInt7);
                boolean optBoolean4 = jSONObject.optBoolean("inline");
                Serializer.c<Peer> cVar4 = Peer.CREATOR;
                Peer b = Peer.a.b(jSONObject.optLong("author"));
                String optString7 = jSONObject.optString("hash");
                String optString8 = jSONObject.optString("label");
                return new BotButton.VkApps(ButtonType.VKAPP, optString6, optInt6, jSONObject.optInt("app_id"), jSONObject.optString("app_owner_id"), optString7, optString8, optBoolean4, b);
            case 5:
                String optString9 = jSONObject.optString("payload");
                int optInt8 = jSONObject.optInt(TtmlNode.TAG_SPAN);
                String optString10 = jSONObject.optString("key");
                String optString11 = jSONObject.optString("link");
                ButtonColor.a aVar4 = ButtonColor.Companion;
                int optInt9 = jSONObject.optInt("color_id");
                aVar4.getClass();
                ButtonColor a3 = ButtonColor.a.a(optInt9);
                boolean optBoolean5 = jSONObject.optBoolean("inline");
                Serializer.c<Peer> cVar5 = Peer.CREATOR;
                return new BotButton.Link(ButtonType.LINK, optString9, optInt8, optString10, optString11, a3, optBoolean5, Peer.a.b(jSONObject.optLong("author")));
            case 6:
                String optString12 = jSONObject.optString("payload");
                int optInt10 = jSONObject.optInt(TtmlNode.TAG_SPAN);
                boolean optBoolean6 = jSONObject.optBoolean("inline");
                Serializer.c<Peer> cVar6 = Peer.CREATOR;
                Peer b2 = Peer.a.b(jSONObject.optLong("author"));
                String optString13 = jSONObject.optString("label");
                ButtonColor.a aVar5 = ButtonColor.Companion;
                int optInt11 = jSONObject.optInt("color_id");
                aVar5.getClass();
                return new BotButton.Callback(ButtonType.CALLBACK, optString12, optInt10, optBoolean6, b2, optString13, ButtonColor.a.a(optInt11), jSONObject.optBoolean("is_loading"));
            case 7:
                String optString14 = jSONObject.optString("payload");
                int optInt12 = jSONObject.optInt(TtmlNode.TAG_SPAN);
                String optString15 = jSONObject.optString("key");
                String optString16 = jSONObject.optString("link");
                ButtonColor.a aVar6 = ButtonColor.Companion;
                int optInt13 = jSONObject.optInt("color_id");
                aVar6.getClass();
                ButtonColor a4 = ButtonColor.a.a(optInt13);
                boolean optBoolean7 = jSONObject.optBoolean("inline");
                Serializer.c<Peer> cVar7 = Peer.CREATOR;
                return new BotButton.ModalView(ButtonType.MODAL_VIEW, optString14, optInt12, optString15, optString16, a4, optBoolean7, Peer.a.b(jSONObject.optLong("author")));
            case 8:
                return BotButton.Unsupported.g;
            default:
                return null;
        }
    }

    public static JSONObject b(BotButton botButton) {
        if (botButton instanceof BotButton.Unsupported) {
            BotButton.Unsupported unsupported = (BotButton.Unsupported) botButton;
            w9y w9yVar = new w9y();
            w9yVar.c(Integer.valueOf(unsupported.b.h()), "type");
            w9yVar.e(unsupported.c, "payload");
            w9yVar.c(Integer.valueOf(unsupported.d), TtmlNode.TAG_SPAN);
            s3q0 s3q0Var = s3q0.a;
            return w9yVar.a;
        }
        int i = 12;
        if (botButton instanceof BotButton.Link) {
            return d370.C(new mz((BotButton.Link) botButton, i));
        }
        if (botButton instanceof BotButton.Text) {
            return d370.C(new com.vk.movika.sdk.base.observable.w((BotButton.Text) botButton, 10));
        }
        if (botButton instanceof BotButton.Location) {
            return d370.C(new w8((BotButton.Location) botButton, 13));
        }
        if (botButton instanceof BotButton.VkPay) {
            return d370.C(new ec((BotButton.VkPay) botButton, 11));
        }
        if (botButton instanceof BotButton.VkApps) {
            return d370.C(new pz((BotButton.VkApps) botButton, 7));
        }
        if (botButton instanceof BotButton.Callback) {
            return d370.C(new u8((BotButton.Callback) botButton, 9));
        }
        if (botButton instanceof BotButton.ModalView) {
            return d370.C(new e5((BotButton.ModalView) botButton, 12));
        }
        throw new NoWhenBranchMatchedException();
    }
}
