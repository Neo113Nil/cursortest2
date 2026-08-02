package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import defpackage.cxq0;
import defpackage.jdo;
import defpackage.kms;
import java.util.Collections;
import java.util.List;
import kotlin.text.Regex;

/* loaded from: classes11.dex */
public final class l extends com.yandex.div.evaluable.c {
    public static final l b = new l();
    public static final String c = "encodeRegex";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        d = Collections.singletonList(new kms(evaluableType, false));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return new Regex("[.*+?^${}()|\\[\\]\\\\]").i((String) list.get(0), EncodeRegex$evaluate$1.w);
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return d;
    }

    @Override // com.yandex.div.evaluable.c
    public final String c() {
        return c;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return e;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return f;
    }
}
