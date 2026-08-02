package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AlertDialog.kt */
/* loaded from: classes11.dex */
public final class yr1 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ jai e;

    public yr1(wzs wzsVar, long j, long j2, long j3, long j4, jai jaiVar) {
        this.b = wzsVar;
        this.c = j3;
        this.d = j4;
        this.e = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-652798794, intValue, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:315)");
            }
            q630 C = s200.C(q630.a.a, es1.e);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, C);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(aVar2, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(aVar2, D, eVar);
            cri.a.b bVar = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar);
            }
            cri.a.d dVar = cri.a.d;
            k9q0.w(aVar2, c, dVar);
            aVar2.K(346092326);
            aVar2.j();
            aVar2.K(346396529);
            aVar2.j();
            wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar = this.b;
            if (wzsVar == null) {
                aVar2.K(347174009);
            } else {
                aVar2.K(347174010);
                po40.d(this.c, evp0.a(zlm.g, aVar2), kai.c(705583346, new xr1(wzsVar), aVar2), aVar2, 384);
            }
            aVar2.j();
            gcv gcvVar = new gcv(dt1.a.p);
            cp10 d = ja8.d(dt1.a.b, false);
            int m2 = n34.m(aVar2);
            sy90 D2 = aVar2.D();
            q630 c2 = qri.c(aVar2, gcvVar);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d, cVar);
            k9q0.w(aVar2, D2, eVar);
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m2))) {
                kr.a(m2, aVar2, m2, bVar);
            }
            k9q0.w(aVar2, c2, dVar);
            po40.d(this.d, evp0.a(zlm.b, aVar2), this.e, aVar2, 0);
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
