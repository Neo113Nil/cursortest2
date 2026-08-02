package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TfaInfoDto;", "", "verificationToken", "", "operationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getVerificationToken", "()Ljava/lang/String;", "getOperationId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TfaInfoDto {
    private final String operationId;
    private final String verificationToken;

    public /* synthetic */ TfaInfoDto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ TfaInfoDto copy$default(TfaInfoDto tfaInfoDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tfaInfoDto.verificationToken;
        }
        if ((i & 2) != 0) {
            str2 = tfaInfoDto.operationId;
        }
        return tfaInfoDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVerificationToken() {
        return this.verificationToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    public final TfaInfoDto copy(@Json(name = "verification_token") String verificationToken, @Json(name = "operation_id") String operationId) {
        return new TfaInfoDto(verificationToken, operationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TfaInfoDto)) {
            return false;
        }
        TfaInfoDto tfaInfoDto = (TfaInfoDto) other;
        return jl40.l(this.verificationToken, tfaInfoDto.verificationToken) && jl40.l(this.operationId, tfaInfoDto.operationId);
    }

    public final String getOperationId() {
        return this.operationId;
    }

    public final String getVerificationToken() {
        return this.verificationToken;
    }

    public int hashCode() {
        int hashCode = this.verificationToken.hashCode() * 31;
        String str = this.operationId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("TfaInfoDto(verificationToken=", this.verificationToken, ", operationId=", this.operationId, Extension.C_BRAKE);
    }

    public TfaInfoDto(@Json(name = "verification_token") String str, @Json(name = "operation_id") String str2) {
        this.verificationToken = str;
        this.operationId = str2;
    }
}
