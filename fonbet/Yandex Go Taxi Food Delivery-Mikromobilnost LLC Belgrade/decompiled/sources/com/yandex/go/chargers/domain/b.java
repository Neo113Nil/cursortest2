package com.yandex.go.chargers.domain;

import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final ah00 a;
    public final po21 b;

    public b(ah00 ah00Var, po21 po21Var) {
        this.a = ah00Var;
        this.b = po21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ChargersCenterOnGeoInteractor$centerOnGeo$1 chargersCenterOnGeoInteractor$centerOnGeo$1;
        int i;
        if (continuationImpl instanceof ChargersCenterOnGeoInteractor$centerOnGeo$1) {
            chargersCenterOnGeoInteractor$centerOnGeo$1 = (ChargersCenterOnGeoInteractor$centerOnGeo$1) continuationImpl;
            int i2 = chargersCenterOnGeoInteractor$centerOnGeo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersCenterOnGeoInteractor$centerOnGeo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersCenterOnGeoInteractor$centerOnGeo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersCenterOnGeoInteractor$centerOnGeo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersCenterOnGeoInteractor$centerOnGeo$1.L$0 = null;
                    chargersCenterOnGeoInteractor$centerOnGeo$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(chargersCenterOnGeoInteractor$centerOnGeo$1);
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
                mo21 mo21Var = (mo21) obj;
                ((gh00) this.a).D(new Point(mo21Var.a, mo21Var.b), 17.0f, 300.0f, null);
                return zy11.a;
            }
        }
        chargersCenterOnGeoInteractor$centerOnGeo$1 = new ChargersCenterOnGeoInteractor$centerOnGeo$1(this, continuationImpl);
        Object obj2 = chargersCenterOnGeoInteractor$centerOnGeo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersCenterOnGeoInteractor$centerOnGeo$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        ((gh00) this.a).D(new Point(mo21Var2.a, mo21Var2.b), 17.0f, 300.0f, null);
        return zy11.a;
    }
}
