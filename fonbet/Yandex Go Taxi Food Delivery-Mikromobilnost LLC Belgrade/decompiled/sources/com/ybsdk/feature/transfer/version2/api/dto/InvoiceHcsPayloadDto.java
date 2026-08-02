package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/InvoiceHcsPayloadDto;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "invoiceId", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "comment", "requisites", "Lcom/ybsdk/feature/transfer/version2/api/dto/HcsInvoiceRequisitesDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/dto/HcsInvoiceRequisitesDto;)V", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getInvoiceId", "()Ljava/lang/String;", "getTitle", "getDescription", "getComment", "getRequisites", "()Lcom/ybsdk/feature/transfer/version2/api/dto/HcsInvoiceRequisitesDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InvoiceHcsPayloadDto {
    private final String comment;
    private final String description;
    private final Themes<String> image;
    private final String invoiceId;
    private final HcsInvoiceRequisitesDto requisites;
    private final String title;

    public InvoiceHcsPayloadDto(@Json(name = "image") Themes<String> themes, @Json(name = "invoice_id") String str, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "comment") String str4, @Json(name = "requisites") HcsInvoiceRequisitesDto hcsInvoiceRequisitesDto) {
        this.image = themes;
        this.invoiceId = str;
        this.title = str2;
        this.description = str3;
        this.comment = str4;
        this.requisites = hcsInvoiceRequisitesDto;
    }

    public static /* synthetic */ InvoiceHcsPayloadDto copy$default(InvoiceHcsPayloadDto invoiceHcsPayloadDto, Themes themes, String str, String str2, String str3, String str4, HcsInvoiceRequisitesDto hcsInvoiceRequisitesDto, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = invoiceHcsPayloadDto.image;
        }
        if ((i & 2) != 0) {
            str = invoiceHcsPayloadDto.invoiceId;
        }
        if ((i & 4) != 0) {
            str2 = invoiceHcsPayloadDto.title;
        }
        if ((i & 8) != 0) {
            str3 = invoiceHcsPayloadDto.description;
        }
        if ((i & 16) != 0) {
            str4 = invoiceHcsPayloadDto.comment;
        }
        if ((i & 32) != 0) {
            hcsInvoiceRequisitesDto = invoiceHcsPayloadDto.requisites;
        }
        String str5 = str4;
        HcsInvoiceRequisitesDto hcsInvoiceRequisitesDto2 = hcsInvoiceRequisitesDto;
        return invoiceHcsPayloadDto.copy(themes, str, str2, str3, str5, hcsInvoiceRequisitesDto2);
    }

    public final Themes<String> component1() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component6, reason: from getter */
    public final HcsInvoiceRequisitesDto getRequisites() {
        return this.requisites;
    }

    public final InvoiceHcsPayloadDto copy(@Json(name = "image") Themes<String> image, @Json(name = "invoice_id") String invoiceId, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "comment") String comment, @Json(name = "requisites") HcsInvoiceRequisitesDto requisites) {
        return new InvoiceHcsPayloadDto(image, invoiceId, title, description, comment, requisites);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceHcsPayloadDto)) {
            return false;
        }
        InvoiceHcsPayloadDto invoiceHcsPayloadDto = (InvoiceHcsPayloadDto) other;
        return jl40.l(this.image, invoiceHcsPayloadDto.image) && jl40.l(this.invoiceId, invoiceHcsPayloadDto.invoiceId) && jl40.l(this.title, invoiceHcsPayloadDto.title) && jl40.l(this.description, invoiceHcsPayloadDto.description) && jl40.l(this.comment, invoiceHcsPayloadDto.comment) && jl40.l(this.requisites, invoiceHcsPayloadDto.requisites);
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getInvoiceId() {
        return this.invoiceId;
    }

    public final HcsInvoiceRequisitesDto getRequisites() {
        return this.requisites;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.image.hashCode() * 31, 31, this.invoiceId), 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.comment;
        return this.requisites.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        Themes<String> themes = this.image;
        String str = this.invoiceId;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.comment;
        HcsInvoiceRequisitesDto hcsInvoiceRequisitesDto = this.requisites;
        StringBuilder sb = new StringBuilder("InvoiceHcsPayloadDto(image=");
        sb.append(themes);
        sb.append(", invoiceId=");
        sb.append(str);
        sb.append(", title=");
        g8e.D(sb, str2, ", description=", str3, ", comment=");
        sb.append(str4);
        sb.append(", requisites=");
        sb.append(hcsInvoiceRequisitesDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
