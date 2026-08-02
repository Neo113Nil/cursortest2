package com.yandex.go.scooters.zones.legend.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.iap0;
import defpackage.lys;
import defpackage.mrg0;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class e extends lys {
    public static final /* synthetic */ int V = 0;
    public final ru.yandex.taxi.widget.utils.e S;
    public final int T;
    public final int U;

    public e(ListItemComponent listItemComponent, ru.yandex.taxi.widget.utils.e eVar) {
        super(listItemComponent);
        this.S = eVar;
        this.T = ru.yandex.taxi.design.utils.c.h(56, listItemComponent);
        this.U = ru.yandex.taxi.design.utils.c.h(32, listItemComponent);
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) this.R);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int d = ru.yandex.taxi.design.utils.c.d(mrg0.go_design_m_space, listItemComponent);
        marginLayoutParams.setMarginStart(d);
        marginLayoutParams.setMarginEnd(d);
        listItemComponent2.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        iap0 iap0Var = (iap0) obj;
        b0(new ZoneItemViewHolder$setZonePolygon$1(this, iap0Var.b, null));
        int d = ru.yandex.taxi.design.utils.c.d(mrg0.go_design_s_space, this.a);
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        TextView title = listItemComponent.title();
        title.setPaddingRelative(d, title.getPaddingTop(), title.getPaddingEnd(), title.getPaddingBottom());
        listItemComponent.setTitle(iap0Var.a);
    }
}
