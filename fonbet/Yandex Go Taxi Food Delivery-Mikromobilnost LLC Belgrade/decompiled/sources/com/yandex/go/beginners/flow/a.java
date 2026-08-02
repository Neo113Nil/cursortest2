package com.yandex.go.beginners.flow;

import com.yandex.go.beginners.experiments.BeginnersAuthPostloadExperiment;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.gk5;
import defpackage.h55;
import defpackage.maf0;
import defpackage.ny61;
import defpackage.o61;
import defpackage.t9f0;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.i;

/* loaded from: classes12.dex */
public final class a extends h55 {
    public final com.yandex.go.beginners.analytics.a D;
    public final t9f0 E;
    public final com.yandex.go.navigation.screen.c F;
    public final maf0 G;
    public final i H;

    public a(com.yandex.go.beginners.analytics.a aVar, t9f0 t9f0Var, com.yandex.go.navigation.screen.c cVar, maf0 maf0Var, i iVar) {
        super(null);
        this.D = aVar;
        this.E = t9f0Var;
        this.F = cVar;
        this.G = maf0Var;
        this.H = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment, ContinuationImpl continuationImpl) {
        BeginnersAuthResultRouter$doLaunchRequest$1 beginnersAuthResultRouter$doLaunchRequest$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof BeginnersAuthResultRouter$doLaunchRequest$1) {
            beginnersAuthResultRouter$doLaunchRequest$1 = (BeginnersAuthResultRouter$doLaunchRequest$1) continuationImpl;
            int i2 = beginnersAuthResultRouter$doLaunchRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                beginnersAuthResultRouter$doLaunchRequest$1.label = i2 - Integer.MIN_VALUE;
                obj = beginnersAuthResultRouter$doLaunchRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = beginnersAuthResultRouter$doLaunchRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long j = beginnersAuthPostloadExperiment.d * 1000;
                    BeginnersAuthResultRouter$doLaunchRequest$2 beginnersAuthResultRouter$doLaunchRequest$2 = new BeginnersAuthResultRouter$doLaunchRequest$2(aVar, null);
                    beginnersAuthResultRouter$doLaunchRequest$1.L$0 = null;
                    beginnersAuthResultRouter$doLaunchRequest$1.J$0 = j;
                    beginnersAuthResultRouter$doLaunchRequest$1.label = 1;
                    obj = kotlinx.coroutines.a.w(j, beginnersAuthResultRouter$doLaunchRequest$2, beginnersAuthResultRouter$doLaunchRequest$1);
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
                if (((zy11) obj) == null) {
                    aVar.D.e();
                }
                return zy11.a;
            }
        }
        beginnersAuthResultRouter$doLaunchRequest$1 = new BeginnersAuthResultRouter$doLaunchRequest$1(aVar, continuationImpl);
        obj = beginnersAuthResultRouter$doLaunchRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beginnersAuthResultRouter$doLaunchRequest$1.label;
        if (i != 0) {
        }
        if (((zy11) obj) == null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(a aVar, BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment, ContinuationImpl continuationImpl) {
        BeginnersAuthResultRouter$doProductsRequest$1 beginnersAuthResultRouter$doProductsRequest$1;
        Object obj;
        int i;
        long j;
        com.yandex.go.beginners.analytics.a aVar2 = aVar.D;
        if (continuationImpl instanceof BeginnersAuthResultRouter$doProductsRequest$1) {
            beginnersAuthResultRouter$doProductsRequest$1 = (BeginnersAuthResultRouter$doProductsRequest$1) continuationImpl;
            int i2 = beginnersAuthResultRouter$doProductsRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                beginnersAuthResultRouter$doProductsRequest$1.label = i2 - Integer.MIN_VALUE;
                obj = beginnersAuthResultRouter$doProductsRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = beginnersAuthResultRouter$doProductsRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (aVar.F.b() != Screen.MAIN_V4) {
                        o61 o61Var = aVar2.a;
                        o61Var.getClass();
                        o61Var.e(null, "BeginnersAuthPostload.productsSkipped");
                        return zy11.a;
                    }
                    long j2 = beginnersAuthPostloadExperiment.e * 1000;
                    BeginnersAuthResultRouter$doProductsRequest$2 beginnersAuthResultRouter$doProductsRequest$2 = new BeginnersAuthResultRouter$doProductsRequest$2(aVar, null);
                    beginnersAuthResultRouter$doProductsRequest$1.L$0 = null;
                    beginnersAuthResultRouter$doProductsRequest$1.J$0 = j2;
                    beginnersAuthResultRouter$doProductsRequest$1.label = 1;
                    Object w = kotlinx.coroutines.a.w(j2, beginnersAuthResultRouter$doProductsRequest$2, beginnersAuthResultRouter$doProductsRequest$1);
                    if (w != coroutineSingletons) {
                        obj = w;
                        j = j2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                j = beginnersAuthResultRouter$doProductsRequest$1.J$0;
                kotlin.b.b(obj);
                if (((zy11) obj) == null) {
                    aVar2.i();
                }
                beginnersAuthResultRouter$doProductsRequest$1.L$0 = null;
                beginnersAuthResultRouter$doProductsRequest$1.J$0 = j;
                beginnersAuthResultRouter$doProductsRequest$1.label = 2;
                Object i3 = kotlinx.coroutines.a.i(1000L, beginnersAuthResultRouter$doProductsRequest$1);
                return i3 != coroutineSingletons ? coroutineSingletons : i3;
            }
        }
        beginnersAuthResultRouter$doProductsRequest$1 = new BeginnersAuthResultRouter$doProductsRequest$1(aVar, continuationImpl);
        obj = beginnersAuthResultRouter$doProductsRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beginnersAuthResultRouter$doProductsRequest$1.label;
        if (i != 0) {
        }
        if (((zy11) obj) == null) {
        }
        beginnersAuthResultRouter$doProductsRequest$1.L$0 = null;
        beginnersAuthResultRouter$doProductsRequest$1.J$0 = j;
        beginnersAuthResultRouter$doProductsRequest$1.label = 2;
        Object i32 = kotlinx.coroutines.a.i(1000L, beginnersAuthResultRouter$doProductsRequest$1);
        if (i32 != coroutineSingletons2) {
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.D.j();
        tje.N(o(), null, null, new BeginnersAuthResultRouter$onLaunch$1((gk5) obj, this, null), 3);
    }
}
