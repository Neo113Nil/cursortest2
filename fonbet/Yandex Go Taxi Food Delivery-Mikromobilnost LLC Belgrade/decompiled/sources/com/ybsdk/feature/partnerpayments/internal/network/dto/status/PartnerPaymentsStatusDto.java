package com.ybsdk.feature.partnerpayments.internal.network.dto.status;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/status/PartnerPaymentsStatusDto;", "", ACSPConstants.STATUS, "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PartnerPaymentsStatusDto {
    private final String action;
    private final String status;

    public /* synthetic */ PartnerPaymentsStatusDto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ PartnerPaymentsStatusDto copy$default(PartnerPaymentsStatusDto partnerPaymentsStatusDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerPaymentsStatusDto.status;
        }
        if ((i & 2) != 0) {
            str2 = partnerPaymentsStatusDto.action;
        }
        return partnerPaymentsStatusDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final PartnerPaymentsStatusDto copy(@Json(name = "status") String status, @Json(name = "action") String action) {
        return new PartnerPaymentsStatusDto(status, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerPaymentsStatusDto)) {
            return false;
        }
        PartnerPaymentsStatusDto partnerPaymentsStatusDto = (PartnerPaymentsStatusDto) other;
        return jl40.l(this.status, partnerPaymentsStatusDto.status) && jl40.l(this.action, partnerPaymentsStatusDto.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.action;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("PartnerPaymentsStatusDto(status=", this.status, ", action=", this.action, Extension.C_BRAKE);
    }

    public PartnerPaymentsStatusDto(@Json(name = "status") String str, @Json(name = "action") String str2) {
        this.status = str;
        this.action = str2;
    }
}
