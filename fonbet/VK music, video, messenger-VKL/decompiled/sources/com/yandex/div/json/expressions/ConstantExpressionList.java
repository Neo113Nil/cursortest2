package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import java.util.List;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ExpressionList.kt */
/* loaded from: classes7.dex */
public final class ConstantExpressionList<T> implements ExpressionList<T> {
    private final List<T> values;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstantExpressionList(List<? extends T> list) {
        this.values = list;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ConstantExpressionList) && epx.f(this.values, ((ConstantExpressionList) obj).values);
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    public List<T> evaluate(ExpressionResolver expressionResolver) {
        return this.values;
    }

    public final List<T> getValues$div_data_release() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() * 16;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    public Disposable observe(ExpressionResolver expressionResolver, izs<? super List<? extends T>, s3q0> izsVar) {
        return Disposable.NULL;
    }
}
