package com.yandex.go.places.map.domain.layer;

import com.yandex.go.places.map.data.repositories.g;
import com.yandex.go.places.map.data.repositories.i;
import com.yandex.go.places.map.domain.entities.PinLayer;
import defpackage.d30;
import defpackage.ny61;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final d30 a;
    public final Map b;

    public c(d30 d30Var, Map map) {
        this.a = d30Var;
        this.b = map;
    }

    public final PinLayer a() {
        return (PinLayer) this.a.c.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0075 -> B:10:0x0078). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        PlacesLayersInteractor$findLayerHostingPin$1 placesLayersInteractor$findLayerHostingPin$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof PlacesLayersInteractor$findLayerHostingPin$1) {
            placesLayersInteractor$findLayerHostingPin$1 = (PlacesLayersInteractor$findLayerHostingPin$1) continuationImpl;
            int i2 = placesLayersInteractor$findLayerHostingPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesLayersInteractor$findLayerHostingPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesLayersInteractor$findLayerHostingPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesLayersInteractor$findLayerHostingPin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = PinLayer.a().iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = placesLayersInteractor$findLayerHostingPin$1.L$3;
                    it = (Iterator) placesLayersInteractor$findLayerHostingPin$1.L$2;
                    String str2 = (String) placesLayersInteractor$findLayerHostingPin$1.L$0;
                    kotlin.b.b(obj);
                    Object next = obj2;
                    str = str2;
                    Object h = obj;
                    if (h != null) {
                        return next;
                    }
                    if (it.hasNext()) {
                        next = it.next();
                        g gVar = (g) kotlin.collections.b.g((PinLayer) next, this.b);
                        placesLayersInteractor$findLayerHostingPin$1.L$0 = str;
                        placesLayersInteractor$findLayerHostingPin$1.L$1 = null;
                        placesLayersInteractor$findLayerHostingPin$1.L$2 = it;
                        placesLayersInteractor$findLayerHostingPin$1.L$3 = next;
                        placesLayersInteractor$findLayerHostingPin$1.L$4 = null;
                        placesLayersInteractor$findLayerHostingPin$1.label = 1;
                        h = gVar.h(str, placesLayersInteractor$findLayerHostingPin$1);
                        if (h == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (h != null) {
                        }
                        if (it.hasNext()) {
                            return null;
                        }
                    }
                }
            }
        }
        placesLayersInteractor$findLayerHostingPin$1 = new PlacesLayersInteractor$findLayerHostingPin$1(this, continuationImpl);
        Object obj3 = placesLayersInteractor$findLayerHostingPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesLayersInteractor$findLayerHostingPin$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0075 -> B:10:0x0078). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        PlacesLayersInteractor$findLayerOfSelectedPin$1 placesLayersInteractor$findLayerOfSelectedPin$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof PlacesLayersInteractor$findLayerOfSelectedPin$1) {
            placesLayersInteractor$findLayerOfSelectedPin$1 = (PlacesLayersInteractor$findLayerOfSelectedPin$1) continuationImpl;
            int i2 = placesLayersInteractor$findLayerOfSelectedPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesLayersInteractor$findLayerOfSelectedPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesLayersInteractor$findLayerOfSelectedPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesLayersInteractor$findLayerOfSelectedPin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = PinLayer.a().iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = placesLayersInteractor$findLayerOfSelectedPin$1.L$3;
                    it = (Iterator) placesLayersInteractor$findLayerOfSelectedPin$1.L$2;
                    String str2 = (String) placesLayersInteractor$findLayerOfSelectedPin$1.L$0;
                    kotlin.b.b(obj);
                    Object next = obj2;
                    str = str2;
                    Object l = obj;
                    if (((Boolean) l).booleanValue()) {
                        return next;
                    }
                    if (it.hasNext()) {
                        next = it.next();
                        g gVar = (g) kotlin.collections.b.g((PinLayer) next, this.b);
                        placesLayersInteractor$findLayerOfSelectedPin$1.L$0 = str;
                        placesLayersInteractor$findLayerOfSelectedPin$1.L$1 = null;
                        placesLayersInteractor$findLayerOfSelectedPin$1.L$2 = it;
                        placesLayersInteractor$findLayerOfSelectedPin$1.L$3 = next;
                        placesLayersInteractor$findLayerOfSelectedPin$1.L$4 = null;
                        placesLayersInteractor$findLayerOfSelectedPin$1.label = 1;
                        l = gVar.l(str, placesLayersInteractor$findLayerOfSelectedPin$1);
                        if (l == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) l).booleanValue()) {
                        }
                        if (it.hasNext()) {
                            return null;
                        }
                    }
                }
            }
        }
        placesLayersInteractor$findLayerOfSelectedPin$1 = new PlacesLayersInteractor$findLayerOfSelectedPin$1(this, continuationImpl);
        Object obj3 = placesLayersInteractor$findLayerOfSelectedPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesLayersInteractor$findLayerOfSelectedPin$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(List list, ContinuationImpl continuationImpl) {
        PlacesLayersInteractor$replaceInActiveSocialLayer$1 placesLayersInteractor$replaceInActiveSocialLayer$1;
        int i;
        PinLayer pinLayer;
        if (continuationImpl instanceof PlacesLayersInteractor$replaceInActiveSocialLayer$1) {
            placesLayersInteractor$replaceInActiveSocialLayer$1 = (PlacesLayersInteractor$replaceInActiveSocialLayer$1) continuationImpl;
            int i2 = placesLayersInteractor$replaceInActiveSocialLayer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesLayersInteractor$replaceInActiveSocialLayer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesLayersInteractor$replaceInActiveSocialLayer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesLayersInteractor$replaceInActiveSocialLayer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PinLayer a = a();
                    if (a != null && a == PinLayer.SOCIAL) {
                        Object g = kotlin.collections.b.g(a, this.b);
                        i iVar = g instanceof i ? (i) g : null;
                        if (iVar != null) {
                            placesLayersInteractor$replaceInActiveSocialLayer$1.L$0 = null;
                            placesLayersInteractor$replaceInActiveSocialLayer$1.L$1 = null;
                            placesLayersInteractor$replaceInActiveSocialLayer$1.L$2 = null;
                            placesLayersInteractor$replaceInActiveSocialLayer$1.L$3 = a;
                            placesLayersInteractor$replaceInActiveSocialLayer$1.label = 1;
                            Object A = iVar.A(list, placesLayersInteractor$replaceInActiveSocialLayer$1);
                            if (A == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = A;
                            pinLayer = a;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pinLayer = (PinLayer) placesLayersInteractor$replaceInActiveSocialLayer$1.L$3;
                kotlin.b.b(obj);
                return new Pair(pinLayer, obj);
            }
        }
        placesLayersInteractor$replaceInActiveSocialLayer$1 = new PlacesLayersInteractor$replaceInActiveSocialLayer$1(this, continuationImpl);
        Object obj2 = placesLayersInteractor$replaceInActiveSocialLayer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesLayersInteractor$replaceInActiveSocialLayer$1.label;
        if (i != 0) {
        }
        return new Pair(pinLayer, obj2);
    }

    public final g e(PinLayer pinLayer) {
        return (g) kotlin.collections.b.g(pinLayer, this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(List list, ContinuationImpl continuationImpl) {
        PlacesLayersInteractor$updateInActiveLayer$1 placesLayersInteractor$updateInActiveLayer$1;
        int i;
        PinLayer pinLayer;
        if (continuationImpl instanceof PlacesLayersInteractor$updateInActiveLayer$1) {
            placesLayersInteractor$updateInActiveLayer$1 = (PlacesLayersInteractor$updateInActiveLayer$1) continuationImpl;
            int i2 = placesLayersInteractor$updateInActiveLayer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesLayersInteractor$updateInActiveLayer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesLayersInteractor$updateInActiveLayer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesLayersInteractor$updateInActiveLayer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PinLayer a = a();
                    if (a == null) {
                        return null;
                    }
                    g gVar = (g) kotlin.collections.b.g(a, this.b);
                    placesLayersInteractor$updateInActiveLayer$1.L$0 = null;
                    placesLayersInteractor$updateInActiveLayer$1.L$1 = a;
                    placesLayersInteractor$updateInActiveLayer$1.label = 1;
                    Object v = gVar.v(list, placesLayersInteractor$updateInActiveLayer$1);
                    if (v == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = v;
                    pinLayer = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pinLayer = (PinLayer) placesLayersInteractor$updateInActiveLayer$1.L$1;
                    kotlin.b.b(obj);
                }
                return new Pair(pinLayer, (List) obj);
            }
        }
        placesLayersInteractor$updateInActiveLayer$1 = new PlacesLayersInteractor$updateInActiveLayer$1(this, continuationImpl);
        Object obj2 = placesLayersInteractor$updateInActiveLayer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesLayersInteractor$updateInActiveLayer$1.label;
        if (i != 0) {
        }
        return new Pair(pinLayer, (List) obj2);
    }
}
