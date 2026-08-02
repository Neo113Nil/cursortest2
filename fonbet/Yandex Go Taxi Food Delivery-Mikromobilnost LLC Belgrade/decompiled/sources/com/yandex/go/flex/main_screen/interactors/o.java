package com.yandex.go.flex.main_screen.interactors;

import com.yandex.go.flex.common.api.actions.GoReloadLabeledSectionsAction;
import com.yandex.go.flex.main_screen.data.sticky.SectionUpdaterRepository;
import defpackage.atx;
import defpackage.cf11;
import defpackage.d5r;
import defpackage.g1m;
import defpackage.ga00;
import defpackage.h1m;
import defpackage.h4q0;
import defpackage.hst;
import defpackage.i1m;
import defpackage.jqr;
import defpackage.jst;
import defpackage.ksx;
import defpackage.nsx;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.s900;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u1m;
import defpackage.ute0;
import defpackage.uyj;
import defpackage.w511;
import defpackage.yzv0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes.dex */
public final class o {
    public final tt2 a;
    public final s900 b;
    public final yzv0 c;
    public final nsx d;
    public final ksx e;
    public final com.yandex.go.flex.main_screen.presentation.feed.e f;
    public final d g;
    public final SectionUpdaterRepository h;
    public final h4q0 i;
    public final cf11 j;
    public final d5r k;
    public final ga00 l;
    public final atx m;
    public final com.yandex.go.flex.main_screen.jason_state.a n;

