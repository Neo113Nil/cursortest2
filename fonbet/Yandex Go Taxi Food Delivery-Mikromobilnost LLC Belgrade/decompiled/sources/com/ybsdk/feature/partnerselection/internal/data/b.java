package com.ybsdk.feature.partnerselection.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.partnerselection.internal.network.PartnerSelectionTipsApi;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.CheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderPartnersByCountryRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.partner.GetAllPartnersRequest;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.iyd0;
import defpackage.ji90;
import defpackage.ny61;
import defpackage.tv3;
import defpackage.wlp;
import defpackage.ynb1;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b implements ji90 {
    public final PartnerSelectionTipsApi a;
    public final tv3 b;

    public b(PartnerSelectionTipsApi partnerSelectionTipsApi, tv3 tv3Var) {
        this.a = partnerSelectionTipsApi;
        this.b = tv3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ji90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, GetAllPartnersRequest getAllPartnersRequest, ContinuationImpl continuationImpl) {
        PartnerSelectionTipsRepository$getAllPartners$1 partnerSelectionTipsRepository$getAllPartners$1;
        int i;
        if (continuationImpl instanceof PartnerSelectionTipsRepository$getAllPartners$1) {
            partnerSelectionTipsRepository$getAllPartners$1 = (PartnerSelectionTipsRepository$getAllPartners$1) continuationImpl;
            int i2 = partnerSelectionTipsRepository$getAllPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerSelectionTipsRepository$getAllPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerSelectionTipsRepository$getAllPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerSelectionTipsRepository$getAllPartners$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    partnerSelectionTipsRepository$getAllPartners$1.label = 1;
                    Object d = this.a.d(str, getAllPartnersRequest, partnerSelectionTipsRepository$getAllPartners$1);
                    return d == coroutineSingletons ? coroutineSingletons : d;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        partnerSelectionTipsRepository$getAllPartners$1 = new PartnerSelectionTipsRepository$getAllPartners$1(this, continuationImpl);
        Object obj2 = partnerSelectionTipsRepository$getAllPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerSelectionTipsRepository$getAllPartners$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.ji90
    public final Object b(String str, CrossBorderCheckUserPartnerRequest crossBorderCheckUserPartnerRequest, Continuation continuation) {
        return new Result.Failure(new IllegalStateException("Tips do not support cross-border"));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ji90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, CheckUserPartnerRequest checkUserPartnerRequest, int i, ContinuationImpl continuationImpl) {
        PartnerSelectionTipsRepository$checkUserPartner$1 partnerSelectionTipsRepository$checkUserPartner$1;
        int i2;
        if (continuationImpl instanceof PartnerSelectionTipsRepository$checkUserPartner$1) {
            partnerSelectionTipsRepository$checkUserPartner$1 = (PartnerSelectionTipsRepository$checkUserPartner$1) continuationImpl;
            int i3 = partnerSelectionTipsRepository$checkUserPartner$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                partnerSelectionTipsRepository$checkUserPartner$1.label = i3 - Integer.MIN_VALUE;
                Object obj = partnerSelectionTipsRepository$checkUserPartner$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = partnerSelectionTipsRepository$checkUserPartner$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    if (i2 == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (((CommonFeatureFlag) this.b.a.d(wlp.N0).getData()).isEnabled()) {
                    partnerSelectionTipsRepository$checkUserPartner$1.label = 1;
                    Object f = f(str, checkUserPartnerRequest, i, partnerSelectionTipsRepository$checkUserPartner$1);
                    if (f != obj2) {
                        return f;
                    }
                } else {
                    partnerSelectionTipsRepository$checkUserPartner$1.label = 2;
                    Object e = e(str, checkUserPartnerRequest, i, partnerSelectionTipsRepository$checkUserPartner$1);
                    if (e != obj2) {
                        return e;
                    }
                }
                return obj2;
            }
        }
        partnerSelectionTipsRepository$checkUserPartner$1 = new PartnerSelectionTipsRepository$checkUserPartner$1(this, continuationImpl);
        Object obj3 = partnerSelectionTipsRepository$checkUserPartner$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = partnerSelectionTipsRepository$checkUserPartner$1.label;
        if (i2 == 0) {
        }
    }

    @Override // defpackage.ji90
    public final Object d(String str, CrossBorderPartnersByCountryRequest crossBorderPartnersByCountryRequest, Continuation continuation) {
        return new Result.Failure(new IllegalStateException("Tips do not support cross-border getPartnersByCountry"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, CheckUserPartnerRequest checkUserPartnerRequest, int i, ContinuationImpl continuationImpl) {
        PartnerSelectionTipsRepository$handleRegularCheck$1 partnerSelectionTipsRepository$handleRegularCheck$1;
        int i2;
        if (continuationImpl instanceof PartnerSelectionTipsRepository$handleRegularCheck$1) {
            partnerSelectionTipsRepository$handleRegularCheck$1 = (PartnerSelectionTipsRepository$handleRegularCheck$1) continuationImpl;
            int i3 = partnerSelectionTipsRepository$handleRegularCheck$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                partnerSelectionTipsRepository$handleRegularCheck$1.label = i3 - Integer.MIN_VALUE;
                Object obj = partnerSelectionTipsRepository$handleRegularCheck$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = partnerSelectionTipsRepository$handleRegularCheck$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Map<String, String> b = ynb1.b(new Pair("X-Idempotency-Token", str), new Pair("X-YB-Polling-Attempt-Number", Integer.toUnsignedString(i)));
                partnerSelectionTipsRepository$handleRegularCheck$1.label = 1;
                Object a = this.a.a(checkUserPartnerRequest, b, partnerSelectionTipsRepository$handleRegularCheck$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        partnerSelectionTipsRepository$handleRegularCheck$1 = new PartnerSelectionTipsRepository$handleRegularCheck$1(this, continuationImpl);
        Object obj2 = partnerSelectionTipsRepository$handleRegularCheck$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = partnerSelectionTipsRepository$handleRegularCheck$1.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, CheckUserPartnerRequest checkUserPartnerRequest, int i, ContinuationImpl continuationImpl) {
        PartnerSelectionTipsRepository$handleStatusCheck$1 partnerSelectionTipsRepository$handleStatusCheck$1;
        int i2;
        Object b;
        if (continuationImpl instanceof PartnerSelectionTipsRepository$handleStatusCheck$1) {
            partnerSelectionTipsRepository$handleStatusCheck$1 = (PartnerSelectionTipsRepository$handleStatusCheck$1) continuationImpl;
            int i3 = partnerSelectionTipsRepository$handleStatusCheck$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                partnerSelectionTipsRepository$handleStatusCheck$1.label = i3 - Integer.MIN_VALUE;
                Object obj = partnerSelectionTipsRepository$handleStatusCheck$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = partnerSelectionTipsRepository$handleStatusCheck$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    int compareUnsigned = Integer.compareUnsigned(i, 0);
                    PartnerSelectionTipsApi partnerSelectionTipsApi = this.a;
                    if (compareUnsigned > 0) {
                        Map<String, String> b2 = ynb1.b(new Pair("X-Idempotency-Token", str), new Pair("X-YB-Polling-Attempt-Number", Integer.toUnsignedString(i - 1)));
                        partnerSelectionTipsRepository$handleStatusCheck$1.label = 1;
                        Object c = partnerSelectionTipsApi.c(b2, checkUserPartnerRequest, partnerSelectionTipsRepository$handleStatusCheck$1);
                        if (c != coroutineSingletons) {
                            return c;
                        }
                    } else {
                        partnerSelectionTipsRepository$handleStatusCheck$1.label = 2;
                        b = partnerSelectionTipsApi.b(str, checkUserPartnerRequest, partnerSelectionTipsRepository$handleStatusCheck$1);
                    }
                    return coroutineSingletons;
                }
                if (i2 == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
                if (!(b instanceof Result.Failure)) {
                    return b;
                }
                return new iyd0(new Integer(0), (DataWithStatusResponse) b);
            }
        }
        partnerSelectionTipsRepository$handleStatusCheck$1 = new PartnerSelectionTipsRepository$handleStatusCheck$1(this, continuationImpl);
        Object obj2 = partnerSelectionTipsRepository$handleStatusCheck$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = partnerSelectionTipsRepository$handleStatusCheck$1.label;
        if (i2 != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
    }
}
