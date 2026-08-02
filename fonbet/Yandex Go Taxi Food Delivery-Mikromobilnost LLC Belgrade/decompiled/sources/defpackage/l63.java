package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class l63 extends c {
    public static final l63 b = new l63();
    public static final String c = "toString";
    public static final List d = Collections.singletonList(new kms(EvaluableType.ARRAY, false));
    public static final EvaluableType e = EvaluableType.STRING;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return ((JSONArray) a.P(list)).toString();
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
        return false;
    }
}
