package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.types.a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class j9t extends c {
    public static final j9t b = new j9t();
    public static final String c = "getMinutes";
    public static final List d = Collections.singletonList(new kms(EvaluableType.DATETIME, false));
    public static final EvaluableType e = EvaluableType.INTEGER;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return Long.valueOf(h6u0.k((a) list.get(0)).get(12));
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
