package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import defpackage.sls;

/* loaded from: classes11.dex */
public abstract class m extends n {
    public final String b = "getStoredNumberValue";
    public final EvaluableType c = EvaluableType.NUMBER;

    @Override // com.yandex.div.evaluable.c
    public final String c() {
        return this.b;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return this.c;
    }

    @Override // com.yandex.div.evaluable.function.n
    public final Object j(Object obj, sls slsVar) {
        Number number = null;
        if (!(obj instanceof Long) && (obj instanceof Number)) {
            number = (Number) obj;
        }
        return number == null ? (Number) ((GetStoredValue$evaluate$fallback$1) slsVar).invoke() : number;
    }
}
