package com.ybsdk.feature.kyc.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.kyc.internal.network.dto.ApplicationInfoRequest;
import com.ybsdk.feature.kyc.internal.network.dto.ApplicationInfoResponse;
import com.ybsdk.feature.kyc.internal.network.dto.CameraPageContentRequest;
import com.ybsdk.feature.kyc.internal.network.dto.CameraPageContentResponse;
import com.ybsdk.feature.kyc.internal.network.dto.DocumentsVerifyDto;
import com.ybsdk.feature.kyc.internal.network.dto.InitDocumentsUploadingRequest;
import com.ybsdk.feature.kyc.internal.network.dto.KycActionResponse;
import com.ybsdk.feature.kyc.internal.network.dto.PhotoVerifyCheckRequest;
import com.ybsdk.feature.kyc.internal.network.dto.PhotoVerifyCheckResponse;
import com.ybsdk.feature.kyc.internal.network.dto.SubmitPhotoRequest;
import com.ybsdk.feature.kyc.internal.network.dto.SubmitPhotoV2Request;
import com.ybsdk.feature.kyc.internal.network.dto.SubmitPhotoV2Response;
import com.ybsdk.feature.kyc.internal.network.dto.SubmitUserActionRequest;
import com.ybsdk.feature.kyc.internal.network.dto.SubmitUserActionResponse;
import com.ybsdk.feature.kyc.internal.network.dto.UploadInfoDto;
import com.ybsdk.feature.kyc.internal.network.dto.UploadInfoRequest;
import defpackage.iyd0;
import defpackage.m5j0;
import defpackage.mg90;
import defpackage.q76;
import defpackage.qg21;
import defpackage.s490;
import defpackage.t490;
import defpackage.xw40;
import defpackage.z8u;
import defpackage.zw40;
import defpackage.zy11;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JD\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\b2\b\b\u0001\u0010\r\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0019\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00170\u0016j\u0002`\u00180\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\b2\b\b\u0001\u0010\u001f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020 2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0004\b#\u0010$J*\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020%H§@¢\u0006\u0004\b'\u0010(J0\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020)H§@¢\u0006\u0004\b+\u0010,J4\u00100\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020.0\u0016j\u0002`/0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020-H§@¢\u0006\u0004\b0\u00101J,\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\t0\u00110\b2\b\b\u0001\u0010\r\u001a\u000202H§@¢\u0006\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/KycApi;", "", "", "idempotencyToken", "Lzw40;", "type", "applicationId", "photo", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "d", "(Ljava/lang/String;Lzw40;Lzw40;Lzw40;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitPhotoRequest;", "body", "c", "(Ljava/lang/String;Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitPhotoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationInfoRequest;", "Liyd0;", "Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationInfoResponse;", "f", "(Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/kyc/internal/network/dto/UploadInfoRequest;", "Lcom/ybsdk/feature/kyc/internal/network/dto/KycActionResponse;", "Lcom/ybsdk/feature/kyc/internal/network/dto/UploadInfoDto;", "Lcom/ybsdk/feature/kyc/internal/network/dto/UploadInfoResponse;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "(Ljava/lang/String;Lcom/ybsdk/feature/kyc/internal/network/dto/UploadInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitPhotoV2Request;", "Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitPhotoV2Response;", "g", "(Ljava/lang/String;Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitPhotoV2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "Lm5j0;", "contentType", "Lzy11;", "a", "(Ljava/lang/String;Lm5j0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitUserActionRequest;", "Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitUserActionResponse;", CoreConstants.PushMessage.SERVICE_TYPE, "(Ljava/lang/String;Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitUserActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/kyc/internal/network/dto/CameraPageContentRequest;", "Lcom/ybsdk/feature/kyc/internal/network/dto/CameraPageContentResponse;", "e", "(Ljava/lang/String;Lcom/ybsdk/feature/kyc/internal/network/dto/CameraPageContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/kyc/internal/network/dto/InitDocumentsUploadingRequest;", "Lcom/ybsdk/feature/kyc/internal/network/dto/DocumentsVerifyDto;", "Lcom/ybsdk/feature/kyc/internal/network/dto/DocumentsVerifyResponse;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/kyc/internal/network/dto/InitDocumentsUploadingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/kyc/internal/network/dto/PhotoVerifyCheckRequest;", "Lcom/ybsdk/feature/kyc/internal/network/dto/PhotoVerifyCheckResponse;", "h", "(Lcom/ybsdk/feature/kyc/internal/network/dto/PhotoVerifyCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface KycApi {
    @t490
    Object a(@qg21 String str, @q76 m5j0 m5j0Var, @z8u("Content-Type") String str2, Continuation<? super Result<zy11>> continuation);

    @s490("v1/applications/documents/verify")
    Object b(@z8u("X-Idempotency-Token") String str, @q76 InitDocumentsUploadingRequest initDocumentsUploadingRequest, Continuation<? super Result<KycActionResponse<DocumentsVerifyDto>>> continuation);

    @s490("v1/applications/v1/kyc/online/submit_photo")
    Object c(@z8u("X-Idempotency-Token") String str, @q76 SubmitPhotoRequest submitPhotoRequest, Continuation<? super Result<DataWithStatusResponse<Object>>> continuation);

    @s490("v1/applications/v1/kyc/online/upload_photo")
    @xw40
    Object d(@z8u("X-Idempotency-Token") String str, @mg90 zw40 zw40Var, @mg90 zw40 zw40Var2, @mg90 zw40 zw40Var3, Continuation<? super Result<DataWithStatusResponse<Object>>> continuation);

    @s490("v1/documents/content")
    Object e(@z8u("X-Idempotency-Token") String str, @q76 CameraPageContentRequest cameraPageContentRequest, Continuation<? super Result<DataWithStatusResponse<CameraPageContentResponse>>> continuation);

    @s490("v1/applications/kyc/online/get_application_info")
    Object f(@q76 ApplicationInfoRequest applicationInfoRequest, Continuation<? super Result<iyd0<ApplicationInfoResponse>>> continuation);

    @s490("v1/applications/documents/submit")
    Object g(@z8u("X-Idempotency-Token") String str, @q76 SubmitPhotoV2Request submitPhotoV2Request, Continuation<? super Result<SubmitPhotoV2Response>> continuation);

    @s490("v1/applications/documents/verify/check")
    Object h(@q76 PhotoVerifyCheckRequest photoVerifyCheckRequest, Continuation<? super Result<iyd0<DataWithStatusResponse<PhotoVerifyCheckResponse>>>> continuation);

    @s490("v1/applications/kyc/online/submit_user_action")
    Object i(@z8u("X-Idempotency-Token") String str, @q76 SubmitUserActionRequest submitUserActionRequest, Continuation<? super Result<SubmitUserActionResponse>> continuation);

    @s490("v1/applications/documents/upload")
    Object j(@z8u("X-Idempotency-Token") String str, @q76 UploadInfoRequest uploadInfoRequest, Continuation<? super Result<KycActionResponse<UploadInfoDto>>> continuation);
}
