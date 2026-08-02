package com.yandex.go.lootbox.impl.domain.interactors.animation;

import com.yandex.go.lootbox.api.domain.entities.lootbox.animation_type.LootBoxAnimationType;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxAnimationInfo;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxExperiment;
import defpackage.cne0;
import defpackage.cpz;
import defpackage.dpz;
import defpackage.evu0;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qpz;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes12.dex */
public final class e {
    public final tt2 a;
    public final com.yandex.go.lootbox.impl.data.repository.animation.a b;
    public final qpz c;
    public final g d;
    public final ru.yandex.taxi.communications.b e;
    public final hbp0 f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public e(tt2 tt2Var, com.yandex.go.lootbox.impl.data.repository.animation.a aVar, qpz qpzVar, g gVar, ru.yandex.taxi.communications.b bVar) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = qpzVar;
        this.d = gVar;
        this.e = bVar;
        this.f = new hbp0(new LootBoxAnimationInteractorImpl$scopeDelegate$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, List list, ContinuationImpl continuationImpl) {
        LootBoxAnimationInteractorImpl$handleLoadedAnimation$1 lootBoxAnimationInteractorImpl$handleLoadedAnimation$1;
        int i;
        Iterator it;
        String[] list2;
        ConcurrentHashMap concurrentHashMap = eVar.g;
        if (continuationImpl instanceof LootBoxAnimationInteractorImpl$handleLoadedAnimation$1) {
            lootBoxAnimationInteractorImpl$handleLoadedAnimation$1 = (LootBoxAnimationInteractorImpl$handleLoadedAnimation$1) continuationImpl;
            int i2 = lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.L$2;
                    kotlin.b.b(obj);
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    boolean z = eVar.e(str) != null;
                    boolean i3 = eVar.i(str);
                    boolean booleanValue = ((Boolean) concurrentHashMap.getOrDefault(str, Boolean.FALSE)).booleanValue();
                    if (!z) {
                        jst.e.getClass();
                        concurrentHashMap.remove(str);
                        com.yandex.go.lootbox.impl.data.repository.animation.a aVar = eVar.b;
                        File file = aVar.c.a;
                        if (file.exists() && (list2 = file.list()) != null) {
                            ArrayList arrayList = new ArrayList();
                            for (String str2 : list2) {
                                if (evu0.y(str2, str, false)) {
                                    arrayList.add(str2);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                new File((String) it2.next()).delete();
                            }
                        }
                        aVar.b.a.w(str);
                    } else if (i3) {
                        jst.e.getClass();
                    } else if (booleanValue) {
                        jst.e.getClass();
                    } else {
                        lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.L$0 = null;
                        lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.L$1 = null;
                        lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.L$2 = it;
                        lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.L$3 = null;
                        lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.L$4 = null;
                        lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.Z$0 = z;
                        lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.Z$1 = i3;
                        lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.Z$2 = booleanValue;
                        lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.label = 1;
                        if (eVar.g(str, lootBoxAnimationInteractorImpl$handleLoadedAnimation$1) == obj2) {
                            return obj2;
                        }
                    }
                }
                return zy11.a;
            }
        }
        lootBoxAnimationInteractorImpl$handleLoadedAnimation$1 = new LootBoxAnimationInteractorImpl$handleLoadedAnimation$1(eVar, continuationImpl);
        Object obj3 = lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxAnimationInteractorImpl$handleLoadedAnimation$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        LootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1 lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1;
        int i;
        Iterator it;
        eVar.getClass();
        if (continuationImpl instanceof LootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1) {
            lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1 = (LootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1) continuationImpl;
            int i2 = lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = taxiOrder.V().j().c.iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.L$2;
                    kotlin.b.b(obj);
                }
                while (it.hasNext()) {
                    LootBoxAnimationInfo lootBoxAnimationInfo = (LootBoxAnimationInfo) it.next();
                    if (!eVar.i(lootBoxAnimationInfo.a)) {
                        String str = lootBoxAnimationInfo.a;
                        lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.L$0 = null;
                        lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.L$1 = null;
                        lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.L$2 = it;
                        lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.L$3 = null;
                        lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.L$4 = null;
                        lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.label = 1;
                        if (eVar.g(str, lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1) == obj2) {
                            return obj2;
                        }
                    }
                }
                return zy11.a;
            }
        }
        lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1 = new LootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1(eVar, continuationImpl);
        Object obj3 = lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxAnimationInteractorImpl$loadAnimationsIfChangedInExperiment$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    public static String f(LootBoxAnimationInfo lootBoxAnimationInfo, LootBoxAnimationType lootBoxAnimationType) {
        int i = dpz.a[lootBoxAnimationType.ordinal()];
        if (i == 1) {
            return lootBoxAnimationInfo.b;
        }
        if (i == 2) {
            return lootBoxAnimationInfo.c;
        }
        if (i == 3) {
            return lootBoxAnimationInfo.d;
        }
        w511.b();
        return null;
    }

    public final void c() {
        hbp0 hbp0Var = this.f;
        hbp0Var.a();
        kotlinx.coroutines.flow.e.H(hbp0Var.c(), new jqr(new d(new b(this.d.h()), this), new LootBoxAnimationInteractorImpl$attach$3(this, null), 3));
    }

    public final Object d(String str, LootBoxAnimationType lootBoxAnimationType, com.yandex.go.lootbox.impl.presentation.modal.a aVar, SuspendLambda suspendLambda) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new LootBoxAnimationInteractorImpl$getAnimationFromCacheOrLoad$2(this, str, lootBoxAnimationType, aVar, null), suspendLambda);
    }

    public final LootBoxAnimationInfo e(String str) {
        Object obj;
        Iterator it = this.h.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LootBoxExperiment) obj).a(str) != null) {
                break;
            }
        }
        LootBoxExperiment lootBoxExperiment = (LootBoxExperiment) obj;
        if (lootBoxExperiment != null) {
            return lootBoxExperiment.a(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ContinuationImpl continuationImpl) {
        LootBoxAnimationInteractorImpl$handleAnimationDownload$1 lootBoxAnimationInteractorImpl$handleAnimationDownload$1;
        int i;
        if (continuationImpl instanceof LootBoxAnimationInteractorImpl$handleAnimationDownload$1) {
            lootBoxAnimationInteractorImpl$handleAnimationDownload$1 = (LootBoxAnimationInteractorImpl$handleAnimationDownload$1) continuationImpl;
            int i2 = lootBoxAnimationInteractorImpl$handleAnimationDownload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxAnimationInteractorImpl$handleAnimationDownload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lootBoxAnimationInteractorImpl$handleAnimationDownload$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxAnimationInteractorImpl$handleAnimationDownload$1.label;
                ConcurrentHashMap concurrentHashMap = this.g;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jst.e.getClass();
                    concurrentHashMap.put(str, Boolean.TRUE);
                    cpz cpzVar = new cpz(this, str, 0);
                    lootBoxAnimationInteractorImpl$handleAnimationDownload$1.L$0 = str;
                    lootBoxAnimationInteractorImpl$handleAnimationDownload$1.label = 1;
                    if (j(str, cpzVar, lootBoxAnimationInteractorImpl$handleAnimationDownload$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) lootBoxAnimationInteractorImpl$handleAnimationDownload$1.L$0;
                    kotlin.b.b(obj);
                }
                concurrentHashMap.put(str, Boolean.FALSE);
                jst.e.getClass();
                return zy11.a;
            }
        }
        lootBoxAnimationInteractorImpl$handleAnimationDownload$1 = new LootBoxAnimationInteractorImpl$handleAnimationDownload$1(this, continuationImpl);
        Object obj3 = lootBoxAnimationInteractorImpl$handleAnimationDownload$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxAnimationInteractorImpl$handleAnimationDownload$1.label;
        ConcurrentHashMap concurrentHashMap2 = this.g;
        if (i != 0) {
        }
        concurrentHashMap2.put(str, Boolean.FALSE);
        jst.e.getClass();
        return zy11.a;
    }

    public final boolean h(String str, LootBoxAnimationType lootBoxAnimationType) {
        LootBoxAnimationInfo e = e(str);
        if (e == null) {
            return false;
        }
        String f = f(e, lootBoxAnimationType);
        com.yandex.go.lootbox.impl.data.repository.animation.a aVar = this.b;
        if (!aVar.c.a(str, lootBoxAnimationType).exists()) {
            return false;
        }
        cne0 cne0Var = aVar.b.a;
        String l = cne0Var.l(str + "_" + lootBoxAnimationType.getCacheKey(), null);
        if (l == null) {
            l = cne0Var.l(str + "_" + lootBoxAnimationType.getCacheKey().toLowerCase(Locale.ROOT), null);
        }
        boolean l2 = jl40.l(l, f);
        jst.e.getClass();
        return l2;
    }

    public final boolean i(String str) {
        List g = scc.g(LootBoxAnimationType.LOADING, LootBoxAnimationType.OPENING, LootBoxAnimationType.COMPLETION);
        if ((g instanceof Collection) && g.isEmpty()) {
            return true;
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            if (!h(str, (LootBoxAnimationType) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v3, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, cpz cpzVar, ContinuationImpl continuationImpl) {
        LootBoxAnimationInteractorImpl$loadAllAnimations$1 lootBoxAnimationInteractorImpl$loadAllAnimations$1;
        int i;
        cpz cpzVar2;
        LootBoxAnimationInteractorImpl$loadAllAnimations$1 lootBoxAnimationInteractorImpl$loadAllAnimations$12;
        LootBoxAnimationInfo lootBoxAnimationInfo;
        Iterator it;
        if (continuationImpl instanceof LootBoxAnimationInteractorImpl$loadAllAnimations$1) {
            lootBoxAnimationInteractorImpl$loadAllAnimations$1 = (LootBoxAnimationInteractorImpl$loadAllAnimations$1) continuationImpl;
            int i2 = lootBoxAnimationInteractorImpl$loadAllAnimations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxAnimationInteractorImpl$loadAllAnimations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lootBoxAnimationInteractorImpl$loadAllAnimations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxAnimationInteractorImpl$loadAllAnimations$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LootBoxAnimationInfo e = e(str);
                    if (e != null) {
                        cpzVar2 = cpzVar;
                        lootBoxAnimationInteractorImpl$loadAllAnimations$12 = lootBoxAnimationInteractorImpl$loadAllAnimations$1;
                        lootBoxAnimationInfo = e;
                        it = scc.g(LootBoxAnimationType.LOADING, LootBoxAnimationType.OPENING, LootBoxAnimationType.COMPLETION).iterator();
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) lootBoxAnimationInteractorImpl$loadAllAnimations$1.L$4;
                lootBoxAnimationInfo = (LootBoxAnimationInfo) lootBoxAnimationInteractorImpl$loadAllAnimations$1.L$2;
                ?? r2 = (tls) lootBoxAnimationInteractorImpl$loadAllAnimations$1.L$1;
                kotlin.b.b(obj);
                lootBoxAnimationInteractorImpl$loadAllAnimations$12 = lootBoxAnimationInteractorImpl$loadAllAnimations$1;
                cpzVar2 = r2;
                while (it.hasNext()) {
                    LootBoxAnimationType lootBoxAnimationType = (LootBoxAnimationType) it.next();
                    lootBoxAnimationInteractorImpl$loadAllAnimations$12.L$0 = null;
                    lootBoxAnimationInteractorImpl$loadAllAnimations$12.L$1 = cpzVar2;
                    lootBoxAnimationInteractorImpl$loadAllAnimations$12.L$2 = lootBoxAnimationInfo;
                    lootBoxAnimationInteractorImpl$loadAllAnimations$12.L$3 = null;
                    lootBoxAnimationInteractorImpl$loadAllAnimations$12.L$4 = it;
                    lootBoxAnimationInteractorImpl$loadAllAnimations$12.L$5 = null;
                    lootBoxAnimationInteractorImpl$loadAllAnimations$12.L$6 = null;
                    lootBoxAnimationInteractorImpl$loadAllAnimations$12.label = 1;
                    if (this.b.a(lootBoxAnimationInfo.a, lootBoxAnimationType, f(lootBoxAnimationInfo, lootBoxAnimationType), cpzVar2, lootBoxAnimationInteractorImpl$loadAllAnimations$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        lootBoxAnimationInteractorImpl$loadAllAnimations$1 = new LootBoxAnimationInteractorImpl$loadAllAnimations$1(this, continuationImpl);
        Object obj2 = lootBoxAnimationInteractorImpl$loadAllAnimations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxAnimationInteractorImpl$loadAllAnimations$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
