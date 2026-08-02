package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpenRequest;", "", "tariffId", "", "sourceAgreementId", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getTariffId", "()Ljava/lang/String;", "getSourceAgreementId", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountOpenRequest {
    private final Money amount;
    private final String sourceAgreementId;
    private final String tariffId;

    public SavingsAccountOpenRequest(@Json(name = "tariff_id") String str, @Json(name = "source_agreement_id") String str2, @Json(name = "amount") Money money) {
        this.tariffId = str;
        this.sourceAgreementId = str2;
        this.amount = money;
    }

    public static /* synthetic */ SavingsAccountOpenRequest copy$default(SavingsAccountOpenRequest savingsAccountOpenRequest, String str, String str2, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountOpenRequest.tariffId;
        }
        if ((i & 2) != 0) {
            str2 = savingsAccountOpenRequest.sourceAgreementId;
        }
        if ((i & 4) != 0) {
            money = savingsAccountOpenRequest.amount;
        }
        return savingsAccountOpenRequest.copy(str, str2, money);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTariffId() {
        return this.tariffId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    public final SavingsAccountOpenRequest copy(@Json(name = "tariff_id") String tariffId, @Json(name = "source_agreement_id") String sourceAgreementId, @Json(name = "amount") Money amount) {
        return new SavingsAccountOpenRequest(tariffId, sourceAgreementId, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountOpenRequest)) {
            return false;
        }
        SavingsAccountOpenRequest savingsAccountOpenRequest = (SavingsAccountOpenRequest) other;
        return jl40.l(this.tariffId, savingsAccountOpenRequest.tariffId) && jl40.l(this.sourceAgreementId, savingsAccountOpenRequest.sourceAgreementId) && jl40.l(this.amount, savingsAccountOpenRequest.amount);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final String getTariffId() {
        return this.tariffId;
    }

    public int hashCode() {
        String str = this.tariffId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceAgreementId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Money money = this.amount;
        return hashCode2 + (money != null ? money.hashCode() : 0);
    }

    public String toString() {
        String str = this.tariffId;
        String str2 = this.sourceAgreementId;
        Money money = this.amount;
        StringBuilder v = b64.v("SavingsAccountOpenRequest(tariffId=", str, ", sourceAgreementId=", str2, ", amount=");
        v.append(money);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
