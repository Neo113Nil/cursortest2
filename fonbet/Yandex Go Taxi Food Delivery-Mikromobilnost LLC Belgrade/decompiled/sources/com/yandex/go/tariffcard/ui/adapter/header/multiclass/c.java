package com.yandex.go.tariffcard.ui.adapter.header.multiclass;

import android.graphics.drawable.Drawable;
import defpackage.bvf0;
import defpackage.eel0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.i5l0;
import defpackage.l5l0;
import defpackage.lt00;
import defpackage.ny61;
import defpackage.o68;
import defpackage.pwy0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.wls;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class c {
    public final e a;
    public final pwy0 b;
    public final kotlinx.coroutines.sync.a c = gtq0.a();
    public ArrayList d;

    public c(e eVar, pwy0 pwy0Var) {
        this.a = eVar;
        this.b = pwy0Var;
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(null);
        }
        this.d = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wls wlsVar, List list, ContinuationImpl continuationImpl) {
        RoutesConverter$createEmptyState$1 routesConverter$createEmptyState$1;
        int i;
        Drawable y;
        if (continuationImpl instanceof RoutesConverter$createEmptyState$1) {
            routesConverter$createEmptyState$1 = (RoutesConverter$createEmptyState$1) continuationImpl;
            int i2 = routesConverter$createEmptyState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routesConverter$createEmptyState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routesConverter$createEmptyState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routesConverter$createEmptyState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean c = this.b.getThemeType().c();
                    List list2 = eel0.a;
                    l5l0 l5l0Var = c ? eel0.c : eel0.b;
                    y = tje.y(l5l0Var.c(), this.a.a);
                    List a = l5l0Var.a();
                    ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                    int i3 = 0;
                    for (Object obj2 : a) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        arrayList.add(new i5l0((String) ((i3 < 0 || i3 >= list.size()) ? "econom" : list.get(i3)), (o68) obj2));
                        i3 = i4;
                    }
                    routesConverter$createEmptyState$1.L$0 = null;
                    routesConverter$createEmptyState$1.L$1 = null;
                    routesConverter$createEmptyState$1.L$2 = null;
                    routesConverter$createEmptyState$1.L$3 = y;
                    routesConverter$createEmptyState$1.Z$0 = c;
                    routesConverter$createEmptyState$1.label = 1;
                    obj = a.a.a(arrayList, wlsVar, routesConverter$createEmptyState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y = (Drawable) routesConverter$createEmptyState$1.L$3;
                    kotlin.b.b(obj);
                }
                return new lt00(EmptyList.a, Collections.singletonList(y), (List) obj);
            }
        }
        routesConverter$createEmptyState$1 = new RoutesConverter$createEmptyState$1(this, continuationImpl);
        Object obj3 = routesConverter$createEmptyState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routesConverter$createEmptyState$1.label;
        if (i != 0) {
        }
        return new lt00(EmptyList.a, Collections.singletonList(y), (List) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Set set, wls wlsVar, List list, ContinuationImpl continuationImpl) {
        RoutesConverter$toRouteList$1 routesConverter$toRouteList$1;
        int i;
        if (continuationImpl instanceof RoutesConverter$toRouteList$1) {
            routesConverter$toRouteList$1 = (RoutesConverter$toRouteList$1) continuationImpl;
            int i2 = routesConverter$toRouteList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routesConverter$toRouteList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routesConverter$toRouteList$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routesConverter$toRouteList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    routesConverter$toRouteList$1.L$0 = set;
                    routesConverter$toRouteList$1.L$1 = wlsVar;
                    routesConverter$toRouteList$1.L$2 = list;
                    routesConverter$toRouteList$1.label = 1;
                    obj = c(set, routesConverter$toRouteList$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    list = (List) routesConverter$toRouteList$1.L$2;
                    wlsVar = (wls) routesConverter$toRouteList$1.L$1;
                    set = (Set) routesConverter$toRouteList$1.L$0;
                    kotlin.b.b(obj);
                }
                List list2 = (List) obj;
                if (set.isEmpty()) {
                    routesConverter$toRouteList$1.L$0 = null;
                    routesConverter$toRouteList$1.L$1 = null;
                    routesConverter$toRouteList$1.L$2 = null;
                    routesConverter$toRouteList$1.L$3 = null;
                    routesConverter$toRouteList$1.label = 3;
                    Object n = bvf0.n(new RoutesConverter$createRoutesState$2(list2, this, wlsVar, null), routesConverter$toRouteList$1);
                    if (n != obj2) {
                        return n;
                    }
                } else {
                    routesConverter$toRouteList$1.L$0 = null;
                    routesConverter$toRouteList$1.L$1 = null;
                    routesConverter$toRouteList$1.L$2 = null;
                    routesConverter$toRouteList$1.L$3 = null;
                    routesConverter$toRouteList$1.label = 2;
                    Object a = a(wlsVar, list, routesConverter$toRouteList$1);
                    if (a != obj2) {
                        return a;
                    }
                }
                return obj2;
            }
        }
        routesConverter$toRouteList$1 = new RoutesConverter$toRouteList$1(this, continuationImpl);
        Object obj3 = routesConverter$toRouteList$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routesConverter$toRouteList$1.label;
        if (i != 0) {
        }
        List list22 = (List) obj3;
        if (set.isEmpty()) {
        }
        return obj22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x004a, B:12:0x005a, B:14:0x0060, B:17:0x0069, B:20:0x006f, B:26:0x0075, B:27:0x0079, B:29:0x0080, B:32:0x008c, B:37:0x0090, B:38:0x009b, B:40:0x00a1, B:43:0x00ae, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00c8, B:55:0x00cc), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x004a, B:12:0x005a, B:14:0x0060, B:17:0x0069, B:20:0x006f, B:26:0x0075, B:27:0x0079, B:29:0x0080, B:32:0x008c, B:37:0x0090, B:38:0x009b, B:40:0x00a1, B:43:0x00ae, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00c8, B:55:0x00cc), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x004a, B:12:0x005a, B:14:0x0060, B:17:0x0069, B:20:0x006f, B:26:0x0075, B:27:0x0079, B:29:0x0080, B:32:0x008c, B:37:0x0090, B:38:0x009b, B:40:0x00a1, B:43:0x00ae, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00c8, B:55:0x00cc), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x004a, B:12:0x005a, B:14:0x0060, B:17:0x0069, B:20:0x006f, B:26:0x0075, B:27:0x0079, B:29:0x0080, B:32:0x008c, B:37:0x0090, B:38:0x009b, B:40:0x00a1, B:43:0x00ae, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00c8, B:55:0x00cc), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(Set set, ContinuationImpl continuationImpl) {
        RoutesConverter$updateAndGet$1 routesConverter$updateAndGet$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Iterator it;
        Iterator it2;
        Iterator it3;
        try {
            if (continuationImpl instanceof RoutesConverter$updateAndGet$1) {
                routesConverter$updateAndGet$1 = (RoutesConverter$updateAndGet$1) continuationImpl;
                int i2 = routesConverter$updateAndGet$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    routesConverter$updateAndGet$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = routesConverter$updateAndGet$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = routesConverter$updateAndGet$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        routesConverter$updateAndGet$1.L$0 = set;
                        aVar = this.c;
                        routesConverter$updateAndGet$1.L$1 = aVar;
                        routesConverter$updateAndGet$1.label = 1;
                        if (aVar.a(routesConverter$updateAndGet$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r7 = (g050) routesConverter$updateAndGet$1.L$1;
                        Set set2 = (Set) routesConverter$updateAndGet$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r7;
                        set = set2;
                    }
                    ArrayList arrayList = new ArrayList(this.d);
                    ArrayList arrayList2 = new ArrayList();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        String str = (String) next;
                        if (str != null && !set.contains(str)) {
                            arrayList2.add(next);
                        }
                    }
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        int indexOf = arrayList.indexOf((String) it2.next());
                        if (indexOf != -1) {
                            arrayList.set(indexOf, null);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : set) {
                        if (!arrayList.contains((String) obj2)) {
                            arrayList3.add(obj2);
                        }
                    }
                    it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        int indexOf2 = arrayList.indexOf(null);
                        if (indexOf2 == -1) {
                            break;
                        }
                        arrayList.set(indexOf2, str2);
                    }
                    this.d = arrayList;
                    aVar.d(null);
                    return arrayList;
                }
            }
            ArrayList arrayList4 = new ArrayList(this.d);
            ArrayList arrayList22 = new ArrayList();
            it = arrayList4.iterator();
            while (it.hasNext()) {
            }
            it2 = arrayList22.iterator();
            while (it2.hasNext()) {
            }
            ArrayList arrayList32 = new ArrayList();
            while (r7.hasNext()) {
            }
            it3 = arrayList32.iterator();
            while (it3.hasNext()) {
            }
            this.d = arrayList4;
            aVar.d(null);
            return arrayList4;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        routesConverter$updateAndGet$1 = new RoutesConverter$updateAndGet$1(this, continuationImpl);
        Object obj3 = routesConverter$updateAndGet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routesConverter$updateAndGet$1.label;
        if (i != 0) {
        }
    }
}
