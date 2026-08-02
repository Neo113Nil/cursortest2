package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public abstract class bh20 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c A[EDGE_INSN: B:47:0x008c->B:31:0x008c BREAK  A[LOOP:0: B:9:0x0011->B:32:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List a(RoomDatabase.b bVar, int i, int i2) {
        Pair pair;
        boolean z;
        if (i == i2) {
            return EmptyList.a;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (z2) {
                if (i >= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap = bVar.a;
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
                        Map map = (Map) pair.getFirst();
                        Iterator it = ((Iterable) pair.getSecond()).iterator();
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
                LinkedHashMap linkedHashMap2 = bVar.a;
                if (z2) {
                }
            }
        } while (z);
        return null;
    }

    public static final boolean b(c cVar, int i, int i2) {
        if (i > i2 && cVar.l) {
            return false;
        }
        Set set = cVar.m;
        return cVar.k && (set == null || !set.contains(Integer.valueOf(i)));
    }
}
