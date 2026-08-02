package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hys implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hys(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                jys jysVar = (jys) this.c;
                jai jaiVar = (jai) this.d;
                q630 q630Var = (q630) obj;
                oys oysVar = (oys) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(q630Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(oysVar) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1858535103, i, -1, "com.vk.core.tool.compose.onboarding.fullscreen.FullscreenOnboardingScopeImpl.items.<anonymous>.<anonymous> (FullscreenOnboardingScope.kt:45)");
                    }
                    mc90 b = jysVar.b();
                    boolean J = aVar.J(jysVar) | ((i & 112) == 32);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new iys(oysVar, jysVar, null);
                        aVar.R(x);
                    }
                    bap.g(b, (wzs) x, aVar, 0);
                    jaiVar.invoke(oysVar, this.e, q630Var, aVar, Integer.valueOf(((i >> 3) & 14) | ((i << 6) & 896)));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                izs izsVar = (izs) this.c;
                dz40.c cVar = (dz40.c) this.d;
                oiy oiyVar = (oiy) this.e;
                gfp0.b bVar = (gfp0.b) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-447821389, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.music.KidsMusicActionsPanel.<anonymous> (KidsMusicActionsPanel.kt:81)");
                }
                boolean z = bVar instanceof gfp0.b.c;
                q630.a aVar3 = q630.a.a;
                if (z) {
                    aVar2.K(-878496667);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
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
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    siy.c((gfp0.b.c) bVar, cVar, izsVar, oiyVar, null, aVar2, 0);
                    aVar2.G();
                    aVar2.j();
                } else if (bVar instanceof gfp0.b.a) {
                    aVar2.K(-859610590);
                    siy.a((gfp0.b.a) bVar, izsVar, txj0.f(aVar3, 1.0f), aVar2, 384);
                    aVar2.j();
                } else {
                    if (!(bVar instanceof gfp0.b.C2940b)) {
                        throw alb0.c(-859623990, aVar2);
                    }
                    aVar2.K(-877914611);
                    aVar2.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
        }
    }
}
