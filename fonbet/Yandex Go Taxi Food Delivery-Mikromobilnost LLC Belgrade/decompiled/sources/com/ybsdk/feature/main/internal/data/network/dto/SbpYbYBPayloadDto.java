package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CommonSheet;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/SbpYbYBPayloadDto;", "", "userWithoutPayCardSheet", "Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/CommonSheet;)V", "getUserWithoutPayCardSheet", "()Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbpYbYBPayloadDto {
    private final CommonSheet userWithoutPayCardSheet;

    public SbpYbYBPayloadDto(@Json(name = "user_without_pay_card_sheet") CommonSheet commonSheet) {
        this.userWithoutPayCardSheet = commonSheet;
    }

    public static /* synthetic */ SbpYbYBPayloadDto copy$default(SbpYbYBPayloadDto sbpYbYBPayloadDto, CommonSheet commonSheet, int i, Object obj) {
        if ((i & 1) != 0) {
            commonSheet = sbpYbYBPayloadDto.userWithoutPayCardSheet;
        }
        return sbpYbYBPayloadDto.copy(commonSheet);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonSheet getUserWithoutPayCardSheet() {
        return this.userWithoutPayCardSheet;
    }

    public final SbpYbYBPayloadDto copy(@Json(name = "user_without_pay_card_sheet") CommonSheet userWithoutPayCardSheet) {
        return new SbpYbYBPayloadDto(userWithoutPayCardSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SbpYbYBPayloadDto) && jl40.l(this.userWithoutPayCardSheet, ((SbpYbYBPayloadDto) other).userWithoutPayCardSheet);
    }

    public final CommonSheet getUserWithoutPayCardSheet() {
        return this.userWithoutPayCardSheet;
    }

    public int hashCode() {
        CommonSheet commonSheet = this.userWithoutPayCardSheet;
        if (commonSheet == null) {
            return 0;
        }
        return commonSheet.hashCode();
    }

    public String toString() {
        return "SbpYbYBPayloadDto(userWithoutPayCardSheet=" + this.userWithoutPayCardSheet + Extension.C_BRAKE;
    }
}
