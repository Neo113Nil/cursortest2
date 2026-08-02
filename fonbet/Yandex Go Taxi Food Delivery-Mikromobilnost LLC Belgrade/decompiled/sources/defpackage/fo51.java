package defpackage;

import com.yandex.go.payments.data.model.response.YangoPaySimpleIntegrationDto;
import com.yandex.go.payments.data.model.response.YangoPayWalletDto;
import com.yandex.go.payments.data.model.response.x1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class fo51 extends xqt {
    public static final fo51 e = new fo51();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, x1.INSTANCE.serializer(), qoi0.a(x1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("yango_wallet", YangoPayWalletDto.Companion.serializer(), qoi0.a(YangoPayWalletDto.class)), new f9("yango_pay_simple_integration", YangoPaySimpleIntegrationDto.Companion.serializer(), qoi0.a(YangoPaySimpleIntegrationDto.class)));
    }
}
