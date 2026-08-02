package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;

/* loaded from: classes5.dex */
public final class ivi {
    public static final ivi d = new ivi(-1, DeliveryPointFocusHolder$FocusTarget.None, false);
    public final int a;
    public final DeliveryPointFocusHolder$FocusTarget b;
    public final boolean c;

    public ivi(int i, DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget, boolean z) {
        this.a = i;
        this.b = deliveryPointFocusHolder$FocusTarget;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivi)) {
            return false;
        }
        ivi iviVar = (ivi) obj;
        return this.a == iviVar.a && this.b == iviVar.b && this.c == iviVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FocusState(position=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", focused=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
