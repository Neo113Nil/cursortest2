package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jgj extends c {
    public static final jgj b = new jgj();
    public static final String c = "containsKey";
    public static final List d = scc.g(new kms(EvaluableType.DICT, false), new kms(EvaluableType.STRING, false));
    public static final EvaluableType e = EvaluableType.BOOLEAN;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return Boolean.valueOf(((JSONObject) list.get(0)).has((String) list.get(1)));
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
