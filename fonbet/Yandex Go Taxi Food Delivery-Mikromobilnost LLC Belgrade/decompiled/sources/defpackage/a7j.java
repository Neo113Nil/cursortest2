package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$RoutePointElement;
import java.util.Comparator;

/* loaded from: classes14.dex */
public final class a7j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uvc.b(((OrderDetailsCardResponse$CardElement$RoutePointElement) obj).a, ((OrderDetailsCardResponse$CardElement$RoutePointElement) obj2).a);
    }
}
