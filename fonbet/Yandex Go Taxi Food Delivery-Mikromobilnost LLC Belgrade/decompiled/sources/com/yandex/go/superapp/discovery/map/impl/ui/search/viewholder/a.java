package com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import defpackage.bxv0;
import defpackage.dzg0;
import defpackage.hbp0;
import defpackage.lsy0;
import defpackage.lys;
import defpackage.n2v0;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpt0;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xng0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a extends lys {
    public static final /* synthetic */ int b0 = 0;
    public final e S;
    public final hbp0 T;
    public final n2v0 U;
    public final tt2 V;
    public pzt0 W;
    public pzt0 Z;
    public pzt0 a0;

    public a(ListItemComponent listItemComponent, e eVar, hbp0 hbp0Var, n2v0 n2v0Var, tt2 tt2Var) {
        super(listItemComponent);
        this.S = eVar;
        this.T = hbp0Var;
        this.U = n2v0Var;
        this.V = tt2Var;
    }

    @Override // defpackage.wys
    public final void Y() {
        View view = (View) this.R;
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
        ListItemComponent listItemComponent = (ListItemComponent) view;
        listItemComponent.setTitle("");
        listItemComponent.setSubtitle("");
        listItemComponent.setLeadImage(new ColorDrawable(0));
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        bxv0 bxv0Var = (bxv0) obj;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        int i = dzg0.bg_transparent_ripple;
        View view = this.a;
        listItemComponent.setBackground(ru.yandex.taxi.design.utils.c.k(i, view));
        listItemComponent.setDebounceClickListener(new tpt0(19, this, bxv0Var));
        pzt0 pzt0Var = this.W;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        FormattedText formattedText = bxv0Var.a;
        e eVar = this.S;
        lsy0 a = com.yandex.go.superapp.discovery.map.impl.ui.search.utils.a.a(eVar, formattedText);
        listItemComponent.setTitle(a.a);
        this.V.getClass();
        sjh sjhVar = uyj.a;
        SuperAppDiscoveryMapSearchItemViewHolder$bind$2 superAppDiscoveryMapSearchItemViewHolder$bind$2 = new SuperAppDiscoveryMapSearchItemViewHolder$bind$2(a, this, listItemComponent, null);
        hbp0 hbp0Var = this.T;
        this.W = hbp0.e(hbp0Var, sjhVar, null, superAppDiscoveryMapSearchItemViewHolder$bind$2, 2);
        pzt0 pzt0Var2 = this.Z;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        lsy0 a2 = com.yandex.go.superapp.discovery.map.impl.ui.search.utils.a.a(eVar, bxv0Var.b);
        listItemComponent.setSubtitle(a2.a);
        this.Z = hbp0.e(hbp0Var, sjhVar, null, new SuperAppDiscoveryMapSearchItemViewHolder$bind$3(a2, this, listItemComponent, null), 2);
        listItemComponent.setTrailCompanionText(bxv0Var.f);
        listItemComponent.setTrailTextSize((int) tje.b0(listItemComponent.getContext(), 14.0f));
        listItemComponent.setTrailTextColor(qje.t(xng0.textMinor, view.getContext()));
        pzt0 pzt0Var3 = this.a0;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.a0 = hbp0.e(hbp0Var, null, null, new SuperAppDiscoveryMapSearchItemViewHolder$bind$4(bxv0Var, listItemComponent, this, null), 3);
        listItemComponent.setDividers(DividerPosition.BOTTOM, bxv0Var.e ? DividerType.ICON : DividerType.NONE);
    }
}
