package defpackage;

import com.yandex.go.payments.data.model.PaymentMethodsBankIcons;
import java.util.HashMap;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class dyz {
    public final eex a;
    public final HashMap b = new HashMap();

    public dyz(eex eexVar) {
        this.a = eexVar;
    }

    public final yww0 a(String str) {
        HashMap hashMap = this.b;
        Object obj = hashMap.get(str);
        if (obj == null) {
            am2 am2Var = new am2("list-payment-methods", str, b.f());
            auu0 auu0Var = auu0.a;
            KSerializer serializer = PaymentMethodsBankIcons.Companion.serializer();
            eex eexVar = this.a;
            eexVar.getClass();
            obj = eexVar.c(am2Var, new k8u(auu0Var, serializer, 1));
            hashMap.put(str, obj);
        }
        return (yww0) obj;
    }
}
