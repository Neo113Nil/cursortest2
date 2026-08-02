package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DatePickerDialog.android.kt */
/* loaded from: classes11.dex */
public final class iyk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ jai b;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> c;
    public final /* synthetic */ jai d;

    public iyk(jai jaiVar, wzs wzsVar, jai jaiVar2) {
        this.b = jaiVar;
        this.c = wzsVar;
        this.d = jaiVar2;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1782015378, intValue, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:88)");
            }
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(hVar, dt1.a.n, aVar2, 6);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(aVar2, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar4);
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
            r9g r9gVar = r9g.a;
            r9gVar.getClass();
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            aVar3.g(xpyVar);
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int m2 = n34.m(aVar2);
            sy90 D2 = aVar2.D();
            q630 c2 = qri.c(aVar2, xpyVar);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar4);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d, cVar);
            k9q0.w(aVar2, D2, eVar);
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m2))) {
                kr.a(m2, aVar2, m2, bVar);
            }
            k9q0.w(aVar2, c2, dVar);
            this.b.invoke(r9gVar, aVar2, 6);
            aVar2.G();
            q630 C = s200.C(r9gVar.b(aVar3, dt1.a.p), kyk.a);
            cp10 d2 = ja8.d(ty6Var, false);
            int m3 = n34.m(aVar2);
            sy90 D3 = aVar2.D();
            q630 c3 = qri.c(aVar2, C);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar4);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d2, cVar);
            k9q0.w(aVar2, D3, eVar);
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m3))) {
                kr.a(m3, aVar2, m3, bVar);
            }
            k9q0.w(aVar2, c3, dVar);
            po40.d(u7g.c(zlm.a, aVar2), evp0.a(zlm.b, aVar2), kai.c(-1103927529, new hyk(this.c, this.d), aVar2), aVar2, 384);
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
