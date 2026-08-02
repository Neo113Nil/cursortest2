package com.yandex.go.places.impl.ui.nearby.flex;

import com.yandex.go.address.models.PlaceType;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.k8c0;
import defpackage.ny61;
import defpackage.tj50;
import defpackage.uc4;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c implements k8c0 {
    public final /* synthetic */ tj50 a;
    public final /* synthetic */ PlaceType b;
    public final /* synthetic */ zzs c;

    public c(tj50 tj50Var, PlaceType placeType, zzs zzsVar) {
        this.a = tj50Var;
        this.b = placeType;
        this.c = zzsVar;
    }

    @Override // defpackage.k8c0
    public final Object a() {
        return kotlin.collections.b.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.k8c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        NearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1 nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1;
        int i;
        com.yandex.go.places.impl.domain.interactors.nearby.b bVar;
        PlaceType placeType;
        zzs zzsVar;
        int i2;
        tj50 tj50Var = this.a;
        ah00 ah00Var = tj50Var.J;
        if (continuationImpl instanceof NearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1) {
            nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1 = (NearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1) continuationImpl;
            int i3 = nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1.label = i3 - Integer.MIN_VALUE;
                NearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1 nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12 = nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1;
                Object obj = nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bVar = tj50Var.E;
                    int j = (int) ((gh00) ah00Var).j();
                    Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                    nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.L$0 = bVar;
                    PlaceType placeType2 = this.b;
                    nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.L$1 = placeType2;
                    zzs zzsVar2 = this.c;
                    nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.L$2 = zzsVar2;
                    nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.I$0 = j;
                    nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.label = 1;
                    Object K = ru.yandex.taxi.map.utils.a.K(ah00Var, nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12);
                    if (K != coroutineSingletons) {
                        placeType = placeType2;
                        zzsVar = zzsVar2;
                        i2 = j;
                        obj = K;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.I$0;
                zzsVar = (zzs) nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.L$2;
                PlaceType placeType3 = (PlaceType) nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.L$1;
                bVar = (com.yandex.go.places.impl.domain.interactors.nearby.b) nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.L$0;
                kotlin.b.b(obj);
                placeType = placeType3;
                nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.L$0 = null;
                nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.L$1 = null;
                nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.L$2 = null;
                nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12.label = 2;
                Object a = bVar.a(i2, placeType, zzsVar, (uc4) obj, nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$12);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1 = new NearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1(this, continuationImpl);
        NearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1 nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$122 = nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1;
        Object obj2 = nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$122.label;
        if (i != 0) {
        }
        nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$122.L$0 = null;
        nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$122.L$1 = null;
        nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$122.L$2 = null;
        nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$122.label = 2;
        Object a2 = bVar.a(i2, placeType, zzsVar, (uc4) obj2, nearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$122);
        if (a2 != coroutineSingletons2) {
        }
    }
}
