package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oo31;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JT\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitCreateApplicationRequest;", "", "retpath", "", "originatingSystem", "merchantData", "", "promoId", "selectedTerm", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;)V", "getRetpath", "()Ljava/lang/String;", "getOriginatingSystem", "getMerchantData", "()Ljava/util/Map;", "getPromoId", "getSelectedTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ybsdk/network/dto/creditlimit/CreditLimitCreateApplicationRequest;", "equals", "", "other", "hashCode", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CreditLimitCreateApplicationRequest {
    private final Map<String, Object> merchantData;
    private final String originatingSystem;
    private final String promoId;
    private final String retpath;
    private final Integer selectedTerm;

    public CreditLimitCreateApplicationRequest(@Json(name = "ret_path") String str, @Json(name = "originating_system") String str2, @Json(name = "merchant_data") Map<String, ? extends Object> map, @Json(name = "promo_id") String str3, @Json(name = "selected_term") Integer num) {
        this.retpath = str;
        this.originatingSystem = str2;
        this.merchantData = map;
        this.promoId = str3;
        this.selectedTerm = num;
    }

    public static /* synthetic */ CreditLimitCreateApplicationRequest copy$default(CreditLimitCreateApplicationRequest creditLimitCreateApplicationRequest, String str, String str2, Map map, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitCreateApplicationRequest.retpath;
        }
        if ((i & 2) != 0) {
            str2 = creditLimitCreateApplicationRequest.originatingSystem;
        }
        if ((i & 4) != 0) {
            map = creditLimitCreateApplicationRequest.merchantData;
        }
        if ((i & 8) != 0) {
            str3 = creditLimitCreateApplicationRequest.promoId;
        }
        if ((i & 16) != 0) {
            num = creditLimitCreateApplicationRequest.selectedTerm;
        }
        Integer num2 = num;
        Map map2 = map;
        return creditLimitCreateApplicationRequest.copy(str, str2, map2, str3, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRetpath() {
        return this.retpath;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginatingSystem() {
        return this.originatingSystem;
    }

    public final Map<String, Object> component3() {
        return this.merchantData;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPromoId() {
        return this.promoId;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getSelectedTerm() {
        return this.selectedTerm;
    }

    public final CreditLimitCreateApplicationRequest copy(@Json(name = "ret_path") String retpath, @Json(name = "originating_system") String originatingSystem, @Json(name = "merchant_data") Map<String, ? extends Object> merchantData, @Json(name = "promo_id") String promoId, @Json(name = "selected_term") Integer selectedTerm) {
        return new CreditLimitCreateApplicationRequest(retpath, originatingSystem, merchantData, promoId, selectedTerm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitCreateApplicationRequest)) {
            return false;
        }
        CreditLimitCreateApplicationRequest creditLimitCreateApplicationRequest = (CreditLimitCreateApplicationRequest) other;
        return jl40.l(this.retpath, creditLimitCreateApplicationRequest.retpath) && jl40.l(this.originatingSystem, creditLimitCreateApplicationRequest.originatingSystem) && jl40.l(this.merchantData, creditLimitCreateApplicationRequest.merchantData) && jl40.l(this.promoId, creditLimitCreateApplicationRequest.promoId) && jl40.l(this.selectedTerm, creditLimitCreateApplicationRequest.selectedTerm);
    }

    public final Map<String, Object> getMerchantData() {
        return this.merchantData;
    }

    public final String getOriginatingSystem() {
        return this.originatingSystem;
    }

    public final String getPromoId() {
        return this.promoId;
    }

    public final String getRetpath() {
        return this.retpath;
    }

    public final Integer getSelectedTerm() {
        return this.selectedTerm;
    }

    public int hashCode() {
        int hashCode = this.retpath.hashCode() * 31;
        String str = this.originatingSystem;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.merchantData;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.promoId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.selectedTerm;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.retpath;
        String str2 = this.originatingSystem;
        Map<String, Object> map = this.merchantData;
        String str3 = this.promoId;
        Integer num = this.selectedTerm;
        StringBuilder v = b64.v("CreditLimitCreateApplicationRequest(retpath=", str, ", originatingSystem=", str2, ", merchantData=");
        v.append(map);
        v.append(", promoId=");
        v.append(str3);
        v.append(", selectedTerm=");
        return oo31.j(v, num, Extension.C_BRAKE);
    }
}
