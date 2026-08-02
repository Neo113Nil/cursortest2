package defpackage;

import android.net.Uri;
import com.yandex.xplat.common.PollingStep;
import com.yandex.xplat.payment.sdk.BillingServiceError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.PaymentPollingResult;
import java.net.URI;

/* loaded from: classes2.dex */
public final class lsi0 implements qgb {
    public final ss5 a;
    public final ss5 b;
    public final j24 c;
    public final rwo w;
    public boolean x;
    public boolean y;
    public boolean z;

    public lsi0(ss5 ss5Var, ss5 ss5Var2, j24 j24Var, rwo rwoVar) {
        this.a = ss5Var;
        this.b = ss5Var2;
        this.c = j24Var;
        this.w = rwoVar;
    }

    @Override // defpackage.qgb
    public final lfr0 q(chb chbVar) {
        String str = chbVar.a;
        return str.equals("success") ? zmx.d(PaymentPollingResult.SUCCESS) : str.equals("wait_for_processing") ? zmx.d(PaymentPollingResult.WAIT_FOR_PROCESSING) : zmx.c(new BillingServiceError(ExternalErrorKind.internal_error, ExternalErrorTrigger.internal_sdk, null, str, oyr.p("Unable to convert status ", str, " to PollingResult")));
    }

    @Override // defpackage.qgb
    public final tyj0 z(chb chbVar) {
        anh anhVar;
        String str = chbVar.e;
        String str2 = chbVar.d;
        wx90 wx90Var = chbVar.g;
        String str3 = chbVar.a;
        int hashCode = str3.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != -369265581) {
                if (hashCode == 210861611 && str3.equals("wait_for_notification")) {
                    if (str != null) {
                        try {
                            if (!this.x) {
                                this.x = true;
                                try {
                                    anhVar = new anh(Uri.parse(new URI(str).toString()));
                                } catch (Throwable unused) {
                                    anhVar = null;
                                }
                                if (anhVar == null) {
                                    return coa1.h(c7b1.d(str, "redirectURL", chbVar));
                                }
                                this.a.invoke(anhVar);
                            }
                        } catch (RuntimeException e) {
                            return coa1.h(c7b1.b(chbVar, e));
                        }
                    }
                    if (!this.y && (jl40.l(str2, "success") || jl40.l(str2, "failed"))) {
                        this.y = true;
                        this.b.invoke(str2);
                    }
                    if (wx90Var != null && !this.z && (wx90Var.b.equals("amount_expected") || wx90Var.b.equals("sms_code_expected"))) {
                        this.z = true;
                        rwo rwoVar = this.w;
                        sv90 sv90Var = qv90.a;
                        String value = wx90Var.a.getValue();
                        String str4 = wx90Var.c;
                        String str5 = wx90Var.e;
                        sv90Var.getClass();
                        ((y22) rwoVar).a(sv90.a0(value, str4, str5));
                        this.c.invoke(wx90Var);
                    }
                    return coa1.i(PollingStep.retry);
                }
            } else if (str3.equals("wait_for_processing")) {
                return coa1.i(PollingStep.done);
            }
        } else if (str3.equals("success")) {
            return coa1.i(PollingStep.done);
        }
        return coa1.h(c7b1.f(chbVar));
    }
}
