package com.ybsdk.core.transfer.utils.domain.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/dto/AgreementImageDto;", "", "header", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "selector", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getHeader", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getSelector", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AgreementImageDto {
    private final Themes<String> header;
    private final Themes<String> selector;

    public AgreementImageDto(@Json(name = "header") Themes<String> themes, @Json(name = "selector") Themes<String> themes2) {
        this.header = themes;
        this.selector = themes2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgreementImageDto copy$default(AgreementImageDto agreementImageDto, Themes themes, Themes themes2, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = agreementImageDto.header;
        }
        if ((i & 2) != 0) {
            themes2 = agreementImageDto.selector;
        }
        return agreementImageDto.copy(themes, themes2);
    }

    public final Themes<String> component1() {
        return this.header;
    }

    public final Themes<String> component2() {
        return this.selector;
    }

    public final AgreementImageDto copy(@Json(name = "header") Themes<String> header, @Json(name = "selector") Themes<String> selector) {
        return new AgreementImageDto(header, selector);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementImageDto)) {
            return false;
        }
        AgreementImageDto agreementImageDto = (AgreementImageDto) other;
        return jl40.l(this.header, agreementImageDto.header) && jl40.l(this.selector, agreementImageDto.selector);
    }

    public final Themes<String> getHeader() {
        return this.header;
    }

    public final Themes<String> getSelector() {
        return this.selector;
    }

    public int hashCode() {
        Themes<String> themes = this.header;
        int hashCode = (themes == null ? 0 : themes.hashCode()) * 31;
        Themes<String> themes2 = this.selector;
        return hashCode + (themes2 != null ? themes2.hashCode() : 0);
    }

    public String toString() {
        return "AgreementImageDto(header=" + this.header + ", selector=" + this.selector + Extension.C_BRAKE;
    }
}
