package com.yandex.go.places.flex.container.domain.interactors;

import defpackage.k8c0;
import defpackage.ny61;
import defpackage.o8c0;
import defpackage.u1m;
import defpackage.vr;
import defpackage.y7c0;
import defpackage.zy11;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final flex.engine.a a;
    public final y7c0 b;
    public final vr c;
    public final k8c0 d;
    public String e;

    public a(flex.engine.a aVar, y7c0 y7c0Var, vr vrVar, k8c0 k8c0Var) {
        this.a = aVar;
        this.b = y7c0Var;
        this.c = vrVar;
        this.d = k8c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlacesFlexContainerScreenInteractor$loadDocument$1 placesFlexContainerScreenInteractor$loadDocument$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        Object b;
        Map map;
        String str2;
        if (continuationImpl instanceof PlacesFlexContainerScreenInteractor$loadDocument$1) {
            placesFlexContainerScreenInteractor$loadDocument$1 = (PlacesFlexContainerScreenInteractor$loadDocument$1) continuationImpl;
            int i2 = placesFlexContainerScreenInteractor$loadDocument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesFlexContainerScreenInteractor$loadDocument$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesFlexContainerScreenInteractor$loadDocument$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesFlexContainerScreenInteractor$loadDocument$1.label;
                k8c0 k8c0Var = this.d;
                y7c0 y7c0Var = this.b;
                if (i != 0) {
                    b.b(obj);
                    this.e = y7c0Var.a();
                    String path = y7c0Var.getPath();
                    placesFlexContainerScreenInteractor$loadDocument$1.L$0 = path;
                    placesFlexContainerScreenInteractor$loadDocument$1.label = 1;
                    Object a = k8c0Var.a();
                    if (a != coroutineSingletons) {
                        str = path;
                        obj = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) placesFlexContainerScreenInteractor$loadDocument$1.L$1;
                    str2 = (String) placesFlexContainerScreenInteractor$loadDocument$1.L$0;
                    b.b(obj);
                    this.a.p(new u1m(map, str2, (Map) obj), this.c.c(y7c0Var.a()), true);
                    return zy11.a;
                }
                str = (String) placesFlexContainerScreenInteractor$loadDocument$1.L$0;
                b.b(obj);
                Map map2 = (Map) obj;
                placesFlexContainerScreenInteractor$loadDocument$1.L$0 = str;
                placesFlexContainerScreenInteractor$loadDocument$1.L$1 = map2;
                placesFlexContainerScreenInteractor$loadDocument$1.label = 2;
                b = k8c0Var.b(placesFlexContainerScreenInteractor$loadDocument$1);
                if (b != coroutineSingletons) {
                    map = map2;
                    obj = b;
                    str2 = str;
                    this.a.p(new u1m(map, str2, (Map) obj), this.c.c(y7c0Var.a()), true);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        placesFlexContainerScreenInteractor$loadDocument$1 = new PlacesFlexContainerScreenInteractor$loadDocument$1(this, continuationImpl);
        Object obj2 = placesFlexContainerScreenInteractor$loadDocument$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesFlexContainerScreenInteractor$loadDocument$1.label;
        k8c0 k8c0Var2 = this.d;
        y7c0 y7c0Var2 = this.b;
        if (i != 0) {
        }
        Map map22 = (Map) obj2;
        placesFlexContainerScreenInteractor$loadDocument$1.L$0 = str;
        placesFlexContainerScreenInteractor$loadDocument$1.L$1 = map22;
        placesFlexContainerScreenInteractor$loadDocument$1.label = 2;
        b = k8c0Var2.b(placesFlexContainerScreenInteractor$loadDocument$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(o8c0 o8c0Var, k8c0 k8c0Var, ContinuationImpl continuationImpl) {
        PlacesFlexContainerScreenInteractor$loadDocumentByPath$1 placesFlexContainerScreenInteractor$loadDocumentByPath$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        k8c0 k8c0Var2;
        String str;
        o8c0 o8c0Var2;
        Map map;
        if (continuationImpl instanceof PlacesFlexContainerScreenInteractor$loadDocumentByPath$1) {
            placesFlexContainerScreenInteractor$loadDocumentByPath$1 = (PlacesFlexContainerScreenInteractor$loadDocumentByPath$1) continuationImpl;
            int i2 = placesFlexContainerScreenInteractor$loadDocumentByPath$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesFlexContainerScreenInteractor$loadDocumentByPath$1.label = i2 - Integer.MIN_VALUE;
                obj = placesFlexContainerScreenInteractor$loadDocumentByPath$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesFlexContainerScreenInteractor$loadDocumentByPath$1.label;
                if (i != 0) {
                    b.b(obj);
                    this.e = o8c0Var.b;
                    String str2 = o8c0Var.a;
                    placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$0 = o8c0Var;
                    placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$1 = k8c0Var;
                    placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$2 = str2;
                    placesFlexContainerScreenInteractor$loadDocumentByPath$1.label = 1;
                    a = k8c0Var.a();
                    if (a != coroutineSingletons) {
                        k8c0Var2 = k8c0Var;
                        str = str2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$3;
                    str = (String) placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$2;
                    o8c0Var2 = (o8c0) placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$0;
                    b.b(obj);
                    this.a.p(new u1m(map, str, (Map) obj), this.c.c(o8c0Var2.b), true);
                    return zy11.a;
                }
                String str3 = (String) placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$2;
                k8c0 k8c0Var3 = (k8c0) placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$1;
                o8c0 o8c0Var3 = (o8c0) placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$0;
                b.b(obj);
                str = str3;
                o8c0Var = o8c0Var3;
                a = obj;
                k8c0Var2 = k8c0Var3;
                Map map2 = (Map) a;
                placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$0 = o8c0Var;
                placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$1 = null;
                placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$2 = str;
                placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$3 = map2;
                placesFlexContainerScreenInteractor$loadDocumentByPath$1.label = 2;
                obj = k8c0Var2.b(placesFlexContainerScreenInteractor$loadDocumentByPath$1);
                if (obj != coroutineSingletons) {
                    o8c0Var2 = o8c0Var;
                    map = map2;
                    this.a.p(new u1m(map, str, (Map) obj), this.c.c(o8c0Var2.b), true);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        placesFlexContainerScreenInteractor$loadDocumentByPath$1 = new PlacesFlexContainerScreenInteractor$loadDocumentByPath$1(this, continuationImpl);
        obj = placesFlexContainerScreenInteractor$loadDocumentByPath$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesFlexContainerScreenInteractor$loadDocumentByPath$1.label;
        if (i != 0) {
        }
        Map map22 = (Map) a;
        placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$0 = o8c0Var;
        placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$1 = null;
        placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$2 = str;
        placesFlexContainerScreenInteractor$loadDocumentByPath$1.L$3 = map22;
        placesFlexContainerScreenInteractor$loadDocumentByPath$1.label = 2;
        obj = k8c0Var2.b(placesFlexContainerScreenInteractor$loadDocumentByPath$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
