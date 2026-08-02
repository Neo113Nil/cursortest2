package com.yandex.go.superapp.discovery.map.impl.ui.main.filters.adapter;

import android.graphics.drawable.ColorDrawable;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.auv0;
import defpackage.bnv0;
import defpackage.evu0;
import defpackage.gtv0;
import defpackage.gyt0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.lys;
import defpackage.ogu0;
import defpackage.pzt0;
import defpackage.tls;
import defpackage.tt2;
import defpackage.xng0;
import defpackage.zo31;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a extends lys {
    public static final /* synthetic */ int b0 = 0;
    public final hbp0 S;
    public final e T;
    public final tt2 U;
    public final tls V;
    public final i3y W;
    public final i3y Z;
    public pzt0 a0;

    public a(auv0 auv0Var, hbp0 hbp0Var, e eVar, tt2 tt2Var, tls tlsVar) {
        super(auv0Var);
        this.S = hbp0Var;
        this.T = eVar;
        this.U = tt2Var;
        this.V = tlsVar;
        this.W = kotlin.a.a(new bnv0(23));
        this.Z = kotlin.a.a(new ogu0(19, this));
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        pzt0 pzt0Var = this.a0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ((auv0) ((zo31) this.R)).b.setImageDrawable((ColorDrawable) this.W.getValue());
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        gtv0 gtv0Var = (gtv0) obj;
        auv0 auv0Var = (auv0) ((zo31) this.R);
        boolean z = gtv0Var.i;
        String str = gtv0Var.c;
        String str2 = gtv0Var.d;
        int i = z ? xng0.textInvert : xng0.textMain;
        RobotoTextView robotoTextView = auv0Var.c;
        GoLinearLayout goLinearLayout = auv0Var.a;
        robotoTextView.setTextColor(c.c(i, this.a));
        robotoTextView.setText(str2);
        robotoTextView.setVisibility(!evu0.J(str2) ? 0 : 8);
        if (!z || evu0.J(str)) {
            str = gtv0Var.b;
        }
        boolean J = evu0.J(str);
        auv0Var.b.setVisibility(J ? 8 : 0);
        i3y i3yVar = this.Z;
        robotoTextView.setPadding(!J ? 0 : ((Number) i3yVar.getValue()).intValue(), 0, ((Number) i3yVar.getValue()).intValue(), 0);
        if (!J) {
            pzt0 pzt0Var = this.a0;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.a0 = hbp0.e(this.S, null, null, new SuperAppDiscoveryMapFilterViewHolder$loadIcon$1(this, str, null), 3);
        }
        goLinearLayout.setSelected(z);
        c.z(new gyt0(9, this, gtv0Var), goLinearLayout);
    }
}
