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
import com.vk.api.generated.groups.dto.GroupsUserXtrRoleDto;
import com.vk.api.generated.owner.dto.OwnerStateDto;
import com.vk.api.generated.owner.dto.OwnerStatePhotosDto;
import com.vk.api.generated.status.dto.StatusImageStatusDto;
import com.vk.api.generated.users.dto.UsersCareerDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
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
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: GroupsUserXtrRoleDtoToUserProfileMapper.kt */
/* loaded from: classes3.dex */
public final class qru {
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02fb, code lost:
    
        if (r1 == null) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UserProfile a(GroupsUserXtrRoleDto groupsUserXtrRoleDto) {
        String str;
        MutualInfo mutualInfo;
        String str2;
        String str3;
        String str4;
        String str5;
        CropPhoto cropPhoto;
        ArrayList arrayList;
        DeactivationWithMessage deactivationWithMessage;
        String e;
        String g;
        ArrayList arrayList2;
        UserProfile userProfile = new UserProfile();
        userProfile.c = groupsUserXtrRoleDto.D0();
        String G = groupsUserXtrRoleDto.G();
        String str6 = "";
        if (G == null && (G = groupsUserXtrRoleDto.Z()) == null) {
            G = "";
        }
        userProfile.d = G;
        String H0 = groupsUserXtrRoleDto.H0();
        if (H0 == null && (H0 = groupsUserXtrRoleDto.V0()) == null) {
            H0 = "";
        }
        userProfile.f = H0;
        userProfile.e = userProfile.d + ' ' + userProfile.f;
        userProfile.g = groupsUserXtrRoleDto.t1();
        Iterator it = rl3.I(new String[]{js5.a(100, groupsUserXtrRoleDto.t1()), groupsUserXtrRoleDto.o1(), groupsUserXtrRoleDto.s1()}).iterator();
        while (true) {
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
        ListBuilder e2 = e43.e();
        String t1 = groupsUserXtrRoleDto.t1();
        if (t1 != null) {
            m900<String, ImageSize> m900Var = ImageSize.e;
            e2.add(ImageSize.b.a(t1));
        }
        String s1 = groupsUserXtrRoleDto.s1();
        if (s1 != null) {
            e2.add(new ImageSize(s1, 50, 50, null, (char) 0, false, 56, null));
        }
        String o1 = groupsUserXtrRoleDto.o1();
        if (o1 != null) {
            e2.add(new ImageSize(o1, 100, 100, null, (char) 0, false, 56, null));
        }
        userProfile.O = new Image(e2.g());
        UserSex.a aVar = UserSex.Companion;
        BaseSexDto z1 = groupsUserXtrRoleDto.z1();
        Integer valueOf = z1 != null ? Integer.valueOf(z1.i()) : null;
        aVar.getClass();
        userProfile.i = UserSex.a.a(valueOf);
        String F = groupsUserXtrRoleDto.F();
        if (F == null) {
            F = groupsUserXtrRoleDto.y1();
        }
        userProfile.q = F;
        userProfile.p = groupsUserXtrRoleDto.d();
        userProfile.C = groupsUserXtrRoleDto.C();
        userProfile.M = groupsUserXtrRoleDto.D1();
        OnlineInfo a = dlq0.a(groupsUserXtrRoleDto.d1());
        if (a == null) {
            a = VisibleStatus.f;
        }
        userProfile.n = a;
        Boolean i2 = groupsUserXtrRoleDto.i2();
        userProfile.Y = i2 != null ? i2.booleanValue() : false;
        BaseBoolIntDto X1 = groupsUserXtrRoleDto.X1();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        userProfile.j = X1 == baseBoolIntDto;
        FriendsFriendStatusStatusDto l0 = groupsUserXtrRoleDto.l0();
        userProfile.v = l0 != null ? l0.i() : -1;
        userProfile.B.Ab(new VerifyInfo(groupsUserXtrRoleDto.N1() == baseBoolIntDto, groupsUserXtrRoleDto.E1() == baseBoolIntDto, false, false, false, false, 60, null));
        userProfile.x = groupsUserXtrRoleDto.j() == baseBoolIntDto;
        userProfile.a0(groupsUserXtrRoleDto.l() == baseBoolIntDto);
        FriendsRequestsMutualDto b1 = groupsUserXtrRoleDto.b1();
        if (b1 != null) {
            Integer d = b1.d();
            List<UserId> e3 = b1.e();
            if (e3 != null) {
                List<UserId> list = e3;
                arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((UserId) it2.next()).b));
                }
            } else {
                arrayList2 = null;
            }
            mutualInfo = new MutualInfo(d, arrayList2);
        } else {
            mutualInfo = null;
        }
        userProfile.d0 = mutualInfo;
        BaseBoolIntDto V1 = groupsUserXtrRoleDto.V1();
        BaseBoolIntDto baseBoolIntDto2 = BaseBoolIntDto.YES;
        userProfile.k = V1 == baseBoolIntDto2;
        userProfile.G = groupsUserXtrRoleDto.e() == baseBoolIntDto2;
        userProfile.H = groupsUserXtrRoleDto.f() == baseBoolIntDto2;
        userProfile.w = groupsUserXtrRoleDto.m2() == baseBoolIntDto2;
        userProfile.y = groupsUserXtrRoleDto.i();
        Boolean g2 = groupsUserXtrRoleDto.g();
        userProfile.Z = g2 != null ? g2.booleanValue() : false;
        userProfile.J = groupsUserXtrRoleDto.r();
        Integer a0 = groupsUserXtrRoleDto.a0();
        userProfile.K = a0 != null ? a0.intValue() : 0;
        BaseCityDto o = groupsUserXtrRoleDto.o();
        Bundle bundle = userProfile.s;
        if (o != null) {
            bundle.putString("city_name", o.getTitle());
        }
        String L1 = groupsUserXtrRoleDto.L1();
        if (L1 == null || drm0.N(L1)) {
            BaseCityDto o2 = groupsUserXtrRoleDto.o();
            if (o2 == null || (str2 = o2.getTitle()) == null) {
                str2 = "";
            }
        } else {
            str2 = groupsUserXtrRoleDto.L1();
            if (str2 == null) {
                str2 = "";
            }
            Integer v0 = groupsUserXtrRoleDto.v0();
            if (v0 != null) {
                str2 = str2.concat(String.format(" '%02d", Arrays.copyOf(new Object[]{Integer.valueOf(v0.intValue() % 100)}, 1)));
            }
        }
        userProfile.o = str2;
        String L12 = groupsUserXtrRoleDto.L1();
        List<UsersCareerDto> n = groupsUserXtrRoleDto.n();
        BaseCountryDto u = groupsUserXtrRoleDto.u();
        if (L12 != null && !drm0.N(L12)) {
            String obj = drm0.p0(brm0.y(L12, "\r\n", "")).toString();
            Integer v02 = groupsUserXtrRoleDto.v0();
            str4 = fo8.a(obj, ((v02 != null && v02.intValue() == 0) || v02 == null) ? "" : String.format(" '%02d", Arrays.copyOf(new Object[]{Integer.valueOf(v02.intValue() % 100)}, 1)));
        } else if (n != null) {
            Iterator<T> it3 = n.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    str5 = null;
                    break;
                }
                str5 = ((UsersCareerDto) it3.next()).d();
                if (str5 != null) {
                    break;
                }
            }
            if (str5 != null) {
                str4 = drm0.p0(brm0.y(str5, "\r\n", "")).toString();
            }
            str4 = null;
        } else {
            if (u != null) {
                BaseCityDto o3 = groupsUserXtrRoleDto.o();
                if (o3 != null) {
                    str3 = ", " + o3.getTitle();
                }
                str3 = "";
                str4 = u.getTitle() + str3;
            }
            str4 = null;
        }
        userProfile.r = str4;
        StatusImageStatusDto F0 = groupsUserXtrRoleDto.F0();
        if (F0 != null) {
            int id = F0.getId();
            String e4 = F0.e();
            new ne6();
            userProfile.R = new ImageStatus(id, e4, ne6.a(F0.d()), null, 0, null, null, 120, null);
        }
        userProfile.P = groupsUserXtrRoleDto.x1();
        userProfile.S = groupsUserXtrRoleDto.w0() == BaseBoolIntDto.YES;
        Boolean R1 = groupsUserXtrRoleDto.R1();
        userProfile.A = R1 != null ? R1.booleanValue() : false;
        Boolean y0 = groupsUserXtrRoleDto.y0();
        userProfile.T = y0 != null ? y0.booleanValue() : false;
        Boolean l2 = groupsUserXtrRoleDto.l2();
        userProfile.V = l2 != null ? l2.booleanValue() : false;
        Boolean k = groupsUserXtrRoleDto.k();
        userProfile.U = k != null ? k.booleanValue() : false;
        Integer p = groupsUserXtrRoleDto.p();
        userProfile.W = p != null ? p.intValue() : 0;
        BaseCropPhotoDto B = groupsUserXtrRoleDto.B();
        if (B != null) {
            bpn0 bpn0Var = xfa0.a;
            Photo a2 = xfa0.a(B.e());
            BaseCropPhotoCropDto d2 = B.d();
            cropPhoto = new CropPhoto(a2, new CropPhoto.Crop(d2.d(), d2.f(), d2.e(), d2.g()));
        } else {
            cropPhoto = null;
        }
        userProfile.Q = cropPhoto;
        List<String> D = groupsUserXtrRoleDto.D();
        if (D != null) {
            List<String> list2 = D;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList.add(new ProfileDescription((String) it4.next()));
            }
        } else {
            arrayList = null;
        }
        userProfile.E = arrayList;
        OwnerStateDto n1 = groupsUserXtrRoleDto.n1();
        OwnerStateDto.StateDto e5 = n1 != null ? n1.e() : null;
        OwnerStateDto n12 = groupsUserXtrRoleDto.n1();
        String description = n12 != null ? n12.getDescription() : null;
        if (e5 == null || description == null) {
            String C = groupsUserXtrRoleDto.C();
            if (C != null) {
                if (drm0.N(C)) {
                    C = null;
                }
                if (C != null) {
                    DeactivationWithMessage.a aVar2 = new DeactivationWithMessage.a();
                    aVar2.b(C);
                    deactivationWithMessage = aVar2.a();
                }
            }
            deactivationWithMessage = null;
        } else {
            OwnerStateDto n13 = groupsUserXtrRoleDto.n1();
            OwnerStatePhotosDto d3 = n13 != null ? n13.d() : null;
            int i = e5.i();
            if (d3 == null || (g = d3.g()) == null || (e = js5.a(200, g)) == null) {
                e = d3 != null ? d3.e() : null;
                if (e == null) {
                    e = d3 != null ? d3.d() : null;
                    if (e == null) {
                        String f = d3 != null ? d3.f() : null;
                        if (f != null || (f = userProfile.P) != null) {
                            str6 = f;
                        }
                        deactivationWithMessage = new DeactivationWithMessage.a(new u590(i, description, str6)).a();
                    }
                }
            }
            str6 = e;
            deactivationWithMessage = new DeactivationWithMessage.a(new u590(i, description, str6)).a();
        }
        userProfile.D = deactivationWithMessage;
        Boolean W1 = groupsUserXtrRoleDto.W1();
        userProfile.a0 = W1 != null ? W1.booleanValue() : false;
        userProfile.b0 = groupsUserXtrRoleDto.W1() != null;
        SocialButtonType.a aVar3 = SocialButtonType.Companion;
        GroupsUserXtrRoleDto.SocialButtonTypeDto B1 = groupsUserXtrRoleDto.B1();
        String i3 = B1 != null ? B1.i() : null;
        aVar3.getClass();
        userProfile.e0 = SocialButtonType.a.a(i3);
        String T = groupsUserXtrRoleDto.T();
        if (T != null) {
            bundle.putString(BaseUserGroupFieldsDto.FIRST_NAME_GEN.i(), T);
            String S0 = groupsUserXtrRoleDto.S0();
            if (S0 != null) {
                bundle.putString("name_gen", T + ' ' + S0);
            }
        }
        String R = groupsUserXtrRoleDto.R();
        if (R != null) {
            bundle.putString(BaseUserGroupFieldsDto.FIRST_NAME_DAT.i(), R);
            String P0 = groupsUserXtrRoleDto.P0();
            if (P0 != null) {
                bundle.putString("name_dat", R + ' ' + P0);
            }
        }
        String M = groupsUserXtrRoleDto.M();
        if (M != null) {
            bundle.putString(BaseUserGroupFieldsDto.FIRST_NAME_ACC.i(), M);
            String N0 = groupsUserXtrRoleDto.N0();
            if (N0 != null) {
                bundle.putString("name_acc", M + ' ' + N0);
            }
        }
        String W = groupsUserXtrRoleDto.W();
        if (W != null) {
            bundle.putString(UsersFieldsDto.FIRST_NAME_INS.i(), W);
            String U0 = groupsUserXtrRoleDto.U0();
            if (U0 != null) {
                bundle.putString("name_ins", W + ' ' + U0);
            }
        }
        String K = groupsUserXtrRoleDto.K();
        if (K != null) {
            bundle.putString(UsersFieldsDto.FIRST_NAME_ABL.i(), K);
            String K0 = groupsUserXtrRoleDto.K0();
            if (K0 != null) {
                bundle.putString("name_abl", K + ' ' + K0);
            }
        }
        return userProfile;
    }
}
