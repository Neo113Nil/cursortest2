package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgCallAsrFailed;
import com.vk.im.engine.models.messages.MsgChatAvatarRemove;
import com.vk.im.engine.models.messages.MsgChatAvatarUpdate;
import com.vk.im.engine.models.messages.MsgChatCreate;
import com.vk.im.engine.models.messages.MsgChatDonKick;
import com.vk.im.engine.models.messages.MsgChatMemberInvite;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByCall;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByCallLink;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByMr;
import com.vk.im.engine.models.messages.MsgChatMemberKick;
import com.vk.im.engine.models.messages.MsgChatMemberKickCallBlock;
import com.vk.im.engine.models.messages.MsgChatOwnerUpdate;
import com.vk.im.engine.models.messages.MsgChatStyleUpdate;
import com.vk.im.engine.models.messages.MsgChatTitleUpdate;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgGroupCallStarted;
import com.vk.im.engine.models.messages.MsgIncomingCallPrivacy;
import com.vk.im.engine.models.messages.MsgJoinByLink;
import com.vk.im.engine.models.messages.MsgMrAccepted;
import com.vk.im.engine.models.messages.MsgPin;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.engine.models.messages.MsgReactionImpl;
import com.vk.im.engine.models.messages.MsgRejectMessageRequest;
import com.vk.im.engine.models.messages.MsgScreenshot;
import com.vk.im.engine.models.messages.MsgSentMessageRequest;
import com.vk.im.engine.models.messages.MsgServiceCustom;
import com.vk.im.engine.models.messages.MsgUnPin;
import com.vk.im.engine.models.messages.MsgUnsupported;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MsgApiParser.kt */
/* loaded from: classes2.dex */
public final class bh30 {
    public static void a(AttachChannelMessage attachChannelMessage, int i, long j) {
        for (Attach attach : attachChannelMessage.g) {
            if (attach instanceof AttachForMediaViewer) {
                AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) attach;
                attachForMediaViewer.d2(i);
                attachForMediaViewer.Q1(j);
            }
        }
    }

    public static void b(int i, long j, List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            NestedMsg nestedMsg = (NestedMsg) it.next();
            ArrayList u0 = j5g.u0(nestedMsg.j, list);
            for (Attach attach : nestedMsg.j) {
                if (attach instanceof AttachForMediaViewer) {
                    AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) attach;
                    attachForMediaViewer.d2(i);
                    attachForMediaViewer.Q1(j);
                    attachForMediaViewer.x6(u0.lastIndexOf(attach) + 1);
                    attachForMediaViewer.Oa(nestedMsg.m);
                    attachForMediaViewer.B5(null);
                } else if (attach instanceof AttachChannelMessage) {
                    a((AttachChannelMessage) attach, i, j);
                }
            }
            if (!nestedMsg.k.isEmpty()) {
                b(i, j, u0, nestedMsg.k);
            }
        }
    }

    public static void c(NestedMsg nestedMsg, ProfilesSimpleInfo profilesSimpleInfo) {
        Iterator it = nestedMsg.j.iterator();
        while (it.hasNext()) {
            w04.b((Attach) it.next(), profilesSimpleInfo);
        }
        Iterator it2 = nestedMsg.k.iterator();
        while (it2.hasNext()) {
            c((NestedMsg) it2.next(), profilesSimpleInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Msg msg, f1e0 f1e0Var) {
        Peer peer;
        f1e0Var.c(msg.getFrom());
        long j = msg.c;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        f1e0Var.c(Peer.a.b(j));
        if (msg instanceof aux0) {
            Iterator<T> it = ((aux0) msg).K().iterator();
            while (it.hasNext()) {
                List<Long> u2 = ((MsgReaction) it.next()).u2();
                ArrayList arrayList = new ArrayList(c5g.u(u2, 10));
                Iterator<T> it2 = u2.iterator();
                while (it2.hasNext()) {
                    long longValue = ((Number) it2.next()).longValue();
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    arrayList.add(Peer.a.b(longValue));
                }
                f1e0Var.d(arrayList);
            }
        }
        if (msg instanceof MsgMrAccepted) {
            f1e0Var.c(((MsgMrAccepted) msg).E);
            return;
        }
        if (msg instanceof MsgChatMemberInviteByMr) {
            f1e0Var.c(((MsgChatMemberInviteByMr) msg).E);
            return;
        }
        if (msg instanceof MsgChatMemberInvite) {
            f1e0Var.c(((MsgChatMemberInvite) msg).E);
            return;
        }
        if (msg instanceof MsgChatMemberInviteByCall) {
            f1e0Var.c(((MsgChatMemberInviteByCall) msg).E);
            return;
        }
        if (msg instanceof MsgChatMemberKick) {
            f1e0Var.c(((MsgChatMemberKick) msg).E);
            return;
        }
        if (msg instanceof MsgChatMemberKickCallBlock) {
            f1e0Var.c(((MsgChatMemberKickCallBlock) msg).E);
        } else {
            if (!(msg instanceof MsgChatOwnerUpdate) || (peer = ((MsgChatOwnerUpdate) msg).F) == null) {
                return;
            }
            f1e0Var.c(peer);
        }
    }

    public static final Msg e(JSONObject jSONObject, f1e0 f1e0Var) throws VKApiException {
        try {
            return k(jSONObject, f1e0Var);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    public static Msg f(String str, JSONObject jSONObject) {
        Peer peer;
        MsgChatOwnerUpdate.Type.Companion.getClass();
        MsgChatOwnerUpdate.Type a = MsgChatOwnerUpdate.Type.a.a(str);
        if (a == null) {
            MsgUnsupported msgUnsupported = new MsgUnsupported();
            g(msgUnsupported, jSONObject);
            return msgUnsupported;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("action");
        if (jSONObject2.has("member_id")) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.a.b(jSONObject2.getLong("member_id"));
        } else {
            peer = null;
        }
        MsgChatOwnerUpdate msgChatOwnerUpdate = new MsgChatOwnerUpdate(a, peer);
        g(msgChatOwnerUpdate, jSONObject);
        return msgChatOwnerUpdate;
    }

    public static void g(Msg msg, JSONObject jSONObject) {
        msg.b = 0;
        msg.c = jSONObject.getLong("peer_id");
        msg.d = jSONObject.getInt("conversation_message_id");
        msg.e = jSONObject.getLong("version");
        msg.f = jSONObject.has("random_id") ? jSONObject.getInt("random_id") : 0;
        msg.g = jSONObject.getLong("date") * 1000;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        msg.Vb(Peer.a.b(jSONObject.getLong("from_id")));
        msg.i = jSONObject.getInt("out") == 0;
        msg.j = jSONObject.has("important") ? jSONObject.getBoolean("important") : false;
        msg.k = jSONObject.has("is_hidden") ? jSONObject.getBoolean("is_hidden") : false;
        msg.Ub(jSONObject.has("update_time"));
        msg.n = jSONObject.optInt("deleted", 0) == 1;
        msg.B = jSONObject.optBoolean("nested_msgs_has_more");
        msg.C = jSONObject.optInt("nested_msgs_count");
        msg.o = MsgSyncState.DONE;
        msg.u = 0;
        msg.D = jSONObject.has("is_expired") ? jSONObject.getBoolean("is_expired") : false;
        if (jSONObject.has("expire_ttl")) {
            msg.v = Long.valueOf(jSONObject.getLong("expire_ttl") * 1000);
        }
        if (jSONObject.has("ttl")) {
            msg.w = Long.valueOf(jSONObject.getLong("ttl") * 1000);
        }
        if (jSONObject.has("pinned_at")) {
            msg.y = Long.valueOf(jSONObject.getLong("pinned_at") * 1000);
        }
        if (jSONObject.has("is_silent")) {
            msg.x = jSONObject.getBoolean("is_silent");
        }
        if (jSONObject.has("force_autoplay_media")) {
            msg.z = jSONObject.getBoolean("force_autoplay_media");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r4 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(com.vk.im.engine.models.messages.a aVar, JSONObject jSONObject) {
        MsgTextFormat msgTextFormat;
        int i;
        JSONObject optJSONObject = jSONObject.optJSONObject("format_data");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("version");
            bpn0 bpn0Var = cqm0.a;
            try {
                i = Integer.parseInt(optString);
            } catch (Throwable unused) {
                i = 0;
            }
            optJSONObject.put("version", i);
            MsgTextFormat msgTextFormat2 = MsgTextFormat.d;
            msgTextFormat = MsgTextFormat.a.b(optJSONObject);
        }
        msgTextFormat = MsgTextFormat.d;
        aVar.Ba(msgTextFormat);
    }

    public static void i(JSONObject jSONObject, f1e0 f1e0Var, List list) {
        JSONArray jSONArray;
        if (jSONObject.has("fwd_messages") && (jSONArray = jSONObject.getJSONArray("fwd_messages")) != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                list.add(j(jSONArray.getJSONObject(i), NestedMsg.Type.FWD, f1e0Var));
            }
        }
    }

    public static NestedMsg j(JSONObject jSONObject, NestedMsg.Type type, f1e0 f1e0Var) {
        ArrayList arrayList;
        NestedMsg nestedMsg = new NestedMsg();
        nestedMsg.b = type;
        nestedMsg.c = 0;
        nestedMsg.e = f370.y(jSONObject, "peer_id", 0L);
        nestedMsg.d = jSONObject.has("conversation_message_id") ? jSONObject.getInt("conversation_message_id") : 0;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        nestedMsg.f = Peer.a.b(jSONObject.getLong("from_id"));
        nestedMsg.m = jSONObject.getLong("date") * 1000;
        nestedMsg.g = jSONObject.has("title") ? jSONObject.getString("title") : "";
        nestedMsg.h = jSONObject.has("text") ? jSONObject.getString("text") : "";
        nestedMsg.o = jSONObject.has("is_expired") ? jSONObject.getBoolean("is_expired") : false;
        nestedMsg.p = jSONObject.has("is_unavailable") ? jSONObject.getBoolean("is_unavailable") : false;
        try {
            arrayList = cdi.G(jSONObject, nestedMsg.f);
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            arrayList = null;
        }
        nestedMsg.l = arrayList;
        f1e0Var.c(nestedMsg.f);
        try {
            w04.F(jSONObject, f1e0Var, nestedMsg.j);
            h(nestedMsg, jSONObject);
            i(jSONObject, f1e0Var, nestedMsg.k);
            ArrayList arrayList2 = nestedMsg.k;
            if (jSONObject.has("reply_message")) {
                arrayList2.add(j(jSONObject.getJSONObject("reply_message"), NestedMsg.Type.REPLY, f1e0Var));
            }
            return nestedMsg;
        } catch (JSONException e2) {
            throw new VKApiIllegalResponseException(e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0432, code lost:
    
        if (r12.has("was_listened") != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0434, code lost:
    
        r1 = r12.getBoolean(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04a1, code lost:
    
        if (r12 == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0439, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0441, code lost:
    
        if (r12.has("was_played") != false) goto L185;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Msg k(JSONObject jSONObject, f1e0 f1e0Var) {
        ArrayList arrayList;
        boolean z;
        List<? extends MsgReaction> list;
        Msg msg;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        BotKeyboard botKeyboard = null;
        if (!jSONObject.has("action")) {
            MsgFromUser msgFromUser = new MsgFromUser();
            g(msgFromUser, jSONObject);
            msgFromUser.E = jSONObject.has("title") ? jSONObject.getString("title") : "";
            msgFromUser.F = jSONObject.has("text") ? jSONObject.getString("text") : "";
            try {
                w04.F(jSONObject, f1e0Var, msgFromUser.H);
                Integer x = f370.x(jSONObject, "conversation_message_id");
                int intValue = x != null ? x.intValue() : jSONObject.has("cmid") ? jSONObject.getInt("cmid") : 0;
                long j = jSONObject.has("peer_id") ? jSONObject.getLong("peer_id") : 0L;
                for (Attach attach : msgFromUser.H) {
                    if (attach instanceof AttachForMediaViewer) {
                        AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) attach;
                        attachForMediaViewer.d2(intValue);
                        attachForMediaViewer.Q1(j);
                        attachForMediaViewer.x6(msgFromUser.H.indexOf(attach) + 1);
                        attachForMediaViewer.Oa(msgFromUser.g);
                        attachForMediaViewer.B5(msgFromUser.v);
                    } else if (attach instanceof AttachChannelMessage) {
                        a((AttachChannelMessage) attach, intValue, j);
                    }
                }
                i(jSONObject, f1e0Var, msgFromUser.I);
                b(intValue, j, msgFromUser.H, msgFromUser.I);
                List<NestedMsg> list2 = msgFromUser.I;
                if (jSONObject.has("reply_message")) {
                    list2.add(j(jSONObject.getJSONObject("reply_message"), NestedMsg.Type.REPLY, f1e0Var));
                }
                msgFromUser.m = jSONObject.has("is_unavailable") ? jSONObject.getBoolean("is_unavailable") : false;
                try {
                    arrayList = cdi.G(jSONObject.optJSONObject("template"), msgFromUser.h);
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    arrayList = null;
                }
                msgFromUser.K = arrayList;
                try {
                    botKeyboard = yey.b(jSONObject.optJSONObject("keyboard"), msgFromUser.h);
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
                msgFromUser.J = botKeyboard;
                String str = "was_listened";
                if (!jSONObject.has("was_listened")) {
                    str = "was_played";
                }
                msgFromUser.L = z;
                msgFromUser.N = jSONObject.optString("payload");
                msgFromUser.R = f370.x(jSONObject, "linked_cmid");
                h(msgFromUser, jSONObject);
                msgFromUser.T = f370.x(jSONObject, "reaction_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("reactions");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                        if (optJSONObject3 != null) {
                            arrayList2.add(new MsgReactionImpl(optJSONObject3.getInt("reaction_id"), f370.L(optJSONObject3.getJSONArray("user_ids")), optJSONObject3.getInt("count")));
                        }
                    }
                    list = j5g.O0(arrayList2);
                }
                list = EmptyList.b;
                msgFromUser.S = list;
                d(msgFromUser, f1e0Var);
                return msgFromUser;
            } catch (JSONException e3) {
                throw new VKApiIllegalResponseException(e3);
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("action");
        String string = optJSONObject4 != null ? optJSONObject4.getString("type") : null;
        if (string != null) {
            switch (string.hashCode()) {
                case -2046979359:
                    if (string.equals("chat_invite_user_by_call")) {
                        MsgChatMemberInviteByCall msgChatMemberInviteByCall = new MsgChatMemberInviteByCall();
                        g(msgChatMemberInviteByCall, jSONObject);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("action");
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        msgChatMemberInviteByCall.E = Peer.a.b(jSONObject2.getLong("member_id"));
                        msg = msgChatMemberInviteByCall;
                        break;
                    }
                    break;
                case -2046703491:
                    if (string.equals("chat_invite_user_by_link")) {
                        Msg msgJoinByLink = new MsgJoinByLink();
                        g(msgJoinByLink, jSONObject);
                        msg = msgJoinByLink;
                        break;
                    }
                    break;
                case -2044444499:
                    if (string.equals("chat_screenshot")) {
                        Msg msgScreenshot = new MsgScreenshot();
                        g(msgScreenshot, jSONObject);
                        msg = msgScreenshot;
                        break;
                    }
                    break;
                case -1748434377:
                    if (string.equals("chat_without_owner_all")) {
                        msg = f(string, jSONObject);
                        break;
                    }
                    break;
                case -1689885970:
                    if (string.equals("chat_kick_user_call_block")) {
                        MsgChatMemberKickCallBlock msgChatMemberKickCallBlock = new MsgChatMemberKickCallBlock();
                        g(msgChatMemberKickCallBlock, jSONObject);
                        JSONObject jSONObject3 = jSONObject.getJSONObject("action");
                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                        msgChatMemberKickCallBlock.E = Peer.a.b(jSONObject3.getLong("member_id"));
                        msg = msgChatMemberKickCallBlock;
                        break;
                    }
                    break;
                case -1545459212:
                    if (string.equals("chat_invite_user_by_message_request")) {
                        JSONObject jSONObject4 = jSONObject.getJSONObject("action");
                        Serializer.c<Peer> cVar3 = Peer.CREATOR;
                        Msg msgChatMemberInviteByMr = new MsgChatMemberInviteByMr(Peer.a.b(jSONObject4.getLong("member_id")));
                        g(msgChatMemberInviteByMr, jSONObject);
                        msg = msgChatMemberInviteByMr;
                        break;
                    }
                    break;
                case -1384623978:
                    if (string.equals("rejected_message_request")) {
                        JSONObject jSONObject5 = jSONObject.getJSONObject("action");
                        Serializer.c<Peer> cVar4 = Peer.CREATOR;
                        Msg msgRejectMessageRequest = new MsgRejectMessageRequest(Peer.a.b(jSONObject5.getLong("member_id")));
                        g(msgRejectMessageRequest, jSONObject);
                        msg = msgRejectMessageRequest;
                        break;
                    }
                    break;
                case -1349088399:
                    if (string.equals("custom")) {
                        MsgServiceCustom msgServiceCustom = new MsgServiceCustom(null, 1, null);
                        g(msgServiceCustom, jSONObject);
                        msgServiceCustom.E = jSONObject.getJSONObject("action").optString("message");
                        msg = msgServiceCustom;
                        break;
                    }
                    break;
                case -1237589593:
                    if (string.equals("chat_group_call_started")) {
                        Msg msgGroupCallStarted = new MsgGroupCallStarted();
                        g(msgGroupCallStarted, jSONObject);
                        msg = msgGroupCallStarted;
                        break;
                    }
                    break;
                case -1032167919:
                    if (string.equals("chat_invite_user_by_call_join_link")) {
                        Msg msgChatMemberInviteByCallLink = new MsgChatMemberInviteByCallLink();
                        g(msgChatMemberInviteByCallLink, jSONObject);
                        msg = msgChatMemberInviteByCallLink;
                        break;
                    }
                    break;
                case -913457563:
                    if (string.equals("chat_without_owner_admin")) {
                        msg = f(string, jSONObject);
                        break;
                    }
                    break;
                case -895020085:
                    if (string.equals("call_transcription_failed")) {
                        Msg msgCallAsrFailed = new MsgCallAsrFailed();
                        g(msgCallAsrFailed, jSONObject);
                        msg = msgCallAsrFailed;
                        break;
                    }
                    break;
                case -484293503:
                    if (string.equals("chat_owner_changed")) {
                        msg = f(string, jSONObject);
                        break;
                    }
                    break;
                case -463628368:
                    if (string.equals("sent_message_request")) {
                        JSONObject jSONObject6 = jSONObject.getJSONObject("action");
                        Serializer.c<Peer> cVar5 = Peer.CREATOR;
                        Msg msgSentMessageRequest = new MsgSentMessageRequest(Peer.a.b(jSONObject6.getLong("member_id")));
                        g(msgSentMessageRequest, jSONObject);
                        msg = msgSentMessageRequest;
                        break;
                    }
                    break;
                case -431939366:
                    if (string.equals("chat_invite_user")) {
                        MsgChatMemberInvite msgChatMemberInvite = new MsgChatMemberInvite();
                        g(msgChatMemberInvite, jSONObject);
                        JSONObject jSONObject7 = jSONObject.getJSONObject("action");
                        Serializer.c<Peer> cVar6 = Peer.CREATOR;
                        msgChatMemberInvite.E = Peer.a.b(jSONObject7.getLong("member_id"));
                        msg = msgChatMemberInvite;
                        break;
                    }
                    break;
                case -340613507:
                    if (string.equals("chat_unpin_message")) {
                        JSONObject jSONObject8 = jSONObject.getJSONObject("action");
                        MsgUnPin msgUnPin = new MsgUnPin(0, 1, null);
                        msgUnPin.E = jSONObject8.optInt("conversation_message_id");
                        g(msgUnPin, jSONObject);
                        msg = msgUnPin;
                        break;
                    }
                    break;
                case -202488297:
                    if (string.equals("chat_title_update")) {
                        MsgChatTitleUpdate msgChatTitleUpdate = new MsgChatTitleUpdate();
                        g(msgChatTitleUpdate, jSONObject);
                        JSONObject jSONObject9 = jSONObject.getJSONObject("action");
                        msgChatTitleUpdate.E = f370.C("text", "", jSONObject9);
                        msgChatTitleUpdate.F = f370.A("old_text", jSONObject9);
                        msg = msgChatTitleUpdate;
                        break;
                    }
                    break;
                case 205006333:
                    if (string.equals("chat_kick_user")) {
                        MsgChatMemberKick msgChatMemberKick = new MsgChatMemberKick();
                        g(msgChatMemberKick, jSONObject);
                        JSONObject jSONObject10 = jSONObject.getJSONObject("action");
                        Serializer.c<Peer> cVar7 = Peer.CREATOR;
                        msgChatMemberKick.E = Peer.a.b(jSONObject10.getLong("member_id"));
                        msg = msgChatMemberKick;
                        break;
                    }
                    break;
                case 284205302:
                    if (string.equals("chat_pin_message")) {
                        JSONObject jSONObject11 = jSONObject.getJSONObject("action");
                        MsgPin msgPin = new MsgPin(null, 0, 3, null);
                        msgPin.E = jSONObject11.optString("message");
                        msgPin.F = jSONObject11.optInt("conversation_message_id");
                        g(msgPin, jSONObject);
                        msg = msgPin;
                        break;
                    }
                    break;
                case 464001151:
                    if (string.equals("cannot_call_privacy_settings")) {
                        MsgIncomingCallPrivacy msgIncomingCallPrivacy = new MsgIncomingCallPrivacy(null, 1, null);
                        g(msgIncomingCallPrivacy, jSONObject);
                        msgIncomingCallPrivacy.E = jSONObject.getJSONObject("action").optString("message");
                        msg = msgIncomingCallPrivacy;
                        break;
                    }
                    break;
                case 638435512:
                    if (string.equals("chat_photo_remove")) {
                        Msg msgChatAvatarRemove = new MsgChatAvatarRemove();
                        g(msgChatAvatarRemove, jSONObject);
                        msg = msgChatAvatarRemove;
                        break;
                    }
                    break;
                case 734200061:
                    if (string.equals("chat_photo_update")) {
                        MsgChatAvatarUpdate msgChatAvatarUpdate = new MsgChatAvatarUpdate();
                        g(msgChatAvatarUpdate, jSONObject);
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("attachments");
                        JSONArray optJSONArray3 = (optJSONArray2 == null || (optJSONObject = optJSONArray2.optJSONObject(0)) == null || (optJSONObject2 = optJSONObject.optJSONObject("photo")) == null) ? null : optJSONObject2.optJSONArray("sizes");
                        msgChatAvatarUpdate.E = optJSONArray3 == null ? new ImageList(null, 1, null) : plw.a(optJSONArray3, plw.a);
                        msg = msgChatAvatarUpdate;
                        break;
                    }
                    break;
                case 917485907:
                    if (string.equals("conversation_style_update")) {
                        Msg msgChatStyleUpdate = new MsgChatStyleUpdate(f370.D(jSONObject.getJSONObject("action"), TtmlNode.TAG_STYLE));
                        g(msgChatStyleUpdate, jSONObject);
                        msg = msgChatStyleUpdate;
                        break;
                    }
                    break;
                case 1253522641:
                    if (string.equals("chat_kick_don")) {
                        Msg msgChatDonKick = new MsgChatDonKick();
                        g(msgChatDonKick, jSONObject);
                        msg = msgChatDonKick;
                        break;
                    }
                    break;
                case 1662195651:
                    if (string.equals("chat_create")) {
                        MsgChatCreate msgChatCreate = new MsgChatCreate();
                        g(msgChatCreate, jSONObject);
                        msgChatCreate.E = f370.C("text", "", jSONObject.getJSONObject("action"));
                        msg = msgChatCreate;
                        break;
                    }
                    break;
                case 1747586734:
                    if (string.equals("chat_without_owner_admins")) {
                        msg = f(string, jSONObject);
                        break;
                    }
                    break;
                case 1921673663:
                    if (string.equals("accepted_message_request")) {
                        JSONObject jSONObject12 = jSONObject.getJSONObject("action");
                        Serializer.c<Peer> cVar8 = Peer.CREATOR;
                        Msg msgMrAccepted = new MsgMrAccepted(Peer.a.b(jSONObject12.getLong("member_id")));
                        g(msgMrAccepted, jSONObject);
                        msg = msgMrAccepted;
                        break;
                    }
                    break;
            }
            d(msg, f1e0Var);
            return msg;
        }
        Msg msgUnsupported = new MsgUnsupported();
        g(msgUnsupported, jSONObject);
        msg = msgUnsupported;
        d(msg, f1e0Var);
        return msg;
    }
}
