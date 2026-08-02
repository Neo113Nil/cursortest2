package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class d7w extends c {
    public static final d7w b = new d7w();
    public static final String c = "toBoolean";
    public static final List d = Collections.singletonList(new kms(EvaluableType.INTEGER, false));
    public static final EvaluableType e = EvaluableType.BOOLEAN;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        boolean z;
        long longValue = ((Long) a.P(list)).longValue();
        if (longValue == 0) {
            z = false;
        } else {
            if (longValue != 1) {
                b.e(c, list, "Unable to convert value to Boolean.", null);
                throw null;
            }
            z = true;
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
