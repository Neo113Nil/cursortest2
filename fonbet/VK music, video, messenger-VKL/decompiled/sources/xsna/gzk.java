package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class gzk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> b;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> c;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> d;
    public final /* synthetic */ vxk e;
    public final /* synthetic */ nmo0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public gzk(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar2, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar3, vxk vxkVar, nmo0 nmo0Var) {
        this.b = wzsVar;
        this.c = wzsVar2;
        this.d = wzsVar3;
        this.e = vxkVar;
        this.f = nmo0Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1658370654, intValue, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1371)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, f);
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
            wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar = this.b;
            wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar2 = this.c;
            a.e eVar2 = (wzsVar == null || wzsVar2 == null) ? wzsVar != null ? androidx.compose.foundation.layout.a.a : androidx.compose.foundation.layout.a.b : androidx.compose.foundation.layout.a.g;
            q630 f2 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(eVar2, dt1.a.l, aVar2, 48);
            int m2 = n34.m(aVar2);
            sy90 D2 = aVar2.D();
            q630 c2 = qri.c(aVar2, f2);
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
            k9q0.w(aVar2, a2, cVar);
            k9q0.w(aVar2, D2, eVar);
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m2))) {
                kr.a(m2, aVar2, m2, bVar);
            }
            k9q0.w(aVar2, c2, dVar);
            if (wzsVar != null) {
                aVar2.K(-516028300);
                cjo0.a(this.f, kai.c(-738208900, new fzk(wzsVar), aVar2), aVar2, 48);
                aVar2.j();
            } else {
                aVar2.K(-515838022);
                aVar2.j();
            }
            if (wzsVar2 == null) {
                aVar2.K(-515799087);
            } else {
                aVar2.K(260455984);
                wzsVar2.invoke(aVar2, 0);
            }
            aVar2.j();
            aVar2.G();
            if (this.d == null && wzsVar == null && wzsVar2 == null) {
                aVar2.K(-250277930);
                aVar2.j();
            } else {
                aVar2.K(-250360576);
                csn.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.e.x, aVar2, 0);
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
