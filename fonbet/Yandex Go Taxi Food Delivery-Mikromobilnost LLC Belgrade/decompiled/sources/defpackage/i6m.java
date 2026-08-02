package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i6m extends c {
    public static final i6m b = new i6m();
    public static final String c = "sum";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        d = Collections.singletonList(new kms(evaluableType, true));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Double valueOf = Double.valueOf(0.0d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            valueOf = (Double) cma1.H(imz0.a, Double.valueOf(valueOf.doubleValue()), it.next());
        }
        return valueOf;
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
