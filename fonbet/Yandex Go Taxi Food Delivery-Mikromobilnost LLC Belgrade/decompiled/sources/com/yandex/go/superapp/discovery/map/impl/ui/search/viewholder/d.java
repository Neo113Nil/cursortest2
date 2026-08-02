package com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder;

import defpackage.bdc;
import defpackage.cvp0;
import defpackage.hbp0;
import defpackage.jxv0;
import defpackage.kdc;
import defpackage.lys;
import defpackage.nxv0;
import defpackage.pzt0;
import defpackage.tls;
import defpackage.tt2;
import defpackage.xng0;
import defpackage.zo31;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class d extends lys {
    public static final /* synthetic */ int c0 = 0;
    public final e S;
    public final hbp0 T;
    public final tt2 U;
    public final tls V;
    public pzt0 W;
    public pzt0 Z;
    public pzt0 a0;
    public pzt0 b0;

    public d(nxv0 nxv0Var, e eVar, hbp0 hbp0Var, tt2 tt2Var, tls tlsVar) {
        super(nxv0Var);
        this.S = eVar;
        this.T = hbp0Var;
        this.U = tt2Var;
        this.V = tlsVar;
    }

    @Override // defpackage.wys
    public final void Y() {
        zo31 zo31Var = (zo31) this.R;
        super.Y();
        pzt0 pzt0Var = this.W;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.Z;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.a0;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        nxv0 nxv0Var = (nxv0) zo31Var;
        nxv0Var.c.clearAnimation();
        nxv0Var.c.setVisibility(8);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        jxv0 jxv0Var = (jxv0) obj;
        nxv0 nxv0Var = (nxv0) ((zo31) this.R);
        pzt0 pzt0Var = this.W;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$1 superAppDiscoveryMapSearchNoItemsViewHolder$bind$1 = new SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$1(jxv0Var, nxv0Var, this, null);
        hbp0 hbp0Var = this.T;
        this.W = hbp0.e(hbp0Var, null, null, superAppDiscoveryMapSearchNoItemsViewHolder$bind$1, 3);
        pzt0 pzt0Var2 = this.Z;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.Z = hbp0.e(hbp0Var, null, null, new SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$2(jxv0Var, nxv0Var, this, null), 3);
        pzt0 pzt0Var3 = this.a0;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.a0 = hbp0.e(hbp0Var, null, null, new SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$3(jxv0Var, nxv0Var, this, null), 3);
        if (jxv0Var.d == null) {
            nxv0Var.b.setVisibility(8);
        }
        final cvp0 cvp0Var = jxv0Var.d;
        if (cvp0Var != null) {
            pzt0 pzt0Var4 = this.b0;
            if (pzt0Var4 != null) {
                pzt0Var4.a(null);
            }
            this.b0 = hbp0.e(hbp0Var, null, null, new SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$4$1(this, nxv0Var, cvp0Var, null), 3);
            kdc d = this.S.d(cvp0Var.b);
            if (d == null) {
                d = new bdc(xng0.controlMain);
            }
            nxv0Var.b.setButtonBackground(d);
            nxv0Var.b.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder.b
                @Override // java.lang.Runnable
                public final void run() {
                    ((SuperAppDiscoveryMapSearchNoItemsViewHolder$Companion$itemType$1$1) d.this.V).invoke(cvp0Var.c);
                }
            });
        }
    }
}
