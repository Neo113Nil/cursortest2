package com.yandex.go.places.impl.domain.interactors.nearby;

import com.yandex.go.address.models.PlaceType;
import defpackage.e2t;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.mth;
import defpackage.ny61;
import defpackage.uc4;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zzs;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class b {
    public final wnt a;
    public final e2t b;

    public b(wnt wntVar, e2t e2tVar) {
        this.a = wntVar;
        this.b = e2tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, PlaceType placeType, zzs zzsVar, uc4 uc4Var, ContinuationImpl continuationImpl) {
        PlacesNearbyInteractor$createBodyParams$1 placesNearbyInteractor$createBodyParams$1;
        int i2;
        if (continuationImpl instanceof PlacesNearbyInteractor$createBodyParams$1) {
            placesNearbyInteractor$createBodyParams$1 = (PlacesNearbyInteractor$createBodyParams$1) continuationImpl;
            int i3 = placesNearbyInteractor$createBodyParams$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                placesNearbyInteractor$createBodyParams$1.label = i3 - Integer.MIN_VALUE;
                Object obj = placesNearbyInteractor$createBodyParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = placesNearbyInteractor$createBodyParams$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = ((f2t) this.b).h;
                    placesNearbyInteractor$createBodyParams$1.L$0 = placeType;
                    placesNearbyInteractor$createBodyParams$1.L$1 = zzsVar;
                    placesNearbyInteractor$createBodyParams$1.L$2 = uc4Var;
                    placesNearbyInteractor$createBodyParams$1.I$0 = i;
                    placesNearbyInteractor$createBodyParams$1.label = 1;
                    obj = e.y(mthVar, placesNearbyInteractor$createBodyParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = placesNearbyInteractor$createBodyParams$1.I$0;
                    uc4Var = (uc4) placesNearbyInteractor$createBodyParams$1.L$2;
                    zzsVar = (zzs) placesNearbyInteractor$createBodyParams$1.L$1;
                    placeType = (PlaceType) placesNearbyInteractor$createBodyParams$1.L$0;
                    kotlin.b.b(obj);
                }
                zzs zzsVar2 = zzsVar;
                uc4 uc4Var2 = uc4Var;
                zzs zzsVar3 = ((g2t) obj).b.a;
                String obj2 = placeType.toString();
                Double valueOf = Double.valueOf(zzsVar3.b);
                double d = zzsVar3.a;
                return ((xnt) this.a).f(new PlacesNearbyRequestParams(new PlacesFlexGeoPoint(valueOf, Double.valueOf(d)), new PlacesFlexGeoPoint(Double.valueOf(zzsVar3.b), Double.valueOf(d)), new PlacesNearbyStateRequestParams(Integer.valueOf(i), uc4Var2, obj2.toLowerCase(Locale.ROOT), zzsVar2, "places_nearby")), PlacesNearbyRequestParams.Companion.serializer());
            }
        }
        placesNearbyInteractor$createBodyParams$1 = new PlacesNearbyInteractor$createBodyParams$1(this, continuationImpl);
        Object obj3 = placesNearbyInteractor$createBodyParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = placesNearbyInteractor$createBodyParams$1.label;
        if (i2 != 0) {
        }
        zzs zzsVar22 = zzsVar;
        uc4 uc4Var22 = uc4Var;
        zzs zzsVar32 = ((g2t) obj3).b.a;
        String obj22 = placeType.toString();
        Double valueOf2 = Double.valueOf(zzsVar32.b);
        double d2 = zzsVar32.a;
        return ((xnt) this.a).f(new PlacesNearbyRequestParams(new PlacesFlexGeoPoint(valueOf2, Double.valueOf(d2)), new PlacesFlexGeoPoint(Double.valueOf(zzsVar32.b), Double.valueOf(d2)), new PlacesNearbyStateRequestParams(Integer.valueOf(i), uc4Var22, obj22.toLowerCase(Locale.ROOT), zzsVar22, "places_nearby")), PlacesNearbyRequestParams.Companion.serializer());
    }
}
