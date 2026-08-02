package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class juu0 extends c {
    public static final juu0 b = new juu0();
    public static final String c = "toInteger";
    public static final List d = Collections.singletonList(new kms(EvaluableType.STRING, false));
    public static final EvaluableType e = EvaluableType.INTEGER;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        try {
            return Long.valueOf(Long.parseLong((String) a.P(list)));
        } catch (NumberFormatException e2) {
            b.e(c, list, "Unable to convert value to Integer.", e2);
            throw null;
        }
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
