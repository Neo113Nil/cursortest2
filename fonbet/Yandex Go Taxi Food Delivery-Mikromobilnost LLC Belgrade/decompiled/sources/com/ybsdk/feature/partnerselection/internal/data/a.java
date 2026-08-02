package com.ybsdk.feature.partnerselection.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.partnerselection.internal.network.PartnerSelectionApi;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.CheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderPartnersByCountryRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.partner.GetAllPartnersRequest;
import defpackage.hg91;
import defpackage.iyd0;
import defpackage.ji90;
import defpackage.ny61;
import defpackage.uza;
import defpackage.ynb1;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a implements ji90 {
    public final PartnerSelectionApi a;

    public a(PartnerSelectionApi partnerSelectionApi) {
        this.a = partnerSelectionApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ji90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, GetAllPartnersRequest getAllPartnersRequest, ContinuationImpl continuationImpl) {
        PartnerSelectionMainRepository$getAllPartners$1 partnerSelectionMainRepository$getAllPartners$1;
        int i;
        if (continuationImpl instanceof PartnerSelectionMainRepository$getAllPartners$1) {
            partnerSelectionMainRepository$getAllPartners$1 = (PartnerSelectionMainRepository$getAllPartners$1) continuationImpl;
            int i2 = partnerSelectionMainRepository$getAllPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerSelectionMainRepository$getAllPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerSelectionMainRepository$getAllPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerSelectionMainRepository$getAllPartners$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                partnerSelectionMainRepository$getAllPartners$1.label = 1;
                byte[] bArr = new byte[13];
                for (int i3 = 0; i3 < 13; i3++) {
                    bArr[i3] = (byte) (hg91.e[i3] ^ hg91.a[i3 % 8]);
                }
                Object d = this.a.d(str, getAllPartnersRequest, new String(bArr, uza.a), partnerSelectionMainRepository$getAllPartners$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        partnerSelectionMainRepository$getAllPartners$1 = new PartnerSelectionMainRepository$getAllPartners$1(this, continuationImpl);
        Object obj2 = partnerSelectionMainRepository$getAllPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerSelectionMainRepository$getAllPartners$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ji90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, CrossBorderCheckUserPartnerRequest crossBorderCheckUserPartnerRequest, Continuation continuation) {
        PartnerSelectionMainRepository$checkUserPartnerCrossBorder$1 partnerSelectionMainRepository$checkUserPartnerCrossBorder$1;
        int i;
        if (continuation instanceof PartnerSelectionMainRepository$checkUserPartnerCrossBorder$1) {
            partnerSelectionMainRepository$checkUserPartnerCrossBorder$1 = (PartnerSelectionMainRepository$checkUserPartnerCrossBorder$1) continuation;
            int i2 = partnerSelectionMainRepository$checkUserPartnerCrossBorder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerSelectionMainRepository$checkUserPartnerCrossBorder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerSelectionMainRepository$checkUserPartnerCrossBorder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerSelectionMainRepository$checkUserPartnerCrossBorder$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                partnerSelectionMainRepository$checkUserPartnerCrossBorder$1.label = 1;
                byte[] bArr = new byte[15];
                for (int i3 = 0; i3 < 15; i3++) {
                    bArr[i3] = (byte) (hg91.d[i3] ^ hg91.a[i3 % 8]);
                }
                Object e = this.a.e(str, crossBorderCheckUserPartnerRequest, new String(bArr, uza.a), partnerSelectionMainRepository$checkUserPartnerCrossBorder$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        partnerSelectionMainRepository$checkUserPartnerCrossBorder$1 = new PartnerSelectionMainRepository$checkUserPartnerCrossBorder$1(this, (ContinuationImpl) continuation);
        Object obj2 = partnerSelectionMainRepository$checkUserPartnerCrossBorder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerSelectionMainRepository$checkUserPartnerCrossBorder$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ji90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, CheckUserPartnerRequest checkUserPartnerRequest, int i, ContinuationImpl continuationImpl) {
        PartnerSelectionMainRepository$checkUserPartner$1 partnerSelectionMainRepository$checkUserPartner$1;
        int i2;
        if (continuationImpl instanceof PartnerSelectionMainRepository$checkUserPartner$1) {
            partnerSelectionMainRepository$checkUserPartner$1 = (PartnerSelectionMainRepository$checkUserPartner$1) continuationImpl;
            int i3 = partnerSelectionMainRepository$checkUserPartner$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                partnerSelectionMainRepository$checkUserPartner$1.label = i3 - Integer.MIN_VALUE;
                Object obj = partnerSelectionMainRepository$checkUserPartner$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = partnerSelectionMainRepository$checkUserPartner$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    partnerSelectionMainRepository$checkUserPartner$1.label = 1;
                    Object e = e(str, checkUserPartnerRequest, i, partnerSelectionMainRepository$checkUserPartner$1);
                    return e == obj2 ? obj2 : e;
                }
                if (i2 == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        partnerSelectionMainRepository$checkUserPartner$1 = new PartnerSelectionMainRepository$checkUserPartner$1(this, continuationImpl);
        Object obj3 = partnerSelectionMainRepository$checkUserPartner$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = partnerSelectionMainRepository$checkUserPartner$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ji90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, CrossBorderPartnersByCountryRequest crossBorderPartnersByCountryRequest, Continuation continuation) {
        PartnerSelectionMainRepository$getPartnersByCountry$1 partnerSelectionMainRepository$getPartnersByCountry$1;
        int i;
        if (continuation instanceof PartnerSelectionMainRepository$getPartnersByCountry$1) {
            partnerSelectionMainRepository$getPartnersByCountry$1 = (PartnerSelectionMainRepository$getPartnersByCountry$1) continuation;
            int i2 = partnerSelectionMainRepository$getPartnersByCountry$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerSelectionMainRepository$getPartnersByCountry$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerSelectionMainRepository$getPartnersByCountry$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerSelectionMainRepository$getPartnersByCountry$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                partnerSelectionMainRepository$getPartnersByCountry$1.label = 1;
                byte[] bArr = new byte[20];
                for (int i3 = 0; i3 < 20; i3++) {
                    bArr[i3] = (byte) (hg91.h[i3] ^ hg91.a[i3 % 8]);
                }
                Object a = this.a.a(str, crossBorderPartnersByCountryRequest, new String(bArr, uza.a), partnerSelectionMainRepository$getPartnersByCountry$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        partnerSelectionMainRepository$getPartnersByCountry$1 = new PartnerSelectionMainRepository$getPartnersByCountry$1(this, (ContinuationImpl) continuation);
        Object obj2 = partnerSelectionMainRepository$getPartnersByCountry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerSelectionMainRepository$getPartnersByCountry$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, CheckUserPartnerRequest checkUserPartnerRequest, int i, ContinuationImpl continuationImpl) {
        PartnerSelectionMainRepository$handleStatusCheck$1 partnerSelectionMainRepository$handleStatusCheck$1;
        int i2;
        Object c;
        if (continuationImpl instanceof PartnerSelectionMainRepository$handleStatusCheck$1) {
            partnerSelectionMainRepository$handleStatusCheck$1 = (PartnerSelectionMainRepository$handleStatusCheck$1) continuationImpl;
            int i3 = partnerSelectionMainRepository$handleStatusCheck$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                partnerSelectionMainRepository$handleStatusCheck$1.label = i3 - Integer.MIN_VALUE;
                Object obj = partnerSelectionMainRepository$handleStatusCheck$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = partnerSelectionMainRepository$handleStatusCheck$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    int compareUnsigned = Integer.compareUnsigned(i, 0);
                    byte[] bArr = hg91.a;
                    PartnerSelectionApi partnerSelectionApi = this.a;
                    if (compareUnsigned > 0) {
                        Map<String, String> b = ynb1.b(new Pair("X-Idempotency-Token", str), new Pair("X-YB-Polling-Attempt-Number", Integer.toUnsignedString(i - 1)));
                        partnerSelectionMainRepository$handleStatusCheck$1.label = 1;
                        byte[] bArr2 = new byte[22];
                        for (int i4 = 0; i4 < 22; i4++) {
                            bArr2[i4] = (byte) (hg91.i[i4] ^ bArr[i4 % 8]);
                        }
                        Object b2 = partnerSelectionApi.b(b, checkUserPartnerRequest, new String(bArr2, uza.a), partnerSelectionMainRepository$handleStatusCheck$1);
                        if (b2 != coroutineSingletons) {
                            return b2;
                        }
                    } else {
                        partnerSelectionMainRepository$handleStatusCheck$1.label = 2;
                        byte[] bArr3 = new byte[28];
                        for (int i5 = 0; i5 < 28; i5++) {
                            bArr3[i5] = (byte) (hg91.j[i5] ^ bArr[i5 % 8]);
                        }
                        c = partnerSelectionApi.c(str, checkUserPartnerRequest, new String(bArr3, uza.a), partnerSelectionMainRepository$handleStatusCheck$1);
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
                c = ((Result) obj).getValue();
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                return new iyd0(new Integer(0), (DataWithStatusResponse) c);
            }
        }
        partnerSelectionMainRepository$handleStatusCheck$1 = new PartnerSelectionMainRepository$handleStatusCheck$1(this, continuationImpl);
        Object obj2 = partnerSelectionMainRepository$handleStatusCheck$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = partnerSelectionMainRepository$handleStatusCheck$1.label;
        if (i2 != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }
}
