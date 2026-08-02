package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment;

/* loaded from: classes2.dex */
public final class m0u0 {
    public final ftb a;
    public final sls b;

    public m0u0(ftb ftbVar, sls slsVar) {
        this.a = ftbVar;
        this.b = slsVar;
    }

    public final void a() {
        boolean booleanValue = ((Boolean) this.b.invoke()).booleanValue();
        ftb ftbVar = this.a;
        if (!booleanValue) {
            ftbVar.a();
        } else {
            ftbVar.getClass();
            ftbVar.c(new ClosingOfferFragment(), "ClosingOffer");
        }
    }
}
