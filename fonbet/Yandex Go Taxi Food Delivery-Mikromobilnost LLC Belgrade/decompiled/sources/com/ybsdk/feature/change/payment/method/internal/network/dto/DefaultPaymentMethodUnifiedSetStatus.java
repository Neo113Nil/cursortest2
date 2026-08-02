package com.ybsdk.feature.change.payment.method.internal.network.dto;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatus;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedStatus;", "url3ds", "", "paymentUrl", ErrorResponseData.JSON_ERROR_CODE, "<init>", "(Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedStatus;", "getUrl3ds", "()Ljava/lang/String;", "getPaymentUrl", "getErrorCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DefaultPaymentMethodUnifiedSetStatus {
    private final String errorCode;
    private final String paymentUrl;
    private final DefaultPaymentMethodUnifiedStatus status;
    private final String url3ds;

    public /* synthetic */ DefaultPaymentMethodUnifiedSetStatus(DefaultPaymentMethodUnifiedStatus defaultPaymentMethodUnifiedStatus, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(defaultPaymentMethodUnifiedStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ DefaultPaymentMethodUnifiedSetStatus copy$default(DefaultPaymentMethodUnifiedSetStatus defaultPaymentMethodUnifiedSetStatus, DefaultPaymentMethodUnifiedStatus defaultPaymentMethodUnifiedStatus, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            defaultPaymentMethodUnifiedStatus = defaultPaymentMethodUnifiedSetStatus.status;
        }
        if ((i & 2) != 0) {
            str = defaultPaymentMethodUnifiedSetStatus.url3ds;
        }
        if ((i & 4) != 0) {
            str2 = defaultPaymentMethodUnifiedSetStatus.paymentUrl;
        }
        if ((i & 8) != 0) {
            str3 = defaultPaymentMethodUnifiedSetStatus.errorCode;
        }
        return defaultPaymentMethodUnifiedSetStatus.copy(defaultPaymentMethodUnifiedStatus, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final DefaultPaymentMethodUnifiedStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl3ds() {
        return this.url3ds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    public final DefaultPaymentMethodUnifiedSetStatus copy(@Json(name = "status") DefaultPaymentMethodUnifiedStatus status, @Json(name = "url_3ds") String url3ds, @Json(name = "payment_url") String paymentUrl, @Json(name = "error_code") String errorCode) {
        return new DefaultPaymentMethodUnifiedSetStatus(status, url3ds, paymentUrl, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultPaymentMethodUnifiedSetStatus)) {
            return false;
        }
        DefaultPaymentMethodUnifiedSetStatus defaultPaymentMethodUnifiedSetStatus = (DefaultPaymentMethodUnifiedSetStatus) other;
        return this.status == defaultPaymentMethodUnifiedSetStatus.status && jl40.l(this.url3ds, defaultPaymentMethodUnifiedSetStatus.url3ds) && jl40.l(this.paymentUrl, defaultPaymentMethodUnifiedSetStatus.paymentUrl) && jl40.l(this.errorCode, defaultPaymentMethodUnifiedSetStatus.errorCode);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    public final DefaultPaymentMethodUnifiedStatus getStatus() {
        return this.status;
    }

    public final String getUrl3ds() {
        return this.url3ds;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.url3ds;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorCode;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        DefaultPaymentMethodUnifiedStatus defaultPaymentMethodUnifiedStatus = this.status;
        String str = this.url3ds;
        String str2 = this.paymentUrl;
        String str3 = this.errorCode;
        StringBuilder sb = new StringBuilder("DefaultPaymentMethodUnifiedSetStatus(status=");
        sb.append(defaultPaymentMethodUnifiedStatus);
        sb.append(", url3ds=");
        sb.append(str);
        sb.append(", paymentUrl=");
        return g8e.r(sb, str2, ", errorCode=", str3, Extension.C_BRAKE);
    }

    public DefaultPaymentMethodUnifiedSetStatus(@Json(name = "status") DefaultPaymentMethodUnifiedStatus defaultPaymentMethodUnifiedStatus, @Json(name = "url_3ds") String str, @Json(name = "payment_url") String str2, @Json(name = "error_code") String str3) {
        this.status = defaultPaymentMethodUnifiedStatus;
        this.url3ds = str;
        this.paymentUrl = str2;
        this.errorCode = str3;
    }
}
