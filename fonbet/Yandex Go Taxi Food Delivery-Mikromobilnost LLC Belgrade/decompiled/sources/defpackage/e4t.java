package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;

/* loaded from: classes.dex */
public final class e4t extends c {
    public static final e4t b = new e4t();
    public static final String c = "getBooleanValue";
    public static final List d;
    public static final EvaluableType e;

    static {
        kms kmsVar = new kms(EvaluableType.STRING, false);
        EvaluableType evaluableType = EvaluableType.BOOLEAN;
        d = scc.g(kmsVar, new kms(evaluableType, false));
        e = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String str = (String) list.get(0);
        Boolean bool = (Boolean) list.get(1);
        Object obj = ((o231) cxq0Var.b).get(str);
        Boolean bool2 = obj instanceof Boolean ? (Boolean) obj : null;
        return bool2 == null ? bool : bool2;
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
