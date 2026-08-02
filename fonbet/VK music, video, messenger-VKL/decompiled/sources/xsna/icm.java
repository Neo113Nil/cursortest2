package xsna;

import android.database.Cursor;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.im.engine.models.dialogs.TransitionData;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.log.L;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DialogContentReader.kt */
/* loaded from: classes2.dex */
public final class icm {
    public static final bpn0 a = new bpn0(new com.vk.movika.sdk.base.logic.interactor.l(18));
    public static final bpn0 b = new bpn0(new com.vk.movika.sdk.base.logic.interactor.m(11));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x055e  */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v4, types: [com.vk.im.engine.models.dialogs.GroupCallInProgress] */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r46v4, types: [com.vk.im.engine.models.conversations.BotKeyboard] */
    /* JADX WARN: Type inference failed for: r46v5 */
    /* JADX WARN: Type inference failed for: r46v6 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v22, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r52v3 */
    /* JADX WARN: Type inference failed for: r52v4, types: [com.vk.im.engine.models.MsgRequestStatus] */
    /* JADX WARN: Type inference failed for: r52v5 */
    /* JADX WARN: Type inference failed for: r56v1 */
    /* JADX WARN: Type inference failed for: r56v2, types: [com.vk.im.engine.models.dialogs.BusinessNotifyInfo] */
    /* JADX WARN: Type inference failed for: r56v3 */
    /* JADX WARN: Type inference failed for: r71v1 */
    /* JADX WARN: Type inference failed for: r71v2, types: [com.vk.im.engine.models.dialogs.TransitionData] */
    /* JADX WARN: Type inference failed for: r71v3 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.vk.im.engine.models.dialogs.b a(Cursor cursor) {
        WritePermission.State[] stateArr;
        WritePermission.State state;
        InfoBar infoBar;
        List b2;
        InfoBar.Background background;
        InfoBar.Payload payload;
        Object obj;
        List b3;
        ConversationCard conversationCard;
        ChatPermissions chatPermissions;
        ImageList imageList;
        Set S0;
        ChatSettings chatSettings;
        ?? r4;
        ?? groupCallInProgress;
        ?? r46;
        List c;
        List c2;
        ?? r56;
        String F;
        String F2;
        List c3;
        String F3;
        ?? r71;
        boolean x = fl3.x(cursor, "push_server_is_use_sound");
        long C = fl3.C(cursor, "push_server_disabled_until");
        boolean z = (fl3.H(cursor, "push_local_is_use_sound") || fl3.H(cursor, "push_local_disabled_until")) ? false : true;
        Boolean y = fl3.y(cursor, "push_local_is_use_sound");
        boolean booleanValue = y != null ? y.booleanValue() : false;
        Long D = fl3.D(cursor, "push_local_disabled_until");
        long longValue = D != null ? D.longValue() : -1L;
        DraftMsg b4 = b(cursor);
        Integer B = fl3.B(cursor, "msg_request_status_pending");
        byte[] v = fl3.v(cursor, "unread_mention_msg_cnv_ids");
        byte[] v2 = fl3.v(cursor, "tags");
        byte[] v3 = fl3.v(cursor, "expire_msg_cnv_ids");
        Long D2 = fl3.D(cursor, "sort_id_local");
        vjm vjmVar = D2 != null ? new vjm(D2.longValue()) : null;
        long C2 = fl3.C(cursor, "id");
        int A = fl3.A(cursor, "type");
        boolean z2 = z;
        vjm vjmVar2 = new vjm(fl3.C(cursor, "sort_id_server"));
        gkx0 gkx0Var = new gkx0(fl3.C(cursor, "weight"));
        int A2 = fl3.A(cursor, "read_till_in_msg_cnv_id");
        int A3 = fl3.A(cursor, "read_till_out_msg_cnv_id");
        int A4 = fl3.A(cursor, "last_msg_cnv_id");
        int A5 = fl3.A(cursor, "count_unread");
        int A6 = fl3.A(cursor, "read_till_in_msg_cnv_id_local");
        int A7 = fl3.A(cursor, "count_unread_local");
        boolean x2 = fl3.x(cursor, "marked_as_unread_server");
        Boolean y2 = fl3.y(cursor, "marked_as_unread_local");
        PushSettings pushSettings = new PushSettings(x, C);
        PushSettings pushSettings2 = !z2 ? null : new PushSettings(booleanValue, longValue);
        WritePermission.State.a aVar = WritePermission.State.Companion;
        int A8 = fl3.A(cursor, "write_permission");
        aVar.getClass();
        stateArr = WritePermission.State.values;
        int length = stateArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                state = null;
                break;
            }
            state = stateArr[i];
            if (state.i() == A8) {
                break;
            }
            i++;
        }
        if (state == null) {
            throw new IllegalArgumentException(lhg.a(A8, "Illegal id: "));
        }
        WritePermission writePermission = new WritePermission(state, fl3.C(cursor, "write_restricted_till"));
        boolean x3 = fl3.x(cursor, "can_send_money");
        boolean x4 = fl3.x(cursor, "can_receive_money");
        PinnedMsg c4 = c(cursor);
        boolean x5 = fl3.x(cursor, "pinned_msg_visible");
        DraftMsg draftMsg = b4 == null ? DraftMsg.h : b4;
        if (fl3.x(cursor, "bar_exists")) {
            byte[] v4 = fl3.v(cursor, "bar_buttons");
            byte[] v5 = fl3.v(cursor, "bar_background");
            byte[] v6 = fl3.v(cursor, "bar_payload");
            String E = fl3.E(cursor, "bar_name");
            String E2 = fl3.E(cursor, "bar_title");
            String E3 = fl3.E(cursor, "bar_text");
            String E4 = fl3.E(cursor, "bar_icon");
            String E5 = fl3.E(cursor, "bar_lego_icon");
            Integer valueOf = Integer.valueOf(fl3.A(cursor, "bar_icon_size"));
            boolean x6 = fl3.x(cursor, "bar_icon_centered");
            if (v4 == null) {
                b2 = EmptyList.b;
            } else {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                b2 = Serializer.b.b(v4, InfoBar.Button.class.getClassLoader());
            }
            List list = b2;
            boolean x7 = fl3.x(cursor, "bar_can_hide");
            if (v5 == null) {
                background = null;
            } else {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                background = (InfoBar.Background) Serializer.b.a(v5, InfoBar.Background.class.getClassLoader());
            }
            if (v6 == null) {
                payload = null;
            } else {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                payload = (InfoBar.Payload) Serializer.b.a(v6, InfoBar.Payload.class.getClassLoader());
            }
            infoBar = new InfoBar(E, E2, E3, E4, E5, valueOf, null, x6, list, x7, background, payload, null, 4160, null);
        } else {
            infoBar = null;
        }
        byte[] v7 = fl3.v(cursor, "conversation_bar_buttons");
        String F4 = fl3.F(cursor, "conversation_bar_type");
        if (F4 == null) {
            conversationCard = null;
        } else {
            Iterator it = ConversationCard.ConversationBarType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((ConversationCard.ConversationBarType) obj).i(), F4)) {
                    break;
                }
            }
            ConversationCard.ConversationBarType conversationBarType = (ConversationCard.ConversationBarType) obj;
            if (conversationBarType == null) {
                conversationBarType = ConversationCard.ConversationBarType.UNKNOWN;
            }
            ConversationCard.ConversationBarType conversationBarType2 = conversationBarType;
            String F5 = fl3.F(cursor, "conversation_bar_title");
            String F6 = fl3.F(cursor, "conversation_bar_subtitle");
            String F7 = fl3.F(cursor, "conversation_bar_content");
            String F8 = fl3.F(cursor, "conversation_bar_imageurl");
            if (v7 == null) {
                b3 = EmptyList.b;
            } else {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap4 = Serializer.a;
                b3 = Serializer.b.b(v7, ConversationCard.ConversationButton.class.getClassLoader());
            }
            conversationCard = new ConversationCard(conversationBarType2, F5, F6, F7, F8, b3, fl3.F(cursor, "conversation_bar_id"));
        }
        boolean x8 = fl3.x(cursor, "bar_hidden_locally");
        if (fl3.x(cursor, "chat_settings_exists")) {
            byte[] v8 = fl3.v(cursor, "chat_settings_avatar");
            byte[] v9 = fl3.v(cursor, "chat_settings_admins");
            String E6 = fl3.E(cursor, "chat_settings_title");
            if (v8 == null) {
                chatPermissions = null;
                imageList = new ImageList(null, 1, null);
            } else {
                chatPermissions = null;
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap5 = Serializer.a;
                imageList = (ImageList) Serializer.b.a(v8, ImageList.class.getClassLoader());
            }
            ImageList imageList2 = imageList;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer.Type.a aVar2 = Peer.Type.Companion;
            int A9 = fl3.A(cursor, "chat_settings_owner_type");
            aVar2.getClass();
            Peer a2 = Peer.a.a(fl3.C(cursor, "chat_settings_owner_id"), Peer.Type.a.a(A9));
            if (v9 == null) {
                S0 = EmptySet.b;
            } else {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap6 = Serializer.a;
                S0 = j5g.S0(Serializer.b.b(v9, Peer.class.getClassLoader()));
            }
            Set set = S0;
            int A10 = fl3.A(cursor, "chat_settings_members_count");
            boolean x9 = fl3.x(cursor, "chat_settings_is_casper");
            boolean x10 = fl3.x(cursor, "chat_settings_is_writing_disabled");
            long C3 = fl3.C(cursor, "chat_settings_writing_disabled_until");
            boolean x11 = fl3.x(cursor, "chat_settings_is_channel");
            boolean x12 = fl3.x(cursor, "chat_settings_is_kicked");
            boolean x13 = fl3.x(cursor, "chat_settings_is_left");
            boolean x14 = fl3.x(cursor, "chat_settings_is_service");
            boolean x15 = fl3.x(cursor, "chat_settings_is_donut");
            boolean x16 = fl3.x(cursor, "chat_settings_is_incognito");
            boolean x17 = fl3.x(cursor, "chat_settings_is_disable_popup_stickers_autoplay");
            boolean x18 = fl3.x(cursor, "chat_settings_can_invite");
            boolean x19 = fl3.x(cursor, "chat_settings_can_change_info");
            boolean x20 = fl3.x(cursor, "chat_settings_can_change_owner");
            boolean x21 = fl3.x(cursor, "chat_settings_can_change_theme");
            boolean x22 = fl3.x(cursor, "chat_settings_can_change_pinned_msg");
            boolean x23 = fl3.x(cursor, "chat_settings_can_promote_users");
            boolean x24 = fl3.x(cursor, "chat_settings_can_moderate");
            boolean x25 = fl3.x(cursor, "chat_settings_can_copy");
            boolean x26 = fl3.x(cursor, "chat_settings_can_call");
            boolean x27 = fl3.x(cursor, "chat_settings_can_change_service_type");
            boolean x28 = fl3.x(cursor, "chat_settings_can_change_stickers_popup_autoplay");
            chatSettings = new ChatSettings(E6, imageList2, a2, set, A10, x9, x11, x12, x13, x14, x15, x16, x18, x19, x20, x22, x23, x24, x25, x26, fl3.x(cursor, "chat_settings_can_see_invite_link"), fl3.x(cursor, "chat_settings_can_use_mass_mentions"), x27, x28, fl3.x(cursor, "chat_settings_can_disable_service_messages"), fl3.E(cursor, "chat_settings_casper_chat_link"), !fl3.x(cursor, "chat_permissions_exists") ? chatPermissions : new ChatPermissions(fl3.F(cursor, "chat_permissions_who_can_invite"), fl3.F(cursor, "chat_permissions_who_can_change_info"), fl3.F(cursor, "chat_permissions_who_can_change_pin"), fl3.F(cursor, "chat_permissions_who_can_use_mass_mentions"), fl3.F(cursor, "chat_permissions_who_can_see_invite_link"), fl3.F(cursor, "chat_permissions_who_can_call"), fl3.F(cursor, "chat_permissions_who_can_change_admins"), fl3.F(cursor, "chat_permissions_who_can_change_theme")), fl3.D(cursor, "chat_settings_donut_owner_id"), null, x21, fl3.x(cursor, "chat_settings_can_send_reactions"), fl3.x(cursor, "chat_settings_short_poll_reactions"), x10, C3, false, false, x17, fl3.x(cursor, "chat_settings_is_service_messages_disabled"), fl3.x(cursor, "chat_settings_can_forward_messages"), fl3.x(cursor, "chat_settings_can_disable_forward_messages"), 268435456, 12, null);
        } else {
            chatPermissions = null;
            chatSettings = null;
        }
        String F9 = fl3.F(cursor, "group_call_join_link");
        if (F9 == null) {
            groupCallInProgress = chatPermissions;
        } else {
            Boolean y3 = fl3.y(cursor, "group_call_can_finish_call");
            boolean booleanValue2 = y3 != null ? y3.booleanValue() : false;
            String F10 = fl3.F(cursor, "group_call_vk_join_link");
            byte[] v10 = fl3.v(cursor, "group_call_participants");
            if (v10 != null) {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap7 = Serializer.a;
                r4 = new Serializer.d(new DataInputStream(new ByteArrayInputStream(v10))).f();
            } else {
                r4 = chatPermissions;
            }
            if (r4 == 0) {
                r4 = EmptyList.b;
            }
            groupCallInProgress = new GroupCallInProgress(r4, F9, F10, booleanValue2);
        }
        boolean x29 = fl3.x(cursor, "group_call_banner_hidden_locally");
        CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
        com.vk.im.engine.models.dialogs.c a3 = c.a.a(fl3.E(cursor, "theme_id"));
        if (fl3.x(cursor, "keyboard_exists")) {
            byte[] v11 = fl3.v(cursor, "keyboard_buttons");
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            Peer.Type.a aVar3 = Peer.Type.Companion;
            int A11 = fl3.A(cursor, "keyboard_author_type");
            aVar3.getClass();
            r46 = new BotKeyboard(Peer.a.a(fl3.C(cursor, "keyboard_author_id"), Peer.Type.a.a(A11)), fl3.x(cursor, "keyboard_one_time"), false, fl3.A(cursor, "keyboard_column_count"), v11 != null ? apm0.a(v11) : EmptyList.b, 4, null);
        } else {
            r46 = chatPermissions;
        }
        boolean x30 = fl3.x(cursor, "keyboard_visible");
        MsgRequestStatus.a aVar4 = MsgRequestStatus.Companion;
        int A12 = fl3.A(cursor, "msg_request_status");
        aVar4.getClass();
        MsgRequestStatus a4 = MsgRequestStatus.a.a(A12);
        Serializer.c<Peer> cVar3 = Peer.CREATOR;
        Peer.Type.a aVar5 = Peer.Type.Companion;
        int A13 = fl3.A(cursor, "msg_request_inviter_type");
        aVar5.getClass();
        Peer a5 = Peer.a.a(fl3.C(cursor, "msg_request_inviter_id"), Peer.Type.a.a(A13));
        long C4 = fl3.C(cursor, "msg_request_date");
        ?? a6 = B == null ? chatPermissions : MsgRequestStatus.a.a(B.intValue());
        if (v == null) {
            c = EmptyList.b;
        } else {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap8 = Serializer.a;
            c = Serializer.b.c(v);
        }
        List list2 = c;
        if (v3 == null) {
            c2 = EmptyList.b;
        } else {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap9 = Serializer.a;
            c2 = Serializer.b.c(v3);
        }
        List list3 = c2;
        Long D3 = fl3.D(cursor, "business_notify_info_dialog_id");
        if (D3 != null) {
            long longValue2 = D3.longValue();
            Integer B2 = fl3.B(cursor, "business_notify_info_last_msg_cnv_id");
            if (B2 != null) {
                int intValue = B2.intValue();
                Integer B3 = fl3.B(cursor, "business_notify_info_count_unread");
                if (B3 != null) {
                    r56 = new BusinessNotifyInfo(longValue2, intValue, B3.intValue());
                    boolean x31 = fl3.x(cursor, "business_notify_info_visible");
                    int A14 = fl3.A(cursor, "phase_id");
                    int A15 = fl3.A(cursor, "spam_expiration");
                    boolean x32 = fl3.x(cursor, "is_new");
                    boolean x33 = fl3.x(cursor, "is_archived");
                    boolean x34 = fl3.x(cursor, "is_promo");
                    String F11 = fl3.F(cursor, "payload");
                    F = fl3.F(cursor, "unread_reactions");
                    if (F != null || (r2 = dz5.E(new JSONArray(F))) == null) {
                        List list4 = EmptyList.b;
                    }
                    List list5 = list4;
                    F2 = fl3.F(cursor, "locally_read_reactions");
                    if (F2 != null || (r2 = dz5.E(new JSONArray(F2))) == null) {
                        List list6 = EmptyList.b;
                    }
                    List list7 = list6;
                    int A16 = fl3.A(cursor, "flags");
                    long C5 = fl3.C(cursor, "version");
                    if (v2 != null) {
                        c3 = EmptyList.b;
                    } else {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap10 = Serializer.a;
                        c3 = Serializer.b.c(v2);
                    }
                    List list8 = c3;
                    boolean x35 = fl3.x(cursor, "is_dead");
                    boolean x36 = fl3.x(cursor, "can_promo_gifts");
                    F3 = fl3.F(cursor, "transition_data");
                    if (F3 != null) {
                        Serializer.c<TransitionData> cVar4 = TransitionData.CREATOR;
                        if (F3.length() != 0) {
                            JSONObject jSONObject = new JSONObject(F3);
                            JSONArray optJSONArray = jSONObject.optJSONArray("user_ids");
                            r71 = new TransitionData((List<Long>) (optJSONArray != null ? f370.L(optJSONArray) : chatPermissions), f370.A("link", jSONObject));
                            return new com.vk.im.engine.models.dialogs.b(C2, A, vjmVar2, vjmVar, gkx0Var, A2, A3, A4, A5, A6, A7, x2, y2, pushSettings, pushSettings2, writePermission, x3, x4, c4, x5, draftMsg, infoBar, conversationCard, x8, chatSettings, groupCallInProgress, x29, a3, r46, x30, a4, a5, C4, a6, list2, list8, list3, r56, x31, A14, A15, x32, x33, x34, F11, list5, list7, A16, C5, x35, x36, r71, (int) fl3.C(cursor, "timestamp"));
                        }
                    }
                    r71 = chatPermissions;
                    return new com.vk.im.engine.models.dialogs.b(C2, A, vjmVar2, vjmVar, gkx0Var, A2, A3, A4, A5, A6, A7, x2, y2, pushSettings, pushSettings2, writePermission, x3, x4, c4, x5, draftMsg, infoBar, conversationCard, x8, chatSettings, groupCallInProgress, x29, a3, r46, x30, a4, a5, C4, a6, list2, list8, list3, r56, x31, A14, A15, x32, x33, x34, F11, list5, list7, A16, C5, x35, x36, r71, (int) fl3.C(cursor, "timestamp"));
                }
            }
        }
        r56 = chatPermissions;
        boolean x312 = fl3.x(cursor, "business_notify_info_visible");
        int A142 = fl3.A(cursor, "phase_id");
        int A152 = fl3.A(cursor, "spam_expiration");
        boolean x322 = fl3.x(cursor, "is_new");
        boolean x332 = fl3.x(cursor, "is_archived");
        boolean x342 = fl3.x(cursor, "is_promo");
        String F112 = fl3.F(cursor, "payload");
        F = fl3.F(cursor, "unread_reactions");
        if (F != null) {
        }
        List list42 = EmptyList.b;
        List list52 = list42;
        F2 = fl3.F(cursor, "locally_read_reactions");
        if (F2 != null) {
        }
        List list62 = EmptyList.b;
        List list72 = list62;
        int A162 = fl3.A(cursor, "flags");
        long C52 = fl3.C(cursor, "version");
        if (v2 != null) {
        }
        List list82 = c3;
        boolean x352 = fl3.x(cursor, "is_dead");
        boolean x362 = fl3.x(cursor, "can_promo_gifts");
        F3 = fl3.F(cursor, "transition_data");
        if (F3 != null) {
        }
        r71 = chatPermissions;
        return new com.vk.im.engine.models.dialogs.b(C2, A, vjmVar2, vjmVar, gkx0Var, A2, A3, A4, A5, A6, A7, x2, y2, pushSettings, pushSettings2, writePermission, x3, x4, c4, x5, draftMsg, infoBar, conversationCard, x8, chatSettings, groupCallInProgress, x29, a3, r46, x30, a4, a5, C4, a6, list2, list82, list3, r56, x312, A142, A152, x322, x332, x342, F112, list52, list72, A162, C52, x352, x362, r71, (int) fl3.C(cursor, "timestamp"));
    }

    public static DraftMsg b(Cursor cursor) {
        byte[] v = fl3.v(cursor, "draft_msg");
        if (v != null) {
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                return (DraftMsg) Serializer.b.a(v, DraftMsg.class.getClassLoader());
            } catch (Throwable th) {
                L.e(th, "Error while reading draftMsg");
            }
        }
        return null;
    }

    public static PinnedMsg c(Cursor cursor) {
        ArrayList b2;
        ArrayList b3;
        ArrayList arrayList = null;
        if (!fl3.x(cursor, "pinned_msg_exists")) {
            return null;
        }
        byte[] v = fl3.v(cursor, "pinned_msg_attaches");
        byte[] v2 = fl3.v(cursor, "pinned_msg_nested");
        byte[] v3 = fl3.v(cursor, "pinned_carousel");
        PinnedMsg pinnedMsg = new PinnedMsg();
        pinnedMsg.b = fl3.C(cursor, "id");
        pinnedMsg.c = fl3.A(cursor, "pinned_msg_cnv_msg_id");
        pinnedMsg.m = fl3.x(cursor, "pinned_msg_is_unavailable");
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.Type.a aVar = Peer.Type.Companion;
        int A = fl3.A(cursor, "pinned_msg_from_type");
        aVar.getClass();
        pinnedMsg.d = Peer.a.a(fl3.C(cursor, "pinned_msg_from_id"), Peer.Type.a.a(A));
        pinnedMsg.e = fl3.C(cursor, "pinned_msg_time");
        pinnedMsg.f = fl3.E(cursor, "pinned_msg_title");
        pinnedMsg.g = fl3.E(cursor, "pinned_msg_body");
        MsgTextFormat msgTextFormat = MsgTextFormat.d;
        pinnedMsg.h = MsgTextFormat.a.a(fl3.F(cursor, "pinned_msg_body_format"));
        if (v == null) {
            b2 = new ArrayList();
        } else {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            b2 = Serializer.b.b(v, Attach.class.getClassLoader());
        }
        pinnedMsg.i = b2;
        if (v2 == null) {
            b3 = new ArrayList();
        } else {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
            b3 = Serializer.b.b(v2, NestedMsg.class.getClassLoader());
        }
        pinnedMsg.j = b3;
        if (v3 != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
            arrayList = Serializer.b.b(v3, CarouselItem.class.getClassLoader());
        }
        pinnedMsg.k = arrayList;
        return pinnedMsg;
    }
}
