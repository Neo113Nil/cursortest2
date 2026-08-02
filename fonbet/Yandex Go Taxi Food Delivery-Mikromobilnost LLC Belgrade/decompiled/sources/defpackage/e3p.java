package defpackage;

import android.os.SystemClock;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.order.external.tracking.c;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class e3p implements hdn {
    public final c a;
    public final String b;
    public final h1p c;
    public final long d;
    public final /* synthetic */ f3p e;

    public e3p(f3p f3pVar, c cVar, String str, h1p h1pVar) {
        this.e = f3pVar;
        this.a = cVar;
        this.b = str;
        this.c = h1pVar;
        f3pVar.b.getClass();
        this.d = SystemClock.uptimeMillis();
    }

    @Override // defpackage.hdn
    public final void a(List list, boolean z, boolean z2) {
        Object obj;
        f3p f3pVar = this.e;
        r8h r8hVar = f3pVar.b;
        v8w0 v8w0Var = f3pVar.a;
        r8hVar.getClass();
        long round = Math.round((SystemClock.uptimeMillis() - this.d) / 100.0d) * 100;
        boolean isEmpty = list.isEmpty();
        h1p h1pVar = this.c;
        String str = this.b;
        if (isEmpty) {
            String value = h1pVar.getValue();
            Long valueOf = Long.valueOf(round);
            v8w0Var.getClass();
            HashMap hashMap = new HashMap();
            if (value != null) {
                hashMap.put(Constants.KEY_SERVICE, value);
            }
            if (str != null) {
                hashMap.put(FinishFlowStatus.ORDER_ID_FIELD_NAME, str);
            }
            hashMap.put("response_delay", valueOf);
            v8w0Var.a.a("Superapp.OrdersTracking.NoOrdersInResponse", hashMap, 1, new HashMap());
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((ren) obj).a, str)) {
                        break;
                    }
                }
            }
            if (obj == null) {
                String value2 = h1pVar.getValue();
                Long valueOf2 = Long.valueOf(round);
                v8w0Var.getClass();
                HashMap hashMap2 = new HashMap();
                if (value2 != null) {
                    hashMap2.put(Constants.KEY_SERVICE, value2);
                }
                if (str != null) {
                    hashMap2.put(FinishFlowStatus.ORDER_ID_FIELD_NAME, str);
                }
                hashMap2.put("response_delay", valueOf2);
                v8w0Var.a.a("Superapp.OrdersTracking.NoOrderFoundInResponse", hashMap2, 1, new HashMap());
            }
        }
        c cVar = this.a;
        c.c();
        LinkedHashSet linkedHashSet = cVar.c;
        linkedHashSet.remove(this);
        if (linkedHashSet.isEmpty()) {
            cVar.b.b();
        }
    }
}
