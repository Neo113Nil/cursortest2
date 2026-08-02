package defpackage;

import com.squareup.wire.internal.MathMethodsKt;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$TariffIdentifierState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public abstract class m1b1 {
    public static long a(int i, long j) {
        long j2 = i;
        d6z.m("sampleRate must be greater than 0.", j2 > 0);
        return (MathMethodsKt.NANOS_PER_SECOND * j) / j2;
    }

    public static final nco b(pex0 pex0Var, boolean z, boolean z2, String str) {
        ybo yboVar = pex0Var.h;
        if (z) {
            return (z2 && str != null && str.equals(pex0Var.b)) ? new kco(yboVar.b, false) : new jco(yboVar.b);
        }
        return null;
    }

    public static final String c(List list, LinkedHashSet linkedHashSet, Set set, List list2) {
        Integer valueOf;
        Object obj;
        List<pex0> list3 = list;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            linkedHashSet2.add(((pex0) it.next()).b);
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        for (pex0 pex0Var : list3) {
            ycc.r(set.contains(pex0Var.b) ? pex0Var.A0 : EmptyList.a, linkedHashSet3);
        }
        Set g = v4r0.g(v4r0.g(a.U(linkedHashSet3, linkedHashSet2), set), linkedHashSet);
        if (!g.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list3) {
                if (g.contains(((pex0) obj2).b)) {
                    arrayList.add(obj2);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                valueOf = Integer.valueOf(((pex0) it2.next()).h.a);
                while (it2.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((pex0) it2.next()).h.a);
                    if (valueOf.compareTo(valueOf2) > 0) {
                        valueOf = valueOf2;
                    }
                }
            } else {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (((pex0) next).h.a == intValue) {
                        arrayList2.add(next);
                    }
                }
                Iterator it4 = list2.iterator();
                loop4: while (true) {
                    if (!it4.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it4.next();
                    String str = (String) obj;
                    if (!arrayList2.isEmpty()) {
                        Iterator it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            if (jl40.l(str, ((pex0) it5.next()).b)) {
                                break loop4;
                            }
                        }
                    }
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return str2;
                }
                pex0 pex0Var2 = (pex0) a.R(arrayList2);
                if (pex0Var2 != null) {
                    return pex0Var2.b;
                }
            }
        }
        return null;
    }

    public static long d(int i, long j) {
        long j2 = i;
        d6z.m("bytesPerFrame must be greater than 0.", j2 > 0);
        return j / j2;
    }

    public static ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j5p0 j5p0Var = (j5p0) it.next();
            ScootersCardV2Analytics$TariffIdentifierState scootersCardV2Analytics$TariffIdentifierState = null;
            if (j5p0Var instanceof i5p0) {
                b4p0 b4p0Var = ((i5p0) j5p0Var).f;
                if (b4p0Var instanceof xzt0) {
                    scootersCardV2Analytics$TariffIdentifierState = ScootersCardV2Analytics$TariffIdentifierState.STANDARD;
                } else if (b4p0Var instanceof eer) {
                    scootersCardV2Analytics$TariffIdentifierState = ScootersCardV2Analytics$TariffIdentifierState.FIX;
                } else {
                    if (!(b4p0Var instanceof b590)) {
                        w511.b();
                        return null;
                    }
                    scootersCardV2Analytics$TariffIdentifierState = ScootersCardV2Analytics$TariffIdentifierState.PACKAGE;
                }
            } else if (!(j5p0Var instanceof f5p0) && !(j5p0Var instanceof e5p0)) {
                w511.b();
                return null;
            }
            if (scootersCardV2Analytics$TariffIdentifierState != null) {
                arrayList.add(scootersCardV2Analytics$TariffIdentifierState);
            }
        }
        return arrayList;
    }
}
