package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgCallAsrFailed;
import com.vk.im.engine.models.messages.MsgChatAvatarRemove;
import com.vk.im.engine.models.messages.MsgChatCreate;
import com.vk.im.engine.models.messages.MsgChatDonKick;
import com.vk.im.engine.models.messages.MsgChatMemberInvite;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByCall;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByCallLink;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByMr;
import com.vk.im.engine.models.messages.MsgChatMemberKick;
import com.vk.im.engine.models.messages.MsgChatMemberKickCallBlock;
import com.vk.im.engine.models.messages.MsgChatStyleUpdate;
import com.vk.im.engine.models.messages.MsgChatTitleUpdate;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgGroupCallStarted;
import com.vk.im.engine.models.messages.MsgIncomingCallPrivacy;
import com.vk.im.engine.models.messages.MsgJoinByLink;
import com.vk.im.engine.models.messages.MsgMrAccepted;
import com.vk.im.engine.models.messages.MsgPin;
import com.vk.im.engine.models.messages.MsgRejectMessageRequest;
import com.vk.im.engine.models.messages.MsgScreenshot;
import com.vk.im.engine.models.messages.MsgSentMessageRequest;
import com.vk.im.engine.models.messages.MsgServiceCustom;
import com.vk.im.engine.models.messages.MsgUnPin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: LpMsgParser.kt */
/* loaded from: classes2.dex */
public final class g900 {
    public static void a(Msg msg, nye0 nye0Var, Peer peer) {
        Peer b;
        long j = nye0Var.a;
        JSONObject jSONObject = nye0Var.f;
        int i = nye0Var.c;
        if (b(i, 2)) {
            b = peer;
        } else {
            long optLong = jSONObject.optLong("from", j);
            Serializer.c<Peer> cVar = Peer.CREATOR;
            b = Peer.a.b(optLong);
        }
        boolean z = epx.f(b, peer) || b(i, 2);
        msg.b = 0;
        msg.c = j;
        msg.d = nye0Var.i;
        msg.f = nye0Var.h;
        long j2 = 1000;
        msg.g = nye0Var.d * j2;
        msg.Vb(b);
        msg.i = !z;
        msg.j = b(i, 8);
        msg.k = b(i, 65536);
        msg.Ub(nye0Var.j > 0);
        msg.o = MsgSyncState.DONE;
        msg.u = 0;
        if (jSONObject.has("pinned_at")) {
            msg.y = Long.valueOf(jSONObject.getLong("pinned_at") * j2);
        }
        if (jSONObject.has("expire_ttl")) {
            msg.v = Long.valueOf(jSONObject.getLong("expire_ttl") * j2);
        }
        if (jSONObject.has("ttl")) {
            msg.w = Long.valueOf(jSONObject.getLong("ttl") * j2);
        }
        if (jSONObject.has("is_expired")) {
            msg.D = jSONObject.getInt("is_expired") != 0;
        }
        if (jSONObject.has("is_silent")) {
            msg.x = jSONObject.getInt("is_silent") != 0;
        }
    }

