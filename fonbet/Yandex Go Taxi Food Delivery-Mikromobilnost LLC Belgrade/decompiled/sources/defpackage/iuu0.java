package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class iuu0 extends c {
    public static final iuu0 b = new iuu0();
    public static final String c = "toColor";
    public static final List d = Collections.singletonList(new kms(EvaluableType.STRING, false));
    public static final EvaluableType e = EvaluableType.COLOR;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        try {
            return new jdc(wwg.B((String) a.P(list)));
        } catch (IllegalArgumentException e2) {
            b.e(c, list, "Unable to convert value to Color, expected format #AARRGGBB.", e2);
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
