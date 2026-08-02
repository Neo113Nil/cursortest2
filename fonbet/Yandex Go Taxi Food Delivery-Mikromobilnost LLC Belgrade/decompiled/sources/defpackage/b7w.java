package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b7w extends c {
    public static final b7w b = new b7w();
    public static final String c = "sub";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        d = Collections.singletonList(new kms(evaluableType, true));
        e = evaluableType;
        f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Long l = 0L;
        int i = 0;
        for (Long l2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            long longValue = l.longValue();
            if (i != 0) {
                l2 = cma1.H(hmz0.a, Long.valueOf(longValue), l2);
            }
            l = l2;
            i = i2;
        }
        return l;
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
