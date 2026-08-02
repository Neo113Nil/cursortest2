package com.yandex.div.core.extension;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import xsna.ikn;

/* compiled from: DivExtensionHandler.kt */
/* loaded from: classes7.dex */
public interface DivExtensionHandler {
    void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar);

    boolean matches(ikn iknVar);

    void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar);

    default void preprocess(ikn iknVar, ExpressionResolver expressionResolver) {
    }

    default void beforeBindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar) {
    }
}
