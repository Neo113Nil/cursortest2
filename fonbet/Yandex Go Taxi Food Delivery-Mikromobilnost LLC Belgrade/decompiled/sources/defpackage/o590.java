package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;

/* loaded from: classes11.dex */
public final class o590 extends c {
    public static final o590 b = new o590();
    public static final String c = "padStart";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        d = scc.g(new kms(evaluableType, false), new kms(EvaluableType.INTEGER, false), new kms(evaluableType, false));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return khb1.i(cxq0Var, jdoVar, (int) (((Long) list.get(1)).longValue() - r4.length()), (String) list.get(2)).concat((String) list.get(0));
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
