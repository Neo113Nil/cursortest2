package com.yandex.go.external_service.preloader.domain;

import com.yandex.go.external_service.preloader.SuperAppConfigEatsKitStaticExperiment;
import com.yandex.go.external_service.preloader.data.models.StaticInfo;
import defpackage.d7u0;
import defpackage.hst;
import defpackage.jbh;
import defpackage.jqr;
import defpackage.jst;
import defpackage.ne00;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.yk;
import defpackage.zy11;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.experiments.superapp.j;

/* loaded from: classes.dex */
public final class g {
    public final ne00 a;
    public final d7u0 b;
    public final j c;
    public final t1b0 d;

    public g(ne00 ne00Var, d7u0 d7u0Var, j jVar, rqo rqoVar) {
        this.a = ne00Var;
        this.b = d7u0Var;
        this.c = jVar;
        this.d = ((jbh) rqoVar).e(SuperAppConfigEatsKitStaticExperiment.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, StaticInfo staticInfo, Continuation continuation) {
        ManifestLoadInteractor$preloadStatics$1 manifestLoadInteractor$preloadStatics$1;
        int i;
        gVar.getClass();
        if (continuation instanceof ManifestLoadInteractor$preloadStatics$1) {
            manifestLoadInteractor$preloadStatics$1 = (ManifestLoadInteractor$preloadStatics$1) continuation;
            int i2 = manifestLoadInteractor$preloadStatics$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                manifestLoadInteractor$preloadStatics$1.label = i2 - Integer.MIN_VALUE;
                Object obj = manifestLoadInteractor$preloadStatics$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = manifestLoadInteractor$preloadStatics$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hst hstVar = jst.e;
                    staticInfo.a.size();
                    hstVar.getClass();
                    com.yandex.go.external_service.preloader.data.b bVar = gVar.b.e;
                    if (bVar != null) {
                        manifestLoadInteractor$preloadStatics$1.L$0 = staticInfo;
                        manifestLoadInteractor$preloadStatics$1.label = 1;
                        obj = bVar.b(staticInfo, manifestLoadInteractor$preloadStatics$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    hst hstVar2 = jst.e;
                    staticInfo.a.size();
                    hstVar2.getClass();
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                staticInfo = (StaticInfo) manifestLoadInteractor$preloadStatics$1.L$0;
                kotlin.b.b(obj);
                hst hstVar22 = jst.e;
                staticInfo.a.size();
                hstVar22.getClass();
                return zy11.a;
            }
        }
        manifestLoadInteractor$preloadStatics$1 = new ManifestLoadInteractor$preloadStatics$1(gVar, continuation);
        Object obj2 = manifestLoadInteractor$preloadStatics$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = manifestLoadInteractor$preloadStatics$1.label;
        if (i != 0) {
        }
        hst hstVar222 = jst.e;
        staticInfo.a.size();
        hstVar222.getClass();
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, Set set, SuperAppConfigEatsKitStaticExperiment superAppConfigEatsKitStaticExperiment, Continuation continuation) {
        ManifestLoadInteractor$toStaticInfo$1 manifestLoadInteractor$toStaticInfo$1;
        int i;
        StaticInfo staticInfo;
        gVar.getClass();
        if (continuation instanceof ManifestLoadInteractor$toStaticInfo$1) {
            manifestLoadInteractor$toStaticInfo$1 = (ManifestLoadInteractor$toStaticInfo$1) continuation;
            int i2 = manifestLoadInteractor$toStaticInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                manifestLoadInteractor$toStaticInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = manifestLoadInteractor$toStaticInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = manifestLoadInteractor$toStaticInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hst hstVar = jst.e;
                    set.size();
                    Objects.toString(superAppConfigEatsKitStaticExperiment.b);
                    hstVar.getClass();
                    if (superAppConfigEatsKitStaticExperiment.b != SuperAppConfigEatsKitStaticExperiment.Type.LCP) {
                        set = null;
                    }
                    if (set == null) {
                        set = EmptySet.a;
                    }
                    com.yandex.go.external_service.preloader.data.a aVar = gVar.a.d;
                    if (aVar != null) {
                        manifestLoadInteractor$toStaticInfo$1.L$0 = null;
                        manifestLoadInteractor$toStaticInfo$1.L$1 = null;
                        manifestLoadInteractor$toStaticInfo$1.L$2 = null;
                        manifestLoadInteractor$toStaticInfo$1.label = 1;
                        obj = aVar.b(set, manifestLoadInteractor$toStaticInfo$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    StaticInfo.Companion.getClass();
                    return StaticInfo.d;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                staticInfo = (StaticInfo) obj;
                if (staticInfo != null) {
                    return staticInfo;
                }
                StaticInfo.Companion.getClass();
                return StaticInfo.d;
            }
        }
        manifestLoadInteractor$toStaticInfo$1 = new ManifestLoadInteractor$toStaticInfo$1(gVar, continuation);
        Object obj2 = manifestLoadInteractor$toStaticInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = manifestLoadInteractor$toStaticInfo$1.label;
        if (i != 0) {
        }
        staticInfo = (StaticInfo) obj2;
        if (staticInfo != null) {
        }
        StaticInfo.Companion.getClass();
        return StaticInfo.d;
    }

    public final o c() {
        jst.e.getClass();
        return new o(new jqr(new m0(kotlinx.coroutines.flow.e.t(new f(new d(this.c.b()))), kotlinx.coroutines.flow.e.s(new jqr(new b(ru.yandex.taxi.experiments.d.b(this.d)), new ManifestLoadInteractor$preload$experimentFlow$2(2, this, g.class, "updateRepositoryHolders", "updateRepositoryHolders(Lcom/yandex/go/external_service/preloader/SuperAppConfigEatsKitStaticExperiment;)V", 4), 3), new yk(12)), new ManifestLoadInteractor$preload$3(3, this, g.class, "toStaticInfo", "toStaticInfo(Ljava/util/Set;Lcom/yandex/go/external_service/preloader/SuperAppConfigEatsKitStaticExperiment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), new ManifestLoadInteractor$preload$4(2, this, g.class, "preloadStatics", "preloadStatics(Lcom/yandex/go/external_service/preloader/data/models/StaticInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3), new ManifestLoadInteractor$preload$5(3, null));
    }
}
