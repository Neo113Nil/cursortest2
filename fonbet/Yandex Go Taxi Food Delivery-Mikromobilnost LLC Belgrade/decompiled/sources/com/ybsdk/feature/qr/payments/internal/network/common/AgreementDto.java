package com.ybsdk.feature.qr.payments.internal.network.common;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.AgreementImageDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/common/AgreementDto;", "", "agreementId", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "Lcom/ybsdk/core/transfer/utils/domain/dto/AgreementImageDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/dto/AgreementImageDto;)V", "getAgreementId", "()Ljava/lang/String;", "getTitle", "getDescription", "getImage", "()Lcom/ybsdk/core/transfer/utils/domain/dto/AgreementImageDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AgreementDto {
    private final String agreementId;
    private final String description;
    private final AgreementImageDto image;
    private final String title;

    public AgreementDto(@Json(name = "id") String str, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "image") AgreementImageDto agreementImageDto) {
        this.agreementId = str;
        this.title = str2;
        this.description = str3;
        this.image = agreementImageDto;
    }

    public static /* synthetic */ AgreementDto copy$default(AgreementDto agreementDto, String str, String str2, String str3, AgreementImageDto agreementImageDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agreementDto.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = agreementDto.title;
        }
        if ((i & 4) != 0) {
            str3 = agreementDto.description;
        }
        if ((i & 8) != 0) {
            agreementImageDto = agreementDto.image;
        }
        return agreementDto.copy(str, str2, str3, agreementImageDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final AgreementImageDto getImage() {
        return this.image;
    }

    public final AgreementDto copy(@Json(name = "id") String agreementId, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "image") AgreementImageDto image) {
        return new AgreementDto(agreementId, title, description, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementDto)) {
            return false;
        }
        AgreementDto agreementDto = (AgreementDto) other;
        return jl40.l(this.agreementId, agreementDto.agreementId) && jl40.l(this.title, agreementDto.title) && jl40.l(this.description, agreementDto.description) && jl40.l(this.image, agreementDto.image);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AgreementImageDto getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.agreementId.hashCode() * 31, 31, this.title), 31, this.description);
        AgreementImageDto agreementImageDto = this.image;
        return b + (agreementImageDto == null ? 0 : agreementImageDto.hashCode());
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.title;
        String str3 = this.description;
        AgreementImageDto agreementImageDto = this.image;
        StringBuilder v = b64.v("AgreementDto(agreementId=", str, ", title=", str2, ", description=");
        v.append(str3);
        v.append(", image=");
        v.append(agreementImageDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
