package com.yandex.go.places.searchbar.impl.experiments;

import com.yandex.go.places.searchbar.impl.experiments.PlacesSearchbarExperiment;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.fr;
import defpackage.hec0;
import defpackage.i3y;
import defpackage.iec0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.t9b0;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final rqo a;
    public final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new t9b0(25, this));

    public c(rqo rqoVar) {
        this.a = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, fr frVar, ContinuationImpl continuationImpl) {
        PlacesSearchbarExperimentRepository$getSearchbarConfig$1 placesSearchbarExperimentRepository$getSearchbarConfig$1;
        int i;
        if (continuationImpl instanceof PlacesSearchbarExperimentRepository$getSearchbarConfig$1) {
            placesSearchbarExperimentRepository$getSearchbarConfig$1 = (PlacesSearchbarExperimentRepository$getSearchbarConfig$1) continuationImpl;
            int i2 = placesSearchbarExperimentRepository$getSearchbarConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesSearchbarExperimentRepository$getSearchbarConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesSearchbarExperimentRepository$getSearchbarConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesSearchbarExperimentRepository$getSearchbarConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.b.getValue();
                    placesSearchbarExperimentRepository$getSearchbarConfig$1.L$0 = str;
                    placesSearchbarExperimentRepository$getSearchbarConfig$1.L$1 = frVar;
                    placesSearchbarExperimentRepository$getSearchbarConfig$1.label = 1;
                    obj = t1b0Var.b(placesSearchbarExperimentRepository$getSearchbarConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    frVar = (fr) placesSearchbarExperimentRepository$getSearchbarConfig$1.L$1;
                    str = (String) placesSearchbarExperimentRepository$getSearchbarConfig$1.L$0;
                    kotlin.b.b(obj);
                }
                String str2 = str;
                fr frVar2 = frVar;
                PlacesSearchbarExperiment placesSearchbarExperiment = (PlacesSearchbarExperiment) obj;
                String str3 = placesSearchbarExperiment.d;
                PlacesSearchbarExperiment.Button button = placesSearchbarExperiment.e;
                return new iec0(str2, frVar2, str3, evu0.J(button.a) ? null : new hec0(button.a, d6z.Y(placesSearchbarExperiment, button.b), frVar2), placesSearchbarExperiment.f, placesSearchbarExperiment.g, placesSearchbarExperiment.b);
            }
        }
        placesSearchbarExperimentRepository$getSearchbarConfig$1 = new PlacesSearchbarExperimentRepository$getSearchbarConfig$1(this, continuationImpl);
        Object obj2 = placesSearchbarExperimentRepository$getSearchbarConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesSearchbarExperimentRepository$getSearchbarConfig$1.label;
        if (i != 0) {
        }
        String str22 = str;
        fr frVar22 = frVar;
        PlacesSearchbarExperiment placesSearchbarExperiment2 = (PlacesSearchbarExperiment) obj2;
        String str32 = placesSearchbarExperiment2.d;
        PlacesSearchbarExperiment.Button button2 = placesSearchbarExperiment2.e;
        return new iec0(str22, frVar22, str32, evu0.J(button2.a) ? null : new hec0(button2.a, d6z.Y(placesSearchbarExperiment2, button2.b), frVar22), placesSearchbarExperiment2.f, placesSearchbarExperiment2.g, placesSearchbarExperiment2.b);
    }
}
