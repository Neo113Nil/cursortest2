package defpackage;

import com.yandex.go.chargers.offer.experiments.ChargersMultiOfferExperiment;
import com.yandex.go.chargers.offer.experiments.ChargersOfferComposeExperiment;
import com.yandex.go.payments.shared.antifraud.experiments.CorpAntiFraudExperiment;
import com.yandex.go.settings.email.EmailRequireExperiment;
import com.yandex.go.shortcuts.impl.experiments.OrderNotificationsSettingsExperiment;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes14.dex */
public final class n3a implements qqo {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqo b;

    public n3a(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                ChargersOfferComposeExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).c(ChargersOfferComposeExperiment.c);
                break;
            case 2:
                this.b = ((jbh) rqoVar).c(CorpAntiFraudExperiment.f);
                break;
            case 3:
                ndi.Companion.getClass();
                this.b = ((jbh) rqoVar).c(ndi.d);
                break;
            case 4:
                ohi.Companion.getClass();
                this.b = ((jbh) rqoVar).c(ohi.e);
                break;
            case 5:
                lii.Companion.getClass();
                this.b = ((jbh) rqoVar).c(lii.i);
                break;
            case 6:
                awm.Companion.getClass();
                this.b = ((jbh) rqoVar).c(awm.e);
                break;
            case 7:
                this.b = ((jbh) rqoVar).c(EmailRequireExperiment.j);
                break;
            case 8:
                this.b = ((jbh) rqoVar).a(SimpleBooleanExperiment.HIDE_ENTRANCE_BUTTON);
                break;
            case 9:
                this.b = ((jbh) rqoVar).c(OrderNotificationsSettingsExperiment.f);
                break;
            case 10:
                this.b = ((jbh) rqoVar).c(viu.e);
                break;
            case 11:
                ykv0.Companion.getClass();
                this.b = ((jbh) rqoVar).c(ykv0.e);
                break;
            default:
                ChargersMultiOfferExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).c(ChargersMultiOfferExperiment.c);
                break;
        }
    }

    @Override // defpackage.qqo
    public final tpr a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        switch (this.a) {
            case 0:
                return (ChargersMultiOfferExperiment) this.b.b();
            case 1:
                return (ChargersOfferComposeExperiment) this.b.b();
            case 2:
                return (CorpAntiFraudExperiment) this.b.b();
            case 3:
                return (ndi) this.b.b();
            case 4:
                return (ohi) this.b.b();
            case 5:
                return d();
            case 6:
                return (awm) this.b.b();
            case 7:
                return (EmailRequireExperiment) this.b.b();
            case 8:
                return (Boolean) this.b.b();
            case 9:
                return (OrderNotificationsSettingsExperiment) this.b.b();
            case 10:
                return (viu) this.b.b();
            default:
                return (ykv0) this.b.b();
        }
    }

    public lii d() {
        return (lii) this.b.b();
    }
}
