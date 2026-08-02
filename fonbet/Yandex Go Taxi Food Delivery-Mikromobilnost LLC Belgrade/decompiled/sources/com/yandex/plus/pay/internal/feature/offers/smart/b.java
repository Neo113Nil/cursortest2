package com.yandex.plus.pay.internal.feature.offers.smart;

import com.yandex.plus.home.api.location.GeoPoint;
import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayGoogleBillingConfig;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import com.yandex.plus.pay.data.acquisition.PlusPayAcquisitionApi;
import com.yandex.plus.pay.internal.model.SmartOffersBatch;
import defpackage.a8d0;
import defpackage.aad0;
import defpackage.bbd0;
import defpackage.eja1;
import defpackage.f8d0;
import defpackage.gzj0;
import defpackage.i8d0;
import defpackage.i9d0;
import defpackage.j8d0;
import defpackage.jl40;
import defpackage.jse;
import defpackage.jzs;
import defpackage.lzs;
import defpackage.m8d0;
import defpackage.mcd0;
import defpackage.mwj0;
import defpackage.ny61;
import defpackage.ocd0;
import defpackage.p8d0;
import defpackage.p9d0;
import defpackage.pgz;
import defpackage.pzs0;
import defpackage.q9d0;
import defpackage.qzs0;
import defpackage.r0d0;
import defpackage.s8d0;
import defpackage.s9d0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.v9d0;
import defpackage.w8d0;
import defpackage.w9d0;
import defpackage.x9d0;
import defpackage.yk;
import defpackage.z8d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class b implements qzs0 {
    public final PlusPayAcquisitionApi a;
    public final ocd0 b;
    public final lzs c;
    public final r0d0 d;
    public final jse e;
    public final pgz f;

    public b(PlusPayAcquisitionApi plusPayAcquisitionApi, ocd0 ocd0Var, lzs lzsVar, bbd0 bbd0Var, r0d0 r0d0Var, jse jseVar, pgz pgzVar) {
        this.a = plusPayAcquisitionApi;
        this.b = ocd0Var;
        this.c = lzsVar;
        this.d = r0d0Var;
        this.e = jseVar;
        this.f = pgzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8 A[LOOP:0: B:17:0x00d2->B:19:0x00d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, boolean z, String str2, Set set, Set set2, Set set3, Set set4, Map map, ContinuationImpl continuationImpl) {
        SmartOffersRepositoryImpl$fetchSmartOffers$1 smartOffersRepositoryImpl$fetchSmartOffers$1;
        int i;
        Set set5;
        String str3;
        Set set6;
        Set set7;
        Set set8;
        Map map2;
        boolean z2;
        String str4;
        PlusPayAcquisitionApi plusPayAcquisitionApi;
        jzs a;
        PlusPayAcquisitionApi plusPayAcquisitionApi2;
        a8d0 a8d0Var;
        GeoPoint geoPoint;
        bVar.getClass();
        if (continuationImpl instanceof SmartOffersRepositoryImpl$fetchSmartOffers$1) {
            smartOffersRepositoryImpl$fetchSmartOffers$1 = (SmartOffersRepositoryImpl$fetchSmartOffers$1) continuationImpl;
            int i2 = smartOffersRepositoryImpl$fetchSmartOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                smartOffersRepositoryImpl$fetchSmartOffers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = smartOffersRepositoryImpl$fetchSmartOffers$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smartOffersRepositoryImpl$fetchSmartOffers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    smartOffersRepositoryImpl$fetchSmartOffers$1.L$0 = str;
                    smartOffersRepositoryImpl$fetchSmartOffers$1.L$1 = str2;
                    smartOffersRepositoryImpl$fetchSmartOffers$1.L$2 = set;
                    set5 = set2;
                    smartOffersRepositoryImpl$fetchSmartOffers$1.L$3 = set5;
                    smartOffersRepositoryImpl$fetchSmartOffers$1.L$4 = set3;
                    smartOffersRepositoryImpl$fetchSmartOffers$1.L$5 = set4;
                    smartOffersRepositoryImpl$fetchSmartOffers$1.L$6 = map;
                    smartOffersRepositoryImpl$fetchSmartOffers$1.Z$0 = z;
                    smartOffersRepositoryImpl$fetchSmartOffers$1.label = 1;
                    Object b = bVar.b(smartOffersRepositoryImpl$fetchSmartOffers$1);
                    if (b != obj2) {
                        str3 = str2;
                        set6 = set;
                        set7 = set3;
                        set8 = set4;
                        map2 = map;
                        z2 = z;
                        str4 = str;
                        obj = b;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                z2 = smartOffersRepositoryImpl$fetchSmartOffers$1.Z$0;
                Map map3 = (Map) smartOffersRepositoryImpl$fetchSmartOffers$1.L$6;
                Set set9 = (Set) smartOffersRepositoryImpl$fetchSmartOffers$1.L$5;
                Set set10 = (Set) smartOffersRepositoryImpl$fetchSmartOffers$1.L$4;
                Set set11 = (Set) smartOffersRepositoryImpl$fetchSmartOffers$1.L$3;
                Set set12 = (Set) smartOffersRepositoryImpl$fetchSmartOffers$1.L$2;
                String str5 = (String) smartOffersRepositoryImpl$fetchSmartOffers$1.L$1;
                str4 = (String) smartOffersRepositoryImpl$fetchSmartOffers$1.L$0;
                kotlin.b.b(obj);
                map2 = map3;
                set8 = set9;
                set7 = set10;
                set5 = set11;
                set6 = set12;
                str3 = str5;
                PlusPayGoogleBillingConfig plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj;
                plusPayAcquisitionApi = bVar.a;
                Set<PlusPaySmartOffer.TargetAndFeatures> set13 = set5;
                ArrayList arrayList = new ArrayList(tcc.n(set13, 10));
                for (PlusPaySmartOffer.TargetAndFeatures targetAndFeatures : set13) {
                    arrayList.add(new i8d0(targetAndFeatures.getTarget(), targetAndFeatures.getFeatures()));
                }
                f8d0 f8d0Var = new f8d0(str3, set6, kotlin.collections.a.N0(arrayList), set7, set8, map2, plusPayGoogleBillingConfig == null ? plusPayGoogleBillingConfig.getGoogleCountryCode() : null, plusPayGoogleBillingConfig == null ? Boolean.valueOf(plusPayGoogleBillingConfig.isNativePaymentAllowed()) : null, null);
                a = bVar.c.a();
                if (a != null || (geoPoint = a.a) == null) {
                    plusPayAcquisitionApi2 = plusPayAcquisitionApi;
                    a8d0Var = null;
                } else {
                    plusPayAcquisitionApi2 = plusPayAcquisitionApi;
                    a8d0Var = new a8d0(geoPoint.getLat(), geoPoint.getLon(), new Double(geoPoint.getAccuracy()));
                }
                j8d0 j8d0Var = new j8d0(f8d0Var, a8d0Var);
                smartOffersRepositoryImpl$fetchSmartOffers$1.L$0 = null;
                smartOffersRepositoryImpl$fetchSmartOffers$1.L$1 = null;
                smartOffersRepositoryImpl$fetchSmartOffers$1.L$2 = null;
                smartOffersRepositoryImpl$fetchSmartOffers$1.L$3 = null;
                smartOffersRepositoryImpl$fetchSmartOffers$1.L$4 = null;
                smartOffersRepositoryImpl$fetchSmartOffers$1.L$5 = null;
                smartOffersRepositoryImpl$fetchSmartOffers$1.L$6 = null;
                smartOffersRepositoryImpl$fetchSmartOffers$1.L$7 = null;
                smartOffersRepositoryImpl$fetchSmartOffers$1.Z$0 = z2;
                smartOffersRepositoryImpl$fetchSmartOffers$1.label = 2;
                Object smartOffers = plusPayAcquisitionApi2.getSmartOffers(str4, z2, j8d0Var, smartOffersRepositoryImpl$fetchSmartOffers$1);
                return smartOffers != obj2 ? obj2 : smartOffers;
            }
        }
        smartOffersRepositoryImpl$fetchSmartOffers$1 = new SmartOffersRepositoryImpl$fetchSmartOffers$1(bVar, continuationImpl);
        Object obj3 = smartOffersRepositoryImpl$fetchSmartOffers$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smartOffersRepositoryImpl$fetchSmartOffers$1.label;
        if (i != 0) {
        }
        PlusPayGoogleBillingConfig plusPayGoogleBillingConfig2 = (PlusPayGoogleBillingConfig) obj3;
        plusPayAcquisitionApi = bVar.a;
        Set<PlusPaySmartOffer.TargetAndFeatures> set132 = set5;
        ArrayList arrayList2 = new ArrayList(tcc.n(set132, 10));
        while (r9.hasNext()) {
        }
        f8d0 f8d0Var2 = new f8d0(str3, set6, kotlin.collections.a.N0(arrayList2), set7, set8, map2, plusPayGoogleBillingConfig2 == null ? plusPayGoogleBillingConfig2.getGoogleCountryCode() : null, plusPayGoogleBillingConfig2 == null ? Boolean.valueOf(plusPayGoogleBillingConfig2.isNativePaymentAllowed()) : null, null);
        a = bVar.c.a();
        if (a != null) {
        }
        plusPayAcquisitionApi2 = plusPayAcquisitionApi;
        a8d0Var = null;
        j8d0 j8d0Var2 = new j8d0(f8d0Var2, a8d0Var);
        smartOffersRepositoryImpl$fetchSmartOffers$1.L$0 = null;
        smartOffersRepositoryImpl$fetchSmartOffers$1.L$1 = null;
        smartOffersRepositoryImpl$fetchSmartOffers$1.L$2 = null;
        smartOffersRepositoryImpl$fetchSmartOffers$1.L$3 = null;
        smartOffersRepositoryImpl$fetchSmartOffers$1.L$4 = null;
        smartOffersRepositoryImpl$fetchSmartOffers$1.L$5 = null;
        smartOffersRepositoryImpl$fetchSmartOffers$1.L$6 = null;
        smartOffersRepositoryImpl$fetchSmartOffers$1.L$7 = null;
        smartOffersRepositoryImpl$fetchSmartOffers$1.Z$0 = z2;
        smartOffersRepositoryImpl$fetchSmartOffers$1.label = 2;
        Object smartOffers2 = plusPayAcquisitionApi2.getSmartOffers(str4, z2, j8d0Var2, smartOffersRepositoryImpl$fetchSmartOffers$1);
        if (smartOffers2 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SmartOffersRepositoryImpl$getGoogleBillingConfig$1 smartOffersRepositoryImpl$getGoogleBillingConfig$1;
        Object obj;
        int i;
        Throwable th;
        Set set;
        TimeoutCancellationException e;
        Result.Failure failure;
        mcd0 mcd0Var;
        try {
            if (continuationImpl instanceof SmartOffersRepositoryImpl$getGoogleBillingConfig$1) {
                smartOffersRepositoryImpl$getGoogleBillingConfig$1 = (SmartOffersRepositoryImpl$getGoogleBillingConfig$1) continuationImpl;
                int i2 = smartOffersRepositoryImpl$getGoogleBillingConfig$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    smartOffersRepositoryImpl$getGoogleBillingConfig$1.label = i2 - Integer.MIN_VALUE;
                    obj = smartOffersRepositoryImpl$getGoogleBillingConfig$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = smartOffersRepositoryImpl$getGoogleBillingConfig$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Set set2 = (Set) this.d.invoke();
                        try {
                            ocd0 ocd0Var = this.b;
                            smartOffersRepositoryImpl$getGoogleBillingConfig$1.L$0 = null;
                            smartOffersRepositoryImpl$getGoogleBillingConfig$1.L$1 = set2;
                            smartOffersRepositoryImpl$getGoogleBillingConfig$1.L$2 = null;
                            smartOffersRepositoryImpl$getGoogleBillingConfig$1.L$3 = null;
                            smartOffersRepositoryImpl$getGoogleBillingConfig$1.L$4 = null;
                            smartOffersRepositoryImpl$getGoogleBillingConfig$1.L$5 = null;
                            smartOffersRepositoryImpl$getGoogleBillingConfig$1.I$0 = 0;
                            smartOffersRepositoryImpl$getGoogleBillingConfig$1.I$1 = 0;
                            smartOffersRepositoryImpl$getGoogleBillingConfig$1.I$2 = 0;
                            smartOffersRepositoryImpl$getGoogleBillingConfig$1.label = 1;
                            Object e2 = ocd0Var.e(smartOffersRepositoryImpl$getGoogleBillingConfig$1);
                            if (e2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = e2;
                            set = set2;
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            set = set2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            if (obj instanceof Result.Failure) {
                            }
                            mcd0Var = (mcd0) obj;
                            if (mcd0Var != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            set = set2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            if (obj instanceof Result.Failure) {
                            }
                            mcd0Var = (mcd0) obj;
                            if (mcd0Var != null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        set = (Set) smartOffersRepositoryImpl$getGoogleBillingConfig$1.L$1;
                        try {
                            kotlin.b.b(obj);
                        } catch (TimeoutCancellationException e4) {
                            e = e4;
                            failure = new Result.Failure(e);
                            obj = failure;
                            if (obj instanceof Result.Failure) {
                            }
                            mcd0Var = (mcd0) obj;
                            if (mcd0Var != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            failure = new Result.Failure(th);
                            obj = failure;
                            if (obj instanceof Result.Failure) {
                            }
                            mcd0Var = (mcd0) obj;
                            if (mcd0Var != null) {
                            }
                        }
                    }
                    if (obj instanceof Result.Failure) {
                        obj = null;
                    }
                    mcd0Var = (mcd0) obj;
                    if (mcd0Var != null) {
                        return null;
                    }
                    String str = mcd0Var.a;
                    return new PlusPayGoogleBillingConfig(str, set.contains(str));
                }
            }
            if (i != 0) {
            }
            if (obj instanceof Result.Failure) {
            }
            mcd0Var = (mcd0) obj;
            if (mcd0Var != null) {
            }
        } catch (CancellationException e5) {
            throw e5;
        }
        smartOffersRepositoryImpl$getGoogleBillingConfig$1 = new SmartOffersRepositoryImpl$getGoogleBillingConfig$1(this, continuationImpl);
        obj = smartOffersRepositoryImpl$getGoogleBillingConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smartOffersRepositoryImpl$getGoogleBillingConfig$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Set set, EmptySet emptySet, Set set2, Set set3, Map map, String str2, boolean z, ContinuationImpl continuationImpl) {
        SmartOffersRepositoryImpl$getSmartOffers$1 smartOffersRepositoryImpl$getSmartOffers$1;
        int i;
        mwj0 t;
        String str3;
        EmptyList emptyList;
        List list;
        PlusPayCompositeOffers.Offer.StructureType structureType;
        String str4;
        PlusPayCompositeOffers.Offer.Tariff tariff;
        if (continuationImpl instanceof SmartOffersRepositoryImpl$getSmartOffers$1) {
            smartOffersRepositoryImpl$getSmartOffers$1 = (SmartOffersRepositoryImpl$getSmartOffers$1) continuationImpl;
            int i2 = smartOffersRepositoryImpl$getSmartOffers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                smartOffersRepositoryImpl$getSmartOffers$1.label = i2 - Integer.MIN_VALUE;
                SmartOffersRepositoryImpl$getSmartOffers$1 smartOffersRepositoryImpl$getSmartOffers$12 = smartOffersRepositoryImpl$getSmartOffers$1;
                Object obj = smartOffersRepositoryImpl$getSmartOffers$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smartOffersRepositoryImpl$getSmartOffers$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SmartOffersRepositoryImpl$getSmartOffers$response$1 smartOffersRepositoryImpl$getSmartOffers$response$1 = new SmartOffersRepositoryImpl$getSmartOffers$response$1(this, str2, z, str, set, emptySet, set2, set3, map, null);
                    smartOffersRepositoryImpl$getSmartOffers$12.L$0 = null;
                    smartOffersRepositoryImpl$getSmartOffers$12.L$1 = null;
                    smartOffersRepositoryImpl$getSmartOffers$12.L$2 = null;
                    smartOffersRepositoryImpl$getSmartOffers$12.L$3 = null;
                    smartOffersRepositoryImpl$getSmartOffers$12.L$4 = null;
                    smartOffersRepositoryImpl$getSmartOffers$12.L$5 = null;
                    smartOffersRepositoryImpl$getSmartOffers$12.L$6 = null;
                    smartOffersRepositoryImpl$getSmartOffers$12.Z$0 = z;
                    smartOffersRepositoryImpl$getSmartOffers$12.label = 1;
                    obj = tje.k0(this.e, smartOffersRepositoryImpl$getSmartOffers$response$1, smartOffersRepositoryImpl$getSmartOffers$12);
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
                t = eja1.t((NetworkResponse) obj, new yk(16));
                x9d0 x9d0Var = (x9d0) t.a;
                str3 = x9d0Var.a;
                if (str3 != null) {
                    LogPriority logPriority = LogPriority.ERROR;
                    pgz pgzVar = this.f;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "SmartOffersRepositoryImpl", "Session id for smart offers is null");
                    }
                    throw new PlusPayParseException(new gzj0(new IllegalStateException("sessionId is required field for smart offers")));
                }
                List list2 = x9d0Var.f;
                EmptyList emptyList2 = EmptyList.a;
                if (list2 != null) {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        w9d0 w9d0Var = (w9d0) it.next();
                        String str5 = x9d0Var.b;
                        String str6 = x9d0Var.e;
                        String str7 = x9d0Var.c;
                        Long l = x9d0Var.d;
                        i9d0 i9d0Var = w9d0Var.a;
                        s9d0 s9d0Var = w9d0Var.i;
                        boolean l2 = jl40.l(w9d0Var.g, Boolean.TRUE);
                        int i3 = w9d0Var.d;
                        String str8 = w9d0Var.c;
                        String str9 = w9d0Var.e;
                        Set set4 = w9d0Var.f;
                        if (set4 == null) {
                            set4 = EmptySet.a;
                        }
                        PlusPaySmartOffer.TargetAndFeatures targetAndFeatures = new PlusPaySmartOffer.TargetAndFeatures(str9, set4);
                        String str10 = w9d0Var.b;
                        x9d0 x9d0Var2 = x9d0Var;
                        v9d0 v9d0Var = w9d0Var.h;
                        Iterator it2 = it;
                        PlusPaySmartOffer.Texts texts = new PlusPaySmartOffer.Texts(v9d0Var.a, v9d0Var.b, v9d0Var.c, v9d0Var.d, v9d0Var.e, v9d0Var.f, v9d0Var.g, v9d0Var.h, v9d0Var.i, v9d0Var.j, v9d0Var.k, v9d0Var.l);
                        String str11 = s9d0Var.a;
                        List list4 = s9d0Var.c;
                        String str12 = s9d0Var.b;
                        List<q9d0> list5 = list4;
                        String str13 = str3;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list5, 10));
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            q9d0 q9d0Var = (q9d0) it3.next();
                            String str14 = str6;
                            String str15 = q9d0Var.a;
                            p9d0 p9d0Var = q9d0Var.b;
                            arrayList2.add(new PlusPaySmartOffer.Legals.Argument(str15, p9d0Var.a, p9d0Var.b));
                            it3 = it3;
                            str7 = str7;
                            str6 = str14;
                        }
                        String str16 = str6;
                        PlusPaySmartOffer.Legals legals = new PlusPaySmartOffer.Legals(str11, str12, arrayList2);
                        PlusPaySmartOffer.Meta meta = new PlusPaySmartOffer.Meta(str13, i9d0Var.a, i9d0Var.b, str7, l, i9d0Var.c);
                        s8d0 s8d0Var = w9d0Var.j;
                        String str17 = i9d0Var.a;
                        List list6 = s8d0Var.d;
                        aad0 aad0Var = s8d0Var.c;
                        PlusPayCompositeOffers.Offer.StructureType structureType2 = (list6.isEmpty() || aad0Var == null) ? list6.size() > 1 ? PlusPayCompositeOffers.Offer.StructureType.COMPOSITE : aad0Var != null ? PlusPayCompositeOffers.Offer.StructureType.TARIFF : !list6.isEmpty() ? PlusPayCompositeOffers.Offer.StructureType.OPTION : PlusPayCompositeOffers.Offer.StructureType.TARIFF : PlusPayCompositeOffers.Offer.StructureType.COMPOSITE;
                        String str18 = s8d0Var.a;
                        m8d0 m8d0Var = s8d0Var.b;
                        String str19 = m8d0Var != null ? m8d0Var.a : null;
                        if (aad0Var != null) {
                            str4 = str8;
                            String str20 = aad0Var.a;
                            String str21 = aad0Var.f.a;
                            String str22 = aad0Var.b;
                            String str23 = aad0Var.c;
                            String str24 = aad0Var.d;
                            String str25 = aad0Var.e;
                            list = list6;
                            z8d0 z8d0Var = aad0Var.h;
                            structureType = structureType2;
                            PlusPayPrice plusPayPrice = new PlusPayPrice(z8d0Var.a, z8d0Var.b);
                            String str26 = aad0Var.g;
                            int i4 = pzs0.a[aad0Var.i.ordinal()];
                            tariff = new PlusPayCompositeOffers.Offer.Tariff(str20, str21, str22, str23, str24, str25, plusPayPrice, str26, emptyList2, i4 != 1 ? i4 != 2 ? PlusPayCompositeOffers.Offer.Vendor.UNKNOWN : PlusPayCompositeOffers.Offer.Vendor.NATIVE : PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY, aad0Var.j);
                        } else {
                            list = list6;
                            structureType = structureType2;
                            str4 = str8;
                            tariff = null;
                        }
                        List list7 = list;
                        ArrayList arrayList3 = new ArrayList(tcc.n(list7, 10));
                        Iterator it4 = list7.iterator();
                        while (it4.hasNext()) {
                            w8d0 w8d0Var = (w8d0) it4.next();
                            PlusPayCompositeOffers.Offer.Tariff tariff2 = tariff;
                            String str27 = w8d0Var.a;
                            String str28 = w8d0Var.f.a;
                            String str29 = w8d0Var.b;
                            String str30 = w8d0Var.c;
                            String str31 = w8d0Var.d;
                            String str32 = w8d0Var.e;
                            Iterator it5 = it4;
                            z8d0 z8d0Var2 = w8d0Var.h;
                            String str33 = str18;
                            PlusPayPrice plusPayPrice2 = new PlusPayPrice(z8d0Var2.a, z8d0Var2.b);
                            String str34 = w8d0Var.g;
                            int i5 = pzs0.a[w8d0Var.i.ordinal()];
                            arrayList3.add(new PlusPayCompositeOffers.Offer.Option(str27, str28, str29, str30, str31, str32, plusPayPrice2, str34, emptyList2, i5 != 1 ? i5 != 2 ? PlusPayCompositeOffers.Offer.Vendor.UNKNOWN : PlusPayCompositeOffers.Offer.Vendor.NATIVE : PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY, w8d0Var.j));
                            tariff = tariff2;
                            it4 = it5;
                            str18 = str33;
                        }
                        PlusPayCompositeOffers.Offer.Tariff tariff3 = tariff;
                        String str35 = str18;
                        ArrayList arrayList4 = new ArrayList(tcc.n(list5, 10));
                        for (q9d0 q9d0Var2 : list5) {
                            String str36 = q9d0Var2.a;
                            p9d0 p9d0Var2 = q9d0Var2.b;
                            arrayList4.add(new PlusPayLegalInfo.Item.Link(str36, p9d0Var2.a, p9d0Var2.b));
                        }
                        PlusPayLegalInfo plusPayLegalInfo = new PlusPayLegalInfo(str12, arrayList4);
                        p8d0 p8d0Var = s8d0Var.e;
                        EmptyList emptyList3 = emptyList2;
                        emptyList2 = emptyList3;
                        arrayList.add(new PlusPaySmartOffer(i3, str5, str4, targetAndFeatures, str10, l2, texts, legals, str16, meta, new PlusPayCompositeOffers.Offer(str35, structureType, str19, tariff3, arrayList3, plusPayLegalInfo, emptyList3, false, new PlusPayCompositeOffers.Offer.Assets(p8d0Var.a, p8d0Var.b, p8d0Var.c), l2, new PlusPayCompositeOffers.Offer.Meta(str13, str9, str17))));
                        str3 = str13;
                        it = it2;
                        x9d0Var = x9d0Var2;
                    }
                    emptyList = arrayList;
                } else {
                    emptyList = null;
                }
                String str37 = str3;
                if (emptyList == null) {
                    emptyList = emptyList2;
                }
                return new SmartOffersBatch(str37, emptyList);
            }
        }
        smartOffersRepositoryImpl$getSmartOffers$1 = new SmartOffersRepositoryImpl$getSmartOffers$1(this, continuationImpl);
        SmartOffersRepositoryImpl$getSmartOffers$1 smartOffersRepositoryImpl$getSmartOffers$122 = smartOffersRepositoryImpl$getSmartOffers$1;
        Object obj2 = smartOffersRepositoryImpl$getSmartOffers$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smartOffersRepositoryImpl$getSmartOffers$122.label;
        if (i != 0) {
        }
        t = eja1.t((NetworkResponse) obj2, new yk(16));
        x9d0 x9d0Var3 = (x9d0) t.a;
        str3 = x9d0Var3.a;
        if (str3 != null) {
        }
    }
}
