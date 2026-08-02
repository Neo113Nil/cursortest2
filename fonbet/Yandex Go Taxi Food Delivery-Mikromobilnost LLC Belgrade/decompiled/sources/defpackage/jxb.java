package defpackage;

import com.yandex.go.copter.city_tour.domain.CityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$flatMapLatest$1;
import com.yandex.go.copter.city_tour.domain.d;
import com.yandex.go.copter.city_tour.domain.f;
import com.yandex.go.copter.city_tour.domain.h;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class jxb implements ixb {
    public final pwb a;
    public final wiq0 b;
    public final roe c;

    public jxb(pwb pwbVar, wiq0 wiq0Var, roe roeVar) {
        this.a = pwbVar;
        this.b = wiq0Var;
        this.c = roeVar;
    }

    public final String a() {
        String str;
        CopterOrderFlowExperiment a = this.c.a();
        CopterOrderFlowExperiment.CityTourSettings cityTourSettings = a.f;
        String str2 = cityTourSettings != null ? cityTourSettings.a : null;
        if (a.b && str2 != null) {
            pex0 m = ((k) this.b).m();
            if (jl40.l(m != null ? m.b : null, str2)) {
                nwb nwbVar = (nwb) this.a.b.a.getValue();
                if (nwbVar != null && (str = nwbVar.c) != null) {
                    return str;
                }
                String str3 = a.f.c;
                if (str3 != null) {
                    return d6z.Y(a, str3);
                }
            }
        }
        return null;
    }

    public final h b() {
        return new h(e.X(e.s(this.c.a.a(), new qha(21)), new CityTourTariffDestinationOverrideInteractorImpl$cityTourTariffDestinationOverrideChangesFlow$$inlined$flatMapLatest$1(e.t(new d(this.a.b)), e.t(new f(((k) this.b).j.b())), null)));
    }
}
