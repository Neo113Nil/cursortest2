package com.yandex.go.sdk.source_providers;

import android.location.Location;
import defpackage.c7z;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.udq0;
import defpackage.zbz;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class n implements zbz {
    public final h3y a;
    public final c7z b;
    public final String c;

    public n(h3y h3yVar, c7z c7zVar, String str) {
        this.a = h3yVar;
        this.b = c7zVar;
        this.c = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:17)(2:14|15)))|29|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        r5 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.zbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        MapkitLocationProvider$getLastKnownLocation$1 mapkitLocationProvider$getLastKnownLocation$1;
        int i;
        Object failure;
        if (continuation instanceof MapkitLocationProvider$getLastKnownLocation$1) {
            mapkitLocationProvider$getLastKnownLocation$1 = (MapkitLocationProvider$getLastKnownLocation$1) continuation;
            int i2 = mapkitLocationProvider$getLastKnownLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapkitLocationProvider$getLastKnownLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapkitLocationProvider$getLastKnownLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapkitLocationProvider$getLastKnownLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.preorder.source.userposition.repository.f fVar = (ru.yandex.taxi.preorder.source.userposition.repository.f) this.a.get();
                    mapkitLocationProvider$getLastKnownLocation$1.label = 1;
                    obj = fVar.b(mapkitLocationProvider$getLastKnownLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                failure = udq0.S((Location) obj, this.b, this.c);
                if (failure instanceof Result.Failure) {
                    return failure;
                }
                return null;
            }
        }
        mapkitLocationProvider$getLastKnownLocation$1 = new MapkitLocationProvider$getLastKnownLocation$1(this, (ContinuationImpl) continuation);
        Object obj2 = mapkitLocationProvider$getLastKnownLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapkitLocationProvider$getLastKnownLocation$1.label;
        if (i != 0) {
        }
        failure = udq0.S((Location) obj2, this.b, this.c);
        if (failure instanceof Result.Failure) {
        }
    }

    @Override // defpackage.zbz
    public final tpr b(Object obj) {
        return new rol0(new MapkitLocationProvider$requestLocationUpdates$1(this, null));
    }
}
