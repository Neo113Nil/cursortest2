package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.AgreementWithWidgetDto;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.core.transfer.utils.domain.dto.UnconditionalLimitWidgetDto;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006-"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitPageInfoDto;", "", "header", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "agreementsSheetTitle", "", "debitInfo", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitDto;", "agreements", "", "Lcom/ybsdk/core/transfer/utils/domain/dto/AgreementWithWidgetDto;", "transferWidget", "Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "resultLoaderPage", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultPageDto;", "undefinedResultPage", "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitDto;Ljava/util/List;Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultPageDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultPageDto;)V", "getHeader", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "getAgreementsSheetTitle", "()Ljava/lang/String;", "getDebitInfo", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitDto;", "getAgreements", "()Ljava/util/List;", "getTransferWidget", "()Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "getResultLoaderPage", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultPageDto;", "getUndefinedResultPage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Me2MeDebitPageInfoDto {
    private final List<AgreementWithWidgetDto> agreements;
    private final String agreementsSheetTitle;
    private final Me2MeDebitDto debitInfo;
    private final PageHeaderDto header;
    private final Me2MeDebitResultPageDto resultLoaderPage;
    private final UnconditionalLimitWidgetDto transferWidget;
    private final Me2MeDebitResultPageDto undefinedResultPage;

    public Me2MeDebitPageInfoDto(@Json(name = "header") PageHeaderDto pageHeaderDto, @Json(name = "agreements_sheet_title") String str, @Json(name = "me2me_debit") Me2MeDebitDto me2MeDebitDto, @Json(name = "agreements") List<AgreementWithWidgetDto> list, @Json(name = "transfer_widget") UnconditionalLimitWidgetDto unconditionalLimitWidgetDto, @Json(name = "result_loader_page") Me2MeDebitResultPageDto me2MeDebitResultPageDto, @Json(name = "undefined_result_page") Me2MeDebitResultPageDto me2MeDebitResultPageDto2) {
        this.header = pageHeaderDto;
        this.agreementsSheetTitle = str;
        this.debitInfo = me2MeDebitDto;
        this.agreements = list;
        this.transferWidget = unconditionalLimitWidgetDto;
        this.resultLoaderPage = me2MeDebitResultPageDto;
        this.undefinedResultPage = me2MeDebitResultPageDto2;
    }

    public static /* synthetic */ Me2MeDebitPageInfoDto copy$default(Me2MeDebitPageInfoDto me2MeDebitPageInfoDto, PageHeaderDto pageHeaderDto, String str, Me2MeDebitDto me2MeDebitDto, List list, UnconditionalLimitWidgetDto unconditionalLimitWidgetDto, Me2MeDebitResultPageDto me2MeDebitResultPageDto, Me2MeDebitResultPageDto me2MeDebitResultPageDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            pageHeaderDto = me2MeDebitPageInfoDto.header;
        }
        if ((i & 2) != 0) {
            str = me2MeDebitPageInfoDto.agreementsSheetTitle;
        }
        if ((i & 4) != 0) {
            me2MeDebitDto = me2MeDebitPageInfoDto.debitInfo;
        }
        if ((i & 8) != 0) {
            list = me2MeDebitPageInfoDto.agreements;
        }
        if ((i & 16) != 0) {
            unconditionalLimitWidgetDto = me2MeDebitPageInfoDto.transferWidget;
        }
        if ((i & 32) != 0) {
            me2MeDebitResultPageDto = me2MeDebitPageInfoDto.resultLoaderPage;
        }
        if ((i & 64) != 0) {
            me2MeDebitResultPageDto2 = me2MeDebitPageInfoDto.undefinedResultPage;
        }
        Me2MeDebitResultPageDto me2MeDebitResultPageDto3 = me2MeDebitResultPageDto;
        Me2MeDebitResultPageDto me2MeDebitResultPageDto4 = me2MeDebitResultPageDto2;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto2 = unconditionalLimitWidgetDto;
        Me2MeDebitDto me2MeDebitDto2 = me2MeDebitDto;
        return me2MeDebitPageInfoDto.copy(pageHeaderDto, str, me2MeDebitDto2, list, unconditionalLimitWidgetDto2, me2MeDebitResultPageDto3, me2MeDebitResultPageDto4);
    }

    /* renamed from: component1, reason: from getter */
    public final PageHeaderDto getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Me2MeDebitDto getDebitInfo() {
        return this.debitInfo;
    }

    public final List<AgreementWithWidgetDto> component4() {
        return this.agreements;
    }

    /* renamed from: component5, reason: from getter */
    public final UnconditionalLimitWidgetDto getTransferWidget() {
        return this.transferWidget;
    }

    /* renamed from: component6, reason: from getter */
    public final Me2MeDebitResultPageDto getResultLoaderPage() {
        return this.resultLoaderPage;
    }

    /* renamed from: component7, reason: from getter */
    public final Me2MeDebitResultPageDto getUndefinedResultPage() {
        return this.undefinedResultPage;
    }

    public final Me2MeDebitPageInfoDto copy(@Json(name = "header") PageHeaderDto header, @Json(name = "agreements_sheet_title") String agreementsSheetTitle, @Json(name = "me2me_debit") Me2MeDebitDto debitInfo, @Json(name = "agreements") List<AgreementWithWidgetDto> agreements, @Json(name = "transfer_widget") UnconditionalLimitWidgetDto transferWidget, @Json(name = "result_loader_page") Me2MeDebitResultPageDto resultLoaderPage, @Json(name = "undefined_result_page") Me2MeDebitResultPageDto undefinedResultPage) {
        return new Me2MeDebitPageInfoDto(header, agreementsSheetTitle, debitInfo, agreements, transferWidget, resultLoaderPage, undefinedResultPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Me2MeDebitPageInfoDto)) {
            return false;
        }
        Me2MeDebitPageInfoDto me2MeDebitPageInfoDto = (Me2MeDebitPageInfoDto) other;
        return jl40.l(this.header, me2MeDebitPageInfoDto.header) && jl40.l(this.agreementsSheetTitle, me2MeDebitPageInfoDto.agreementsSheetTitle) && jl40.l(this.debitInfo, me2MeDebitPageInfoDto.debitInfo) && jl40.l(this.agreements, me2MeDebitPageInfoDto.agreements) && jl40.l(this.transferWidget, me2MeDebitPageInfoDto.transferWidget) && jl40.l(this.resultLoaderPage, me2MeDebitPageInfoDto.resultLoaderPage) && jl40.l(this.undefinedResultPage, me2MeDebitPageInfoDto.undefinedResultPage);
    }

    public final List<AgreementWithWidgetDto> getAgreements() {
        return this.agreements;
    }

    public final String getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    public final Me2MeDebitDto getDebitInfo() {
        return this.debitInfo;
    }

    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final Me2MeDebitResultPageDto getResultLoaderPage() {
        return this.resultLoaderPage;
    }

    public final UnconditionalLimitWidgetDto getTransferWidget() {
        return this.transferWidget;
    }

    public final Me2MeDebitResultPageDto getUndefinedResultPage() {
        return this.undefinedResultPage;
    }

    public int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        String str = this.agreementsSheetTitle;
        int c = unr0.c((this.debitInfo.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.agreements);
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = this.transferWidget;
        int hashCode2 = unconditionalLimitWidgetDto != null ? unconditionalLimitWidgetDto.hashCode() : 0;
        return this.undefinedResultPage.hashCode() + ((this.resultLoaderPage.hashCode() + ((c + hashCode2) * 31)) * 31);
    }

    public String toString() {
        return "Me2MeDebitPageInfoDto(header=" + this.header + ", agreementsSheetTitle=" + this.agreementsSheetTitle + ", debitInfo=" + this.debitInfo + ", agreements=" + this.agreements + ", transferWidget=" + this.transferWidget + ", resultLoaderPage=" + this.resultLoaderPage + ", undefinedResultPage=" + this.undefinedResultPage + Extension.C_BRAKE;
    }
}
