package com.yandex.go.flex.main_screen.data.network;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenFeaturesExperiment;
import com.yandex.go.flex.main_screen.experiments.j;
import com.yandex.go.flex.main_screen.shared_data.MainScreenResolvedPosition;
import com.yandex.go.flex.main_screen.shared_data.SuperAppMainScreenFeatures;
import defpackage.ajr;
import defpackage.blh;
import defpackage.cvu0;
import defpackage.d2t;
import defpackage.ga1;
import defpackage.gwk0;
import defpackage.hd7;
import defpackage.ivj0;
import defpackage.jpa1;
import defpackage.jst;
import defpackage.ksw;
import defpackage.lx4;
import defpackage.mth;
import defpackage.ny61;
import defpackage.omt;
import defpackage.q0t;
import defpackage.q6r;
import defpackage.qjr;
import defpackage.qke;
import defpackage.r0t;
import defpackage.rbx;
import defpackage.s76;
import defpackage.sbx;
import defpackage.u6r;
import defpackage.wg10;
import defpackage.wnt;
import defpackage.x4j0;
import defpackage.xby;
import defpackage.xg10;
import defpackage.xir;
import defpackage.yir;
import defpackage.zir;
import defpackage.zzs;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes.dex */
public final class d implements qjr {
    public final wnt a;
    public final lx4 b;
    public final ajr c;
    public final i d;
    public final j e;
    public final blh f;

