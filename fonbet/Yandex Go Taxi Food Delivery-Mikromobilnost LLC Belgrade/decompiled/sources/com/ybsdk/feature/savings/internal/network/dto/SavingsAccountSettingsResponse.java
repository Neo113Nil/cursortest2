package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsChangeStatus;", "error", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsChangeError;", "<init>", "(Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsChangeStatus;Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsChangeError;)V", "getStatus", "()Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsChangeStatus;", "getError", "()Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsChangeError;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountSettingsResponse {
    private final SavingsAccountSettingsChangeError error;
    private final SavingsAccountSettingsChangeStatus status;

    public SavingsAccountSettingsResponse(@Json(name = "response_status") SavingsAccountSettingsChangeStatus savingsAccountSettingsChangeStatus, @Json(name = "error_response") SavingsAccountSettingsChangeError savingsAccountSettingsChangeError) {
        this.status = savingsAccountSettingsChangeStatus;
        this.error = savingsAccountSettingsChangeError;
    }

    public static /* synthetic */ SavingsAccountSettingsResponse copy$default(SavingsAccountSettingsResponse savingsAccountSettingsResponse, SavingsAccountSettingsChangeStatus savingsAccountSettingsChangeStatus, SavingsAccountSettingsChangeError savingsAccountSettingsChangeError, int i, Object obj) {
        if ((i & 1) != 0) {
            savingsAccountSettingsChangeStatus = savingsAccountSettingsResponse.status;
        }
        if ((i & 2) != 0) {
            savingsAccountSettingsChangeError = savingsAccountSettingsResponse.error;
        }
        return savingsAccountSettingsResponse.copy(savingsAccountSettingsChangeStatus, savingsAccountSettingsChangeError);
    }

    /* renamed from: component1, reason: from getter */
    public final SavingsAccountSettingsChangeStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final SavingsAccountSettingsChangeError getError() {
        return this.error;
    }

    public final SavingsAccountSettingsResponse copy(@Json(name = "response_status") SavingsAccountSettingsChangeStatus status, @Json(name = "error_response") SavingsAccountSettingsChangeError error) {
        return new SavingsAccountSettingsResponse(status, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountSettingsResponse)) {
            return false;
        }
        SavingsAccountSettingsResponse savingsAccountSettingsResponse = (SavingsAccountSettingsResponse) other;
        return this.status == savingsAccountSettingsResponse.status && jl40.l(this.error, savingsAccountSettingsResponse.error);
    }

    public final SavingsAccountSettingsChangeError getError() {
        return this.error;
    }

    public final SavingsAccountSettingsChangeStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        SavingsAccountSettingsChangeError savingsAccountSettingsChangeError = this.error;
        return hashCode + (savingsAccountSettingsChangeError == null ? 0 : savingsAccountSettingsChangeError.hashCode());
    }

    public String toString() {
        return "SavingsAccountSettingsResponse(status=" + this.status + ", error=" + this.error + Extension.C_BRAKE;
    }
}
