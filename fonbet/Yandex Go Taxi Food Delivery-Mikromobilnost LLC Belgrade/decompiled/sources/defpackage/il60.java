package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.types.a;
import java.util.List;
import java.util.TimeZone;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class il60 extends c {
    public static final il60 b = new il60();
    public static final String c = "nowLocal";
    public static final EmptyList d = EmptyList.a;
    public static final EvaluableType e = EvaluableType.DATETIME;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return new a(System.currentTimeMillis(), TimeZone.getDefault());
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
