package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;

/* compiled from: Div2Builder.kt */
/* loaded from: classes7.dex */
public class Div2Builder {
    private final DivRuntimeVisitor runtimeVisitor;
    private final DivBinder viewBinder;
    private final DivViewCreator viewCreator;

    public Div2Builder(DivViewCreator divViewCreator, DivBinder divBinder, DivRuntimeVisitor divRuntimeVisitor) {
        this.viewCreator = divViewCreator;
        this.viewBinder = divBinder;
        this.runtimeVisitor = divRuntimeVisitor;
    }

    public View buildView(a aVar, BindingContext bindingContext, DivStatePath divStatePath) {
        View createView = createView(aVar, bindingContext, divStatePath);
        this.viewBinder.bind(bindingContext, createView, aVar, divStatePath);
        return createView;
    }

    public View createView(a aVar, BindingContext bindingContext, DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        this.runtimeVisitor.createAndAttachRuntimes(aVar, divStatePath, bindingContext.getDivView());
        View create = this.viewCreator.create(aVar, expressionResolver);
        create.setLayoutParams(new DivLayoutParams(-1, -2));
        return create;
    }
}
