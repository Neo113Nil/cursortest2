package xsna;

import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: GetReactedUsers.kt */
/* loaded from: classes15.dex */
public final class utt {
    public static final List<String> a = e43.l("online_info", "photo_base");

    public static rsg0 a(LikesGetList.Type type, LikesGetList.Type type2, UserId userId, long j, int i, String str, boolean z, boolean z2, int i2, boolean z3, int i3) {
        boolean z4 = type == LikesGetList.Type.POST || type == LikesGetList.Type.POST_ADS;
        boolean z5 = type == LikesGetList.Type.COMMENT;
        String a2 = type.a(type2);
        return (z3 && z2 && z4) ? new a060(type, userId, j, i, i2, i3) : (z3 && z2 && z5) ? new zz50(a2, userId, j, i, i2, i3) : (!z3 && z2 && z5) ? new wz50(a2, userId, j, i, i2) : (z3 && !z2 && z5) ? new yz50(a2, userId, j, i, i3) : (z3 || z2 || !z5) ? (!z3 && z2 && z4) ? new xz50(type, userId, j, i, i2) : (z3 && !z2 && z4) ? new b060(type, userId, j, i, i3) : (z3 || z2 || !z4) ? yfb.z(k0x.f(new k0x(4), a2, userId, Integer.valueOf((int) j), null, null, Integer.valueOf(i), null, a, 888), new kjb(i, 2)) : new q0c0(type, userId, j, z, epx.f(str, "copies"), i) : new ydg(a2, userId, j, z, epx.f(str, "copies"), i);
    }
}
