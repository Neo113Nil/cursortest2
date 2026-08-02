package com.yandex.go.places.impl.domain.interactors.main;

import defpackage.e2t;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.k8c0;
import defpackage.ksw;
import defpackage.mth;
import defpackage.ny61;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c implements k8c0 {
    public final wnt a;
    public final e2t b;

    public c(wnt wntVar, e2t e2tVar) {
        this.a = wntVar;
        this.b = e2tVar;
    }

    @Override // defpackage.k8c0
    public final Object a() {
        return kotlin.collections.b.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.k8c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PlacesMainScreenInteractor$createBodyParams$1 placesMainScreenInteractor$createBodyParams$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object y;
        ksw kswVar;
        String str;
        if (continuationImpl instanceof PlacesMainScreenInteractor$createBodyParams$1) {
            placesMainScreenInteractor$createBodyParams$1 = (PlacesMainScreenInteractor$createBodyParams$1) continuationImpl;
            int i2 = placesMainScreenInteractor$createBodyParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMainScreenInteractor$createBodyParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMainScreenInteractor$createBodyParams$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMainScreenInteractor$createBodyParams$1.label;
                String str2 = null;
                e2t e2tVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = ((f2t) e2tVar).h;
                    placesMainScreenInteractor$createBodyParams$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(mthVar, placesMainScreenInteractor$createBodyParams$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kswVar = (ksw) placesMainScreenInteractor$createBodyParams$1.L$0;
                        kotlin.b.b(obj);
                        zzs zzsVar = ((g2t) obj).b.a;
                        if (kswVar == null && (str = kswVar.g) != null) {
                            str2 = str;
                        } else if (kswVar != null) {
                            str2 = kswVar.f;
                        }
                        PlacesMainScreenDataRequestParams placesMainScreenDataRequestParams = new PlacesMainScreenDataRequestParams(str2);
                        PlacesMainScreenStateRequestParams placesMainScreenStateRequestParams = new PlacesMainScreenStateRequestParams(zzsVar);
                        Double valueOf = Double.valueOf(zzsVar.b);
                        double d = zzsVar.a;
                        return ((xnt) this.a).f(new PlacesMainScreenRequestParams(placesMainScreenDataRequestParams, placesMainScreenStateRequestParams, new PlacesFlexGeoPoint(valueOf, Double.valueOf(d)), new PlacesFlexGeoPoint(Double.valueOf(zzsVar.b), Double.valueOf(d))), PlacesMainScreenRequestParams.Companion.serializer());
                    }
                    kotlin.b.b(obj);
                }
                List list = ((g2t) obj).a.a.c;
                ksw kswVar2 = list == null ? (ksw) kotlin.collections.a.R(list) : null;
                mth mthVar2 = ((f2t) e2tVar).h;
                placesMainScreenInteractor$createBodyParams$1.L$0 = kswVar2;
                placesMainScreenInteractor$createBodyParams$1.label = 2;
                y = kotlinx.coroutines.flow.e.y(mthVar2, placesMainScreenInteractor$createBodyParams$1);
                if (y != coroutineSingletons) {
                    kswVar = kswVar2;
                    obj = y;
                    zzs zzsVar2 = ((g2t) obj).b.a;
                    if (kswVar == null) {
                    }
                    if (kswVar != null) {
                    }
                    PlacesMainScreenDataRequestParams placesMainScreenDataRequestParams2 = new PlacesMainScreenDataRequestParams(str2);
                    PlacesMainScreenStateRequestParams placesMainScreenStateRequestParams2 = new PlacesMainScreenStateRequestParams(zzsVar2);
                    Double valueOf2 = Double.valueOf(zzsVar2.b);
                    double d2 = zzsVar2.a;
                    return ((xnt) this.a).f(new PlacesMainScreenRequestParams(placesMainScreenDataRequestParams2, placesMainScreenStateRequestParams2, new PlacesFlexGeoPoint(valueOf2, Double.valueOf(d2)), new PlacesFlexGeoPoint(Double.valueOf(zzsVar2.b), Double.valueOf(d2))), PlacesMainScreenRequestParams.Companion.serializer());
                }
                return coroutineSingletons;
            }
        }
        placesMainScreenInteractor$createBodyParams$1 = new PlacesMainScreenInteractor$createBodyParams$1(this, continuationImpl);
        Object obj2 = placesMainScreenInteractor$createBodyParams$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMainScreenInteractor$createBodyParams$1.label;
        String str22 = null;
        e2t e2tVar2 = this.b;
        if (i != 0) {
        }
        List list2 = ((g2t) obj2).a.a.c;
        if (list2 == null) {
        }
        mth mthVar22 = ((f2t) e2tVar2).h;
        placesMainScreenInteractor$createBodyParams$1.L$0 = kswVar2;
        placesMainScreenInteractor$createBodyParams$1.label = 2;
        y = kotlinx.coroutines.flow.e.y(mthVar22, placesMainScreenInteractor$createBodyParams$1);
        if (y != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
