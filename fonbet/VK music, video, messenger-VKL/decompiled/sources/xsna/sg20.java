package xsna;

import com.ironsource.B5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.messages.dto.MessagesAddChatUserSourceDto;
import com.vk.api.generated.messages.dto.MessagesCountersFilterDto;
import com.vk.api.generated.messages.dto.MessagesGetCallTokenEnvDto;
import com.vk.api.generated.messages.dto.MessagesGetContactCallTokenEnvDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationMembersFilterDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationsFilterDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.tg20;

/* compiled from: MessagesService.kt */
/* loaded from: classes.dex */
public interface sg20 extends tg20 {

    /* compiled from: MessagesService.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static ufx a(Integer num, UserId userId, String str, String str2, Float f, Float f2, String str3, String str4, Integer num2, String str5, UserId userId2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num3, Boolean bool, String str13, String str14) {
            return tg20.a.b(num, userId, str, str2, f, f2, str3, str4, num2, str5, userId2, str6, str7, str8, str9, str10, str11, str12, num3, bool, str13, str14);
        }
    }

    static xy2 a(vg20 vg20Var, int i, UserId userId, UserId userId2, Integer num, int i2) {
        UserId userId3 = (i2 & 8) != 0 ? null : userId2;
        Integer num2 = (i2 & 16) == 0 ? num : null;
        vg20Var.getClass();
        tfx tfxVar = new tfx("messages.removeChatUser", new up(22), new vp(27));
        tfxVar.f(i, 0, 100000000, "chat_id");
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        }
        if (userId3 != null) {
            tfx.n(tfxVar, "member_id", userId3, 0L, 0L, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "incognito_id", num2.intValue(), 0, 0, 8);
        }
        return tfxVar;
    }

    static xy2 b(vg20 vg20Var, long j, Boolean bool, UserId userId, Integer num, int i) {
        Boolean bool2 = (i & 2) != 0 ? null : bool;
        UserId userId2 = (i & 4) != 0 ? null : userId;
        vg20Var.getClass();
        tfx tfxVar = new tfx("messages.getInviteLink", new com.vk.movika.sdk.base.model.n(20), new eq(23));
        tfx.m(tfxVar, "peer_id", j, 0L, 12);
        if (bool2 != null) {
            tfxVar.j("reset", bool2.booleanValue());
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "group_id", userId2, 0L, 0L, 8);
        }
        if (num != null) {
            tfxVar.f(num.intValue(), 0, 1000, "visible_messages_count");
        }
        return tfxVar;
    }

    static xy2 d(vg20 vg20Var, List list, UserId userId, Boolean bool, int i) {
        ArrayList arrayList;
        UserId userId2 = (i & 2) != 0 ? null : userId;
        if ((i & 4) != 0) {
            bool = null;
        }
        vg20Var.getClass();
        tfx tfxVar = new tfx("messages.getCounters", new dt(19), new et(24));
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((MessagesCountersFilterDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("filter", arrayList);
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "user_id", userId2, 1L, 0L, 8);
        }
        if (bool != null) {
            tfxVar.j("for_coupled", bool.booleanValue());
        }
        return tfxVar;
    }

    static xy2 e(vg20 vg20Var, String str, List list, List list2, List list3, String str2, Long l, int i) {
        if ((i & 2) != 0) {
            list = null;
        }
        vg20Var.getClass();
        tfx tfxVar = new tfx("messages.getCallParticipants", new nq(17), new oq(20));
        tfx.o(tfxVar, "call_id", str, 0, 0, 12);
        if (list != null) {
            tfxVar.i("participant_ids", list);
        }
        if (list2 != null) {
            tfx.p(tfxVar, "peer_ids", list2, 0L, 12);
        }
        if (list3 != null) {
            tfxVar.i("fields", list3);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "secret", str2, 0, 0, 12);
        }
        if (l != null) {
            tfx.m(tfxVar, "user_id", l.longValue(), 0L, 12);
        }
        return tfxVar;
    }

    static xy2 f(vg20 vg20Var, String str, Boolean bool, UserId userId, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        UserId userId2 = (i & 4) != 0 ? null : userId;
        vg20Var.getClass();
        tfx tfxVar = new tfx("messages.getJoinLink", new vp(26), new wp(22));
        tfxVar.g(36, 36, "call_id", str);
        if (bool != null) {
            tfxVar.j("invalidate", bool.booleanValue());
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "group_id", userId2, 0L, 0L, 12);
        }
        return tfxVar;
    }

    static xy2 h(vg20 vg20Var, UserId userId, Integer num, MessagesGetConversationMembersFilterDto messagesGetConversationMembersFilterDto, List list, UserId userId2, ArrayList arrayList, String str, Integer num2, int i) {
        ArrayList arrayList2;
        Boolean bool = Boolean.TRUE;
        Integer num3 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            bool = null;
        }
        MessagesGetConversationMembersFilterDto messagesGetConversationMembersFilterDto2 = (i & 16) != 0 ? null : messagesGetConversationMembersFilterDto;
        List list2 = (i & 32) != 0 ? null : list;
        UserId userId3 = (i & 64) != 0 ? null : userId2;
        ArrayList arrayList3 = (i & 512) != 0 ? null : arrayList;
        String str2 = (i & 1024) != 0 ? null : str;
        Integer num4 = (i & 2048) == 0 ? num2 : null;
        vg20Var.getClass();
        tfx tfxVar = new tfx("messages.getConversationMembers", new com.vk.movika.sdk.android.defaultplayer.interactive.c(21), new en(27));
        tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 12);
        if (num3 != null) {
            tfxVar.f(num3.intValue(), 1, 1000, "count");
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (messagesGetConversationMembersFilterDto2 != null) {
            tfx.o(tfxVar, "filter", messagesGetConversationMembersFilterDto2.i(), 0, 0, 12);
        }
        if (list2 != null) {
            List list3 = list2;
            arrayList2 = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            tfxVar.i("fields", arrayList2);
        }
        if (userId3 != null) {
            tfx.n(tfxVar, "group_id", userId3, 0L, 0L, 8);
        }
        if (arrayList3 != null) {
            tfx.p(tfxVar, "member_ids_long", arrayList3, 0L, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        }
        if (num4 != null) {
            tfxVar.f(num4.intValue(), 100, 1000, SignalingProtocol.KEY_LIMIT);
        }
        return tfxVar;
    }

    static xy2 i(vg20 vg20Var, int i, UserId userId, Integer num, List list, MessagesAddChatUserSourceDto messagesAddChatUserSourceDto, int i2) {
        UserId userId2 = (i2 & 4) != 0 ? null : userId;
        if ((i2 & 16) != 0) {
            list = null;
        }
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto2 = (i2 & 32) == 0 ? messagesAddChatUserSourceDto : null;
        vg20Var.getClass();
        tfx tfxVar = new tfx("messages.addChatUser", new r11(21), new sf3(19));
        tfxVar.f(i, 0, 100000000, "chat_id");
        if (userId2 != null) {
            tfx.n(tfxVar, "peer_id", userId2, 0L, 0L, 12);
        }
        if (num != null) {
            tfxVar.f(num.intValue(), 0, 1000, "visible_messages_count");
        }
        if (list != null) {
            tfxVar.i("phone_numbers", list);
        }
        if (messagesAddChatUserSourceDto2 != null) {
            tfx.o(tfxVar, "source", messagesAddChatUserSourceDto2.i(), 0, 0, 12);
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 q(sg20 sg20Var, String str, String str2, String str3, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        return sg20Var.j(bool, str, str2, str3);
    }

    static xy2 r(vg20 vg20Var, ArrayList arrayList, String str, Long l, Boolean bool, String str2, List list, String str3, Boolean bool2, int i) {
        ArrayList arrayList2 = (i & 1) != 0 ? null : arrayList;
        Long l2 = (i & 32) != 0 ? null : l;
        String str4 = (i & 512) != 0 ? null : str2;
        List list2 = (i & 2048) != 0 ? null : list;
        Boolean bool3 = (i & 8192) == 0 ? bool2 : null;
        vg20Var.getClass();
        tfx tfxVar = new tfx("messages.createChat", new at(23), new bt(20));
        if (arrayList2 != null) {
            tfx.p(tfxVar, "user_ids", arrayList2, 0L, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "title", str, 0, 0, 12);
        }
        if (l2 != null) {
            tfx.m(tfxVar, "copy_from_peer_id", l2.longValue(), 0L, 12);
        }
        tfxVar.j("is_disappearing", bool.booleanValue());
        if (str4 != null) {
            tfx.o(tfxVar, SignalingProtocol.KEY_PERMISSIONS, str4, 0, 0, 12);
        }
        if (list2 != null) {
            tfxVar.i("phone_numbers", list2);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "device_id", str3, 0, 0, 12);
        }
        if (bool3 != null) {
            tfxVar.j("is_disable_stickers_popup_autoplay", bool3.booleanValue());
        }
        return tfxVar;
    }

    default tfx c() {
        return new tfx("messages.getGroupsForCall", new hq(22), new iq(18));
    }

    default tfx g(String str, List list) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("messages.searchConversations", new p11(19), new rf3(19));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        tfxVar.f(20, 1, 255, "count");
        tfxVar.j("extended", true);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return tfxVar;
    }

    default tfx j(Boolean bool, String str, String str2, String str3) {
        tfx tfxVar = new tfx("messages.getCallPreview", new dq(21), new com.vk.movika.sdk.base.model.n(19));
        if (str != null) {
            tfx.o(tfxVar, "link", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "short_id", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, LoginApiConstants.PARAM_NAME_PASSWORD, str3, 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        return tfxVar;
    }

    default tfx k(String str, MessagesGetContactCallTokenEnvDto messagesGetContactCallTokenEnvDto) {
        tfx tfxVar = new tfx("messages.getContactCallToken", new qr(20), new rr(21));
        tfx.o(tfxVar, "contact", str, 0, 0, 12);
        if (messagesGetContactCallTokenEnvDto != null) {
            tfx.o(tfxVar, B5.o, messagesGetContactCallTokenEnvDto.i(), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx m(MessagesGetCallTokenEnvDto messagesGetCallTokenEnvDto) {
        tfx tfxVar = new tfx("messages.getCallToken", new io.reactivex.rxjava3.internal.operators.mixed.n(21), new zq(21));
        if (messagesGetCallTokenEnvDto != null) {
            tfx.o(tfxVar, B5.o, messagesGetCallTokenEnvDto.i(), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx n(Integer num, Integer num2, MessagesGetConversationsFilterDto messagesGetConversationsFilterDto, Boolean bool, List list, UserId userId, Integer num3) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("messages.getConversations", new jh(18), new qq(16));
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        tfxVar.f(num2.intValue(), 0, 200, "count");
        if (messagesGetConversationsFilterDto != null) {
            tfx.o(tfxVar, "filter", messagesGetConversationsFilterDto.i(), 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "nested_limit", num3.intValue(), 1, 0, 8);
        }
        return tfxVar;
    }

    default tfx o(long j, String str, String str2, String str3) {
        tfx tfxVar = new tfx("messages.getAnonymCallToken", new mq(23), new l4(25));
        tfx.o(tfxVar, "name", str, 0, 0, 12);
        tfx.m(tfxVar, "user_id", j, 0L, 12);
        if (str2 != null) {
            tfx.o(tfxVar, "link", str2, 0, 0, 12);
        }
        tfx.o(tfxVar, "secret", str3, 0, 0, 12);
        return tfxVar;
    }
}
