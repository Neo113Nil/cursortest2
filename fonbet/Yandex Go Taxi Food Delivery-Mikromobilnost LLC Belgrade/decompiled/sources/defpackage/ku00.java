package defpackage;

import java.util.List;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public interface ku00 {
    static void a(ku00 ku00Var, long j) {
        j1m j1mVar = (j1m) ku00Var;
        j1mVar.d = Long.valueOf(System.currentTimeMillis());
        wwq wwqVar = j1mVar.b;
        uu00 uu00Var = j1mVar.a;
        String str = uu00Var.a;
        Long l = j1mVar.c;
        long longValue = l != null ? l.longValue() : 0L;
        Long l2 = j1mVar.d;
        u7u0 u7u0Var = new u7u0(longValue, l2 != null ? l2.longValue() : 0L);
        List list = (List) uu00Var.c.get("pageToken");
        wwqVar.b(str, u7u0Var, list != null ? (String) a.R(list) : null, j1mVar.e);
    }
}
