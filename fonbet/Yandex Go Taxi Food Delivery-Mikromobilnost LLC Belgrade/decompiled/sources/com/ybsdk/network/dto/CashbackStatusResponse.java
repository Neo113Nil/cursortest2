package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/CashbackStatusResponse;", "", "isAvailable", "", "month", "", "<init>", "(ZLjava/lang/Integer;)V", "()Z", "getMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ZLjava/lang/Integer;)Lcom/ybsdk/network/dto/CashbackStatusResponse;", "equals", "other", "hashCode", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CashbackStatusResponse {
    private final boolean isAvailable;
    private final Integer month;

    public CashbackStatusResponse(@Json(name = "is_available") boolean z, @Json(name = "month") Integer num) {
        this.isAvailable = z;
        this.month = num;
    }

    public static /* synthetic */ CashbackStatusResponse copy$default(CashbackStatusResponse cashbackStatusResponse, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cashbackStatusResponse.isAvailable;
        }
        if ((i & 2) != 0) {
            num = cashbackStatusResponse.month;
        }
        return cashbackStatusResponse.copy(z, num);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMonth() {
        return this.month;
    }

    public final CashbackStatusResponse copy(@Json(name = "is_available") boolean isAvailable, @Json(name = "month") Integer month) {
        return new CashbackStatusResponse(isAvailable, month);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashbackStatusResponse)) {
            return false;
        }
        CashbackStatusResponse cashbackStatusResponse = (CashbackStatusResponse) other;
        return this.isAvailable == cashbackStatusResponse.isAvailable && jl40.l(this.month, cashbackStatusResponse.month);
    }

    public final Integer getMonth() {
        return this.month;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isAvailable) * 31;
        Integer num = this.month;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public String toString() {
        return "CashbackStatusResponse(isAvailable=" + this.isAvailable + ", month=" + this.month + Extension.C_BRAKE;
    }
}
