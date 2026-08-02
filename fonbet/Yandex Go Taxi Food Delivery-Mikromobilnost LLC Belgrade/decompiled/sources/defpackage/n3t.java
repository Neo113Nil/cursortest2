package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class n3t extends c {
    public static final n3t b = new n3t();
    public static final String c = "len";
    public static final List d = Collections.singletonList(new kms(EvaluableType.ARRAY, false));
    public static final EvaluableType e = EvaluableType.INTEGER;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return Long.valueOf(((JSONArray) list.get(0)).length());
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
