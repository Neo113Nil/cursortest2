package com.ybsdk.feature.kyc.internal.data;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.FailDataResponse;
import com.ybsdk.core.utils.dto.UtilsThemedParameter;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.kyc.internal.entities.SubmitException;
import com.ybsdk.feature.kyc.internal.network.KycApi;
import com.ybsdk.feature.kyc.internal.network.dto.CameraPageContentDto;
import com.ybsdk.feature.kyc.internal.network.dto.CameraPageContentResponse;
import com.ybsdk.feature.kyc.internal.network.dto.ClientFormDocumentValidationResult;
import com.ybsdk.feature.kyc.internal.network.dto.ErrorWithAddons;
import com.ybsdk.feature.kyc.internal.network.dto.PhotoVerifyCheckResponse;
import com.ybsdk.feature.kyc.internal.network.dto.SubmitPhotoV2Response;
import com.ybsdk.feature.kyc.internal.network.dto.VerificationStatus;
import com.ybsdk.feature.kyc.internal.screens.photo.helpers.CameraLens;
import com.ybsdk.utils.poller.b;
import defpackage.b0e0;
import defpackage.brb1;
import defpackage.c03;
import defpackage.dib1;
import defpackage.fzq;
import defpackage.j3m;
import defpackage.jl40;
import defpackage.m5j0;
import defpackage.ny61;
import defpackage.pnx;
import defpackage.qib0;
import defpackage.qje;
import defpackage.qnx;
import defpackage.rnx;
import defpackage.scc;
import defpackage.snx;
import defpackage.sr7;
import defpackage.tcc;
import defpackage.tnx;
import defpackage.u6z;
import defpackage.w511;
import defpackage.wg10;
import defpackage.wms;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class a {
    public static final wg10 d;
    public static final List e;
    public static final List f;
    public final KycApi a;
    public final b b;
    public final AppAnalyticsReporter c;

    static {
        Regex regex = wg10.e;
        d = qje.o("image/*");
        e = scc.g("ERROR", "FAILED");
        f = scc.g("ERROR", "FAILED", "WAITING_FOR_DOCUMENTS");
    }

    public a(KycApi kycApi, b bVar, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = kycApi;
        this.b = bVar;
        this.c = appAnalyticsReporter;
    }

    public static final String a(a aVar, tnx tnxVar) {
        aVar.getClass();
        if (jl40.l(tnxVar, qnx.b)) {
            return "PASSPORT_MAIN_PAGE";
        }
        if (jl40.l(tnxVar, snx.b)) {
            return "SELFIE_WITH_PASSPORT";
        }
        if (jl40.l(tnxVar, rnx.b)) {
            return "PASSPORT_REGISTRATION_PAGE";
        }
        if (tnxVar instanceof pnx) {
            return ((pnx) tnxVar).b;
        }
        w511.b();
        return null;
    }

    public static final Object b(a aVar, DataWithStatusResponse dataWithStatusResponse) {
        aVar.getClass();
        FailDataResponse failData = dataWithStatusResponse.getFailData();
        if (failData == null) {
            return zy11.a;
        }
        String title = failData.getTitle();
        String traceId = failData.getTraceId();
        String supportUrl = failData.getSupportUrl();
        String techInfo = failData.getTechInfo();
        String description = failData.getDescription();
        UtilsThemedParameter<String> icon = failData.getIcon();
        return new Result.Failure(new FailDataException(title, description, icon != null ? icon.toEntity() : null, supportUrl, techInfo, traceId));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        KycRepository$documentsInitWithContent$1 kycRepository$documentsInitWithContent$1;
        a aVar;
        int i;
        Object e2;
        String str5;
        String str6;
        String str7;
        Throwable a;
        if (continuationImpl instanceof KycRepository$documentsInitWithContent$1) {
            kycRepository$documentsInitWithContent$1 = (KycRepository$documentsInitWithContent$1) continuationImpl;
            int i2 = kycRepository$documentsInitWithContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycRepository$documentsInitWithContent$1.label = i2 - Integer.MIN_VALUE;
                aVar = this;
                KycRepository$documentsInitWithContent$1 kycRepository$documentsInitWithContent$12 = kycRepository$documentsInitWithContent$1;
                Object obj = kycRepository$documentsInitWithContent$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycRepository$documentsInitWithContent$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kycRepository$documentsInitWithContent$12.L$0 = str;
                    kycRepository$documentsInitWithContent$12.L$1 = str2;
                    kycRepository$documentsInitWithContent$12.L$2 = str3;
                    kycRepository$documentsInitWithContent$12.label = 1;
                    e2 = aVar.e(str, str2, str3, str4, kycRepository$documentsInitWithContent$12);
                    if (e2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str7 = (String) kycRepository$documentsInitWithContent$12.L$2;
                    str6 = (String) kycRepository$documentsInitWithContent$12.L$1;
                    str5 = (String) kycRepository$documentsInitWithContent$12.L$0;
                    kotlin.b.b(obj);
                    e2 = ((Result) obj).getValue();
                }
                a = Result.a(e2);
                if (a == null) {
                    return new Result.Failure(a);
                }
                CameraPageContentResponse cameraPageContentResponse = (CameraPageContentResponse) e2;
                List<CameraPageContentDto> content = cameraPageContentResponse.getContent();
                ArrayList arrayList = new ArrayList(tcc.n(content, 10));
                for (CameraPageContentDto cameraPageContentDto : content) {
                    arrayList.add(new sr7(new pnx(cameraPageContentDto.getDocumentType()), cameraPageContentDto.getTitle(), cameraPageContentDto.getTipText(), cameraPageContentDto.getUploadErrorText(), CameraLens.valueOf(cameraPageContentDto.getCameraLens()), cameraPageContentDto.getInfoDeeplink(), cameraPageContentDto.getBackButtonDeeplink(), cameraPageContentDto.getEnterPageDeeplink(), cameraPageContentDto.getTipImage()));
                }
                List<CameraPageContentDto> content2 = cameraPageContentResponse.getContent();
                ArrayList arrayList2 = new ArrayList(tcc.n(content2, 10));
                Iterator<T> it = content2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new pnx(((CameraPageContentDto) it.next()).getDocumentType()));
                }
                return new qib0(arrayList, new c03(str5, str6, str7, arrayList2), cameraPageContentResponse.getFinishScenarioDeeplink());
            }
        }
        aVar = this;
        kycRepository$documentsInitWithContent$1 = new KycRepository$documentsInitWithContent$1(aVar, continuationImpl);
        KycRepository$documentsInitWithContent$1 kycRepository$documentsInitWithContent$122 = kycRepository$documentsInitWithContent$1;
        Object obj2 = kycRepository$documentsInitWithContent$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycRepository$documentsInitWithContent$122.label;
        if (i != 0) {
        }
        a = Result.a(e2);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        KycRepository$getApplicationInfo$1 kycRepository$getApplicationInfo$1;
        int i;
        if (continuationImpl instanceof KycRepository$getApplicationInfo$1) {
            kycRepository$getApplicationInfo$1 = (KycRepository$getApplicationInfo$1) continuationImpl;
            int i2 = kycRepository$getApplicationInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycRepository$getApplicationInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycRepository$getApplicationInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycRepository$getApplicationInfo$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                KycRepository$getApplicationInfo$2 kycRepository$getApplicationInfo$2 = new KycRepository$getApplicationInfo$2(this, str2, str, null);
                kycRepository$getApplicationInfo$1.label = 1;
                Object c = c.c(kycRepository$getApplicationInfo$2, kycRepository$getApplicationInfo$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        kycRepository$getApplicationInfo$1 = new KycRepository$getApplicationInfo$1(this, continuationImpl);
        Object obj2 = kycRepository$getApplicationInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycRepository$getApplicationInfo$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        KycRepository$getContentCall$1 kycRepository$getContentCall$1;
        int i;
        if (continuationImpl instanceof KycRepository$getContentCall$1) {
            kycRepository$getContentCall$1 = (KycRepository$getContentCall$1) continuationImpl;
            int i2 = kycRepository$getContentCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycRepository$getContentCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycRepository$getContentCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycRepository$getContentCall$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                KycRepository$getContentCall$2 kycRepository$getContentCall$2 = new KycRepository$getContentCall$2(this, str4, str, str2, str3, null);
                kycRepository$getContentCall$1.label = 1;
                Object c = c.c(kycRepository$getContentCall$2, kycRepository$getContentCall$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        kycRepository$getContentCall$1 = new KycRepository$getContentCall$1(this, continuationImpl);
        Object obj2 = kycRepository$getContentCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycRepository$getContentCall$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, u6z u6zVar, String str2, ContinuationImpl continuationImpl) {
        KycRepository$submitPhotos$1 kycRepository$submitPhotos$1;
        int i;
        if (continuationImpl instanceof KycRepository$submitPhotos$1) {
            kycRepository$submitPhotos$1 = (KycRepository$submitPhotos$1) continuationImpl;
            int i2 = kycRepository$submitPhotos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycRepository$submitPhotos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycRepository$submitPhotos$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycRepository$submitPhotos$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                KycRepository$submitPhotos$2 kycRepository$submitPhotos$2 = new KycRepository$submitPhotos$2(this, str2, str, u6zVar, null);
                kycRepository$submitPhotos$1.label = 1;
                Object c = c.c(kycRepository$submitPhotos$2, kycRepository$submitPhotos$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        kycRepository$submitPhotos$1 = new KycRepository$submitPhotos$1(this, continuationImpl);
        Object obj2 = kycRepository$submitPhotos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycRepository$submitPhotos$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(List list, c03 c03Var, String str, ContinuationImpl continuationImpl) {
        KycRepository$submitPhotosV2$1 kycRepository$submitPhotosV2$1;
        int i;
        Object c;
        boolean z;
        Throwable a;
        if (continuationImpl instanceof KycRepository$submitPhotosV2$1) {
            kycRepository$submitPhotosV2$1 = (KycRepository$submitPhotosV2$1) continuationImpl;
            int i2 = kycRepository$submitPhotosV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycRepository$submitPhotosV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycRepository$submitPhotosV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycRepository$submitPhotosV2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    KycRepository$submitPhotosV2$submitResult$1 kycRepository$submitPhotosV2$submitResult$1 = new KycRepository$submitPhotosV2$submitResult$1(this, str, c03Var, list, null);
                    kycRepository$submitPhotosV2$1.label = 1;
                    c = c.c(kycRepository$submitPhotosV2$submitResult$1, kycRepository$submitPhotosV2$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                z = c instanceof Result.Failure;
                SubmitPhotoV2Response submitPhotoV2Response = (SubmitPhotoV2Response) (!z ? null : c);
                ErrorWithAddons errorData = submitPhotoV2Response != null ? submitPhotoV2Response.getErrorData() : null;
                if (z && errorData == null) {
                    return c;
                }
                a = Result.a(c);
                if (a == null) {
                    a = new SubmitException("Failed to submit photo. Details: " + errorData);
                }
                return new Result.Failure(a);
            }
        }
        kycRepository$submitPhotosV2$1 = new KycRepository$submitPhotosV2$1(this, continuationImpl);
        Object obj2 = kycRepository$submitPhotosV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycRepository$submitPhotosV2$1.label;
        if (i != 0) {
        }
        z = c instanceof Result.Failure;
        SubmitPhotoV2Response submitPhotoV2Response2 = (SubmitPhotoV2Response) (!z ? null : c);
        if (submitPhotoV2Response2 != null) {
        }
        if (z) {
        }
        a = Result.a(c);
        if (a == null) {
        }
        return new Result.Failure(a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(tnx tnxVar, File file, String str, String str2, ContinuationImpl continuationImpl) {
        KycRepository$uploadPhoto$1 kycRepository$uploadPhoto$1;
        int i;
        if (continuationImpl instanceof KycRepository$uploadPhoto$1) {
            kycRepository$uploadPhoto$1 = (KycRepository$uploadPhoto$1) continuationImpl;
            int i2 = kycRepository$uploadPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycRepository$uploadPhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycRepository$uploadPhoto$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycRepository$uploadPhoto$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                int i3 = m5j0.a;
                KycRepository$uploadPhoto$2 kycRepository$uploadPhoto$2 = new KycRepository$uploadPhoto$2(this, str2, brb1.b("type", null, wms.a(dib1.d(tnxVar), null)), brb1.b("application_id", null, wms.a(str, null)), brb1.b("photo", null, new fzq(d, file)), null);
                kycRepository$uploadPhoto$1.label = 1;
                Object c = c.c(kycRepository$uploadPhoto$2, kycRepository$uploadPhoto$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        kycRepository$uploadPhoto$1 = new KycRepository$uploadPhoto$1(this, continuationImpl);
        Object obj2 = kycRepository$uploadPhoto$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycRepository$uploadPhoto$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(tnx tnxVar, File file, c03 c03Var, String str, ContinuationImpl continuationImpl) {
        KycRepository$uploadPhotoV2$1 kycRepository$uploadPhotoV2$1;
        int i;
        if (continuationImpl instanceof KycRepository$uploadPhotoV2$1) {
            kycRepository$uploadPhotoV2$1 = (KycRepository$uploadPhotoV2$1) continuationImpl;
            int i2 = kycRepository$uploadPhotoV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycRepository$uploadPhotoV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycRepository$uploadPhotoV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycRepository$uploadPhotoV2$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                KycRepository$uploadPhotoV2$2 kycRepository$uploadPhotoV2$2 = new KycRepository$uploadPhotoV2$2(file, this, str, tnxVar, c03Var, null);
                kycRepository$uploadPhotoV2$1.label = 1;
                Object c = c.c(kycRepository$uploadPhotoV2$2, kycRepository$uploadPhotoV2$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        kycRepository$uploadPhotoV2$1 = new KycRepository$uploadPhotoV2$1(this, continuationImpl);
        Object obj2 = kycRepository$uploadPhotoV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycRepository$uploadPhotoV2$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(tnx tnxVar, File file, c03 c03Var, String str, ContinuationImpl continuationImpl) {
        KycRepository$uploadPhotoV3$1 kycRepository$uploadPhotoV3$1;
        int i;
        if (continuationImpl instanceof KycRepository$uploadPhotoV3$1) {
            kycRepository$uploadPhotoV3$1 = (KycRepository$uploadPhotoV3$1) continuationImpl;
            int i2 = kycRepository$uploadPhotoV3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycRepository$uploadPhotoV3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycRepository$uploadPhotoV3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycRepository$uploadPhotoV3$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                KycRepository$uploadPhotoV3$2 kycRepository$uploadPhotoV3$2 = new KycRepository$uploadPhotoV3$2(file, this, str, tnxVar, c03Var, null);
                kycRepository$uploadPhotoV3$1.label = 1;
                Object c = c.c(kycRepository$uploadPhotoV3$2, kycRepository$uploadPhotoV3$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        kycRepository$uploadPhotoV3$1 = new KycRepository$uploadPhotoV3$1(this, continuationImpl);
        Object obj2 = kycRepository$uploadPhotoV3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycRepository$uploadPhotoV3$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (r0 == r8) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        KycRepository$verifyPhoto$1 kycRepository$verifyPhoto$1;
        int i;
        Object c;
        String str5;
        String str6;
        String str7;
        Throwable a;
        Object e2;
        j3m j3mVar;
        String str8;
        Throwable a2;
        Object failure;
        if (continuationImpl instanceof KycRepository$verifyPhoto$1) {
            kycRepository$verifyPhoto$1 = (KycRepository$verifyPhoto$1) continuationImpl;
            int i2 = kycRepository$verifyPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycRepository$verifyPhoto$1.label = i2 - Integer.MIN_VALUE;
                KycRepository$verifyPhoto$1 kycRepository$verifyPhoto$12 = kycRepository$verifyPhoto$1;
                Object obj = kycRepository$verifyPhoto$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycRepository$verifyPhoto$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    KycRepository$verifyPhoto$verificationResult$1 kycRepository$verifyPhoto$verificationResult$1 = new KycRepository$verifyPhoto$verificationResult$1(this, str4, str, str2, str3, null);
                    kycRepository$verifyPhoto$12.L$0 = str;
                    kycRepository$verifyPhoto$12.L$1 = str2;
                    kycRepository$verifyPhoto$12.L$2 = str3;
                    kycRepository$verifyPhoto$12.label = 1;
                    c = c.c(kycRepository$verifyPhoto$verificationResult$1, kycRepository$verifyPhoto$12);
                    if (c != coroutineSingletons) {
                        str5 = str;
                        str6 = str2;
                        str7 = str3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3mVar = (j3m) kycRepository$verifyPhoto$12.L$1;
                        str8 = (String) kycRepository$verifyPhoto$12.L$0;
                        kotlin.b.b(obj);
                        failure = ((Result) obj).getValue();
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        PhotoVerifyCheckResponse photoVerifyCheckResponse = (PhotoVerifyCheckResponse) failure;
                        return ((photoVerifyCheckResponse != null ? photoVerifyCheckResponse.getVerificationStatus() : null) == VerificationStatus.OK || !(photoVerifyCheckResponse.getVerificationResult() == null || photoVerifyCheckResponse.getVerificationResult().getVerificationStatus() == ClientFormDocumentValidationResult.OK)) ? new Result.Failure(new SubmitException("BadPhotoQualityException")) : new j3m(j3mVar.a, str8);
                    }
                    j3mVar = (j3m) kycRepository$verifyPhoto$12.L$1;
                    str8 = (String) kycRepository$verifyPhoto$12.L$0;
                    kotlin.b.b(obj);
                    e2 = ((Result) obj).getValue();
                    a2 = Result.a(e2);
                    if (a2 != null) {
                        KycRepository$verifyPhoto$pollingResult$3$1 kycRepository$verifyPhoto$pollingResult$3$1 = new KycRepository$verifyPhoto$pollingResult$3$1(2, null);
                        kycRepository$verifyPhoto$12.L$0 = str8;
                        kycRepository$verifyPhoto$12.L$1 = j3mVar;
                        kycRepository$verifyPhoto$12.label = 3;
                        failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) e2, kycRepository$verifyPhoto$pollingResult$3$1, kycRepository$verifyPhoto$12);
                    } else {
                        failure = new Result.Failure(a2);
                    }
                    if (failure instanceof Result.Failure) {
                    }
                    PhotoVerifyCheckResponse photoVerifyCheckResponse2 = (PhotoVerifyCheckResponse) failure;
                    if ((photoVerifyCheckResponse2 != null ? photoVerifyCheckResponse2.getVerificationStatus() : null) == VerificationStatus.OK) {
                    }
                }
                String str9 = (String) kycRepository$verifyPhoto$12.L$2;
                str6 = (String) kycRepository$verifyPhoto$12.L$1;
                String str10 = (String) kycRepository$verifyPhoto$12.L$0;
                kotlin.b.b(obj);
                c = ((Result) obj).getValue();
                str7 = str9;
                str5 = str10;
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                kotlin.b.b(c);
                j3m j3mVar2 = (j3m) c;
                com.ybsdk.utils.poller.c c2 = this.b.c(b0e0.b, new KycRepository$verifyPhoto$pollingResult$1(2, null), new KycRepository$verifyPhoto$pollingResult$2(this, str5, str6, j3mVar2, null));
                kycRepository$verifyPhoto$12.L$0 = str7;
                kycRepository$verifyPhoto$12.L$1 = j3mVar2;
                kycRepository$verifyPhoto$12.L$2 = null;
                kycRepository$verifyPhoto$12.label = 2;
                e2 = c2.e(kycRepository$verifyPhoto$12);
                if (e2 != coroutineSingletons) {
                    j3mVar = j3mVar2;
                    str8 = str7;
                    a2 = Result.a(e2);
                    if (a2 != null) {
                    }
                    if (failure instanceof Result.Failure) {
                    }
                    PhotoVerifyCheckResponse photoVerifyCheckResponse22 = (PhotoVerifyCheckResponse) failure;
                    if ((photoVerifyCheckResponse22 != null ? photoVerifyCheckResponse22.getVerificationStatus() : null) == VerificationStatus.OK) {
                    }
                }
                return coroutineSingletons;
            }
        }
        kycRepository$verifyPhoto$1 = new KycRepository$verifyPhoto$1(this, continuationImpl);
        KycRepository$verifyPhoto$1 kycRepository$verifyPhoto$122 = kycRepository$verifyPhoto$1;
        Object obj2 = kycRepository$verifyPhoto$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycRepository$verifyPhoto$122.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
