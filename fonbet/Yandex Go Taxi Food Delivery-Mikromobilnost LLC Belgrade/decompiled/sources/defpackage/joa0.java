package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ru.yandex.taxi.plus.purchase.a;
import ru.yandex.taxi.plus.sdk.payments.PaymentsWidgetModalView;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$ErrorPaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$OpenUrlPaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$PurchaseSuccessPaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$StatePaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.d;
import ru.yandex.taxi.plus.sdk.payments.web.m;
import ru.yandex.taxi.plus.sdk.payments.web.n;
import ru.yandex.taxi.plus.sdk.payments.web.o;

/* loaded from: classes6.dex */
public final class joa0 {
    public final /* synthetic */ PaymentsWidgetModalView a;

    public joa0(PaymentsWidgetModalView paymentsWidgetModalView) {
        this.a = paymentsWidgetModalView;
    }

    public final void a(o oVar) {
        ooa0 ooa0Var;
        Object obj;
        ooa0Var = this.a.presenter;
        a aVar = ooa0Var.g;
        hst hstVar = jst.e;
        Objects.toString(oVar);
        hstVar.getClass();
        if (oVar instanceof PaymentEvent$StatePaymentEvent) {
            if (((PaymentEvent$StatePaymentEvent) oVar).a == PaymentEvent$StatePaymentEvent.Status.CLOSE) {
                ((loa0) ooa0Var.a).close();
                return;
            }
            return;
        }
        if (oVar instanceof PaymentEvent$ErrorPaymentEvent) {
            PaymentEvent$ErrorPaymentEvent paymentEvent$ErrorPaymentEvent = (PaymentEvent$ErrorPaymentEvent) oVar;
            hstVar.n("onErrorPaymentEvent " + paymentEvent$ErrorPaymentEvent);
            int i = noa0.a[paymentEvent$ErrorPaymentEvent.b.ordinal()];
            if (i == 1) {
                rid0 rid0Var = aVar.a.D;
                if (rid0Var != null) {
                    rid0Var.m();
                }
                ((loa0) ooa0Var.a).close();
                return;
            }
            if (i == 2) {
                ((loa0) ooa0Var.a).openUrl(ooa0Var.d);
                return;
            }
            hstVar.k(new IllegalStateException(), "Unknown action in errorPaymentEvent " + paymentEvent$ErrorPaymentEvent);
            return;
        }
        if (oVar instanceof d) {
            ((loa0) ooa0Var.a).close();
            return;
        }
        if (!(oVar instanceof PaymentEvent$OpenUrlPaymentEvent)) {
            if (oVar instanceof m) {
                aVar.a();
                ((loa0) ooa0Var.a).close();
                return;
            } else if (oVar instanceof PaymentEvent$PurchaseSuccessPaymentEvent) {
                aVar.a();
                ((loa0) ooa0Var.a).close();
                return;
            } else {
                if (oVar instanceof n) {
                    return;
                }
                w511.b();
                return;
            }
        }
        PaymentEvent$OpenUrlPaymentEvent paymentEvent$OpenUrlPaymentEvent = (PaymentEvent$OpenUrlPaymentEvent) oVar;
        List A = j73.A(new PaymentEvent$OpenUrlPaymentEvent.UriInfo[]{paymentEvent$OpenUrlPaymentEvent.a, paymentEvent$OpenUrlPaymentEvent.b});
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : A) {
            if (((PaymentEvent$OpenUrlPaymentEvent.UriInfo) obj2).a != null) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            PaymentEvent$OpenUrlPaymentEvent.UriInfo uriInfo = (PaymentEvent$OpenUrlPaymentEvent.UriInfo) obj;
            abe abeVar = ooa0Var.f;
            String str = uriInfo.a;
            boolean z = uriInfo.c == PaymentEvent$OpenUrlPaymentEvent.UriInfo.Type.APP;
            Context context = abeVar.a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            if (z) {
                intent.setPackage(context.getPackageName());
            }
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                break;
            }
        }
        PaymentEvent$OpenUrlPaymentEvent.UriInfo uriInfo2 = (PaymentEvent$OpenUrlPaymentEvent.UriInfo) obj;
        if (uriInfo2 != null) {
            PaymentEvent$OpenUrlPaymentEvent.UriInfo.Type type = uriInfo2.c;
            if (type != PaymentEvent$OpenUrlPaymentEvent.UriInfo.Type.UNKNOWN) {
                ((oqd0) ((zxa) ooa0Var.e.b).J).b(uriInfo2.a, uriInfo2.b, type == PaymentEvent$OpenUrlPaymentEvent.UriInfo.Type.APP);
                return;
            }
            jst.e.k(new IllegalStateException(), "Unsupported url open type in " + paymentEvent$OpenUrlPaymentEvent);
        }
    }
}
