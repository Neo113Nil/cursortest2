package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes.dex */
public final class aft extends c {
    public static final aft b = new aft();
    public static final String c = "getUrlValue";
    public static final List d;
    public static final EvaluableType e;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        d = scc.g(new kms(evaluableType, false), new kms(evaluableType, false));
        e = EvaluableType.URL;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String str = (String) list.get(0);
        String str2 = (String) list.get(1);
        Object obj = ((o231) cxq0Var.b).get(str);
        String str3 = obj instanceof rg21 ? ((rg21) obj).a : null;
        if (str3 != null) {
            return new rg21(str3);
        }
        String e2 = b.e(str2);
        if (e2 != null) {
            return new rg21(e2);
        }
        com.yandex.div.evaluable.b.f(c, "Unable to convert value to Url.", list);
        throw null;
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
