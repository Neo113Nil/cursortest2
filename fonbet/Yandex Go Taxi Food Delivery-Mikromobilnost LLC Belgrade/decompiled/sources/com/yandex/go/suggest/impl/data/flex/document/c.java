package com.yandex.go.suggest.impl.data.flex.document;

import com.yandex.go.flex.common.api.actions.GoReloadLabeledSectionsAction;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import defpackage.a42;
import defpackage.ajr;
import defpackage.aks0;
import defpackage.bvf0;
import defpackage.bwp0;
import defpackage.cnr0;
import defpackage.dfw0;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.f8v0;
import defpackage.gfw0;
import defpackage.hst;
import defpackage.jqr;
import defpackage.jst;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ogw0;
import defpackage.pwy;
import defpackage.r6s0;
import defpackage.swp0;
import defpackage.u1m;
import defpackage.u7r;
import defpackage.uwl;
import defpackage.vpr;
import defpackage.w4l0;
import defpackage.ywl;
import defpackage.zy11;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;

/* loaded from: classes8.dex */
public final class c {
    public final gfw0 a;
    public final ogw0 b;
    public final com.yandex.go.suggest.impl.data.a c;
    public final u7r d;
    public final w4l0 e;
    public final ajr f;
    public final dfw0 g;
    public final d h;
    public final String i;
    public final SuperappSuggestExperiment.LoadingStrategy j;
    public final int k;
    public final int l;
    public final SuperappSuggestExperiment.SearchScaffoldStyle m;

