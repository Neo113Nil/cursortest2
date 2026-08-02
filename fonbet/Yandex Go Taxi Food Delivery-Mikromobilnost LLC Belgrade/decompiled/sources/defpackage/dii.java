package defpackage;

import com.yandex.go.delivery.tracking.shortcuts.DeliveryShortcutsRequest;
import com.yandex.go.delivery.tracking.shortcuts.DeliveryShortcutsResponse;
import com.yandex.go.delivery.tracking.shortcuts.b;
import com.yandex.go.delivery.tracking.shortcuts.d;
import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import com.yandex.go.payments.data.model.response.g0;
import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$DetailedPrice;
import com.yandex.go.taxi.order.detailed_price.data.api.response.c;
import com.yandex.go.zone.dto.objects.DeliveryPin;
import com.yandex.go.zone.dto.objects.DeliveryRentalDetails;
import com.yandex.go.zone.dto.objects.o1;
import com.yandex.go.zone.dto.objects.u1;
import ru.yandex.taxi.surge.models.dto.DetailedPriceContent;

/* loaded from: classes6.dex */
public final /* synthetic */ class dii implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ dii(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                g0 g0Var = DeliveryPaymentMethod.Display.Companion;
                break;
            case 2:
                o1 o1Var = DeliveryPin.Companion;
                break;
            case 6:
                u1 u1Var = DeliveryRentalDetails.Companion;
                break;
            case 7:
                u1 u1Var2 = DeliveryRentalDetails.Companion;
                break;
            case 8:
                pni pniVar = sni.Companion;
                auu0 auu0Var = auu0.a;
                break;
            case 9:
                pni pniVar2 = sni.Companion;
                break;
            case 10:
                b bVar = DeliveryShortcutsRequest.Companion;
                break;
            case 11:
                d dVar = DeliveryShortcutsResponse.Companion;
                break;
            case 12:
                d dVar2 = DeliveryShortcutsResponse.Companion;
                break;
            case 13:
                el51 el51Var = qti.a;
                break;
            case 14:
                s2j s2jVar = DetailedPriceContent.Companion;
                break;
            case 15:
                ru.yandex.taxi.surge.models.dto.b bVar2 = DetailedPriceContent.DetailedPriceItem.Companion;
                break;
            case 17:
                com.yandex.go.taxi.order.detailed_price.data.api.response.b bVar3 = DetailedPriceItem$DetailedPrice.DetailedPriceContent.Companion;
                break;
            case 18:
                c cVar = DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.Companion;
                break;
            case 23:
                jaj jajVar = kaj.Companion;
                auu0 auu0Var2 = auu0.a;
                break;
            case 24:
                jaj jajVar2 = kaj.Companion;
                break;
            case 25:
                jaj jajVar3 = kaj.Companion;
                break;
        }
        return new p53(auu0.a, 0);
    }
}
