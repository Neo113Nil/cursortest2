package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserProfileGift;
import com.vk.toggle.features.VasFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.s1r0;
import xsna.wqu;

/* compiled from: GiftsGetRequest.kt */
/* loaded from: classes15.dex */
public final class szt extends awi<VKList<GiftItem>> {
    public static final a v = new a();
    public static final List<UsersFieldsDto> w = e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.CAN_SEE_GIFTS, UsersFieldsDto.FIRST_NAME_GEN, UsersFieldsDto.ONLINE, UsersFieldsDto.IS_NFT);
    public static final List<GroupsFieldsDto> x = e43.l(GroupsFieldsDto.PHOTO_BASE, GroupsFieldsDto.NAME);
    public final UserId s;
    public final int t;
    public final int u;

    /* compiled from: GiftsGetRequest.kt */
    public static final class a {
        public static List a(GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto) {
            List<GroupsGroupFullDto> d = groupsGetByIdObjectResponseDto.d();
            if (d == null) {
                return EmptyList.b;
            }
            List<GroupsGroupFullDto> list = d;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (GroupsGroupFullDto groupsGroupFullDto : list) {
                UserProfile userProfile = new UserProfile();
                userProfile.e = groupsGroupFullDto.y1();
                userProfile.g = groupsGroupFullDto.V1();
                userProfile.h = zm00.c(groupsGroupFullDto.V1(), groupsGroupFullDto.R1(), groupsGroupFullDto.B1(), groupsGroupFullDto.D1());
                userProfile.c = new UserId(-groupsGroupFullDto.P0().b);
                UserProfileGift userProfileGift = new UserProfileGift(userProfile, false, null);
                userProfileGift.d = groupsGroupFullDto.y1();
                userProfileGift.f = "";
                arrayList.add(userProfileGift);
            }
            return arrayList;
        }

        public static ArrayList b(List list) {
            new j2r0();
            List<UsersUserFullDto> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (UsersUserFullDto usersUserFullDto : list2) {
                arrayList.add(new UserProfileGift(j2r0.a(usersUserFullDto), usersUserFullDto.u() == BaseBoolIntDto.YES, usersUserFullDto.N0()));
            }
            return arrayList;
        }
    }

    /* compiled from: GiftsGetRequest.kt */
    public static final class b extends com.vk.api.request.rx.batch.a<List<? extends UsersUserFullDto>, GroupsGetByIdObjectResponseDto, List<? extends UserProfileGift>> {
        @Override // com.vk.api.request.rx.batch.a
        public final List<? extends UserProfileGift> K0(bv6<List<? extends UsersUserFullDto>> bv6Var, bv6<GroupsGetByIdObjectResponseDto> bv6Var2) {
            List<? extends UsersUserFullDto> list = bv6Var.a;
            GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto = bv6Var2.a;
            szt.v.getClass();
            return j5g.u0(a.a(groupsGetByIdObjectResponseDto), a.b(list));
        }
    }

    public szt(UserId userId, int i, int i2) {
        this.s = userId;
        this.t = i;
        this.u = i2;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        tfx tfxVar;
        List<? extends UserProfileGift> f;
        VasFeatures vasFeatures = VasFeatures.VAS_GIFTS_SERVICE_LISTS;
        vasFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(vasFeatures);
        int i = this.u;
        int i2 = this.t;
        UserId userId = this.s;
        if (a2) {
            tfxVar = new tfx("gifts.getAlias", new io.reactivex.rxjava3.subjects.c(21), new as(18));
            if (userId != null) {
                tfx.n(tfxVar, "user_id", userId, 0L, 0L, 8);
            }
            tfx.l(tfxVar, "count", i, 0, 0, 8);
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i2, 0, 0, 8);
            tfx.o(tfxVar, "from", "list", 0, 0, 12);
        } else {
            tfx tfxVar2 = new tfx("gifts.get", new p11(15), new rf3(12));
            if (userId != null) {
                tfx.n(tfxVar2, "user_id", userId, 0L, 0L, 8);
            }
            tfxVar = tfxVar2;
            tfx.l(tfxVar, "count", i, 0, 0, 8);
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i2, 0, 0, 8);
            tfx.o(tfxVar, "from", "list", 0, 0, 12);
        }
        Pair pair = (Pair) yfb.y(tfxVar, new tc(25)).f(l7r0Var);
        List list = (List) pair.d();
        int intValue = ((Number) pair.g()).intValue();
        List<GiftItem> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((GiftItem) it.next()).d);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((UserId) next).b > 0) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((GiftItem) it3.next()).d);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (((UserId) next2).b < 0) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new UserId(-((UserId) it5.next()).b));
        }
        if (arrayList2.isEmpty() && arrayList5.isEmpty()) {
            f = EmptyList.b;
        } else {
            boolean isEmpty = arrayList5.isEmpty();
            List<UsersFieldsDto> list3 = w;
            a aVar = v;
            if (isEmpty) {
                if ((58 & 1) != 0) {
                    arrayList2 = null;
                }
                if ((58 & 4) != 0) {
                    list3 = null;
                }
                f = (List) yfb.y(s1r0.a.b(arrayList2, null, list3, null, null), new tzt(1, aVar, a.class, "mapUsers", "mapUsers(Ljava/util/List;)Ljava/util/List;", 0)).f(l7r0Var);
            } else {
                boolean isEmpty2 = arrayList2.isEmpty();
                List<GroupsFieldsDto> list4 = x;
                if (isEmpty2) {
                    if ((4 & 2) != 0) {
                        list4 = null;
                    }
                    f = (List) yfb.y(wqu.a.a(null, arrayList5, list4), new uzt(1, aVar, a.class, "mapGroups", "mapGroups(Lcom/vk/api/generated/groups/dto/GroupsGetByIdObjectResponseDto;)Ljava/util/List;", 0)).f(l7r0Var);
                } else {
                    aVar.getClass();
                    if ((58 & 1) != 0) {
                        arrayList2 = null;
                    }
                    if ((58 & 4) != 0) {
                        list3 = null;
                    }
                    dz2 x2 = yfb.x(s1r0.a.b(arrayList2, null, list3, null, null));
                    if ((4 & 2) != 0) {
                        list4 = null;
                    }
                    f = new b(x2, yfb.x(wqu.a.a(null, arrayList5, list4))).f(l7r0Var);
                }
            }
        }
        List<? extends UserProfileGift> list5 = f;
        int e = on00.e(c5g.u(list5, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : list5) {
            linkedHashMap.put(((UserProfileGift) obj).c, obj);
        }
        for (GiftItem giftItem : list2) {
            giftItem.f = (UserProfileGift) linkedHashMap.get(giftItem.d);
        }
        return new VKList(intValue, list);
    }
}
