package com.yandex.div.core.view2.divs.tabs;

import android.view.View;
import com.yandex.div2.a;

/* compiled from: DivTabsAdapter.kt */
/* loaded from: classes7.dex */
final class TabModel {
    private final a div;
    private final int index;
    private final View view;

    public TabModel(int i, a aVar, View view) {
        this.index = i;
        this.div = aVar;
        this.view = view;
    }

    public final a getDiv() {
        return this.div;
    }

    public final int getIndex() {
        return this.index;
    }

    public final View getView() {
        return this.view;
    }
}
