package com.yandex.go.taxi.order.support.ui.support_menu.adapter;

import android.view.View;
import android.view.ViewGroup;
import defpackage.mjw0;
import defpackage.n4h0;
import defpackage.pav;
import defpackage.tje;
import defpackage.wys;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.MaskedShimmeringBar;

/* loaded from: classes14.dex */
public final class a extends wys {
    public static final /* synthetic */ int T = 0;
    public final ListItemComponent R;
    public final pav S;

    public a(ListItemComponent listItemComponent, pav pavVar) {
        super(listItemComponent);
        this.R = listItemComponent;
        this.S = pavVar;
    }

    @Override // defpackage.wys
    public final boolean X() {
        return true;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        mjw0 mjw0Var = (mjw0) obj;
        String str = mjw0Var.d;
        CharSequence charSequence = mjw0Var.b;
        ListItemComponent listItemComponent = this.R;
        listItemComponent.setTitle(charSequence);
        MaskedShimmeringBar maskedShimmeringBar = new MaskedShimmeringBar(listItemComponent.getContext(), null, 0, 0, 14, null);
        View view = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(c.h(40, view), tje.u(40, view.getContext()));
        int u = tje.u(8, view.getContext());
        marginLayoutParams.setMargins(u, u, u, u);
        maskedShimmeringBar.setLayoutParams(marginLayoutParams);
        maskedShimmeringBar.setMaskResource(n4h0.ic_support_icon_spot_mask);
        listItemComponent.setLeadView(maskedShimmeringBar);
        b0(new SupportMenuActionViewHolder$bind$2(this, str, null));
    }
}
