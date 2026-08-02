package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import com.yandex.div.json.ParsingException;
import java.util.List;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ExpressionList.kt */
/* loaded from: classes7.dex */
public interface ExpressionList<T> {
    List<T> evaluate(ExpressionResolver expressionResolver) throws ParsingException;

    Disposable observe(ExpressionResolver expressionResolver, izs<? super List<? extends T>, s3q0> izsVar);
}
