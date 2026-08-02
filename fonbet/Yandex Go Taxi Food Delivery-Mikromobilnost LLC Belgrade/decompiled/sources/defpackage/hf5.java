package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.c;

/* loaded from: classes5.dex */
public final class hf5 {
    public final c a;
    public final p6s b;

    public hf5(c cVar, p6s p6sVar) {
        this.a = cVar;
        this.b = p6sVar;
    }

    public static void a(LinkedHashMap linkedHashMap, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r9x0 r9x0Var = (r9x0) it.next();
            if (r9x0Var instanceof p8x0) {
                linkedHashMap.putAll(((p8x0) r9x0Var).a);
            } else if (r9x0Var instanceof y8x0) {
                a(linkedHashMap, ((y8x0) r9x0Var).a);
            }
        }
    }

    public final void b(Object obj, String str, List list) {
        LinkedHashMap l = b.l(new Pair(str, obj));
        a(l, list);
        c(list);
        this.b.d(l);
    }

    public final void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r9x0 r9x0Var = (r9x0) it.next();
            if (!(r9x0Var instanceof p8x0)) {
                if (r9x0Var instanceof y8x0) {
                    c(((y8x0) r9x0Var).a);
                } else {
                    this.a.b(r9x0Var);
                }
            }
        }
    }
}
