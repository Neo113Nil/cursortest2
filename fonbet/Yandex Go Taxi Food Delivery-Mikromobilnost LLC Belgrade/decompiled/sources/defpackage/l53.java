package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class l53 extends c53 {
    public l53() {
        super(EvaluableType.INTEGER, 0);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object b = b.b(c(), list, j());
        if (b instanceof Integer) {
            return Long.valueOf(((Number) b).intValue());
        }
        if (b instanceof Long) {
            return b;
        }
        if (b instanceof BigInteger) {
            b.f(c(), "Integer overflow.", list);
            throw null;
        }
        if (b instanceof BigDecimal) {
            b.f(c(), "Cannot convert value to integer.", list);
            throw null;
        }
        if (!(b instanceof Double)) {
            b.g(c(), list, this.c, b, j());
            throw null;
        }
        Number number = (Number) b;
        if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
            b.f(c(), "Integer overflow.", list);
            throw null;
        }
        long c = m810.c(number.doubleValue());
        if (number.doubleValue() - c == 0.0d) {
            return Long.valueOf(c);
        }
        b.f(c(), "Cannot convert value to integer.", list);
        throw null;
    }
}
