package com.google.common.collect;

import defpackage.vls;
import defpackage.y5e;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u {
    public static ArrayList a(Object... objArr) {
        int length = objArr.length;
        y5e.i(length, "arraySize");
        ArrayList arrayList = new ArrayList(com.google.common.primitives.a.d(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static AbstractList b(List list, vls vlsVar) {
        return list != null ? new Lists$TransformingRandomAccessList(list, vlsVar) : new Lists$TransformingSequentialList(list, vlsVar);
    }
}
