package com.yandex.go.design.compose.list;

import defpackage.bpl0;
import defpackage.hz40;
import defpackage.iz40;
import defpackage.wls;
import defpackage.xby;
import defpackage.zls;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public abstract class a {
    public static final bpl0 a(List list, wls wlsVar, zls zlsVar) {
        ArrayList arrayList = new ArrayList(list.size());
        hz40 hz40Var = new hz40(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            Object invoke = wlsVar.invoke(Integer.valueOf(i), obj);
            int j = hz40Var.j(invoke);
            boolean z = j < 0;
            Integer num = (Integer) (z ? null : hz40Var.c[j]);
            int intValue = num != null ? num.intValue() + 1 : 0;
            Integer valueOf = Integer.valueOf(intValue);
            if (z) {
                int i2 = ~j;
                hz40Var.b[i2] = invoke;
                hz40Var.c[i2] = valueOf;
            } else {
                hz40Var.c[j] = valueOf;
            }
            if (intValue == 0) {
                arrayList.add(obj);
            } else {
                Object invoke2 = zlsVar.invoke(Integer.valueOf(i), obj, Integer.valueOf(intValue));
                Object invoke3 = wlsVar.invoke(Integer.valueOf(i), invoke2);
                if (((Number) hz40Var.e(invoke3, 0)).intValue() == 0) {
                    hz40Var.o(invoke3, 0);
                    arrayList.add(invoke2);
                } else {
                    xby.d.j(new InvalidIdUpdateInLazyListException("Updated key from \"" + invoke + "\" to \"" + invoke3 + "\" also duplicated in lazy item: " + invoke2));
                }
            }
        }
        return new bpl0(arrayList, wlsVar);
    }

    public static final bpl0 b(List list, wls wlsVar) {
        if (wlsVar == null) {
            return new bpl0(list, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        iz40 iz40Var = new iz40(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            Object invoke = wlsVar.invoke(Integer.valueOf(i), obj);
            if (iz40Var.a(invoke)) {
                arrayList.add(obj);
            } else {
                xby.d.j(new DuplicateIdInLazyListException("Receive duplicate key \"" + invoke + "\" in lazy item: " + obj));
            }
        }
        return new bpl0(arrayList, wlsVar);
    }
}
