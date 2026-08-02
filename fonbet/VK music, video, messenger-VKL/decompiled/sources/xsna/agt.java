package xsna;

import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.udt;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class agt implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ int c;
    public final /* synthetic */ eev d;
    public final /* synthetic */ udt.e e;
    public final /* synthetic */ xvy f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ izs h;

    public agt(wow wowVar, int i, eev eevVar, udt.e eVar, xvy xvyVar, boolean z, izs izsVar) {
        this.b = wowVar;
        this.c = i;
        this.d = eevVar;
        this.e = eVar;
        this.f = xvyVar;
        this.g = z;
        this.h = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            Object obj = this.b.b.get(intValue);
            int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            g7t g7tVar = (g7t) obj;
            aVar2.K(-177565705);
            int i3 = this.c;
            boolean o = aVar2.o(i3) | ((((i & 112) ^ 48) > 32 && aVar2.o(intValue)) || (i & 48) == 32);
            Object x = aVar2.x();
            Object obj2 = a.C0011a.a;
            if (o || x == obj2) {
                x = "gameItem_" + i3 + '_' + intValue;
                aVar2.R(x);
            }
            q630 E = ahn.E(q630.a.a, (String) x);
            eev eevVar = this.d;
            rha rhaVar = eevVar.b;
            boolean z = rhaVar.b;
            xvy xvyVar = eevVar.c;
            String str = this.e.a;
            float f = rhaVar.c;
            izs izsVar = this.h;
            boolean J = aVar2.J(izsVar) | aVar2.J(g7tVar);
            Object x2 = aVar2.x();
            if (J || x2 == obj2) {
                x2 = new xft(izsVar, g7tVar);
                aVar2.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean J2 = aVar2.J(izsVar) | aVar2.J(g7tVar);
            Object x3 = aVar2.x();
            if (J2 || x3 == obj2) {
                x3 = new yft(izsVar, g7tVar);
                aVar2.R(x3);
            }
            gzs gzsVar2 = (gzs) x3;
            if (z) {
                E = vbh0.g(E, xvyVar, this.f, this.g, f, str, gzsVar, gzsVar2, 8);
            } else {
                float f2 = vbh0.a;
            }
            m7t.a(g7tVar, izsVar, eevVar, intValue, E, aVar2, (i2 << 6) & 7168);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
