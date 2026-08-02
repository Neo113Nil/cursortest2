package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPaymentMethodResponse;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "logo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "paymentMethodId", "aftInfo", "Lcom/ybsdk/network/dto/creditlimit/AftInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/network/dto/creditlimit/AftInfo;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getPaymentMethodId", "getAftInfo", "()Lcom/ybsdk/network/dto/creditlimit/AftInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPaymentMethodResponse {
    private final AftInfo aftInfo;
    private final String description;
    private final Themes<String> logo;
    private final String paymentMethodId;
    private final String title;

    public CreditLimitPaymentMethodResponse(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "logo") Themes<String> themes, @Json(name = "payment_method_id") String str3, @Json(name = "aft_info") AftInfo aftInfo) {
        this.title = str;
        this.description = str2;
        this.logo = themes;
        this.paymentMethodId = str3;
        this.aftInfo = aftInfo;
    }

    public static /* synthetic */ CreditLimitPaymentMethodResponse copy$default(CreditLimitPaymentMethodResponse creditLimitPaymentMethodResponse, String str, String str2, Themes themes, String str3, AftInfo aftInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitPaymentMethodResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = creditLimitPaymentMethodResponse.description;
        }
        if ((i & 4) != 0) {
            themes = creditLimitPaymentMethodResponse.logo;
        }
        if ((i & 8) != 0) {
            str3 = creditLimitPaymentMethodResponse.paymentMethodId;
        }
        if ((i & 16) != 0) {
            aftInfo = creditLimitPaymentMethodResponse.aftInfo;
        }
        AftInfo aftInfo2 = aftInfo;
        Themes themes2 = themes;
        return creditLimitPaymentMethodResponse.copy(str, str2, themes2, str3, aftInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> component3() {
        return this.logo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component5, reason: from getter */
    public final AftInfo getAftInfo() {
        return this.aftInfo;
    }

    public final CreditLimitPaymentMethodResponse copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "logo") Themes<String> logo, @Json(name = "payment_method_id") String paymentMethodId, @Json(name = "aft_info") AftInfo aftInfo) {
        return new CreditLimitPaymentMethodResponse(title, description, logo, paymentMethodId, aftInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPaymentMethodResponse)) {
            return false;
        }
        CreditLimitPaymentMethodResponse creditLimitPaymentMethodResponse = (CreditLimitPaymentMethodResponse) other;
        return jl40.l(this.title, creditLimitPaymentMethodResponse.title) && jl40.l(this.description, creditLimitPaymentMethodResponse.description) && jl40.l(this.logo, creditLimitPaymentMethodResponse.logo) && jl40.l(this.paymentMethodId, creditLimitPaymentMethodResponse.paymentMethodId) && jl40.l(this.aftInfo, creditLimitPaymentMethodResponse.aftInfo);
    }

    public final AftInfo getAftInfo() {
        return this.aftInfo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> getLogo() {
        return this.logo;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int c = nnm.c(this.logo, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.paymentMethodId;
        int hashCode2 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        AftInfo aftInfo = this.aftInfo;
        return hashCode2 + (aftInfo != null ? aftInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Themes<String> themes = this.logo;
        String str3 = this.paymentMethodId;
        AftInfo aftInfo = this.aftInfo;
        StringBuilder v = b64.v("CreditLimitPaymentMethodResponse(title=", str, ", description=", str2, ", logo=");
        v.append(themes);
        v.append(", paymentMethodId=");
        v.append(str3);
        v.append(", aftInfo=");
        v.append(aftInfo);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
