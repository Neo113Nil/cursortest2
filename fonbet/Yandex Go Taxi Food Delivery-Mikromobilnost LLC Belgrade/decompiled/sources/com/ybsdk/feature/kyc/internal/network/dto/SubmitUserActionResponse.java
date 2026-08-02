package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/SubmitUserActionResponse;", "", "errorData", "Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;", "<init>", "(Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;)V", "getErrorData", "()Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubmitUserActionResponse {
    private final ErrorWithAddons errorData;

    public SubmitUserActionResponse(@Json(name = "error_data") ErrorWithAddons errorWithAddons) {
        this.errorData = errorWithAddons;
    }

    public static /* synthetic */ SubmitUserActionResponse copy$default(SubmitUserActionResponse submitUserActionResponse, ErrorWithAddons errorWithAddons, int i, Object obj) {
        if ((i & 1) != 0) {
            errorWithAddons = submitUserActionResponse.errorData;
        }
        return submitUserActionResponse.copy(errorWithAddons);
    }

    /* renamed from: component1, reason: from getter */
    public final ErrorWithAddons getErrorData() {
        return this.errorData;
    }

    public final SubmitUserActionResponse copy(@Json(name = "error_data") ErrorWithAddons errorData) {
        return new SubmitUserActionResponse(errorData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SubmitUserActionResponse) && jl40.l(this.errorData, ((SubmitUserActionResponse) other).errorData);
    }

    public final ErrorWithAddons getErrorData() {
        return this.errorData;
    }

    public int hashCode() {
        ErrorWithAddons errorWithAddons = this.errorData;
        if (errorWithAddons == null) {
            return 0;
        }
        return errorWithAddons.hashCode();
    }

    public String toString() {
        return "SubmitUserActionResponse(errorData=" + this.errorData + Extension.C_BRAKE;
    }
}
