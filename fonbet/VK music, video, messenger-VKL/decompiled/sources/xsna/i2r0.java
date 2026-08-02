package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.friends.dto.FriendsRequestsMutualDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.dto.user.deactivation.DeactivationWithMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* compiled from: UsersUserDtoToUserProfileMapper.kt */
/* loaded from: classes3.dex */
public final class i2r0 {
    public static UserProfile a(UsersUserDto usersUserDto) {
        DeactivationWithMessage deactivationWithMessage;
        String str;
        boolean z;
        MutualInfo mutualInfo;
        ArrayList arrayList;
        UserProfile userProfile = new UserProfile();
        FriendsFriendStatusStatusDto g = usersUserDto.g();
        userProfile.v = g != null ? g.i() : -1;
        userProfile.c = usersUserDto.j();
        userProfile.d = usersUserDto.f();
        userProfile.f = usersUserDto.k();
        userProfile.e = userProfile.d + ' ' + userProfile.f;
        userProfile.g = usersUserDto.u();
        Iterator it = rl3.I(new String[]{js5.a(100, usersUserDto.u()), usersUserDto.o(), usersUserDto.p()}).iterator();
        while (true) {
            deactivationWithMessage = null;
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = (String) it.next();
            if (str != null) {
                break;
            }
        }
        userProfile.h = str;
        UserSex.a aVar = UserSex.Companion;
        BaseSexDto C = usersUserDto.C();
        Integer valueOf = C != null ? Integer.valueOf(C.i()) : null;
        aVar.getClass();
        userProfile.i = UserSex.a.a(valueOf);
        userProfile.q = usersUserDto.B();
        userProfile.C = usersUserDto.e();
        ListBuilder e = e43.e();
        String u = usersUserDto.u();
        if (u != null) {
            m900<String, ImageSize> m900Var = ImageSize.e;
            e.add(ImageSize.b.a(u));
        }
        if (usersUserDto.p() != null) {
            e.add(new ImageSize(usersUserDto.p(), 50, 50, null, (char) 0, false, 56, null));
        }
        if (usersUserDto.o() != null) {
            e.add(new ImageSize(usersUserDto.o(), 100, 100, null, (char) 0, false, 56, null));
        }
        userProfile.O = new Image(e.g());
        BaseBoolIntDto F = usersUserDto.F();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        boolean z2 = false;
        if (F == baseBoolIntDto) {
            z = false;
            z2 = true;
        } else {
            z = false;
        }
        userProfile.B.Ab(new VerifyInfo(z2, usersUserDto.D() != baseBoolIntDto ? z : true, false, false, false, false, 60, null));
        OnlineInfo a = dlq0.a(usersUserDto.n());
        if (a == null) {
            a = VisibleStatus.f;
        }
        userProfile.n = a;
        FriendsRequestsMutualDto l = usersUserDto.l();
        if (l != null) {
            Integer d = l.d();
            List<UserId> e2 = l.e();
            if (e2 != null) {
                List<UserId> list = e2;
                arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(((UserId) it2.next()).b));
                }
            } else {
                arrayList = null;
            }
            mutualInfo = new MutualInfo(d, arrayList);
        } else {
            mutualInfo = null;
        }
        userProfile.d0 = mutualInfo;
        String e3 = usersUserDto.e();
        if (e3 != null) {
            if (drm0.N(e3)) {
                e3 = null;
            }
            if (e3 != null) {
                DeactivationWithMessage.a aVar2 = new DeactivationWithMessage.a();
                aVar2.b(e3);
                deactivationWithMessage = aVar2.a();
            }
        }
        userProfile.D = deactivationWithMessage;
        return userProfile;
    }

    public static LinkedHashMap b(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((UsersUserDto) it.next()));
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((UserProfile) next).c, next);
        }
        return linkedHashMap;
    }
}
