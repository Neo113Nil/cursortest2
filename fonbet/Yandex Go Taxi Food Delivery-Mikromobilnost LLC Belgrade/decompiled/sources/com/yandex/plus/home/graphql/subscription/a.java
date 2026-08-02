package com.yandex.plus.home.graphql.subscription;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.data.common.ColorPair;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.type.ActionType;
import com.yandex.plus.core.graphql.type.CONSUMER_TYPE;
import com.yandex.plus.core.graphql.type.SECTION_VIEW_TYPE;
import com.yandex.plus.core.graphql.type.SubscriptionButtonType;
import com.yandex.plus.core.graphql.type.SubscriptionPaymentMethod;
import com.yandex.plus.core.graphql.type.SubscriptionWidgetType;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import defpackage.a7e0;
import defpackage.aeg;
import defpackage.afg;
import defpackage.beg;
import defpackage.bfc;
import defpackage.bfg;
import defpackage.bob1;
import defpackage.c2e;
import defpackage.c7e0;
import defpackage.ceg;
import defpackage.cfg;
import defpackage.d1e;
import defpackage.d2e;
import defpackage.d7e0;
import defpackage.e1e;
import defpackage.e2e;
import defpackage.ef41;
import defpackage.efg;
import defpackage.fpu;
import defpackage.g1e;
import defpackage.geg;
import defpackage.h1e;
import defpackage.h73;
import defpackage.heg;
import defpackage.hou0;
import defpackage.i1e;
import defpackage.ipu;
import defpackage.jl40;
import defpackage.jpu;
import defpackage.keg;
import defpackage.leg;
import defpackage.meg;
import defpackage.n7e0;
import defpackage.ny61;
import defpackage.o7e0;
import defpackage.oeg;
import defpackage.p1e;
import defpackage.pax0;
import defpackage.q1e;
import defpackage.qeg;
import defpackage.qje;
import defpackage.qo2;
import defpackage.r1e;
import defpackage.reg;
import defpackage.s5r;
import defpackage.skd0;
import defpackage.tcc;
import defpackage.udg;
import defpackage.vdg;
import defpackage.vo2;
import defpackage.w1d0;
import defpackage.w1e;
import defpackage.x1e;
import defpackage.x6e0;
import defpackage.y1e;
import defpackage.y6e0;
import defpackage.ycc;
import defpackage.yw01;
import defpackage.z1e;
import defpackage.z6e0;
import defpackage.za5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final qo2 a;
    public final com.yandex.plus.core.graphql.target.a b;
    public final fpu c;
    public final hou0 d;

    public a(qo2 qo2Var, com.yandex.plus.core.graphql.target.a aVar, w1d0 w1d0Var) {
        this.a = qo2Var;
        this.b = aVar;
        this.c = new fpu(w1d0Var);
        this.d = new hou0(w1d0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        GraphQLWebConfigurationRepository$getHomeConfiguration$1 graphQLWebConfigurationRepository$getHomeConfiguration$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        ipu ipuVar;
        boolean z;
        Object obj2;
        heg hegVar;
        SubscriptionConfiguration subscriptionConfiguration;
        SubscriptionConfiguration.Subscription subscription;
        ceg cegVar;
        aeg aegVar;
        e1e e1eVar;
        beg begVar;
        h1e h1eVar;
        g1e e;
        g1e e2;
        List list;
        Object obj3;
        keg kegVar;
        meg megVar;
        z1e z1eVar;
        d1e d1eVar;
        qeg qegVar;
        d1e d1eVar2;
        d1e d1eVar3;
        leg legVar;
        leg legVar2;
        c2e c2eVar;
        String str7;
        List list2;
        List list3;
        List list4;
        List list5;
        if (continuationImpl instanceof GraphQLWebConfigurationRepository$getHomeConfiguration$1) {
            graphQLWebConfigurationRepository$getHomeConfiguration$1 = (GraphQLWebConfigurationRepository$getHomeConfiguration$1) continuationImpl;
            int i2 = graphQLWebConfigurationRepository$getHomeConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLWebConfigurationRepository$getHomeConfiguration$1.label = i2 - Integer.MIN_VALUE;
                GraphQLWebConfigurationRepository$getHomeConfiguration$1 graphQLWebConfigurationRepository$getHomeConfiguration$12 = graphQLWebConfigurationRepository$getHomeConfiguration$1;
                obj = graphQLWebConfigurationRepository$getHomeConfiguration$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLWebConfigurationRepository$getHomeConfiguration$12.label;
                int i3 = 1;
                if (i != 0) {
                    b.b(obj);
                    CONSUMER_TYPE consumer_type = CONSUMER_TYPE.HOME;
                    graphQLWebConfigurationRepository$getHomeConfiguration$12.L$0 = str;
                    graphQLWebConfigurationRepository$getHomeConfiguration$12.L$1 = str2;
                    graphQLWebConfigurationRepository$getHomeConfiguration$12.label = 1;
                    obj = com.yandex.plus.core.graphql.target.a.b(this.b, str2, consumer_type, str, graphQLWebConfigurationRepository$getHomeConfiguration$12, 4);
                    if (obj != coroutineSingletons) {
                        str3 = str;
                        str4 = str2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str5 = (String) graphQLWebConfigurationRepository$getHomeConfiguration$12.L$1;
                    str6 = (String) graphQLWebConfigurationRepository$getHomeConfiguration$12.L$0;
                    b.b(obj);
                    ipuVar = (ipu) ((vo2) obj).c;
                    if (ipuVar != null) {
                        throw new GraphQLParseException("home subscription config response data is null", null);
                    }
                    yw01 h = fpu.h(ipuVar);
                    Iterator it = h.a.iterator();
                    while (it.hasNext()) {
                        r1e r1eVar = (r1e) h.b.invoke(it.next());
                        List list6 = r1eVar.a;
                        List list7 = EmptyList.a;
                        if (list6 != null) {
                            list4 = new ArrayList();
                            Iterator it2 = list6.iterator();
                            while (it2.hasNext()) {
                                List list8 = ((p1e) it2.next()).b.e;
                                if (list8 == null) {
                                    list8 = list7;
                                }
                                ycc.r(list8, list4);
                            }
                        } else {
                            list4 = null;
                        }
                        if (list4 == null) {
                            list4 = list7;
                        }
                        boolean f = fpu.f(list4);
                        List list9 = r1eVar.b;
                        if (list9 != null) {
                            list5 = new ArrayList();
                            Iterator it3 = list9.iterator();
                            while (it3.hasNext()) {
                                List list10 = ((q1e) it3.next()).b.e;
                                if (list10 == null) {
                                    list10 = list7;
                                }
                                ycc.r(list10, list5);
                            }
                        } else {
                            list5 = null;
                        }
                        if (list5 != null) {
                            list7 = list5;
                        }
                        boolean f2 = fpu.f(list7);
                        if (f || f2) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    yw01 h2 = fpu.h(ipuVar);
                    Iterator it4 = h2.a.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = h2.b.invoke(it4.next());
                        SECTION_VIEW_TYPE section_view_type = ((r1e) obj2).c;
                        if (section_view_type == SECTION_VIEW_TYPE.PAY_BUTTON || section_view_type == SECTION_VIEW_TYPE.ACQUISITION) {
                            break;
                        }
                    }
                    r1e r1eVar2 = (r1e) obj2;
                    p1e p1eVar = (r1eVar2 == null || (list3 = r1eVar2.a) == null) ? null : (p1e) kotlin.collections.a.R(list3);
                    e2e e2eVar = p1eVar != null ? p1eVar.b : null;
                    ArrayList arrayList = ipuVar.b.b.a;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(((vdg) it5.next()).a);
                    }
                    s5r s5rVar = new s5r(kotlin.sequences.a.c(new h73(i3, arrayList2)));
                    while (true) {
                        if (!s5rVar.hasNext()) {
                            hegVar = null;
                            break;
                        }
                        hegVar = ((udg) s5rVar.next()).b;
                        SECTION_VIEW_TYPE section_view_type2 = hegVar.b;
                        if (section_view_type2 == SECTION_VIEW_TYPE.PAY_BUTTON || section_view_type2 == SECTION_VIEW_TYPE.ACQUISITION) {
                            break;
                        }
                    }
                    geg gegVar = (hegVar == null || (list2 = hegVar.a) == null) ? null : (geg) kotlin.collections.a.R(list2);
                    reg regVar = gegVar != null ? gegVar.b : null;
                    if (e2eVar != null) {
                        ArrayList arrayList3 = e2eVar.f;
                        w1d0 w1d0Var = this.c.a;
                        x1e x1eVar = (x1e) kotlin.collections.a.R(arrayList3);
                        if (x1eVar == null || (str7 = (c2eVar = x1eVar.b).e) == null) {
                            subscription = null;
                        } else {
                            boolean z2 = c2eVar.b;
                            SubscriptionButtonType subscriptionButtonType = c2eVar.c;
                            SubscriptionPaymentMethod subscriptionPaymentMethod = c2eVar.f;
                            SubscriptionWidgetType subscriptionWidgetType = c2eVar.g;
                            ArrayList arrayList4 = c2eVar.d;
                            w1e w1eVar = c2eVar.h;
                            subscription = za5.d(z2, subscriptionButtonType, subscriptionPaymentMethod, subscriptionWidgetType, str7, arrayList4, w1eVar != null ? za5.a(w1eVar.a, w1eVar.c, w1eVar.b) : null);
                        }
                        if (subscription != null) {
                            String str8 = e2eVar.a;
                            String str9 = e2eVar.b;
                            boolean isSilentPaymentEnabled = subscription.isSilentPaymentEnabled();
                            y1e y1eVar = e2eVar.d;
                            PlusThemedColor b = w1d0Var.b(y1eVar != null ? y1eVar.b.b : null, y1eVar != null ? y1eVar.a : null, (regVar == null || (legVar2 = regVar.b) == null) ? null : legVar2.b.b, (regVar == null || (legVar = regVar.b) == null) ? null : legVar.a);
                            i1e g = fpu.g(e2eVar, "legal");
                            SubscriptionConfiguration.PayInfo.LegalInfo b2 = za5.b((g == null || (d1eVar3 = g.f) == null) ? null : d1eVar3.a);
                            i1e g2 = fpu.g(e2eVar, "oneClickLegal");
                            SubscriptionConfiguration.PayInfo.OneClickLegalInfo c = za5.c((g2 == null || (d1eVar2 = g2.f) == null) ? null : d1eVar2.a, isSilentPaymentEnabled);
                            d2e d2eVar = e2eVar.c;
                            String str10 = d2eVar != null ? d2eVar.a : null;
                            String str11 = (regVar == null || (qegVar = regVar.a) == null) ? null : qegVar.a;
                            ColorPair.Companion.getClass();
                            SubscriptionConfiguration.PayInfo payInfo = new SubscriptionConfiguration.PayInfo(b2, c, new ColorPair(str10 != null ? bob1.b(str10) : null, str11 != null ? bob1.b(str11) : null), b);
                            i1e g3 = fpu.g(e2eVar, "payButtonText");
                            ArrayList arrayList5 = (g3 == null || (d1eVar = g3.f) == null) ? null : d1eVar.a;
                            x1e x1eVar2 = (x1e) kotlin.collections.a.R(arrayList3);
                            bfc bfcVar = (x1eVar2 == null || (z1eVar = x1eVar2.b.a) == null) ? null : z1eVar.b;
                            bfc bfcVar2 = (regVar == null || (kegVar = (keg) kotlin.collections.a.R(regVar.d)) == null || (megVar = kegVar.b.a) == null) ? null : megVar.b;
                            i1e g4 = fpu.g(e2eVar, "actionButton");
                            if (regVar != null && (list = regVar.c) != null) {
                                Iterator it6 = list.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it6.next();
                                    Iterator it7 = it6;
                                    if (jl40.l(((oeg) obj3).b.a, "actionButton")) {
                                        break;
                                    }
                                    it6 = it7;
                                }
                                oeg oegVar = (oeg) obj3;
                                if (oegVar != null) {
                                    cegVar = oegVar.b;
                                    subscriptionConfiguration = new SubscriptionConfiguration(str8, str9, subscription, payInfo, new SubscriptionConfiguration.PayButton((arrayList5 != null || (e2 = za5.e("trial", arrayList5)) == null) ? null : e2.b, (arrayList5 != null || (e = za5.e("noTrial", arrayList5)) == null) ? null : e.b, w1d0Var.b((g4 != null || (h1eVar = g4.d) == null) ? null : h1eVar.b, g4 == null ? g4.c : null, (cegVar != null || (begVar = cegVar.c) == null) ? null : begVar.b, cegVar == null ? cegVar.b : null), w1d0Var.b(bfcVar, (g4 != null || (e1eVar = g4.e) == null) ? null : e1eVar.a, bfcVar2, (cegVar != null || (aegVar = cegVar.d) == null) ? null : aegVar.a)));
                                    if (subscriptionConfiguration == null) {
                                        skd0.h(PlusLogTag.SUBSCRIPTION, "Shortcut for SubscriptionConfiguration was not found in home configuration", null);
                                    }
                                    ef41 ef41Var = new ef41(str6, str5, subscriptionConfiguration, z);
                                    skd0.g(PlusLogTag.SDK, "getHomeSubscriptionConfig() response=" + ef41Var);
                                    return ef41Var;
                                }
                            }
                            cegVar = null;
                            subscriptionConfiguration = new SubscriptionConfiguration(str8, str9, subscription, payInfo, new SubscriptionConfiguration.PayButton((arrayList5 != null || (e2 = za5.e("trial", arrayList5)) == null) ? null : e2.b, (arrayList5 != null || (e = za5.e("noTrial", arrayList5)) == null) ? null : e.b, w1d0Var.b((g4 != null || (h1eVar = g4.d) == null) ? null : h1eVar.b, g4 == null ? g4.c : null, (cegVar != null || (begVar = cegVar.c) == null) ? null : begVar.b, cegVar == null ? cegVar.b : null), w1d0Var.b(bfcVar, (g4 != null || (e1eVar = g4.e) == null) ? null : e1eVar.a, bfcVar2, (cegVar != null || (aegVar = cegVar.d) == null) ? null : aegVar.a)));
                            if (subscriptionConfiguration == null) {
                            }
                            ef41 ef41Var2 = new ef41(str6, str5, subscriptionConfiguration, z);
                            skd0.g(PlusLogTag.SDK, "getHomeSubscriptionConfig() response=" + ef41Var2);
                            return ef41Var2;
                        }
                    }
                    subscriptionConfiguration = null;
                    if (subscriptionConfiguration == null) {
                    }
                    ef41 ef41Var22 = new ef41(str6, str5, subscriptionConfiguration, z);
                    skd0.g(PlusLogTag.SDK, "getHomeSubscriptionConfig() response=" + ef41Var22);
                    return ef41Var22;
                }
                str4 = (String) graphQLWebConfigurationRepository$getHomeConfiguration$12.L$1;
                str3 = (String) graphQLWebConfigurationRepository$getHomeConfiguration$12.L$0;
                b.b(obj);
                pax0 pax0Var = (pax0) obj;
                skd0.b(PlusLogTag.SDK, "getHomeConfiguration() ".concat(qje.b0(pax0Var)));
                jpu jpuVar = new jpu(qje.F(pax0Var), qje.g(pax0Var));
                graphQLWebConfigurationRepository$getHomeConfiguration$12.L$0 = str3;
                graphQLWebConfigurationRepository$getHomeConfiguration$12.L$1 = str4;
                graphQLWebConfigurationRepository$getHomeConfiguration$12.L$2 = null;
                graphQLWebConfigurationRepository$getHomeConfiguration$12.label = 2;
                obj = com.yandex.plus.core.graphql.internal.a.d(this.a, jpuVar, graphQLWebConfigurationRepository$getHomeConfiguration$12);
                if (obj != coroutineSingletons) {
                    str5 = str4;
                    str6 = str3;
                    ipuVar = (ipu) ((vo2) obj).c;
                    if (ipuVar != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        graphQLWebConfigurationRepository$getHomeConfiguration$1 = new GraphQLWebConfigurationRepository$getHomeConfiguration$1(this, continuationImpl);
        GraphQLWebConfigurationRepository$getHomeConfiguration$1 graphQLWebConfigurationRepository$getHomeConfiguration$122 = graphQLWebConfigurationRepository$getHomeConfiguration$1;
        obj = graphQLWebConfigurationRepository$getHomeConfiguration$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLWebConfigurationRepository$getHomeConfiguration$122.label;
        int i32 = 1;
        if (i != 0) {
        }
        pax0 pax0Var2 = (pax0) obj;
        skd0.b(PlusLogTag.SDK, "getHomeConfiguration() ".concat(qje.b0(pax0Var2)));
        jpu jpuVar2 = new jpu(qje.F(pax0Var2), qje.g(pax0Var2));
        graphQLWebConfigurationRepository$getHomeConfiguration$122.L$0 = str3;
        graphQLWebConfigurationRepository$getHomeConfiguration$122.L$1 = str4;
        graphQLWebConfigurationRepository$getHomeConfiguration$122.L$2 = null;
        graphQLWebConfigurationRepository$getHomeConfiguration$122.label = 2;
        obj = com.yandex.plus.core.graphql.internal.a.d(this.a, jpuVar2, graphQLWebConfigurationRepository$getHomeConfiguration$122);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        GraphQLWebConfigurationRepository$getStoryConfiguration$1 graphQLWebConfigurationRepository$getStoryConfiguration$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str4;
        String str5;
        Object obj2;
        String str6;
        String str7;
        String str8;
        n7e0 n7e0Var;
        Object obj3;
        SubscriptionConfiguration.Subscription subscription;
        cfg cfgVar;
        SubscriptionConfiguration subscriptionConfiguration;
        String str9;
        Integer b;
        Integer b2;
        g1e e;
        g1e e2;
        d1e d1eVar;
        d1e d1eVar2;
        d1e d1eVar3;
        bfg bfgVar;
        String str10;
        Integer b3;
        String str11;
        Integer b4;
        Object obj4;
        afg afgVar;
        x6e0 x6e0Var;
        y6e0 y6e0Var;
        if (continuationImpl instanceof GraphQLWebConfigurationRepository$getStoryConfiguration$1) {
            graphQLWebConfigurationRepository$getStoryConfiguration$1 = (GraphQLWebConfigurationRepository$getStoryConfiguration$1) continuationImpl;
            int i2 = graphQLWebConfigurationRepository$getStoryConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLWebConfigurationRepository$getStoryConfiguration$1.label = i2 - Integer.MIN_VALUE;
                GraphQLWebConfigurationRepository$getStoryConfiguration$1 graphQLWebConfigurationRepository$getStoryConfiguration$12 = graphQLWebConfigurationRepository$getStoryConfiguration$1;
                obj = graphQLWebConfigurationRepository$getStoryConfiguration$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLWebConfigurationRepository$getStoryConfiguration$12.label;
                if (i != 0) {
                    b.b(obj);
                    CONSUMER_TYPE consumer_type = CONSUMER_TYPE.HOME;
                    str4 = str;
                    graphQLWebConfigurationRepository$getStoryConfiguration$12.L$0 = str4;
                    graphQLWebConfigurationRepository$getStoryConfiguration$12.L$1 = str2;
                    graphQLWebConfigurationRepository$getStoryConfiguration$12.L$2 = str3;
                    graphQLWebConfigurationRepository$getStoryConfiguration$12.label = 1;
                    Object b5 = com.yandex.plus.core.graphql.target.a.b(this.b, str3, consumer_type, str2, graphQLWebConfigurationRepository$getStoryConfiguration$12, 4);
                    if (b5 != coroutineSingletons) {
                        str5 = str2;
                        obj2 = b5;
                        str6 = str3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str7 = (String) graphQLWebConfigurationRepository$getStoryConfiguration$12.L$2;
                    str8 = (String) graphQLWebConfigurationRepository$getStoryConfiguration$12.L$1;
                    b.b(obj);
                    n7e0Var = (n7e0) ((vo2) obj).c;
                    if (n7e0Var != null) {
                        throw new GraphQLParseException("popup subscription config response data is null", null);
                    }
                    d7e0 d7e0Var = n7e0Var.a.b;
                    efg efgVar = (efg) kotlin.collections.a.b0(n7e0Var.b.b.a);
                    c7e0 c7e0Var = (c7e0) kotlin.collections.a.b0(d7e0Var.c);
                    if (c7e0Var != null) {
                        Iterator it = c7e0Var.d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it.next();
                            a7e0 a7e0Var = (a7e0) obj3;
                            if (((a7e0Var == null || (y6e0Var = a7e0Var.c) == null) ? null : y6e0Var.a) == ActionType.subscribe) {
                                break;
                            }
                        }
                        a7e0 a7e0Var2 = (a7e0) obj3;
                        if (a7e0Var2 != null) {
                            String str12 = a7e0Var2.d;
                            if (str12 != null) {
                                y6e0 y6e0Var2 = a7e0Var2.c;
                                subscription = za5.d(y6e0Var2 != null ? y6e0Var2.b : false, y6e0Var2 != null ? y6e0Var2.c : null, y6e0Var2 != null ? y6e0Var2.d : null, y6e0Var2 != null ? y6e0Var2.f : null, str12, y6e0Var2 != null ? y6e0Var2.e : EmptyList.a, (y6e0Var2 == null || (x6e0Var = y6e0Var2.g) == null) ? null : za5.a(x6e0Var.a, x6e0Var.c, x6e0Var.b));
                            } else {
                                subscription = null;
                            }
                            if (subscription != null) {
                                if (efgVar != null) {
                                    Iterator it2 = efgVar.d.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = it2.next();
                                        cfg cfgVar2 = (cfg) obj4;
                                        if (((cfgVar2 == null || (afgVar = cfgVar2.c) == null) ? null : afgVar.a) == ActionType.subscribe) {
                                            break;
                                        }
                                    }
                                    cfgVar = (cfg) obj4;
                                } else {
                                    cfgVar = null;
                                }
                                String str13 = d7e0Var.a;
                                String str14 = d7e0Var.b;
                                boolean isSilentPaymentEnabled = subscription.isSilentPaymentEnabled();
                                z6e0 z6e0Var = c7e0Var.b;
                                PlusThemedColor plusThemedColor = new PlusThemedColor((z6e0Var == null || (str11 = z6e0Var.a) == null || (b4 = bob1.b(str11)) == null) ? null : new PlusColor.Color(b4.intValue()), (efgVar == null || (bfgVar = efgVar.b) == null || (str10 = bfgVar.a) == null || (b3 = bob1.b(str10)) == null) ? null : new PlusColor.Color(b3.intValue()));
                                i1e f = hou0.f(c7e0Var, "legal");
                                SubscriptionConfiguration.PayInfo.LegalInfo b6 = za5.b((f == null || (d1eVar3 = f.f) == null) ? null : d1eVar3.a);
                                i1e f2 = hou0.f(c7e0Var, "oneClickLegal");
                                SubscriptionConfiguration.PayInfo.OneClickLegalInfo c = za5.c((f2 == null || (d1eVar2 = f2.f) == null) ? null : d1eVar2.a, isSilentPaymentEnabled);
                                String str15 = c7e0Var.a;
                                String str16 = efgVar != null ? efgVar.a : null;
                                ColorPair.Companion.getClass();
                                SubscriptionConfiguration.PayInfo payInfo = new SubscriptionConfiguration.PayInfo(b6, c, new ColorPair(str15 != null ? bob1.b(str15) : null, str16 != null ? bob1.b(str16) : null), plusThemedColor);
                                i1e f3 = hou0.f(c7e0Var, "payButtonText");
                                ArrayList arrayList = (f3 == null || (d1eVar = f3.f) == null) ? null : d1eVar.a;
                                String str17 = (arrayList == null || (e2 = za5.e("trial", arrayList)) == null) ? null : e2.b;
                                String str18 = (arrayList == null || (e = za5.e("noTrial", arrayList)) == null) ? null : e.b;
                                String str19 = a7e0Var2.a;
                                PlusThemedColor plusThemedColor2 = new PlusThemedColor((str19 == null || (b2 = bob1.b(str19)) == null) ? null : new PlusColor.Color(b2.intValue()), (cfgVar == null || (str9 = cfgVar.a) == null || (b = bob1.b(str9)) == null) ? null : new PlusColor.Color(b.intValue()));
                                w1d0 w1d0Var = this.d.a;
                                String str20 = a7e0Var2.b;
                                String str21 = cfgVar != null ? cfgVar.b : null;
                                w1d0Var.getClass();
                                subscriptionConfiguration = new SubscriptionConfiguration(str13, str14, subscription, payInfo, new SubscriptionConfiguration.PayButton(str17, str18, plusThemedColor2, new PlusThemedColor(w1d0Var.c(str20), w1d0Var.c(str21))));
                                if (subscriptionConfiguration == null) {
                                    skd0.h(PlusLogTag.SUBSCRIPTION, "Shortcut for SubscriptionConfiguration was not found in popup configuration", null);
                                }
                                ef41 ef41Var = new ef41(str8, str7, subscriptionConfiguration, false);
                                skd0.g(PlusLogTag.SDK, "getPopupSubscriptionConfig() response=" + ef41Var);
                                return ef41Var;
                            }
                        }
                    }
                    subscriptionConfiguration = null;
                    if (subscriptionConfiguration == null) {
                    }
                    ef41 ef41Var2 = new ef41(str8, str7, subscriptionConfiguration, false);
                    skd0.g(PlusLogTag.SDK, "getPopupSubscriptionConfig() response=" + ef41Var2);
                    return ef41Var2;
                }
                str6 = (String) graphQLWebConfigurationRepository$getStoryConfiguration$12.L$2;
                str5 = (String) graphQLWebConfigurationRepository$getStoryConfiguration$12.L$1;
                String str22 = (String) graphQLWebConfigurationRepository$getStoryConfiguration$12.L$0;
                b.b(obj);
                obj2 = obj;
                str4 = str22;
                pax0 pax0Var = (pax0) obj2;
                skd0.b(PlusLogTag.SDK, "getPopupConfiguration() ".concat(qje.b0(pax0Var)));
                o7e0 o7e0Var = new o7e0(str4, qje.F(pax0Var), qje.g(pax0Var));
                graphQLWebConfigurationRepository$getStoryConfiguration$12.L$0 = null;
                graphQLWebConfigurationRepository$getStoryConfiguration$12.L$1 = str5;
                graphQLWebConfigurationRepository$getStoryConfiguration$12.L$2 = str6;
                graphQLWebConfigurationRepository$getStoryConfiguration$12.L$3 = null;
                graphQLWebConfigurationRepository$getStoryConfiguration$12.label = 2;
                obj = com.yandex.plus.core.graphql.internal.a.d(this.a, o7e0Var, graphQLWebConfigurationRepository$getStoryConfiguration$12);
                if (obj != coroutineSingletons) {
                    str7 = str6;
                    str8 = str5;
                    n7e0Var = (n7e0) ((vo2) obj).c;
                    if (n7e0Var != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        graphQLWebConfigurationRepository$getStoryConfiguration$1 = new GraphQLWebConfigurationRepository$getStoryConfiguration$1(this, continuationImpl);
        GraphQLWebConfigurationRepository$getStoryConfiguration$1 graphQLWebConfigurationRepository$getStoryConfiguration$122 = graphQLWebConfigurationRepository$getStoryConfiguration$1;
        obj = graphQLWebConfigurationRepository$getStoryConfiguration$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLWebConfigurationRepository$getStoryConfiguration$122.label;
        if (i != 0) {
        }
        pax0 pax0Var2 = (pax0) obj2;
        skd0.b(PlusLogTag.SDK, "getPopupConfiguration() ".concat(qje.b0(pax0Var2)));
        o7e0 o7e0Var2 = new o7e0(str4, qje.F(pax0Var2), qje.g(pax0Var2));
        graphQLWebConfigurationRepository$getStoryConfiguration$122.L$0 = null;
        graphQLWebConfigurationRepository$getStoryConfiguration$122.L$1 = str5;
        graphQLWebConfigurationRepository$getStoryConfiguration$122.L$2 = str6;
        graphQLWebConfigurationRepository$getStoryConfiguration$122.L$3 = null;
        graphQLWebConfigurationRepository$getStoryConfiguration$122.label = 2;
        obj = com.yandex.plus.core.graphql.internal.a.d(this.a, o7e0Var2, graphQLWebConfigurationRepository$getStoryConfiguration$122);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
