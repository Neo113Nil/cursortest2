package defpackage;

import com.yandex.go.payments.data.model.response.CommonPaymentMethodDto;
import com.yandex.go.payments.data.model.response.FastshiftAccount;
import com.yandex.go.payments.data.model.response.JazzcashWallet;
import com.yandex.go.payments.data.model.response.Kaspi;
import com.yandex.go.payments.data.model.response.NequiToken;
import com.yandex.go.payments.data.model.response.SbpBindToken;
import com.yandex.go.payments.data.model.response.YapeToken;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class b5a0 extends xqt {
    public static final b5a0 e = new b5a0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, CommonPaymentMethodDto.Companion.serializer(), qoi0.a(CommonPaymentMethodDto.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("yape_token", YapeToken.Companion.serializer(), qoi0.a(YapeToken.class)), new f9("nequi_token", NequiToken.Companion.serializer(), qoi0.a(NequiToken.class)), new f9("fastshift_account", FastshiftAccount.Companion.serializer(), qoi0.a(FastshiftAccount.class)), new f9("jazzcash_wallet", JazzcashWallet.Companion.serializer(), qoi0.a(JazzcashWallet.class)), new f9("sbp", SbpBindToken.Companion.serializer(), qoi0.a(SbpBindToken.class)), new f9("kaspi", Kaspi.Companion.serializer(), qoi0.a(Kaspi.class)));
    }
}
