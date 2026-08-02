package defpackage;

import com.yandex.go.scooters.ignition.domain.ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$1;
import com.yandex.go.scooters.ignition.domain.ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2;
import com.yandex.go.scooters.ignition.domain.f;
import com.yandex.go.scooters.ignition.domain.h;
import com.yandex.go.scooters.ignition.domain.j;
import com.yandex.go.scooters.ignition.domain.k;
import kotlinx.coroutines.flow.e;
import org.altbeacon.beacon.Region;

/* loaded from: classes8.dex */
public final class arn0 implements jy60 {
    public final tt2 a;
    public final tse b;
    public final h3y c;
    public final h3y d;
    public final brn0 e;
    public final h3y f;

    static {
        Region region = k.p;
    }

    public arn0(tt2 tt2Var, tse tseVar, h3y h3yVar, h3y h3yVar2, brn0 brn0Var, h3y h3yVar3) {
        this.a = tt2Var;
        this.b = tseVar;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = brn0Var;
        this.f = h3yVar3;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ScootersIgnitionExperimentListenerInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        brn0 brn0Var = this.e;
        tpr t = e.t(new h(brn0Var.a.a()));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$1 scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$1 = new ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$1(e.F(t, mdhVar), null, this);
        tse tseVar = this.b;
        tje.N(tseVar, null, null, scootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$1, 3);
        tje.N(tseVar, null, null, new ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$$inlined$collectIn$2(e.F(e.t(new j(new f(brn0Var.a.a()))), mdhVar), null, this), 3);
    }
}
