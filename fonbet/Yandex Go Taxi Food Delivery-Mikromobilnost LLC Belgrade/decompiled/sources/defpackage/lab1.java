package defpackage;

import com.google.common.base.a;
import com.google.common.collect.ImmutableSet;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes11.dex */
public abstract class lab1 {
    public static boolean c(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static q4r0 d(Set set, hie0 hie0Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof q4r0)) {
                return new r4r0(set2, hie0Var);
            }
            q4r0 q4r0Var = (q4r0) set2;
            return new r4r0((SortedSet) q4r0Var.a, a.a(q4r0Var.b, hie0Var));
        }
        if (!(set instanceof q4r0)) {
            set.getClass();
            return new q4r0(set, hie0Var);
        }
        q4r0 q4r0Var2 = (q4r0) set;
        return new q4r0(q4r0Var2.a, a.a(q4r0Var2.b, hie0Var));
    }

    public static final int e(Float f, Float f2, int i, PlacesMapConfig$RevealingState placesMapConfig$RevealingState) {
        return f(f != null ? Integer.valueOf((int) uh6.o(f.floatValue())) : null, f2 != null ? Integer.valueOf((int) (ofp0.c * f2.floatValue())) : null, i, placesMapConfig$RevealingState);
    }

    public static final int f(Integer num, Integer num2, int i, PlacesMapConfig$RevealingState placesMapConfig$RevealingState) {
        int i2 = placesMapConfig$RevealingState == null ? -1 : ye6.a[placesMapConfig$RevealingState.ordinal()];
        if (i2 == 1) {
            return (num != null && num.intValue() <= i) ? 4 : 6;
        }
        if (i2 != 2) {
            if (i2 == 3 && num2 != null && num2.intValue() < i) {
                return 6;
            }
        } else if (num2 != null && num2.intValue() >= i) {
            return 6;
        }
        return 3;
    }

    public static int g(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static p4r0 h(Set set, ImmutableSet immutableSet) {
        ffx.o(set, "set1");
        ffx.o(immutableSet, "set2");
        return new p4r0(set, immutableSet, 1);
    }

    public static final void i(AnchorBottomSheetBehavior anchorBottomSheetBehavior, Integer num, Integer num2, int i, boolean z) {
        Integer num3;
        if (num2 != null) {
            num3 = Integer.valueOf(ofp0.c - num2.intValue());
        } else {
            num3 = null;
        }
        anchorBottomSheetBehavior.C = false;
        anchorBottomSheetBehavior.a0 = true;
        anchorBottomSheetBehavior.W = true;
        anchorBottomSheetBehavior.Z = false;
        anchorBottomSheetBehavior.V = true;
        anchorBottomSheetBehavior.c0 = true;
        anchorBottomSheetBehavior.R(false);
        anchorBottomSheetBehavior.J(z);
        if (num2 != null) {
            int intValue = num2.intValue();
            if (i > intValue) {
                if (num != null && num.intValue() >= intValue) {
                    anchorBottomSheetBehavior.a0 = false;
                } else if (num == null) {
                    anchorBottomSheetBehavior.W = false;
                }
                anchorBottomSheetBehavior.R(true);
            }
            if (num3 != null) {
                anchorBottomSheetBehavior.K(num3.intValue(), false);
            }
        }
        if (num == null) {
            anchorBottomSheetBehavior.W = false;
            return;
        }
        int intValue2 = num.intValue();
        if (intValue2 > i) {
            anchorBottomSheetBehavior.W = false;
        }
        anchorBottomSheetBehavior.M(intValue2, true);
    }

    public static void j(AnchorBottomSheetBehavior anchorBottomSheetBehavior, Float f, Float f2, int i) {
        i(anchorBottomSheetBehavior, f != null ? Integer.valueOf((int) uh6.o(f.floatValue())) : null, f2 != null ? Integer.valueOf((int) (ofp0.c * f2.floatValue())) : null, i, false);
    }

    public static final Object k(b bVar, boolean z) {
        if (bVar instanceof c) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((c) bVar).a.entrySet()) {
                String str = (String) entry.getKey();
                Object k = k((b) entry.getValue(), z);
                if (k != null) {
                    linkedHashMap.put(str, k);
                }
            }
            return linkedHashMap;
        }
        if (bVar instanceof kotlinx.serialization.json.a) {
            return l((kotlinx.serialization.json.a) bVar, z);
        }
        if (!(bVar instanceof d)) {
            w511.b();
            return null;
        }
        d dVar = (d) bVar;
        if (dVar instanceof JsonNull) {
            return null;
        }
        if (dVar.b()) {
            return dVar.a();
        }
        Boolean f = qcx.f(dVar);
        if (f != null) {
            return f;
        }
        Object o = z ? qcx.o(dVar) : qcx.k(dVar);
        if (o != null) {
            return o;
        }
        Double i = qcx.i(dVar);
        if (i != null) {
            return i;
        }
        kbs.f(dVar, "Unsupported json primitive ");
        return null;
    }

    public static final ArrayList l(kotlinx.serialization.json.a aVar, boolean z) {
        ArrayList arrayList = new ArrayList(tcc.n(aVar, 10));
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            Object k = k((b) it.next(), z);
            if (k == null) {
                ny61.g("Null array elements is forbidden");
                return null;
            }
            arrayList.add(k);
        }
        return arrayList;
    }

    public static final kotlinx.serialization.json.a m(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(tcc.n(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(n(it.next()));
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    public static final b n(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), n(entry.getValue()));
            }
            return new c(linkedHashMap);
        }
        if (obj instanceof Collection) {
            return m((Collection) obj);
        }
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double)) {
            if (obj instanceof String) {
                return qcx.c((String) obj);
            }
            if (obj instanceof Boolean) {
                return qcx.a((Boolean) obj);
            }
            vg10.g(obj.getClass(), "Unsupported for wrapping type ");
            return null;
        }
        return qcx.b((Number) obj);
    }
}
