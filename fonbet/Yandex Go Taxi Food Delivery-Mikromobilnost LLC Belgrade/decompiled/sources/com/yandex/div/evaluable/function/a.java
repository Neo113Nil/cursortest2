package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.cdo;
import defpackage.cxq0;
import defpackage.j73;
import defpackage.jdo;
import defpackage.oyr;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public abstract class a extends com.yandex.div.evaluable.c {
    public static final Set d = j73.f0(new Character[]{'#', Character.valueOf(MoneyInputEditView.DEFAULT_VALUE), Character.valueOf(HexString.CHAR_COMMA), '.'});
    public final EvaluableType b = EvaluableType.STRING;
    public final boolean c = true;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Number l = l(list.get(0));
        String str = (String) list.get(1);
        Locale k = k(list);
        if (str.length() == 0) {
            m(jdoVar, list, null);
            throw null;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!d.contains(Character.valueOf(str.charAt(i)))) {
                m(jdoVar, list, null);
                throw null;
            }
        }
        try {
            return j(new DecimalFormat(str, DecimalFormatSymbols.getInstance(k)), l);
        } catch (Exception e) {
            m(jdoVar, list, e);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return this.b;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return this.c;
    }

    public abstract String j(DecimalFormat decimalFormat, Number number);

    public abstract Locale k(List list);

    public abstract Number l(Object obj);

    public final void m(jdo jdoVar, List list, Exception exc) {
        throw new EvaluableException(oyr.p("Failed to evaluate [", kotlin.collections.a.X(kotlin.collections.a.J(list, jdoVar instanceof cdo ? 1 : 0), null, c() + '(', Extension.C_BRAKE, AbsDecimalFormat$formatCallReference$callReference$1.w, 25), "]. Incorrect format pattern."), exc);
    }
}
