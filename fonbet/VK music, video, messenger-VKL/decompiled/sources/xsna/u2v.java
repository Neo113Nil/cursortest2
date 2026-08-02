package xsna;

import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.mts;
import xsna.r1r0;

/* compiled from: HiddenFriendsListDataSource.kt */
/* loaded from: classes4.dex */
public final class u2v extends czi {
    public final List<UserId> c;
    public final List<UsersFieldsDto> d;
    public final ots e;
    public final u1r0 f;

    public u2v(List<UserId> list) {
        super(7);
        this.c = list;
        this.d = e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.LISTS, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE);
        this.e = new ots();
        this.f = new u1r0();
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.internal.operators.observable.j1 l(int i, int i2) {
        return rsg0.T(yfb.x(mts.a.b(this.e, null, FriendsGetOrderDto.HINTS, null, Integer.valueOf(i), Integer.valueOf(i2), this.d, null, null, 965))).U(new q7(new s2v(i2, i), 25));
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.core.q<kqs> o() {
        return io.reactivex.rxjava3.core.q.I0(rsg0.T(yfb.x(mts.a.b(this.e, null, FriendsGetOrderDto.HINTS, null, null, null, this.d, null, null, 989))), r(), new r2v(new ncb(this, 4), 0));
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.core.q<cts> p(String str) {
        return io.reactivex.rxjava3.core.q.I0(rsg0.T(yfb.x(nts.h(this.e, t11.b(), str, this.d, null, null, null, 242))), r(), new bl(new t2v(str), 23));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 r() {
        return rsg0.T(yfb.x(r1r0.a.b(this.f, this.c, this.d, null, null, 58))).U(new s7(new sm0(28), 16));
    }
}
