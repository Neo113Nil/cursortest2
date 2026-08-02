package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes11.dex */
public abstract class a {
    public static final Object a = new Object();
    public static volatile zzag b;

    public static boolean a(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = zzcq.a;
            }
        } else {
            if (!(collection instanceof zzck)) {
                return false;
            }
            obj = ((zzck) collection).w;
        }
        return comparator.equals(obj);
    }
}
