package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class kuu0 extends c {
    public static final kuu0 b = new kuu0();
    public static final String c = "toNumber";
    public static final List d = Collections.singletonList(new kms(EvaluableType.STRING, false));
    public static final EvaluableType e = EvaluableType.NUMBER;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String str = c;
        try {
            double parseDouble = Double.parseDouble((String) a.P(list));
            if (parseDouble != Double.POSITIVE_INFINITY && parseDouble != Double.NEGATIVE_INFINITY) {
                return Double.valueOf(parseDouble);
            }
            b.e(str, list, "Unable to convert value to Number.", null);
            throw null;
        } catch (NumberFormatException e2) {
            b.e(str, list, "Unable to convert value to Number.", e2);
            throw null;
        }
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
