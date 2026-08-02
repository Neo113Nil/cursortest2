package com.yandex.div.core.tooltip;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.json.expressions.ExpressionResolver;
import xsna.e9e0;
import xsna.ikn;
import xsna.sqe0;

/* compiled from: DivTooltipViewBuilder.kt */
/* loaded from: classes7.dex */
public class DivTooltipViewBuilder {
    private final e9e0<Div2Builder> div2Builder;

    public DivTooltipViewBuilder(e9e0<Div2Builder> e9e0Var) {
        this.div2Builder = e9e0Var;
    }

    private View prepareTooltipView(BindingContext bindingContext, com.yandex.div2.a aVar) {
        ikn b = aVar.b();
        View buildView = this.div2Builder.get().buildView(aVar, bindingContext, DivStatePath.Companion.fromRootDiv$div_release(0L, aVar));
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DisplayMetrics b2 = sqe0.b(buildView);
        buildView.setLayoutParams(new RelativeLayout.LayoutParams(DivUtilKt.toLayoutParamsSize$default(b.getWidth(), b2, expressionResolver, null, 4, null), DivUtilKt.toLayoutParamsSize$default(b.getHeight(), b2, expressionResolver, null, 4, null)));
        buildView.setFocusable(true);
        return buildView;
    }

    public DivTooltipContainer buildTooltipView(BindingContext bindingContext, com.yandex.div2.a aVar, int i, int i2) {
        View prepareTooltipView = prepareTooltipView(bindingContext, aVar);
        DivTooltipContainer divTooltipContainer = new DivTooltipContainer(bindingContext.getDivView().getContext(), null, 0, 6, null);
        divTooltipContainer.addView(prepareTooltipView);
        divTooltipContainer.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        return divTooltipContainer;
    }
}
