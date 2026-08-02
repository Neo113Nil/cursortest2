package com.yandex.go.taxi.order.details.v1.elements.user_requirements;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import defpackage.dfs0;
import defpackage.kr31;
import defpackage.ts21;

/* loaded from: classes14.dex */
public final class d extends dfs0 {
    public d(LinearLayout linearLayout) {
        super(linearLayout, UserRequirementAdapter$1.b);
    }

    @Override // defpackage.dfs0
    public final kr31 a(ViewGroup viewGroup, Object obj) {
        DetailsCardListItem detailsCardListItem = new DetailsCardListItem(viewGroup.getContext(), null, 0, 6, null);
        detailsCardListItem.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new ts21(detailsCardListItem);
    }
}
