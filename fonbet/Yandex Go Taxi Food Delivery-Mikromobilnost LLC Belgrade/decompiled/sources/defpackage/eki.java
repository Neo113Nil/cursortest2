package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class eki {
    public final ArrayList a;

    public eki(vsi vsiVar) {
        this.a = vsiVar.d;
    }

    public final b6i a(DeliveryFormStepType deliveryFormStepType) {
        Object obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((b6i) obj).b == deliveryFormStepType) {
                break;
            }
        }
        return (b6i) obj;
    }
}
