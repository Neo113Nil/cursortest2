package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/PaymentSdkCreds;", "", "", "merchantServiceToken", "currency", "pos", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/PaymentSdkCreds;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMerchantServiceToken", "getCurrency", "getPos", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PaymentSdkCreds {

    @Json(name = "currency")
    private final String currency;

    @Json(name = "merchant_service_token")
    private final String merchantServiceToken;

    @Json(name = "pos")
    private final String pos;

    public PaymentSdkCreds(String str, String str2, String str3) {
        this.merchantServiceToken = str;
        this.currency = str2;
        this.pos = str3;
    }

    public static /* synthetic */ PaymentSdkCreds copy$default(PaymentSdkCreds paymentSdkCreds, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentSdkCreds.merchantServiceToken;
        }
        if ((i & 2) != 0) {
            str2 = paymentSdkCreds.currency;
        }
        if ((i & 4) != 0) {
            str3 = paymentSdkCreds.pos;
        }
        return paymentSdkCreds.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMerchantServiceToken() {
        return this.merchantServiceToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPos() {
        return this.pos;
    }

    public final PaymentSdkCreds copy(String merchantServiceToken, String currency, String pos) {
        return new PaymentSdkCreds(merchantServiceToken, currency, pos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSdkCreds)) {
            return false;
        }
        PaymentSdkCreds paymentSdkCreds = (PaymentSdkCreds) other;
        return jl40.l(this.merchantServiceToken, paymentSdkCreds.merchantServiceToken) && jl40.l(this.currency, paymentSdkCreds.currency) && jl40.l(this.pos, paymentSdkCreds.pos);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getMerchantServiceToken() {
        return this.merchantServiceToken;
    }

    public final String getPos() {
        return this.pos;
    }

    public int hashCode() {
        int hashCode = this.merchantServiceToken.hashCode() * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pos;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.merchantServiceToken;
        String str2 = this.currency;
        return oyr.t(b64.v("PaymentSdkCreds(merchantServiceToken=", str, ", currency=", str2, ", pos="), this.pos, Extension.C_BRAKE);
    }
}