    public o(tt2 tt2Var, s900 s900Var, yzv0 yzv0Var, nsx nsxVar, ksx ksxVar, com.yandex.go.flex.main_screen.presentation.feed.e eVar, d dVar, SectionUpdaterRepository sectionUpdaterRepository, h4q0 h4q0Var, cf11 cf11Var, d5r d5rVar, ga00 ga00Var, atx atxVar, com.yandex.go.flex.main_screen.jason_state.a aVar) {
        this.a = tt2Var;
        this.b = s900Var;
        this.c = yzv0Var;
        this.d = nsxVar;
        this.e = ksxVar;
        this.f = eVar;
        this.g = dVar;
        this.h = sectionUpdaterRepository;
        this.i = h4q0Var;
        this.j = cf11Var;
        this.k = d5rVar;
        this.l = ga00Var;
        this.m = atxVar;
        this.n = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x010f, code lost:
    
        if (r10 == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0112, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0140, code lost:
    
        if (r10 == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0089, code lost:
    
        if (r12 == r2) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(i1m i1mVar, ute0 ute0Var, ContinuationImpl continuationImpl) {
        MainScreenFlexLoadInteractor$handleLoadingStrategy$1 mainScreenFlexLoadInteractor$handleLoadingStrategy$1;
        Object obj;
        int i;
        u1m u1mVar;
        pzt0 pzt0Var;
        i1m i1mVar2;
        List list;
        zzs zzsVar;
        Object obj2;
        Map map;
        Object obj3;
        Object obj4 = zy11.a;
        if (continuationImpl instanceof MainScreenFlexLoadInteractor$handleLoadingStrategy$1) {
            mainScreenFlexLoadInteractor$handleLoadingStrategy$1 = (MainScreenFlexLoadInteractor$handleLoadingStrategy$1) continuationImpl;
            int i2 = mainScreenFlexLoadInteractor$handleLoadingStrategy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenFlexLoadInteractor$handleLoadingStrategy$1.label = i2 - Integer.MIN_VALUE;
                Object obj5 = mainScreenFlexLoadInteractor$handleLoadingStrategy$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenFlexLoadInteractor$handleLoadingStrategy$1.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj5);
                    if (ute0Var == null) {
                        d dVar = this.g;
                        List a = i1mVar.a();
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$0 = i1mVar;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$1 = null;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.label = 1;
                        Object a2 = dVar.a(null, a, mainScreenFlexLoadInteractor$handleLoadingStrategy$1);
                        obj2 = a2;
                    }
                    u1mVar = ute0Var.a;
                    zzs zzsVar2 = ute0Var.b;
                    List list2 = ute0Var.c;
                    com.yandex.go.flex.main_screen.jason_state.a aVar = this.n;
                    mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$0 = i1mVar;
                    mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$1 = null;
                    mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$2 = u1mVar;
                    mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$3 = zzsVar2;
                    mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$4 = list2;
                    mainScreenFlexLoadInteractor$handleLoadingStrategy$1.label = 2;
                    pzt0Var = aVar.f;
                    if ((pzt0Var != null ? pzt0Var.u0(mainScreenFlexLoadInteractor$handleLoadingStrategy$1) : obj4) != obj) {
                        i1mVar2 = i1mVar;
                        list = list2;
                        zzsVar = zzsVar2;
                        if (i1mVar2.b()) {
                            nsx nsxVar = this.d;
                            this.e.getClass();
                            nsxVar.a = ksx.a(list);
                        }
                        if (zzsVar != null) {
                        }
                        if (!(i1mVar2 instanceof h1m)) {
                        }
                        yzv0 yzv0Var = this.c;
                        map = r10.c;
                        if (map != null) {
                        }
                        yzv0Var.l("FetchDocumentQuery", str);
                        return obj4;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        u1m u1mVar2 = (u1m) mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$2;
                        kotlin.b.b(obj5);
                        yzv0 yzv0Var2 = this.c;
                        map = u1mVar2.c;
                        if (map != null && (obj3 = map.get("client_request_id")) != null) {
                            str = obj3.toString();
                        }
                        yzv0Var2.l("FetchDocumentQuery", str);
                        return obj4;
                    }
                    list = (List) mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$4;
                    zzsVar = (zzs) mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$3;
                    u1m u1mVar3 = (u1m) mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$2;
                    i1mVar2 = (i1m) mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$0;
                    kotlin.b.b(obj5);
                    u1mVar = u1mVar3;
                    if (i1mVar2.b() && list != null) {
                        nsx nsxVar2 = this.d;
                        this.e.getClass();
                        nsxVar2.a = ksx.a(list);
                    }
                    if (zzsVar != null) {
                        this.m.a(zzsVar);
                    }
                    if (!(i1mVar2 instanceof h1m)) {
                        s900 s900Var = this.b;
                        ArrayList arrayList = ((h1m) i1mVar2).a;
                        Map map2 = u1mVar.c;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$0 = null;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$1 = null;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$2 = u1mVar;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$3 = null;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$4 = null;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.label = 3;
                        s900Var.getClass();
                        hst hstVar = jst.e;
                        Objects.toString(arrayList);
                        hstVar.getClass();
                        GoReloadLabeledSectionsAction goReloadLabeledSectionsAction = new GoReloadLabeledSectionsAction(arrayList, map2);
                        s900Var.b.getClass();
                        sjh sjhVar = uyj.a;
                        Object k0 = tje.k0(o400.a, new MainScreenFlexLoadSectionsInteractor$loadLabeledSections$2(s900Var, goReloadLabeledSectionsAction, null), mainScreenFlexLoadInteractor$handleLoadingStrategy$1);
                        if (k0 != obj) {
                            k0 = obj4;
                        }
                    } else {
                        if (!(i1mVar2 instanceof g1m)) {
                            w511.b();
                            return null;
                        }
                        s900 s900Var2 = this.b;
                        boolean z = ((g1m) i1mVar2).b;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$0 = null;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$1 = null;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$2 = u1mVar;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$3 = null;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$4 = null;
                        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.label = 4;
                        s900Var2.b.getClass();
                        sjh sjhVar2 = uyj.a;
                        Object k02 = tje.k0(o400.a, new MainScreenFlexLoadSectionsInteractor$loadDocument$2(s900Var2, u1mVar, z, null), mainScreenFlexLoadInteractor$handleLoadingStrategy$1);
                        if (k02 != obj) {
                            k02 = obj4;
                        }
                    }
                    yzv0 yzv0Var22 = this.c;
                    map = u1mVar2.c;
                    if (map != null) {
                        str = obj3.toString();
                    }
                    yzv0Var22.l("FetchDocumentQuery", str);
                    return obj4;
                }
                i1mVar = (i1m) mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$0;
                kotlin.b.b(obj5);
                obj2 = obj5;
                ute0Var = (ute0) obj2;
                u1mVar = ute0Var.a;
                zzs zzsVar22 = ute0Var.b;
                List list22 = ute0Var.c;
                com.yandex.go.flex.main_screen.jason_state.a aVar2 = this.n;
                mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$0 = i1mVar;
                mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$1 = null;
                mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$2 = u1mVar;
                mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$3 = zzsVar22;
                mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$4 = list22;
                mainScreenFlexLoadInteractor$handleLoadingStrategy$1.label = 2;
                pzt0Var = aVar2.f;
                if ((pzt0Var != null ? pzt0Var.u0(mainScreenFlexLoadInteractor$handleLoadingStrategy$1) : obj4) != obj) {
                }
                return obj;
            }
        }
        mainScreenFlexLoadInteractor$handleLoadingStrategy$1 = new MainScreenFlexLoadInteractor$handleLoadingStrategy$1(this, continuationImpl);
        Object obj52 = mainScreenFlexLoadInteractor$handleLoadingStrategy$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenFlexLoadInteractor$handleLoadingStrategy$1.label;
        String str2 = null;
        if (i != 0) {
        }
        ute0Var = (ute0) obj2;
        u1mVar = ute0Var.a;
        zzs zzsVar222 = ute0Var.b;
        List list222 = ute0Var.c;
        com.yandex.go.flex.main_screen.jason_state.a aVar22 = this.n;
        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$0 = i1mVar;
        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$1 = null;
        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$2 = u1mVar;
        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$3 = zzsVar222;
        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.L$4 = list222;
        mainScreenFlexLoadInteractor$handleLoadingStrategy$1.label = 2;
        pzt0Var = aVar22.f;
        if ((pzt0Var != null ? pzt0Var.u0(mainScreenFlexLoadInteractor$handleLoadingStrategy$1) : obj4) != obj) {
        }
        return obj;
    }

    public final tpr b() {
        SectionUpdaterRepository sectionUpdaterRepository = this.h;
        f fVar = new f(new m0(sectionUpdaterRepository.b, this.f.e, new MainScreenFlexLoadInteractor$listenUpdateLabels$1(3, this.k, d5r.class, "filter", "filter(Ljava/util/Set;Z)Ljava/util/Set;", 4)));
        MainScreenFlexLoadInteractor$listenUpdateLabels$3 mainScreenFlexLoadInteractor$listenUpdateLabels$3 = new MainScreenFlexLoadInteractor$listenUpdateLabels$3(2, sectionUpdaterRepository, SectionUpdaterRepository.class, "removeTriggers", "removeTriggers(Ljava/util/Set;)V", 4);
        int i = 3;
        jqr jqrVar = new jqr(new n(new jqr(new h(new l(new j(new jqr(fVar, mainScreenFlexLoadInteractor$listenUpdateLabels$3, i), this), this.l)), new MainScreenFlexLoadInteractor$listenUpdateLabels$7(2, null), i), this.j), new MainScreenFlexLoadInteractor$listenUpdateLabels$9(this, null), i);
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(jqrVar, uyj.a);
    }
}