    public d(wnt wntVar, lx4 lx4Var, ajr ajrVar, i iVar, j jVar, blh blhVar) {
        this.a = wntVar;
        this.b = lx4Var;
        this.c = ajrVar;
        this.d = iVar;
        this.e = jVar;
        this.f = blhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0219  */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, zir] */
    /* JADX WARN: Type inference failed for: r5v20, types: [kotlinx.serialization.json.b] */
    /* JADX WARN: Type inference failed for: r5v23, types: [kotlinx.serialization.json.b] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v47 */
    @Override // defpackage.qjr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(omt omtVar, ContinuationImpl continuationImpl) {
        MainScreenFlexInterceptor$intercept$1 mainScreenFlexInterceptor$intercept$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        kotlinx.serialization.json.b a;
        omt omtVar2;
        kotlinx.serialization.json.c cVar;
        Ref$ObjectRef ref$ObjectRef2;
        hd7 hd7Var;
        hd7 hd7Var2;
        Object a2;
        Ref$ObjectRef ref$ObjectRef3;
        ?? r2;
        ivj0 ivj0Var;
        wg10 contentType;
        int i2;
        Ref$ObjectRef ref$ObjectRef4;
        ?? a3;
        String str;
        kotlinx.serialization.json.b bVar;
        zzs zzsVar;
        Ref$ObjectRef ref$ObjectRef5;
        Object obj;
        kotlinx.serialization.json.c cVar2;
        Object a4;
        kotlinx.serialization.json.b bVar2;
        Ref$ObjectRef ref$ObjectRef6;
        kotlinx.serialization.json.c cVar3;
        String str2;
        String a5;
        zzs zzsVar2;
        String str3;
        zir b;
        r0 r0Var;
        Object value;
        Object obj2;
        SuperAppMainScreenFeaturesExperiment superAppMainScreenFeaturesExperiment;
        if (continuationImpl instanceof MainScreenFlexInterceptor$intercept$1) {
            mainScreenFlexInterceptor$intercept$1 = (MainScreenFlexInterceptor$intercept$1) continuationImpl;
            int i3 = mainScreenFlexInterceptor$intercept$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mainScreenFlexInterceptor$intercept$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = mainScreenFlexInterceptor$intercept$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenFlexInterceptor$intercept$1.label;
                int i4 = 6;
                ajr ajrVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    x4j0 x4j0Var = omtVar.b;
                    s76 s76Var = x4j0Var.c;
                    if (s76Var == null || !cvu0.s(x4j0Var.a.b(), "mlutp/v1/widgets/layout/superapp", false)) {
                        x4j0 x4j0Var2 = omtVar.b;
                        mainScreenFlexInterceptor$intercept$1.L$0 = null;
                        mainScreenFlexInterceptor$intercept$1.L$1 = null;
                        mainScreenFlexInterceptor$intercept$1.label = 1;
                        Object a6 = omtVar.a(x4j0Var2, mainScreenFlexInterceptor$intercept$1);
                        if (a6 != coroutineSingletons) {
                            return a6;
                        }
                    } else {
                        ref$ObjectRef = new Ref$ObjectRef();
                        ExperimentSource experimentSource = ExperimentSource.PRODUCTS;
                        blh blhVar = this.f;
                        hd7 b2 = blhVar.b(experimentSource, true);
                        hd7 b3 = blhVar.b(ExperimentSource.FINAL_SUGGEST, true);
                        a = s76Var.a();
                        kotlinx.serialization.json.c cVar4 = a instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) a : null;
                        if (cVar4 == null) {
                            omtVar2 = omtVar;
                            hd7Var2 = b3;
                            x4j0 a7 = x4j0.a(omtVar2.b, null, new com.yandex.go.flex.common.data.bdui.c(a), 3);
                            mainScreenFlexInterceptor$intercept$1.L$0 = null;
                            mainScreenFlexInterceptor$intercept$1.L$1 = null;
                            mainScreenFlexInterceptor$intercept$1.L$2 = ref$ObjectRef;
                            mainScreenFlexInterceptor$intercept$1.L$3 = null;
                            mainScreenFlexInterceptor$intercept$1.L$4 = hd7Var2;
                            mainScreenFlexInterceptor$intercept$1.L$5 = null;
                            mainScreenFlexInterceptor$intercept$1.L$6 = null;
                            mainScreenFlexInterceptor$intercept$1.L$7 = null;
                            mainScreenFlexInterceptor$intercept$1.L$8 = null;
                            mainScreenFlexInterceptor$intercept$1.label = 3;
                            a2 = omtVar2.a(a7, mainScreenFlexInterceptor$intercept$1);
                            if (a2 != coroutineSingletons) {
                                ref$ObjectRef3 = ref$ObjectRef;
                                obj3 = a2;
                                ivj0Var = (ivj0) obj3;
                                contentType = ivj0Var.e.getContentType();
                                i2 = ivj0Var.c;
                                if (200 <= i2) {
                                    wg10 wg10Var = xg10.a;
                                    if (contentType.b.equals(ClidProvider.APPLICATION)) {
                                        ref$ObjectRef4 = new Ref$ObjectRef();
                                        a3 = ivj0Var.e.a();
                                        if (a3 instanceof kotlinx.serialization.json.c) {
                                        }
                                        com.yandex.go.flex.common.data.bdui.c cVar5 = new com.yandex.go.flex.common.data.bdui.c(a3);
                                        if (ref$ObjectRef3.element != null) {
                                        }
                                        return new ivj0(ivj0Var.a, ivj0Var.b, ivj0Var.c, ivj0Var.d, cVar5, ivj0Var.f, ivj0Var.g);
                                    }
                                }
                                return ivj0Var;
                            }
                        } else {
                            kotlinx.serialization.json.c cVar6 = b2.c;
                            kotlinx.serialization.json.c cVar7 = cVar6 != null ? new kotlinx.serialization.json.c(kotlin.collections.b.n(cVar4, cVar6)) : cVar4;
                            mainScreenFlexInterceptor$intercept$1.L$0 = omtVar;
                            mainScreenFlexInterceptor$intercept$1.L$1 = null;
                            mainScreenFlexInterceptor$intercept$1.L$2 = ref$ObjectRef;
                            mainScreenFlexInterceptor$intercept$1.L$3 = null;
                            mainScreenFlexInterceptor$intercept$1.L$4 = b3;
                            mainScreenFlexInterceptor$intercept$1.L$5 = null;
                            mainScreenFlexInterceptor$intercept$1.L$6 = null;
                            mainScreenFlexInterceptor$intercept$1.L$7 = null;
                            mainScreenFlexInterceptor$intercept$1.L$8 = cVar7;
                            mainScreenFlexInterceptor$intercept$1.label = 2;
                            Object y = kotlinx.coroutines.flow.e.y(new mth(ajrVar.b, 6), mainScreenFlexInterceptor$intercept$1);
                            if (y != coroutineSingletons) {
                                kotlinx.serialization.json.c cVar8 = cVar7;
                                omtVar2 = omtVar;
                                cVar = cVar8;
                                ref$ObjectRef2 = ref$ObjectRef;
                                obj3 = y;
                                hd7Var = b3;
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj3);
                    return obj3;
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cVar2 = (kotlinx.serialization.json.c) mainScreenFlexInterceptor$intercept$1.L$15;
                        bVar2 = (kotlinx.serialization.json.b) mainScreenFlexInterceptor$intercept$1.L$12;
                        str2 = (String) mainScreenFlexInterceptor$intercept$1.L$11;
                        kotlinx.serialization.json.c cVar9 = (kotlinx.serialization.json.c) mainScreenFlexInterceptor$intercept$1.L$10;
                        ref$ObjectRef6 = (Ref$ObjectRef) mainScreenFlexInterceptor$intercept$1.L$7;
                        ivj0Var = (ivj0) mainScreenFlexInterceptor$intercept$1.L$5;
                        ref$ObjectRef3 = (Ref$ObjectRef) mainScreenFlexInterceptor$intercept$1.L$2;
                        kotlin.b.b(obj3);
                        cVar3 = cVar9;
                        superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj3;
                        if (superAppMainScreenFeaturesExperiment == null) {
                            SuperAppMainScreenFeatures superAppMainScreenFeatures = new SuperAppMainScreenFeatures(superAppMainScreenFeaturesExperiment.c && superAppMainScreenFeaturesExperiment.d.e.a);
                            rbx rbxVar = sbx.d;
                            rbxVar.getClass();
                            bVar = new kotlinx.serialization.json.c(kotlin.collections.b.o(cVar2, new Pair("__document_features", gwk0.J(rbxVar, superAppMainScreenFeatures, SuperAppMainScreenFeatures.Companion.serializer()))));
                        } else {
                            bVar = cVar2;
                        }
                        str = str2;
                        ref$ObjectRef4 = ref$ObjectRef6;
                        a3 = cVar3;
                        if (bVar != bVar2) {
                            a3 = bVar == null ? new kotlinx.serialization.json.c(kotlin.collections.b.j(str, a3)) : new kotlinx.serialization.json.c(kotlin.collections.b.o(a3, new Pair(str, bVar)));
                        }
                        com.yandex.go.flex.common.data.bdui.c cVar52 = new com.yandex.go.flex.common.data.bdui.c(a3);
                        if (ref$ObjectRef3.element != null && ref$ObjectRef4.element != null) {
                            a5 = ivj0Var.b.a("X-YaTraceId");
                            xir xirVar = (xir) ref$ObjectRef3.element;
                            d2t d2tVar = xirVar.a;
                            q6r q6rVar = xirVar.b;
                            u6r u6rVar = (u6r) ref$ObjectRef4.element;
                            if (a5 != null) {
                                u6rVar = u6r.g(u6rVar, a5);
                            }
                            q0t q0tVar = d2tVar.b.f;
                            r0t r0tVar = new r0t(0);
                            List list = u6rVar.c;
                            ksw kswVar = list == null ? (ksw) kotlin.collections.a.R(list) : null;
                            zzsVar2 = kswVar == null ? kswVar.d : null;
                            str3 = u6rVar.n;
                            ru.yandex.taxi.analytics.i d = ((ru.yandex.taxi.analytics.j) this.b).d("SuperappMain.FinalSuggestResponse");
                            d.d("fs_request_id", q0tVar.a);
                            if (str3 != null) {
                                d.d("ls_trace_id", str3);
                            }
                            if (zzsVar2 != null) {
                                d.a(zzsVar2.a, "lat");
                                d.a(zzsVar2.b, "lon");
                            }
                            d.j((r2 & 1) == 0);
                            d.m();
                            b = com.yandex.go.flex.common.api.c.b(ajrVar);
                            if (((b instanceof yir) || ((yir) b).c.contains(q0tVar)) && this.d.n(r0tVar, d2tVar, q6rVar, u6rVar) && zzsVar2 != null) {
                                r0Var = ajrVar.a;
                                do {
                                    value = r0Var.getValue();
                                    obj2 = (zir) value;
                                    if (obj2 instanceof xir) {
                                        xir xirVar2 = (xir) obj2;
                                        if (xirVar2.c().contains(q0tVar)) {
                                            obj2 = jpa1.d(xirVar2, zzsVar2, r0tVar);
                                        }
                                    }
                                } while (!r0Var.k(value, obj2));
                            }
                        }
                        return new ivj0(ivj0Var.a, ivj0Var.b, ivj0Var.c, ivj0Var.d, cVar52, ivj0Var.f, ivj0Var.g);
                    }
                    hd7Var2 = (hd7) mainScreenFlexInterceptor$intercept$1.L$4;
                    Ref$ObjectRef ref$ObjectRef7 = (Ref$ObjectRef) mainScreenFlexInterceptor$intercept$1.L$2;
                    kotlin.b.b(obj3);
                    ref$ObjectRef3 = ref$ObjectRef7;
                    ivj0Var = (ivj0) obj3;
                    contentType = ivj0Var.e.getContentType();
                    i2 = ivj0Var.c;
                    if (200 <= i2 && i2 < 300 && contentType != null) {
                        wg10 wg10Var2 = xg10.a;
                        if (contentType.b.equals(ClidProvider.APPLICATION) && contentType.c.equals("json")) {
                            ref$ObjectRef4 = new Ref$ObjectRef();
                            a3 = ivj0Var.e.a();
                            if (a3 instanceof kotlinx.serialization.json.c) {
                                kotlinx.serialization.json.c cVar10 = (kotlinx.serialization.json.c) a3;
                                str = "shared";
                                bVar = (kotlinx.serialization.json.b) cVar10.get("shared");
                                kotlinx.serialization.json.c cVar11 = bVar instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar : null;
                                if (cVar11 != null) {
                                    try {
                                        cVar11 = qke.D(cVar11, new String[]{"finalsuggest"}, new ga1(i4, ref$ObjectRef4, this, hd7Var2));
                                    } catch (Throwable th) {
                                        xby.t(jst.e, "MainScreenFlexInterceptor", th, null, 10);
                                    }
                                    u6r u6rVar2 = (u6r) ref$ObjectRef4.element;
                                    if (u6rVar2 != null) {
                                        List list2 = u6rVar2.c;
                                        ksw kswVar2 = list2 != null ? (ksw) kotlin.collections.a.R(list2) : null;
                                        if (kswVar2 != null) {
                                            zzsVar = kswVar2.d;
                                            if (zzsVar == null) {
                                                ref$ObjectRef5 = ref$ObjectRef3;
                                                MainScreenResolvedPosition mainScreenResolvedPosition = new MainScreenResolvedPosition(zzsVar.a, zzsVar.b, System.currentTimeMillis());
                                                rbx rbxVar2 = sbx.d;
                                                rbxVar2.getClass();
                                                cVar2 = new kotlinx.serialization.json.c(kotlin.collections.b.o(cVar11, new Pair("_resolved_position", gwk0.J(rbxVar2, mainScreenResolvedPosition, MainScreenResolvedPosition.Companion.serializer()))));
                                                obj = null;
                                            } else {
                                                ref$ObjectRef5 = ref$ObjectRef3;
                                                obj = null;
                                                cVar2 = cVar11;
                                            }
                                            mainScreenFlexInterceptor$intercept$1.L$0 = obj;
                                            mainScreenFlexInterceptor$intercept$1.L$1 = obj;
                                            Ref$ObjectRef ref$ObjectRef8 = ref$ObjectRef5;
                                            mainScreenFlexInterceptor$intercept$1.L$2 = ref$ObjectRef8;
                                            mainScreenFlexInterceptor$intercept$1.L$3 = obj;
                                            mainScreenFlexInterceptor$intercept$1.L$4 = obj;
                                            mainScreenFlexInterceptor$intercept$1.L$5 = ivj0Var;
                                            mainScreenFlexInterceptor$intercept$1.L$6 = obj;
                                            mainScreenFlexInterceptor$intercept$1.L$7 = ref$ObjectRef4;
                                            mainScreenFlexInterceptor$intercept$1.L$8 = obj;
                                            mainScreenFlexInterceptor$intercept$1.L$9 = obj;
                                            mainScreenFlexInterceptor$intercept$1.L$10 = cVar10;
                                            mainScreenFlexInterceptor$intercept$1.L$11 = "shared";
                                            mainScreenFlexInterceptor$intercept$1.L$12 = bVar;
                                            mainScreenFlexInterceptor$intercept$1.L$13 = obj;
                                            mainScreenFlexInterceptor$intercept$1.L$14 = obj;
                                            mainScreenFlexInterceptor$intercept$1.L$15 = cVar2;
                                            mainScreenFlexInterceptor$intercept$1.label = 4;
                                            a4 = this.e.b.a(mainScreenFlexInterceptor$intercept$1);
                                            if (a4 != coroutineSingletons) {
                                                ref$ObjectRef3 = ref$ObjectRef8;
                                                bVar2 = bVar;
                                                ref$ObjectRef6 = ref$ObjectRef4;
                                                obj3 = a4;
                                                cVar3 = cVar10;
                                                str2 = "shared";
                                                superAppMainScreenFeaturesExperiment = (SuperAppMainScreenFeaturesExperiment) obj3;
                                                if (superAppMainScreenFeaturesExperiment == null) {
                                                }
                                                str = str2;
                                                ref$ObjectRef4 = ref$ObjectRef6;
                                                a3 = cVar3;
                                                if (bVar != bVar2) {
                                                }
                                            }
                                            return coroutineSingletons;
                                        }
                                    }
                                    zzsVar = null;
                                    if (zzsVar == null) {
                                    }
                                    mainScreenFlexInterceptor$intercept$1.L$0 = obj;
                                    mainScreenFlexInterceptor$intercept$1.L$1 = obj;
                                    Ref$ObjectRef ref$ObjectRef82 = ref$ObjectRef5;
                                    mainScreenFlexInterceptor$intercept$1.L$2 = ref$ObjectRef82;
                                    mainScreenFlexInterceptor$intercept$1.L$3 = obj;
                                    mainScreenFlexInterceptor$intercept$1.L$4 = obj;
                                    mainScreenFlexInterceptor$intercept$1.L$5 = ivj0Var;
                                    mainScreenFlexInterceptor$intercept$1.L$6 = obj;
                                    mainScreenFlexInterceptor$intercept$1.L$7 = ref$ObjectRef4;
                                    mainScreenFlexInterceptor$intercept$1.L$8 = obj;
                                    mainScreenFlexInterceptor$intercept$1.L$9 = obj;
                                    mainScreenFlexInterceptor$intercept$1.L$10 = cVar10;
                                    mainScreenFlexInterceptor$intercept$1.L$11 = "shared";
                                    mainScreenFlexInterceptor$intercept$1.L$12 = bVar;
                                    mainScreenFlexInterceptor$intercept$1.L$13 = obj;
                                    mainScreenFlexInterceptor$intercept$1.L$14 = obj;
                                    mainScreenFlexInterceptor$intercept$1.L$15 = cVar2;
                                    mainScreenFlexInterceptor$intercept$1.label = 4;
                                    a4 = this.e.b.a(mainScreenFlexInterceptor$intercept$1);
                                    if (a4 != coroutineSingletons) {
                                    }
                                    return coroutineSingletons;
                                }
                                bVar2 = bVar;
                                a3 = cVar10;
                                if (bVar != bVar2) {
                                }
                            }
                            com.yandex.go.flex.common.data.bdui.c cVar522 = new com.yandex.go.flex.common.data.bdui.c(a3);
                            if (ref$ObjectRef3.element != null) {
                                a5 = ivj0Var.b.a("X-YaTraceId");
                                xir xirVar3 = (xir) ref$ObjectRef3.element;
                                d2t d2tVar2 = xirVar3.a;
                                q6r q6rVar2 = xirVar3.b;
                                u6r u6rVar3 = (u6r) ref$ObjectRef4.element;
                                if (a5 != null) {
                                }
                                q0t q0tVar2 = d2tVar2.b.f;
                                r0t r0tVar2 = new r0t(0);
                                List list3 = u6rVar3.c;
                                if (list3 == null) {
                                }
                                if (kswVar == null) {
                                }
                                str3 = u6rVar3.n;
                                ru.yandex.taxi.analytics.i d2 = ((ru.yandex.taxi.analytics.j) this.b).d("SuperappMain.FinalSuggestResponse");
                                d2.d("fs_request_id", q0tVar2.a);
                                if (str3 != null) {
                                }
                                if (zzsVar2 != null) {
                                }
                                d2.j((r2 & 1) == 0);
                                d2.m();
                                b = com.yandex.go.flex.common.api.c.b(ajrVar);
                                if (b instanceof yir) {
                                }
                                r0Var = ajrVar.a;
                                do {
                                    value = r0Var.getValue();
                                    obj2 = (zir) value;
                                    if (obj2 instanceof xir) {
                                    }
                                } while (!r0Var.k(value, obj2));
                            }
                            return new ivj0(ivj0Var.a, ivj0Var.b, ivj0Var.c, ivj0Var.d, cVar522, ivj0Var.f, ivj0Var.g);
                        }
                    }
                    return ivj0Var;
                }
                cVar = (kotlinx.serialization.json.c) mainScreenFlexInterceptor$intercept$1.L$8;
                hd7Var = (hd7) mainScreenFlexInterceptor$intercept$1.L$4;
                ref$ObjectRef2 = (Ref$ObjectRef) mainScreenFlexInterceptor$intercept$1.L$2;
                omtVar2 = (omt) mainScreenFlexInterceptor$intercept$1.L$0;
                kotlin.b.b(obj3);
                r2 = (zir) obj3;
                if (r2 instanceof xir) {
                    ref$ObjectRef2.element = r2;
                    cVar = qke.D(cVar, new String[]{"payload", "request"}, new ga1(5, this, (xir) r2, hd7Var));
                }
                hd7 hd7Var3 = hd7Var;
                a = cVar;
                hd7Var2 = hd7Var3;
                ref$ObjectRef = ref$ObjectRef2;
                x4j0 a72 = x4j0.a(omtVar2.b, null, new com.yandex.go.flex.common.data.bdui.c(a), 3);
                mainScreenFlexInterceptor$intercept$1.L$0 = null;
                mainScreenFlexInterceptor$intercept$1.L$1 = null;
                mainScreenFlexInterceptor$intercept$1.L$2 = ref$ObjectRef;
                mainScreenFlexInterceptor$intercept$1.L$3 = null;
                mainScreenFlexInterceptor$intercept$1.L$4 = hd7Var2;
                mainScreenFlexInterceptor$intercept$1.L$5 = null;
                mainScreenFlexInterceptor$intercept$1.L$6 = null;
                mainScreenFlexInterceptor$intercept$1.L$7 = null;
                mainScreenFlexInterceptor$intercept$1.L$8 = null;
                mainScreenFlexInterceptor$intercept$1.label = 3;
                a2 = omtVar2.a(a72, mainScreenFlexInterceptor$intercept$1);
                if (a2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        mainScreenFlexInterceptor$intercept$1 = new MainScreenFlexInterceptor$intercept$1(this, continuationImpl);
        Object obj32 = mainScreenFlexInterceptor$intercept$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenFlexInterceptor$intercept$1.label;
        int i42 = 6;
        ajr ajrVar2 = this.c;
        if (i != 0) {
        }
        r2 = (zir) obj32;
        if (r2 instanceof xir) {
        }
        hd7 hd7Var32 = hd7Var;
        a = cVar;
        hd7Var2 = hd7Var32;
        ref$ObjectRef = ref$ObjectRef2;
        x4j0 a722 = x4j0.a(omtVar2.b, null, new com.yandex.go.flex.common.data.bdui.c(a), 3);
        mainScreenFlexInterceptor$intercept$1.L$0 = null;
        mainScreenFlexInterceptor$intercept$1.L$1 = null;
        mainScreenFlexInterceptor$intercept$1.L$2 = ref$ObjectRef;
        mainScreenFlexInterceptor$intercept$1.L$3 = null;
        mainScreenFlexInterceptor$intercept$1.L$4 = hd7Var2;
        mainScreenFlexInterceptor$intercept$1.L$5 = null;
        mainScreenFlexInterceptor$intercept$1.L$6 = null;
        mainScreenFlexInterceptor$intercept$1.L$7 = null;
        mainScreenFlexInterceptor$intercept$1.L$8 = null;
        mainScreenFlexInterceptor$intercept$1.label = 3;
        a2 = omtVar2.a(a722, mainScreenFlexInterceptor$intercept$1);
        if (a2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
