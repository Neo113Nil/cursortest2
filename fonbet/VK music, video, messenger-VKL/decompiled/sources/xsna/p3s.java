package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: FollowersListRepository.kt */
/* loaded from: classes15.dex */
public final class p3s {
    public final UserId a;
    public final ots b;
    public final zi50 c;
    public final j2r0 d = new j2r0();

    public p3s(UserId userId, ots otsVar, zi50 zi50Var) {
        this.a = userId;
        this.b = otsVar;
        this.c = zi50Var;
    }

    public final io.reactivex.rxjava3.internal.operators.single.r a(int i) {
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.W(yfb.x(this.b.p(30, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE_ALL_FOLLOWERS), Integer.valueOf(i), this.a, null)), 7), new q9(new arf(this, 14), 10));
    }
}
