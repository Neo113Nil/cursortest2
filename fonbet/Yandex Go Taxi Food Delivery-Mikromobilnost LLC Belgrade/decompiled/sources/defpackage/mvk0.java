package defpackage;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import com.yandex.go.taxi.order.robotaxi.domain.c;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$CloseReason;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final class mvk0 extends ad5 {
    public final usc A;
    public final wsc B;
    public final c C;
    public final pwy0 D;
    public final qvk0 x;
    public final sue0 y;
    public final o2y0 z;

    public mvk0(qvk0 qvk0Var, sue0 sue0Var, o2y0 o2y0Var, usc uscVar, wsc wscVar, c cVar, pwy0 pwy0Var) {
        super(rvk0.class);
        this.x = qvk0Var;
        this.y = sue0Var;
        this.z = o2y0Var;
        this.A = uscVar;
        this.B = wscVar;
        this.C = cVar;
        this.D = pwy0Var;
    }

    public final void Kg(fvk0 fvk0Var) {
        boolean z = fvk0Var instanceof dvk0;
        sue0 sue0Var = this.y;
        if (z) {
            ((mg21) ((lg21) ((h3y) ((sts) sue0Var.b).K).get())).a(((dvk0) fvk0Var).a);
            return;
        }
        boolean z2 = fvk0Var instanceof bvk0;
        o2y0 o2y0Var = this.z;
        c cVar = this.C;
        usc uscVar = this.A;
        wsc wscVar = this.B;
        if (z2) {
            bvk0 bvk0Var = (bvk0) fvk0Var;
            wscVar.a(uscVar, bvk0Var.c);
            wscVar.b(uscVar, CommunicationModalAnalyticsData$CloseReason.ACTION_BUTTON);
            String str = bvk0Var.a;
            String str2 = bvk0Var.b;
            cVar.a(TrackableAcceptanceActionParam.Status.ACCEPTED, o2y0Var.b().a, str, str2);
            ((sts) sue0Var.b).r(new qu(9));
            return;
        }
        if (!(fvk0Var instanceof cvk0)) {
            if (jl40.l(fvk0Var, evk0.a)) {
                return;
            }
            w511.b();
        } else {
            wscVar.a(uscVar, ((cvk0) fvk0Var).a);
            wscVar.b(uscVar, CommunicationModalAnalyticsData$CloseReason.ACTION_BUTTON);
            ((f) cVar.d.a).X(o2y0Var);
            ((sts) sue0Var.b).r(new qu(9));
        }
    }
}
