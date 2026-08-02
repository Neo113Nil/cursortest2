package com.yandex.div.evaluable;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/MissingLocalFunctionException;", "Lcom/yandex/div/evaluable/EvaluableException;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MissingLocalFunctionException extends EvaluableException {
    public MissingLocalFunctionException(String str, ArrayList arrayList) {
        super("Function '" + str + '(' + b.i(arrayList) + ")' is missing.", null);
    }
}
