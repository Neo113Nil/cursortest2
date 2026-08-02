package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.friends.dto.FriendsGetRequestsSortDto;
import com.vk.api.generated.friends.dto.FriendsSearchFiltersDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: FriendsService.kt */
/* loaded from: classes2.dex */
public interface nts extends mts {
    static xy2 c(ots otsVar, Integer num, Integer num2, Boolean bool, FriendsGetRequestsSortDto friendsGetRequestsSortDto, Boolean bool2, String str, List list, int i) {
        ArrayList arrayList;
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            friendsGetRequestsSortDto = null;
        }
        if ((i & 256) != 0) {
            bool2 = null;
        }
        if ((i & 2048) != 0) {
            list = null;
        }
        otsVar.getClass();
        tfx tfxVar = new tfx("friends.getRequests", new er(20), new fr(19));
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        tfxVar.f(num2.intValue(), 0, 1000, "count");
        tfxVar.j("need_mutual", true);
        if (bool != null) {
            tfxVar.j("out", bool.booleanValue());
        }
        if (friendsGetRequestsSortDto != null) {
            tfx.l(tfxVar, "sort", friendsGetRequestsSortDto.i(), 0, 0, 12);
        }
        if (bool2 != null) {
            tfxVar.j("suggested", bool2.booleanValue());
        }
        tfxVar.j("need_messages", true);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 255, 4);
        }
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

    static /* synthetic */ xy2 d(nts ntsVar, UserId userId, String str, Boolean bool, String str2, String str3, String str4, String str5, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        return ntsVar.l(userId, str, bool, str2, str3, str4, str5);
    }

    static /* synthetic */ xy2 e(nts ntsVar, UserId userId, String str, String str2, String str3, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return ntsVar.n(userId, str, str2, str3);
    }

    static /* synthetic */ xy2 f(nts ntsVar, UserId userId, int i) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return ntsVar.s(userId);
    }

    static /* synthetic */ xy2 g(nts ntsVar, UserId userId, String str, String str2, String str3, Boolean bool, int i) {
        String str4;
        Boolean bool2;
        String str5;
        String str6;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str5 = str3;
            str6 = str2;
            str4 = str;
            bool2 = null;
        } else {
            String str7 = str2;
            str4 = str;
            bool2 = bool;
            str5 = str3;
            str6 = str7;
        }
        return ntsVar.b(userId, bool2, str4, str6, str5);
    }

    static /* synthetic */ xy2 h(nts ntsVar, UserId userId, String str, List list, Integer num, Integer num2, List list2, int i) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            num2 = null;
        }
        if ((i & 128) != 0) {
            list2 = null;
        }
        return ntsVar.a(userId, str, list, num, num2, list2);
    }

    static xy2 i(ots otsVar, Integer num, List list, String str, String str2, String str3, UserId userId, String str4, int i) {
        ArrayList arrayList;
        Boolean bool = Boolean.TRUE;
        List list2 = (i & 4) != 0 ? null : list;
        if ((i & 32) != 0) {
            bool = null;
        }
        String str5 = (i & 256) != 0 ? null : str2;
        String str6 = (i & 512) != 0 ? null : str3;
        UserId userId2 = (i & 1024) != 0 ? null : userId;
        String str7 = (i & 2048) == 0 ? str4 : null;
        otsVar.getClass();
        tfx tfxVar = new tfx("friends.getRecommendations", new xq(15), new yq(15));
        tfxVar.f(num.intValue(), 1, 50, "count");
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (bool != null) {
            tfxVar.j("need_mutual", bool.booleanValue());
        }
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "block_type", str5, 0, 0, 12);
        }
        if (str6 != null) {
            tfx.o(tfxVar, "track_code", str6, 0, 0, 12);
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "friend_id", userId2, 1L, 0L, 8);
        }
        if (str7 != null) {
            tfx.o(tfxVar, "reason", str7, 0, 0, 12);
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 r(nts ntsVar, UserId userId, UserId userId2, Integer num, int i) {
        if ((i & 16) != 0) {
            num = null;
        }
        return ntsVar.k(userId, userId2, num);
    }

    default tfx a(UserId userId, String str, List list, Integer num, Integer num2, List list2) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("friends.search", new or(14), new pr(16));
        if (userId != null) {
            tfx.n(tfxVar, "user_id", userId, 1L, 0L, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        ArrayList arrayList2 = null;
        if (list != null) {
            List list3 = list;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfxVar.f(num2.intValue(), 0, 1000, "count");
        }
        if (list2 != null) {
            List list4 = list2;
            arrayList2 = new ArrayList(c5g.u(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((FriendsSearchFiltersDto) it2.next()).i());
            }
        }
        if (arrayList2 != null) {
            tfxVar.i("filters", arrayList2);
        }
        return tfxVar;
    }

    default tfx b(UserId userId, Boolean bool, String str, String str2, String str3) {
        tfx tfxVar = new tfx("friends.delete", new mr(18), new sn(20));
        if (userId != null) {
            tfx.n(tfxVar, "user_id", userId, 0L, 0L, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "access_key", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "ref", str3, 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("remove_fan", bool.booleanValue());
        }
        return tfxVar;
    }

    default tfx j(UserId userId) {
        tfx tfxVar = new tfx("friends.getOnline", new dr(17), new com.vk.movika.sdk.android.defaultplayer.view.a(17));
        if (userId != null) {
            tfx.n(tfxVar, "user_id", userId, 0L, 0L, 8);
        }
        return tfxVar;
    }

    default tfx k(UserId userId, UserId userId2, Integer num) {
        tfx tfxVar = new tfx("friends.getMutual", new io.reactivex.rxjava3.internal.operators.mixed.j(15), new io.reactivex.rxjava3.internal.operators.mixed.k(15));
        if (userId != null) {
            tfx.n(tfxVar, "source_uid", userId, 1L, 0L, 8);
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "target_uid", userId2, 1L, 0L, 8);
        }
        if (num != null) {
            tfx.l(tfxVar, "count", num.intValue(), 0, 0, 8);
        }
        return tfxVar;
    }

    default tfx l(UserId userId, String str, Boolean bool, String str2, String str3, String str4, String str5) {
        tfx tfxVar = new tfx("friends.add", new nr(14), new defpackage.j0(19));
        if (userId != null) {
            tfx.n(tfxVar, "user_id", userId, 0L, 0L, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "text", str, 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("follow", bool.booleanValue());
        }
        if (str2 != null) {
            tfx.o(tfxVar, "source", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "block_type", str3, 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "track_code", str4, 0, 0, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "access_key", str5, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx n(UserId userId, String str, String str2, String str3) {
        tfx tfxVar = new tfx("friends.hideSuggestion", new cr(14), new io.reactivex.rxjava3.internal.operators.observable.n0(23));
        if (userId != null) {
            tfx.n(tfxVar, "user_id", userId, 0L, 0L, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "access_key", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "track_code", str3, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx o(Integer num, Integer num2) {
        tfx tfxVar = new tfx("friends.getBirthdays", new hr(16), new pn(19));
        tfxVar.f(num.intValue(), 0, 100, "count");
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 0, 8);
        return tfxVar;
    }

    default tfx p(Integer num, String str, Integer num2, UserId userId, List list) {
        tfx tfxVar = new tfx("friends.getFollowers", new gr(16), new dn(17));
        tfx.n(tfxVar, "user_id", userId, 1L, 0L, 8);
        tfxVar.f(num.intValue(), 0, 1000, "count");
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 0, 8);
        tfx.o(tfxVar, "ref", str, 0, 0, 12);
        if (list != null) {
            tfxVar.i("fields", list);
        }
        return tfxVar;
    }

    default tfx q(UserId userId, String str, String str2) {
        tfx tfxVar = new tfx("friends.deleteSubscriber", new com.vk.movika.sdk.android.defaultplayer.interactive.c(15), new ar(16));
        if (userId != null) {
            tfx.n(tfxVar, "subscriber_id", userId, 0L, 0L, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx s(UserId userId) {
        tfx tfxVar = new tfx("friends.getLists", new vq(15), new wq(16));
        if (userId != null) {
            tfx.n(tfxVar, "user_id", userId, 0L, 0L, 8);
        }
        return tfxVar;
    }
}
