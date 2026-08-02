package com.yandex.div.internal.core;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.a;

/* compiled from: DivTreeVisitor.kt */
/* loaded from: classes7.dex */
public final class DivTreeVisitorKt {
    public static final BindingContext getChildContext(BindingContext bindingContext, a aVar, DivStatePath divStatePath) {
        return bindingContext.getFor(bindingContext.getDivView().getRuntimeStore$div_release().getOrCreateRuntime(divStatePath, aVar, bindingContext.getExpressionResolver()).getExpressionResolver());
    }
}
