package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class m53 extends c {
    public static final m53 b = new m53();
    public static final String c = "isEmpty";
    public static final List d = Collections.singletonList(new kms(EvaluableType.ARRAY, false));
    public static final EvaluableType e = EvaluableType.BOOLEAN;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return Boolean.valueOf(((JSONArray) list.get(0)).length() == 0);
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
