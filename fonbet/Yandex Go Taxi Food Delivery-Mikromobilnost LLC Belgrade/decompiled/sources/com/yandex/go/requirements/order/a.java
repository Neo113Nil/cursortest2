package com.yandex.go.requirements.order;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.biv0;
import defpackage.e380;
import defpackage.gmw0;
import defpackage.jmw0;
import defpackage.kdr;
import defpackage.pex0;
import defpackage.qqo;
import defpackage.tje;
import defpackage.tse;
import defpackage.v96;
import defpackage.vqv0;
import defpackage.wiq0;
import defpackage.wvd;
import defpackage.yfx0;
import java.util.List;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes13.dex */
public final class a extends v96 {
    public final tse a;
    public final yfx0 b;
    public final wiq0 c;
    public final kdr d;
    public final e380 e;
    public final vqv0 f;
    public final biv0 g;

    public a(tse tseVar, yfx0 yfx0Var, wiq0 wiq0Var, kdr kdrVar, e380 e380Var, vqv0 vqv0Var, biv0 biv0Var) {
        this.a = tseVar;
        this.b = yfx0Var;
        this.c = wiq0Var;
        this.d = kdrVar;
        this.e = e380Var;
        this.f = vqv0Var;
        this.g = biv0Var;
    }

    @Override // defpackage.v96
    public final boolean b() {
        pex0 m = ((k) this.c).m();
        if (m != null) {
            String str = m.b;
            jmw0 a = this.b.a.a(m.f());
            if (a != null) {
                kdr kdrVar = this.d;
                wvd wvdVar = (wvd) kdrVar.e.b();
                boolean z = a instanceof gmw0;
                tse tseVar = this.a;
                e380 e380Var = this.e;
                if (z) {
                    boolean z2 = wvdVar.b;
                    List list = wvdVar.d;
                    if (z2 && (list.isEmpty() || list.contains(((gmw0) a).c))) {
                        qqo qqoVar = kdrVar.e;
                        if (!((wvd) qqoVar.b()).b || ((wvd) qqoVar.b()).c) {
                            tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new GluedRequirementOrderPart$showTariffCardAndOptionSelector$1(this, m, a, null), 1);
                            return true;
                        }
                        if (z) {
                            gmw0 gmw0Var = (gmw0) a;
                            e380Var.a(false, kdrVar.a(gmw0Var, 0), str, gmw0Var.c);
                            return true;
                        }
                        return true;
                    }
                }
                if (!this.g.c()) {
                    tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new GluedRequirementOrderPart$showTariffCard$1(this, m, null), 1);
                    e380Var.a(true, false, str, a.getName());
                }
                return true;
            }
        }
        return false;
    }
}
