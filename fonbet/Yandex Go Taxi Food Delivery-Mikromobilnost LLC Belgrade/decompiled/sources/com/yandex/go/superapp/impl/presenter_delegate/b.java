package com.yandex.go.superapp.impl.presenter_delegate;

import com.yandex.go.coroutines.h;
import defpackage.f0t;
import defpackage.gvq0;
import defpackage.l0t;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.eatskit.dto.GeoPointSource;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(f0t f0tVar, Continuation continuation) {
        ExternalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1 externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1;
        Object obj;
        int i;
        ru.yandex.taxi.eatskit.c cVar;
        if (continuation instanceof ExternalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1) {
            externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1 = (ExternalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1) continuation;
            int i2 = externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                obj = externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.label;
                c cVar2 = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = cVar2.g;
                    externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.L$0 = f0tVar;
                    externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.label = 1;
                    obj = hVar.a(externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cVar = (ru.yandex.taxi.eatskit.c) externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.L$1;
                        kotlin.b.b(obj);
                        cVar.u.g("setContext", (gvq0) obj);
                        return zy11.a;
                    }
                    f0tVar = (f0t) externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    cVar2.d.u.g("setGeoPoint", new l0t(f0tVar, GeoPointSource.FROM_GEO));
                    return zy11.a;
                }
                ru.yandex.taxi.eatskit.c cVar3 = cVar2.d;
                com.yandex.go.superapp.impl.interactor.c cVar4 = cVar2.c;
                externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.L$0 = null;
                externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.L$1 = cVar3;
                externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.label = 2;
                Object b = cVar4.b(f0tVar, externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1);
                if (b != coroutineSingletons) {
                    obj = b;
                    cVar = cVar3;
                    cVar.u.g("setContext", (gvq0) obj);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1 = new ExternalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1(this, continuation);
        obj = externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServiceGeoPositionDelegateImpl$collectGeoPosition$1$1$emit$1.label;
        c cVar22 = this.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
