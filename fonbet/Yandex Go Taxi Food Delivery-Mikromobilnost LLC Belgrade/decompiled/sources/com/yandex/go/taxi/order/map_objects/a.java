package com.yandex.go.taxi.order.map_objects;

import android.graphics.Bitmap;
import com.yandex.go.taxi.order.models.api.objects.MapObject;
import defpackage.ei70;
import defpackage.g6u;
import defpackage.gz70;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tz1;
import defpackage.uyj;
import defpackage.vo00;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final gz70 a;
    public final vo00 b;
    public final tz1 c;
    public final tt2 d;

    public a(gz70 gz70Var, vo00 vo00Var, tz1 tz1Var, tt2 tt2Var) {
        this.a = gz70Var;
        this.b = vo00Var;
        this.c = tz1Var;
        this.d = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MapObject mapObject, ContinuationImpl continuationImpl) {
        MapObjectToUiStateMapper$mapMapObjectToUiState$1 mapObjectToUiStateMapper$mapMapObjectToUiState$1;
        int i;
        MapObject mapObject2;
        Bitmap a;
        Float f;
        Bitmap bitmap;
        if (continuationImpl instanceof MapObjectToUiStateMapper$mapMapObjectToUiState$1) {
            mapObjectToUiStateMapper$mapMapObjectToUiState$1 = (MapObjectToUiStateMapper$mapMapObjectToUiState$1) continuationImpl;
            int i2 = mapObjectToUiStateMapper$mapMapObjectToUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectToUiStateMapper$mapMapObjectToUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectToUiStateMapper$mapMapObjectToUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectToUiStateMapper$mapMapObjectToUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (mapObject.d.b == MapObject.AlignType.TOP) {
                        this.b.getClass();
                        a = this.c.a(vo00.a(mapObject));
                        mapObject2 = mapObject;
                        f = (Float) kotlin.collections.a.R(mapObject2.e);
                        if (f != null) {
                            float floatValue = f.floatValue();
                            Float f2 = (Float) kotlin.collections.a.b0(mapObject2.e);
                            if (f2 != null) {
                                float floatValue2 = f2.floatValue();
                                String str = mapObject2.a;
                                zzs zzsVar = mapObject2.c;
                                return new ei70(str, new zzs(zzsVar.a, zzsVar.b, 0, null, null, 28), floatValue, floatValue2, mapObject2.d.b, a);
                            }
                        }
                        return null;
                    }
                    this.d.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    MapObjectToUiStateMapper$mapMapObjectToUiState$bubbleBitmap$1 mapObjectToUiStateMapper$mapMapObjectToUiState$bubbleBitmap$1 = new MapObjectToUiStateMapper$mapMapObjectToUiState$bubbleBitmap$1(this, mapObject, null);
                    mapObjectToUiStateMapper$mapMapObjectToUiState$1.L$0 = mapObject;
                    mapObjectToUiStateMapper$mapMapObjectToUiState$1.label = 1;
                    obj = tje.k0(g6uVar, mapObjectToUiStateMapper$mapMapObjectToUiState$bubbleBitmap$1, mapObjectToUiStateMapper$mapMapObjectToUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mapObject2 = mapObject;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mapObject2 = (MapObject) mapObjectToUiStateMapper$mapMapObjectToUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    a = bitmap;
                    f = (Float) kotlin.collections.a.R(mapObject2.e);
                    if (f != null) {
                    }
                }
                return null;
            }
        }
        mapObjectToUiStateMapper$mapMapObjectToUiState$1 = new MapObjectToUiStateMapper$mapMapObjectToUiState$1(this, continuationImpl);
        Object obj2 = mapObjectToUiStateMapper$mapMapObjectToUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectToUiStateMapper$mapMapObjectToUiState$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return null;
    }
}
