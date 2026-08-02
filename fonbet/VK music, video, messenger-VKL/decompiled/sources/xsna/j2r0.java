package xsna;

import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseCropPhotoCropDto;
import com.vk.api.generated.base.dto.BaseCropPhotoDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.friends.dto.FriendsRequestsMutualDto;
import com.vk.api.generated.owner.dto.OwnerStateDto;
import com.vk.api.generated.owner.dto.OwnerStatePhotosDto;
import com.vk.api.generated.status.dto.StatusImageStatusDto;
import com.vk.api.generated.users.dto.UsersCareerDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.CropPhoto;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.dto.user.deactivation.DeactivationWithMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: UsersUserFullDtoToUserProfileMapper.kt */
/* loaded from: classes3.dex */
public final class j2r0 {
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03e9, code lost:
    
        if (r1 == null) goto L183;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UserProfile a(UsersUserFullDto usersUserFullDto) {
        String l2;
        String str;
        MutualInfo mutualInfo;
        String str2;
        String str3;
        String str4;
        CropPhoto cropPhoto;
        ArrayList arrayList;
        DeactivationWithMessage deactivationWithMessage;
        String e;
        String g;
        ArrayList arrayList2;
        UserProfile userProfile = new UserProfile();
        FriendsFriendStatusStatusDto V0 = usersUserFullDto.V0();
        userProfile.v = V0 != null ? V0.i() : -1;
        userProfile.c = usersUserFullDto.s1();
        userProfile.d = usersUserFullDto.D0();
        userProfile.f = usersUserFullDto.x1();
        String N0 = usersUserFullDto.N0();
        Bundle bundle = userProfile.s;
        if (N0 != null) {
            bundle.putString(BaseUserGroupFieldsDto.FIRST_NAME_GEN.i(), N0);
            String D1 = usersUserFullDto.D1();
            if (D1 != null) {
                bundle.putString("name_gen", N0 + ' ' + D1);
            }
        }
        String K0 = usersUserFullDto.K0();
        if (K0 != null) {
            bundle.putString(BaseUserGroupFieldsDto.FIRST_NAME_DAT.i(), K0);
            String B1 = usersUserFullDto.B1();
            if (B1 != null) {
                bundle.putString("name_dat", K0 + ' ' + B1);
            }
        }
        String H0 = usersUserFullDto.H0();
        if (H0 != null) {
            bundle.putString(BaseUserGroupFieldsDto.FIRST_NAME_ACC.i(), H0);
            String z1 = usersUserFullDto.z1();
            if (z1 != null) {
                bundle.putString("name_acc", H0 + ' ' + z1);
            }
        }
        String P0 = usersUserFullDto.P0();
        if (P0 != null) {
            bundle.putString(UsersFieldsDto.FIRST_NAME_INS.i(), P0);
            String E1 = usersUserFullDto.E1();
            if (E1 != null) {
                bundle.putString("name_ins", P0 + ' ' + E1);
            }
        }
        String F0 = usersUserFullDto.F0();
        if (F0 != null) {
            bundle.putString(UsersFieldsDto.FIRST_NAME_ABL.i(), F0);
            String y1 = usersUserFullDto.y1();
            if (y1 != null) {
                bundle.putString("name_abl", F0 + ' ' + y1);
            }
        }
        userProfile.e = userProfile.d + ' ' + userProfile.f;
        userProfile.g = usersUserFullDto.r2();
        String r2 = usersUserFullDto.r2();
        if ((r2 == null || (l2 = js5.a(480, r2)) == null) && (l2 = usersUserFullDto.l2()) == null && (l2 = usersUserFullDto.i2()) == null && (l2 = usersUserFullDto.X1()) == null && (l2 = usersUserFullDto.o2()) == null) {
            l2 = usersUserFullDto.W1();
        }
        userProfile.h = l2;
        UserSex.a aVar = UserSex.Companion;
        BaseSexDto L2 = usersUserFullDto.L2();
        Integer valueOf = L2 != null ? Integer.valueOf(L2.i()) : null;
        aVar.getClass();
        userProfile.i = UserSex.a.a(valueOf);
        BaseBoolIntDto g3 = usersUserFullDto.g3();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        userProfile.j = g3 == baseBoolIntDto;
        BaseCityDto G = usersUserFullDto.G();
        if (G != null) {
            bundle.putString("city_name", G.getTitle());
        }
        String Q2 = usersUserFullDto.Q2();
        String str5 = "";
        if (Q2 == null || drm0.N(Q2)) {
            BaseCityDto G2 = usersUserFullDto.G();
            if (G2 == null || (str = G2.getTitle()) == null) {
                str = "";
            }
        } else {
            str = usersUserFullDto.Q2();
            if (str == null) {
                str = "";
            }
            Integer b1 = usersUserFullDto.b1();
            if (b1 != null) {
                str = str.concat(String.format(" '%02d", Arrays.copyOf(new Object[]{Integer.valueOf(b1.intValue() % 100)}, 1)));
            }
        }
        userProfile.o = str;
        userProfile.p = usersUserFullDto.i();
        userProfile.q = usersUserFullDto.w0();
        userProfile.w = usersUserFullDto.p3() == baseBoolIntDto;
        userProfile.x = usersUserFullDto.B() == baseBoolIntDto;
        userProfile.C = usersUserFullDto.l0();
        userProfile.G = usersUserFullDto.j() == baseBoolIntDto;
        userProfile.H = usersUserFullDto.k() == baseBoolIntDto;
        userProfile.J = usersUserFullDto.r();
        Integer U0 = usersUserFullDto.U0();
        userProfile.K = U0 != null ? U0.intValue() : 0;
        userProfile.M = usersUserFullDto.N2();
        userProfile.k = usersUserFullDto.W2() == baseBoolIntDto;
        Serializer.c<Image> cVar = Image.CREATOR;
        userProfile.O = Image.b.a(usersUserFullDto.r2());
        StatusImageStatusDto t1 = usersUserFullDto.t1();
        if (t1 != null) {
            int id = t1.getId();
            String e2 = t1.e();
            new ne6();
            userProfile.R = new ImageStatus(id, e2, ne6.a(t1.d()), null, 0, null, null, 120, null);
        }
        userProfile.P = usersUserFullDto.B2();
        userProfile.S = usersUserFullDto.d1() == baseBoolIntDto;
        Boolean V2 = usersUserFullDto.V2();
        userProfile.A = V2 != null ? V2.booleanValue() : false;
        Boolean n1 = usersUserFullDto.n1();
        userProfile.T = n1 != null ? n1.booleanValue() : false;
        Boolean i3 = usersUserFullDto.i3();
        userProfile.V = i3 != null ? i3.booleanValue() : false;
        Boolean C = usersUserFullDto.C();
        userProfile.U = C != null ? C.booleanValue() : false;
        Integer K = usersUserFullDto.K();
        userProfile.W = K != null ? K.intValue() : 0;
        userProfile.y = usersUserFullDto.o();
        userProfile.a0(usersUserFullDto.D() == baseBoolIntDto);
        boolean z = usersUserFullDto.R2() == baseBoolIntDto;
        boolean z2 = usersUserFullDto.O2() == baseBoolIntDto;
        Boolean o3 = usersUserFullDto.o3();
        userProfile.B.Ab(new VerifyInfo(z, z2, o3 != null ? o3.booleanValue() : false, false, false, false, 56, null));
        OnlineInfo a = dlq0.a(usersUserFullDto.U1());
        if (a == null) {
            a = VisibleStatus.f;
        }
        userProfile.n = a;
        FriendsRequestsMutualDto R1 = usersUserFullDto.R1();
        if (R1 != null) {
            Integer d = R1.d();
            List<UserId> e3 = R1.e();
            if (e3 != null) {
                List<UserId> list = e3;
                arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((UserId) it.next()).b));
                }
            } else {
                arrayList2 = null;
            }
            mutualInfo = new MutualInfo(d, arrayList2);
        } else {
            mutualInfo = null;
        }
        userProfile.d0 = mutualInfo;
        String Q22 = usersUserFullDto.Q2();
        List<UsersCareerDto> F = usersUserFullDto.F();
        BaseCountryDto T = usersUserFullDto.T();
        if (Q22 != null && !drm0.N(Q22)) {
            String obj = drm0.p0(brm0.y(Q22, "\r\n", "")).toString();
            Integer b12 = usersUserFullDto.b1();
            str3 = fo8.a(obj, ((b12 != null && b12.intValue() == 0) || b12 == null) ? "" : String.format(" '%02d", Arrays.copyOf(new Object[]{Integer.valueOf(b12.intValue() % 100)}, 1)));
        } else if (F != null) {
            Iterator<T> it2 = F.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str4 = null;
                    break;
                }
                str4 = ((UsersCareerDto) it2.next()).d();
                if (str4 != null) {
                    break;
                }
            }
            if (str4 != null) {
                str3 = drm0.p0(brm0.y(str4, "\r\n", "")).toString();
            }
            str3 = null;
        } else {
            if (T != null) {
                BaseCityDto G3 = usersUserFullDto.G();
                if (G3 != null) {
                    str2 = ", " + G3.getTitle();
                }
                str2 = "";
                str3 = T.getTitle() + str2;
            }
            str3 = null;
        }
        userProfile.r = str3;
        Boolean h3 = usersUserFullDto.h3();
        userProfile.Y = h3 != null ? h3.booleanValue() : false;
        Boolean n = usersUserFullDto.n();
        userProfile.Z = n != null ? n.booleanValue() : false;
        BaseCropPhotoDto Z = usersUserFullDto.Z();
        if (Z != null) {
            bpn0 bpn0Var = xfa0.a;
            Photo a2 = xfa0.a(Z.e());
            BaseCropPhotoCropDto d2 = Z.d();
            cropPhoto = new CropPhoto(a2, new CropPhoto.Crop(d2.d(), d2.f(), d2.e(), d2.g()));
        } else {
            cropPhoto = null;
        }
        userProfile.Q = cropPhoto;
        List<String> v0 = usersUserFullDto.v0();
        if (v0 != null) {
            List<String> list2 = v0;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(new ProfileDescription((String) it3.next()));
            }
        } else {
            arrayList = null;
        }
        userProfile.E = arrayList;
        OwnerStateDto V1 = usersUserFullDto.V1();
        OwnerStateDto.StateDto e4 = V1 != null ? V1.e() : null;
        OwnerStateDto V12 = usersUserFullDto.V1();
        String description = V12 != null ? V12.getDescription() : null;
        if (e4 == null || description == null) {
            String l0 = usersUserFullDto.l0();
            if (l0 != null) {
                if (drm0.N(l0)) {
                    l0 = null;
                }
                if (l0 != null) {
                    DeactivationWithMessage.a aVar2 = new DeactivationWithMessage.a();
                    aVar2.b(l0);
                    deactivationWithMessage = aVar2.a();
                }
            }
            deactivationWithMessage = null;
        } else {
            OwnerStateDto V13 = usersUserFullDto.V1();
            OwnerStatePhotosDto d3 = V13 != null ? V13.d() : null;
            int i = e4.i();
            if (d3 == null || (g = d3.g()) == null || (e = js5.a(200, g)) == null) {
                e = d3 != null ? d3.e() : null;
                if (e == null) {
                    e = d3 != null ? d3.d() : null;
                    if (e == null) {
                        String f = d3 != null ? d3.f() : null;
                        if (f != null || (f = userProfile.P) != null) {
                            str5 = f;
                        }
                        deactivationWithMessage = new DeactivationWithMessage.a(new u590(i, description, str5)).a();
                    }
                }
            }
            str5 = e;
            deactivationWithMessage = new DeactivationWithMessage.a(new u590(i, description, str5)).a();
        }
        userProfile.D = deactivationWithMessage;
        Boolean f3 = usersUserFullDto.f3();
        userProfile.a0 = f3 != null ? f3.booleanValue() : false;
        userProfile.b0 = usersUserFullDto.f3() != null;
        SocialButtonType.a aVar3 = SocialButtonType.Companion;
        UsersUserFullDto.SocialButtonTypeDto M2 = usersUserFullDto.M2();
        String i2 = M2 != null ? M2.i() : null;
        aVar3.getClass();
        userProfile.e0 = SocialButtonType.a.a(i2);
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
            arrayList.add(a((UsersUserFullDto) it.next()));
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
