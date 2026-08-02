package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOwnerCoverDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.users.dto.UsersUserCountersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserSex;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.d590;

/* compiled from: VideoProfileRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class z8t0 extends FunctionReferenceImpl implements izs<UsersUserFullDto, u490> {
    public static final z8t0 b = new z8t0(1, d590.class, "toOwnerData", "toOwnerData(Lcom/vk/api/generated/users/dto/UsersUserFullDto;)Lcom/vk/video/profile/data/models/OwnerData;", 1);

    @Override // xsna.izs
    public final u490 invoke(UsersUserFullDto usersUserFullDto) {
        boolean z;
        boolean z2;
        Image image;
        String i2;
        Long B;
        Integer u;
        UsersUserFullDto usersUserFullDto2 = usersUserFullDto;
        UserId s1 = usersUserFullDto2.s1();
        String D0 = usersUserFullDto2.D0();
        String x1 = usersUserFullDto2.x1();
        String a = rq.a(usersUserFullDto2, new StringBuilder(), ' ');
        BaseBoolIntDto R2 = usersUserFullDto2.R2();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        boolean z3 = true;
        boolean z4 = false;
        if (R2 == baseBoolIntDto) {
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (usersUserFullDto2.O2() == baseBoolIntDto) {
            z2 = false;
            z4 = z;
        } else {
            z2 = false;
        }
        Boolean o3 = usersUserFullDto2.o3();
        VerifyInfo verifyInfo = new VerifyInfo(z3, z4, o3 != null ? o3.booleanValue() : z2, false, false, false, 56, null);
        String a2 = cqm0.a(usersUserFullDto2.r2());
        if (a2 != null) {
            Serializer.c<Image> cVar = Image.CREATOR;
            image = Image.b.a(a2);
        } else {
            image = null;
        }
        BaseSexDto L2 = usersUserFullDto2.L2();
        int i = L2 == null ? -1 : d590.a.$EnumSwitchMapping$2[L2.ordinal()];
        UserSex userSex = i != z ? i != 2 ? UserSex.UNKNOWN : UserSex.MALE : UserSex.FEMALE;
        String r2 = usersUserFullDto2.r2();
        if (r2 == null || (i2 = js5.a(200, r2)) == null) {
            i2 = usersUserFullDto2.i2();
        }
        boolean z5 = z;
        Owner owner = new Owner(s1, a, usersUserFullDto2.r2(), i2, verifyInfo, image, null, null, null, null, userSex, D0, x1, false, false, false, false, null, 0, null, null, false, 4187072, null);
        Boolean T2 = usersUserFullDto2.T2();
        owner.n(T2 != null ? T2.booleanValue() : false);
        owner.o(usersUserFullDto2.l0() != null ? !drm0.N(r2) : false);
        String J2 = usersUserFullDto2.J2();
        UsersUserCountersDto R = usersUserFullDto2.R();
        long j = 0;
        long intValue = (R == null || (u = R.u()) == null) ? 0L : u.intValue();
        UsersUserCountersDto R3 = usersUserFullDto2.R();
        if (R3 == null || (B = R3.B()) == null) {
            Integer U0 = usersUserFullDto2.U0();
            if (U0 != null) {
                j = U0.intValue();
            }
        } else {
            j = B.longValue();
        }
        long j2 = j;
        String d = usersUserFullDto2.d();
        boolean z6 = (usersUserFullDto2.V0() == FriendsFriendStatusStatusDto.IS_FRIEND || usersUserFullDto2.V0() == FriendsFriendStatusStatusDto.OUTCOMING_REQUEST) ? z5 : false;
        String q2 = usersUserFullDto2.q2();
        BaseOwnerCoverDto W = usersUserFullDto2.W();
        Image a3 = W != null ? d590.a(W) : null;
        BaseOwnerCoverDto W2 = usersUserFullDto2.W();
        return new u490(owner, new zog(false, false, false), J2, intValue, null, j2, null, d, z6, null, q2, a3, (W2 != null ? W2.d() : null) == baseBoolIntDto ? z5 : false, null, false, null, null, null, null, null, null, null);
    }
}
