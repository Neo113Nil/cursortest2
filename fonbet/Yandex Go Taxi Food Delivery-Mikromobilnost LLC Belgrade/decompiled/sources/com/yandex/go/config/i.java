package com.yandex.go.config;

import com.yandex.go.experiment.LocationSdkAndroidGoExperiment;
import defpackage.bru0;
import defpackage.bvf0;
import defpackage.dyv;
import defpackage.g7z;
import defpackage.mth;
import defpackage.ny61;
import defpackage.qcz;
import defpackage.rcz;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class i implements bru0, dyv {
    public final qcz a;
    public final rcz b;
    public final tt2 c;
    public final r0 d = bvf0.c(null);

    public i(qcz qczVar, rcz rczVar, tt2 tt2Var) {
        this.a = qczVar;
        this.b = rczVar;
        this.c = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LocationConfigProvider$awaitGoConfig$1 locationConfigProvider$awaitGoConfig$1;
        int i;
        if (continuationImpl instanceof LocationConfigProvider$awaitGoConfig$1) {
            locationConfigProvider$awaitGoConfig$1 = (LocationConfigProvider$awaitGoConfig$1) continuationImpl;
            int i2 = locationConfigProvider$awaitGoConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationConfigProvider$awaitGoConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationConfigProvider$awaitGoConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationConfigProvider$awaitGoConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = new mth(this.d, 6);
                    locationConfigProvider$awaitGoConfig$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(mthVar, locationConfigProvider$awaitGoConfig$1);
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
                return ((g7z) obj).b();
            }
        }
        locationConfigProvider$awaitGoConfig$1 = new LocationConfigProvider$awaitGoConfig$1(this, continuationImpl);
        Object obj2 = locationConfigProvider$awaitGoConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationConfigProvider$awaitGoConfig$1.label;
        if (i != 0) {
        }
        return ((g7z) obj2).b();
    }

    public final LocationSdkAndroidGoExperiment.GoConfig b() {
        g7z g7zVar = (g7z) this.d.getValue();
        if (g7zVar != null) {
            return g7zVar.b();
        }
        return null;
    }

    public final Object c(ContinuationImpl continuationImpl) {
        g7z g7zVar = (g7z) this.d.getValue();
        return g7zVar != null ? g7zVar.b() : a(continuationImpl);
    }

    public final Object d(Continuation continuation) {
        this.c.getClass();
        return tje.k0(uyj.a, new LocationConfigProvider$initialize$2(this, null), continuation);
    }
}
