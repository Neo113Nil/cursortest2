package com.yandex.go.scooters.insurance;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.domain.r;
import defpackage.ad5;
import defpackage.ltn0;
import defpackage.mtn0;
import defpackage.n3o0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;

/* loaded from: classes13.dex */
public final class e extends ad5 {
    public final ltn0 A;
    public final tls B;
    public final n3o0 C;
    public final wls D;
    public final r x;
    public final com.yandex.go.scooters.insurance.data.b y;
    public final com.yandex.go.scooters.insurance.data.c z;

    public e(r rVar, com.yandex.go.scooters.insurance.data.b bVar, com.yandex.go.scooters.insurance.data.c cVar, ltn0 ltn0Var, tls tlsVar, n3o0 n3o0Var, wls wlsVar) {
        super(mtn0.class);
        this.x = rVar;
        this.y = bVar;
        this.z = cVar;
        this.A = ltn0Var;
        this.B = tlsVar;
        this.C = n3o0Var;
        this.D = wlsVar;
    }

    public final void Kg(ScootersInsuranceType scootersInsuranceType, sls slsVar) {
        tje.N(Jg(), null, null, new ScootersInsurancePresenter$changeInsuranceType$2(this, scootersInsuranceType, slsVar, null), 3);
    }
}
