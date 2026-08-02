package com.ybsdk.core.common.data.network.dto.nfc;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;", "", "isNfcAvailable", "", "isNfcPaymentSetup", "isNfcPaymentDefault", "tokenizedProductTypes", "", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcProductTypeDto;", "defaultNfcProductType", "<init>", "(ZZZLjava/util/List;Lcom/ybsdk/core/common/data/network/dto/nfc/NfcProductTypeDto;)V", "()Z", "getTokenizedProductTypes", "()Ljava/util/List;", "getDefaultNfcProductType", "()Lcom/ybsdk/core/common/data/network/dto/nfc/NfcProductTypeDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NfcInfoDto {
    private final NfcProductTypeDto defaultNfcProductType;
    private final boolean isNfcAvailable;
    private final boolean isNfcPaymentDefault;
    private final boolean isNfcPaymentSetup;
    private final List<NfcProductTypeDto> tokenizedProductTypes;

    public /* synthetic */ NfcInfoDto(boolean z, boolean z2, boolean z3, List list, NfcProductTypeDto nfcProductTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : nfcProductTypeDto);
    }

    public static /* synthetic */ NfcInfoDto copy$default(NfcInfoDto nfcInfoDto, boolean z, boolean z2, boolean z3, List list, NfcProductTypeDto nfcProductTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nfcInfoDto.isNfcAvailable;
        }
        if ((i & 2) != 0) {
            z2 = nfcInfoDto.isNfcPaymentSetup;
        }
        if ((i & 4) != 0) {
            z3 = nfcInfoDto.isNfcPaymentDefault;
        }
        if ((i & 8) != 0) {
            list = nfcInfoDto.tokenizedProductTypes;
        }
        if ((i & 16) != 0) {
            nfcProductTypeDto = nfcInfoDto.defaultNfcProductType;
        }
        NfcProductTypeDto nfcProductTypeDto2 = nfcProductTypeDto;
        boolean z4 = z3;
        return nfcInfoDto.copy(z, z2, z4, list, nfcProductTypeDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNfcAvailable() {
        return this.isNfcAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsNfcPaymentSetup() {
        return this.isNfcPaymentSetup;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNfcPaymentDefault() {
        return this.isNfcPaymentDefault;
    }

    public final List<NfcProductTypeDto> component4() {
        return this.tokenizedProductTypes;
    }

    /* renamed from: component5, reason: from getter */
    public final NfcProductTypeDto getDefaultNfcProductType() {
        return this.defaultNfcProductType;
    }

    public final NfcInfoDto copy(@Json(name = "is_nfc_available") boolean isNfcAvailable, @Json(name = "is_nfc_payment_setup") boolean isNfcPaymentSetup, @Json(name = "is_nfc_payment_default") boolean isNfcPaymentDefault, @Json(name = "tokenized_product_types") List<? extends NfcProductTypeDto> tokenizedProductTypes, @Json(name = "default_nfc_product_type") NfcProductTypeDto defaultNfcProductType) {
        return new NfcInfoDto(isNfcAvailable, isNfcPaymentSetup, isNfcPaymentDefault, tokenizedProductTypes, defaultNfcProductType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcInfoDto)) {
            return false;
        }
        NfcInfoDto nfcInfoDto = (NfcInfoDto) other;
        return this.isNfcAvailable == nfcInfoDto.isNfcAvailable && this.isNfcPaymentSetup == nfcInfoDto.isNfcPaymentSetup && this.isNfcPaymentDefault == nfcInfoDto.isNfcPaymentDefault && jl40.l(this.tokenizedProductTypes, nfcInfoDto.tokenizedProductTypes) && this.defaultNfcProductType == nfcInfoDto.defaultNfcProductType;
    }

    public final NfcProductTypeDto getDefaultNfcProductType() {
        return this.defaultNfcProductType;
    }

    public final List<NfcProductTypeDto> getTokenizedProductTypes() {
        return this.tokenizedProductTypes;
    }

    public int hashCode() {
        int e = unr0.e(unr0.e(Boolean.hashCode(this.isNfcAvailable) * 31, 31, this.isNfcPaymentSetup), 31, this.isNfcPaymentDefault);
        List<NfcProductTypeDto> list = this.tokenizedProductTypes;
        int hashCode = (e + (list == null ? 0 : list.hashCode())) * 31;
        NfcProductTypeDto nfcProductTypeDto = this.defaultNfcProductType;
        return hashCode + (nfcProductTypeDto != null ? nfcProductTypeDto.hashCode() : 0);
    }

    public final boolean isNfcAvailable() {
        return this.isNfcAvailable;
    }

    public final boolean isNfcPaymentDefault() {
        return this.isNfcPaymentDefault;
    }

    public final boolean isNfcPaymentSetup() {
        return this.isNfcPaymentSetup;
    }

    public String toString() {
        boolean z = this.isNfcAvailable;
        boolean z2 = this.isNfcPaymentSetup;
        boolean z3 = this.isNfcPaymentDefault;
        List<NfcProductTypeDto> list = this.tokenizedProductTypes;
        NfcProductTypeDto nfcProductTypeDto = this.defaultNfcProductType;
        StringBuilder u = qv10.u("NfcInfoDto(isNfcAvailable=", ", isNfcPaymentSetup=", ", isNfcPaymentDefault=", z, z2);
        u.append(z3);
        u.append(", tokenizedProductTypes=");
        u.append(list);
        u.append(", defaultNfcProductType=");
        u.append(nfcProductTypeDto);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NfcInfoDto(@Json(name = "is_nfc_available") boolean z, @Json(name = "is_nfc_payment_setup") boolean z2, @Json(name = "is_nfc_payment_default") boolean z3, @Json(name = "tokenized_product_types") List<? extends NfcProductTypeDto> list, @Json(name = "default_nfc_product_type") NfcProductTypeDto nfcProductTypeDto) {
        this.isNfcAvailable = z;
        this.isNfcPaymentSetup = z2;
        this.isNfcPaymentDefault = z3;
        this.tokenizedProductTypes = list;
        this.defaultNfcProductType = nfcProductTypeDto;
    }
}
