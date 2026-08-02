package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.anx;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ@\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0001\u0010\n2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J8\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0013¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/KycActionResponse;", "T", "", "Lcom/ybsdk/feature/kyc/internal/network/dto/SyncResponseStatus;", ACSPConstants.STATUS, "Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;", "errorData", "successData", "<init>", "(Lcom/ybsdk/feature/kyc/internal/network/dto/SyncResponseStatus;Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;Ljava/lang/Object;)V", "Entity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "mapper", "Lkotlin/Result;", "extractEntityResult-gIAlu-s", "(Lwls;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractEntityResult", "extractResult-d1pmJ48", "()Ljava/lang/Object;", "extractResult", "component1", "()Lcom/ybsdk/feature/kyc/internal/network/dto/SyncResponseStatus;", "component2", "()Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;", "component3", "copy", "(Lcom/ybsdk/feature/kyc/internal/network/dto/SyncResponseStatus;Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;Ljava/lang/Object;)Lcom/ybsdk/feature/kyc/internal/network/dto/KycActionResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/kyc/internal/network/dto/SyncResponseStatus;", "getStatus", "Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;", "getErrorData", "Ljava/lang/Object;", "getSuccessData", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class KycActionResponse<T> {
    private final ErrorWithAddons errorData;
    private final SyncResponseStatus status;
    private final T successData;

    public KycActionResponse(@Json(name = "status") SyncResponseStatus syncResponseStatus, @Json(name = "error_data") ErrorWithAddons errorWithAddons, @Json(name = "success_data") T t) {
        this.status = syncResponseStatus;
        this.errorData = errorWithAddons;
        this.successData = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycActionResponse copy$default(KycActionResponse kycActionResponse, SyncResponseStatus syncResponseStatus, ErrorWithAddons errorWithAddons, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            syncResponseStatus = kycActionResponse.status;
        }
        if ((i & 2) != 0) {
            errorWithAddons = kycActionResponse.errorData;
        }
        if ((i & 4) != 0) {
            obj = kycActionResponse.successData;
        }
        return kycActionResponse.copy(syncResponseStatus, errorWithAddons, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final SyncResponseStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorWithAddons getErrorData() {
        return this.errorData;
    }

    public final T component3() {
        return this.successData;
    }

    public final KycActionResponse<T> copy(@Json(name = "status") SyncResponseStatus status, @Json(name = "error_data") ErrorWithAddons errorData, @Json(name = "success_data") T successData) {
        return new KycActionResponse<>(status, errorData, successData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycActionResponse)) {
            return false;
        }
        KycActionResponse kycActionResponse = (KycActionResponse) other;
        return this.status == kycActionResponse.status && jl40.l(this.errorData, kycActionResponse.errorData) && jl40.l(this.successData, kycActionResponse.successData);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: extractEntityResult-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <Entity> Object m441extractEntityResultgIAlus(wls wlsVar, Continuation<? super Result<? extends Entity>> continuation) {
        KycActionResponse$extractEntityResult$1 kycActionResponse$extractEntityResult$1;
        int i;
        try {
            if (continuation instanceof KycActionResponse$extractEntityResult$1) {
                kycActionResponse$extractEntityResult$1 = (KycActionResponse$extractEntityResult$1) continuation;
                int i2 = kycActionResponse$extractEntityResult$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kycActionResponse$extractEntityResult$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kycActionResponse$extractEntityResult$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kycActionResponse$extractEntityResult$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    Object m442extractResultd1pmJ48 = m442extractResultd1pmJ48();
                    if (m442extractResultd1pmJ48 instanceof Result.Failure) {
                        return m442extractResultd1pmJ48;
                    }
                    kycActionResponse$extractEntityResult$1.label = 1;
                    Object invoke = wlsVar.invoke(m442extractResultd1pmJ48, kycActionResponse$extractEntityResult$1);
                    return invoke == obj2 ? obj2 : invoke;
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        kycActionResponse$extractEntityResult$1 = new KycActionResponse$extractEntityResult$1(this, continuation);
        Object obj3 = kycActionResponse$extractEntityResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycActionResponse$extractEntityResult$1.label;
    }

    /* renamed from: extractResult-d1pmJ48, reason: not valid java name */
    public final Object m442extractResultd1pmJ48() {
        ErrorWithAddons errorWithAddons = this.errorData;
        if (errorWithAddons != null) {
            return new Result.Failure(new Exception(g8e.p(errorWithAddons.getError().getCode(), Extension.COLON_SPACE, errorWithAddons.getError().getMessage())));
        }
        int i = anx.a[this.status.ordinal()];
        if (i == 1) {
            T t = this.successData;
            return t != null ? t : new Result.Failure(new Exception("successData null"));
        }
        if (i == 2) {
            return new Result.Failure(new Exception("errorData null"));
        }
        w511.b();
        return null;
    }

    public final ErrorWithAddons getErrorData() {
        return this.errorData;
    }

    public final SyncResponseStatus getStatus() {
        return this.status;
    }

    public final T getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        ErrorWithAddons errorWithAddons = this.errorData;
        int hashCode2 = (hashCode + (errorWithAddons == null ? 0 : errorWithAddons.hashCode())) * 31;
        T t = this.successData;
        return hashCode2 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        SyncResponseStatus syncResponseStatus = this.status;
        ErrorWithAddons errorWithAddons = this.errorData;
        T t = this.successData;
        StringBuilder sb = new StringBuilder("KycActionResponse(status=");
        sb.append(syncResponseStatus);
        sb.append(", errorData=");
        sb.append(errorWithAddons);
        sb.append(", successData=");
        return x4e.h(sb, t, Extension.C_BRAKE);
    }
}
