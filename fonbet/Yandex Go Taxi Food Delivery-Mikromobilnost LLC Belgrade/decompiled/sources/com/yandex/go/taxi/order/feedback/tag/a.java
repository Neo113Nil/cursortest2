package com.yandex.go.taxi.order.feedback.tag;

import android.view.ViewGroup;
import defpackage.dfs0;
import defpackage.g7x0;
import defpackage.h7x0;
import defpackage.kr31;
import defpackage.msq;
import defpackage.s8i0;

/* loaded from: classes14.dex */
public final class a extends dfs0 {
    public final msq f;
    public s8i0 g;

    public a(TagRatingReasonsView tagRatingReasonsView, msq msqVar) {
        super(tagRatingReasonsView, TagRatingAdapter$1.b);
        this.f = msqVar;
    }

    @Override // defpackage.dfs0
    public final kr31 a(ViewGroup viewGroup, Object obj) {
        g7x0 g7x0Var = new g7x0(this, new TagRatingItemView(viewGroup.getContext()));
        g7x0Var.c((h7x0) obj);
        return g7x0Var;
    }
}
