package com.yandex.go.shortcuts.impl.router;

import com.yandex.go.shortcuts.impl.factory.g;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.i4s0;
import defpackage.ib8;
import defpackage.ike;
import defpackage.jst;
import defpackage.nc6;
import defpackage.ny61;
import defpackage.q121;
import defpackage.qwn;
import defpackage.r330;
import defpackage.syr0;
import defpackage.wyr0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final h3y a;
    public final syr0 b;
    public final i3y c;
    public final i3y d;

    public a(h3y h3yVar, syr0 syr0Var) {
        this.a = h3yVar;
        this.b = syr0Var;
        wyr0 wyr0Var = new wyr0(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = kotlin.a.b(lazyThreadSafetyMode, wyr0Var);
        this.d = kotlin.a.b(lazyThreadSafetyMode, new wyr0(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, List list, Consumer consumer, r330 r330Var, ContinuationImpl continuationImpl) {
        ShortcutModalBottomItemsInteractor$filterAndShowItems$1 shortcutModalBottomItemsInteractor$filterAndShowItems$1;
        int i;
        Iterator it;
        aVar.getClass();
        if (continuationImpl instanceof ShortcutModalBottomItemsInteractor$filterAndShowItems$1) {
            shortcutModalBottomItemsInteractor$filterAndShowItems$1 = (ShortcutModalBottomItemsInteractor$filterAndShowItems$1) continuationImpl;
            int i2 = shortcutModalBottomItemsInteractor$filterAndShowItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutModalBottomItemsInteractor$filterAndShowItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shortcutModalBottomItemsInteractor$filterAndShowItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutModalBottomItemsInteractor$filterAndShowItems$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        nc6 nc6Var = (nc6) obj2;
                        if (!(nc6Var instanceof q121) && !((ArrayList) aVar.c.getValue()).contains(new Integer(nc6Var.e)) && !((HashMap) aVar.d.getValue()).containsKey(nc6Var.a)) {
                            arrayList.add(obj2);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (hashSet.add(new Integer(((nc6) next).e))) {
                            arrayList2.add(next);
                        }
                    }
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (hashSet2.add(((nc6) next2).a)) {
                            arrayList3.add(next2);
                        }
                    }
                    it = arrayList3.iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) shortcutModalBottomItemsInteractor$filterAndShowItems$1.L$4;
                    r330 r330Var2 = (r330) shortcutModalBottomItemsInteractor$filterAndShowItems$1.L$2;
                    Consumer consumer2 = (Consumer) shortcutModalBottomItemsInteractor$filterAndShowItems$1.L$1;
                    kotlin.b.b(obj);
                    r330Var = r330Var2;
                    consumer = consumer2;
                }
                while (it.hasNext()) {
                    nc6 nc6Var2 = (nc6) it.next();
                    shortcutModalBottomItemsInteractor$filterAndShowItems$1.L$0 = null;
                    shortcutModalBottomItemsInteractor$filterAndShowItems$1.L$1 = consumer;
                    shortcutModalBottomItemsInteractor$filterAndShowItems$1.L$2 = r330Var;
                    shortcutModalBottomItemsInteractor$filterAndShowItems$1.L$3 = null;
                    shortcutModalBottomItemsInteractor$filterAndShowItems$1.L$4 = it;
                    shortcutModalBottomItemsInteractor$filterAndShowItems$1.L$5 = null;
                    shortcutModalBottomItemsInteractor$filterAndShowItems$1.L$6 = null;
                    shortcutModalBottomItemsInteractor$filterAndShowItems$1.label = 1;
                    if (((g) aVar.b).b(nc6Var2, new ib8(5, aVar, nc6Var2, r330Var), consumer, shortcutModalBottomItemsInteractor$filterAndShowItems$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        shortcutModalBottomItemsInteractor$filterAndShowItems$1 = new ShortcutModalBottomItemsInteractor$filterAndShowItems$1(aVar, continuationImpl);
        Object obj3 = shortcutModalBottomItemsInteractor$filterAndShowItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutModalBottomItemsInteractor$filterAndShowItems$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    public final void b(ike ikeVar, List list, i4s0 i4s0Var) {
        r330 r330Var = (r330) this.a.get();
        if (r330Var instanceof qwn) {
            jst.e.getClass();
        } else if (list.isEmpty()) {
            ((HashMap) this.d.getValue()).clear();
        } else {
            com.yandex.go.coroutines.b.g(ikeVar, null, null, new ShortcutModalBottomItemsInteractor$showBottomItems$1(this, list, i4s0Var, r330Var, null), 3);
        }
    }
}
