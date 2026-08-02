package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackPromosResponse;", "", "cashback", "Lcom/ybsdk/feature/cashback/impl/dto/responses/MonthlyCashbackResponse;", "activePromos", "Lcom/ybsdk/feature/cashback/impl/dto/responses/ActivePromosResponse;", "suggestedPromos", "Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedPromosResponse;", "<init>", "(Lcom/ybsdk/feature/cashback/impl/dto/responses/MonthlyCashbackResponse;Lcom/ybsdk/feature/cashback/impl/dto/responses/ActivePromosResponse;Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedPromosResponse;)V", "getCashback", "()Lcom/ybsdk/feature/cashback/impl/dto/responses/MonthlyCashbackResponse;", "getActivePromos", "()Lcom/ybsdk/feature/cashback/impl/dto/responses/ActivePromosResponse;", "getSuggestedPromos", "()Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedPromosResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CashbackPromosResponse {
    private final ActivePromosResponse activePromos;
    private final MonthlyCashbackResponse cashback;
    private final SuggestedPromosResponse suggestedPromos;

    public CashbackPromosResponse(@Json(name = "cashback") MonthlyCashbackResponse monthlyCashbackResponse, @Json(name = "active_promos") ActivePromosResponse activePromosResponse, @Json(name = "suggested_promos") SuggestedPromosResponse suggestedPromosResponse) {
        this.cashback = monthlyCashbackResponse;
        this.activePromos = activePromosResponse;
        this.suggestedPromos = suggestedPromosResponse;
    }

    public static /* synthetic */ CashbackPromosResponse copy$default(CashbackPromosResponse cashbackPromosResponse, MonthlyCashbackResponse monthlyCashbackResponse, ActivePromosResponse activePromosResponse, SuggestedPromosResponse suggestedPromosResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            monthlyCashbackResponse = cashbackPromosResponse.cashback;
        }
        if ((i & 2) != 0) {
            activePromosResponse = cashbackPromosResponse.activePromos;
        }
        if ((i & 4) != 0) {
            suggestedPromosResponse = cashbackPromosResponse.suggestedPromos;
        }
        return cashbackPromosResponse.copy(monthlyCashbackResponse, activePromosResponse, suggestedPromosResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final MonthlyCashbackResponse getCashback() {
        return this.cashback;
    }

    /* renamed from: component2, reason: from getter */
    public final ActivePromosResponse getActivePromos() {
        return this.activePromos;
    }

    /* renamed from: component3, reason: from getter */
    public final SuggestedPromosResponse getSuggestedPromos() {
        return this.suggestedPromos;
    }

    public final CashbackPromosResponse copy(@Json(name = "cashback") MonthlyCashbackResponse cashback, @Json(name = "active_promos") ActivePromosResponse activePromos, @Json(name = "suggested_promos") SuggestedPromosResponse suggestedPromos) {
        return new CashbackPromosResponse(cashback, activePromos, suggestedPromos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashbackPromosResponse)) {
            return false;
        }
        CashbackPromosResponse cashbackPromosResponse = (CashbackPromosResponse) other;
        return jl40.l(this.cashback, cashbackPromosResponse.cashback) && jl40.l(this.activePromos, cashbackPromosResponse.activePromos) && jl40.l(this.suggestedPromos, cashbackPromosResponse.suggestedPromos);
    }

    public final ActivePromosResponse getActivePromos() {
        return this.activePromos;
    }

    public final MonthlyCashbackResponse getCashback() {
        return this.cashback;
    }

    public final SuggestedPromosResponse getSuggestedPromos() {
        return this.suggestedPromos;
    }

    public int hashCode() {
        int hashCode = this.cashback.hashCode() * 31;
        ActivePromosResponse activePromosResponse = this.activePromos;
        int hashCode2 = (hashCode + (activePromosResponse == null ? 0 : activePromosResponse.hashCode())) * 31;
        SuggestedPromosResponse suggestedPromosResponse = this.suggestedPromos;
        return hashCode2 + (suggestedPromosResponse != null ? suggestedPromosResponse.hashCode() : 0);
    }

    public String toString() {
        return "CashbackPromosResponse(cashback=" + this.cashback + ", activePromos=" + this.activePromos + ", suggestedPromos=" + this.suggestedPromos + Extension.C_BRAKE;
    }
}
