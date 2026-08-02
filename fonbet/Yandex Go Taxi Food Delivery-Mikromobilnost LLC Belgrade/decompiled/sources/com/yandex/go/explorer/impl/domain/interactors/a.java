package com.yandex.go.explorer.impl.domain.interactors;

import com.yandex.mapkit.geometry.Point;
import defpackage.ny61;
import defpackage.rto;
import defpackage.tuo;
import defpackage.uc4;
import defpackage.vuo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.explorer.impl.data.repositories.b a;
    public final rto b;

    public a(com.yandex.go.explorer.impl.data.repositories.b bVar, rto rtoVar) {
        this.a = bVar;
        this.b = rtoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uc4 uc4Var, float f, Point point, ContinuationImpl continuationImpl) {
        ExplorerDistrictLayerInteractor$loadLayer$1 explorerDistrictLayerInteractor$loadLayer$1;
        int i;
        tuo tuoVar;
        if (continuationImpl instanceof ExplorerDistrictLayerInteractor$loadLayer$1) {
            explorerDistrictLayerInteractor$loadLayer$1 = (ExplorerDistrictLayerInteractor$loadLayer$1) continuationImpl;
            int i2 = explorerDistrictLayerInteractor$loadLayer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerDistrictLayerInteractor$loadLayer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = explorerDistrictLayerInteractor$loadLayer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerDistrictLayerInteractor$loadLayer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    explorerDistrictLayerInteractor$loadLayer$1.L$0 = null;
                    explorerDistrictLayerInteractor$loadLayer$1.L$1 = null;
                    explorerDistrictLayerInteractor$loadLayer$1.F$0 = f;
                    explorerDistrictLayerInteractor$loadLayer$1.label = 1;
                    obj = this.a.a(uc4Var, f, point, explorerDistrictLayerInteractor$loadLayer$1);
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
                vuo vuoVar = (vuo) obj;
                tuoVar = !(vuoVar instanceof tuo) ? (tuo) vuoVar : null;
                if (tuoVar == null) {
                    return tuoVar.a;
                }
                return null;
            }
        }
        explorerDistrictLayerInteractor$loadLayer$1 = new ExplorerDistrictLayerInteractor$loadLayer$1(this, continuationImpl);
        Object obj2 = explorerDistrictLayerInteractor$loadLayer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerDistrictLayerInteractor$loadLayer$1.label;
        if (i != 0) {
        }
        vuo vuoVar2 = (vuo) obj2;
        if (!(vuoVar2 instanceof tuo)) {
        }
        if (tuoVar == null) {
        }
    }
}
