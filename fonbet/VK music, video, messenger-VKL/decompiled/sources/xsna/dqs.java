package xsna;

import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import xsna.mts;

/* compiled from: FriendsListDataSource.kt */
/* loaded from: classes4.dex */
public final class dqs extends czi {
    public final Integer c;
    public volatile int d;
    public volatile int e;
    public volatile int f;
    public final List<UsersFieldsDto> g;

    public dqs(Integer num) {
        super(7);
        this.c = num;
        this.g = e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.LISTS, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE);
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.internal.operators.observable.j1 l(int i, int i2) {
        boolean z = this.e < this.d;
        List<UsersFieldsDto> list = this.g;
        Integer num = z ? this.c : null;
        if (z) {
            i = this.d - this.e > 20 ? 20 : this.d - this.e;
        }
        FriendsGetOrderDto friendsGetOrderDto = FriendsGetOrderDto.HINTS;
        int i3 = z ? this.e : this.f;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i3);
        Integer num2 = num;
        if ((961 & 2) != 0) {
            friendsGetOrderDto = null;
        }
        if ((961 & 4) != 0) {
            num2 = null;
        }
        if ((961 & 8) != 0) {
            valueOf = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(yfb.x(mts.a.a(null, friendsGetOrderDto, num2, valueOf, (961 & 16) != 0 ? null : valueOf2, list, null, null)));
        bqs bqsVar = new bqs(new aqs(z, this), 0);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return T.E(bqsVar, lVar, kVar, kVar).U(new ft0(new cqs(z, this), 26));
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.core.q<kqs> o() {
        io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(yfb.x(mts.a.a(null, (985 & 2) != 0 ? null : FriendsGetOrderDto.HINTS, (985 & 4) != 0 ? null : this.c, null, null, this.g, null, null)));
        fsq fsqVar = new fsq(new udo(this, 8), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return T.E(fsqVar, lVar, kVar, kVar).U(new ai3(new tuq(4), 20));
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.core.q<cts> p(String str) {
        return rsg0.T(yfb.x(nts.h(new ots(), t11.b(), str, e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.LISTS, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE), null, null, null, 242))).U(new com.vk.movika.sdk.base.ui.p0(new com(6), 22));
    }
}
