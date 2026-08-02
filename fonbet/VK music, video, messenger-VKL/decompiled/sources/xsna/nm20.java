package xsna;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: MigrationUtil.kt */
/* loaded from: classes.dex */
public final class nm20 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c A[EDGE_INSN: B:48:0x008c->B:32:0x008c BREAK  A[LOOP:0: B:10:0x0013->B:33:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<hm20> a(RoomDatabase.c cVar, int i, int i2) {
        Pair pair;
        boolean z;
        LinkedHashMap linkedHashMap = cVar.a;
        if (i == i2) {
            return EmptyList.b;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (z2) {
                if (i >= i2) {
                    return arrayList;
                }
                if (z2) {
                    TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap != null) {
                        pair = new Pair(treeMap, treeMap.keySet());
                        if (pair != null) {
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                } else {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 != null) {
                        pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                        if (pair != null) {
                            break;
                        }
                        Map map = (Map) pair.d();
                        Iterator it = ((Iterable) pair.g()).iterator();
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i2 <= intValue && intValue < i) {
                                    arrayList.add(map.get(Integer.valueOf(intValue)));
                                    z = true;
                                    i = intValue;
                                    break;
                                    break;
                                }
                            } else if (i + 1 <= intValue && intValue <= i2) {
                                arrayList.add(map.get(Integer.valueOf(intValue)));
                                z = true;
                                i = intValue;
                                break;
                            }
                        }
                        z = false;
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
            } else {
                if (i <= i2) {
                    return arrayList;
                }
                if (z2) {
                }
            }
        } while (z);
        return null;
    }

    public static final boolean b(androidx.room.b bVar, int i, int i2) {
        if (i > i2 && bVar.l) {
            return false;
        }
        Set<Integer> set = bVar.m;
        return bVar.k && (set == null || !set.contains(Integer.valueOf(i)));
    }
}
