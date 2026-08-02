package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;

/* loaded from: classes.dex */
public final class i5t extends c {
    public static final i5t b = new i5t();
    public static final String c = "getColorValue";
    public static final List d;
    public static final EvaluableType e;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        d = scc.g(new kms(evaluableType, false), new kms(evaluableType, false));
        e = EvaluableType.COLOR;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String str = (String) list.get(0);
        int B = wwg.B((String) list.get(1));
        Object obj = ((o231) cxq0Var.b).get(str);
        jdc jdcVar = obj instanceof jdc ? (jdc) obj : null;
        return jdcVar == null ? new jdc(B) : jdcVar;
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
