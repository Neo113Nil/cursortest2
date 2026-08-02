package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class fgs0 extends c {
    public static final fgs0 b = new fgs0();
    public static final String c = "sin";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        d = Collections.singletonList(new kms(evaluableType, false));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return Double.valueOf(Math.sin(((Double) a.P(list)).doubleValue()));
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
