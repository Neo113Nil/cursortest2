package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import defpackage.kms;
import defpackage.scc;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class p extends a {
    public static final p e = new p();
    public static final String f = "decimalFormat";
    public static final List g;

    static {
        kms kmsVar = new kms(EvaluableType.INTEGER, false);
        EvaluableType evaluableType = EvaluableType.STRING;
        g = scc.g(kmsVar, new kms(evaluableType, false), new kms(evaluableType, false));
    }

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
        return Locale.forLanguageTag((String) list.get(2));
    }

    @Override // com.yandex.div.evaluable.function.a
    public final Number l(Object obj) {
        return (Long) obj;
    }
}
