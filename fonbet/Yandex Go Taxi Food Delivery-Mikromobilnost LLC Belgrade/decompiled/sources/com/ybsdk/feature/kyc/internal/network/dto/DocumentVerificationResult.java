package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/DocumentVerificationResult;", "", "verificationStatus", "Lcom/ybsdk/feature/kyc/internal/network/dto/ClientFormDocumentValidationResult;", "<init>", "(Lcom/ybsdk/feature/kyc/internal/network/dto/ClientFormDocumentValidationResult;)V", "getVerificationStatus", "()Lcom/ybsdk/feature/kyc/internal/network/dto/ClientFormDocumentValidationResult;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocumentVerificationResult {
    private final ClientFormDocumentValidationResult verificationStatus;

    public DocumentVerificationResult(@Json(name = "resolution") ClientFormDocumentValidationResult clientFormDocumentValidationResult) {
        this.verificationStatus = clientFormDocumentValidationResult;
    }

    public static /* synthetic */ DocumentVerificationResult copy$default(DocumentVerificationResult documentVerificationResult, ClientFormDocumentValidationResult clientFormDocumentValidationResult, int i, Object obj) {
        if ((i & 1) != 0) {
            clientFormDocumentValidationResult = documentVerificationResult.verificationStatus;
        }
        return documentVerificationResult.copy(clientFormDocumentValidationResult);
    }

    /* renamed from: component1, reason: from getter */
    public final ClientFormDocumentValidationResult getVerificationStatus() {
        return this.verificationStatus;
    }

    public final DocumentVerificationResult copy(@Json(name = "resolution") ClientFormDocumentValidationResult verificationStatus) {
        return new DocumentVerificationResult(verificationStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentVerificationResult) && this.verificationStatus == ((DocumentVerificationResult) other).verificationStatus;
    }

    public final ClientFormDocumentValidationResult getVerificationStatus() {
        return this.verificationStatus;
    }

    public int hashCode() {
        return this.verificationStatus.hashCode();
    }

    public String toString() {
        return "DocumentVerificationResult(verificationStatus=" + this.verificationStatus + Extension.C_BRAKE;
    }
}
