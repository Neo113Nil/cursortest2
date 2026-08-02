package defpackage;

import com.yandex.go.taxi.order.promotions.modal_default.model.OrderDefaultModalModel$HeaderType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nr70 {
    public final OrderDefaultModalModel$HeaderType a;

    public nr70(int i) {
        this.a = OrderDefaultModalModel$HeaderType.DEFAULT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nr70) && this.a == ((nr70) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HeaderAppearance(type=" + this.a + Extension.C_BRAKE;
    }

    public nr70() {
        this(0);
    }
}
