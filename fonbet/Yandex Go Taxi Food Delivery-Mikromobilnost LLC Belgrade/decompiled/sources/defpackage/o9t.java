package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;

/* loaded from: classes.dex */
public final class o9t extends c {
    public static final o9t b = new o9t();
    public static final String c = "getNumberValue";
    public static final List d;
    public static final EvaluableType e;

    static {
        kms kmsVar = new kms(EvaluableType.STRING, false);
        EvaluableType evaluableType = EvaluableType.NUMBER;
        d = scc.g(kmsVar, new kms(evaluableType, false));
        e = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String str = (String) list.get(0);
        Number number = (Number) list.get(1);
        o231 o231Var = (o231) cxq0Var.b;
        Number number2 = null;
        if (!(o231Var.get(str) instanceof Long)) {
            Object obj = o231Var.get(str);
            if (obj instanceof Number) {
                number2 = (Number) obj;
            }
        }
        return number2 == null ? number : number2;
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
