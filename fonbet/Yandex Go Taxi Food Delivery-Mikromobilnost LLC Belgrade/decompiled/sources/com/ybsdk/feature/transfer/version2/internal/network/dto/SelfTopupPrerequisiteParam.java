package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTopupPrerequisiteParam;", "", "sourceAgreementId", "", "<init>", "(Ljava/lang/String;)V", "getSourceAgreementId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelfTopupPrerequisiteParam {
    private final String sourceAgreementId;

    public SelfTopupPrerequisiteParam(@Json(name = "source_agreement_id") String str) {
        this.sourceAgreementId = str;
    }

    public static /* synthetic */ SelfTopupPrerequisiteParam copy$default(SelfTopupPrerequisiteParam selfTopupPrerequisiteParam, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selfTopupPrerequisiteParam.sourceAgreementId;
        }
        return selfTopupPrerequisiteParam.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final SelfTopupPrerequisiteParam copy(@Json(name = "source_agreement_id") String sourceAgreementId) {
        return new SelfTopupPrerequisiteParam(sourceAgreementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelfTopupPrerequisiteParam) && jl40.l(this.sourceAgreementId, ((SelfTopupPrerequisiteParam) other).sourceAgreementId);
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public int hashCode() {
        return this.sourceAgreementId.hashCode();
    }

    public String toString() {
        return oyr.p("SelfTopupPrerequisiteParam(sourceAgreementId=", this.sourceAgreementId, Extension.C_BRAKE);
    }
}
