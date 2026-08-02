package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class gci {
    public final wiq0 a;
    public final lx4 b;

    public gci(wiq0 wiq0Var, lx4 lx4Var) {
        this.a = wiq0Var;
        this.b = lx4Var;
    }

    public final void a(String str, DeliveryFormStepType deliveryFormStepType, tls tlsVar) {
        String str2;
        w3j0 w3j0Var = (w3j0) tlsVar.invoke(((j) this.b).d(str));
        int i = iwh.a[deliveryFormStepType.ordinal()];
        if (i == 1) {
            str2 = "source";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str2 = "destination";
        }
        w3j0Var.a.put("open_reason", str2);
        pex0 m = ((k) this.a).m();
        w3j0Var.a.put(ClidProvider.STATE, m != null ? m.b : null);
        w3j0Var.m();
    }
}
