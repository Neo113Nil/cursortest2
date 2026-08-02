package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.delivery.AddressDeliveryInfo;

/* loaded from: classes14.dex */
public final class dni {
    public static pt70 a(AddressDeliveryInfo addressDeliveryInfo, boolean z) {
        String str = z ? addressDeliveryInfo.e : null;
        String str2 = z ? addressDeliveryInfo.c : null;
        String str3 = z ? addressDeliveryInfo.f : null;
        String str4 = addressDeliveryInfo.a.b;
        String str5 = addressDeliveryInfo.b;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str2 == null ? "" : str2;
        String str7 = addressDeliveryInfo.d;
        return new pt70(str4, str5, str6, str7 == null ? "" : str7, str == null ? "" : str, str3 == null ? "" : str3);
    }
}
