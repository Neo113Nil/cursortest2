package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;
import com.yandex.div2.v9;

/* compiled from: DivTabsAdapter.kt */
/* loaded from: classes7.dex */
public final class DivSimpleTab implements BaseDivTabbedCardUi.Input.TabBase {
    private final DisplayMetrics displayMetrics;
    private final DivTabs.a item;
    private final ExpressionResolver resolver;

    public DivSimpleTab(DivTabs.a aVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        this.item = aVar;
        this.displayMetrics = displayMetrics;
        this.resolver = expressionResolver;
    }

    public DivTabs.a getItem() {
        return this.item;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    public Integer getTabHeight() {
        v9 height = this.item.a.b().getHeight();
        if (height instanceof v9.a) {
            return Integer.valueOf(DivUtilKt.toLayoutParamsSize$default(height, this.displayMetrics, this.resolver, null, 4, null));
        }
        return null;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    public Integer getTabHeightLayoutParam() {
        return Integer.valueOf(DivUtilKt.toLayoutParamsSize$default(this.item.a.b().getHeight(), this.displayMetrics, this.resolver, null, 4, null));
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    public String getTitle() {
        return this.item.b.evaluate(this.resolver);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    public DivAction getActionable() {
        return this.item.c;
    }
}
