package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.udt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hjl implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hjl(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                wjo0 wjo0Var = (wjo0) this.d;
                njl njlVar = (njl) this.e;
                wh50 wh50Var = njlVar.d;
                nmo0 nmo0Var = (nmo0) this.f;
                va8 va8Var = (va8) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(va8Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(154813639, intValue, -1, "com.vk.profile.design.compose.header.header.DefaultNameSlotImpl.Content.<anonymous> (DefaultNameSlotImpl.kt:78)");
                    }
                    q630.a aVar2 = q630.a.a;
                    if (str == null) {
                        aVar.K(-741701304);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                        int hashCode = Long.hashCode(n34.n(aVar));
                        sy90 D = aVar.D();
                        q630 c = qri.c(aVar, aVar2);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar.H();
                        if (aVar.L()) {
                            aVar.I(aVar3);
                        } else {
                            aVar.f();
                        }
                        k9q0.w(aVar, a, cri.a.f);
                        k9q0.w(aVar, D, cri.a.e);
                        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar, cri.a.h);
                        k9q0.w(aVar, c, cri.a.d);
                        AuthorHeaderConfig.Header.Main.a aVar4 = (AuthorHeaderConfig.Header.Main.a) ((zak0) njlVar.b).getValue();
                        if (aVar4 == null) {
                            aVar.K(1941523041);
                            aVar.j();
                        } else {
                            aVar.K(1941523042);
                            njlVar.f(aVar4, aVar, 0);
                            ck70.b(aVar2, 8, aVar, 6);
                        }
                        njlVar.b(njlVar.h().a, njlVar.h().b, njlVar.h().c, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue(), njlVar.h().d, null, aVar, 0, 32);
                        aVar.G();
                        aVar.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    aVar.K(-745337573);
                    aVar.j();
                    azl azlVar = (azl) aVar.r(uvi.h);
                    float i = o6j.i(va8Var.f()) - azlVar.I0(njl.g);
                    float f = kqu0.v;
                    int I0 = (int) (i - azlVar.I0(f));
                    if (I0 < 0) {
                        I0 = 0;
                    }
                    if (wjo0.a(wjo0Var, njlVar.h().a, nmo0Var, 2, s6j.b(0, I0, 0, 0, 13), 972).b.f <= 1) {
                        aVar.K(-740572904);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar, 48);
                        int hashCode2 = Long.hashCode(n34.n(aVar));
                        sy90 D2 = aVar.D();
                        q630 c2 = qri.c(aVar, aVar2);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar.H();
                        if (aVar.L()) {
                            aVar.I(aVar5);
                        } else {
                            aVar.f();
                        }
                        k9q0.w(aVar, a2, cri.a.f);
                        k9q0.w(aVar, D2, cri.a.e);
                        k9q0.w(aVar, Integer.valueOf(hashCode2), cri.a.g);
                        k9q0.t(aVar, cri.a.h);
                        k9q0.w(aVar, c2, cri.a.d);
                        njlVar.e(str, aVar, 0);
                        f9t.e(txj0.v(aVar2, f), aVar, 0);
                        String str2 = njlVar.h().a;
                        String str3 = njlVar.h().b;
                        String str4 = njlVar.h().c;
                        boolean booleanValue = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
                        AuthorHeaderConfig.Header.Main.Name.Default.Verification verification = njlVar.h().d;
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        njlVar.b(str2, str3, str4, booleanValue, verification, new xpy(1.0f, true), aVar, 0, 0);
                        aVar.G();
                        aVar.j();
                    } else {
                        aVar.K(-739963940);
                        a.m mVar2 = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, aVar, 0);
                        int hashCode3 = Long.hashCode(n34.n(aVar));
                        sy90 D3 = aVar.D();
                        q630 c3 = qri.c(aVar, aVar2);
                        cri.h7.getClass();
                        LayoutNode.a aVar6 = cri.a.b;
                        if (aVar.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar.H();
                        if (aVar.L()) {
                            aVar.I(aVar6);
                        } else {
                            aVar.f();
                        }
                        k9q0.w(aVar, a3, cri.a.f);
                        k9q0.w(aVar, D3, cri.a.e);
                        k9q0.w(aVar, Integer.valueOf(hashCode3), cri.a.g);
                        k9q0.t(aVar, cri.a.h);
                        k9q0.w(aVar, c3, cri.a.d);
                        njlVar.e(str, aVar, 0);
                        f9t.e(txj0.h(aVar2, f), aVar, 0);
                        njlVar.b(njlVar.h().a, njlVar.h().b, njlVar.h().c, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue(), njlVar.h().d, null, aVar, 0, 32);
                        aVar.G();
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                dct dctVar = (dct) this.c;
                yj00 yj00Var = (yj00) this.d;
                q630 q630Var = (q630) this.e;
                izs izsVar = (izs) this.f;
                ksy ksyVar = (ksy) obj;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar7.J(ksyVar) ? 4 : 2;
                }
                if (aVar7.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1771807070, intValue2, -1, "com.vk.games.presentation.components.MapCatalogItemsToView.<anonymous> (MapCatalogItemsToView.kt:145)");
                    }
                    f7t.b((udt.c) dctVar, yj00Var.e, izsVar, yj00Var.c, ksy.c(ksyVar, q630Var, 7), aVar7, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
        }
    }
}
