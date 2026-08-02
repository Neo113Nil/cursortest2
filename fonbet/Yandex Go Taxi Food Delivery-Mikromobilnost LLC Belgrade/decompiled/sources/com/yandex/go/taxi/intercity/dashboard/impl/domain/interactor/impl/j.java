package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl;

import com.adjust.sdk.Constants;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityDashboardSelectTariffSource;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import defpackage.axm;
import defpackage.c4r0;
import defpackage.ehw;
import defpackage.fkw;
import defpackage.gjw;
import defpackage.gkw;
import defpackage.glw;
import defpackage.hjw;
import defpackage.jl40;
import defpackage.jlw;
import defpackage.jst;
import defpackage.klw;
import defpackage.mp60;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pj;
import defpackage.pkw;
import defpackage.pzt0;
import defpackage.qtb1;
import defpackage.rgw;
import defpackage.tcc;
import defpackage.tgw;
import defpackage.u9w;
import defpackage.ugw;
import defpackage.ukw;
import defpackage.unr0;
import defpackage.v9w;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.y1s;
import defpackage.yfw;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class j {
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a a;
    public final ukw b;
    public final klw c;
    public final com.yandex.go.taxi.tariffs.interactor.g d;
    public final com.yandex.go.taxi.tariffs.interactor.b e;
    public final c4r0 f;
    public final wiq0 g;
    public final i h;
    public final fkw i;
    public final v9w j;
    public final axm k;
    public final y1s l;

    public j(com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, ukw ukwVar, klw klwVar, com.yandex.go.taxi.tariffs.interactor.g gVar, com.yandex.go.taxi.tariffs.interactor.b bVar, c4r0 c4r0Var, wiq0 wiq0Var, i iVar, fkw fkwVar, v9w v9wVar, axm axmVar, y1s y1sVar) {
        this.a = aVar;
        this.b = ukwVar;
        this.c = klwVar;
        this.d = gVar;
        this.e = bVar;
        this.f = c4r0Var;
        this.g = wiq0Var;
        this.h = iVar;
        this.i = fkwVar;
        this.j = v9wVar;
        this.k = axmVar;
        this.l = y1sVar;
    }

    public static pkw c(gjw gjwVar, String str) {
        List list;
        Object obj = null;
        if (gjwVar == null || (list = gjwVar.b) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((pkw) next).b, str)) {
                obj = next;
                break;
            }
        }
        return (pkw) obj;
    }

    public static pkw d(gjw gjwVar, String str) {
        List list;
        Object obj = null;
        if (str == null || gjwVar == null || (list = gjwVar.b) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((pkw) next).a, str)) {
                obj = next;
                break;
            }
        }
        return (pkw) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        IntercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1 intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1;
        int i;
        if (continuationImpl instanceof IntercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1) {
            intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1 = (IntercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1) continuationImpl;
            int i2 = intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.label = 1;
                    obj = this.d.a(intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.L$0 = null;
                intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.label = 2;
                Object b = this.e.b((Zone) obj, intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1 = new IntercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1(this, continuationImpl);
        Object obj2 = intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.label;
        if (i != 0) {
        }
        intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.L$0 = null;
        intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1.label = 2;
        Object b2 = this.e.b((Zone) obj2, intercityDashboardTariffInteractorImpl$awaitUpdateTariffsByZone$1);
        if (b2 != coroutineSingletons2) {
        }
    }

    public final String b() {
        pex0 m = ((k) this.g).m();
        if (m != null) {
            return m.b;
        }
        return null;
    }

    public final gjw e() {
        Object obj;
        jlw a = this.c.a();
        glw glwVar = a instanceof glw ? (glw) a : null;
        if (glwVar == null) {
            return null;
        }
        mp60 mp60Var = glwVar.c;
        Object[] objArr = mp60Var.a;
        int i = mp60Var.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                obj = null;
                break;
            }
            obj = objArr[i2];
            if (((hjw) obj) instanceof gjw) {
                break;
            }
            i2++;
        }
        return (gjw) (obj instanceof gjw ? obj : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        IntercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1 intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1;
        int i;
        List list;
        String str;
        if (continuationImpl instanceof IntercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1) {
            intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1 = (IntercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1) continuationImpl;
            int i2 = intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gjw e = e();
                    if (e != null) {
                        List list2 = e.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!((pkw) obj2).d) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((pkw) it.next()).b);
                        }
                        if (!arrayList2.isEmpty()) {
                            intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1.L$0 = null;
                            intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1.L$1 = arrayList2;
                            intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1.label = 1;
                            Object a = this.d.a(intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1);
                            if (a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            list = arrayList2;
                            obj = a;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1.L$1;
                kotlin.b.b(obj);
                str = ((Zone) obj).a;
                pj pjVar = this.j.a;
                String X = kotlin.collections.a.X(list, Extension.FIX_SPACE, null, null, null, 62);
                pjVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("unavailable_tariffs", X);
                if (str != null) {
                    hashMap.put("zone_name", str);
                }
                pjVar.a.a("IntercityMain.TariffSelector.UnavailableTariffs", hashMap, 1, new HashMap());
                return zy11Var;
            }
        }
        intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1 = new IntercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1(this, continuationImpl);
        Object obj3 = intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardTariffInteractorImpl$handleUnavailableTariffs$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        str = ((Zone) obj3).a;
        pj pjVar2 = this.j.a;
        String X2 = kotlin.collections.a.X(list, Extension.FIX_SPACE, null, null, null, 62);
        pjVar2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("unavailable_tariffs", X2);
        if (str != null) {
        }
        pjVar2.a.a("IntercityMain.TariffSelector.UnavailableTariffs", hashMap2, 1, new HashMap());
        return zy11Var2;
    }

    public final void g(String str) {
        Object value;
        k kVar = (k) this.g;
        pex0 m = kVar.m();
        if (jl40.l(m != null ? m.b : null, str)) {
            return;
        }
        com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar = this.a;
        ugw ugwVar = aVar.a().d;
        tgw tgwVar = ugwVar != null ? ugwVar.a : null;
        if ((tgwVar instanceof rgw ? (rgw) tgwVar : null) == null || ((rgw) ugwVar.b) == null) {
            return;
        }
        pex0 m2 = kVar.m();
        String str2 = m2 != null ? m2.b : null;
        r0 r0Var = aVar.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, yfw.a((yfw) value, null, null, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD)));
        jst.e.s(new IllegalStateException(unr0.p("change tariff failed. expected [", str, "] but actual ", str2, " ")));
    }

    public final boolean h(String str) {
        return !jl40.l(str, b());
    }

    public final boolean i() {
        pex0 m = ((k) this.g).m();
        gkw gkwVar = (gkw) this.i;
        if (m == null) {
            gkwVar.getClass();
            return false;
        }
        String str = m.G;
        if (gkwVar.a.b() && m.u) {
            if (jl40.l(str, "preorder_unavailable_for_due")) {
                return true;
            }
            if ((gkwVar.c.c() || gkwVar.b.a()) && jl40.l(str, "intercity_preorder_choose_date")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (r7.h.a(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource, Continuation continuation) {
        IntercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1 intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1;
        int i;
        pkw c;
        if (continuation instanceof IntercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1) {
            intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1 = (IntercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1) continuation;
            int i2 = intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ehw ehwVar = new ehw(str, intercityDashboardSelectTariffSource);
                    ukw ukwVar = this.b;
                    ukwVar.a.l(ehwVar);
                    if ((this.c.a() instanceof glw) && (c = c(e(), str)) != null) {
                        String str3 = c.b;
                        k(c, intercityDashboardSelectTariffSource);
                        ukwVar.a.l(null);
                        this.a.c(c.a, str3);
                        if (h(str3)) {
                            intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$0 = null;
                            intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$1 = str2;
                            intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$2 = null;
                            intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$3 = null;
                            intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$4 = null;
                            intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$5 = c;
                            intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.label = 1;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                c = (pkw) intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$5;
                str2 = (String) intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$1;
                kotlin.b.b(obj);
                String str4 = c.b;
                SelectionOrigin selectionOrigin = SelectionOrigin.FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD;
                intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$0 = null;
                intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$1 = null;
                intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$2 = null;
                intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$3 = null;
                intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$4 = null;
                intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$5 = null;
                intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.label = 2;
                Object l = l(str4, str2, selectionOrigin, intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1);
                return l != obj2 ? obj2 : l;
            }
        }
        intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1 = new IntercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1(this, continuation);
        Object obj3 = intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.label;
        if (i != 0) {
        }
        String str42 = c.b;
        SelectionOrigin selectionOrigin2 = SelectionOrigin.FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD;
        intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$0 = null;
        intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$1 = null;
        intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$2 = null;
        intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$3 = null;
        intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$4 = null;
        intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.L$5 = null;
        intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1.label = 2;
        Object l2 = l(str42, str2, selectionOrigin2, intercityDashboardTariffInteractorImpl$processingPreselectedTariffClass$1);
        if (l2 != obj22) {
        }
    }

    public final void k(pkw pkwVar, IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource) {
        String str;
        if (intercityDashboardSelectTariffSource == IntercityDashboardSelectTariffSource.USER || intercityDashboardSelectTariffSource == IntercityDashboardSelectTariffSource.DEEPLINK) {
            String str2 = pkwVar.e.a;
            String str3 = pkwVar.b;
            pj pjVar = this.j.a;
            int i = u9w.a[intercityDashboardSelectTariffSource.ordinal()];
            if (i == 1) {
                str = "user";
            } else if (i == 2) {
                str = Constants.DEEPLINK;
            } else {
                if (i != 3 && i != 4) {
                    w511.b();
                    return;
                }
                str = null;
            }
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            if (str2 != null) {
                hashMap.put("title", str2);
            }
            if (str3 != null) {
                hashMap.put("tariff_class", str3);
            }
            if (str != null) {
                hashMap.put("origin", str);
            }
            pjVar.a.a("IntercityMain.TariffSelector.Item.Tapped", hashMap, 1, new HashMap());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(8:20|21|(1:23)|24|(2:26|(1:28))|13|14|15)|12|13|14|15))|37|6|7|(0)(0)|12|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0034, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        defpackage.jst.e.k(r6, "Selected tariff must not be null");
        r5 = r5.c.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        r6 = r5.getValue();
        r7 = (defpackage.jlw) r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, String str2, SelectionOrigin selectionOrigin, ContinuationImpl continuationImpl) {
        IntercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1 intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1;
        int i;
        if (continuationImpl instanceof IntercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1) {
            intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1 = (IntercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1) continuationImpl;
            int i2 = intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c4r0 c4r0Var = this.f;
                    if (str2 == null) {
                        str2 = "";
                    }
                    pzt0 e = c4r0.e(c4r0Var, selectionOrigin, str, str2, 8);
                    if (e != null) {
                        intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.L$0 = str;
                        intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.L$1 = null;
                        intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.L$2 = null;
                        intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.label = 1;
                        obj = e.u0(intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    g(str);
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.L$0;
                kotlin.b.b(obj);
                g(str);
                return zy11.a;
            }
        }
        intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1 = new IntercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1(this, continuationImpl);
        Object obj2 = intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardTariffInteractorImpl$tryUpdateSelectedTariff$1.label;
        if (i != 0) {
        }
        g(str);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        if (a(r0) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, Continuation continuation) {
        IntercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1 intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1;
        int i;
        pkw d;
        String str3;
        pkw pkwVar;
        boolean z;
        Object l;
        if (continuation instanceof IntercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1) {
            intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1 = (IntercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1) continuation;
            int i2 = intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gjw e = e();
                    if (e != null) {
                        String str4 = e.a;
                        List list = e.b;
                        ukw ukwVar = this.b;
                        ehw ehwVar = (ehw) ukwVar.b.a.getValue();
                        com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar = this.a;
                        if (ehwVar != null) {
                            ukwVar.a.l(null);
                            pkw c = c(e, ehwVar.a);
                            if (c != null) {
                                k(c, ehwVar.b);
                                d = c;
                            } else {
                                d = d(e, str4);
                            }
                        } else {
                            d = (list == null || list.size() != 1) ? aVar.a().g != null ? d(e, aVar.a().g) : d(e, str4) : (pkw) kotlin.collections.a.R(list);
                        }
                        if (d != null) {
                            String str5 = d.b;
                            String str6 = d.a;
                            boolean l2 = jl40.l(str6, aVar.a().g);
                            aVar.c(str6, str5);
                            if (h(str5)) {
                                if (!l2) {
                                    this.l.b(false);
                                    this.k.a(qtb1.D);
                                }
                                intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$0 = null;
                                intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$1 = str2;
                                intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$2 = null;
                                intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$3 = d;
                                intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.Z$0 = l2;
                                intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.label = 1;
                                if (this.h.a(intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1) != obj2) {
                                    str3 = str2;
                                    pkwVar = d;
                                    z = l2;
                                    String str7 = pkwVar.b;
                                    SelectionOrigin selectionOrigin = SelectionOrigin.FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD;
                                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$0 = null;
                                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$1 = null;
                                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$2 = null;
                                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$3 = null;
                                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.Z$0 = z;
                                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.label = 2;
                                    l = l(str7, str3, selectionOrigin, intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1);
                                    if (l == obj2) {
                                    }
                                }
                            }
                        }
                        return zy11.a;
                    }
                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$0 = str;
                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$1 = str2;
                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$2 = null;
                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.label = 3;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                        } else if (i == 3) {
                            str2 = (String) intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$1;
                            str = (String) intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$0;
                            kotlin.b.b(obj);
                            SelectionOrigin selectionOrigin2 = SelectionOrigin.FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD;
                            intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$0 = null;
                            intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$1 = null;
                            intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$2 = null;
                            intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.label = 4;
                            Object l3 = l(str, str2, selectionOrigin2, intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1);
                            if (l3 != obj2) {
                                return l3;
                            }
                        } else if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    z = intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.Z$0;
                    pkwVar = (pkw) intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$3;
                    str3 = (String) intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$1;
                    kotlin.b.b(obj);
                    String str72 = pkwVar.b;
                    SelectionOrigin selectionOrigin3 = SelectionOrigin.FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD;
                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$0 = null;
                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$1 = null;
                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$2 = null;
                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.L$3 = null;
                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.Z$0 = z;
                    intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.label = 2;
                    l = l(str72, str3, selectionOrigin3, intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1);
                    if (l == obj2) {
                        return l;
                    }
                }
                return obj2;
            }
        }
        intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1 = new IntercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1(this, continuation);
        Object obj3 = intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1.label;
        if (i != 0) {
        }
        return obj22;
    }
}
