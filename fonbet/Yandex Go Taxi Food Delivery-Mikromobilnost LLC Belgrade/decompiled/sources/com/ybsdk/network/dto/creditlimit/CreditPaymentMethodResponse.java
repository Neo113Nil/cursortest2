package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Je\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodResponse;", "", "paymentMethodType", "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodTypeResponse;", "title", "", "paymentMethodId", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "logo", "ybSuggestId", "aftInfo", "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodAftInfoResponse;", "walletInfo", "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodWalletInfoResponse;", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodTypeResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodAftInfoResponse;Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodWalletInfoResponse;)V", "getPaymentMethodType", "()Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodTypeResponse;", "getTitle", "()Ljava/lang/String;", "getPaymentMethodId", "getDescription", "getLogo", "getYbSuggestId", "getAftInfo", "()Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodAftInfoResponse;", "getWalletInfo", "()Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodWalletInfoResponse;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditPaymentMethodResponse {
    private final CreditPaymentMethodAftInfoResponse aftInfo;
    private final String description;
    private final String logo;
    private final String paymentMethodId;
    private final CreditPaymentMethodTypeResponse paymentMethodType;
    private final String title;
    private final CreditPaymentMethodWalletInfoResponse walletInfo;
    private final String ybSuggestId;

    public /* synthetic */ CreditPaymentMethodResponse(CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse, String str, String str2, String str3, String str4, String str5, CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse, CreditPaymentMethodWalletInfoResponse creditPaymentMethodWalletInfoResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(creditPaymentMethodTypeResponse, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : creditPaymentMethodAftInfoResponse, (i & 128) != 0 ? null : creditPaymentMethodWalletInfoResponse);
    }

    public static /* synthetic */ CreditPaymentMethodResponse copy$default(CreditPaymentMethodResponse creditPaymentMethodResponse, CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse, String str, String str2, String str3, String str4, String str5, CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse, CreditPaymentMethodWalletInfoResponse creditPaymentMethodWalletInfoResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            creditPaymentMethodTypeResponse = creditPaymentMethodResponse.paymentMethodType;
        }
        if ((i & 2) != 0) {
            str = creditPaymentMethodResponse.title;
        }
        if ((i & 4) != 0) {
            str2 = creditPaymentMethodResponse.paymentMethodId;
        }
        if ((i & 8) != 0) {
            str3 = creditPaymentMethodResponse.description;
        }
        if ((i & 16) != 0) {
            str4 = creditPaymentMethodResponse.logo;
        }
        if ((i & 32) != 0) {
            str5 = creditPaymentMethodResponse.ybSuggestId;
        }
        if ((i & 64) != 0) {
            creditPaymentMethodAftInfoResponse = creditPaymentMethodResponse.aftInfo;
        }
        if ((i & 128) != 0) {
            creditPaymentMethodWalletInfoResponse = creditPaymentMethodResponse.walletInfo;
        }
        CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse2 = creditPaymentMethodAftInfoResponse;
        CreditPaymentMethodWalletInfoResponse creditPaymentMethodWalletInfoResponse2 = creditPaymentMethodWalletInfoResponse;
        String str6 = str4;
        String str7 = str5;
        return creditPaymentMethodResponse.copy(creditPaymentMethodTypeResponse, str, str2, str3, str6, str7, creditPaymentMethodAftInfoResponse2, creditPaymentMethodWalletInfoResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final CreditPaymentMethodTypeResponse getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getYbSuggestId() {
        return this.ybSuggestId;
    }

    /* renamed from: component7, reason: from getter */
    public final CreditPaymentMethodAftInfoResponse getAftInfo() {
        return this.aftInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final CreditPaymentMethodWalletInfoResponse getWalletInfo() {
        return this.walletInfo;
    }

    public final CreditPaymentMethodResponse copy(@Json(name = "payment_method_type") CreditPaymentMethodTypeResponse paymentMethodType, @Json(name = "title") String title, @Json(name = "payment_method_id") String paymentMethodId, @Json(name = "description") String description, @Json(name = "logo") String logo, @Json(name = "JSON_FIELD_MEMBER_SUGGEST_ID") String ybSuggestId, @Json(name = "aft_info") CreditPaymentMethodAftInfoResponse aftInfo, @Json(name = "wallet_info") CreditPaymentMethodWalletInfoResponse walletInfo) {
        return new CreditPaymentMethodResponse(paymentMethodType, title, paymentMethodId, description, logo, ybSuggestId, aftInfo, walletInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditPaymentMethodResponse)) {
            return false;
        }
        CreditPaymentMethodResponse creditPaymentMethodResponse = (CreditPaymentMethodResponse) other;
        return this.paymentMethodType == creditPaymentMethodResponse.paymentMethodType && jl40.l(this.title, creditPaymentMethodResponse.title) && jl40.l(this.paymentMethodId, creditPaymentMethodResponse.paymentMethodId) && jl40.l(this.description, creditPaymentMethodResponse.description) && jl40.l(this.logo, creditPaymentMethodResponse.logo) && jl40.l(this.ybSuggestId, creditPaymentMethodResponse.ybSuggestId) && jl40.l(this.aftInfo, creditPaymentMethodResponse.aftInfo) && jl40.l(this.walletInfo, creditPaymentMethodResponse.walletInfo);
    }

    public final CreditPaymentMethodAftInfoResponse getAftInfo() {
        return this.aftInfo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final CreditPaymentMethodTypeResponse getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final CreditPaymentMethodWalletInfoResponse getWalletInfo() {
        return this.walletInfo;
    }

    public final String getYbSuggestId() {
        return this.ybSuggestId;
    }

    public int hashCode() {
        int b = unr0.b(this.paymentMethodType.hashCode() * 31, 31, this.title);
        String str = this.paymentMethodId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ybSuggestId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse = this.aftInfo;
        int hashCode5 = (hashCode4 + (creditPaymentMethodAftInfoResponse == null ? 0 : creditPaymentMethodAftInfoResponse.hashCode())) * 31;
        CreditPaymentMethodWalletInfoResponse creditPaymentMethodWalletInfoResponse = this.walletInfo;
        return hashCode5 + (creditPaymentMethodWalletInfoResponse != null ? creditPaymentMethodWalletInfoResponse.hashCode() : 0);
    }

    public String toString() {
        CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse = this.paymentMethodType;
        String str = this.title;
        String str2 = this.paymentMethodId;
        String str3 = this.description;
        String str4 = this.logo;
        String str5 = this.ybSuggestId;
        CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse = this.aftInfo;
        CreditPaymentMethodWalletInfoResponse creditPaymentMethodWalletInfoResponse = this.walletInfo;
        StringBuilder sb = new StringBuilder("CreditPaymentMethodResponse(paymentMethodType=");
        sb.append(creditPaymentMethodTypeResponse);
        sb.append(", title=");
        sb.append(str);
        sb.append(", paymentMethodId=");
        g8e.D(sb, str2, ", description=", str3, ", logo=");
        g8e.D(sb, str4, ", ybSuggestId=", str5, ", aftInfo=");
        sb.append(creditPaymentMethodAftInfoResponse);
        sb.append(", walletInfo=");
        sb.append(creditPaymentMethodWalletInfoResponse);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public CreditPaymentMethodResponse(@Json(name = "payment_method_type") CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse, @Json(name = "title") String str, @Json(name = "payment_method_id") String str2, @Json(name = "description") String str3, @Json(name = "logo") String str4, @Json(name = "JSON_FIELD_MEMBER_SUGGEST_ID") String str5, @Json(name = "aft_info") CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse, @Json(name = "wallet_info") CreditPaymentMethodWalletInfoResponse creditPaymentMethodWalletInfoResponse) {
        this.paymentMethodType = creditPaymentMethodTypeResponse;
        this.title = str;
        this.paymentMethodId = str2;
        this.description = str3;
        this.logo = str4;
        this.ybSuggestId = str5;
        this.aftInfo = creditPaymentMethodAftInfoResponse;
        this.walletInfo = creditPaymentMethodWalletInfoResponse;
    }
}
