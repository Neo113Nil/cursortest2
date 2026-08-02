package com.yandex.go.taxi.order.map_objects;

import com.yandex.go.taxi.order.models.api.objects.MapObject;
import com.yandex.go.taxi.order.models.api.objects.MapObjectAction$OpenPointAAlternative;
import defpackage.b080;
import defpackage.bv1;
import defpackage.ei70;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zz70;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b080 b;

    public d(vpr vprVar, b080 b080Var) {
        this.a = vprVar;
        this.b = b080Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0188, code lost:
    
        if (r13 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01b9, code lost:
    
        if (r2.emit((java.util.List) r12, r0) == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0188 -> B:17:0x018b). Please report as a decompilation issue!!! */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1 orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1;
        int i;
        vpr vprVar;
        Iterator it;
        Collection collection;
        String str;
        if (continuation instanceof OrderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1) {
            orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1 = (OrderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1) continuation;
            int i2 = orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.label;
                b080 b080Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        MapObject mapObject = (MapObject) obj3;
                        if (b080.a(b080Var, mapObject) || mapObject.d.b != MapObject.AlignType.TOP) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        MapObject mapObject2 = (MapObject) next;
                        b080Var.getClass();
                        String str2 = mapObject2.a;
                        MapObject.Style style = mapObject2.d;
                        if (str2 != null && str2.length() != 0 && mapObject2.e.size() == 2 && mapObject2.b != MapObject.Type.UNSUPPORTED && !jl40.l(mapObject2.c, zzs.f)) {
                            MapObject.Style.Companion.getClass();
                            if (!jl40.l(style, MapObject.Style.g) && (str = style.a) != null && str.length() != 0 && style.b != MapObject.AlignType.UNSUPPORTED) {
                                arrayList2.add(next);
                            }
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        MapObject mapObject3 = (MapObject) it3.next();
                        if (b080.a(b080Var, mapObject3) && (mapObject3.f instanceof MapObjectAction$OpenPointAAlternative)) {
                            zz70 zz70Var = b080Var.d;
                            String str3 = mapObject3.a;
                            if (zz70Var.b.add(str3 + "AltPointA.Bubble.Shown")) {
                                bv1 bv1Var = zz70Var.a;
                                bv1Var.getClass();
                                bv1Var.a.a("AltPointA.Bubble.Shown", new HashMap(), 1, new HashMap());
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = arrayList2.iterator();
                    vprVar = this.a;
                    it = it4;
                    collection = arrayList3;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                it = (Iterator) orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$11;
                collection = (Collection) orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$9;
                vprVar = (vpr) orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$4;
                kotlin.b.b(obj2);
                ei70 ei70Var = (ei70) obj2;
                if (ei70Var != null) {
                    collection.add(ei70Var);
                }
                if (it.hasNext()) {
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$0 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$1 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$2 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$3 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$4 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$5 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$6 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$7 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$8 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$9 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$10 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$11 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$12 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$13 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$14 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.label = 2;
                } else {
                    MapObject mapObject4 = (MapObject) it.next();
                    a aVar = b080Var.c;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$0 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$1 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$2 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$3 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$4 = vprVar;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$5 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$6 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$7 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$8 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$9 = collection;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$10 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$11 = it;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$12 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$13 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.L$14 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.label = 1;
                    obj2 = aVar.a(mapObject4, orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1);
                }
                return coroutineSingletons;
            }
        }
        orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1 = new OrderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$2$2$1.label;
        b080 b080Var2 = this.b;
        if (i != 0) {
        }
    }
}
