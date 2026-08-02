package com.yandex.plus.pay.graphql.invoice;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.type.TEMPLATE_TAG;
import com.yandex.plus.core.graphql.type.TRANSITION_LANGUAGE;
import defpackage.auu0;
import defpackage.b64;
import defpackage.cyw;
import defpackage.e1u0;
import defpackage.e8f;
import defpackage.eyw;
import defpackage.g8e;
import defpackage.h1u0;
import defpackage.h8f;
import defpackage.i3y;
import defpackage.k2d0;
import defpackage.k8u;
import defpackage.kxw;
import defpackage.mvt;
import defpackage.mxw;
import defpackage.nxw;
import defpackage.ny61;
import defpackage.o4x0;
import defpackage.okb;
import defpackage.p5z;
import defpackage.pkb;
import defpackage.qje;
import defpackage.qo2;
import defpackage.rya1;
import defpackage.sbx;
import defpackage.skd0;
import defpackage.t5f;
import defpackage.tcc;
import defpackage.vo2;
import defpackage.w5f;
import defpackage.xxw;
import defpackage.yf70;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final qo2 a;
    public final p5z b;
    public final com.yandex.plus.experiments.impl.providers.a c;
    public final sbx d;
    public final i3y e = kotlin.a.a(new mvt(11));

    public a(qo2 qo2Var, p5z p5zVar, com.yandex.plus.experiments.impl.providers.a aVar, sbx sbxVar) {
        this.a = qo2Var;
        this.b = p5zVar;
        this.c = aVar;
        this.d = sbxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e4 A[LOOP:0: B:41:0x01de->B:43:0x01e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, String str7, String str8, String str9, Map map, boolean z, nxw nxwVar, ContinuationImpl continuationImpl) {
        GraphQLInvoiceRepository$createInvoice$1 graphQLInvoiceRepository$createInvoice$1;
        int i;
        String str10;
        nxw nxwVar2;
        a aVar;
        Object g;
        CoroutineSingletons coroutineSingletons;
        String str11;
        ArrayList arrayList2;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Map map2;
        boolean z2;
        Object a;
        Set set;
        t5f t5fVar;
        Object failure;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        if (continuationImpl instanceof GraphQLInvoiceRepository$createInvoice$1) {
            graphQLInvoiceRepository$createInvoice$1 = (GraphQLInvoiceRepository$createInvoice$1) continuationImpl;
            int i2 = graphQLInvoiceRepository$createInvoice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLInvoiceRepository$createInvoice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLInvoiceRepository$createInvoice$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                Object obj2 = obj;
                i = graphQLInvoiceRepository$createInvoice$1.label;
                if (i != 0) {
                    b.b(obj2);
                    String upperCase = this.b.getLocale().getLanguage().toUpperCase(Locale.ROOT);
                    PlusLogTag plusLogTag = PlusLogTag.SDK;
                    str10 = upperCase;
                    StringBuilder v = b64.v("createInvoice() sessionId=", str, "tariffId=", str17, ", activeTariffId=");
                    v.append(str18);
                    v.append(", optionsIds=");
                    v.append(arrayList);
                    v.append(", paymentMethodId=");
                    g8e.D(v, str19, ", target=", str5, ", origin=");
                    g8e.D(v, str6, ", source=", str7, ", offersBatchId=");
                    g8e.D(v, str8, ", offerPositionId=", str9, ", externalCallerPayload=");
                    v.append(map);
                    v.append(", silentRequested=");
                    v.append(z);
                    v.append(", additionalOffers=");
                    nxwVar2 = nxwVar;
                    v.append(nxwVar2);
                    skd0.b(plusLogTag, v.toString());
                    graphQLInvoiceRepository$createInvoice$1.L$0 = str;
                    graphQLInvoiceRepository$createInvoice$1.L$1 = str17;
                    graphQLInvoiceRepository$createInvoice$1.L$2 = str18;
                    graphQLInvoiceRepository$createInvoice$1.L$3 = arrayList;
                    graphQLInvoiceRepository$createInvoice$1.L$4 = str19;
                    graphQLInvoiceRepository$createInvoice$1.L$5 = str5;
                    graphQLInvoiceRepository$createInvoice$1.L$6 = str6;
                    graphQLInvoiceRepository$createInvoice$1.L$7 = str7;
                    graphQLInvoiceRepository$createInvoice$1.L$8 = str8;
                    graphQLInvoiceRepository$createInvoice$1.L$9 = str9;
                    graphQLInvoiceRepository$createInvoice$1.L$10 = map;
                    graphQLInvoiceRepository$createInvoice$1.L$11 = nxwVar2;
                    graphQLInvoiceRepository$createInvoice$1.L$12 = str10;
                    graphQLInvoiceRepository$createInvoice$1.Z$0 = z;
                    graphQLInvoiceRepository$createInvoice$1.label = 1;
                    aVar = this;
                    g = aVar.c.g(graphQLInvoiceRepository$createInvoice$1);
                    coroutineSingletons = coroutineSingletons2;
                    if (g != coroutineSingletons) {
                        str11 = str;
                        arrayList2 = arrayList;
                        str12 = str5;
                        str13 = str6;
                        str14 = str7;
                        str15 = str8;
                        str16 = str9;
                        map2 = map;
                        z2 = z;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                    aVar = this;
                    vo2 vo2Var = (vo2) obj2;
                    rya1.b(vo2Var);
                    skd0.g(PlusLogTag.SDK, "createInvoice() response=" + vo2Var);
                    t5fVar = (t5f) vo2Var.c;
                    if (t5fVar != null) {
                        throw new GraphQLParseException("invoice response data is null", null);
                    }
                    ((xxw) aVar.e.getValue()).getClass();
                    try {
                        failure = xxw.a(t5fVar.a.a.b);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a2 = Result.a(failure);
                    if (a2 == null) {
                        return (kxw) failure;
                    }
                    throw new GraphQLParseException(null, a2);
                }
                boolean z3 = graphQLInvoiceRepository$createInvoice$1.Z$0;
                String str20 = (String) graphQLInvoiceRepository$createInvoice$1.L$12;
                nxw nxwVar3 = (nxw) graphQLInvoiceRepository$createInvoice$1.L$11;
                map2 = (Map) graphQLInvoiceRepository$createInvoice$1.L$10;
                String str21 = (String) graphQLInvoiceRepository$createInvoice$1.L$9;
                String str22 = (String) graphQLInvoiceRepository$createInvoice$1.L$8;
                String str23 = (String) graphQLInvoiceRepository$createInvoice$1.L$7;
                String str24 = (String) graphQLInvoiceRepository$createInvoice$1.L$6;
                String str25 = (String) graphQLInvoiceRepository$createInvoice$1.L$5;
                String str26 = (String) graphQLInvoiceRepository$createInvoice$1.L$4;
                ?? r11 = (List) graphQLInvoiceRepository$createInvoice$1.L$3;
                String str27 = (String) graphQLInvoiceRepository$createInvoice$1.L$2;
                String str28 = (String) graphQLInvoiceRepository$createInvoice$1.L$1;
                String str29 = (String) graphQLInvoiceRepository$createInvoice$1.L$0;
                b.b(obj2);
                z2 = z3;
                str16 = str21;
                str15 = str22;
                str14 = str23;
                str13 = str24;
                str12 = str25;
                str19 = str26;
                arrayList2 = r11;
                str11 = str29;
                coroutineSingletons = coroutineSingletons2;
                nxwVar2 = nxwVar3;
                str18 = str27;
                aVar = this;
                g = ((Result) obj2).getValue();
                str10 = str20;
                str17 = str28;
                if (g instanceof Result.Failure) {
                    g = null;
                }
                k2d0 k2d0Var = (k2d0) g;
                yf70 c0 = qje.c0(str17);
                yf70 c02 = qje.c0(str18);
                TRANSITION_LANGUAGE.Companion.getClass();
                TRANSITION_LANGUAGE a3 = o4x0.a(str10);
                yf70 c03 = qje.c0(str19);
                TEMPLATE_TAG template_tag = TEMPLATE_TAG.MOBILE;
                sbx sbxVar = aVar.d;
                sbxVar.getClass();
                auu0 auu0Var = auu0.a;
                String c = sbxVar.c(map2, new k8u(auu0Var, auu0Var, 1));
                yf70 c04 = qje.c0((k2d0Var != null || (set = k2d0Var.d) == null) ? null : kotlin.collections.a.J0(set));
                ArrayList<mxw> arrayList3 = nxwVar2.a;
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                for (mxw mxwVar : arrayList3) {
                    arrayList4.add(new okb(mxwVar.a, mxwVar.b, mxwVar.c));
                }
                w5f w5fVar = new w5f(str11, c0, arrayList2, c02, a3, str13, c03, str14, str12, template_tag, str16, str15, c, z2, c04, qje.c0(new pkb(qje.c0(arrayList4))));
                graphQLInvoiceRepository$createInvoice$1.L$0 = null;
                graphQLInvoiceRepository$createInvoice$1.L$1 = null;
                graphQLInvoiceRepository$createInvoice$1.L$2 = null;
                graphQLInvoiceRepository$createInvoice$1.L$3 = null;
                graphQLInvoiceRepository$createInvoice$1.L$4 = null;
                graphQLInvoiceRepository$createInvoice$1.L$5 = null;
                graphQLInvoiceRepository$createInvoice$1.L$6 = null;
                graphQLInvoiceRepository$createInvoice$1.L$7 = null;
                graphQLInvoiceRepository$createInvoice$1.L$8 = null;
                graphQLInvoiceRepository$createInvoice$1.L$9 = null;
                graphQLInvoiceRepository$createInvoice$1.L$10 = null;
                graphQLInvoiceRepository$createInvoice$1.L$11 = null;
                graphQLInvoiceRepository$createInvoice$1.L$12 = null;
                graphQLInvoiceRepository$createInvoice$1.L$13 = null;
                graphQLInvoiceRepository$createInvoice$1.Z$0 = z2;
                graphQLInvoiceRepository$createInvoice$1.label = 2;
                a = com.yandex.plus.core.graphql.internal.a.a(aVar.a, w5fVar, graphQLInvoiceRepository$createInvoice$1);
                if (a != coroutineSingletons) {
                    obj2 = a;
                    vo2 vo2Var2 = (vo2) obj2;
                    rya1.b(vo2Var2);
                    skd0.g(PlusLogTag.SDK, "createInvoice() response=" + vo2Var2);
                    t5fVar = (t5f) vo2Var2.c;
                    if (t5fVar != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        graphQLInvoiceRepository$createInvoice$1 = new GraphQLInvoiceRepository$createInvoice$1(this, continuationImpl);
        Object obj3 = graphQLInvoiceRepository$createInvoice$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj22 = obj3;
        i = graphQLInvoiceRepository$createInvoice$1.label;
        if (i != 0) {
        }
        if (g instanceof Result.Failure) {
        }
        k2d0 k2d0Var2 = (k2d0) g;
        yf70 c05 = qje.c0(str17);
        yf70 c022 = qje.c0(str18);
        TRANSITION_LANGUAGE.Companion.getClass();
        TRANSITION_LANGUAGE a32 = o4x0.a(str10);
        yf70 c032 = qje.c0(str19);
        TEMPLATE_TAG template_tag2 = TEMPLATE_TAG.MOBILE;
        sbx sbxVar2 = aVar.d;
        sbxVar2.getClass();
        auu0 auu0Var2 = auu0.a;
        String c2 = sbxVar2.c(map2, new k8u(auu0Var2, auu0Var2, 1));
        yf70 c042 = qje.c0((k2d0Var2 != null || (set = k2d0Var2.d) == null) ? null : kotlin.collections.a.J0(set));
        ArrayList<mxw> arrayList32 = nxwVar2.a;
        ArrayList arrayList42 = new ArrayList(tcc.n(arrayList32, 10));
        while (r0.hasNext()) {
        }
        w5f w5fVar2 = new w5f(str11, c05, arrayList2, c022, a32, str13, c032, str14, str12, template_tag2, str16, str15, c2, z2, c042, qje.c0(new pkb(qje.c0(arrayList42))));
        graphQLInvoiceRepository$createInvoice$1.L$0 = null;
        graphQLInvoiceRepository$createInvoice$1.L$1 = null;
        graphQLInvoiceRepository$createInvoice$1.L$2 = null;
        graphQLInvoiceRepository$createInvoice$1.L$3 = null;
        graphQLInvoiceRepository$createInvoice$1.L$4 = null;
        graphQLInvoiceRepository$createInvoice$1.L$5 = null;
        graphQLInvoiceRepository$createInvoice$1.L$6 = null;
        graphQLInvoiceRepository$createInvoice$1.L$7 = null;
        graphQLInvoiceRepository$createInvoice$1.L$8 = null;
        graphQLInvoiceRepository$createInvoice$1.L$9 = null;
        graphQLInvoiceRepository$createInvoice$1.L$10 = null;
        graphQLInvoiceRepository$createInvoice$1.L$11 = null;
        graphQLInvoiceRepository$createInvoice$1.L$12 = null;
        graphQLInvoiceRepository$createInvoice$1.L$13 = null;
        graphQLInvoiceRepository$createInvoice$1.Z$0 = z2;
        graphQLInvoiceRepository$createInvoice$1.label = 2;
        a = com.yandex.plus.core.graphql.internal.a.a(aVar.a, w5fVar2, graphQLInvoiceRepository$createInvoice$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b9, code lost:
    
        if (r11 != r14) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, String str7, String str8, Map map, ContinuationImpl continuationImpl) {
        GraphQLInvoiceRepository$createSilentInvoice$1 graphQLInvoiceRepository$createSilentInvoice$1;
        int i;
        Object g;
        CoroutineSingletons coroutineSingletons;
        String str9;
        Map map2;
        String str10;
        ArrayList arrayList2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Object a;
        Set set;
        Object failure;
        a aVar = this;
        String str17 = str5;
        if (continuationImpl instanceof GraphQLInvoiceRepository$createSilentInvoice$1) {
            graphQLInvoiceRepository$createSilentInvoice$1 = (GraphQLInvoiceRepository$createSilentInvoice$1) continuationImpl;
            int i2 = graphQLInvoiceRepository$createSilentInvoice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLInvoiceRepository$createSilentInvoice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLInvoiceRepository$createSilentInvoice$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLInvoiceRepository$createSilentInvoice$1.label;
                if (i != 0) {
                    b.b(obj);
                    String upperCase = aVar.b.getLocale().getLanguage().toUpperCase(Locale.ROOT);
                    PlusLogTag plusLogTag = PlusLogTag.SDK;
                    StringBuilder v = b64.v("createSilentInvoice() sessionId=", str, "tariffId=", str2, ", activeTariffId=");
                    v.append(str3);
                    v.append(", optionsIds=");
                    v.append(arrayList);
                    v.append(", target=");
                    g8e.D(v, str4, ", origin=", str17, ", source=");
                    g8e.D(v, str6, ", offersBatchId=", str7, ", offerPositionId=");
                    v.append(str8);
                    v.append(", externalCallerPayload=");
                    v.append(map);
                    skd0.b(plusLogTag, v.toString());
                    graphQLInvoiceRepository$createSilentInvoice$1.L$0 = str;
                    graphQLInvoiceRepository$createSilentInvoice$1.L$1 = str2;
                    graphQLInvoiceRepository$createSilentInvoice$1.L$2 = str3;
                    graphQLInvoiceRepository$createSilentInvoice$1.L$3 = arrayList;
                    graphQLInvoiceRepository$createSilentInvoice$1.L$4 = str4;
                    graphQLInvoiceRepository$createSilentInvoice$1.L$5 = str17;
                    graphQLInvoiceRepository$createSilentInvoice$1.L$6 = str6;
                    graphQLInvoiceRepository$createSilentInvoice$1.L$7 = str7;
                    graphQLInvoiceRepository$createSilentInvoice$1.L$8 = str8;
                    graphQLInvoiceRepository$createSilentInvoice$1.L$9 = map;
                    graphQLInvoiceRepository$createSilentInvoice$1.L$10 = upperCase;
                    graphQLInvoiceRepository$createSilentInvoice$1.label = 1;
                    aVar = this;
                    g = aVar.c.g(graphQLInvoiceRepository$createSilentInvoice$1);
                    coroutineSingletons = coroutineSingletons2;
                    if (g != coroutineSingletons) {
                        str9 = str2;
                        map2 = map;
                        str10 = str;
                        arrayList2 = arrayList;
                        str11 = str4;
                        str12 = str6;
                        str13 = str7;
                        str14 = str8;
                        str15 = upperCase;
                        str16 = str3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = obj;
                    vo2 vo2Var = (vo2) a;
                    rya1.b(vo2Var);
                    skd0.g(PlusLogTag.SDK, "createSilentInvoice() response=" + vo2Var);
                    e8f e8fVar = (e8f) vo2Var.c;
                    if (e8fVar == null) {
                        throw new GraphQLParseException("invoice response data is null", null);
                    }
                    ((xxw) aVar.e.getValue()).getClass();
                    try {
                        failure = xxw.a(e8fVar.a.a.b);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a2 = Result.a(failure);
                    if (a2 == null) {
                        return (kxw) failure;
                    }
                    throw new GraphQLParseException(null, a2);
                }
                str15 = (String) graphQLInvoiceRepository$createSilentInvoice$1.L$10;
                map2 = (Map) graphQLInvoiceRepository$createSilentInvoice$1.L$9;
                String str18 = (String) graphQLInvoiceRepository$createSilentInvoice$1.L$8;
                String str19 = (String) graphQLInvoiceRepository$createSilentInvoice$1.L$7;
                String str20 = (String) graphQLInvoiceRepository$createSilentInvoice$1.L$6;
                str17 = (String) graphQLInvoiceRepository$createSilentInvoice$1.L$5;
                String str21 = (String) graphQLInvoiceRepository$createSilentInvoice$1.L$4;
                ?? r8 = (List) graphQLInvoiceRepository$createSilentInvoice$1.L$3;
                str16 = (String) graphQLInvoiceRepository$createSilentInvoice$1.L$2;
                str9 = (String) graphQLInvoiceRepository$createSilentInvoice$1.L$1;
                String str22 = (String) graphQLInvoiceRepository$createSilentInvoice$1.L$0;
                b.b(obj);
                str14 = str18;
                str13 = str19;
                str12 = str20;
                str11 = str21;
                arrayList2 = r8;
                str10 = str22;
                coroutineSingletons = coroutineSingletons2;
                g = ((Result) obj).getValue();
                String str23 = str17;
                if (g instanceof Result.Failure) {
                    g = null;
                }
                k2d0 k2d0Var = (k2d0) g;
                yf70 c0 = qje.c0(str9);
                yf70 c02 = qje.c0(str16);
                TRANSITION_LANGUAGE.Companion.getClass();
                TRANSITION_LANGUAGE a3 = o4x0.a(str15);
                TEMPLATE_TAG template_tag = TEMPLATE_TAG.MOBILE;
                sbx sbxVar = aVar.d;
                sbxVar.getClass();
                auu0 auu0Var = auu0.a;
                h8f h8fVar = new h8f(str10, c0, arrayList2, c02, a3, str23, str12, str11, template_tag, str14, str13, sbxVar.c(map2, new k8u(auu0Var, auu0Var, 1)), qje.c0((k2d0Var != null || (set = k2d0Var.d) == null) ? null : kotlin.collections.a.J0(set)));
                graphQLInvoiceRepository$createSilentInvoice$1.L$0 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$1 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$2 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$3 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$4 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$5 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$6 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$7 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$8 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$9 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$10 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.L$11 = null;
                graphQLInvoiceRepository$createSilentInvoice$1.label = 2;
                a = com.yandex.plus.core.graphql.internal.a.a(aVar.a, h8fVar, graphQLInvoiceRepository$createSilentInvoice$1);
            }
        }
        graphQLInvoiceRepository$createSilentInvoice$1 = new GraphQLInvoiceRepository$createSilentInvoice$1(aVar, continuationImpl);
        Object obj2 = graphQLInvoiceRepository$createSilentInvoice$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLInvoiceRepository$createSilentInvoice$1.label;
        if (i != 0) {
        }
        String str232 = str17;
        if (g instanceof Result.Failure) {
        }
        k2d0 k2d0Var2 = (k2d0) g;
        yf70 c03 = qje.c0(str9);
        yf70 c022 = qje.c0(str16);
        TRANSITION_LANGUAGE.Companion.getClass();
        TRANSITION_LANGUAGE a32 = o4x0.a(str15);
        TEMPLATE_TAG template_tag2 = TEMPLATE_TAG.MOBILE;
        sbx sbxVar2 = aVar.d;
        sbxVar2.getClass();
        auu0 auu0Var2 = auu0.a;
        h8f h8fVar2 = new h8f(str10, c03, arrayList2, c022, a32, str232, str12, str11, template_tag2, str14, str13, sbxVar2.c(map2, new k8u(auu0Var2, auu0Var2, 1)), qje.c0((k2d0Var2 != null || (set = k2d0Var2.d) == null) ? null : kotlin.collections.a.J0(set)));
        graphQLInvoiceRepository$createSilentInvoice$1.L$0 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$1 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$2 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$3 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$4 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$5 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$6 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$7 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$8 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$9 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$10 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.L$11 = null;
        graphQLInvoiceRepository$createSilentInvoice$1.label = 2;
        a = com.yandex.plus.core.graphql.internal.a.a(aVar.a, h8fVar2, graphQLInvoiceRepository$createSilentInvoice$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        GraphQLInvoiceRepository$getInvoice$1 graphQLInvoiceRepository$getInvoice$1;
        int i;
        cyw cywVar;
        Object failure;
        if (continuationImpl instanceof GraphQLInvoiceRepository$getInvoice$1) {
            graphQLInvoiceRepository$getInvoice$1 = (GraphQLInvoiceRepository$getInvoice$1) continuationImpl;
            int i2 = graphQLInvoiceRepository$getInvoice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLInvoiceRepository$getInvoice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLInvoiceRepository$getInvoice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLInvoiceRepository$getInvoice$1.label;
                if (i != 0) {
                    b.b(obj);
                    skd0.b(PlusLogTag.SDK, "getInvoice() invoiceId = " + str);
                    eyw eywVar = new eyw(str);
                    graphQLInvoiceRepository$getInvoice$1.L$0 = null;
                    graphQLInvoiceRepository$getInvoice$1.label = 1;
                    obj = com.yandex.plus.core.graphql.internal.a.d(this.a, eywVar, graphQLInvoiceRepository$getInvoice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                vo2 vo2Var = (vo2) obj;
                rya1.b(vo2Var);
                skd0.g(PlusLogTag.SDK, "getInvoice() response=" + vo2Var);
                cywVar = (cyw) vo2Var.c;
                if (cywVar != null) {
                    throw new GraphQLParseException("invoice response data is null", null);
                }
                ((xxw) this.e.getValue()).getClass();
                try {
                    failure = xxw.a(cywVar.a.b);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a == null) {
                    return (kxw) failure;
                }
                throw new GraphQLParseException(null, a);
            }
        }
        graphQLInvoiceRepository$getInvoice$1 = new GraphQLInvoiceRepository$getInvoice$1(this, continuationImpl);
        Object obj2 = graphQLInvoiceRepository$getInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLInvoiceRepository$getInvoice$1.label;
        if (i != 0) {
        }
        vo2 vo2Var2 = (vo2) obj2;
        rya1.b(vo2Var2);
        skd0.g(PlusLogTag.SDK, "getInvoice() response=" + vo2Var2);
        cywVar = (cyw) vo2Var2.c;
        if (cywVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        GraphQLInvoiceRepository$startInvoice$1 graphQLInvoiceRepository$startInvoice$1;
        int i;
        e1u0 e1u0Var;
        Object failure;
        if (continuationImpl instanceof GraphQLInvoiceRepository$startInvoice$1) {
            graphQLInvoiceRepository$startInvoice$1 = (GraphQLInvoiceRepository$startInvoice$1) continuationImpl;
            int i2 = graphQLInvoiceRepository$startInvoice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLInvoiceRepository$startInvoice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLInvoiceRepository$startInvoice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLInvoiceRepository$startInvoice$1.label;
                if (i != 0) {
                    b.b(obj);
                    skd0.b(PlusLogTag.SDK, "startInvoice() invoiceId=" + str);
                    h1u0 h1u0Var = new h1u0(str);
                    graphQLInvoiceRepository$startInvoice$1.L$0 = null;
                    graphQLInvoiceRepository$startInvoice$1.label = 1;
                    obj = com.yandex.plus.core.graphql.internal.a.a(this.a, h1u0Var, graphQLInvoiceRepository$startInvoice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                vo2 vo2Var = (vo2) obj;
                rya1.b(vo2Var);
                skd0.g(PlusLogTag.SDK, "startInvoice() response=" + vo2Var);
                e1u0Var = (e1u0) vo2Var.c;
                if (e1u0Var != null) {
                    throw new GraphQLParseException("invoice response data is null", null);
                }
                ((xxw) this.e.getValue()).getClass();
                try {
                    failure = xxw.a(e1u0Var.a.a.b);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a == null) {
                    return (kxw) failure;
                }
                throw new GraphQLParseException(null, a);
            }
        }
        graphQLInvoiceRepository$startInvoice$1 = new GraphQLInvoiceRepository$startInvoice$1(this, continuationImpl);
        Object obj2 = graphQLInvoiceRepository$startInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLInvoiceRepository$startInvoice$1.label;
        if (i != 0) {
        }
        vo2 vo2Var2 = (vo2) obj2;
        rya1.b(vo2Var2);
        skd0.g(PlusLogTag.SDK, "startInvoice() response=" + vo2Var2);
        e1u0Var = (e1u0) vo2Var2.c;
        if (e1u0Var != null) {
        }
    }
}
