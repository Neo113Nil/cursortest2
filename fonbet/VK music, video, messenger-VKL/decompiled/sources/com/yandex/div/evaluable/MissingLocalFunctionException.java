package com.yandex.div.evaluable;

import java.util.List;

/* compiled from: EvaluableException.kt */
/* loaded from: classes7.dex */
public final class MissingLocalFunctionException extends EvaluableException {
    public MissingLocalFunctionException(String str, List<? extends EvaluableType> list) {
        super("Function '" + str + '(' + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) list) + ")' is missing.", null, 2, null);
    }
}
