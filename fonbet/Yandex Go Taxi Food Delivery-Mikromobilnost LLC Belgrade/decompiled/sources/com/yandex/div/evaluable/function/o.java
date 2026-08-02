package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import defpackage.kms;
import defpackage.scc;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class o extends a {
    public static final o e = new o();
    public static final String f = "decimalFormat";
    public static final List g = scc.g(new kms(EvaluableType.INTEGER, false), new kms(EvaluableType.STRING, false));

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return g;
    }

    @Override // com.yandex.div.evaluable.c
    public final String c() {
        return f;
    }

    @Override // com.yandex.div.evaluable.function.a
    public final String j(DecimalFormat decimalFormat, Number number) {
        return decimalFormat.format(number.longValue());
    }

    @Override // com.yandex.div.evaluable.function.a
    public final Locale k(List list) {
        return Locale.getDefault();
    }

    @Override // com.yandex.div.evaluable.function.a
    public final Number l(Object obj) {
        return (Long) obj;
    }
}
