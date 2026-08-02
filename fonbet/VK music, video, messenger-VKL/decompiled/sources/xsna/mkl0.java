package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.market.dto.MarketGetAlbumsResponseDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlTypeDto;
import com.vk.api.generated.market.dto.MarketGetStorefrontFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.xqu;

/* compiled from: StorefrontAlbumsRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class mkl0 {
    public static final List<MarketGetStorefrontFieldsDto> c = Collections.singletonList(MarketGetStorefrontFieldsDto.VIEWED_PRODUCTS);
    public final yd10 a = new yd10();
    public final h6o0 b;

    public mkl0(h6o0 h6o0Var) {
        this.b = h6o0Var;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.f0 a(int i, UserId userId, int i2) {
        UserId userId2;
        rsg0 g5jVar;
        rsg0 g5jVar2;
        rsg0 x = fkq0.b(userId) ? yfb.x(new yd10().w(userId, MarketGetEditUrlTypeDto.MARKET)) : new g5j(new MarketGetEditUrlResponseDto(null, 1, null));
        if (!fkq0.b(userId) || i2 <= 0) {
            userId2 = userId;
            g5jVar = new g5j(new MarketGetAlbumsResponseDto(-1, EmptyList.b, false));
        } else {
            tfx tfxVar = new tfx("market.getAlbums", new zn(17), new io.reactivex.rxjava3.subjects.c(25));
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            userId2 = userId;
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i, 0, 0, 8);
            tfxVar.f(i2, 0, 100, "count");
            g5jVar = yfb.x(tfxVar);
        }
        if (fkq0.b(userId2)) {
            List singletonList = Collections.singletonList(fkq0.e(userId2));
            List l = e43.l(GroupsFieldsDto.MARKET, GroupsFieldsDto.IS_MARKET_CART_ENABLED, GroupsFieldsDto.VERIFIED, GroupsFieldsDto.TRENDING, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.FRIENDS, GroupsFieldsDto.IS_MEMBER, GroupsFieldsDto.CONTACTS, GroupsFieldsDto.ACTION_BUTTON, GroupsFieldsDto.ACTIVITY, GroupsFieldsDto.CAN_MESSAGE);
            if ((4 & 2) != 0) {
                l = null;
            }
            g5jVar2 = yfb.x(xqu.a.a(null, singletonList, l));
        } else {
            g5jVar2 = new g5j(new GroupsGetByIdObjectResponseDto(null, null, 3, null));
        }
        return rsg0.w0(new iz00(x, g5jVar, g5jVar2, userId2));
    }
}
