package xsna;

import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.List;
import xsna.mts;

/* compiled from: VoipHistoryFriendsRepository.kt */
/* loaded from: classes7.dex */
public final class wpw0 {
    public static final List<UsersFieldsDto> b = e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.SEX, UsersFieldsDto.ONLINE, UsersFieldsDto.ONLINE_INFO, UsersFieldsDto.CAN_CALL, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE);
    public final ots a;

    public wpw0(ots otsVar) {
        this.a = otsVar;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.f0 a(int i) {
        return rsg0.w0(yfb.x(mts.a.b(this.a, null, FriendsGetOrderDto.NAME, null, 25, Integer.valueOf(i), b, null, null, 965)));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.f0 b() {
        return rsg0.w0(yfb.x(mts.a.b(this.a, null, FriendsGetOrderDto.HINTS, null, 5, null, b, null, null, 981)));
    }
}
