package com.yandex.go.scooters.passes.v2;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScooterPassesTappedButtonName;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesTappedFromScreen;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesTappedType;
import defpackage.afo0;
import defpackage.b3b1;
import defpackage.bfo0;
import defpackage.c7o0;
import defpackage.f7o0;
import defpackage.n7o0;
import defpackage.qxm0;
import defpackage.tls;
import defpackage.vj90;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersPackagesModalView$adapter$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        f7o0 f7o0Var = (f7o0) obj;
        n7o0 n7o0Var = (n7o0) this.receiver;
        if (f7o0Var instanceof c7o0) {
            qxm0 qxm0Var = n7o0Var.x;
            if (n7o0Var.G == null) {
                w511.b();
                return null;
            }
            ScootersAnalytics$ScootersPassesTappedType scootersAnalytics$ScootersPassesTappedType = ScootersAnalytics$ScootersPassesTappedType.Packages;
            ScootersAnalytics$ScootersPassesTappedFromScreen d = b3b1.d(n7o0Var.H);
            String str = n7o0Var.F;
            ScootersAnalytics$ScooterPassesTappedButtonName scootersAnalytics$ScooterPassesTappedButtonName = ScootersAnalytics$ScooterPassesTappedButtonName.Pass;
            vj90 vj90Var = ((c7o0) f7o0Var).a;
            qxm0Var.f(scootersAnalytics$ScootersPassesTappedType, d, scootersAnalytics$ScooterPassesTappedButtonName, vj90Var.a, str);
            com.yandex.go.scooters.passes.v2.domain.a aVar = n7o0Var.z;
            if (!(((bfo0) ((com.yandex.go.scooters.passes.data.b) aVar.d).b.getValue()) instanceof afo0)) {
                aVar.c.Fg(vj90Var);
            }
        } else {
            n7o0Var.getClass();
        }
        return zy11.a;
    }
}
