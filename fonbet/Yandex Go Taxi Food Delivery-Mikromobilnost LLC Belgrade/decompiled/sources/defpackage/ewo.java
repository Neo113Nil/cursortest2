package defpackage;

import ru.yandex.taxi.logistics.sdk.delivery.edit.DeliveryEditApi;
import ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data.ExtendExpirationDateApi;

/* loaded from: classes5.dex */
public final class ewo implements v7p {
    public final /* synthetic */ int a;
    public final qzf b;

    public /* synthetic */ ewo(qzf qzfVar, int i) {
        this.a = i;
        this.b = qzfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        qzf qzfVar = this.b;
        switch (i) {
            case 0:
                return (DeliveryEditApi) ((t0k0) qzfVar.get()).b(DeliveryEditApi.class);
            default:
                return (ExtendExpirationDateApi) ((t0k0) qzfVar.get()).b(ExtendExpirationDateApi.class);
        }
    }
}
