package defpackage;

import com.yandex.go.payments.addmethod.ui.home.ButtonResolvedState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public abstract class eg0 {
    public static final ButtonResolvedState a(lh0 lh0Var, boolean z, boolean z2) {
        if (lh0Var.d.isEmpty()) {
            return ButtonResolvedState.ENABLED;
        }
        Iterator it = lh0Var.d.iterator();
        while (it.hasNext()) {
            kh0 kh0Var = (kh0) it.next();
            Boolean bool = kh0Var.c;
            boolean z3 = bool == null || bool.equals(Boolean.valueOf(z));
            Boolean bool2 = kh0Var.d;
            boolean z4 = bool2 == null || bool2.equals(Boolean.valueOf(z2));
            if (z3 && z4) {
                int i = dg0.a[kh0Var.b.ordinal()];
                if (i == 1) {
                    return ButtonResolvedState.DISABLED;
                }
                if (i == 2) {
                    return ButtonResolvedState.BUSY;
                }
                if (i == 3) {
                    return ButtonResolvedState.ENABLED;
                }
                w511.b();
                return null;
            }
        }
        return ButtonResolvedState.ENABLED;
    }

    public static final String b(lh0 lh0Var, boolean z, boolean z2) {
        String str;
        Iterator it = lh0Var.d.iterator();
        while (it.hasNext()) {
            kh0 kh0Var = (kh0) it.next();
            Boolean bool = kh0Var.c;
            boolean z3 = true;
            boolean z4 = bool == null || bool.equals(Boolean.valueOf(z));
            Boolean bool2 = kh0Var.d;
            if (bool2 != null && !bool2.equals(Boolean.valueOf(z2))) {
                z3 = false;
            }
            if (z4 && z3 && (str = kh0Var.a) != null) {
                return str;
            }
        }
        return null;
    }

    public static final LinkedHashMap c(List list, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rh0 rh0Var = (rh0) it.next();
            String str = (String) map.get(rh0Var.a);
            if (str == null) {
                str = "";
            }
            if (rh0Var.d && evu0.J(str)) {
                linkedHashMap.put(rh0Var.a, rh0Var.e);
            }
        }
        return linkedHashMap;
    }
}
