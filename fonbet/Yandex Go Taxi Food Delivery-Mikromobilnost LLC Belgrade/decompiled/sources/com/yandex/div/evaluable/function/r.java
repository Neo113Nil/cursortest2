package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import defpackage.kms;
import defpackage.scc;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class r extends a {
    public static final r e = new r();
    public static final String f = "decimalFormat";
    public static final List g = scc.g(new kms(EvaluableType.NUMBER, false), new kms(EvaluableType.STRING, false));

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
        return decimalFormat.format(Float.valueOf((float) number.doubleValue()));
    }

    @Override // com.yandex.div.evaluable.function.a
    public final Locale k(List list) {
        return Locale.getDefault();
    }

    @Override // com.yandex.div.evaluable.function.a
    public final Number l(Object obj) {
        return (Double) obj;
    }
}
