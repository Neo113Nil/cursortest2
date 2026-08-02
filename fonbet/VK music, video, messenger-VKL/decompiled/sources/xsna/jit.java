package xsna;

import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import xsna.mts;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class jit implements ffn0 {
    public final bpn0 a = new bpn0(new i9(25));

    @Override // xsna.ffn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(int i, int i2) {
        FriendsGetOrderDto friendsGetOrderDto = FriendsGetOrderDto.NAME;
        return rdx0.u(e370.e(mts.a.a(null, (965 & 2) != 0 ? null : friendsGetOrderDto, null, (965 & 8) != 0 ? null : Integer.valueOf(i2), (965 & 16) != 0 ? null : Integer.valueOf(i), e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.SEX, UsersFieldsDto.PHOTO_BASE), null, null))).U(new do3(new d9j(this, 12), 18));
    }
}
