package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditsSummaryResponse;", "", "posCredit", "Lcom/ybsdk/network/dto/creditlimit/PosCreditSummaryResponse;", "splitCredit", "Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponse;", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/PosCreditSummaryResponse;Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponse;)V", "getPosCredit", "()Lcom/ybsdk/network/dto/creditlimit/PosCreditSummaryResponse;", "getSplitCredit", "()Lcom/ybsdk/network/dto/creditlimit/SplitCreditSummaryResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditsSummaryResponse {
    private final PosCreditSummaryResponse posCredit;
    private final SplitCreditSummaryResponse splitCredit;

    public CreditsSummaryResponse(@Json(name = "pos_credit") PosCreditSummaryResponse posCreditSummaryResponse, @Json(name = "split_credit") SplitCreditSummaryResponse splitCreditSummaryResponse) {
        this.posCredit = posCreditSummaryResponse;
        this.splitCredit = splitCreditSummaryResponse;
    }

    public static /* synthetic */ CreditsSummaryResponse copy$default(CreditsSummaryResponse creditsSummaryResponse, PosCreditSummaryResponse posCreditSummaryResponse, SplitCreditSummaryResponse splitCreditSummaryResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            posCreditSummaryResponse = creditsSummaryResponse.posCredit;
        }
        if ((i & 2) != 0) {
            splitCreditSummaryResponse = creditsSummaryResponse.splitCredit;
        }
        return creditsSummaryResponse.copy(posCreditSummaryResponse, splitCreditSummaryResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final PosCreditSummaryResponse getPosCredit() {
        return this.posCredit;
    }

    /* renamed from: component2, reason: from getter */
    public final SplitCreditSummaryResponse getSplitCredit() {
        return this.splitCredit;
    }

    public final CreditsSummaryResponse copy(@Json(name = "pos_credit") PosCreditSummaryResponse posCredit, @Json(name = "split_credit") SplitCreditSummaryResponse splitCredit) {
        return new CreditsSummaryResponse(posCredit, splitCredit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditsSummaryResponse)) {
            return false;
        }
        CreditsSummaryResponse creditsSummaryResponse = (CreditsSummaryResponse) other;
        return jl40.l(this.posCredit, creditsSummaryResponse.posCredit) && jl40.l(this.splitCredit, creditsSummaryResponse.splitCredit);
    }

    public final PosCreditSummaryResponse getPosCredit() {
        return this.posCredit;
    }

    public final SplitCreditSummaryResponse getSplitCredit() {
        return this.splitCredit;
    }

    public int hashCode() {
        PosCreditSummaryResponse posCreditSummaryResponse = this.posCredit;
        int hashCode = (posCreditSummaryResponse == null ? 0 : posCreditSummaryResponse.hashCode()) * 31;
        SplitCreditSummaryResponse splitCreditSummaryResponse = this.splitCredit;
        return hashCode + (splitCreditSummaryResponse != null ? splitCreditSummaryResponse.hashCode() : 0);
    }

    public String toString() {
        return "CreditsSummaryResponse(posCredit=" + this.posCredit + ", splitCredit=" + this.splitCredit + Extension.C_BRAKE;
    }
}
