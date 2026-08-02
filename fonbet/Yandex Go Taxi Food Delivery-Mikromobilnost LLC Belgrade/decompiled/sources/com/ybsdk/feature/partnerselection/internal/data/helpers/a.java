package com.ybsdk.feature.partnerselection.internal.data.helpers;

import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.ResultScreenHeader;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.FailDataResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.CheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.PartnerCheckResultDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.PartnerCheckResultErrorInfoDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderPartnersByCountryRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.partner.GetAllPartnersRequest;
import defpackage.bqg;
import defpackage.br51;
import defpackage.cqg;
import defpackage.di90;
import defpackage.dqg;
import defpackage.iyd0;
import defpackage.ji90;
import defpackage.ns;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.w511;
import defpackage.wq51;
import defpackage.xq51;
import defpackage.yq51;
import defpackage.zq51;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final ji90 a;

    public a(ji90 ji90Var) {
        this.a = ji90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, Money money, String str5, String str6, String str7, int i, ContinuationImpl continuationImpl) {
        PartnerSelectionHelper$checkUserPartner$1 partnerSelectionHelper$checkUserPartner$1;
        int i2;
        Object c;
        Throwable a;
        Object failure;
        Object obj;
        if (continuationImpl instanceof PartnerSelectionHelper$checkUserPartner$1) {
            partnerSelectionHelper$checkUserPartner$1 = (PartnerSelectionHelper$checkUserPartner$1) continuationImpl;
            int i3 = partnerSelectionHelper$checkUserPartner$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                partnerSelectionHelper$checkUserPartner$1.label = i3 - Integer.MIN_VALUE;
                PartnerSelectionHelper$checkUserPartner$1 partnerSelectionHelper$checkUserPartner$12 = partnerSelectionHelper$checkUserPartner$1;
                Object obj2 = partnerSelectionHelper$checkUserPartner$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = partnerSelectionHelper$checkUserPartner$12.label;
                br51 br51Var = null;
                if (i2 != 0) {
                    b.b(obj2);
                    PartnerSelectionHelper$checkUserPartner$2 partnerSelectionHelper$checkUserPartner$2 = new PartnerSelectionHelper$checkUserPartner$2(this, str4, new CheckUserPartnerRequest(str, str2, str3, money, str5, str6, str7), i, null);
                    partnerSelectionHelper$checkUserPartner$12.label = 1;
                    c = c.c(partnerSelectionHelper$checkUserPartner$2, partnerSelectionHelper$checkUserPartner$12);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                    c = ((Result) obj2).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0 iyd0Var = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var.a;
                int i4 = di90.a[dataWithStatusResponse.getStatus().ordinal()];
                if (i4 == 1) {
                    PartnerCheckResultDto partnerCheckResultDto = (PartnerCheckResultDto) dataWithStatusResponse.getSuccessData();
                    if (partnerCheckResultDto != null) {
                        int i5 = di90.c[partnerCheckResultDto.getStatus().ordinal()];
                        if (i5 == 1) {
                            failure = new xq51(partnerCheckResultDto.getReceiverName(), new ResultScreenHeader(null, null), partnerCheckResultDto.getRequestId());
                        } else if (i5 == 2) {
                            String error = partnerCheckResultDto.getError();
                            PartnerCheckResultErrorInfoDto errorInfo = partnerCheckResultDto.getErrorInfo();
                            if (errorInfo != null) {
                                String title = errorInfo.getTitle();
                                String description = errorInfo.getDescription();
                                Themes<String> imageUrl = errorInfo.getImageUrl();
                                ThemedImageUrlEntity c2 = imageUrl != null ? qxy0.c(imageUrl, null) : null;
                                ActionButtonDto buttonPrimary = errorInfo.getButtonPrimary();
                                ActionButtonEntity a2 = buttonPrimary != null ? ns.a(buttonPrimary) : null;
                                ActionButtonDto buttonSecondary = errorInfo.getButtonSecondary();
                                br51Var = new br51(title, description, c2, a2, buttonSecondary != null ? ns.a(buttonSecondary) : null);
                            }
                            failure = new yq51(error, br51Var);
                        } else {
                            if (i5 != 3) {
                                w511.b();
                                return null;
                            }
                            obj = zq51.a;
                        }
                    } else {
                        failure = new Result.Failure(new Exception("successData null"));
                    }
                    obj = failure;
                } else if (i4 == 2) {
                    FailDataResponse failData = dataWithStatusResponse.getFailData();
                    String title2 = failData != null ? failData.getTitle() : null;
                    FailDataResponse failData2 = dataWithStatusResponse.getFailData();
                    obj = new wq51(title2, failData2 != null ? failData2.getDescription() : null);
                } else {
                    if (i4 != 3) {
                        w511.b();
                        return null;
                    }
                    obj = new Result.Failure(new Exception("unknown status " + this));
                }
                return !(obj instanceof Result.Failure) ? new iyd0(iyd0Var.b, obj) : obj;
            }
        }
        partnerSelectionHelper$checkUserPartner$1 = new PartnerSelectionHelper$checkUserPartner$1(this, continuationImpl);
        PartnerSelectionHelper$checkUserPartner$1 partnerSelectionHelper$checkUserPartner$122 = partnerSelectionHelper$checkUserPartner$1;
        Object obj22 = partnerSelectionHelper$checkUserPartner$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = partnerSelectionHelper$checkUserPartner$122.label;
        br51 br51Var2 = null;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r0 == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        if (r1 == r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        PartnerSelectionHelper$checkUserPartnerCrossBorder$1 partnerSelectionHelper$checkUserPartnerCrossBorder$1;
        int i;
        Object c;
        Throwable a;
        Object f;
        if (continuationImpl instanceof PartnerSelectionHelper$checkUserPartnerCrossBorder$1) {
            partnerSelectionHelper$checkUserPartnerCrossBorder$1 = (PartnerSelectionHelper$checkUserPartnerCrossBorder$1) continuationImpl;
            int i2 = partnerSelectionHelper$checkUserPartnerCrossBorder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerSelectionHelper$checkUserPartnerCrossBorder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerSelectionHelper$checkUserPartnerCrossBorder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerSelectionHelper$checkUserPartnerCrossBorder$1.label;
                if (i != 0) {
                    b.b(obj);
                    PartnerSelectionHelper$checkUserPartnerCrossBorder$response$1 partnerSelectionHelper$checkUserPartnerCrossBorder$response$1 = new PartnerSelectionHelper$checkUserPartnerCrossBorder$response$1(this, str5, new CrossBorderCheckUserPartnerRequest(str2, str3, str4, str, str6, null, 32, null), null);
                    partnerSelectionHelper$checkUserPartnerCrossBorder$1.label = 1;
                    c = c.c(partnerSelectionHelper$checkUserPartnerCrossBorder$response$1, partnerSelectionHelper$checkUserPartnerCrossBorder$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        f = ((Result) obj).getValue();
                        Throwable a2 = Result.a(f);
                        if (a2 != null) {
                            return new Result.Failure(a2);
                        }
                        dqg dqgVar = (dqg) f;
                        if (dqgVar instanceof cqg) {
                            return ((cqg) dqgVar).a;
                        }
                        if (dqgVar instanceof bqg) {
                            bqg bqgVar = (bqg) dqgVar;
                            return new Pair(new wq51(bqgVar.a, bqgVar.b), null);
                        }
                        w511.b();
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                PartnerSelectionHelper$checkUserPartnerCrossBorder$2 partnerSelectionHelper$checkUserPartnerCrossBorder$2 = new PartnerSelectionHelper$checkUserPartnerCrossBorder$2(2, this, a.class, "toCrossBorderYbCheckEntity", "toCrossBorderYbCheckEntity-IoAF18A(Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDto;)Ljava/lang/Object;", 4);
                partnerSelectionHelper$checkUserPartnerCrossBorder$1.label = 2;
                f = com.ybsdk.core.utils.dto.b.f((DataWithStatusResponse) c, partnerSelectionHelper$checkUserPartnerCrossBorder$2, partnerSelectionHelper$checkUserPartnerCrossBorder$1);
            }
        }
        partnerSelectionHelper$checkUserPartnerCrossBorder$1 = new PartnerSelectionHelper$checkUserPartnerCrossBorder$1(this, continuationImpl);
        Object obj2 = partnerSelectionHelper$checkUserPartnerCrossBorder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerSelectionHelper$checkUserPartnerCrossBorder$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r0 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        PartnerSelectionHelper$getAllPartners$1 partnerSelectionHelper$getAllPartners$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PartnerSelectionHelper$getAllPartners$1) {
            partnerSelectionHelper$getAllPartners$1 = (PartnerSelectionHelper$getAllPartners$1) continuationImpl;
            int i2 = partnerSelectionHelper$getAllPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerSelectionHelper$getAllPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerSelectionHelper$getAllPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerSelectionHelper$getAllPartners$1.label;
                if (i != 0) {
                    b.b(obj);
                    PartnerSelectionHelper$getAllPartners$2 partnerSelectionHelper$getAllPartners$2 = new PartnerSelectionHelper$getAllPartners$2(this, str4, new GetAllPartnersRequest(str, str2, null, null, str3, 8, null), null);
                    partnerSelectionHelper$getAllPartners$1.label = 1;
                    c = c.c(partnerSelectionHelper$getAllPartners$2, partnerSelectionHelper$getAllPartners$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                PartnerSelectionHelper$getAllPartners$3$1 partnerSelectionHelper$getAllPartners$3$1 = new PartnerSelectionHelper$getAllPartners$3$1(2, null);
                partnerSelectionHelper$getAllPartners$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, partnerSelectionHelper$getAllPartners$3$1, partnerSelectionHelper$getAllPartners$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        partnerSelectionHelper$getAllPartners$1 = new PartnerSelectionHelper$getAllPartners$1(this, continuationImpl);
        Object obj2 = partnerSelectionHelper$getAllPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerSelectionHelper$getAllPartners$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        PartnerSelectionHelper$getPartnersByCountry$1 partnerSelectionHelper$getPartnersByCountry$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PartnerSelectionHelper$getPartnersByCountry$1) {
            partnerSelectionHelper$getPartnersByCountry$1 = (PartnerSelectionHelper$getPartnersByCountry$1) continuationImpl;
            int i2 = partnerSelectionHelper$getPartnersByCountry$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerSelectionHelper$getPartnersByCountry$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerSelectionHelper$getPartnersByCountry$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerSelectionHelper$getPartnersByCountry$1.label;
                if (i != 0) {
                    b.b(obj);
                    PartnerSelectionHelper$getPartnersByCountry$2 partnerSelectionHelper$getPartnersByCountry$2 = new PartnerSelectionHelper$getPartnersByCountry$2(this, str2, new CrossBorderPartnersByCountryRequest(str), null);
                    partnerSelectionHelper$getPartnersByCountry$1.label = 1;
                    c = c.c(partnerSelectionHelper$getPartnersByCountry$2, partnerSelectionHelper$getPartnersByCountry$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                PartnerSelectionHelper$getPartnersByCountry$3$1 partnerSelectionHelper$getPartnersByCountry$3$1 = new PartnerSelectionHelper$getPartnersByCountry$3$1(2, null);
                partnerSelectionHelper$getPartnersByCountry$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, partnerSelectionHelper$getPartnersByCountry$3$1, partnerSelectionHelper$getPartnersByCountry$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        partnerSelectionHelper$getPartnersByCountry$1 = new PartnerSelectionHelper$getPartnersByCountry$1(this, continuationImpl);
        Object obj2 = partnerSelectionHelper$getPartnersByCountry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerSelectionHelper$getPartnersByCountry$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
