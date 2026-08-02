package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tooltips.manager.TooltipPlacement;

/* loaded from: classes6.dex */
public final class gvz0 {
    public final r0 a = bvf0.c(b.f());

    public final boolean a(k4c0 k4c0Var, TooltipPlacement tooltipPlacement) {
        r0 r0Var;
        Object value;
        Map map;
        boolean z;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            map = (Map) value;
            boolean containsValue = map.containsValue(tooltipPlacement);
            z = !containsValue;
            if (!containsValue) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(k4c0Var, tooltipPlacement);
                map = linkedHashMap;
            }
        } while (!r0Var.k(value, map));
        return z;
    }
}
