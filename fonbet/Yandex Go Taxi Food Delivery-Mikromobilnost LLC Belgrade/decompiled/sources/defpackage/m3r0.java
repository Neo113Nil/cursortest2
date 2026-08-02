package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.types.a;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes11.dex */
public final class m3r0 extends c {
    public static final m3r0 b = new m3r0();
    public static final String c = "setMinutes";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.DATETIME;
        d = scc.g(new kms(evaluableType, false), new kms(EvaluableType.INTEGER, false));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        a aVar = (a) list.get(0);
        long longValue = ((Long) list.get(1)).longValue();
        if (longValue <= 59 && longValue >= 0) {
            Calendar k = h6u0.k(aVar);
            k.set(12, (int) longValue);
            return new a(k.getTimeInMillis(), aVar.b);
        }
        b.e(c, list, "Expecting minutes in [0..59], instead got " + longValue + '.', null);
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
