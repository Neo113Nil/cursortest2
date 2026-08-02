package com.yandex.plus.pay.graphql.offers;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.type.TRANSITION_LANGUAGE;
import com.yandex.plus.pay.graphql.offers.a;
import defpackage.b64;
import defpackage.cu60;
import defpackage.dmd;
import defpackage.fu60;
import defpackage.g8e;
import defpackage.gm0;
import defpackage.gmd;
import defpackage.gmt;
import defpackage.hhb1;
import defpackage.i3y;
import defpackage.iqd;
import defpackage.jqd;
import defpackage.k2d0;
import defpackage.kqd;
import defpackage.lj;
import defpackage.mzz;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.o4x0;
import defpackage.p5z;
import defpackage.pqd;
import defpackage.qje;
import defpackage.qo2;
import defpackage.rya1;
import defpackage.skd0;
import defpackage.sls;
import defpackage.tse0;
import defpackage.ugb1;
import defpackage.vo2;
import defpackage.xzt;
import defpackage.yf70;
import defpackage.yma1;
import defpackage.ymd;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final qo2 a;
    public final p5z b;
    public final n4u0 c;
    public final com.yandex.plus.experiments.impl.providers.a d;
    public final i3y j;
    public final i3y l;
    public final mzz e = new mzz(5);
    public final i3y f = kotlin.a.a(new gmt(14));
    public final i3y g = kotlin.a.a(new gmt(15));
    public final i3y h = kotlin.a.a(new gmt(16));
    public final i3y i = kotlin.a.a(new gmt(17));
    public final i3y k = kotlin.a.a(new gmt(18));

    public a(qo2 qo2Var, p5z p5zVar, r0 r0Var, com.yandex.plus.experiments.impl.providers.a aVar) {
        this.a = qo2Var;
        this.b = p5zVar;
        this.c = r0Var;
        this.d = aVar;
        final int i = 0;
        this.j = kotlin.a.a(new sls(this) { // from class: wzt
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar2 = this.b;
                switch (i2) {
                    case 0:
                        return new pqd((gby) aVar2.g.getValue(), (icd0) aVar2.f.getValue());
                    default:
                        return new dmd((gby) aVar2.g.getValue(), (ji4) aVar2.h.getValue(), (j3k0) aVar2.i.getValue(), (aku0) aVar2.k.getValue());
                }
            }
        });
        final int i2 = 1;
        this.l = kotlin.a.a(new sls(this) { // from class: wzt
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar2 = this.b;
                switch (i22) {
                    case 0:
                        return new pqd((gby) aVar2.g.getValue(), (icd0) aVar2.f.getValue());
                    default:
                        return new dmd((gby) aVar2.g.getValue(), (ji4) aVar2.h.getValue(), (j3k0) aVar2.i.getValue(), (aku0) aVar2.k.getValue());
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ArrayList arrayList, String str3, ListBuilder listBuilder, ArrayList arrayList2, boolean z, boolean z2, gm0 gm0Var, ContinuationImpl continuationImpl) {
        GraphQLCompositeOffersRepository$getCompositeOfferDetails$1 graphQLCompositeOffersRepository$getCompositeOfferDetails$1;
        int i;
        Set set;
        gmd gmdVar;
        if (continuationImpl instanceof GraphQLCompositeOffersRepository$getCompositeOfferDetails$1) {
            graphQLCompositeOffersRepository$getCompositeOfferDetails$1 = (GraphQLCompositeOffersRepository$getCompositeOfferDetails$1) continuationImpl;
            int i2 = graphQLCompositeOffersRepository$getCompositeOfferDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLCompositeOffersRepository$getCompositeOfferDetails$1.label = i2 - Integer.MIN_VALUE;
                GraphQLCompositeOffersRepository$getCompositeOfferDetails$1 graphQLCompositeOffersRepository$getCompositeOfferDetails$12 = graphQLCompositeOffersRepository$getCompositeOfferDetails$1;
                Object obj = graphQLCompositeOffersRepository$getCompositeOfferDetails$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLCompositeOffersRepository$getCompositeOfferDetails$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusLogTag plusLogTag = PlusLogTag.SDK;
                    StringBuilder v = b64.v("getCompositeOfferDetails() tariffId=", str, ", activeTariffId=", str2, ", optionsIds=");
                    g8e.D(v, kotlin.collections.a.X(arrayList, null, null, null, null, 63), ", target=", str3, ", arguments=");
                    tse0.y(kotlin.collections.a.X(listBuilder, null, null, null, null, 63), ", requestSilentInvoiceAvailability=", ", requestPaymentMethodsGroups=", v, z);
                    v.append(z2);
                    v.append(", additionalOffersInput=");
                    v.append(gm0Var);
                    skd0.b(plusLogTag, v.toString());
                    String upperCase = this.b.getLocale().getLanguage().toUpperCase(Locale.ROOT);
                    yf70 c0 = qje.c0(str);
                    yf70 c02 = qje.c0(str2);
                    yf70 c03 = qje.c0(str3);
                    yf70 c04 = qje.c0(ugb1.a(listBuilder, arrayList2));
                    Object h = this.d.h();
                    if (h instanceof Result.Failure) {
                        h = null;
                    }
                    k2d0 k2d0Var = (k2d0) h;
                    ymd ymdVar = new ymd(c0, arrayList, c02, upperCase, c03, c04, qje.c0((k2d0Var == null || (set = k2d0Var.d) == null) ? null : kotlin.collections.a.J0(set)), z, !z2, qje.c0(gm0Var != null ? yma1.f(gm0Var) : null));
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.L$0 = null;
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.L$1 = null;
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.L$2 = null;
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.L$3 = null;
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.L$4 = null;
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.L$5 = null;
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.L$6 = null;
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.L$7 = null;
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.Z$0 = z;
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.Z$1 = z2;
                    graphQLCompositeOffersRepository$getCompositeOfferDetails$12.label = 1;
                    obj = com.yandex.plus.core.graphql.internal.a.d(this.a, ymdVar, graphQLCompositeOffersRepository$getCompositeOfferDetails$12);
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
                vo2 vo2Var = (vo2) obj;
                rya1.b(vo2Var);
                skd0.b(PlusLogTag.SDK, "loadOfferDetails() response=" + vo2Var);
                gmdVar = (gmd) vo2Var.c;
                if (gmdVar == null) {
                    return ((dmd) this.l.getValue()).e(gmdVar);
                }
                throw new GraphQLParseException("composite offer details data is null");
            }
        }
        graphQLCompositeOffersRepository$getCompositeOfferDetails$1 = new GraphQLCompositeOffersRepository$getCompositeOfferDetails$1(this, continuationImpl);
        GraphQLCompositeOffersRepository$getCompositeOfferDetails$1 graphQLCompositeOffersRepository$getCompositeOfferDetails$122 = graphQLCompositeOffersRepository$getCompositeOfferDetails$1;
        Object obj2 = graphQLCompositeOffersRepository$getCompositeOfferDetails$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLCompositeOffersRepository$getCompositeOfferDetails$122.label;
        if (i != 0) {
        }
        vo2 vo2Var2 = (vo2) obj2;
        rya1.b(vo2Var2);
        skd0.b(PlusLogTag.SDK, "loadOfferDetails() response=" + vo2Var2);
        gmdVar = (gmd) vo2Var2.c;
        if (gmdVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, Set set, Set set2, boolean z, ContinuationImpl continuationImpl) {
        GraphQLCompositeOffersRepository$getCompositeOffers$1 graphQLCompositeOffersRepository$getCompositeOffers$1;
        int i;
        xzt xztVar;
        if (continuationImpl instanceof GraphQLCompositeOffersRepository$getCompositeOffers$1) {
            graphQLCompositeOffersRepository$getCompositeOffers$1 = (GraphQLCompositeOffersRepository$getCompositeOffers$1) continuationImpl;
            int i2 = graphQLCompositeOffersRepository$getCompositeOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLCompositeOffersRepository$getCompositeOffers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLCompositeOffersRepository$getCompositeOffers$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLCompositeOffersRepository$getCompositeOffers$1.label;
                mzz mzzVar = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Long id = ((lj) this.c.getValue()).getId();
                    String l = id != null ? id.toString() : null;
                    PlusLogTag plusLogTag = PlusLogTag.SDK;
                    StringBuilder v = b64.v("getCompositeOffers() puid = ", l, ", sessionId=", str, "reason=");
                    g8e.D(v, str2, ", target=", str3, ", tariffId=");
                    v.append(str4);
                    v.append(", optionIds=");
                    v.append(set);
                    v.append(", features=");
                    v.append(set2);
                    v.append(", forceUpdate=");
                    v.append(z);
                    skd0.b(plusLogTag, v.toString());
                    String language = this.b.getLocale().getLanguage();
                    Locale locale = Locale.ROOT;
                    xzt xztVar2 = new xzt(l, str, str2.toUpperCase(locale), str3, str4, set, set2, language.toUpperCase(locale));
                    iqd iqdVar = z ? null : (iqd) hhb1.a(mzzVar, xztVar2);
                    if (iqdVar != null) {
                        skd0.b(plusLogTag, "Got composite offers from cache");
                        return new jqd(iqdVar);
                    }
                    graphQLCompositeOffersRepository$getCompositeOffers$1.L$0 = null;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.L$1 = null;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.L$2 = null;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.L$3 = null;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.L$4 = null;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.L$5 = null;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.L$6 = null;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.L$7 = null;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.L$8 = xztVar2;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.L$9 = null;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.Z$0 = z;
                    graphQLCompositeOffersRepository$getCompositeOffers$1.label = 1;
                    obj = c(xztVar2, graphQLCompositeOffersRepository$getCompositeOffers$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    xztVar = xztVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xztVar = (xzt) graphQLCompositeOffersRepository$getCompositeOffers$1.L$8;
                    kotlin.b.b(obj);
                }
                iqd iqdVar2 = (iqd) obj;
                hhb1.b(mzzVar, xztVar, iqdVar2);
                return new kqd(iqdVar2);
            }
        }
        graphQLCompositeOffersRepository$getCompositeOffers$1 = new GraphQLCompositeOffersRepository$getCompositeOffers$1(this, continuationImpl);
        Object obj3 = graphQLCompositeOffersRepository$getCompositeOffers$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLCompositeOffersRepository$getCompositeOffers$1.label;
        mzz mzzVar2 = this.e;
        if (i != 0) {
        }
        iqd iqdVar22 = (iqd) obj3;
        hhb1.b(mzzVar2, xztVar, iqdVar22);
        return new kqd(iqdVar22);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(xzt xztVar, ContinuationImpl continuationImpl) {
        GraphQLCompositeOffersRepository$loadOffers$1 graphQLCompositeOffersRepository$loadOffers$1;
        int i;
        cu60 cu60Var;
        if (continuationImpl instanceof GraphQLCompositeOffersRepository$loadOffers$1) {
            graphQLCompositeOffersRepository$loadOffers$1 = (GraphQLCompositeOffersRepository$loadOffers$1) continuationImpl;
            int i2 = graphQLCompositeOffersRepository$loadOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLCompositeOffersRepository$loadOffers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLCompositeOffersRepository$loadOffers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLCompositeOffersRepository$loadOffers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    skd0.g(PlusLogTag.SDK, "loadOffers() reason=" + xztVar.c() + ", target=" + xztVar.e() + ", tariffId=" + xztVar.f() + ", optionIds=" + xztVar.b() + ", features=" + xztVar.a() + ", language=" + xztVar.g());
                    yf70 c0 = qje.c0(xztVar.d());
                    String c = xztVar.c();
                    String e = xztVar.e();
                    Set a = xztVar.a();
                    yf70 c02 = qje.c0(a != null ? kotlin.collections.a.J0(a) : null);
                    yf70 c03 = qje.c0(xztVar.f());
                    Set b = xztVar.b();
                    yf70 c04 = qje.c0(b != null ? kotlin.collections.a.J0(b) : null);
                    o4x0 o4x0Var = TRANSITION_LANGUAGE.Companion;
                    String g = xztVar.g();
                    o4x0Var.getClass();
                    fu60 fu60Var = new fu60(c0, c, e, c02, c03, c04, o4x0.a(g));
                    graphQLCompositeOffersRepository$loadOffers$1.L$0 = null;
                    graphQLCompositeOffersRepository$loadOffers$1.label = 1;
                    obj = com.yandex.plus.core.graphql.internal.a.d(this.a, fu60Var, graphQLCompositeOffersRepository$loadOffers$1);
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
                vo2 vo2Var = (vo2) obj;
                rya1.b(vo2Var);
                skd0.g(PlusLogTag.SDK, "loadOffers() response=" + vo2Var);
                cu60Var = (cu60) vo2Var.c;
                if (cu60Var == null) {
                    return ((pqd) this.j.getValue()).e(cu60Var);
                }
                throw new GraphQLParseException("composite offers response data is null");
            }
        }
        graphQLCompositeOffersRepository$loadOffers$1 = new GraphQLCompositeOffersRepository$loadOffers$1(this, continuationImpl);
        Object obj2 = graphQLCompositeOffersRepository$loadOffers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLCompositeOffersRepository$loadOffers$1.label;
        if (i != 0) {
        }
        vo2 vo2Var2 = (vo2) obj2;
        rya1.b(vo2Var2);
        skd0.g(PlusLogTag.SDK, "loadOffers() response=" + vo2Var2);
        cu60Var = (cu60) vo2Var2.c;
        if (cu60Var == null) {
        }
    }
}
