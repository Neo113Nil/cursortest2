package xsna;

import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import xsna.s1r0;

/* compiled from: VkVoipForceRelayProvider.kt */
/* loaded from: classes7.dex */
public final class d1w0 {
    public final wy2 a;

    public d1w0(wy2 wy2Var) {
        this.a = wy2Var;
    }

    public final boolean a(long j) {
        dz2 x = yfb.x(bs.e(new es(), Collections.singletonList(AccountSetPrivacyKeyDto.CALLS_IP.i()), 4));
        List singletonList = Collections.singletonList(new UserId(j));
        List singletonList2 = Collections.singletonList(UsersFieldsDto.IS_FRIEND);
        if ((58 & 1) != 0) {
            singletonList = null;
        }
        if ((58 & 4) != 0) {
            singletonList2 = null;
        }
        return ((Boolean) new com.vk.api.request.rx.batch.e(x, yfb.x(s1r0.a.b(singletonList, null, singletonList2, null, null)), new x9d(7)).f(this.a)).booleanValue();
    }
}