    public static boolean b(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean c(nye0 nye0Var, Peer peer) {
        long j = peer.b;
        JSONArray optJSONArray = nye0Var.f.optJSONArray("marked_users");
        if (optJSONArray == null || j == nye0Var.a || b(nye0Var.c, 2)) {
            return false;
        }
        int length = optJSONArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray = optJSONArray.getJSONArray(i);
            if (epx.f(jSONArray.get(0), 1)) {
                if (epx.f(jSONArray.optString(1), "all")) {
                    z = true;
                } else {
                    JSONArray optJSONArray2 = jSONArray.optJSONArray(1);
                    z = optJSONArray2 != null ? f370.L(optJSONArray2).contains(Long.valueOf(j)) : false;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Msg d(nye0 nye0Var, Peer peer) {
        ArrayList arrayList;
        boolean has;
        JSONObject jSONObject = nye0Var.g;
        JSONObject jSONObject2 = nye0Var.f;
        Msg msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        msg = null;
        if (jSONObject2.has("has_template") || jSONObject.has("geo")) {
            return null;
        }
        if (jSONObject2.has("source_act")) {
            String string = jSONObject2.getString("source_act");
            if (string != null) {
                switch (string.hashCode()) {
                    case -2046979359:
                        if (string.equals("chat_invite_user_by_call")) {
                            Serializer.c<Peer> cVar = Peer.CREATOR;
                            msg = new MsgChatMemberInviteByCall(Peer.a.b(jSONObject2.getLong("source_mid")));
                            break;
                        }
                        break;
                    case -2046703491:
                        if (string.equals("chat_invite_user_by_link")) {
                            msg = new MsgJoinByLink();
                            break;
                        }
                        break;
                    case -2044444499:
                        if (string.equals("chat_screenshot")) {
                            msg = new MsgScreenshot();
                            break;
                        }
                        break;
                    case -1689885970:
                        if (string.equals("chat_kick_user_call_block")) {
                            Serializer.c<Peer> cVar2 = Peer.CREATOR;
                            msg = new MsgChatMemberKickCallBlock(Peer.a.b(jSONObject2.getLong("source_mid")));
                            break;
                        }
                        break;
                    case -1545459212:
                        if (string.equals("chat_invite_user_by_message_request")) {
                            Serializer.c<Peer> cVar3 = Peer.CREATOR;
                            msg = new MsgChatMemberInviteByMr(Peer.a.b(jSONObject2.getLong("source_mid")));
                            break;
                        }
                        break;
                    case -1384623978:
                        if (string.equals("rejected_message_request")) {
                            Serializer.c<Peer> cVar4 = Peer.CREATOR;
                            msg = new MsgRejectMessageRequest(Peer.a.b(jSONObject2.getLong("source_mid")));
                            break;
                        }
                        break;
                    case -1349088399:
                        if (string.equals("custom")) {
                            if (epx.f(jSONObject2.optString("source_subact"), "cannot_call_privacy_settings")) {
                                msg = new MsgIncomingCallPrivacy(jSONObject2.optString("source_message"));
                                break;
                            } else {
                                msg = new MsgServiceCustom(jSONObject2.optString("source_message"));
                                break;
                            }
                        }
                        break;
                    case -1032167919:
                        if (string.equals("chat_invite_user_by_call_join_link")) {
                            msg = new MsgChatMemberInviteByCallLink();
                            break;
                        }
                        break;
                    case -895020085:
                        if (string.equals("call_transcription_failed")) {
                            msg = new MsgCallAsrFailed();
                            break;
                        }
                        break;
                    case -463628368:
                        if (string.equals("sent_message_request")) {
                            Serializer.c<Peer> cVar5 = Peer.CREATOR;
                            msg = new MsgSentMessageRequest(Peer.a.b(jSONObject2.getLong("source_mid")));
                            break;
                        }
                        break;
                    case -431939366:
                        if (string.equals("chat_invite_user")) {
                            Serializer.c<Peer> cVar6 = Peer.CREATOR;
                            msg = new MsgChatMemberInvite(Peer.a.b(jSONObject2.getLong("source_mid")));
                            break;
                        }
                        break;
                    case -340613507:
                        if (string.equals("chat_unpin_message")) {
                            msg = new MsgUnPin(jSONObject2.optInt("source_chat_local_id"));
                            break;
                        }
                        break;
                    case -202488297:
                        if (string.equals("chat_title_update")) {
                            String A = f370.A("source_old_text", jSONObject2);
                            String a = A != null ? h900.a(A) : null;
                            String str = h900.a;
                            msg = new MsgChatTitleUpdate(h900.a(jSONObject2.optString("source_text", "<unknown>")), a);
                            break;
                        }
                        break;
                    case 205006333:
                        if (string.equals("chat_kick_user")) {
                            Serializer.c<Peer> cVar7 = Peer.CREATOR;
                            msg = new MsgChatMemberKick(Peer.a.b(jSONObject2.getLong("source_mid")));
                            break;
                        }
                        break;
                    case 284205302:
                        if (string.equals("chat_pin_message")) {
                            String str2 = h900.a;
                            msg = new MsgPin(h900.a(jSONObject2.optString("source_message")), jSONObject2.optInt("source_chat_local_id"));
                            break;
                        }
                        break;
                    case 638435512:
                        if (string.equals("chat_photo_remove")) {
                            msg = new MsgChatAvatarRemove();
                            break;
                        }
                        break;
                    case 917485907:
                        if (string.equals("conversation_style_update")) {
                            msg = new MsgChatStyleUpdate(f370.D(jSONObject2, "source_style"));
                            break;
                        }
                        break;
                    case 1253522641:
                        if (string.equals("chat_kick_don")) {
                            msg = new MsgChatDonKick();
                            break;
                        }
                        break;
                    case 1362451808:
                        if (string.equals("group_call_started")) {
                            msg = new MsgGroupCallStarted();
                            break;
                        }
                        break;
                    case 1662195651:
                        if (string.equals("chat_create")) {
                            MsgChatCreate msgChatCreate = new MsgChatCreate();
                            msgChatCreate.E = jSONObject2.getString("source_text");
                            msg = msgChatCreate;
                            break;
                        }
                        break;
                    case 1921673663:
                        if (string.equals("accepted_message_request")) {
                            Serializer.c<Peer> cVar8 = Peer.CREATOR;
                            msg = new MsgMrAccepted(Peer.a.b(jSONObject2.getLong("source_mid")));
                            break;
                        }
                        break;
                }
            }
            if (msg != null) {
                a(msg, nye0Var, peer);
            }
            return msg;
        }
        boolean b = b(nye0Var.c, 512);
        boolean z = true;
        boolean z2 = jSONObject.length() == 0;
        if (!b && z2) {
            return e(nye0Var, peer);
        }
        boolean z3 = jSONObject.has("attachments") && jSONObject.has("attachments_count");
        boolean has2 = jSONObject.has("reply");
        if (!z3 && !has2 && jSONObject.length() != 0) {
            return null;
        }
        Set<String> set = d900.a;
        try {
            has = jSONObject.has("attach1_type");
            if (!jSONObject.has("attachments") || !jSONObject.has("attachments_count")) {
                z = false;
            }
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
        if (!has || z) {
            if (z) {
                int optInt = jSONObject.optInt("attachments_count", 0);
                JSONArray jSONArray = new JSONArray(jSONObject.optString("attachments", "{}"));
                int length = jSONArray.length();
                if (optInt != 0 && length == optInt) {
                    ArrayList arrayList2 = new ArrayList(jSONArray.length());
                    int length2 = jSONArray.length();
                    for (int i = 0; i < length2; i++) {
                        arrayList2.add(jSONArray.getJSONObject(i).optString("type"));
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (!d900.a.contains((String) it.next())) {
                            }
                        }
                    }
                    arrayList = d900.b(jSONObject);
                }
            } else {
                arrayList = new ArrayList();
            }
            if (arrayList != null) {
                return null;
            }
            MsgFromUser e2 = e(nye0Var, peer);
            e2.H = arrayList;
            return e2;
        }
        arrayList = null;
        if (arrayList != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(3:5|(1:7)|(13:9|(4:11|12|13|14)|38|16|(1:18)(1:35)|19|(1:21)|22|23|24|(1:28)|29|30))|39|(0)|38|16|(0)(0)|19|(0)|22|23|24|(2:26|28)|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        com.vk.metrics.eventtracking.b.a.a(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MsgFromUser e(nye0 nye0Var, Peer peer) {
        JSONObject jSONObject;
        MsgTextFormat msgTextFormat;
        int i;
        String optString;
        MsgFromUser msgFromUser = new MsgFromUser();
        JSONObject jSONObject2 = nye0Var.f;
        msgFromUser.E = brm0.y(jSONObject2.optString("title", ""), " ... ", "");
        String str = h900.a;
        msgFromUser.F = h900.a(nye0Var.e);
        BotKeyboard botKeyboard = null;
        if (jSONObject2 != null && (optString = jSONObject2.optString("format_data")) != null) {
            if (!myc0.f(optString)) {
                optString = null;
            }
            if (optString != null) {
                jSONObject = cqm0.j(optString);
                if (jSONObject != null) {
                    String optString2 = jSONObject.optString("version");
                    bpn0 bpn0Var = cqm0.a;
                    try {
                        i = Integer.parseInt(optString2);
                    } catch (Throwable unused) {
                        i = 0;
                    }
                    jSONObject.put("version", i);
                    MsgTextFormat msgTextFormat2 = MsgTextFormat.d;
                    msgTextFormat = MsgTextFormat.a.b(jSONObject);
                }
                msgTextFormat = MsgTextFormat.d;
                msgFromUser.G = msgTextFormat;
                msgFromUser.R = jSONObject2 == null ? f370.x(jSONObject2, "linked_cmid") : null;
                a(msgFromUser, nye0Var, peer);
                if (!b(nye0Var.c, 2)) {
                    long optLong = jSONObject2.optLong("from", nye0Var.a);
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    peer = Peer.a.b(optLong);
                }
                botKeyboard = yey.b(jSONObject2.optJSONObject("keyboard"), peer);
                if (botKeyboard != null && botKeyboard.d) {
                    msgFromUser.J = botKeyboard;
                }
                msgFromUser.N = jSONObject2.optString("payload");
                return msgFromUser;
            }
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        msgTextFormat = MsgTextFormat.d;
        msgFromUser.G = msgTextFormat;
        msgFromUser.R = jSONObject2 == null ? f370.x(jSONObject2, "linked_cmid") : null;
        a(msgFromUser, nye0Var, peer);
        if (!b(nye0Var.c, 2)) {
        }
        botKeyboard = yey.b(jSONObject2.optJSONObject("keyboard"), peer);
        if (botKeyboard != null) {
            msgFromUser.J = botKeyboard;
        }
        msgFromUser.N = jSONObject2.optString("payload");
        return msgFromUser;
    }
}
