package com.yandex.go.places.impl.ui.search.viewholder;

import defpackage.bdc;
import defpackage.dvp0;
import defpackage.evp0;
import defpackage.hbp0;
import defpackage.kdc;
import defpackage.lys;
import defpackage.ovp0;
import defpackage.pzt0;
import defpackage.tls;
import defpackage.tt2;
import defpackage.xng0;
import defpackage.zo31;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
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

    public d(ovp0 ovp0Var, e eVar, hbp0 hbp0Var, tt2 tt2Var, tls tlsVar) {
        super(ovp0Var);
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
        ovp0 ovp0Var = (ovp0) zo31Var;
        ovp0Var.c.clearAnimation();
        ovp0Var.c.setVisibility(8);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        evp0 evp0Var = (evp0) obj;
        ovp0 ovp0Var = (ovp0) ((zo31) this.R);
        pzt0 pzt0Var = this.W;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        SearchNoItemsViewHolder$bind$1 searchNoItemsViewHolder$bind$1 = new SearchNoItemsViewHolder$bind$1(evp0Var, ovp0Var, this, null);
        hbp0 hbp0Var = this.T;
        this.W = hbp0.e(hbp0Var, null, null, searchNoItemsViewHolder$bind$1, 3);
        pzt0 pzt0Var2 = this.Z;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.Z = hbp0.e(hbp0Var, null, null, new SearchNoItemsViewHolder$bind$2(evp0Var, ovp0Var, this, null), 3);
        pzt0 pzt0Var3 = this.a0;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.a0 = hbp0.e(hbp0Var, null, null, new SearchNoItemsViewHolder$bind$3(evp0Var, ovp0Var, this, null), 3);
        if (evp0Var.d == null) {
            ovp0Var.b.setVisibility(8);
        }
        final dvp0 dvp0Var = evp0Var.d;
        if (dvp0Var != null) {
            pzt0 pzt0Var4 = this.b0;
            if (pzt0Var4 != null) {
                pzt0Var4.a(null);
            }
            this.b0 = hbp0.e(hbp0Var, null, null, new SearchNoItemsViewHolder$bind$4$1(this, ovp0Var, dvp0Var, null), 3);
            kdc d = this.S.d(dvp0Var.b);
            if (d == null) {
                d = new bdc(xng0.controlMain);
            }
            ovp0Var.b.setButtonBackground(d);
            ovp0Var.b.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.places.impl.ui.search.viewholder.b
                @Override // java.lang.Runnable
                public final void run() {
                    ((SearchNoItemsViewHolder$Companion$itemType$1$1) d.this.V).invoke(dvp0Var.c);
                }
            });
        }
    }
}
