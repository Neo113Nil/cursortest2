package com.yandex.go.places.impl.ui.filters.recycler;

import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.places.impl.ui.common.chip.ChipView;
import defpackage.bm50;
import defpackage.gm80;
import defpackage.lgp;
import defpackage.lys;
import defpackage.mqb;
import defpackage.mrg0;
import defpackage.scc;
import defpackage.tls;
import defpackage.tt2;
import defpackage.xw31;
import defpackage.z5r;
import defpackage.zo31;
import java.util.List;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a extends lys {
    public static final List V;
    public final tt2 S;
    public final e T;
    public final tls U;

    static {
        int i = 3;
        V = scc.g(new lgp(OrganizationsFilterBlockViewHolder$Companion$PAYLOAD_TYPES$1.b, OrganizationsFilterBlockViewHolder$Companion$PAYLOAD_TYPES$2.b, i), new lgp(OrganizationsFilterBlockViewHolder$Companion$PAYLOAD_TYPES$3.b, OrganizationsFilterBlockViewHolder$Companion$PAYLOAD_TYPES$4.b, i));
    }

    public a(gm80 gm80Var, tt2 tt2Var, e eVar, tls tlsVar) {
        super(gm80Var);
        this.S = tt2Var;
        this.T = eVar;
        this.U = tlsVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        z5r z5rVar = (z5r) obj;
        zo31 zo31Var = (zo31) this.R;
        CharSequence charSequence = z5rVar.b;
        if (charSequence == null || charSequence.length() == 0) {
            gm80 gm80Var = (gm80) zo31Var;
            gm80Var.d.setVisibility(8);
            xw31.E(gm80Var.b, null, Integer.valueOf(c.d(mrg0.go_design_m_space, this.a)), null, null);
        } else {
            gm80 gm80Var2 = (gm80) zo31Var;
            gm80Var2.d.setVisibility(0);
            gm80Var2.d.setTitle(z5rVar.b);
            xw31.E(gm80Var2.b, null, 0, null, null);
        }
        gm80 gm80Var3 = (gm80) zo31Var;
        GoConstraintLayout goConstraintLayout = gm80Var3.b;
        if (goConstraintLayout.getChildCount() > 1) {
            goConstraintLayout.removeViews(1, goConstraintLayout.getChildCount() - 1);
        }
        Flow flow = gm80Var3.c;
        flow.setReferencedIds(new int[0]);
        for (mqb mqbVar : z5rVar.c) {
            ChipView chipView = new ChipView(gm80Var3.a.getContext());
            chipView.setId(View.generateViewId());
            chipView.setTag(mqbVar.a);
            chipView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
            chipView.setSelected(mqbVar.d);
            chipView.setTexts(mqbVar.b);
            b0(new OrganizationsFilterBlockViewHolder$setSelectedImage$1(this, mqbVar.e, chipView, null));
            chipView.setBackgroundColors(mqbVar.c);
            c.z(new bm50(18, this, mqbVar), chipView);
            goConstraintLayout.addView(chipView);
            flow.addView(chipView);
        }
    }
}
