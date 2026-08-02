package defpackage;

import com.yandex.payment.divkit.cvv_confirm.b;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class jof implements ryj0 {
    public final /* synthetic */ b a;

    public jof(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        Pair pair = iof.a[((PaymentKitError) obj).getKind().ordinal()] == 1 ? new Pair(Integer.valueOf(tyh0.paymentsdk_something_wrong_with_internet_error_title), Integer.valueOf(tyh0.paymentsdk_try_now_or_later)) : new Pair(Integer.valueOf(tyh0.paymentsdk_something_went_wrong), Integer.valueOf(tyh0.paymentsdk_try_now_or_later));
        this.a.z.l(new eof(((Number) pair.getFirst()).intValue(), Integer.valueOf(((Number) pair.getSecond()).intValue())));
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        sm0 sm0Var = (sm0) obj;
        boolean z = sm0Var instanceof nm0;
        b bVar = this.a;
        if (z) {
            zry0 zry0Var = bVar.G;
            if (zry0Var == null) {
                zry0Var = null;
            }
            bVar.z.l(new gof(zry0Var.a));
            return;
        }
        if (sm0Var instanceof pm0) {
            pm0 pm0Var = (pm0) sm0Var;
            bVar.D.l(new g4p(pm0Var.a, pm0Var.b));
            return;
        }
        if (sm0Var instanceof lm0) {
            bVar.D.l(e4p.a);
            return;
        }
        if (sm0Var instanceof rm0) {
            ny61.r("Sbp has its own fragment");
        } else {
            if ((sm0Var instanceof mm0) || (sm0Var instanceof qm0) || (sm0Var instanceof om0)) {
                return;
            }
            w511.b();
        }
    }
}
