package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsTypeDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.hg1;
import xsna.lgj0;
import xsna.rnq0;
import xsna.sft0;

/* compiled from: UserProfileContentRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class vnq0 implements rnq0 {
    public final r0e0 a;
    public final ExtendedProfilesRepository b;
    public final AlbumsRepository c;
    public final f8a0 d;
    public final ou50 e;
    public final ysg0<m7a0> f;
    public final ix4 g;
    public final fai h;
    public final sp3 i;
    public final uft0 j;
    public final jod k;

    public vnq0(r0e0 r0e0Var, wjs0 wjs0Var, ExtendedProfilesRepository extendedProfilesRepository, AlbumsRepository albumsRepository, f8a0 f8a0Var, ou50 ou50Var, ysg0 ysg0Var, sp3 sp3Var) {
        ix4 ix4Var = new ix4();
        fai faiVar = new fai();
        uft0 uft0Var = new uft0();
        this.a = r0e0Var;
        this.b = extendedProfilesRepository;
        this.c = albumsRepository;
        this.d = f8a0Var;
        this.e = ou50Var;
        this.f = ysg0Var;
        this.g = ix4Var;
        this.h = faiVar;
        this.i = sp3Var;
        this.j = uft0Var;
        this.k = new jod(20);
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a() {
        return this.i.a().U(new itj0(new oan0(2), 5));
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.core.q<List<ExtendedUserProfile.m>> b(UserId userId, boolean z) {
        return this.b.b(userId, z);
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 c(int i, UserId userId, int i2) {
        return this.c.f(i, i2, userId, true).U(new s1j0(new l140(24), 7)).a0(asu0.a.d());
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 d(UserId userId, String str) {
        return f8a0.g(this.d, userId, str, 60, 16).a0(asu0.a.d());
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 e() {
        return this.b.e().U(new khc0(new kdw(this, 26), 8));
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.single.y f(UserId userId, String str, boolean z) {
        return rsg0.W(yfb.x(mgj0.n(new ngj0(), userId, ShortVideoGetPlaylistsTypeDto.AUTHORS, null, null, null, null, 25, str, 60)), 7).l(new sqk0(new a720(this, z), 4));
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.single.y g(int i, UserId userId, String str) {
        return rsg0.W(yfb.x(hx4.t(this.g, userId, Integer.valueOf(i), null, str, 490)), 7).l(new x6h0(new dl70(23), 4));
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.single.y h(UserId userId, String str) {
        return rsg0.W(yfb.x(lgj0.a.g(new ngj0(), userId, 45, str, null, null, null, null, null, null, null, 65528)), 7).l(new n5j0(new y160(16), 6));
    }

    @Override // xsna.rnq0
    public final void i(rnq0.a aVar) {
        this.b.u0(new ExtendedProfilesRepository.b(aVar.a, aVar.b, aVar.c, aVar.d));
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 j(String str) {
        return f8a0.g(this.d, this.a.a(), str, 20, 16).a0(asu0.a.d());
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.single.y k(UserId userId, Integer num) {
        return rsg0.W(yfb.x(this.j.t(userId, num, 30)), 7).l(new did0(new ow60(18), 12));
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.core.q<xaf> l() {
        io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
        qu50 qu50Var = new qu50(new rzl0(this, 11), 15);
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, qu50Var).L(new ugm0(new x620(29), 4), false);
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 m() {
        ysg0<Object> ysg0Var = ysg0.b;
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0Var.a;
        hg1.h4 h4Var = new hg1.h4(tnq0.b);
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, h4Var).U(new hg1.g4(oze0.d)), new mrc0(new q8i0(this, 14), 11));
        io.reactivex.rxjava3.subjects.f<m7a0> fVar2 = this.f.a;
        oq80 oq80Var = new oq80(new rtg0(this, 9), 10);
        fVar2.getClass();
        io.reactivex.rxjava3.internal.operators.observable.d2 v0 = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, oq80Var).v0(500L, TimeUnit.MILLISECONDS);
        io.reactivex.rxjava3.subjects.f<Object> fVar3 = ysg0Var.a;
        hg1.h4 h4Var2 = new hg1.h4(unq0.b);
        fVar3.getClass();
        return io.reactivex.rxjava3.core.q.V(i0Var, v0, new io.reactivex.rxjava3.internal.operators.observable.i0(fVar3, h4Var2).U(new hg1.g4(jbq0.d))).D(new tl30(new qyi0(this, 13), 29)).U(new yu50(13));
    }

    @Override // xsna.rnq0
    public final void n(rnq0.a aVar) {
        this.b.D(new ExtendedProfilesRepository.b(aVar.a, aVar.b, aVar.c, aVar.d));
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.core.q o(UserId userId, String str) {
        Integer m;
        int intValue = (str == null || (m = arm0.m(10, str)) == null) ? 0 : m.intValue();
        return rsg0.w0(yfb.x(this.h.f(userId, Integer.valueOf(intValue), 45))).l(new h8e0(new ueo(intValue, 2), 3)).w();
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.core.q p(UserId userId, String str) {
        return this.e.b(45, userId, str, false);
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.single.y q(UserId userId, String str) {
        Integer m;
        int intValue = (str == null || (m = arm0.m(10, str)) == null) ? 0 : m.intValue();
        return rsg0.W(yfb.x(hx4.C(this.g, userId, null, null, Integer.valueOf(intValue), 30, null, null, 16190)), 7).l(new xx40(new dpm(intValue, 1), 13));
    }

    @Override // xsna.rnq0
    public final io.reactivex.rxjava3.internal.operators.single.y r(UserId userId, String str) {
        Integer m;
        int intValue = (str == null || (m = arm0.m(10, str)) == null) ? 0 : m.intValue();
        return rsg0.W(yfb.x(sft0.a.d(this.j, -2, userId, 20, Integer.valueOf(intValue), null, null, null, null, null, tby.d(UsersFieldsDto.FOLLOWERS_COUNT, GroupsFieldsDto.MEMBERS_COUNT, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, UsersFieldsDto.PHOTO_BASE), 496)), 7).l(new fe60(new snq0(intValue), 14));
    }
}
