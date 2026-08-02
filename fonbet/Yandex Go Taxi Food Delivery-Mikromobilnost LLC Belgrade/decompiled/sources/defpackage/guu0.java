package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.List;

/* loaded from: classes11.dex */
public final class guu0 extends c {
    public static final guu0 b = new guu0();
    public static final String c = "substring";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        kms kmsVar = new kms(evaluableType, false);
        EvaluableType evaluableType2 = EvaluableType.INTEGER;
        d = scc.g(kmsVar, new kms(evaluableType2, false), new kms(evaluableType2, false));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String str = (String) list.get(0);
        long longValue = ((Long) list.get(1)).longValue();
        long longValue2 = ((Long) list.get(2)).longValue();
        String str2 = c;
        if (longValue < 0 || longValue2 > str.length()) {
            b.e(str2, list, "Indexes are out of bounds.", null);
            throw null;
        }
        if (longValue <= longValue2) {
            return str.substring((int) longValue, (int) longValue2);
        }
        b.e(str2, list, "Indexes should be in ascending order.", null);
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
