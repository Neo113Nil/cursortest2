package xsna;

import android.util.ArrayMap;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: SparseArrayExt.kt */
/* loaded from: classes.dex */
public final class zik0 {
    public static final u4q0 a = new u4q0(0);

    public static final boolean a(SparseArray<?> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <V> V b(SparseArray<V> sparseArray) {
        Integer num;
        if (c(sparseArray) || (num = (Integer) j5g.X(d(sparseArray))) == null) {
            return null;
        }
        return sparseArray.get(num.intValue());
    }

    public static final <V> boolean c(SparseArray<V> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final HashSet d(SparseArray sparseArray) {
        HashSet hashSet = new HashSet(sparseArray.size());
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(Integer.valueOf(sparseArray.keyAt(i)));
        }
        return hashSet;
    }

    public static final void e(SparseArray sparseArray, SparseArray sparseArray2) {
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    public static final ArrayMap f(SparseArray sparseArray) {
        ArrayMap arrayMap = new ArrayMap();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            arrayMap.put(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
        return arrayMap;
    }

    public static final ArrayList g(SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(sparseArray.valueAt(i));
        }
        return arrayList;
    }
}
