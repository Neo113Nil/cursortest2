package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGroupFriendPreviewProfileDto;
import com.vk.api.generated.groups.dto.GroupsGroupFriendsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.FriendsInfo;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: GroupsGroupFullToOwnerMapper.kt */
/* loaded from: classes3.dex */
public final class equ {
    public static Owner a(GroupsGroupFullDto groupsGroupFullDto) {
        List<GroupsGroupFriendPreviewProfileDto> e;
        UserId e2 = groupsGroupFullDto.P0().b > 0 ? fkq0.e(groupsGroupFullDto.P0()) : groupsGroupFullDto.P0();
        String y1 = groupsGroupFullDto.y1();
        GroupsGroupFullDto.TrustMarkDto J2 = groupsGroupFullDto.J2();
        BaseBoolIntDto O2 = groupsGroupFullDto.O2();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        VerifyInfo verifyInfo = new VerifyInfo(O2 == baseBoolIntDto, groupsGroupFullDto.I2() == baseBoolIntDto, false, J2 == GroupsGroupFullDto.TrustMarkDto.PREMIUM, J2 == GroupsGroupFullDto.TrustMarkDto.CONFIRMED, J2 == GroupsGroupFullDto.TrustMarkDto.IS_NCO_ORGANIZATION || J2 == GroupsGroupFullDto.TrustMarkDto.NCO_ORGANIZATION_AND_OTHERS);
        Serializer.c<Image> cVar = Image.CREATOR;
        Image a = Image.b.a(groupsGroupFullDto.V1());
        ImageSize Cb = a.Cb(glw.a().a(), true, false);
        ArrayList arrayList = null;
        String str = Cb != null ? Cb.d.d : null;
        boolean z = groupsGroupFullDto.l() == baseBoolIntDto;
        boolean f = epx.f(groupsGroupFullDto.N0(), Boolean.TRUE);
        Integer o = groupsGroupFullDto.o();
        boolean z2 = (o != null ? o.intValue() : 0) == 1;
        String V1 = groupsGroupFullDto.V1();
        Integer o1 = groupsGroupFullDto.o1();
        int intValue = o1 != null ? o1.intValue() : 0;
        GroupsGroupFriendsDto D0 = groupsGroupFullDto.D0();
        int count = D0 != null ? D0.getCount() : 0;
        GroupsGroupFriendsDto D02 = groupsGroupFullDto.D0();
        if (D02 != null && (e = D02.e()) != null) {
            arrayList = new ArrayList();
            Iterator<T> it = e.iterator();
            while (it.hasNext()) {
                String i = ((GroupsGroupFriendPreviewProfileDto) it.next()).i();
                if (i != null) {
                    arrayList.add(i);
                }
            }
        }
        FriendsInfo friendsInfo = new FriendsInfo(count, arrayList);
        String url = groupsGroupFullDto.getUrl();
        GroupsVideoLivesDataDto T2 = groupsGroupFullDto.T2();
        Owner owner = new Owner(e2, y1, V1, str, verifyInfo, a, null, null, null, null, null, null, null, z, false, f, false, null, intValue, friendsInfo, url, T2 != null && T2.e(), 221120, null);
        BaseBoolIntDto o3 = groupsGroupFullDto.o3();
        BaseBoolIntDto baseBoolIntDto2 = BaseBoolIntDto.YES;
        owner.g(2, o3 == baseBoolIntDto2);
        owner.g(4, groupsGroupFullDto.I3() == baseBoolIntDto2);
        String W = groupsGroupFullDto.W();
        owner.o(!(W == null || W.length() == 0));
        owner.n(groupsGroupFullDto.u3() == GroupsGroupIsClosedDto.CLOSED);
        Boolean y3 = groupsGroupFullDto.y3();
        Boolean bool = Boolean.TRUE;
        owner.g(256, epx.f(y3, bool));
        owner.g(8192, groupsGroupFullDto.J2() == GroupsGroupFullDto.TrustMarkDto.IS_NCO_ORGANIZATION || groupsGroupFullDto.J2() == GroupsGroupFullDto.TrustMarkDto.NCO_ORGANIZATION_AND_OTHERS);
        owner.g(16384, groupsGroupFullDto.J2() == GroupsGroupFullDto.TrustMarkDto.NCO_ORGANIZATION_AND_OTHERS);
        owner.g(64, groupsGroupFullDto.C() == baseBoolIntDto2);
        owner.g(128, z2);
        owner.B(epx.f(groupsGroupFullDto.N3(), bool));
        owner.g(2048, groupsGroupFullDto.u3() == GroupsGroupIsClosedDto.PRIVATE);
        return owner;
    }

    public static LinkedHashMap b(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((GroupsGroupFullDto) it.next()));
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((Owner) next).b, next);
        }
        return linkedHashMap;
    }
}
