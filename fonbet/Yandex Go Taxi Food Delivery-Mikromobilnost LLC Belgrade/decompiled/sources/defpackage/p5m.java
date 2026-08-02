package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class p5m extends c {
    public static final p5m b = new p5m();
    public static final String c = "div";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        d = scc.g(new kms(evaluableType, false), new kms(evaluableType, false));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        double doubleValue = ((Double) a.P(list)).doubleValue();
        double doubleValue2 = ((Double) a.Z(list)).doubleValue();
        if (doubleValue2 != 0.0d) {
            return Double.valueOf(doubleValue / doubleValue2);
        }
        b.f(c, "Division by zero is not supported.", list);
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
