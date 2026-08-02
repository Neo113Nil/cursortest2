package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferRequest;", "", "agreementId", "", "version", "", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "repaymentPlanToken", "receiver", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferReceiver;", "<init>", "(Ljava/lang/String;ILcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferReceiver;)V", "getAgreementId", "()Ljava/lang/String;", "getVersion", "()I", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getRepaymentPlanToken", "getReceiver", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferReceiver;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class B2cTransferRequest {
    private final String agreementId;
    private final Money amount;
    private final B2cTransferReceiver receiver;
    private final String repaymentPlanToken;
    private final int version;

    public B2cTransferRequest(@Json(name = "agreement_id") String str, @Json(name = "version") int i, @Json(name = "amount") Money money, @Json(name = "repayment_plan_token") String str2, @Json(name = "receiver") B2cTransferReceiver b2cTransferReceiver) {
        this.agreementId = str;
        this.version = i;
        this.amount = money;
        this.repaymentPlanToken = str2;
        this.receiver = b2cTransferReceiver;
    }

    public static /* synthetic */ B2cTransferRequest copy$default(B2cTransferRequest b2cTransferRequest, String str, int i, Money money, String str2, B2cTransferReceiver b2cTransferReceiver, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = b2cTransferRequest.agreementId;
        }
        if ((i2 & 2) != 0) {
            i = b2cTransferRequest.version;
        }
        if ((i2 & 4) != 0) {
            money = b2cTransferRequest.amount;
        }
        if ((i2 & 8) != 0) {
            str2 = b2cTransferRequest.repaymentPlanToken;
        }
        if ((i2 & 16) != 0) {
            b2cTransferReceiver = b2cTransferRequest.receiver;
        }
        B2cTransferReceiver b2cTransferReceiver2 = b2cTransferReceiver;
        Money money2 = money;
        return b2cTransferRequest.copy(str, i, money2, str2, b2cTransferReceiver2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRepaymentPlanToken() {
        return this.repaymentPlanToken;
    }

    /* renamed from: component5, reason: from getter */
    public final B2cTransferReceiver getReceiver() {
        return this.receiver;
    }

    public final B2cTransferRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "version") int version, @Json(name = "amount") Money amount, @Json(name = "repayment_plan_token") String repaymentPlanToken, @Json(name = "receiver") B2cTransferReceiver receiver) {
        return new B2cTransferRequest(agreementId, version, amount, repaymentPlanToken, receiver);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2cTransferRequest)) {
            return false;
        }
        B2cTransferRequest b2cTransferRequest = (B2cTransferRequest) other;
        return jl40.l(this.agreementId, b2cTransferRequest.agreementId) && this.version == b2cTransferRequest.version && jl40.l(this.amount, b2cTransferRequest.amount) && jl40.l(this.repaymentPlanToken, b2cTransferRequest.repaymentPlanToken) && jl40.l(this.receiver, b2cTransferRequest.receiver);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final B2cTransferReceiver getReceiver() {
        return this.receiver;
    }

    public final String getRepaymentPlanToken() {
        return this.repaymentPlanToken;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.receiver.hashCode() + unr0.b(tse0.c(this.amount, oyr.b(this.version, this.agreementId.hashCode() * 31, 31), 31), 31, this.repaymentPlanToken);
    }

    public String toString() {
        String str = this.agreementId;
        int i = this.version;
        Money money = this.amount;
        String str2 = this.repaymentPlanToken;
        B2cTransferReceiver b2cTransferReceiver = this.receiver;
        StringBuilder u = b64.u(i, "B2cTransferRequest(agreementId=", str, ", version=", ", amount=");
        u.append(money);
        u.append(", repaymentPlanToken=");
        u.append(str2);
        u.append(", receiver=");
        u.append(b2cTransferReceiver);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
