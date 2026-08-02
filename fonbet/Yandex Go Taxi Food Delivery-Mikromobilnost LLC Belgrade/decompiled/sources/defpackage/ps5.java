package defpackage;

import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.PaymentPollingResult;
import java.util.LinkedHashMap;
import java.util.List;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class ps5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bt5 b;

    public /* synthetic */ ps5(bt5 bt5Var, int i) {
        this.a = i;
        this.b = bt5Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        bt5 bt5Var = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                return new rka0((String) list.get(0), (String) list.get(1), bt5Var.m);
            case 1:
                YSError ySError = (YSError) obj;
                LinkedHashMap linkedHashMap = zdz.a;
                ogb1.b("Check status polling failed: " + ySError.getMessage());
                rwo rwoVar = bt5Var.g;
                sv90 sv90Var = qv90.a;
                String message = ySError.getMessage();
                sv90Var.getClass();
                ((y22) rwoVar).a(sv90.E(message));
                return zmx.c(ySError);
            case 2:
                PaymentPollingResult paymentPollingResult = (PaymentPollingResult) obj;
                ((y22) bt5Var.g).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Оплата успешно завершилась", "success_payment"));
                return paymentPollingResult;
            case 3:
                YSError ySError2 = (YSError) obj;
                LinkedHashMap linkedHashMap2 = zdz.a;
                ogb1.b("Check status polling failed: " + ySError2.getMessage());
                rwo rwoVar2 = bt5Var.g;
                sv90 sv90Var2 = qv90.a;
                String message2 = ySError2.getMessage();
                sv90Var2.getClass();
                ((y22) rwoVar2).a(sv90.E(message2));
                return zmx.c(ySError2);
            default:
                PaymentPollingResult paymentPollingResult2 = (PaymentPollingResult) obj;
                ((y22) bt5Var.g).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Оплата успешно завершилась", "success_payment"));
                return paymentPollingResult2;
        }
    }
}
