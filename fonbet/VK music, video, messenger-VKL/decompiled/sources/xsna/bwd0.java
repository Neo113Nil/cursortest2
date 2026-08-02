package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;

/* compiled from: ProfileExt.kt */
/* loaded from: classes5.dex */
public final class bwd0 {
    public static final boolean a(ExtendedCommunityProfile extendedCommunityProfile) {
        return extendedCommunityProfile.a0 >= 1 && !extendedCommunityProfile.g();
    }

    public static final boolean b(ExtendedCommunityProfile extendedCommunityProfile) {
        ExtendedUserProfile.e eVar = extendedCommunityProfile.k1;
        return eVar != null && eVar.b <= 0;
    }

    public static final boolean c(ExtendedUserProfile extendedUserProfile) {
        int i;
        return g(extendedUserProfile) ? !extendedUserProfile.D1 : (d(extendedUserProfile) || extendedUserProfile.Z != 1 || (i = extendedUserProfile.a1) == 1 || i == 2) ? false : true;
    }

    public static final boolean d(ExtendedUserProfile extendedUserProfile) {
        return o25.a().b() && o25.a().a(i(extendedUserProfile));
    }

    public static final boolean e(ExtendedUserProfile extendedUserProfile) {
        return extendedUserProfile.a1 == 3;
    }

    public static final boolean f(ExtendedUserProfile extendedUserProfile) {
        int i;
        int i2 = extendedUserProfile.Z;
        return ((i2 != 2 && (extendedUserProfile.Y != 1 || i2 != 1)) || (i = extendedUserProfile.a1) == 1 || i == 2) ? false : true;
    }

    public static final boolean g(ExtendedUserProfile extendedUserProfile) {
        return fkq0.d(i(extendedUserProfile));
    }

    public static final boolean h(ExtendedCommunityProfile extendedCommunityProfile) {
        int i;
        return ((extendedCommunityProfile.Y == 1 && extendedCommunityProfile.Z == 1) || b(extendedCommunityProfile) || (i = extendedCommunityProfile.a1) == 1 || i == 2 || i == 4 || b(extendedCommunityProfile)) ? false : true;
    }

    public static final UserId i(ExtendedUserProfile extendedUserProfile) {
        UserId userId;
        UserProfile userProfile = extendedUserProfile.a;
        return (userProfile == null || (userId = userProfile.c) == null) ? UserId.d : userId;
    }

    public static final ExtendedUserProfile j(UserProfile userProfile) {
        ArrayList arrayList;
        ExtendedUserProfile extendedUserProfile = new ExtendedUserProfile();
        extendedUserProfile.a = userProfile;
        extendedUserProfile.e0 = userProfile.d();
        extendedUserProfile.a1 = userProfile.v;
        Image image = userProfile.O;
        String h = (image == null || (arrayList = image.b) == null) ? null : ixj0.h(arrayList);
        extendedUserProfile.j = h;
        extendedUserProfile.n0 = h != null;
        extendedUserProfile.q = userProfile.D;
        extendedUserProfile.k0 = userProfile.x;
        extendedUserProfile.A1 = userProfile.z;
        extendedUserProfile.k = userProfile.M;
        return extendedUserProfile;
    }

    public static final Group k(ExtendedCommunityProfile extendedCommunityProfile) {
        UserId userId;
        VerifyInfo verifyInfo;
        VerifyInfo verifyInfo2;
        Group group = new Group();
        UserProfile userProfile = extendedCommunityProfile.a;
        if (userProfile == null || (userId = userProfile.c) == null) {
            userId = UserId.d;
        }
        group.c = fkq0.a(userId);
        UserProfile userProfile2 = extendedCommunityProfile.a;
        group.d = userProfile2 != null ? userProfile2.e : null;
        group.e = userProfile2 != null ? userProfile2.h : null;
        group.z = extendedCommunityProfile.r0;
        group.p = extendedCommunityProfile.Y;
        group.m = extendedCommunityProfile.Z;
        group.i = extendedCommunityProfile.s2;
        group.s = extendedCommunityProfile.a0;
        group.q = extendedCommunityProfile.T;
        boolean z = (userProfile2 == null || (verifyInfo2 = userProfile2.B) == null) ? false : verifyInfo2.b;
        VerifyInfo verifyInfo3 = group.y;
        verifyInfo3.b = z;
        verifyInfo3.c = (userProfile2 == null || (verifyInfo = userProfile2.B) == null) ? false : verifyInfo.c;
        group.h = extendedCommunityProfile.A0;
        Integer num = extendedCommunityProfile.Z0.get("members");
        group.v = num != null ? num.intValue() : 0;
        group.G = extendedCommunityProfile.E1;
        group.H = extendedCommunityProfile.F1;
        group.Q = extendedCommunityProfile.t2;
        group.j0 = extendedCommunityProfile.N2;
        group.m0 = extendedCommunityProfile.J1;
        group.p0 = extendedCommunityProfile.P2;
        group.E = extendedCommunityProfile.y1;
        group.F = extendedCommunityProfile.w2;
        group.n = extendedCommunityProfile.d0;
        return group;
    }

    public static final UserProfile l(ExtendedUserProfile extendedUserProfile) {
        UserProfile userProfile = extendedUserProfile.a;
        userProfile.a0(extendedUserProfile.e0);
        userProfile.v = extendedUserProfile.a1;
        if (extendedUserProfile.n0) {
            userProfile.h = extendedUserProfile.j;
        }
        userProfile.x = extendedUserProfile.k0;
        userProfile.z = extendedUserProfile.A1;
        userProfile.D = extendedUserProfile.q;
        return userProfile;
    }
}
