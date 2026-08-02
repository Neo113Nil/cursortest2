package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class omi {
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(b580 b580Var, Object obj) {
        if (obj instanceof Boolean) {
            if (b580Var != null && "boolean".equals(b580Var.b)) {
                return ((Boolean) obj).booleanValue();
            }
            if (b580Var == null) {
                return !((Boolean) obj).booleanValue();
            }
            return false;
        }
        if (obj instanceof Double) {
            return ((b580Var != null ? b580Var.b() : null) instanceof of70) && ((of70) b580Var.b()).a == ((int) ((Number) obj).doubleValue());
        }
        if (obj instanceof List) {
            if ((b580Var != null ? b580Var.b() : null) instanceof nf70) {
                ArrayList arrayList = ((nf70) b580Var.b()).a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    rf70 rf70Var = (rf70) obj2;
                    rf70Var.getClass();
                    if (rf70Var instanceof of70) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Integer.valueOf(((of70) ((rf70) it.next())).a));
                }
                Set N0 = a.N0(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : (Iterable) obj) {
                    if (obj3 instanceof Double) {
                        arrayList4.add(obj3);
                    }
                }
                return N0.equals(a.N0(arrayList4));
            }
        }
        if (obj != null || b580Var != null) {
            return false;
        }
    }
}
