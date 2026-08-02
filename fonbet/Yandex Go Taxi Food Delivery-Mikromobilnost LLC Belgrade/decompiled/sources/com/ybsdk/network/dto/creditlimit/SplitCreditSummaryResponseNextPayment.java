package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponseNextPayment;", "", MetaDataField.DATE_FIELD, "", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getDate", "()Ljava/lang/String;", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitCreditSummaryResponseNextPayment {
    private final Money amount;
    private final String date;

    public SplitCreditSummaryResponseNextPayment(@Json(name = "date") String str, @Json(name = "amount") Money money) {
        this.date = str;
        this.amount = money;
    }

    public static /* synthetic */ SplitCreditSummaryResponseNextPayment copy$default(SplitCreditSummaryResponseNextPayment splitCreditSummaryResponseNextPayment, String str, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            str = splitCreditSummaryResponseNextPayment.date;
        }
        if ((i & 2) != 0) {
            money = splitCreditSummaryResponseNextPayment.amount;
        }
        return splitCreditSummaryResponseNextPayment.copy(str, money);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    public final SplitCreditSummaryResponseNextPayment copy(@Json(name = "date") String date, @Json(name = "amount") Money amount) {
        return new SplitCreditSummaryResponseNextPayment(date, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitCreditSummaryResponseNextPayment)) {
            return false;
        }
        SplitCreditSummaryResponseNextPayment splitCreditSummaryResponseNextPayment = (SplitCreditSummaryResponseNextPayment) other;
        return jl40.l(this.date, splitCreditSummaryResponseNextPayment.date) && jl40.l(this.amount, splitCreditSummaryResponseNextPayment.amount);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        String str = this.date;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Money money = this.amount;
        return hashCode + (money != null ? money.hashCode() : 0);
    }

    public String toString() {
        return "SplitCreditSummaryResponseNextPayment(date=" + this.date + ", amount=" + this.amount + Extension.C_BRAKE;
    }
}
