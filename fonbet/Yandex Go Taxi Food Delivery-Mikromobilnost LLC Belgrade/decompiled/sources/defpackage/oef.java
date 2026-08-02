package defpackage;

import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.details.settings.limits.currencysettings.b;

/* loaded from: classes13.dex */
public final class oef implements def {
    public final /* synthetic */ b a;

    public oef(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.def
    public final void L7(bef befVar) {
        mef mefVar = this.a.c;
        mefVar.getClass();
        if (befVar.c) {
            return;
        }
        for (bef befVar2 : mefVar.E.b) {
            befVar2.c = jl40.l(befVar.b, befVar2.b);
        }
        mefVar.E.c = true;
        ((jef) mefVar.Dg()).Gb(mefVar.E);
        mefVar.A.u(SharedPaymentAnalytics$Button.CURRENCY_SELECTED);
    }
}
