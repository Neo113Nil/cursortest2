package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class jn60 extends c {
    public static final jn60 b = new jn60();
    public static final String c = "toInteger";
    public static final List d = Collections.singletonList(new kms(EvaluableType.NUMBER, false));
    public static final EvaluableType e = EvaluableType.INTEGER;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        double doubleValue = ((Double) a.P(list)).doubleValue();
        if (doubleValue >= -9.223372036854776E18d && doubleValue <= 9.223372036854776E18d) {
            return Long.valueOf((long) doubleValue);
        }
        b.e(c, list, "Unable to convert value to Integer.", null);
        throw null;
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
