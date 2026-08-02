package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.CashbackDto;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JS\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;", "resultPage", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;", "widgets", "", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto;", "divkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "cashback", "Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;", "required3ds", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequired3dsDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequired3dsDto;)V", "getStatus", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;", "getResultPage", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;", "getWidgets", "()Ljava/util/List;", "getDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getCashback", "()Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;", "getRequired3ds", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequired3dsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferGetResultDto {
    private final CashbackDto cashback;
    private final DivDataDto divkitWidget;
    private final TransferRequired3dsDto required3ds;
    private final TransferResultPageDto resultPage;
    private final TransferStatusDto status;
    private final List<AutoTopupWidgetDto> widgets;

    public TransferGetResultDto(@Json(name = "status") TransferStatusDto transferStatusDto, @Json(name = "result_page") TransferResultPageDto transferResultPageDto, @Json(name = "widgets") List<AutoTopupWidgetDto> list, @Json(name = "divkit_widget") DivDataDto divDataDto, @Json(name = "cashback") CashbackDto cashbackDto, @Json(name = "required_3ds") TransferRequired3dsDto transferRequired3dsDto) {
        this.status = transferStatusDto;
        this.resultPage = transferResultPageDto;
        this.widgets = list;
        this.divkitWidget = divDataDto;
        this.cashback = cashbackDto;
        this.required3ds = transferRequired3dsDto;
    }

    public static /* synthetic */ TransferGetResultDto copy$default(TransferGetResultDto transferGetResultDto, TransferStatusDto transferStatusDto, TransferResultPageDto transferResultPageDto, List list, DivDataDto divDataDto, CashbackDto cashbackDto, TransferRequired3dsDto transferRequired3dsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            transferStatusDto = transferGetResultDto.status;
        }
        if ((i & 2) != 0) {
            transferResultPageDto = transferGetResultDto.resultPage;
        }
        if ((i & 4) != 0) {
            list = transferGetResultDto.widgets;
        }
        if ((i & 8) != 0) {
            divDataDto = transferGetResultDto.divkitWidget;
        }
        if ((i & 16) != 0) {
            cashbackDto = transferGetResultDto.cashback;
        }
        if ((i & 32) != 0) {
            transferRequired3dsDto = transferGetResultDto.required3ds;
        }
        CashbackDto cashbackDto2 = cashbackDto;
        TransferRequired3dsDto transferRequired3dsDto2 = transferRequired3dsDto;
        return transferGetResultDto.copy(transferStatusDto, transferResultPageDto, list, divDataDto, cashbackDto2, transferRequired3dsDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferResultPageDto getResultPage() {
        return this.resultPage;
    }

    public final List<AutoTopupWidgetDto> component3() {
        return this.widgets;
    }

    /* renamed from: component4, reason: from getter */
    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    /* renamed from: component5, reason: from getter */
    public final CashbackDto getCashback() {
        return this.cashback;
    }

    /* renamed from: component6, reason: from getter */
    public final TransferRequired3dsDto getRequired3ds() {
        return this.required3ds;
    }

    public final TransferGetResultDto copy(@Json(name = "status") TransferStatusDto status, @Json(name = "result_page") TransferResultPageDto resultPage, @Json(name = "widgets") List<AutoTopupWidgetDto> widgets, @Json(name = "divkit_widget") DivDataDto divkitWidget, @Json(name = "cashback") CashbackDto cashback, @Json(name = "required_3ds") TransferRequired3dsDto required3ds) {
        return new TransferGetResultDto(status, resultPage, widgets, divkitWidget, cashback, required3ds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferGetResultDto)) {
            return false;
        }
        TransferGetResultDto transferGetResultDto = (TransferGetResultDto) other;
        return this.status == transferGetResultDto.status && jl40.l(this.resultPage, transferGetResultDto.resultPage) && jl40.l(this.widgets, transferGetResultDto.widgets) && jl40.l(this.divkitWidget, transferGetResultDto.divkitWidget) && jl40.l(this.cashback, transferGetResultDto.cashback) && jl40.l(this.required3ds, transferGetResultDto.required3ds);
    }

    public final CashbackDto getCashback() {
        return this.cashback;
    }

    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final TransferRequired3dsDto getRequired3ds() {
        return this.required3ds;
    }

    public final TransferResultPageDto getResultPage() {
        return this.resultPage;
    }

    public final TransferStatusDto getStatus() {
        return this.status;
    }

    public final List<AutoTopupWidgetDto> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int hashCode = (this.resultPage.hashCode() + (this.status.hashCode() * 31)) * 31;
        List<AutoTopupWidgetDto> list = this.widgets;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        DivDataDto divDataDto = this.divkitWidget;
        int hashCode3 = (hashCode2 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        CashbackDto cashbackDto = this.cashback;
        int hashCode4 = (hashCode3 + (cashbackDto == null ? 0 : cashbackDto.hashCode())) * 31;
        TransferRequired3dsDto transferRequired3dsDto = this.required3ds;
        return hashCode4 + (transferRequired3dsDto != null ? transferRequired3dsDto.hashCode() : 0);
    }

    public String toString() {
        return "TransferGetResultDto(status=" + this.status + ", resultPage=" + this.resultPage + ", widgets=" + this.widgets + ", divkitWidget=" + this.divkitWidget + ", cashback=" + this.cashback + ", required3ds=" + this.required3ds + Extension.C_BRAKE;
    }
}
