package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SetPeriodLimitsRequest;", "", "cardId", "", "settingKey", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getCardId", "()Ljava/lang/String;", "getSettingKey", "getAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SetPeriodLimitsRequest {
    private final BigDecimal amount;
    private final String cardId;
    private final String settingKey;

    public SetPeriodLimitsRequest(@Json(name = "card_id") String str, @Json(name = "setting_key") String str2, @Json(name = "amount") BigDecimal bigDecimal) {
        this.cardId = str;
        this.settingKey = str2;
        this.amount = bigDecimal;
    }

    public static /* synthetic */ SetPeriodLimitsRequest copy$default(SetPeriodLimitsRequest setPeriodLimitsRequest, String str, String str2, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setPeriodLimitsRequest.cardId;
        }
        if ((i & 2) != 0) {
            str2 = setPeriodLimitsRequest.settingKey;
        }
        if ((i & 4) != 0) {
            bigDecimal = setPeriodLimitsRequest.amount;
        }
        return setPeriodLimitsRequest.copy(str, str2, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSettingKey() {
        return this.settingKey;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final SetPeriodLimitsRequest copy(@Json(name = "card_id") String cardId, @Json(name = "setting_key") String settingKey, @Json(name = "amount") BigDecimal amount) {
        return new SetPeriodLimitsRequest(cardId, settingKey, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetPeriodLimitsRequest)) {
            return false;
        }
        SetPeriodLimitsRequest setPeriodLimitsRequest = (SetPeriodLimitsRequest) other;
        return jl40.l(this.cardId, setPeriodLimitsRequest.cardId) && jl40.l(this.settingKey, setPeriodLimitsRequest.settingKey) && jl40.l(this.amount, setPeriodLimitsRequest.amount);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getSettingKey() {
        return this.settingKey;
    }

    public int hashCode() {
        return this.amount.hashCode() + unr0.b(this.cardId.hashCode() * 31, 31, this.settingKey);
    }

    public String toString() {
        String str = this.cardId;
        String str2 = this.settingKey;
        BigDecimal bigDecimal = this.amount;
        StringBuilder v = b64.v("SetPeriodLimitsRequest(cardId=", str, ", settingKey=", str2, ", amount=");
        v.append(bigDecimal);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
