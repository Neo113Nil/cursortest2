package defpackage;

import android.content.Context;
import com.yandex.go.payments.shared.antifraud.ui.CorpAntiFraudModalView;
import com.yandex.go.payments.shared.antifraud.ui.a;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;

/* loaded from: classes13.dex */
public final class pue extends m230 {
    public final w030 E;
    public final kue F;
    public final oue G;

    public pue(w030 w030Var, kue kueVar, oue oueVar) {
        super(null);
        this.E = w030Var;
        this.F = kueVar;
        this.G = oueVar;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        SharedPaymentsOpenReason sharedPaymentsOpenReason = ((mue) obj).a;
        gyc gycVar = new gyc(this);
        nfh nfhVar = this.G.a;
        return new CorpAntiFraudModalView((Context) this.F.a.a.get(), new nue((yfa) ((kyd) nfhVar.a).get(), (a) ((m19) nfhVar.b).get(), (iue) ((xvf0) nfhVar.c).get(), sharedPaymentsOpenReason, gycVar));
    }
}
