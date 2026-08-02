package xsna;

import com.vk.api.generated.friends.dto.FriendsSetFollowersModeModeStatusDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.followersmode.api.domain.FollowersModeState;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import xsna.r1r0;

/* compiled from: FollowersModeInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class c4s implements b4s, w8i {
    public final io.reactivex.rxjava3.subjects.f<FollowersModeState> b = new io.reactivex.rxjava3.subjects.f<>();
    public final w1r0 c = new w1r0();
    public final ots d = new ots();
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new l9h(this, 18));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.b4s
    public final void a() {
        rsg0.T(yfb.x(r1r0.a.b(this.c, Collections.singletonList(((b25) this.e.getValue()).o().a), Collections.singletonList(UsersFieldsDto.IS_FOLLOWERS_MODE_ON), null, null, 58))).subscribe(new m1r(new bjk(this, 11), 1));
    }

    @Override // xsna.b4s
    public final void b(FollowersModeState followersModeState) {
        e(false, followersModeState.h());
    }

    @Override // xsna.b4s
    public final io.reactivex.rxjava3.core.a c(boolean z) {
        FriendsSetFollowersModeModeStatusDto friendsSetFollowersModeModeStatusDto = z ? FriendsSetFollowersModeModeStatusDto.ALL_USERS : FriendsSetFollowersModeModeStatusDto.DISABLED;
        this.d.getClass();
        tfx tfxVar = new tfx("friends.setFollowersMode", new en(22), new io.reactivex.rxjava3.internal.operators.observable.q1(24));
        tfx.o(tfxVar, "mode_status", friendsSetFollowersModeModeStatusDto.i(), 0, 0, 12);
        return new io.reactivex.rxjava3.internal.operators.single.s(rsg0.w0(yfb.x(tfxVar)).m(asu0.a.d()), new e10(new dp4(this, z, 2), 28));
    }

    @Override // xsna.b4s
    public final io.reactivex.rxjava3.core.q<FollowersModeState> d() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(boolean z, Boolean bool) {
        ?? r0 = this.e;
        if (epx.f(((b25) r0.getValue()).o().k, bool)) {
            return;
        }
        ((b25) r0.getValue()).A().a(bool).commit();
        if (z) {
            FollowersModeState.Companion.getClass();
            this.b.onNext(FollowersModeState.a.a(bool));
        }
    }
}
