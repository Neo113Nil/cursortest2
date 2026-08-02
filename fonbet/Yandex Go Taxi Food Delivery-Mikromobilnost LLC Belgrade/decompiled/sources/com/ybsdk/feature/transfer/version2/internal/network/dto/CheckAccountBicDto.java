package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckAccountBicDto;", "", "accountNumberError", "", "bicError", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumberError", "()Ljava/lang/String;", "getBicError", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckAccountBicDto {
    private final String accountNumberError;
    private final String bicError;

    public CheckAccountBicDto(@Json(name = "account_number_error") String str, @Json(name = "bic_error") String str2) {
        this.accountNumberError = str;
        this.bicError = str2;
    }

    public static /* synthetic */ CheckAccountBicDto copy$default(CheckAccountBicDto checkAccountBicDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkAccountBicDto.accountNumberError;
        }
        if ((i & 2) != 0) {
            str2 = checkAccountBicDto.bicError;
        }
        return checkAccountBicDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumberError() {
        return this.accountNumberError;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBicError() {
        return this.bicError;
    }

    public final CheckAccountBicDto copy(@Json(name = "account_number_error") String accountNumberError, @Json(name = "bic_error") String bicError) {
        return new CheckAccountBicDto(accountNumberError, bicError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckAccountBicDto)) {
            return false;
        }
        CheckAccountBicDto checkAccountBicDto = (CheckAccountBicDto) other;
        return jl40.l(this.accountNumberError, checkAccountBicDto.accountNumberError) && jl40.l(this.bicError, checkAccountBicDto.bicError);
    }

    public final String getAccountNumberError() {
        return this.accountNumberError;
    }

    public final String getBicError() {
        return this.bicError;
    }

    public int hashCode() {
        String str = this.accountNumberError;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bicError;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return unr0.p("CheckAccountBicDto(accountNumberError=", this.accountNumberError, ", bicError=", this.bicError, Extension.C_BRAKE);
    }
}
