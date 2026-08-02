package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;

/* loaded from: classes11.dex */
public final class n590 extends c {
    public static final n590 b = new n590();
    public static final String c = "padStart";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        kms kmsVar = new kms(evaluableType, false);
        kms kmsVar2 = new kms(evaluableType, false);
        EvaluableType evaluableType2 = EvaluableType.STRING;
        d = scc.g(kmsVar, kmsVar2, new kms(evaluableType2, false));
        e = evaluableType2;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return khb1.i(cxq0Var, jdoVar, (int) (((Long) list.get(1)).longValue() - r4.length()), (String) list.get(2)).concat(String.valueOf(((Long) list.get(0)).longValue()));
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
