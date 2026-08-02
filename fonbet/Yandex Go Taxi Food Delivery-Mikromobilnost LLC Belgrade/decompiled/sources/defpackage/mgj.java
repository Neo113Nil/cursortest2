package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.k;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class mgj extends c {
    public final List b = scc.g(new kms(EvaluableType.DICT, false), new kms(EvaluableType.STRING, true));
    public final EvaluableType c = EvaluableType.INTEGER;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        long longValue;
        Object a = k.a(c(), list, j());
        if (a instanceof Integer) {
            longValue = ((Number) a).intValue();
        } else {
            if (!(a instanceof Long)) {
                if (a instanceof BigInteger) {
                    k.c(c(), "Integer overflow.", list, j());
                    throw null;
                }
                if (a instanceof BigDecimal) {
                    k.c(c(), "Cannot convert value to integer.", list, j());
                    throw null;
                }
                if (!(a instanceof Double)) {
                    k.d(c(), list, this.c, a, j());
                    throw null;
                }
                Number number = (Number) a;
                if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
                    k.c(c(), "Integer overflow.", list, j());
                    throw null;
                }
                long c = m810.c(number.doubleValue());
                if (number.doubleValue() - c == 0.0d) {
                    return Long.valueOf(c);
                }
                k.c(c(), "Cannot convert value to integer.", list, j());
                throw null;
            }
            longValue = ((Number) a).longValue();
        }
        return Long.valueOf(longValue);
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return this.b;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return this.c;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
