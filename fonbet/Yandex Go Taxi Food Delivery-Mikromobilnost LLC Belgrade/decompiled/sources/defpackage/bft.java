package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;

/* loaded from: classes.dex */
public final class bft extends c {
    public static final bft b = new bft();
    public static final String c = "getUrlValue";
    public static final List d;
    public static final EvaluableType e;

    static {
        kms kmsVar = new kms(EvaluableType.STRING, false);
        EvaluableType evaluableType = EvaluableType.URL;
        d = scc.g(kmsVar, new kms(evaluableType, false));
        e = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object obj = ((o231) cxq0Var.b).get((String) list.get(0));
        String str = obj instanceof rg21 ? ((rg21) obj).a : null;
        return str != null ? new rg21(str) : (rg21) list.get(1);
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
