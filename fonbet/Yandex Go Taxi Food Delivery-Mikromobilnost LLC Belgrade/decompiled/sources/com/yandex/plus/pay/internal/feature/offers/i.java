package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.aed0;
import defpackage.fnb0;
import defpackage.gt90;
import defpackage.mdd0;
import defpackage.mzs0;
import defpackage.ndd0;
import defpackage.nqd;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zdd0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class i implements aed0 {
    public final nqd a;
    public final mzs0 b;
    public final mdd0 c;
    public final com.yandex.plus.core.benchmark.a d;
    public final com.yandex.plus.core.benchmark.b e;

    public i(nqd nqdVar, mzs0 mzs0Var, ndd0 ndd0Var, com.yandex.plus.core.benchmark.a aVar) {
        this.a = nqdVar;
        this.b = mzs0Var;
        this.c = ndd0Var;
        this.d = aVar;
        this.e = aVar.c("Offers.Loading");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(4:11|12|13|14)(2:36|37))(4:38|39|40|(1:42)(1:43))|15|16|17|18|(2:20|21)(2:23|(1:25)(2:26|27))))|58|6|7|8|(0)(0)|15|16|17|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ca, code lost:
    
        r4 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        r0 = r4;
        r1 = r1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c0, code lost:
    
        r4 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v4, types: [mdd0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, PlusPayAnalyticsParams plusPayAnalyticsParams, zdd0 zdd0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        PlusPayOffersServiceImpl$getCompositeOffers$1 plusPayOffersServiceImpl$getCompositeOffers$1;
        ?? r2;
        com.yandex.plus.core.benchmark.a aVar;
        com.yandex.plus.core.benchmark.b bVar;
        Throwable a;
        boolean z;
        PlusPayAnalyticsParams plusPayAnalyticsParams2;
        zdd0 zdd0Var2;
        mdd0 mdd0Var;
        try {
            if (continuationImpl instanceof PlusPayOffersServiceImpl$getCompositeOffers$1) {
                plusPayOffersServiceImpl$getCompositeOffers$1 = (PlusPayOffersServiceImpl$getCompositeOffers$1) continuationImpl;
                int i = plusPayOffersServiceImpl$getCompositeOffers$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    plusPayOffersServiceImpl$getCompositeOffers$1.label = i - Integer.MIN_VALUE;
                    PlusPayOffersServiceImpl$getCompositeOffers$1 plusPayOffersServiceImpl$getCompositeOffers$12 = plusPayOffersServiceImpl$getCompositeOffers$1;
                    Object obj = plusPayOffersServiceImpl$getCompositeOffers$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = plusPayOffersServiceImpl$getCompositeOffers$12.label;
                    mdd0 mdd0Var2 = this.c;
                    aVar = this.d;
                    ?? r3 = 1;
                    bVar = this.e;
                    if (r2 != 0) {
                        kotlin.b.b(obj);
                        bVar.b();
                        z = false;
                        try {
                            nqd nqdVar = this.a;
                            plusPayOffersServiceImpl$getCompositeOffers$12.L$0 = str;
                            plusPayOffersServiceImpl$getCompositeOffers$12.L$1 = plusPayAnalyticsParams;
                            plusPayOffersServiceImpl$getCompositeOffers$12.L$2 = zdd0Var;
                            plusPayOffersServiceImpl$getCompositeOffers$12.L$3 = null;
                            plusPayOffersServiceImpl$getCompositeOffers$12.L$4 = mdd0Var2;
                            plusPayOffersServiceImpl$getCompositeOffers$12.L$5 = null;
                            plusPayOffersServiceImpl$getCompositeOffers$12.L$6 = null;
                            plusPayOffersServiceImpl$getCompositeOffers$12.L$7 = null;
                            plusPayOffersServiceImpl$getCompositeOffers$12.L$8 = null;
                            plusPayOffersServiceImpl$getCompositeOffers$12.Z$0 = false;
                            plusPayOffersServiceImpl$getCompositeOffers$12.I$0 = 0;
                            plusPayOffersServiceImpl$getCompositeOffers$12.I$1 = 0;
                            plusPayOffersServiceImpl$getCompositeOffers$12.I$2 = 0;
                            plusPayOffersServiceImpl$getCompositeOffers$12.I$3 = 0;
                            plusPayOffersServiceImpl$getCompositeOffers$12.I$4 = 0;
                            plusPayOffersServiceImpl$getCompositeOffers$12.I$5 = 0;
                            plusPayOffersServiceImpl$getCompositeOffers$12.label = 1;
                            obj = ((b) nqdVar).a(str, plusPayAnalyticsParams, zdd0Var, tlsVar, plusPayOffersServiceImpl$getCompositeOffers$12);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            plusPayAnalyticsParams2 = plusPayAnalyticsParams;
                            zdd0Var2 = zdd0Var;
                            mdd0Var = mdd0Var2;
                        } catch (Throwable th) {
                            th = th;
                            bVar.c();
                            aVar.b(bVar, null);
                            throw th;
                        }
                    } else {
                        if (r2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = plusPayOffersServiceImpl$getCompositeOffers$12.Z$0;
                        mdd0 mdd0Var3 = (mdd0) plusPayOffersServiceImpl$getCompositeOffers$12.L$4;
                        zdd0 zdd0Var3 = (zdd0) plusPayOffersServiceImpl$getCompositeOffers$12.L$2;
                        PlusPayAnalyticsParams plusPayAnalyticsParams3 = (PlusPayAnalyticsParams) plusPayOffersServiceImpl$getCompositeOffers$12.L$1;
                        String str2 = (String) plusPayOffersServiceImpl$getCompositeOffers$12.L$0;
                        try {
                            kotlin.b.b(obj);
                            z = z2;
                            str = str2;
                            mdd0Var = mdd0Var3;
                            zdd0Var2 = zdd0Var3;
                            plusPayAnalyticsParams2 = plusPayAnalyticsParams3;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar.c();
                            aVar.b(bVar, null);
                            throw th;
                        }
                    }
                    Object obj2 = (PlusPayCompositeOffers) obj;
                    bVar.c();
                    aVar.b(bVar, null);
                    ?? r1 = mdd0Var;
                    zdd0 zdd0Var4 = zdd0Var2;
                    r3 = plusPayAnalyticsParams2;
                    a = Result.a(obj2);
                    if (a == null) {
                        if (a instanceof PlusPayException) {
                            throw a;
                        }
                        mdd0.g(r1, gt90.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayCompositeOffers plusPayCompositeOffers = (PlusPayCompositeOffers) obj2;
                    mdd0.c(mdd0Var2, gt90.b, this + ".getCompositeOffers(" + str + Extension.FIX_SPACE + z + Extension.FIX_SPACE + r3.asString$pay_sdk_release() + Extension.FIX_SPACE + zdd0Var4 + ") = " + plusPayCompositeOffers);
                    return plusPayCompositeOffers;
                }
            }
            Object obj22 = (PlusPayCompositeOffers) obj;
            bVar.c();
            aVar.b(bVar, null);
            ?? r12 = mdd0Var;
            zdd0 zdd0Var42 = zdd0Var2;
            r3 = plusPayAnalyticsParams2;
            a = Result.a(obj22);
            if (a == null) {
            }
        } catch (Throwable th3) {
            th = th3;
            bVar.c();
            aVar.b(bVar, null);
            throw th;
        }
        plusPayOffersServiceImpl$getCompositeOffers$1 = new PlusPayOffersServiceImpl$getCompositeOffers$1(this, continuationImpl);
        PlusPayOffersServiceImpl$getCompositeOffers$1 plusPayOffersServiceImpl$getCompositeOffers$122 = plusPayOffersServiceImpl$getCompositeOffers$1;
        Object obj3 = plusPayOffersServiceImpl$getCompositeOffers$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = plusPayOffersServiceImpl$getCompositeOffers$122.label;
        mdd0 mdd0Var22 = this.c;
        aVar = this.d;
        ?? r32 = 1;
        bVar = this.e;
        if (r2 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(4:11|12|13|14)(2:38|39))(4:40|41|42|(1:44)(1:45))|15|16|17|(2:19|20)(2:22|(1:24)(2:25|26))))|54|6|7|8|(0)(0)|15|16|17|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Set set, Map map, PlusPayAnalyticsParams plusPayAnalyticsParams, boolean z, fnb0 fnb0Var, ContinuationImpl continuationImpl) {
        PlusPayOffersServiceImpl$getSmartOffers$1 plusPayOffersServiceImpl$getSmartOffers$1;
        int i;
        Set set2;
        PlusPayAnalyticsParams plusPayAnalyticsParams2;
        boolean z2;
        mdd0 mdd0Var;
        Result.Failure failure;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusPayOffersServiceImpl$getSmartOffers$1) {
                plusPayOffersServiceImpl$getSmartOffers$1 = (PlusPayOffersServiceImpl$getSmartOffers$1) continuationImpl;
                int i2 = plusPayOffersServiceImpl$getSmartOffers$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusPayOffersServiceImpl$getSmartOffers$1.label = i2 - Integer.MIN_VALUE;
                    PlusPayOffersServiceImpl$getSmartOffers$1 plusPayOffersServiceImpl$getSmartOffers$12 = plusPayOffersServiceImpl$getSmartOffers$1;
                    Object obj2 = plusPayOffersServiceImpl$getSmartOffers$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusPayOffersServiceImpl$getSmartOffers$12.label;
                    mdd0 mdd0Var2 = this.c;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        try {
                            mzs0 mzs0Var = this.b;
                            plusPayOffersServiceImpl$getSmartOffers$12.L$0 = str;
                            plusPayOffersServiceImpl$getSmartOffers$12.L$1 = set;
                            plusPayOffersServiceImpl$getSmartOffers$12.L$2 = map;
                            plusPayOffersServiceImpl$getSmartOffers$12.L$3 = plusPayAnalyticsParams;
                            plusPayOffersServiceImpl$getSmartOffers$12.L$4 = null;
                            plusPayOffersServiceImpl$getSmartOffers$12.L$5 = mdd0Var2;
                            plusPayOffersServiceImpl$getSmartOffers$12.L$6 = null;
                            plusPayOffersServiceImpl$getSmartOffers$12.L$7 = null;
                            plusPayOffersServiceImpl$getSmartOffers$12.L$8 = null;
                            plusPayOffersServiceImpl$getSmartOffers$12.L$9 = null;
                            plusPayOffersServiceImpl$getSmartOffers$12.Z$0 = z;
                            plusPayOffersServiceImpl$getSmartOffers$12.I$0 = 0;
                            plusPayOffersServiceImpl$getSmartOffers$12.I$1 = 0;
                            plusPayOffersServiceImpl$getSmartOffers$12.I$2 = 0;
                            plusPayOffersServiceImpl$getSmartOffers$12.I$3 = 0;
                            plusPayOffersServiceImpl$getSmartOffers$12.I$4 = 0;
                            plusPayOffersServiceImpl$getSmartOffers$12.I$5 = 0;
                            plusPayOffersServiceImpl$getSmartOffers$12.label = 1;
                            obj2 = ((com.yandex.plus.pay.internal.feature.offers.smart.a) mzs0Var).b(str, set, map, plusPayAnalyticsParams, z, fnb0Var, plusPayOffersServiceImpl$getSmartOffers$12);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            set2 = set;
                            plusPayAnalyticsParams2 = plusPayAnalyticsParams;
                            z2 = z;
                            mdd0Var = mdd0Var2;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            set2 = set;
                            plusPayAnalyticsParams2 = plusPayAnalyticsParams;
                            z2 = z;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            set2 = set;
                            plusPayAnalyticsParams2 = plusPayAnalyticsParams;
                            z2 = z;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z3 = plusPayOffersServiceImpl$getSmartOffers$12.Z$0;
                        mdd0Var = (mdd0) plusPayOffersServiceImpl$getSmartOffers$12.L$5;
                        PlusPayAnalyticsParams plusPayAnalyticsParams3 = (PlusPayAnalyticsParams) plusPayOffersServiceImpl$getSmartOffers$12.L$3;
                        Map map2 = (Map) plusPayOffersServiceImpl$getSmartOffers$12.L$2;
                        set2 = (Set) plusPayOffersServiceImpl$getSmartOffers$12.L$1;
                        String str2 = (String) plusPayOffersServiceImpl$getSmartOffers$12.L$0;
                        try {
                            kotlin.b.b(obj2);
                            z2 = z3;
                            str = str2;
                            plusPayAnalyticsParams2 = plusPayAnalyticsParams3;
                            map = map2;
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            z2 = z3;
                            str = str2;
                            plusPayAnalyticsParams2 = plusPayAnalyticsParams3;
                            map = map2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = z3;
                            str = str2;
                            plusPayAnalyticsParams2 = plusPayAnalyticsParams3;
                            map = map2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = (List) obj2;
                    a = Result.a(obj);
                    if (a == null) {
                        if (a instanceof PlusPayException) {
                            throw a;
                        }
                        mdd0.g(mdd0Var, gt90.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    List list = (List) obj;
                    mdd0.c(mdd0Var2, gt90.b, this + ".getSmartOffers(" + str + Extension.FIX_SPACE + set2 + Extension.FIX_SPACE + map + Extension.FIX_SPACE + plusPayAnalyticsParams2 + Extension.FIX_SPACE + z2 + ") = " + list);
                    return list;
                }
            }
            if (i != 0) {
            }
            obj = (List) obj2;
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        plusPayOffersServiceImpl$getSmartOffers$1 = new PlusPayOffersServiceImpl$getSmartOffers$1(this, continuationImpl);
        PlusPayOffersServiceImpl$getSmartOffers$1 plusPayOffersServiceImpl$getSmartOffers$122 = plusPayOffersServiceImpl$getSmartOffers$1;
        Object obj22 = plusPayOffersServiceImpl$getSmartOffers$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayOffersServiceImpl$getSmartOffers$122.label;
        mdd0 mdd0Var22 = this.c;
    }
}
