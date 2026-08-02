package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.types.a;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes11.dex */
public final class gf90 extends c {
    public static final gf90 b = new gf90();
    public static final String c = "parseUnixTime";
    public static final List d = Collections.singletonList(new kms(EvaluableType.INTEGER, false));
    public static final EvaluableType e = EvaluableType.DATETIME;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return new a(((Long) kotlin.collections.a.P(list)).longValue() * 1000, TimeZone.getTimeZone("UTC"));
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
        return f;
    }
}
