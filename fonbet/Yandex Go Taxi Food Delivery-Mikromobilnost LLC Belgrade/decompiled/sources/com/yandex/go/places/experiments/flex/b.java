package com.yandex.go.places.experiments.flex;

import defpackage.evu0;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.p9c0;
import defpackage.q9c0;
import defpackage.r9c0;
import defpackage.rqo;
import defpackage.s7c0;
import defpackage.s9c0;
import defpackage.t1b0;
import defpackage.t9c0;
import defpackage.u3m;
import defpackage.y9c0;
import defpackage.z9c0;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final t1b0 a;

    public b(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(PlacesClientFlexScreensExperimentDto.e);
    }

    public static u3m d(PlacesFlexScreenDto placesFlexScreenDto) {
        String str = placesFlexScreenDto.a;
        return new u3m(jl40.l(str, "catalog") ? p9c0.b : jl40.l(str, "details_card") ? s9c0.b : jl40.l(str, "details_card_v2") ? t9c0.b : jl40.l(str, "main") ? r9c0.b : str == null ? y9c0.b : new q9c0(str), placesFlexScreenDto.b, placesFlexScreenDto.c, placesFlexScreenDto.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlacesClientFlexScreensExperimentRepository$getMainScreenConfig$1 placesClientFlexScreensExperimentRepository$getMainScreenConfig$1;
        int i;
        Iterator it;
        Object obj;
        PlacesFlexScreenDto placesFlexScreenDto;
        if (continuationImpl instanceof PlacesClientFlexScreensExperimentRepository$getMainScreenConfig$1) {
            placesClientFlexScreensExperimentRepository$getMainScreenConfig$1 = (PlacesClientFlexScreensExperimentRepository$getMainScreenConfig$1) continuationImpl;
            int i2 = placesClientFlexScreensExperimentRepository$getMainScreenConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesClientFlexScreensExperimentRepository$getMainScreenConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = placesClientFlexScreensExperimentRepository$getMainScreenConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesClientFlexScreensExperimentRepository$getMainScreenConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    placesClientFlexScreensExperimentRepository$getMainScreenConfig$1.label = 1;
                    obj2 = this.a.b(placesClientFlexScreensExperimentRepository$getMainScreenConfig$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                PlacesClientFlexScreensExperimentDto placesClientFlexScreensExperimentDto = (PlacesClientFlexScreensExperimentDto) obj2;
                it = placesClientFlexScreensExperimentDto.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((PlacesFlexScreenDto) obj).a, "main")) {
                        break;
                    }
                }
                placesFlexScreenDto = (PlacesFlexScreenDto) obj;
                if (placesFlexScreenDto != null || !placesClientFlexScreensExperimentDto.b) {
                    return null;
                }
                String str = placesFlexScreenDto.d;
                return new s7c0(placesFlexScreenDto.b, evu0.J(str) ? null : str, 1);
            }
        }
        placesClientFlexScreensExperimentRepository$getMainScreenConfig$1 = new PlacesClientFlexScreensExperimentRepository$getMainScreenConfig$1(this, continuationImpl);
        Object obj22 = placesClientFlexScreensExperimentRepository$getMainScreenConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesClientFlexScreensExperimentRepository$getMainScreenConfig$1.label;
        if (i != 0) {
        }
        PlacesClientFlexScreensExperimentDto placesClientFlexScreensExperimentDto2 = (PlacesClientFlexScreensExperimentDto) obj22;
        it = placesClientFlexScreensExperimentDto2.c.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        placesFlexScreenDto = (PlacesFlexScreenDto) obj;
        if (placesFlexScreenDto != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(z9c0 z9c0Var, ContinuationImpl continuationImpl) {
        PlacesClientFlexScreensExperimentRepository$screen$4 placesClientFlexScreensExperimentRepository$screen$4;
        int i;
        Iterator it;
        Object obj;
        PlacesFlexScreenDto placesFlexScreenDto;
        if (continuationImpl instanceof PlacesClientFlexScreensExperimentRepository$screen$4) {
            placesClientFlexScreensExperimentRepository$screen$4 = (PlacesClientFlexScreensExperimentRepository$screen$4) continuationImpl;
            int i2 = placesClientFlexScreensExperimentRepository$screen$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesClientFlexScreensExperimentRepository$screen$4.label = i2 - Integer.MIN_VALUE;
                Object obj2 = placesClientFlexScreensExperimentRepository$screen$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesClientFlexScreensExperimentRepository$screen$4.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    placesClientFlexScreensExperimentRepository$screen$4.L$0 = z9c0Var;
                    placesClientFlexScreensExperimentRepository$screen$4.label = 1;
                    obj2 = this.a.b(placesClientFlexScreensExperimentRepository$screen$4);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z9c0Var = (z9c0) placesClientFlexScreensExperimentRepository$screen$4.L$0;
                    kotlin.b.b(obj2);
                }
                it = ((PlacesClientFlexScreensExperimentDto) obj2).c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((PlacesFlexScreenDto) obj).a, z9c0Var.a())) {
                        break;
                    }
                }
                placesFlexScreenDto = (PlacesFlexScreenDto) obj;
                if (placesFlexScreenDto != null) {
                    u3m d = d(placesFlexScreenDto);
                    if (d.c && !d.a.equals(y9c0.b)) {
                        return d;
                    }
                }
                return null;
            }
        }
        placesClientFlexScreensExperimentRepository$screen$4 = new PlacesClientFlexScreensExperimentRepository$screen$4(this, continuationImpl);
        Object obj22 = placesClientFlexScreensExperimentRepository$screen$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesClientFlexScreensExperimentRepository$screen$4.label;
        if (i != 0) {
        }
        it = ((PlacesClientFlexScreensExperimentDto) obj22).c.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        placesFlexScreenDto = (PlacesFlexScreenDto) obj;
        if (placesFlexScreenDto != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        PlacesClientFlexScreensExperimentRepository$screen$1 placesClientFlexScreensExperimentRepository$screen$1;
        int i;
        Iterator it;
        Object obj;
        PlacesFlexScreenDto placesFlexScreenDto;
        if (continuationImpl instanceof PlacesClientFlexScreensExperimentRepository$screen$1) {
            placesClientFlexScreensExperimentRepository$screen$1 = (PlacesClientFlexScreensExperimentRepository$screen$1) continuationImpl;
            int i2 = placesClientFlexScreensExperimentRepository$screen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesClientFlexScreensExperimentRepository$screen$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = placesClientFlexScreensExperimentRepository$screen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesClientFlexScreensExperimentRepository$screen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    placesClientFlexScreensExperimentRepository$screen$1.L$0 = str;
                    placesClientFlexScreensExperimentRepository$screen$1.label = 1;
                    obj2 = this.a.b(placesClientFlexScreensExperimentRepository$screen$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) placesClientFlexScreensExperimentRepository$screen$1.L$0;
                    kotlin.b.b(obj2);
                }
                it = ((PlacesClientFlexScreensExperimentDto) obj2).c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((PlacesFlexScreenDto) obj).a, str)) {
                        break;
                    }
                }
                placesFlexScreenDto = (PlacesFlexScreenDto) obj;
                if (placesFlexScreenDto != null) {
                    u3m d = d(placesFlexScreenDto);
                    if (d.c && !d.a.equals(y9c0.b)) {
                        return d;
                    }
                }
                return null;
            }
        }
        placesClientFlexScreensExperimentRepository$screen$1 = new PlacesClientFlexScreensExperimentRepository$screen$1(this, continuationImpl);
        Object obj22 = placesClientFlexScreensExperimentRepository$screen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesClientFlexScreensExperimentRepository$screen$1.label;
        if (i != 0) {
        }
        it = ((PlacesClientFlexScreensExperimentDto) obj22).c.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        placesFlexScreenDto = (PlacesFlexScreenDto) obj;
        if (placesFlexScreenDto != null) {
        }
        return null;
    }
}
