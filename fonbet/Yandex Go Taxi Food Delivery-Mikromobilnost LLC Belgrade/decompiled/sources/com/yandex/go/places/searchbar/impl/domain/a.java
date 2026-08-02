package com.yandex.go.places.searchbar.impl.domain;

import com.yandex.go.places.searchbar.impl.experiments.c;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.edc;
import defpackage.fr;
import defpackage.iec0;
import defpackage.lec0;
import defpackage.m76;
import defpackage.mec0;
import defpackage.nec0;
import defpackage.ny61;
import defpackage.v66;
import defpackage.w66;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final c a;
    public final w66 b;
    public iec0 c;
    public v66 d;

    public a(c cVar, w66 w66Var) {
        this.a = cVar;
        this.b = w66Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, fr frVar, boolean z, ContinuationImpl continuationImpl) {
        PlacesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1 placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1;
        int i;
        a aVar;
        iec0 iec0Var;
        if (continuationImpl instanceof PlacesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1) {
            placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1 = (PlacesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1) continuationImpl;
            int i2 = placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.label;
                if (i != 0) {
                    b.b(obj);
                    placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.L$0 = null;
                    placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.L$1 = frVar;
                    placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.L$2 = this;
                    placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.Z$0 = z;
                    placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.label = 1;
                    obj = this.a.a(str, frVar, placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.Z$0;
                    aVar = (a) placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.L$2;
                    frVar = (fr) placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.L$1;
                    b.b(obj);
                }
                aVar.c = (iec0) obj;
                iec0Var = this.c;
                if (iec0Var != null || !iec0Var.g) {
                    return lec0.a;
                }
                if (!z || frVar == null) {
                    return mec0.a;
                }
                v66 v66Var = this.d;
                if (v66Var == null) {
                    v66Var = w66.a(this.b, null, iec0Var.f, new m76(new edc(-1, ModalContentViewContainer.BASE_SHADOW_COLOR), 1), new m76(null, 7), 5);
                    this.d = v66Var;
                }
                return new nec0(v66Var);
            }
        }
        placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1 = new PlacesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1(this, continuationImpl);
        Object obj2 = placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesSearchbarConfigurationRepositoryImpl$getSearchbarMode$1.label;
        if (i != 0) {
        }
        aVar.c = (iec0) obj2;
        iec0Var = this.c;
        if (iec0Var != null) {
        }
        return lec0.a;
    }
}
