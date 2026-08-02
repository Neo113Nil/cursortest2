package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.frj0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0001+BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBM\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011JN\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b(\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010\u0011¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesPersonTransferRequest;", "", "", "agreementId", "Lcom/ybsdk/core/common/data/network/dto/Money;", "money", "accountNumber", "bic", "name", "paymentPurpose", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "firstName", "lastName", "middleName", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesPersonTransferRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "Lcom/ybsdk/core/common/data/network/dto/Money;", "getMoney", "getAccountNumber", "getBic", "getName", "getPaymentPurpose", "Companion", "frj0", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesPersonTransferRequest {
    private static final frj0 Companion = new frj0();
    private final String accountNumber;
    private final String agreementId;
    private final String bic;
    private final Money money;
    private final String name;
    private final String paymentPurpose;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RequisitesPersonTransferRequest(String str, Money money, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, money, str2, str3, unr0.o(str5, " ", str4, r8 == null ? "" : r8), str7);
        Companion.getClass();
        String concat = str6 != null ? " ".concat(str6) : null;
    }

    public static /* synthetic */ RequisitesPersonTransferRequest copy$default(RequisitesPersonTransferRequest requisitesPersonTransferRequest, String str, Money money, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requisitesPersonTransferRequest.agreementId;
        }
        if ((i & 2) != 0) {
            money = requisitesPersonTransferRequest.money;
        }
        if ((i & 4) != 0) {
            str2 = requisitesPersonTransferRequest.accountNumber;
        }
        if ((i & 8) != 0) {
            str3 = requisitesPersonTransferRequest.bic;
        }
        if ((i & 16) != 0) {
            str4 = requisitesPersonTransferRequest.name;
        }
        if ((i & 32) != 0) {
            str5 = requisitesPersonTransferRequest.paymentPurpose;
        }
        String str6 = str4;
        String str7 = str5;
        return requisitesPersonTransferRequest.copy(str, money, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBic() {
        return this.bic;
    }

    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public final RequisitesPersonTransferRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "money") Money money, @Json(name = "account_number") String accountNumber, @Json(name = "bic") String bic, @Json(name = "name") String name, @Json(name = "payment_purpose") String paymentPurpose) {
        return new RequisitesPersonTransferRequest(agreementId, money, accountNumber, bic, name, paymentPurpose);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesPersonTransferRequest)) {
            return false;
        }
        RequisitesPersonTransferRequest requisitesPersonTransferRequest = (RequisitesPersonTransferRequest) other;
        return jl40.l(this.agreementId, requisitesPersonTransferRequest.agreementId) && jl40.l(this.money, requisitesPersonTransferRequest.money) && jl40.l(this.accountNumber, requisitesPersonTransferRequest.accountNumber) && jl40.l(this.bic, requisitesPersonTransferRequest.bic) && jl40.l(this.name, requisitesPersonTransferRequest.name) && jl40.l(this.paymentPurpose, requisitesPersonTransferRequest.paymentPurpose);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getBic() {
        return this.bic;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(tse0.c(this.money, this.agreementId.hashCode() * 31, 31), 31, this.accountNumber), 31, this.bic), 31, this.name);
        String str = this.paymentPurpose;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.agreementId;
        Money money = this.money;
        String str2 = this.accountNumber;
        String str3 = this.bic;
        String str4 = this.name;
        String str5 = this.paymentPurpose;
        StringBuilder sb = new StringBuilder("RequisitesPersonTransferRequest(agreementId=");
        sb.append(str);
        sb.append(", money=");
        sb.append(money);
        sb.append(", accountNumber=");
        g8e.D(sb, str2, ", bic=", str3, ", name=");
        return g8e.r(sb, str4, ", paymentPurpose=", str5, Extension.C_BRAKE);
    }

    public RequisitesPersonTransferRequest(@Json(name = "agreement_id") String str, @Json(name = "money") Money money, @Json(name = "account_number") String str2, @Json(name = "bic") String str3, @Json(name = "name") String str4, @Json(name = "payment_purpose") String str5) {
        this.agreementId = str;
        this.money = money;
        this.accountNumber = str2;
        this.bic = str3;
        this.name = str4;
        this.paymentPurpose = str5;
    }
}
