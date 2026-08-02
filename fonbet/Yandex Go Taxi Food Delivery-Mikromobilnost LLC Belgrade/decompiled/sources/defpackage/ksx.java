package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes.dex */
public final class ksx {
    public static Set a(List list) {
        if (list.isEmpty()) {
            return EmptySet.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kx70 kx70Var = (kx70) it.next();
            String e = kx70Var.e();
            linkedHashSet.add((e == null || kx70Var.f() != ServiceType.TAXI) ? new isx(kx70Var.b()) : new jsx(kx70Var.b(), e));
        }
        return linkedHashSet;
    }
}
