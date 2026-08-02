package com.yandex.plus.pay.internal.feature.upsale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import com.yandex.plus.pay.inapp.api.PlusPayInAppProductType;
import com.yandex.plus.pay.repository.api.model.offers.InAppReplacementParams;
import com.yandex.plus.pay.repository.api.model.upsale.CompositeUpsale;
import com.yandex.plus.pay.repository.api.model.upsale.CompositeUpsales;
import defpackage.EvgenOffersAnalytics$LoadReason;
import defpackage.b9h;
import defpackage.bgd0;
import defpackage.grx0;
import defpackage.i3y;
import defpackage.mdd0;
import defpackage.ny61;
import defpackage.ocd0;
import defpackage.rcd0;
import defpackage.tcc;
import defpackage.tcd0;
import defpackage.yad0;
import defpackage.ykv;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class a implements zsd {
    public final com.yandex.plus.pay.graphql.upsale.a a;
    public final bgd0 b;
    public final ocd0 c;
    public final mdd0 d;
    public final i3y e = kotlin.a.a(new b9h(0));

    public a(com.yandex.plus.pay.graphql.upsale.a aVar, bgd0 bgd0Var, ocd0 ocd0Var, mdd0 mdd0Var) {
        this.a = aVar;
        this.b = bgd0Var;
        this.c = ocd0Var;
        this.d = mdd0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|8|(1:(1:(9:12|13|14|15|(1:17)|18|(1:20)|21|(2:23|24)(2:26|27))(2:29|30))(4:31|32|33|34))(15:62|63|64|65|66|67|68|69|70|71|72|73|74|75|76)|35|36|37|(1:39)|40|(4:43|(2:45|46)(1:48)|47|41)|49|50))|110|6|7|8|(0)(0)|35|36|37|(0)|40|(1:41)|49|50|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x016d, code lost:
    
        r1 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0169, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x016b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x016c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0164, code lost:
    
        r1 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0161, code lost:
    
        if (r0 == r2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0163, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c4, code lost:
    
        if (r0 == r2) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0096  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ArrayList arrayList, ContinuationImpl continuationImpl) {
        DefaultCompositeUpsaleInteractor$fetchUpsale$1 defaultCompositeUpsaleInteractor$fetchUpsale$1;
        Object obj;
        int i;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList2;
        ocd0 ocd0Var;
        PlusPayInAppProductType plusPayInAppProductType;
        Result.Failure failure;
        try {
            if (continuationImpl instanceof DefaultCompositeUpsaleInteractor$fetchUpsale$1) {
                defaultCompositeUpsaleInteractor$fetchUpsale$1 = (DefaultCompositeUpsaleInteractor$fetchUpsale$1) continuationImpl;
                int i2 = defaultCompositeUpsaleInteractor$fetchUpsale$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    defaultCompositeUpsaleInteractor$fetchUpsale$1.label = i2 - Integer.MIN_VALUE;
                    DefaultCompositeUpsaleInteractor$fetchUpsale$1 defaultCompositeUpsaleInteractor$fetchUpsale$12 = defaultCompositeUpsaleInteractor$fetchUpsale$1;
                    obj = defaultCompositeUpsaleInteractor$fetchUpsale$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = defaultCompositeUpsaleInteractor$fetchUpsale$12.label;
                    mdd0 mdd0Var = this.d;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        mdd0.c(mdd0Var, PayCoreLogTag.UPSALE, "Start fetching composite upsales");
                        try {
                            ocd0Var = this.c;
                            plusPayInAppProductType = PlusPayInAppProductType.SUBSCRIPTION;
                            str4 = str;
                            try {
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = str4;
                                str5 = str2;
                            } catch (TimeoutCancellationException e) {
                                e = e;
                                str5 = str2;
                                str6 = str3;
                                arrayList2 = arrayList;
                                failure = new Result.Failure(e);
                                obj = failure;
                                String str7 = str5;
                                if (Result.a(obj) != null) {
                                }
                                Iterable<rcd0> iterable = (Iterable) obj;
                                ArrayList arrayList3 = new ArrayList(tcc.n(iterable, 10));
                                while (r0.hasNext()) {
                                }
                                com.yandex.plus.pay.graphql.upsale.a aVar = this.a;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$7 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 2;
                                obj = aVar.a(str4, str7, arrayList2, str6, arrayList3, defaultCompositeUpsaleInteractor$fetchUpsale$12);
                            } catch (Throwable th) {
                                th = th;
                                str5 = str2;
                                str6 = str3;
                                arrayList2 = arrayList;
                                failure = new Result.Failure(th);
                                obj = failure;
                                String str72 = str5;
                                if (Result.a(obj) != null) {
                                }
                                Iterable<rcd0> iterable2 = (Iterable) obj;
                                ArrayList arrayList32 = new ArrayList(tcc.n(iterable2, 10));
                                while (r0.hasNext()) {
                                }
                                com.yandex.plus.pay.graphql.upsale.a aVar2 = this.a;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$7 = null;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 2;
                                obj = aVar2.a(str4, str72, arrayList2, str6, arrayList32, defaultCompositeUpsaleInteractor$fetchUpsale$12);
                            }
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            str4 = str;
                        } catch (Throwable th2) {
                            th = th2;
                            str4 = str;
                        }
                        try {
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = str5;
                            arrayList2 = arrayList;
                            try {
                                defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = arrayList2;
                                str6 = str3;
                                try {
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = str6;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 1;
                                    obj = ocd0Var.b(plusPayInAppProductType, defaultCompositeUpsaleInteractor$fetchUpsale$12);
                                } catch (TimeoutCancellationException e3) {
                                    e = e3;
                                    failure = new Result.Failure(e);
                                    obj = failure;
                                    String str722 = str5;
                                    if (Result.a(obj) != null) {
                                    }
                                    Iterable<rcd0> iterable22 = (Iterable) obj;
                                    ArrayList arrayList322 = new ArrayList(tcc.n(iterable22, 10));
                                    while (r0.hasNext()) {
                                    }
                                    com.yandex.plus.pay.graphql.upsale.a aVar22 = this.a;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$7 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 2;
                                    obj = aVar22.a(str4, str722, arrayList2, str6, arrayList322, defaultCompositeUpsaleInteractor$fetchUpsale$12);
                                } catch (Throwable th3) {
                                    th = th3;
                                    failure = new Result.Failure(th);
                                    obj = failure;
                                    String str7222 = str5;
                                    if (Result.a(obj) != null) {
                                    }
                                    Iterable<rcd0> iterable222 = (Iterable) obj;
                                    ArrayList arrayList3222 = new ArrayList(tcc.n(iterable222, 10));
                                    while (r0.hasNext()) {
                                    }
                                    com.yandex.plus.pay.graphql.upsale.a aVar222 = this.a;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$7 = null;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
                                    defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 2;
                                    obj = aVar222.a(str4, str7222, arrayList2, str6, arrayList3222, defaultCompositeUpsaleInteractor$fetchUpsale$12);
                                }
                            } catch (TimeoutCancellationException e4) {
                                e = e4;
                                str6 = str3;
                            } catch (Throwable th4) {
                                th = th4;
                                str6 = str3;
                            }
                        } catch (TimeoutCancellationException e5) {
                            e = e5;
                            str6 = str3;
                            arrayList2 = arrayList;
                            failure = new Result.Failure(e);
                            obj = failure;
                            String str72222 = str5;
                            if (Result.a(obj) != null) {
                            }
                            Iterable<rcd0> iterable2222 = (Iterable) obj;
                            ArrayList arrayList32222 = new ArrayList(tcc.n(iterable2222, 10));
                            while (r0.hasNext()) {
                            }
                            com.yandex.plus.pay.graphql.upsale.a aVar2222 = this.a;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$7 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 2;
                            obj = aVar2222.a(str4, str72222, arrayList2, str6, arrayList32222, defaultCompositeUpsaleInteractor$fetchUpsale$12);
                        } catch (Throwable th5) {
                            th = th5;
                            str6 = str3;
                            arrayList2 = arrayList;
                            failure = new Result.Failure(th);
                            obj = failure;
                            String str722222 = str5;
                            if (Result.a(obj) != null) {
                            }
                            Iterable<rcd0> iterable22222 = (Iterable) obj;
                            ArrayList arrayList322222 = new ArrayList(tcc.n(iterable22222, 10));
                            while (r0.hasNext()) {
                            }
                            com.yandex.plus.pay.graphql.upsale.a aVar22222 = this.a;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$7 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 2;
                            obj = aVar22222.a(str4, str722222, arrayList2, str6, arrayList322222, defaultCompositeUpsaleInteractor$fetchUpsale$12);
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            Throwable a = Result.a(obj);
                            if (a != null) {
                                mdd0.g(mdd0Var, PayCoreLogTag.UPSALE, "Error when fetching upsales: " + a, null, 12);
                            }
                            if (obj instanceof Result.Failure) {
                                obj = null;
                            }
                            CompositeUpsales compositeUpsales = (CompositeUpsales) obj;
                            if (compositeUpsales == null) {
                                mdd0.c(mdd0Var, PayCoreLogTag.UPSALE, "Composite upsales is null");
                                return null;
                            }
                            mdd0.c(mdd0Var, PayCoreLogTag.UPSALE, "Composite upsales is loaded: " + compositeUpsales);
                            return compositeUpsales;
                        }
                        String str8 = (String) defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3;
                        ?? r5 = (List) defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2;
                        String str9 = (String) defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1;
                        String str10 = (String) defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0;
                        try {
                            kotlin.b.b(obj);
                            str5 = str9;
                            str4 = str10;
                            str6 = str8;
                            arrayList2 = r5;
                        } catch (TimeoutCancellationException e6) {
                            e = e6;
                            str5 = str9;
                            str4 = str10;
                            str6 = str8;
                            arrayList2 = r5;
                            failure = new Result.Failure(e);
                            obj = failure;
                            String str7222222 = str5;
                            if (Result.a(obj) != null) {
                            }
                            Iterable<rcd0> iterable222222 = (Iterable) obj;
                            ArrayList arrayList3222222 = new ArrayList(tcc.n(iterable222222, 10));
                            while (r0.hasNext()) {
                            }
                            com.yandex.plus.pay.graphql.upsale.a aVar222222 = this.a;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$7 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 2;
                            obj = aVar222222.a(str4, str7222222, arrayList2, str6, arrayList3222222, defaultCompositeUpsaleInteractor$fetchUpsale$12);
                        } catch (Throwable th6) {
                            th = th6;
                            str5 = str9;
                            str4 = str10;
                            str6 = str8;
                            arrayList2 = r5;
                            failure = new Result.Failure(th);
                            obj = failure;
                            String str72222222 = str5;
                            if (Result.a(obj) != null) {
                            }
                            Iterable<rcd0> iterable2222222 = (Iterable) obj;
                            ArrayList arrayList32222222 = new ArrayList(tcc.n(iterable2222222, 10));
                            while (r0.hasNext()) {
                            }
                            com.yandex.plus.pay.graphql.upsale.a aVar2222222 = this.a;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$7 = null;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
                            defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 2;
                            obj = aVar2222222.a(str4, str72222222, arrayList2, str6, arrayList32222222, defaultCompositeUpsaleInteractor$fetchUpsale$12);
                        }
                    }
                    String str722222222 = str5;
                    if (Result.a(obj) != null) {
                        obj = EmptyList.a;
                    }
                    Iterable<rcd0> iterable22222222 = (Iterable) obj;
                    ArrayList arrayList322222222 = new ArrayList(tcc.n(iterable22222222, 10));
                    for (rcd0 rcd0Var : iterable22222222) {
                        String str11 = rcd0Var.e;
                        String str12 = rcd0Var.a;
                        if (str12 == null) {
                            str12 = "";
                        }
                        arrayList322222222.add(new ykv(str11, str12, (String) kotlin.collections.a.P(rcd0Var.b)));
                    }
                    com.yandex.plus.pay.graphql.upsale.a aVar22222222 = this.a;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = null;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = null;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = null;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = null;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.L$7 = null;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
                    defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 2;
                    obj = aVar22222222.a(str4, str722222222, arrayList2, str6, arrayList322222222, defaultCompositeUpsaleInteractor$fetchUpsale$12);
                }
            }
            if (i != 0) {
            }
            String str7222222222 = str5;
            if (Result.a(obj) != null) {
            }
            Iterable<rcd0> iterable222222222 = (Iterable) obj;
            ArrayList arrayList3222222222 = new ArrayList(tcc.n(iterable222222222, 10));
            while (r0.hasNext()) {
            }
            com.yandex.plus.pay.graphql.upsale.a aVar222222222 = this.a;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$0 = null;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$1 = null;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$2 = null;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$3 = null;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$4 = null;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$5 = null;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$6 = null;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.L$7 = null;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.I$0 = 0;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.I$1 = 0;
            defaultCompositeUpsaleInteractor$fetchUpsale$12.label = 2;
            obj = aVar222222222.a(str4, str7222222222, arrayList2, str6, arrayList3222222222, defaultCompositeUpsaleInteractor$fetchUpsale$12);
        } catch (CancellationException e7) {
            throw e7;
        }
        defaultCompositeUpsaleInteractor$fetchUpsale$1 = new DefaultCompositeUpsaleInteractor$fetchUpsale$1(this, continuationImpl);
        DefaultCompositeUpsaleInteractor$fetchUpsale$1 defaultCompositeUpsaleInteractor$fetchUpsale$122 = defaultCompositeUpsaleInteractor$fetchUpsale$1;
        obj = defaultCompositeUpsaleInteractor$fetchUpsale$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultCompositeUpsaleInteractor$fetchUpsale$122.label;
        mdd0 mdd0Var2 = this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayCompositeOffers.Offer offer, ContinuationImpl continuationImpl) {
        DefaultCompositeUpsaleInteractor$getUpsale$1 defaultCompositeUpsaleInteractor$getUpsale$1;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        CompositeUpsales compositeUpsales;
        PlusPayCompositeUpsale plusPayCompositeUpsale;
        if (continuationImpl instanceof DefaultCompositeUpsaleInteractor$getUpsale$1) {
            defaultCompositeUpsaleInteractor$getUpsale$1 = (DefaultCompositeUpsaleInteractor$getUpsale$1) continuationImpl;
            int i2 = defaultCompositeUpsaleInteractor$getUpsale$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultCompositeUpsaleInteractor$getUpsale$1.label = i2 - Integer.MIN_VALUE;
                DefaultCompositeUpsaleInteractor$getUpsale$1 defaultCompositeUpsaleInteractor$getUpsale$12 = defaultCompositeUpsaleInteractor$getUpsale$1;
                Object obj = defaultCompositeUpsaleInteractor$getUpsale$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultCompositeUpsaleInteractor$getUpsale$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String sessionId = offer.getMeta().getSessionId();
                    String productTarget = offer.getMeta().getProductTarget();
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    defaultCompositeUpsaleInteractor$getUpsale$12.L$0 = offer;
                    defaultCompositeUpsaleInteractor$getUpsale$12.label = 1;
                    obj = a(sessionId, productTarget, id, arrayList, defaultCompositeUpsaleInteractor$getUpsale$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                    offer2 = offer;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    offer2 = (PlusPayCompositeOffers.Offer) defaultCompositeUpsaleInteractor$getUpsale$12.L$0;
                    kotlin.b.b(obj);
                }
                compositeUpsales = (CompositeUpsales) obj;
                if (compositeUpsales != null) {
                    return null;
                }
                CompositeUpsale compositeUpsale = (CompositeUpsale) kotlin.collections.a.R(compositeUpsales.getList());
                if (compositeUpsale != null) {
                    yad0 yad0Var = (yad0) this.e.getValue();
                    yad0Var.getClass();
                    PlusPayCompositeOffers.Offer c = yad0Var.c(compositeUpsale.getOffer(), compositeUpsale.getMeta().getSessionId(), offer2.getMeta().getProductTarget(), compositeUpsale.getMeta().getOffersBatchId(), true);
                    CompositeUpsale.Template template = compositeUpsale.getTemplate();
                    PlusPayCompositeUpsale.Template template2 = new PlusPayCompositeUpsale.Template(template.getTitle(), template.getSubtitle(), template.getOfferText(), template.getAdditionalOfferText(), template.getBenefits(), template.getAcceptButtonText(), template.getRejectButtonText(), new PlusPayCompositeUpsale.Template.MainImage(template.getMainImageMobile(), template.getMainImageTv()));
                    InAppReplacementParams inAppReplacementParams = compositeUpsale.getInAppReplacementParams();
                    plusPayCompositeUpsale = new PlusPayCompositeUpsale(c, template2, inAppReplacementParams != null ? tcd0.a(inAppReplacementParams) : null);
                } else {
                    plusPayCompositeUpsale = null;
                }
                bgd0 bgd0Var = this.b;
                if (plusPayCompositeUpsale == null) {
                    ((grx0) bgd0Var).a.c(offer2.getMeta().getSessionId(), EvgenOffersAnalytics$LoadReason.Upsale, offer2.getMeta().getProductTarget(), "Backend returned empty list of offers");
                    return plusPayCompositeUpsale;
                }
                PlusPayCompositeOffers.Offer offer3 = plusPayCompositeUpsale.getOffer();
                ((grx0) bgd0Var).a.d(offer3.getMeta().getSessionId(), offer3.getMeta().getProductTarget(), offer3.getMeta().getOffersBatchId(), Collections.singletonList(offer3.getPositionId()));
                return plusPayCompositeUpsale;
            }
        }
        defaultCompositeUpsaleInteractor$getUpsale$1 = new DefaultCompositeUpsaleInteractor$getUpsale$1(this, continuationImpl);
        DefaultCompositeUpsaleInteractor$getUpsale$1 defaultCompositeUpsaleInteractor$getUpsale$122 = defaultCompositeUpsaleInteractor$getUpsale$1;
        Object obj3 = defaultCompositeUpsaleInteractor$getUpsale$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultCompositeUpsaleInteractor$getUpsale$122.label;
        if (i != 0) {
        }
        compositeUpsales = (CompositeUpsales) obj3;
        if (compositeUpsales != null) {
        }
    }
}
