package com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/FpsPayConfirmRequest;", "", "agreementId", "", "tokenIntentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getTokenIntentId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FpsPayConfirmRequest {
    private final String agreementId;
    private final String tokenIntentId;

    public FpsPayConfirmRequest(@Json(name = "publicAgreementId") String str, @Json(name = "tokenIntentId") String str2) {
        this.agreementId = str;
        this.tokenIntentId = str2;
    }

    public static /* synthetic */ FpsPayConfirmRequest copy$default(FpsPayConfirmRequest fpsPayConfirmRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fpsPayConfirmRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = fpsPayConfirmRequest.tokenIntentId;
        }
        return fpsPayConfirmRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTokenIntentId() {
        return this.tokenIntentId;
    }

    public final FpsPayConfirmRequest copy(@Json(name = "publicAgreementId") String agreementId, @Json(name = "tokenIntentId") String tokenIntentId) {
        return new FpsPayConfirmRequest(agreementId, tokenIntentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FpsPayConfirmRequest)) {
            return false;
        }
        FpsPayConfirmRequest fpsPayConfirmRequest = (FpsPayConfirmRequest) other;
        return jl40.l(this.agreementId, fpsPayConfirmRequest.agreementId) && jl40.l(this.tokenIntentId, fpsPayConfirmRequest.tokenIntentId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getTokenIntentId() {
        return this.tokenIntentId;
    }

    public int hashCode() {
        return this.tokenIntentId.hashCode() + (this.agreementId.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("FpsPayConfirmRequest(agreementId=", this.agreementId, ", tokenIntentId=", this.tokenIntentId, Extension.C_BRAKE);
    }
}
