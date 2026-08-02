package defpackage;

import com.yandex.plus.home.plaque.repository.api.model.Predicate$Compare$Type;
import com.yandex.plus.log.api.LogPriority;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class gkc0 {
    public final pgz a;

    public /* synthetic */ gkc0(pgz pgzVar) {
        this.a = pgzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01e5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(eie0 eie0Var, Map map) {
        int compareTo;
        if (eie0Var instanceof qhe0) {
            Collection collection = ((qhe0) eie0Var).a;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!a((eie0) it.next(), map)) {
                    }
                }
            }
        }
        if (eie0Var instanceof rhe0) {
            Collection a = ((rhe0) eie0Var).a();
            if (!a.isEmpty()) {
                Iterator it2 = a.iterator();
                while (it2.hasNext()) {
                    if (a((eie0) it2.next(), map)) {
                    }
                }
            }
        }
        if (eie0Var instanceof xhe0) {
            return !a(((xhe0) eie0Var).a(), map);
        }
        if (eie0Var instanceof she0) {
            return ((she0) eie0Var).a;
        }
        if (eie0Var instanceof the0) {
            the0 the0Var = (the0) eie0Var;
            ekc0 b = b(the0Var.a(), map);
            if (b instanceof ckc0) {
                cie0 c = the0Var.c();
                cie0 a2 = ((ckc0) b).a();
                Predicate$Compare$Type b2 = the0Var.b();
                if ((c instanceof zhe0) && (a2 instanceof zhe0)) {
                    compareTo = Double.compare(((zhe0) c).a().doubleValue(), ((zhe0) a2).a().doubleValue());
                } else if ((c instanceof aie0) && (a2 instanceof aie0)) {
                    compareTo = ((aie0) c).a().compareTo(((aie0) a2).a());
                } else if ((c instanceof yhe0) && (a2 instanceof yhe0)) {
                    compareTo = Boolean.compare(((yhe0) c).a(), ((yhe0) a2).a());
                } else if ((c instanceof bie0) && (a2 instanceof bie0)) {
                    compareTo = ((bie0) c).a().toString().compareTo(((bie0) a2).a().toString());
                }
                int i = fkc0.a[b2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    w511.b();
                                    return false;
                                }
                                if (compareTo <= 0) {
                                }
                            } else if (compareTo < 0) {
                            }
                        } else if (compareTo >= 0) {
                        }
                    } else if (compareTo > 0) {
                    }
                } else if (compareTo == 0) {
                }
            } else if (!(b instanceof dkc0)) {
                w511.b();
                return false;
            }
        }
        if (eie0Var instanceof uhe0) {
            uhe0 uhe0Var = (uhe0) eie0Var;
            ekc0 b3 = b(uhe0Var.a(), map);
            if (b3 instanceof ckc0) {
                return Collections.singleton(((ckc0) b3).a()).contains(uhe0Var.b());
            }
            if (b3 instanceof dkc0) {
                return ((dkc0) b3).a().contains(uhe0Var.b());
            }
            w511.b();
            return false;
        }
        if (eie0Var instanceof vhe0) {
            vhe0 vhe0Var = (vhe0) eie0Var;
            ekc0 b4 = b(vhe0Var.a(), map);
            if (b4 instanceof ckc0) {
                return a.G(vhe0Var.b(), ((ckc0) b4).a());
            }
            if (b4 instanceof dkc0) {
                return vhe0Var.b().containsAll(((dkc0) b4).a());
            }
            w511.b();
            return false;
        }
        if (!(eie0Var instanceof whe0)) {
            w511.b();
            return false;
        }
        ekc0 b5 = b(((whe0) eie0Var).a(), map);
        if (b5 instanceof ckc0) {
            if (((ckc0) b5).a() != null) {
            }
        } else {
            if (!(b5 instanceof dkc0)) {
                w511.b();
                return false;
            }
            if (((dkc0) b5).a().isEmpty()) {
            }
        }
    }

    public static ekc0 b(String str, Map map) {
        Object obj = map.get(str);
        if (obj instanceof Number) {
            return new ckc0(new zhe0((Number) obj));
        }
        if (obj instanceof Boolean) {
            return new ckc0(new yhe0(((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Character) {
            return new ckc0(new aie0(String.valueOf(((Character) obj).charValue())));
        }
        if (obj instanceof String) {
            return new ckc0(new aie0((String) obj));
        }
        if (!(obj instanceof Iterable)) {
            return new ckc0(obj != null ? new bie0(obj) : null);
        }
        HashSet hashSet = new HashSet();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object zhe0Var = next instanceof Number ? new zhe0((Number) next) : next instanceof Character ? new aie0(String.valueOf(((Character) next).charValue())) : next instanceof String ? new aie0((String) next) : next instanceof Boolean ? new yhe0(((Boolean) next).booleanValue()) : next == null ? null : new bie0(next);
            if (zhe0Var != null) {
                hashSet.add(zhe0Var);
            }
        }
        return new dkc0(hashSet);
    }

    public xhc0 c(List list, boc0 boc0Var) {
        Object next;
        roc0 b;
        List<xhc0> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (a(((xhc0) obj).d(), boc0Var.a)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        String str = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int a = ((xhc0) next).a();
                do {
                    Object next2 = it.next();
                    int a2 = ((xhc0) next2).a();
                    if (a < a2) {
                        next = next2;
                        a = a2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        xhc0 xhc0Var = (xhc0) next;
        LogPriority logPriority = LogPriority.INFO;
        pgz pgzVar = this.a;
        if (pgzVar.e(logPriority)) {
            int d = gw00.d(tcc.n(list2, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (xhc0 xhc0Var2 : list2) {
                Pair pair = new Pair(xhc0Var2.b().a, xhc0Var2.d());
                linkedHashMap.put(pair.c(), pair.f());
            }
            StringBuilder sb = new StringBuilder("selectPlaque(context=");
            sb.append(boc0Var);
            sb.append(",plaques=");
            sb.append(linkedHashMap);
            sb.append("): ");
            if (xhc0Var != null && (b = xhc0Var.b()) != null) {
                str = b.a;
            }
            sb.append(str);
            pgzVar.a(logPriority, "PlaqueConditionInteractorImpl", sb.toString());
        }
        return xhc0Var;
    }
}
