package com.ybsdk.feature.transfer.version2.internal.network.dto.fund;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsNoticeRequest;", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "transferId", "", "targetAgreementId", "sourceAgreementId", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getTransferId", "()Ljava/lang/String;", "getTargetAgreementId", "getSourceAgreementId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundDocsNoticeRequest {
    private final Money money;
    private final String sourceAgreementId;
    private final String targetAgreementId;
    private final String transferId;

    public FundDocsNoticeRequest(@Json(name = "money") Money money, @Json(name = "transfer_id") String str, @Json(name = "target_agreement_id") String str2, @Json(name = "source_agreement_id") String str3) {
        this.money = money;
        this.transferId = str;
        this.targetAgreementId = str2;
        this.sourceAgreementId = str3;
    }

    public static /* synthetic */ FundDocsNoticeRequest copy$default(FundDocsNoticeRequest fundDocsNoticeRequest, Money money, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            money = fundDocsNoticeRequest.money;
        }
        if ((i & 2) != 0) {
            str = fundDocsNoticeRequest.transferId;
        }
        if ((i & 4) != 0) {
            str2 = fundDocsNoticeRequest.targetAgreementId;
        }
        if ((i & 8) != 0) {
            str3 = fundDocsNoticeRequest.sourceAgreementId;
        }
        return fundDocsNoticeRequest.copy(money, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final FundDocsNoticeRequest copy(@Json(name = "money") Money money, @Json(name = "transfer_id") String transferId, @Json(name = "target_agreement_id") String targetAgreementId, @Json(name = "source_agreement_id") String sourceAgreementId) {
        return new FundDocsNoticeRequest(money, transferId, targetAgreementId, sourceAgreementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundDocsNoticeRequest)) {
            return false;
        }
        FundDocsNoticeRequest fundDocsNoticeRequest = (FundDocsNoticeRequest) other;
        return jl40.l(this.money, fundDocsNoticeRequest.money) && jl40.l(this.transferId, fundDocsNoticeRequest.transferId) && jl40.l(this.targetAgreementId, fundDocsNoticeRequest.targetAgreementId) && jl40.l(this.sourceAgreementId, fundDocsNoticeRequest.sourceAgreementId);
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        return this.sourceAgreementId.hashCode() + unr0.b(unr0.b(this.money.hashCode() * 31, 31, this.transferId), 31, this.targetAgreementId);
    }

    public String toString() {
        Money money = this.money;
        String str = this.transferId;
        String str2 = this.targetAgreementId;
        String str3 = this.sourceAgreementId;
        StringBuilder sb = new StringBuilder("FundDocsNoticeRequest(money=");
        sb.append(money);
        sb.append(", transferId=");
        sb.append(str);
        sb.append(", targetAgreementId=");
        return g8e.r(sb, str2, ", sourceAgreementId=", str3, Extension.C_BRAKE);
    }
}
