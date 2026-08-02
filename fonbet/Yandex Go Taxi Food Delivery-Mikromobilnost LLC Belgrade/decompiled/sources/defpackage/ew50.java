package defpackage;

import com.yandex.go.taxi.order.recalculation.model.request.NewRoutePriceParam;
import com.yandex.go.taxi.order.recalculation.model.request.b;
import com.yandex.go.trusted_contacts.data.entities.network.NewTrustedContactDto;
import com.yandex.go.trusted_contacts.data.entities.network.f;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.NotificationDto$Position;
import ru.yandex.taxi.order.NotificationBroadcastReceiver;

/* loaded from: classes2.dex */
public final /* synthetic */ class ew50 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ew50(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        hs31 hs31Var;
        a3y0 logger_delegate$lambda$0;
        switch (this.a) {
            case 12:
                auu0 auu0Var = auu0.a;
                break;
            case 13:
                auu0 auu0Var2 = auu0.a;
                break;
            case 14:
                auu0 auu0Var3 = auu0.a;
                break;
            case 21:
                b bVar = NewRoutePriceParam.Companion;
                break;
            case 22:
                f fVar = NewTrustedContactDto.Companion;
                break;
            case 24:
                hs31Var = p960.w;
                break;
            case 26:
                rd60 rd60Var = td60.Companion;
                break;
            case 27:
                logger_delegate$lambda$0 = NotificationBroadcastReceiver.logger_delegate$lambda$0();
                break;
        }
        return new o4o("com.yandex.plus.home.plaque.repository.graphql.cache.dto.NotificationDto.Position", (Enum[]) NotificationDto$Position.values());
    }
}
