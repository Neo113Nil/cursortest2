package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.Collections;
import java.util.List;
import xsna.mts;

/* compiled from: BestFriendsListDataSource.kt */
/* loaded from: classes4.dex */
public final class yx6 extends czi {
    @Override // xsna.czi
    public final io.reactivex.rxjava3.internal.operators.observable.j1 l(int i, int i2) {
        List l = e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.LISTS, UsersFieldsDto.PHOTO_BASE);
        FriendsGetOrderDto friendsGetOrderDto = FriendsGetOrderDto.HINTS;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        if ((965 & 2) != 0) {
            friendsGetOrderDto = null;
        }
        return rsg0.T(yfb.x(mts.a.a(null, friendsGetOrderDto, null, (965 & 8) != 0 ? null : valueOf, (965 & 16) != 0 ? null : valueOf2, l, null, null))).U(new lp0(new xx6(i2, i), 5));
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.core.q<kqs> o() {
        return rsg0.T(new wx6());
    }

    @Override // xsna.czi
    public final io.reactivex.rxjava3.core.q<cts> p(String str) {
        tfx tfxVar = new tfx("messages.searchConversations", new fr(24), new gr(21));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        return rsg0.T(new zx6(yfb.x(tfxVar), yfb.x(nts.h(new ots(), null, str, Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, null, 243))));
    }
}
