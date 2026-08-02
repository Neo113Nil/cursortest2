package com.yandex.go.multimodal_route.ui.rate_route;

import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteButtonType;
import defpackage.cv40;
import defpackage.es40;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.jv40;
import defpackage.kv40;
import defpackage.lv40;
import defpackage.mv40;
import defpackage.nv40;
import defpackage.ny61;
import defpackage.ov40;
import defpackage.pv40;
import defpackage.qu;
import defpackage.qv40;
import defpackage.rv40;
import defpackage.tsq;
import defpackage.w511;
import defpackage.wv40;
import defpackage.x4e;
import defpackage.yu40;
import defpackage.zu40;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class f {
    public final cv40 a;
    public final zu40 b;
    public final wv40 c;
    public final h3y d;
    public final yu40 e;
    public final es40 f;

    public f(cv40 cv40Var, zu40 zu40Var, wv40 wv40Var, h3y h3yVar, yu40 yu40Var, es40 es40Var) {
        this.a = cv40Var;
        this.b = zu40Var;
        this.c = wv40Var;
        this.d = h3yVar;
        this.e = yu40Var;
        this.f = es40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, rv40 rv40Var, jv40 jv40Var, ContinuationImpl continuationImpl) {
        MultimodalRoutesRateScreenUiActionInteractor$handleAction$1 multimodalRoutesRateScreenUiActionInteractor$handleAction$1;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType;
        int intValue;
        String str7;
        Set set;
        rv40 rv40Var2 = rv40Var;
        if (continuationImpl instanceof MultimodalRoutesRateScreenUiActionInteractor$handleAction$1) {
            multimodalRoutesRateScreenUiActionInteractor$handleAction$1 = (MultimodalRoutesRateScreenUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = multimodalRoutesRateScreenUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRoutesRateScreenUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRoutesRateScreenUiActionInteractor$handleAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRoutesRateScreenUiActionInteractor$handleAction$1.label;
                wv40 wv40Var = this.c;
                zu40 zu40Var = this.b;
                cv40 cv40Var = this.a;
                lv40 lv40Var = lv40.a;
                str3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(rv40Var2 instanceof qv40) && !jl40.l(rv40Var2, lv40Var)) {
                        if (rv40Var2 instanceof kv40) {
                            jv40Var.a.r(new qu(9));
                        } else {
                            if (rv40Var2 instanceof nv40) {
                                String str8 = ((nv40) rv40Var2).a;
                                str4 = str;
                                multimodalRoutesRateScreenUiActionInteractor$handleAction$1.L$0 = str4;
                                str5 = str2;
                                multimodalRoutesRateScreenUiActionInteractor$handleAction$1.L$1 = str5;
                                multimodalRoutesRateScreenUiActionInteractor$handleAction$1.L$2 = rv40Var2;
                                multimodalRoutesRateScreenUiActionInteractor$handleAction$1.L$3 = null;
                                multimodalRoutesRateScreenUiActionInteractor$handleAction$1.label = 1;
                                if (b(str8, jv40Var, multimodalRoutesRateScreenUiActionInteractor$handleAction$1) == obj2) {
                                    return obj2;
                                }
                            } else {
                                str4 = str;
                                str5 = str2;
                                if (rv40Var2 instanceof ov40) {
                                    x4e.z(((ov40) rv40Var2).a, cv40Var.a, null);
                                } else if (rv40Var2 instanceof mv40) {
                                    zu40Var.a.l(((mv40) rv40Var2).a);
                                } else {
                                    if (!(rv40Var2 instanceof pv40)) {
                                        w511.b();
                                        return null;
                                    }
                                    tsq tsqVar = ((pv40) rv40Var2).a;
                                    r0 r0Var = wv40Var.a;
                                    Iterable iterable = (Set) r0Var.getValue();
                                    if (iterable == null) {
                                        iterable = new LinkedHashSet();
                                    }
                                    Set M0 = kotlin.collections.a.M0(iterable);
                                    boolean contains = M0.contains(tsqVar.a);
                                    String str9 = tsqVar.a;
                                    if (contains) {
                                        M0.remove(str9);
                                    } else {
                                        M0.add(str9);
                                    }
                                    r0Var.m(null, M0);
                                }
                            }
                            str6 = str4;
                        }
                    }
                    str4 = str;
                    str5 = str2;
                    str6 = str4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rv40Var2 = (rv40) multimodalRoutesRateScreenUiActionInteractor$handleAction$1.L$2;
                    String str10 = (String) multimodalRoutesRateScreenUiActionInteractor$handleAction$1.L$1;
                    str6 = (String) multimodalRoutesRateScreenUiActionInteractor$handleAction$1.L$0;
                    kotlin.b.b(obj);
                    str5 = str10;
                }
                if (!jl40.l(rv40Var2, kv40.a)) {
                    multimodalRouteAnalytics$MultimodalRouteButtonType = MultimodalRouteAnalytics$MultimodalRouteButtonType.Close;
                } else if (rv40Var2 instanceof nv40) {
                    multimodalRouteAnalytics$MultimodalRouteButtonType = MultimodalRouteAnalytics$MultimodalRouteButtonType.Ready;
                } else if (rv40Var2 instanceof ov40) {
                    multimodalRouteAnalytics$MultimodalRouteButtonType = MultimodalRouteAnalytics$MultimodalRouteButtonType.RatingTap;
                } else if (rv40Var2 instanceof pv40) {
                    multimodalRouteAnalytics$MultimodalRouteButtonType = MultimodalRouteAnalytics$MultimodalRouteButtonType.HintsTap;
                } else {
                    if (!jl40.l(rv40Var2, lv40Var)) {
                        if (!jl40.l(rv40Var2, qv40.a) && !(rv40Var2 instanceof mv40)) {
                            w511.b();
                            return null;
                        }
                        return zy11.a;
                    }
                    multimodalRouteAnalytics$MultimodalRouteButtonType = MultimodalRouteAnalytics$MultimodalRouteButtonType.CommentTap;
                }
                Integer num = (Integer) cv40Var.a.getValue();
                intValue = num == null ? num.intValue() : 0;
                if (intValue <= 3 && (set = (Set) wv40Var.a.getValue()) != null) {
                    str3 = kotlin.collections.a.X(set, ",", null, null, null, 62);
                }
                str7 = zu40Var.c;
                HashMap p = x4e.p("multimodal_id", str6);
                p.put("rating", Integer.valueOf(intValue));
                if (str3 != null) {
                    p.put("negative_reason", str3);
                }
                if (str7 != null) {
                    p.put("comment", str7);
                }
                p.put("button_type", multimodalRouteAnalytics$MultimodalRouteButtonType.getEventValue());
                p.put("mm_name", str5);
                this.f.a.a("MultimodalRoute.ScoreOffer.Tapped", p, 1, new HashMap());
                return zy11.a;
            }
        }
        multimodalRoutesRateScreenUiActionInteractor$handleAction$1 = new MultimodalRoutesRateScreenUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj3 = multimodalRoutesRateScreenUiActionInteractor$handleAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRoutesRateScreenUiActionInteractor$handleAction$1.label;
        wv40 wv40Var2 = this.c;
        zu40 zu40Var2 = this.b;
        cv40 cv40Var2 = this.a;
        lv40 lv40Var2 = lv40.a;
        str3 = null;
        if (i != 0) {
        }
        if (!jl40.l(rv40Var2, kv40.a)) {
        }
        Integer num2 = (Integer) cv40Var2.a.getValue();
        if (num2 == null) {
        }
        if (intValue <= 3) {
            str3 = kotlin.collections.a.X(set, ",", null, null, null, 62);
        }
        str7 = zu40Var2.c;
        HashMap p2 = x4e.p("multimodal_id", str6);
        p2.put("rating", Integer.valueOf(intValue));
        if (str3 != null) {
        }
        if (str7 != null) {
        }
        p2.put("button_type", multimodalRouteAnalytics$MultimodalRouteButtonType.getEventValue());
        p2.put("mm_name", str5);
        this.f.a.a("MultimodalRoute.ScoreOffer.Tapped", p2, 1, new HashMap());
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, jv40 jv40Var, ContinuationImpl continuationImpl) {
        MultimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1 multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1;
        int i;
        if (continuationImpl instanceof MultimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1) {
            multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1 = (MultimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1) continuationImpl;
            int i2 = multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1.label = i2 - Integer.MIN_VALUE;
                MultimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1 multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$12 = multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1;
                Object obj = multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.e.e(str);
                    Integer num = (Integer) this.a.b.a.getValue();
                    String str2 = (String) this.b.b.a.getValue();
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    if (num != null || !evu0.J(str3)) {
                        com.yandex.go.multimodal_route.ui.rate_route.repository.a aVar = (com.yandex.go.multimodal_route.ui.rate_route.repository.a) this.d.get();
                        Set set = (Set) this.c.b.a.getValue();
                        List J0 = set != null ? kotlin.collections.a.J0(set) : EmptyList.a;
                        multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$12.L$0 = null;
                        multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$12.L$1 = jv40Var;
                        multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$12.L$2 = null;
                        multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$12.L$3 = null;
                        multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$12.label = 1;
                        if (aVar.a(str, num, J0, str3, multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jv40Var = (jv40) multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$12.L$1;
                    kotlin.b.b(obj);
                }
                jv40Var.a.r(new qu(9));
                return zy11.a;
            }
        }
        multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1 = new MultimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1(this, continuationImpl);
        MultimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1 multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$122 = multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$1;
        Object obj2 = multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRoutesRateScreenUiActionInteractor$onReadyButtonClicked$122.label;
        if (i != 0) {
        }
        jv40Var.a.r(new qu(9));
        return zy11.a;
    }
}
