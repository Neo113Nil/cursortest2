package org.chromium.base;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class CollectionUtil {
    private CollectionUtil() {
    }

    public static <T> List<T> flatten(Collection<? extends Collection<T>> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Collection<T>> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        return arrayList;
    }

    public static int[] integerCollectionToIntArray(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static <T> List<T> strengthen(Collection<WeakReference<T>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<WeakReference<T>> it = collection.iterator();
        while (it.hasNext()) {
            T t = it.next().get();
            if (t == null) {
                it.remove();
            } else {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
