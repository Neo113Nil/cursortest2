package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitPhotoV2Response;", "", "errorData", "Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;", "successData", "<init>", "(Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;Ljava/lang/Object;)V", "getErrorData", "()Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;", "getSuccessData", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubmitPhotoV2Response {
    private final ErrorWithAddons errorData;
    private final Object successData;

    public SubmitPhotoV2Response(@Json(name = "error_data") ErrorWithAddons errorWithAddons, @Json(name = "success_data") Object obj) {
        this.errorData = errorWithAddons;
        this.successData = obj;
    }

    public static /* synthetic */ SubmitPhotoV2Response copy$default(SubmitPhotoV2Response submitPhotoV2Response, ErrorWithAddons errorWithAddons, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            errorWithAddons = submitPhotoV2Response.errorData;
        }
        if ((i & 2) != 0) {
            obj = submitPhotoV2Response.successData;
        }
        return submitPhotoV2Response.copy(errorWithAddons, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final ErrorWithAddons getErrorData() {
        return this.errorData;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getSuccessData() {
        return this.successData;
    }

    public final SubmitPhotoV2Response copy(@Json(name = "error_data") ErrorWithAddons errorData, @Json(name = "success_data") Object successData) {
        return new SubmitPhotoV2Response(errorData, successData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitPhotoV2Response)) {
            return false;
        }
        SubmitPhotoV2Response submitPhotoV2Response = (SubmitPhotoV2Response) other;
        return jl40.l(this.errorData, submitPhotoV2Response.errorData) && jl40.l(this.successData, submitPhotoV2Response.successData);
    }

    public final ErrorWithAddons getErrorData() {
        return this.errorData;
    }

    public final Object getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        ErrorWithAddons errorWithAddons = this.errorData;
        int hashCode = (errorWithAddons == null ? 0 : errorWithAddons.hashCode()) * 31;
        Object obj = this.successData;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "SubmitPhotoV2Response(errorData=" + this.errorData + ", successData=" + this.successData + Extension.C_BRAKE;
    }
}
