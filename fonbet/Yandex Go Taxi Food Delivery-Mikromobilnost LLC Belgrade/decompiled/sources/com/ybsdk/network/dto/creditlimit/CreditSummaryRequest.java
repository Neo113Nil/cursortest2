package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0003JT\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditSummaryRequest;", "", "consumerId", "", "selectedTerm", "", "retPath", "promoId", "merchantData", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getConsumerId", "()Ljava/lang/String;", "getSelectedTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRetPath", "getPromoId", "getMerchantData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/ybsdk/network/dto/creditlimit/CreditSummaryRequest;", "equals", "", "other", "hashCode", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CreditSummaryRequest {
    private final String consumerId;
    private final Map<String, Object> merchantData;
    private final String promoId;
    private final String retPath;
    private final Integer selectedTerm;

    public /* synthetic */ CreditSummaryRequest(String str, Integer num, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : map);
    }

    public static /* synthetic */ CreditSummaryRequest copy$default(CreditSummaryRequest creditSummaryRequest, String str, Integer num, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditSummaryRequest.consumerId;
        }
        if ((i & 2) != 0) {
            num = creditSummaryRequest.selectedTerm;
        }
        if ((i & 4) != 0) {
            str2 = creditSummaryRequest.retPath;
        }
        if ((i & 8) != 0) {
            str3 = creditSummaryRequest.promoId;
        }
        if ((i & 16) != 0) {
            map = creditSummaryRequest.merchantData;
        }
        Map map2 = map;
        String str4 = str2;
        return creditSummaryRequest.copy(str, num, str4, str3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getConsumerId() {
        return this.consumerId;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSelectedTerm() {
        return this.selectedTerm;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRetPath() {
        return this.retPath;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPromoId() {
        return this.promoId;
    }

    public final Map<String, Object> component5() {
        return this.merchantData;
    }

    public final CreditSummaryRequest copy(@Json(name = "consumer_id") String consumerId, @Json(name = "selected_term") Integer selectedTerm, @Json(name = "ret_path") String retPath, @Json(name = "promo_id") String promoId, @Json(name = "merchant_data") Map<String, ? extends Object> merchantData) {
        return new CreditSummaryRequest(consumerId, selectedTerm, retPath, promoId, merchantData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditSummaryRequest)) {
            return false;
        }
        CreditSummaryRequest creditSummaryRequest = (CreditSummaryRequest) other;
        return jl40.l(this.consumerId, creditSummaryRequest.consumerId) && jl40.l(this.selectedTerm, creditSummaryRequest.selectedTerm) && jl40.l(this.retPath, creditSummaryRequest.retPath) && jl40.l(this.promoId, creditSummaryRequest.promoId) && jl40.l(this.merchantData, creditSummaryRequest.merchantData);
    }

    public final String getConsumerId() {
        return this.consumerId;
    }

    public final Map<String, Object> getMerchantData() {
        return this.merchantData;
    }

    public final String getPromoId() {
        return this.promoId;
    }

    public final String getRetPath() {
        return this.retPath;
    }

    public final Integer getSelectedTerm() {
        return this.selectedTerm;
    }

    public int hashCode() {
        int hashCode = this.consumerId.hashCode() * 31;
        Integer num = this.selectedTerm;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.retPath;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.promoId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.merchantData;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.consumerId;
        Integer num = this.selectedTerm;
        String str2 = this.retPath;
        String str3 = this.promoId;
        Map<String, Object> map = this.merchantData;
        StringBuilder q = n.q("CreditSummaryRequest(consumerId=", num, str, ", selectedTerm=", ", retPath=");
        g8e.D(q, str2, ", promoId=", str3, ", merchantData=");
        return b64.r(q, map, Extension.C_BRAKE);
    }

    public CreditSummaryRequest(@Json(name = "consumer_id") String str, @Json(name = "selected_term") Integer num, @Json(name = "ret_path") String str2, @Json(name = "promo_id") String str3, @Json(name = "merchant_data") Map<String, ? extends Object> map) {
        this.consumerId = str;
        this.selectedTerm = num;
        this.retPath = str2;
        this.promoId = str3;
        this.merchantData = map;
    }
}
