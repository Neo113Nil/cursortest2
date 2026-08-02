package defpackage;

import com.yandex.go.taxi.order.cache.api.data.model.OrderType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class c5y0 implements d5y0 {
    public final String a;
    public final OrderType b;

    public c5y0(String str, OrderType orderType) {
        this.a = str;
        this.b = orderType;
    }

    @Override // defpackage.d5y0
    public final String a() {
        return "open linked order";
    }

    public final String toString() {
        return "LinkedOrder(reason=open linked order, orderType=" + this.b + Extension.C_BRAKE;
    }
}
