package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.generated.address.dto.AddressFieldsDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListInvitationStatusDto;
import com.vk.api.generated.groups.dto.GroupsGetMembersFilterDto;
import com.vk.api.generated.groups.dto.GroupsGetMembersSortDto;
import com.vk.api.generated.groups.dto.GroupsGetSuggestionsBlockTypeDto;
import com.vk.api.generated.groups.dto.GroupsLeaveLeaveModeDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.wqu;
import xsna.yqu;

/* compiled from: GroupsService.kt */
/* loaded from: classes.dex */
public interface xqu extends yqu, wqu {

    /* compiled from: GroupsService.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static sfx a(String str, List list, List list2) {
            return wqu.a.a(str, list, list2);
        }

        public static ufx b(UserId userId, UserId userId2) {
            return yqu.a.a(userId, userId2);
        }

        public static ufx c(String str, String str2, String str3, String str4, UserId userId, String str5, String str6, String str7) {
            return yqu.a.b(str, str2, str3, str4, userId, str5, str6, str7);
        }

        public static ufx d(UserId userId, GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto, String str, String str2, String str3) {
            return yqu.a.d(userId, groupsLeaveLeaveModeDto, str, str2, str3);
        }
    }

    static xy2 c(zqu zquVar, UserId userId, String str, int i) {
        if ((i & 8) != 0) {
            str = null;
        }
        String str2 = str;
        zquVar.getClass();
        tfx tfxVar = new tfx("groups.getVideoLives", new hr(17), new ir(22));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 e(zqu zquVar, UserId userId, List list, List list2, Integer num, int i) {
        ArrayList arrayList;
        Boolean bool = Boolean.TRUE;
        UserId userId2 = (i & 1) != 0 ? null : userId;
        if ((i & 2) != 0) {
            bool = null;
        }
        List list3 = (i & 8) != 0 ? null : list2;
        Integer num2 = (i & 16) != 0 ? null : 0;
        zquVar.getClass();
        tfx tfxVar = new tfx("groups.get", new zn(15), new ao(17));
        if (userId2 != null) {
            tfx.n(tfxVar, "user_id", userId2, 1L, 0L, 8);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        ArrayList arrayList2 = null;
        if (list != null) {
            List list4 = list;
            arrayList = new ArrayList(c5g.u(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsFilterDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("filter", arrayList);
        }
        if (list3 != null) {
            List list5 = list3;
            arrayList2 = new ArrayList(c5g.u(list5, 10));
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((GroupsFieldsDto) it2.next()).k());
            }
        }
        if (arrayList2 != null) {
            tfxVar.i("fields", arrayList2);
        }
        if (num2 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 0, 8);
        }
        tfxVar.f(num.intValue(), 0, 1000, "count");
        return tfxVar;
    }

    static xy2 g(zqu zquVar, UserId userId, GroupsGetMembersSortDto groupsGetMembersSortDto, Integer num, Integer num2, List list, GroupsGetMembersFilterDto groupsGetMembersFilterDto, String str, int i) {
        ArrayList arrayList;
        GroupsGetMembersSortDto groupsGetMembersSortDto2 = (i & 2) != 0 ? null : groupsGetMembersSortDto;
        Integer num3 = (i & 4) != 0 ? null : num;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto2 = (i & 32) != 0 ? null : groupsGetMembersFilterDto;
        String str2 = (i & 64) == 0 ? str : null;
        zquVar.getClass();
        tfx tfxVar = new tfx("groups.getMembers", new kr(22), new lr(18));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (groupsGetMembersSortDto2 != null) {
            tfx.o(tfxVar, "sort", groupsGetMembersSortDto2.i(), 0, 0, 12);
        }
        if (num3 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 8);
        }
        tfxVar.f(num2.intValue(), 0, 1000, "count");
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
        if (groupsGetMembersFilterDto2 != null) {
            tfx.o(tfxVar, "filter", groupsGetMembersFilterDto2.i(), 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 h(xqu xquVar, UserId userId, List list, List list2, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        return xquVar.b(userId, list, list2, num, num2, null);
    }

    static /* synthetic */ xy2 i(xqu xquVar, UserId userId, List list, List list2, String str, GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto, Integer num, int i) {
        if ((i & 8) != 0) {
            list2 = null;
        }
        if ((i & 64) != 0) {
            str = null;
        }
        return xquVar.m(userId, list, list2, str, groupsGetContentForTabsContentDto, num);
    }

