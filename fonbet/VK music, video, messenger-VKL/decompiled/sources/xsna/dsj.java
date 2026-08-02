package xsna;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.CallParticipants;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.im.engine.models.dialogs.TransitionData;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.messages.PinnedMsg;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.lvw;

/* compiled from: ConversationParser.kt */
/* loaded from: classes2.dex */
public final class dsj {
    public static void a(com.vk.im.engine.models.dialogs.a aVar, ProfilesSimpleInfo profilesSimpleInfo) {
        if (profilesSimpleInfo.isEmpty()) {
            return;
        }
        PinnedMsg pinnedMsg = aVar.m;
        if (pinnedMsg == null) {
            pinnedMsg = null;
        } else if (!profilesSimpleInfo.isEmpty()) {
            Iterator it = pinnedMsg.i.iterator();
            while (it.hasNext()) {
                w04.b((Attach) it.next(), profilesSimpleInfo);
            }
            Iterator it2 = pinnedMsg.j.iterator();
            while (it2.hasNext()) {
                qoa0.a((NestedMsg) it2.next(), profilesSimpleInfo);
            }
        }
        aVar.m = pinnedMsg;
    }

    public static com.vk.im.engine.models.dialogs.a b(JSONObject jSONObject, f1e0 f1e0Var) throws VKApiException {
        try {
            return c(jSONObject, f1e0Var);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0404  */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.vk.im.engine.models.dialogs.TransitionData] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r44v2, types: [com.vk.im.engine.models.dialogs.TransitionData] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.vk.im.engine.models.dialogs.a c(JSONObject jSONObject, f1e0 f1e0Var) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        Peer b;
        MsgRequestStatus msgRequestStatus;
        Triple triple;
        JSONObject jSONObject4;
        Peer peer;
        long j;
        PushSettings pushSettings;
        BotKeyboard botKeyboard;
        WritePermission writePermission;
        PinnedMsg c;
        boolean z;
        InfoBar infoBar;
        long j2;
        ConversationCard conversationCard;
        JSONObject jSONObject5;
        ?? r6;
        ChatSettings chatSettings;
        GroupCallInProgress groupCallInProgress;
        String str;
        com.vk.im.engine.models.dialogs.c a;
        JSONArray optJSONArray;
        int i;
        EmptyList emptyList;
        JSONObject optJSONObject;
        List list;
        EmptyList emptyList2;
        GroupCallInProgress groupCallInProgress2;
        BusinessNotifyInfo businessNotifyInfo;
        JSONObject optJSONObject2;
        boolean z2;
        boolean z3;
        Object obj;
        JSONObject jSONObject6 = jSONObject.getJSONObject("peer");
        long j3 = jSONObject6.getLong("id");
        Serializer.c<Peer> cVar = Peer.CREATOR;
        f1e0Var.c(Peer.a.b(j3));
        if (j3 == 0) {
            throw new VKApiIllegalResponseException(cq.c("Illegal peerId value ", jSONObject6));
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("sort_id");
        int i2 = jSONObject.getInt("in_read_cmid");
        int i3 = jSONObject.getInt("out_read_cmid");
        int i4 = jSONObject.has("unread_count") ? jSONObject.getInt("unread_count") : 0;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("current_keyboard");
        String D = f370.D(jSONObject, TtmlNode.TAG_STYLE);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("chat_settings");
        JSONObject optJSONObject5 = jSONObject.optJSONObject("call_in_progress");
        JSONObject optJSONObject6 = jSONObject.optJSONObject("conversation_bar");
        JSONObject optJSONObject7 = jSONObject.optJSONObject("conversation_card");
        JSONObject optJSONObject8 = optJSONObject4 != null ? optJSONObject4.optJSONObject("pinned_message") : null;
        int i5 = i4;
        JSONObject optJSONObject9 = jSONObject.optJSONObject("can_write");
        if (optJSONObject9 == null) {
            optJSONObject9 = new JSONObject();
        }
        int i6 = i2;
        if (jSONObject.has("message_request_data")) {
            jSONObject2 = optJSONObject5;
            jSONObject3 = optJSONObject4;
            JSONObject jSONObject8 = jSONObject.getJSONObject("message_request_data");
            boolean has = jSONObject8.has("inviter_id");
            if (has) {
                b = Peer.a.b(jSONObject8.has("inviter_id") ? jSONObject8.getLong("inviter_id") : 0L);
            } else {
                if (has) {
                    throw new NoWhenBranchMatchedException();
                }
                b = Peer.a.b(j3);
            }
            long j4 = jSONObject8.has("request_date") ? jSONObject8.getLong("request_date") : 0L;
            String string = jSONObject8.has("status") ? jSONObject8.getString("status") : "";
            int hashCode = string.hashCode();
            if (hashCode == -2146525273) {
                if (string.equals("accepted")) {
                    msgRequestStatus = MsgRequestStatus.ACCEPTED;
                    triple = new Triple(b, Long.valueOf(j4), msgRequestStatus);
                }
                msgRequestStatus = MsgRequestStatus.NONE;
                triple = new Triple(b, Long.valueOf(j4), msgRequestStatus);
            } else if (hashCode != -682587753) {
                if (hashCode == -608496514 && string.equals("rejected")) {
                    msgRequestStatus = MsgRequestStatus.REJECTED;
                    triple = new Triple(b, Long.valueOf(j4), msgRequestStatus);
                }
                msgRequestStatus = MsgRequestStatus.NONE;
                triple = new Triple(b, Long.valueOf(j4), msgRequestStatus);
            } else {
                if (string.equals("pending")) {
                    msgRequestStatus = MsgRequestStatus.PENDING;
                    triple = new Triple(b, Long.valueOf(j4), msgRequestStatus);
                }
                msgRequestStatus = MsgRequestStatus.NONE;
                triple = new Triple(b, Long.valueOf(j4), msgRequestStatus);
            }
        } else {
            jSONObject2 = optJSONObject5;
            jSONObject3 = optJSONObject4;
            triple = new Triple(Peer.Unknown.e, 0L, MsgRequestStatus.NONE);
        }
        Peer peer2 = (Peer) triple.d();
        long longValue = ((Number) triple.g()).longValue();
        MsgRequestStatus msgRequestStatus2 = (MsgRequestStatus) triple.h();
        JSONObject optJSONObject10 = jSONObject.optJSONObject("push_settings");
        if (optJSONObject10 == null) {
            jSONObject4 = optJSONObject7;
            peer = peer2;
            pushSettings = new PushSettings(true, 0L);
        } else {
            jSONObject4 = optJSONObject7;
            peer = peer2;
            boolean z4 = !optJSONObject10.getBoolean("no_sound");
            if (optJSONObject10.getBoolean("disabled_forever")) {
                j = -1;
            } else {
                j = (optJSONObject10.has("disabled_until") ? optJSONObject10.getLong("disabled_until") : 0L) * 1000;
            }
            pushSettings = new PushSettings(z4, j);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("unread_reactions");
        List J = optJSONArray2 != null ? f370.J(optJSONArray2) : EmptyList.b;
        try {
            botKeyboard = yey.b(optJSONObject3, Peer.Unknown.e);
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            botKeyboard = null;
        }
        if (botKeyboard != null && botKeyboard.d) {
            botKeyboard = null;
        }
        String string2 = jSONObject.has("special_service_type") ? jSONObject.getString("special_service_type") : "";
        int i7 = string2.equals("") ? 0 : string2.equals("business_notify") ? 1 : -1;
        BotKeyboard botKeyboard2 = botKeyboard;
        vjm vjmVar = new vjm(jSONObject7.getInt("major_id"), jSONObject7.getInt("minor_id"));
        int i8 = jSONObject.has("last_conversation_message_id") ? jSONObject.getInt("last_conversation_message_id") : 0;
        boolean z5 = jSONObject.has("is_marked_unread") ? jSONObject.getBoolean("is_marked_unread") : false;
        boolean z6 = optJSONObject9.has("allowed") ? optJSONObject9.getBoolean("allowed") : false;
        int i9 = i8;
        int i10 = optJSONObject9.has("reason") ? optJSONObject9.getInt("reason") : 0;
        boolean z7 = z5;
        long j5 = optJSONObject9.has("until") ? optJSONObject9.getLong("until") : -1L;
        if (z6) {
            writePermission = new WritePermission(WritePermission.State.ENABLED);
        } else {
            if (z6) {
                throw new NoWhenBranchMatchedException();
            }
            if (i10 == 18) {
                writePermission = new WritePermission(WritePermission.State.DISABLED_RECEIVER_DELETED);
            } else if (i10 == 203) {
                writePermission = new WritePermission(WritePermission.State.DISABLED_RECEIVER_ACCESS_DENIED);
            } else if (i10 == 962) {
                writePermission = new WritePermission(WritePermission.State.DISABLED_DONUT_EXPIRED);
            } else if (i10 == 993) {
                writePermission = new WritePermission(WritePermission.State.DISABLED_MOVED_TO_MAX);
            } else if (i10 == 1012) {
                writePermission = new WritePermission(WritePermission.State.DISABLED_RESTRICTED_TO_ALL, j5);
            } else if (i10 == 945) {
                writePermission = new WritePermission(WritePermission.State.DISABLED_COMMUNITY_CHAT);
            } else if (i10 != 946) {
                switch (i10) {
                    case 900:
                        writePermission = new WritePermission(WritePermission.State.DISABLED_RECIPIENT_BLACKLISTED);
                        break;
                    case 901:
                        writePermission = new WritePermission(WritePermission.State.DISABLED_RECEIVER_PERMISSION_REQUIRED);
                        break;
                    case 902:
                        writePermission = new WritePermission(WritePermission.State.DISABLED_RECEIVER_PRIVACY_SETTINGS);
                        break;
                    default:
                        switch (i10) {
                            case 915:
                                writePermission = new WritePermission(WritePermission.State.DISABLED_RECEIVER_MSG_NOT_ENABLED);
                                break;
                            case 916:
                                writePermission = new WritePermission(WritePermission.State.DISABLED_SENDER_FORBIDDEN);
                                break;
                            case 917:
                                writePermission = new WritePermission(WritePermission.State.DISABLED_RECEIVER_ACCESS_DENIED);
                                break;
                            default:
                                switch (i10) {
                                    case 983:
                                        writePermission = new WritePermission(WritePermission.State.DISABLED_RESTRICTED, j5);
                                        break;
                                    case 984:
                                        writePermission = new WritePermission(WritePermission.State.DISABLED_DUE_SPAM);
                                        break;
                                    case 985:
                                        writePermission = new WritePermission(WritePermission.State.DISABLED_BROADCAST);
                                        break;
                                    case 986:
                                        writePermission = new WritePermission(WritePermission.State.DISABLED_NEED_EDU_ROLE, j5);
                                        break;
                                    case 987:
                                        writePermission = new WritePermission(WritePermission.State.DISABLED_NEED_MESSAGE_REQUEST, j5);
                                        break;
                                    case 988:
                                        writePermission = new WritePermission(WritePermission.State.DISABLED_PENDING_MESSAGE_REQUEST, j5);
                                        break;
                                    default:
                                        writePermission = new WritePermission(WritePermission.State.DISABLED_UNKNOWN);
                                        break;
                                }
                        }
                }
            } else {
                writePermission = new WritePermission(WritePermission.State.DISABLED_UNAVAILABLE);
            }
        }
        boolean z8 = jSONObject.has("can_send_money") ? jSONObject.getBoolean("can_send_money") : false;
        boolean z9 = jSONObject.has("can_receive_money") ? jSONObject.getBoolean("can_receive_money") : false;
        if (optJSONObject8 == null) {
            c = null;
        } else {
            try {
                c = qoa0.c(optJSONObject8, f1e0Var, j3);
            } catch (JSONException e2) {
                throw new VKApiIllegalResponseException(e2);
            }
        }
        WritePermission writePermission2 = writePermission;
        if (optJSONObject6 != null) {
            z = z8;
            try {
                String string3 = optJSONObject6.has("name") ? optJSONObject6.getString("name") : "";
                String string4 = optJSONObject6.has("title") ? optJSONObject6.getString("title") : "";
                String string5 = optJSONObject6.has("text") ? optJSONObject6.getString("text") : "";
                String string6 = optJSONObject6.has("icon") ? optJSONObject6.getString("icon") : "";
                String string7 = optJSONObject6.has("lego_icon") ? optJSONObject6.getString("lego_icon") : "";
                JSONArray optJSONArray3 = optJSONObject6.optJSONArray("buttons");
                List b2 = optJSONArray3 != null ? lvw.b(optJSONArray3) : EmptyList.b;
                boolean z10 = optJSONObject6.has("can_hide") ? optJSONObject6.getBoolean("can_hide") : true;
                JSONObject optJSONObject11 = optJSONObject6.optJSONObject("payload");
                InfoBar.Payload d = optJSONObject11 != null ? lvw.d(optJSONObject11) : null;
                JSONObject optJSONObject12 = optJSONObject6.optJSONObject(L2.g);
                infoBar = new InfoBar(string3, string4, string5, string6, string7, null, null, false, b2, z10, optJSONObject12 != null ? lvw.a(optJSONObject12) : null, d, f370.x(optJSONObject6, "expired_timestamp"), 224, null);
            } catch (JSONException unused) {
                throw new VKApiIllegalResponseException(cq.c("Incorrect bar format: ", optJSONObject6));
            } catch (lvw.a unused2) {
            }
            if (jSONObject4 == null) {
                JSONObject jSONObject9 = jSONObject4;
                try {
                    String string8 = jSONObject9.getString("type");
                    Iterator it = ConversationCard.ConversationBarType.h().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            j2 = j3;
                            if (!epx.f(((ConversationCard.ConversationBarType) obj).i(), string8)) {
                                j3 = j2;
                            }
                        } else {
                            j2 = j3;
                            obj = null;
                        }
                    }
                    ConversationCard.ConversationBarType conversationBarType = (ConversationCard.ConversationBarType) obj;
                    if (conversationBarType == null) {
                        conversationBarType = ConversationCard.ConversationBarType.UNKNOWN;
                    }
                    ConversationCard.ConversationBarType conversationBarType2 = conversationBarType;
                    String D2 = f370.D(jSONObject9, "title");
                    String D3 = f370.D(jSONObject9, "image");
                    String D4 = f370.D(jSONObject9, "subtitle");
                    String D5 = f370.D(jSONObject9, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
                    JSONArray optJSONArray4 = jSONObject9.optJSONArray("buttons");
                    conversationCard = new ConversationCard(conversationBarType2, D2, D4, D5, D3, optJSONArray4 != null ? irj.a(optJSONArray4) : null, f370.D(jSONObject9, "id"));
                } catch (JSONException unused3) {
                    throw new VKApiIllegalResponseException(cq.c("Incorrect conversation bar format: ", jSONObject9));
                }
            } else {
                j2 = j3;
                conversationCard = null;
            }
            if (jSONObject3 != null) {
                chatSettings = null;
                jSONObject5 = jSONObject3;
            } else {
                jSONObject5 = jSONObject3;
                JSONObject optJSONObject13 = jSONObject5.optJSONObject("acl");
                JSONObject optJSONObject14 = jSONObject5.optJSONObject("writing_disabled");
                String string9 = jSONObject5.getString("title");
                JSONObject optJSONObject15 = jSONObject5.optJSONObject("photo");
                ImageList a2 = optJSONObject15 != null ? pr5.a(optJSONObject15) : pr5.a;
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                Peer b3 = Peer.a.b(jSONObject5.getLong("owner_id"));
                JSONArray optJSONArray5 = jSONObject5.optJSONArray("admin_ids");
                if (optJSONArray5 == null || optJSONArray5.length() == 0) {
                    r6 = EmptySet.b;
                } else {
                    r6 = new HashSet();
                    int length = optJSONArray5.length();
                    int i11 = 0;
                    while (i11 < length) {
                        long j6 = optJSONArray5.getLong(i11);
                        Serializer.c<Peer> cVar3 = Peer.CREATOR;
                        r6.add(Peer.a.b(j6));
                        i11++;
                        optJSONArray5 = optJSONArray5;
                    }
                }
                Set set = r6;
                int optInt = jSONObject5.optInt("members_count", 0);
                boolean optBoolean = jSONObject5.optBoolean("is_disappearing", false);
                boolean optBoolean2 = jSONObject5.optBoolean("is_group_channel", false);
                boolean f = epx.f(jSONObject5.optString("state", ""), "kicked");
                boolean f2 = epx.f(jSONObject5.optString("state", ""), TtmlNode.LEFT);
                boolean optBoolean3 = jSONObject5.optBoolean("is_service");
                boolean optBoolean4 = jSONObject5.optBoolean("is_donut");
                boolean optBoolean5 = jSONObject5.optBoolean("is_incognito");
                boolean optBoolean6 = jSONObject5.optBoolean("is_stickers_popup_autoplay_disabled");
                boolean z11 = optJSONObject13 != null ? optJSONObject13.getBoolean("can_invite") : true;
                boolean z12 = optJSONObject13 != null ? optJSONObject13.getBoolean("can_change_info") : true;
                boolean z13 = optJSONObject13 != null ? optJSONObject13.getBoolean("can_change_owner") : false;
                boolean optBoolean7 = optJSONObject13 != null ? optJSONObject13.optBoolean("can_change_style") : false;
                boolean z14 = optJSONObject13 != null ? optJSONObject13.getBoolean("can_change_pin") : true;
                boolean z15 = optJSONObject13 != null ? optJSONObject13.getBoolean("can_promote_users") : true;
                boolean z16 = optJSONObject13 != null ? optJSONObject13.getBoolean("can_moderate") : false;
                boolean z17 = optJSONObject13 != null ? optJSONObject13.getBoolean("can_copy_chat") : false;
                boolean optBoolean8 = optJSONObject13 != null ? optJSONObject13.optBoolean("can_call", false) : false;
                boolean optBoolean9 = optJSONObject13 != null ? optJSONObject13.optBoolean("can_see_invite_link") : false;
                boolean optBoolean10 = optJSONObject13 != null ? optJSONObject13.optBoolean("can_use_mass_mentions") : false;
                boolean optBoolean11 = optJSONObject13 != null ? optJSONObject13.optBoolean("can_change_service_type") : false;
                boolean optBoolean12 = optJSONObject13 != null ? optJSONObject13.optBoolean("can_change_stickers_popup_autoplay") : false;
                boolean optBoolean13 = optJSONObject13 != null ? optJSONObject13.optBoolean("can_disable_service_messages") : false;
                String string10 = jSONObject5.has("disappearing_chat_link") ? jSONObject5.getString("disappearing_chat_link") : "";
                JSONObject optJSONObject16 = jSONObject5.optJSONObject(SignalingProtocol.KEY_PERMISSIONS);
                chatSettings = new ChatSettings(string9, a2, b3, set, optInt, optBoolean, optBoolean2, f, f2, optBoolean3, optBoolean4, optBoolean5, z11, z12, z13, z14, z15, z16, z17, optBoolean8, optBoolean9, optBoolean10, optBoolean11, optBoolean12, optBoolean13, string10, optJSONObject16 == null ? null : new ChatPermissions(f370.D(optJSONObject16, "invite"), f370.D(optJSONObject16, "change_info"), f370.D(optJSONObject16, "change_pin"), f370.D(optJSONObject16, "use_mass_mentions"), f370.D(optJSONObject16, "see_invite_link"), f370.D(optJSONObject16, NotificationCompat.CATEGORY_CALL), f370.D(optJSONObject16, "change_admins"), f370.D(optJSONObject16, "change_style")), Long.valueOf(jSONObject5.optLong("donut_owner_id")), Integer.valueOf(jSONObject5.optInt("type_mask")), optBoolean7, optJSONObject13 != null ? optJSONObject13.optBoolean("can_send_reactions") : false, jSONObject5.optBoolean("short_poll_reactions"), optJSONObject14 != null ? optJSONObject14.optBoolean("value") : false, optJSONObject14 != null ? optJSONObject14.optLong("until_ts") : 0L, jSONObject5.optBoolean("is_deleted_for_all"), false, optBoolean6, jSONObject5.optBoolean("disable_service_messages"), optJSONObject13 != null ? optJSONObject13.optBoolean("can_forward_messages", true) : true, optJSONObject13 != null ? optJSONObject13.optBoolean("can_disable_forward_messages") : false, 0, 8, null);
                f1e0Var.c(chatSettings.d);
            }
            if (jSONObject2 != null) {
                groupCallInProgress = null;
            } else {
                JSONObject jSONObject10 = jSONObject2;
                CallParticipants a3 = m89.a(jSONObject10.optJSONObject(SignalingProtocol.KEY_PARTICIPANTS), f1e0Var);
                if (a3 == null) {
                    a3 = CallParticipants.d;
                }
                groupCallInProgress = new GroupCallInProgress(a3.b, f370.D(jSONObject10, ApiProtocol.KEY_JOIN_LINK), f370.D(jSONObject10, "vk_join_link"), jSONObject10.has("can_finish_call") ? jSONObject10.getBoolean("can_finish_call") : false);
            }
            if (D == null) {
                CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
                a = c.a.a(D);
            } else {
                if (jSONObject5 == null || (str = f370.D(jSONObject5, "theme")) == null) {
                    str = c.C1124c.c.a;
                }
                CopyOnWriteArraySet copyOnWriteArraySet2 = com.vk.im.engine.models.dialogs.c.b;
                a = c.a.a(str);
            }
            optJSONArray = jSONObject.optJSONArray("mention_cmids");
            if (optJSONArray == null) {
                ArrayList J2 = f370.J(optJSONArray);
                ?? arrayList = new ArrayList();
                Iterator it2 = J2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i12 = i6;
                    if (((Number) next).intValue() > i12) {
                        arrayList.add(next);
                    }
                    i6 = i12;
                }
                i = i6;
                emptyList = arrayList;
            } else {
                i = i6;
                emptyList = EmptyList.b;
            }
            JSONArray optJSONArray6 = jSONObject.optJSONArray("expire_cmids");
            List J3 = optJSONArray6 == null ? f370.J(optJSONArray6) : EmptyList.b;
            optJSONObject = jSONObject.optJSONObject("business_notify_data");
            if (optJSONObject == null) {
                list = J3;
                emptyList2 = emptyList;
                groupCallInProgress2 = groupCallInProgress;
                businessNotifyInfo = new BusinessNotifyInfo(optJSONObject.getLong("peer_id"), optJSONObject.getInt("last_cmid"), optJSONObject.has("unread_count") ? optJSONObject.getInt("unread_count") : 0);
            } else {
                list = J3;
                emptyList2 = emptyList;
                groupCallInProgress2 = groupCallInProgress;
                businessNotifyInfo = null;
            }
            int optInt2 = jSONObject.optInt("spam_expiration");
            boolean optBoolean14 = jSONObject.optBoolean("is_new");
            boolean optBoolean15 = jSONObject.optBoolean("is_archived");
            boolean optBoolean16 = jSONObject.optBoolean("is_promo");
            JSONObject jSONObject11 = new JSONObject();
            if (jSONObject.has("payload")) {
                jSONObject11.put("payload", jSONObject.optJSONObject("payload"));
            }
            String jSONObject12 = jSONObject11.toString();
            int optInt3 = jSONObject.optInt("peer_flags");
            long optLong = jSONObject.optLong("version", 0L);
            boolean z18 = !jSONObject.optBoolean("alive", true);
            boolean optBoolean17 = jSONObject.optBoolean("is_gift_suggestion_enabled", false);
            JSONArray optJSONArray7 = jSONObject.optJSONArray("tags");
            List J4 = optJSONArray7 == null ? f370.J(optJSONArray7) : EmptyList.b;
            com.vk.im.engine.models.dialogs.c cVar4 = a;
            optJSONObject2 = jSONObject.optJSONObject("transition_data");
            if (optJSONObject2 == null) {
                z2 = optBoolean17;
                JSONArray optJSONArray8 = optJSONObject2.optJSONArray("user_ids");
                z3 = optBoolean15;
                r19 = new TransitionData(optJSONArray8 != null ? f370.L(optJSONArray8) : null, f370.A("link", optJSONObject2));
            } else {
                z2 = optBoolean17;
                z3 = optBoolean15;
            }
            return new com.vk.im.engine.models.dialogs.a(j2, i7, vjmVar, i, i3, i9, i5, z7, pushSettings, writePermission2, z, z9, c, infoBar, conversationCard, chatSettings, groupCallInProgress2, cVar4, botKeyboard2, msgRequestStatus2, peer, longValue, emptyList2, J4, list, businessNotifyInfo, optInt2, optBoolean14, z3, optBoolean16, jSONObject12, J, optInt3, optLong, z18, z2, r19, Math.max(jSONObject.optInt("timestamp", 0), 0));
        }
        z = z8;
        infoBar = null;
        if (jSONObject4 == null) {
        }
        if (jSONObject3 != null) {
        }
        if (jSONObject2 != null) {
        }
        if (D == null) {
        }
        optJSONArray = jSONObject.optJSONArray("mention_cmids");
        if (optJSONArray == null) {
        }
        JSONArray optJSONArray62 = jSONObject.optJSONArray("expire_cmids");
        if (optJSONArray62 == null) {
        }
        optJSONObject = jSONObject.optJSONObject("business_notify_data");
        if (optJSONObject == null) {
        }
        int optInt22 = jSONObject.optInt("spam_expiration");
        boolean optBoolean142 = jSONObject.optBoolean("is_new");
        boolean optBoolean152 = jSONObject.optBoolean("is_archived");
        boolean optBoolean162 = jSONObject.optBoolean("is_promo");
        JSONObject jSONObject112 = new JSONObject();
        if (jSONObject.has("payload")) {
        }
        String jSONObject122 = jSONObject112.toString();
        int optInt32 = jSONObject.optInt("peer_flags");
        long optLong2 = jSONObject.optLong("version", 0L);
        boolean z182 = !jSONObject.optBoolean("alive", true);
        boolean optBoolean172 = jSONObject.optBoolean("is_gift_suggestion_enabled", false);
        JSONArray optJSONArray72 = jSONObject.optJSONArray("tags");
        if (optJSONArray72 == null) {
        }
        com.vk.im.engine.models.dialogs.c cVar42 = a;
        optJSONObject2 = jSONObject.optJSONObject("transition_data");
        if (optJSONObject2 == null) {
        }
        return new com.vk.im.engine.models.dialogs.a(j2, i7, vjmVar, i, i3, i9, i5, z7, pushSettings, writePermission2, z, z9, c, infoBar, conversationCard, chatSettings, groupCallInProgress2, cVar42, botKeyboard2, msgRequestStatus2, peer, longValue, emptyList2, J4, list, businessNotifyInfo, optInt22, optBoolean142, z3, optBoolean162, jSONObject122, J, optInt32, optLong2, z182, z2, r19, Math.max(jSONObject.optInt("timestamp", 0), 0));
    }
}
