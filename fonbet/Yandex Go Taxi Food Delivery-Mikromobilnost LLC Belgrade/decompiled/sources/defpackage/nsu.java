package defpackage;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.api.config.PlusHomeBundle;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$PaymentType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.plus.purchase.PlusPurchaseView;

/* loaded from: classes2.dex */
public final class nsu {
    public final PlusHomeBundle a;
    public final tpp0 b;
    public final tls c;
    public final sls d;
    public final sls e;
    public final sls f;
    public final uio g;
    public final PlusPaymentStat$Source h;
    public final qio i;
    public boolean j;

    public nsu(PlusHomeBundle plusHomeBundle, tpp0 tpp0Var, tls tlsVar, sls slsVar, sls slsVar2, String str, sls slsVar3, uio uioVar, PlusPaymentStat$Source plusPaymentStat$Source, qio qioVar, boolean z) {
        this.a = plusHomeBundle;
        this.b = tpp0Var;
        this.c = tlsVar;
        this.d = slsVar;
        this.e = slsVar2;
        this.f = slsVar3;
        this.g = uioVar;
        this.h = plusPaymentStat$Source;
        this.i = qioVar;
    }

    public final void a() {
        PlusHomeBundle plusHomeBundle = this.a;
        Boolean hostPayResult = plusHomeBundle.getHostPayResult();
        if (hostPayResult != null) {
            boolean booleanValue = hostPayResult.booleanValue();
            PlusLogTag plusLogTag = PlusLogTag.UI;
            skd0.e(plusLogTag, "Try to send host buy result: " + booleanValue);
            if (!this.j) {
                skd0.h(plusLogTag, "Not send buy result, webview not ready", null);
                return;
            }
            this.c.invoke(new inv(plusHomeBundle.getActiveTrackId(), PurchaseTypeDto.HOST, booleanValue ? PurchaseStatusTypeDto.SUCCESS : PurchaseStatusTypeDto.FAILURE, null));
            EmptyList emptyList = EmptyList.a;
            uio uioVar = this.g;
            if (booleanValue) {
                uioVar.d(this.h, PlusPaymentStat$PurchaseType.HOST, PlusPaymentStat$ButtonType.HOST, null, emptyList);
            } else {
                uioVar.c(this.h, PlusPaymentStat$PurchaseType.HOST, PlusPaymentStat$ButtonType.HOST, null, emptyList);
            }
            plusHomeBundle.n(null);
            skd0.e(plusLogTag, "Sent host buy result: " + booleanValue + " trackId=" + plusHomeBundle.getActiveTrackId());
        }
    }

    public final PlusPurchaseView b() {
        skd0.b(PlusLogTag.JS, "provideHostBuyView() bundle=" + this.a);
        tpp0 tpp0Var = this.b;
        PlusPurchaseView a = tpp0Var != null ? ((ujd0) tpp0Var.a.a.a.j.getValue()).a(tpp0Var.b, tpp0Var.c, tpp0Var.d, tpp0Var.e, new pgk0(15, this), tpp0Var.f) : null;
        if (a == null) {
            this.i.b(PlusPayButtonDiagnostic$ButtonType.NATIVE_HOST, PlusPayButtonDiagnostic$PaymentType.HOST, "Host has not provided view");
        }
        return a;
    }
}