    static /* synthetic */ xy2 j(xqu xquVar, UserId userId, List list, Float f, Float f2, Integer num, Integer num2, List list2, int i) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            f = null;
        }
        if ((i & 8) != 0) {
            f2 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            list2 = null;
        }
        return xquVar.f(userId, list, f, f2, num, num2, list2);
    }

    static xy2 w(zqu zquVar, UserId userId, Integer num, String str, List list, GroupsGetSuggestionsBlockTypeDto groupsGetSuggestionsBlockTypeDto, String str2, int i) {
        String str3 = (i & 4) != 0 ? null : str;
        GroupsGetSuggestionsBlockTypeDto groupsGetSuggestionsBlockTypeDto2 = (i & 16) == 0 ? groupsGetSuggestionsBlockTypeDto : null;
        zquVar.getClass();
        tfx tfxVar = new tfx("groups.getSuggestions", new kq(18), new lq(17));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfxVar.f(num.intValue(), 1, 100, "count");
        if (str3 != null) {
            tfx.o(tfxVar, "start_from", str3, 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("fields", list);
        }
        if (groupsGetSuggestionsBlockTypeDto2 != null) {
            tfx.o(tfxVar, "block_type", groupsGetSuggestionsBlockTypeDto2.i(), 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx a(UserId userId) {
        tfx tfxVar = new tfx("groups.getNameHistory", new pr(18), new qr(17));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        return tfxVar;
    }

    default tfx b(UserId userId, List list, List list2, Integer num, Integer num2, Integer num3) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("groups.get", new mq(19), new l4(19));
        if (userId != null) {
            tfx.n(tfxVar, "user_id", userId, 1L, 0L, 8);
        }
        tfxVar.j("extended", true);
        ArrayList arrayList2 = null;
        if (list != null) {
            List list3 = list;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsFilterDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("filter", arrayList);
        }
        if (list2 != null) {
            List list4 = list2;
            arrayList2 = new ArrayList(c5g.u(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((GroupsFieldsDto) it2.next()).k());
            }
        }
        if (arrayList2 != null) {
            tfxVar.i("fields", arrayList2);
        }
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfxVar.f(num2.intValue(), 0, 1000, "count");
        }
        if (num3 != null) {
            tfx.l(tfxVar, "last_request_time", num3.intValue(), 0, 0, 8);
        }
        return tfxVar;
    }

    default tfx f(UserId userId, List list, Float f, Float f2, Integer num, Integer num2, List list2) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("groups.getAddresses", new iq(12), new jq(17));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (list != null) {
            tfxVar.i("address_ids", list);
        }
        if (f != null) {
            tfxVar.h("latitude", f.floatValue(), -90.0d, 90.0d);
        }
        if (f2 != null) {
            tfxVar.h("longitude", f2.floatValue(), -180.0d, 180.0d);
        }
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "count", num2.intValue(), 0, 0, 8);
        }
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((AddressFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return tfxVar;
    }

    default tfx k(UserId userId, UserId userId2) {
        tfx tfxVar = new tfx("groups.removeUser", new io.reactivex.rxjava3.internal.operators.mixed.j(16), new io.reactivex.rxjava3.internal.operators.mixed.k(17));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.n(tfxVar, "user_id", userId2, 1L, 0L, 8);
        return tfxVar;
    }

    default tfx m(UserId userId, List list, List list2, String str, GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto, Integer num) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("groups.getContentForTabs", new uq(15), new vq(17));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        ArrayList arrayList2 = null;
        if (list != null) {
            List list3 = list;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsContentTabsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("tabs", arrayList);
        }
        if (list2 != null) {
            List list4 = list2;
            arrayList2 = new ArrayList(c5g.u(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((BaseUserGroupFieldsDto) it2.next()).i());
            }
        }
        if (arrayList2 != null) {
            tfxVar.i("fields", arrayList2);
        }
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        if (groupsGetContentForTabsContentDto != null) {
            tfx.o(tfxVar, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, groupsGetContentForTabsContentDto.i(), 0, 0, 12);
        }
        tfxVar.f(num.intValue(), 1, 100, "count");
        return tfxVar;
    }

    default tfx n(UserId userId, GroupsGetFriendsInvitationListInvitationStatusDto groupsGetFriendsInvitationListInvitationStatusDto, String str, String str2, Boolean bool) {
        tfx tfxVar = new tfx("groups.getFriendsInvitationList", new com.vk.movika.sdk.android.defaultplayer.interactive.c(16), new ar(17));
        tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        tfx.o(tfxVar, "invitation_status", groupsGetFriendsInvitationListInvitationStatusDto.i(), 0, 0, 12);
        if (str != null) {
            tfxVar.g(0, 255, CampaignEx.JSON_KEY_AD_Q, str);
        }
        if (str2 != null) {
            tfxVar.g(0, 64, "start_from", str2);
        }
        tfxVar.f(100, 0, 800, "count");
        if (bool != null) {
            tfxVar.j("with_privacy_groups_invite", bool.booleanValue());
        }
        return tfxVar;
    }

    default tfx o(UserId userId, String str, String str2, String str3, Integer num, String str4, String str5, Boolean bool, Boolean bool2, String str6, Integer num2, String str7, String str8, String str9) {
        tfx tfxVar = new tfx("groups.edit", new gr(17), new dn(18));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (str != null) {
            tfx.o(tfxVar, "title", str, 0, 0, 12);
            s3q0 s3q0Var = s3q0.a;
        }
        if (str2 != null) {
            tfx.o(tfxVar, "description", str2, 0, 0, 12);
            s3q0 s3q0Var2 = s3q0.a;
        }
        if (str3 != null) {
            tfx.o(tfxVar, "screen_name", str3, 0, 0, 12);
            s3q0 s3q0Var3 = s3q0.a;
        }
        if (num != null) {
            tfx.l(tfxVar, "access", num.intValue(), 0, 0, 8);
            s3q0 s3q0Var4 = s3q0.a;
        }
        if (str4 != null) {
            tfx.o(tfxVar, "website", str4, 0, 0, 12);
            s3q0 s3q0Var5 = s3q0.a;
        }
        if (str5 != null) {
            tfx.o(tfxVar, "phone", str5, 0, 0, 12);
            s3q0 s3q0Var6 = s3q0.a;
        }
        if (bool != null) {
            tfxVar.j("messages", bool.booleanValue());
            s3q0 s3q0Var7 = s3q0.a;
        }
        if (bool2 != null) {
            tfxVar.j("enable_replies", bool2.booleanValue());
            s3q0 s3q0Var8 = s3q0.a;
        }
        if (str6 != null) {
            tfx.o(tfxVar, "live_covers", str6, 0, 0, 12);
            s3q0 s3q0Var9 = s3q0.a;
        }
        if (num2 != null) {
            tfx.l(tfxVar, "city", num2.intValue(), 0, 0, 8);
            s3q0 s3q0Var10 = s3q0.a;
        }
        if (str7 != null) {
            tfx.o(tfxVar, "first_address", str7, 0, 255, 4);
            s3q0 s3q0Var11 = s3q0.a;
        }
        if (str8 != null) {
            tfx.o(tfxVar, "source", str8, 0, 0, 12);
            s3q0 s3q0Var12 = s3q0.a;
        }
        if (str9 != null) {
            tfx.o(tfxVar, "screen", str9, 0, 0, 12);
            s3q0 s3q0Var13 = s3q0.a;
        }
        return tfxVar;
    }

    default tfx p(UserId userId, Integer num) {
        tfx tfxVar = new tfx("groups.getBanner", new tr(12), new ur(20));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "banner_type", num.intValue(), 0, 0, 8);
        return tfxVar;
    }

    default tfx q(UserId userId, String str) {
        tfx tfxVar = new tfx("groups.hideBanner", new br(19), new cr(15));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (str != null) {
            tfx.o(tfxVar, "banner_id", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx s(UserId userId, List list, UserId userId2) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("groups.getBanned", new defpackage.j0(21), new or(15));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
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
        if (userId2 != null) {
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
        }
        return tfxVar;
    }

    default tfx t(UserId userId, UserId userId2) {
        tfx tfxVar = new tfx("groups.unban", new oq(12), new pq(9));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (userId2 != null) {
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
        }
        return tfxVar;
    }

    default tfx v(int i, UserId userId) {
        tfx tfxVar = new tfx("groups.hideWarning", new pn(21), new mr(20));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "notification_id", i, 0, 0, 8);
        return tfxVar;
    }

    default tfx x(UserId userId, UserId userId2) {
        tfx tfxVar = new tfx("groups.approveRequest", new up(15), new vp(18));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.n(tfxVar, "user_id", userId2, 1L, 0L, 8);
        return tfxVar;
    }
}
