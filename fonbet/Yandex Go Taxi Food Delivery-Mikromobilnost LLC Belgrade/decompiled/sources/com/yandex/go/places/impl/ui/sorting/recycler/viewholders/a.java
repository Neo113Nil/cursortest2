package com.yandex.go.places.impl.ui.sorting.recycler.viewholders;

import defpackage.lgp;
import defpackage.lz70;
import defpackage.rp80;
import defpackage.s5o;
import defpackage.scc;
import defpackage.sd30;
import defpackage.wys;
import java.util.List;
import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes13.dex */
public final class a extends wys {
    public static final List T = scc.g(new s5o(null), new lgp(OrganizationsSortingItemViewHolder$Companion$PAYLOAD_TYPES$1.b, OrganizationsSortingItemViewHolder$Companion$PAYLOAD_TYPES$2.b, 3));
    public final ListItemCheckComponent R;
    public final lz70 S;

    public a(ListItemCheckComponent listItemCheckComponent, lz70 lz70Var) {
        super(listItemCheckComponent);
        this.R = listItemCheckComponent;
        this.S = lz70Var;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        rp80 rp80Var = (rp80) obj;
        CharSequence charSequence = rp80Var.b;
        ListItemCheckComponent listItemCheckComponent = this.R;
        listItemCheckComponent.setTitle(charSequence);
        listItemCheckComponent.setSubtitle(rp80Var.c);
        listItemCheckComponent.setMode(ListItemCheckComponent.Mode.SINGLE);
        listItemCheckComponent.setChecked(rp80Var.d);
        listItemCheckComponent.setDebounceClickListener(new sd30(22, this, rp80Var));
    }
}