    public c(gfw0 gfw0Var, ogw0 ogw0Var, com.yandex.go.suggest.impl.data.a aVar, u7r u7rVar, w4l0 w4l0Var, ajr ajrVar, dfw0 dfw0Var, d dVar, swp0 swp0Var, f8v0 f8v0Var) {
        this.a = gfw0Var;
        this.b = ogw0Var;
        this.c = aVar;
        this.d = u7rVar;
        this.e = w4l0Var;
        this.f = ajrVar;
        this.g = dfw0Var;
        this.h = dVar;
        this.i = swp0Var.a();
        this.j = f8v0Var.c;
        this.k = f8v0Var.a;
        this.l = f8v0Var.b;
        this.m = f8v0Var.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if (r2.emit(r11, r4) != r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, vpr vprVar, bwp0 bwp0Var, ContinuationImpl continuationImpl) {
        SuperappSuggestDocumentInteractor$requestDocument$1 superappSuggestDocumentInteractor$requestDocument$1;
        int i;
        vpr vprVar2;
        Object obj;
        c cVar2;
        String str;
        bwp0 bwp0Var2 = bwp0Var;
        gfw0 gfw0Var = cVar.a;
        if (continuationImpl instanceof SuperappSuggestDocumentInteractor$requestDocument$1) {
            superappSuggestDocumentInteractor$requestDocument$1 = (SuperappSuggestDocumentInteractor$requestDocument$1) continuationImpl;
            int i2 = superappSuggestDocumentInteractor$requestDocument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestDocumentInteractor$requestDocument$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappSuggestDocumentInteractor$requestDocument$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestDocumentInteractor$requestDocument$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    jst.e.getClass();
                    superappSuggestDocumentInteractor$requestDocument$1.L$0 = null;
                    superappSuggestDocumentInteractor$requestDocument$1.L$1 = bwp0Var2;
                    vprVar2 = vprVar;
                    superappSuggestDocumentInteractor$requestDocument$1.L$2 = vprVar2;
                    superappSuggestDocumentInteractor$requestDocument$1.L$3 = cVar;
                    superappSuggestDocumentInteractor$requestDocument$1.label = 1;
                    Object a = cVar.h.a(bwp0Var2, superappSuggestDocumentInteractor$requestDocument$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        cVar2 = cVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bwp0Var2 = (bwp0) superappSuggestDocumentInteractor$requestDocument$1.L$1;
                    kotlin.b.b(obj2);
                    gfw0Var.b = true;
                    int length = bwp0Var2.a.length();
                    u7r u7rVar = cVar.d;
                    if (length == 0) {
                        String str2 = cVar.i;
                        u7rVar.getClass();
                        HashMap hashMap = new HashMap();
                        if (str2 != null) {
                            hashMap.put("search_session_id", str2);
                        }
                        u7rVar.a.a("FindInGoSearch.ZeroSuggest.Sent", hashMap, 2, new HashMap());
                    } else {
                        u7rVar.b(bwp0Var2.a, gfw0Var.e, a42.a(cVar.m), null, cVar.i);
                    }
                    return zy11.a;
                }
                c cVar3 = (c) superappSuggestDocumentInteractor$requestDocument$1.L$3;
                vpr vprVar3 = (vpr) superappSuggestDocumentInteractor$requestDocument$1.L$2;
                bwp0 bwp0Var3 = (bwp0) superappSuggestDocumentInteractor$requestDocument$1.L$1;
                kotlin.b.b(obj2);
                cVar2 = cVar3;
                bwp0Var2 = bwp0Var3;
                obj = obj2;
                vprVar2 = vprVar3;
                u1m u1mVar = (u1m) obj;
                cVar2.getClass();
                pwy pwyVar = new pwy(u1mVar, ((evu0.J(bwp0Var2.a) || !((str = bwp0Var2.b) == null || evu0.J(str))) && cVar2.a.b) ? null : new ywl(new aks0("(theme bgMinor 0p (col (space 24p) (col (repeat 5 (padded 0p 72p 0p 0p (row (padded 8p (bone 40p 40p 19p)) (padded 20p 32p 20p 0p (bone 100% 16p 8p)))))) (space 24p) (col (repeat 2 (padded 0p 26p 36p 26p (row 100% sb (repeat 4 (col (bone 48p 48p 16p)))))))))", null), null, cnr0.b, new uwl(null, null, r6s0.INSTANCE, null, null, null), null, null), false, 4);
                superappSuggestDocumentInteractor$requestDocument$1.L$0 = null;
                superappSuggestDocumentInteractor$requestDocument$1.L$1 = bwp0Var2;
                superappSuggestDocumentInteractor$requestDocument$1.L$2 = null;
                superappSuggestDocumentInteractor$requestDocument$1.L$3 = null;
                superappSuggestDocumentInteractor$requestDocument$1.label = 2;
            }
        }
        superappSuggestDocumentInteractor$requestDocument$1 = new SuperappSuggestDocumentInteractor$requestDocument$1(cVar, continuationImpl);
        Object obj22 = superappSuggestDocumentInteractor$requestDocument$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestDocumentInteractor$requestDocument$1.label;
        if (i != 0) {
        }
        u1m u1mVar2 = (u1m) obj;
        cVar2.getClass();
        pwy pwyVar2 = new pwy(u1mVar2, ((evu0.J(bwp0Var2.a) || !((str = bwp0Var2.b) == null || evu0.J(str))) && cVar2.a.b) ? null : new ywl(new aks0("(theme bgMinor 0p (col (space 24p) (col (repeat 5 (padded 0p 72p 0p 0p (row (padded 8p (bone 40p 40p 19p)) (padded 20p 32p 20p 0p (bone 100% 16p 8p)))))) (space 24p) (col (repeat 2 (padded 0p 26p 36p 26p (row 100% sb (repeat 4 (col (bone 48p 48p 16p)))))))))", null), null, cnr0.b, new uwl(null, null, r6s0.INSTANCE, null, null, null), null, null), false, 4);
        superappSuggestDocumentInteractor$requestDocument$1.L$0 = null;
        superappSuggestDocumentInteractor$requestDocument$1.L$1 = bwp0Var2;
        superappSuggestDocumentInteractor$requestDocument$1.L$2 = null;
        superappSuggestDocumentInteractor$requestDocument$1.L$3 = null;
        superappSuggestDocumentInteractor$requestDocument$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, vpr vprVar, bwp0 bwp0Var, boolean z, ContinuationImpl continuationImpl) {
        SuperappSuggestDocumentInteractor$requestPartialUpdate$1 superappSuggestDocumentInteractor$requestPartialUpdate$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SuperappSuggestDocumentInteractor$requestPartialUpdate$1) {
            superappSuggestDocumentInteractor$requestPartialUpdate$1 = (SuperappSuggestDocumentInteractor$requestPartialUpdate$1) continuationImpl;
            int i2 = superappSuggestDocumentInteractor$requestPartialUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestDocumentInteractor$requestPartialUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappSuggestDocumentInteractor$requestPartialUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestDocumentInteractor$requestPartialUpdate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SuperappSuggestDocumentInteractor$requestPartialUpdate$2 superappSuggestDocumentInteractor$requestPartialUpdate$2 = new SuperappSuggestDocumentInteractor$requestPartialUpdate$2(cVar, bwp0Var, vprVar, z, null);
                    superappSuggestDocumentInteractor$requestPartialUpdate$1.L$0 = null;
                    superappSuggestDocumentInteractor$requestPartialUpdate$1.L$1 = null;
                    superappSuggestDocumentInteractor$requestPartialUpdate$1.Z$0 = z;
                    superappSuggestDocumentInteractor$requestPartialUpdate$1.label = 1;
                    if (bvf0.n(superappSuggestDocumentInteractor$requestPartialUpdate$2, superappSuggestDocumentInteractor$requestPartialUpdate$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        superappSuggestDocumentInteractor$requestPartialUpdate$1 = new SuperappSuggestDocumentInteractor$requestPartialUpdate$1(cVar, continuationImpl);
        Object obj2 = superappSuggestDocumentInteractor$requestPartialUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestDocumentInteractor$requestPartialUpdate$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (kotlinx.coroutines.a.j(r13, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, vpr vprVar, bwp0 bwp0Var, Map map, String str, long j, ContinuationImpl continuationImpl) {
        SuperappSuggestDocumentInteractor$requestSectionsAfterDelay$1 superappSuggestDocumentInteractor$requestSectionsAfterDelay$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        GoReloadLabeledSectionsAction goReloadLabeledSectionsAction;
        String str2;
        cVar.getClass();
        if (continuationImpl instanceof SuperappSuggestDocumentInteractor$requestSectionsAfterDelay$1) {
            superappSuggestDocumentInteractor$requestSectionsAfterDelay$1 = (SuperappSuggestDocumentInteractor$requestSectionsAfterDelay$1) continuationImpl;
            int i2 = superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o430 o430Var = e3n.b;
                    if (e3n.c(j, kp50.U(0, DurationUnit.MILLISECONDS)) > 0) {
                        hst hstVar = jst.e;
                        e3n.p(j);
                        hstVar.getClass();
                        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$0 = vprVar;
                        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$1 = bwp0Var;
                        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$2 = map;
                        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$3 = str;
                        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.J$0 = j;
                        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$3;
                        bwp0Var = (bwp0) superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$1;
                        kotlin.b.b(obj);
                        cVar.d.b(bwp0Var.a, cVar.a.e, a42.a(cVar.m), Collections.singletonList(str2), cVar.i);
                        return zy11.a;
                    }
                    j = superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.J$0;
                    str = (String) superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$3;
                    map = (Map) superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$2;
                    bwp0Var = (bwp0) superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$1;
                    vprVar = (vpr) superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$0;
                    kotlin.b.b(obj);
                }
                jst.e.getClass();
                goReloadLabeledSectionsAction = new GoReloadLabeledSectionsAction(Collections.singletonList(str), map);
                superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$0 = null;
                superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$1 = bwp0Var;
                superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$2 = null;
                superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$3 = str;
                superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.J$0 = j;
                superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.label = 2;
                if (vprVar.emit(goReloadLabeledSectionsAction, superappSuggestDocumentInteractor$requestSectionsAfterDelay$1) != coroutineSingletons) {
                    str2 = str;
                    cVar.d.b(bwp0Var.a, cVar.a.e, a42.a(cVar.m), Collections.singletonList(str2), cVar.i);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1 = new SuperappSuggestDocumentInteractor$requestSectionsAfterDelay$1(cVar, continuationImpl);
        Object obj2 = superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.label;
        if (i != 0) {
        }
        jst.e.getClass();
        goReloadLabeledSectionsAction = new GoReloadLabeledSectionsAction(Collections.singletonList(str), map);
        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$0 = null;
        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$1 = bwp0Var;
        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$2 = null;
        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.L$3 = str;
        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.J$0 = j;
        superappSuggestDocumentInteractor$requestSectionsAfterDelay$1.label = 2;
        if (vprVar.emit(goReloadLabeledSectionsAction, superappSuggestDocumentInteractor$requestSectionsAfterDelay$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final n d() {
        return new n(e.X(new jqr(e.X(new jqr(e.t(com.yandex.go.coroutines.b.i(this.e.f())), new SuperappSuggestDocumentInteractor$loadingActionsFlow$1(this, null), 3), new SuperappSuggestDocumentInteractor$special$$inlined$flatMapLatest$1(this, null)), new SuperappSuggestDocumentInteractor$loadingActionsFlow$3(this, null), 0), new SuperappSuggestDocumentInteractor$loadingActionsFlow$4(this, null)), new SuperappSuggestDocumentInteractor$loadingActionsFlow$5(this, null));
    }
}
