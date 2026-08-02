package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.users.dto.UsersUserDonatedFriendDto;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.dto.user.deactivation.DeactivationWithMessage;

/* compiled from: GroupsGroupDonutDtoToDonutMapper.kt */
/* loaded from: classes3.dex */
public final class cqu {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UserProfile a(UsersUserDonatedFriendDto usersUserDonatedFriendDto) {
        UserSex userSex;
        UserProfile userProfile = new UserProfile();
        userProfile.c = usersUserDonatedFriendDto.g();
        BaseSexDto B = usersUserDonatedFriendDto.B();
        if (B != null) {
            new sm6();
            userSex = sm6.a(B);
        }
        userSex = UserSex.UNKNOWN;
        userProfile.i = userSex;
        userProfile.O = zm00.b(16, usersUserDonatedFriendDto.u(), usersUserDonatedFriendDto.p(), usersUserDonatedFriendDto.n(), usersUserDonatedFriendDto.o());
        userProfile.h = zm00.c(usersUserDonatedFriendDto.u(), usersUserDonatedFriendDto.p(), usersUserDonatedFriendDto.n(), usersUserDonatedFriendDto.o());
        userProfile.g = usersUserDonatedFriendDto.u();
        BaseBoolIntDto j = usersUserDonatedFriendDto.j();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        boolean z = j == baseBoolIntDto || usersUserDonatedFriendDto.l() == baseBoolIntDto;
        Platform platform = usersUserDonatedFriendDto.l() == baseBoolIntDto ? Platform.MOBILE : Platform.WEB;
        Integer k = usersUserDonatedFriendDto.k();
        userProfile.n = new VisibleStatus(0L, z, k != null ? k.intValue() : 0, platform, 1, null);
        userProfile.B.Ab(new VerifyInfo(usersUserDonatedFriendDto.D() == baseBoolIntDto, usersUserDonatedFriendDto.C() == baseBoolIntDto, false, false, false, false, 60, null));
        FriendsFriendStatusStatusDto f = usersUserDonatedFriendDto.f();
        if (f != null) {
            userProfile.v = f.i();
        }
        String d = usersUserDonatedFriendDto.d();
        if (d == null) {
            d = "";
        }
        userProfile.C = d;
        String d2 = usersUserDonatedFriendDto.d();
        if (d2 != null) {
            if (d2.length() <= 0) {
                d2 = null;
            }
            if (d2 != null) {
                DeactivationWithMessage.a aVar = new DeactivationWithMessage.a();
                aVar.b(d2);
                userProfile.D = aVar.a();
            }
        }
        String e = usersUserDonatedFriendDto.e();
        if (e == null) {
            e = "";
        }
        userProfile.d = e;
        String i = usersUserDonatedFriendDto.i();
        userProfile.f = i != null ? i : "";
        Boolean F = usersUserDonatedFriendDto.F();
        userProfile.z = F != null ? F.booleanValue() : false;
        return userProfile;
    }
}
