package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class huu0 extends c {
    public static final huu0 b = new huu0();
    public static final String c = "toBoolean";
    public static final List d = Collections.singletonList(new kms(EvaluableType.STRING, false));
    public static final EvaluableType e = EvaluableType.BOOLEAN;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        boolean z;
        String str = (String) a.P(list);
        if (str.equals("true")) {
            z = true;
        } else {
            if (!str.equals("false")) {
                b.e(c, list, "Unable to convert value to Boolean.", null);
                throw null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
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
