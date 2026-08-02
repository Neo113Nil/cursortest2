package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: MarketItemCommentsRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class h110 implements f110 {
    public final yd10 a;
    public final i110 b;
    public final List<UsersFieldsDto> c = e43.l(UsersFieldsDto.IS_NFT, UsersFieldsDto.VERIFIED, UsersFieldsDto.IS_VERIFIED, UsersFieldsDto.TRENDING, UsersFieldsDto.PHOTO_BASE);

    public h110(yd10 yd10Var, i110 i110Var) {
        this.a = yd10Var;
        this.b = i110Var;
    }

    @Override // xsna.f110
    public final io.reactivex.rxjava3.internal.operators.single.y a(int i, int i2, long j, UserId userId) {
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        List<UsersFieldsDto> list = this.c;
        return rsg0.w0(yfb.x(this.a.n(userId, (int) j, valueOf, valueOf2, list))).l(new ql2(new g110(i, i2, this, userId), 27));
    }
}
