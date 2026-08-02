package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SourcePaymentSideDto;", "", "type", "", "agreementType", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getAgreementType", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SourcePaymentSideDto {
    private final String agreementType;
    private final String type;
    private final String value;

    public SourcePaymentSideDto(@Json(name = "type") String str, @Json(name = "agreement_type") String str2, @Json(name = "value") String str3) {
        this.type = str;
        this.agreementType = str2;
        this.value = str3;
    }

    public static /* synthetic */ SourcePaymentSideDto copy$default(SourcePaymentSideDto sourcePaymentSideDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sourcePaymentSideDto.type;
        }
        if ((i & 2) != 0) {
            str2 = sourcePaymentSideDto.agreementType;
        }
        if ((i & 4) != 0) {
            str3 = sourcePaymentSideDto.value;
        }
        return sourcePaymentSideDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementType() {
        return this.agreementType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final SourcePaymentSideDto copy(@Json(name = "type") String type, @Json(name = "agreement_type") String agreementType, @Json(name = "value") String value) {
        return new SourcePaymentSideDto(type, agreementType, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourcePaymentSideDto)) {
            return false;
        }
        SourcePaymentSideDto sourcePaymentSideDto = (SourcePaymentSideDto) other;
        return jl40.l(this.type, sourcePaymentSideDto.type) && jl40.l(this.agreementType, sourcePaymentSideDto.agreementType) && jl40.l(this.value, sourcePaymentSideDto.value);
    }

    public final String getAgreementType() {
        return this.agreementType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.agreementType;
        return this.value.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.agreementType;
        return oyr.t(b64.v("SourcePaymentSideDto(type=", str, ", agreementType=", str2, ", value="), this.value, Extension.C_BRAKE);
    }

    public /* synthetic */ SourcePaymentSideDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3);
    }
}
