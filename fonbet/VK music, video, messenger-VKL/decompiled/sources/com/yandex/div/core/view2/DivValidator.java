package com.yandex.div.core.view2;

import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;

/* compiled from: DivValidator.kt */
/* loaded from: classes7.dex */
public class DivValidator extends DivVisitor<Boolean> {
    public boolean validate(a aVar, ExpressionResolver expressionResolver) {
        return visit(aVar, expressionResolver).booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    public Boolean defaultVisit(a aVar, ExpressionResolver expressionResolver) {
        return Boolean.TRUE;
    }
}
