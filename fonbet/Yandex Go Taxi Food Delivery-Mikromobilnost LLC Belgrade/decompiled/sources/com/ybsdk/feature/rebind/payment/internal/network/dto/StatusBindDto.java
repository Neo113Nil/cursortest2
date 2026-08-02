package com.ybsdk.feature.rebind.payment.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.rebind.payment.api.RebindPaymentMethodStatusDto;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/rebind/payment/internal/network/dto/StatusBindDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/rebind/payment/api/RebindPaymentMethodStatusDto;", "url3ds", "", "error", "<init>", "(Lcom/ybsdk/feature/rebind/payment/api/RebindPaymentMethodStatusDto;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/feature/rebind/payment/api/RebindPaymentMethodStatusDto;", "getUrl3ds", "()Ljava/lang/String;", "getError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-rebind-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatusBindDto {
    private final String error;
    private final RebindPaymentMethodStatusDto status;
    private final String url3ds;

    public /* synthetic */ StatusBindDto(RebindPaymentMethodStatusDto rebindPaymentMethodStatusDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rebindPaymentMethodStatusDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ StatusBindDto copy$default(StatusBindDto statusBindDto, RebindPaymentMethodStatusDto rebindPaymentMethodStatusDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            rebindPaymentMethodStatusDto = statusBindDto.status;
        }
        if ((i & 2) != 0) {
            str = statusBindDto.url3ds;
        }
        if ((i & 4) != 0) {
            str2 = statusBindDto.error;
        }
        return statusBindDto.copy(rebindPaymentMethodStatusDto, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final RebindPaymentMethodStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl3ds() {
        return this.url3ds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final StatusBindDto copy(@Json(name = "status") RebindPaymentMethodStatusDto status, @Json(name = "url_3ds") String url3ds, @Json(name = "error") String error) {
        return new StatusBindDto(status, url3ds, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusBindDto)) {
            return false;
        }
        StatusBindDto statusBindDto = (StatusBindDto) other;
        return this.status == statusBindDto.status && jl40.l(this.url3ds, statusBindDto.url3ds) && jl40.l(this.error, statusBindDto.error);
    }

    public final String getError() {
        return this.error;
    }

    public final RebindPaymentMethodStatusDto getStatus() {
        return this.status;
    }

    public final String getUrl3ds() {
        return this.url3ds;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.url3ds;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        RebindPaymentMethodStatusDto rebindPaymentMethodStatusDto = this.status;
        String str = this.url3ds;
        String str2 = this.error;
        StringBuilder sb = new StringBuilder("StatusBindDto(status=");
        sb.append(rebindPaymentMethodStatusDto);
        sb.append(", url3ds=");
        sb.append(str);
        sb.append(", error=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }

    public StatusBindDto(@Json(name = "status") RebindPaymentMethodStatusDto rebindPaymentMethodStatusDto, @Json(name = "url_3ds") String str, @Json(name = "error") String str2) {
        this.status = rebindPaymentMethodStatusDto;
        this.url3ds = str;
        this.error = str2;
    }
}
