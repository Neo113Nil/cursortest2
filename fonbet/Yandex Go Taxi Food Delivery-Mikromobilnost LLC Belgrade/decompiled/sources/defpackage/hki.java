package defpackage;

import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public abstract class hki {
    public abstract DeliveryFormStepType a();

    public final int b() {
        if (this instanceof gki) {
            return 0;
        }
        if (this instanceof fki) {
            return ((fki) this).a + 1;
        }
        w511.b();
        return 0;
    }
}
