package xsna;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;

/* compiled from: MapsJVM.kt */
/* loaded from: classes11.dex */
public class on00 extends pt20 {
    public static int e(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> f(Pair<? extends K, ? extends V> pair) {
        return Collections.singletonMap(pair.i(), pair.j());
    }

    public static TreeMap g(Pair... pairArr) {
        TreeMap treeMap = new TreeMap();
        pn00.r(treeMap, pairArr);
        return treeMap;
    }
}
