package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;

/* loaded from: classes.dex */
public final class met extends c {
    public static final met b = new met();
    public static final String c = "getStringValue";
    public static final List d;
    public static final EvaluableType e;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        d = scc.g(new kms(evaluableType, false), new kms(evaluableType, false));
        e = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String str = (String) list.get(0);
        String str2 = (String) list.get(1);
        Object obj = ((o231) cxq0Var.b).get(str);
        String str3 = obj instanceof String ? (String) obj : null;
        return str3 == null ? str2 : str3;
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
