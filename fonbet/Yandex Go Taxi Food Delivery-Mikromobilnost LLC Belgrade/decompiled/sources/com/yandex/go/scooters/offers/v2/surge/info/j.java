package com.yandex.go.scooters.offers.v2.surge.info;

import android.view.View;
import android.view.ViewGroup;
import defpackage.d3p0;
import defpackage.lys;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes13.dex */
public final class j extends lys {
    public static final /* synthetic */ int T = 0;
    public final ru.yandex.taxi.widget.utils.e S;

    public j(ListItemComponent listItemComponent, ru.yandex.taxi.widget.utils.e eVar) {
        super(listItemComponent);
        this.S = eVar;
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) this.R);
        listItemComponent2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        listItemComponent2.setLeadContentDescription("");
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        d3p0 d3p0Var = (d3p0) obj;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        b0(new TextBlockItemViewHolder$bind$1$1(listItemComponent, this, d3p0Var, null));
        listItemComponent.setTitle(d3p0Var.b);
        listItemComponent.setSubtitle(d3p0Var.c);
        listItemComponent.setDividers(DividerPosition.BOTTOM, d3p0Var.d ? DividerType.ICON_MARGIN : DividerType.NONE);
    }
}
