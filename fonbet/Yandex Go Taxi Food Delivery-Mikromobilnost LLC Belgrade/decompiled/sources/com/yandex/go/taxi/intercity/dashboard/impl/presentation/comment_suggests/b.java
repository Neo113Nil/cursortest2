package com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests;

import android.view.ViewGroup;
import defpackage.dbw;
import defpackage.dfs0;
import defpackage.kr31;
import defpackage.pav;
import defpackage.tls;
import ru.yandex.taxi.widget.FlowLayout;

/* loaded from: classes14.dex */
public final class b extends dfs0 {
    public final pav f;
    public final tls g;

    public b(FlowLayout flowLayout, pav pavVar, tls tlsVar) {
        super(flowLayout, IntercityDashboardCommentItemAdapter$1.b);
        this.f = pavVar;
        this.g = tlsVar;
    }

    @Override // defpackage.dfs0
    public final kr31 a(ViewGroup viewGroup, Object obj) {
        return new dbw(this, new IntercityDashboardChipsView(viewGroup.getContext()));
    }
}
