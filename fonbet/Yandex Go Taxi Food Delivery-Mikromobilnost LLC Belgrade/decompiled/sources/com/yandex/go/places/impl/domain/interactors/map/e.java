package com.yandex.go.places.impl.domain.interactors.map;

import defpackage.e2t;
import defpackage.f2t;
import defpackage.fg5;
import defpackage.g2t;
import defpackage.lg80;
import defpackage.mdh;
import defpackage.mth;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uc4;
import defpackage.uyj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class e {
    public final com.yandex.go.places.impl.data.repositories.map.layer.a a;
    public final e2t b;
    public final tt2 c;
    public final fg5 d;

    public e(com.yandex.go.places.impl.data.repositories.map.layer.a aVar, e2t e2tVar, tt2 tt2Var, fg5 fg5Var) {
        this.a = aVar;
        this.b = e2tVar;
        this.c = tt2Var;
        this.d = fg5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, ContinuationImpl continuationImpl) {
        PlacesOrganizationsLayerInteractor$getCurrentGetPoint$1 placesOrganizationsLayerInteractor$getCurrentGetPoint$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof PlacesOrganizationsLayerInteractor$getCurrentGetPoint$1) {
            placesOrganizationsLayerInteractor$getCurrentGetPoint$1 = (PlacesOrganizationsLayerInteractor$getCurrentGetPoint$1) continuationImpl;
            int i2 = placesOrganizationsLayerInteractor$getCurrentGetPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesOrganizationsLayerInteractor$getCurrentGetPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesOrganizationsLayerInteractor$getCurrentGetPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesOrganizationsLayerInteractor$getCurrentGetPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = ((f2t) eVar.b).h;
                    placesOrganizationsLayerInteractor$getCurrentGetPoint$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(mthVar, placesOrganizationsLayerInteractor$getCurrentGetPoint$1);
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
                return ((g2t) obj).b.a;
            }
        }
        placesOrganizationsLayerInteractor$getCurrentGetPoint$1 = new PlacesOrganizationsLayerInteractor$getCurrentGetPoint$1(eVar, continuationImpl);
        Object obj2 = placesOrganizationsLayerInteractor$getCurrentGetPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesOrganizationsLayerInteractor$getCurrentGetPoint$1.label;
        if (i != 0) {
        }
        return ((g2t) obj2).b.a;
    }

    public final Object b(uc4 uc4Var, Float f, boolean z, lg80 lg80Var, String str, ContinuationImpl continuationImpl) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PlacesOrganizationsLayerInteractor$loadLayer$2(this, null, uc4Var, f, z, lg80Var, str, null), continuationImpl);
    }
}
