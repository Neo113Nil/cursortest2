package com.ybsdk.feature.qr.payments.internal.network.dto.check;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.CashbackDto;
import com.ybsdk.core.transfer.utils.domain.dto.UnconditionalLimitWidgetDto;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/check/CheckPaymentDto;", "", "cashback", "Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;", "checkId", "", "limitWidget", "Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "tooltip", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/check/TooltipDto;", "isPaymentAllowed", "", "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;Lcom/ybsdk/feature/qr/payments/internal/network/dto/check/TooltipDto;Z)V", "getCashback", "()Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;", "getCheckId", "()Ljava/lang/String;", "getLimitWidget", "()Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "getTooltip", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/check/TooltipDto;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckPaymentDto {
    private final CashbackDto cashback;
    private final String checkId;
    private final boolean isPaymentAllowed;
    private final UnconditionalLimitWidgetDto limitWidget;
    private final TooltipDto tooltip;

    public CheckPaymentDto(@Json(name = "cashback") CashbackDto cashbackDto, @Json(name = "check_id") String str, @Json(name = "limit_widget") UnconditionalLimitWidgetDto unconditionalLimitWidgetDto, @Json(name = "tooltip") TooltipDto tooltipDto, @Json(name = "is_payment_allowed") boolean z) {
        this.cashback = cashbackDto;
        this.checkId = str;
        this.limitWidget = unconditionalLimitWidgetDto;
        this.tooltip = tooltipDto;
        this.isPaymentAllowed = z;
    }

    public static /* synthetic */ CheckPaymentDto copy$default(CheckPaymentDto checkPaymentDto, CashbackDto cashbackDto, String str, UnconditionalLimitWidgetDto unconditionalLimitWidgetDto, TooltipDto tooltipDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cashbackDto = checkPaymentDto.cashback;
        }
        if ((i & 2) != 0) {
            str = checkPaymentDto.checkId;
        }
        if ((i & 4) != 0) {
            unconditionalLimitWidgetDto = checkPaymentDto.limitWidget;
        }
        if ((i & 8) != 0) {
            tooltipDto = checkPaymentDto.tooltip;
        }
        if ((i & 16) != 0) {
            z = checkPaymentDto.isPaymentAllowed;
        }
        boolean z2 = z;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto2 = unconditionalLimitWidgetDto;
        return checkPaymentDto.copy(cashbackDto, str, unconditionalLimitWidgetDto2, tooltipDto, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final CashbackDto getCashback() {
        return this.cashback;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCheckId() {
        return this.checkId;
    }

    /* renamed from: component3, reason: from getter */
    public final UnconditionalLimitWidgetDto getLimitWidget() {
        return this.limitWidget;
    }

    /* renamed from: component4, reason: from getter */
    public final TooltipDto getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPaymentAllowed() {
        return this.isPaymentAllowed;
    }

    public final CheckPaymentDto copy(@Json(name = "cashback") CashbackDto cashback, @Json(name = "check_id") String checkId, @Json(name = "limit_widget") UnconditionalLimitWidgetDto limitWidget, @Json(name = "tooltip") TooltipDto tooltip, @Json(name = "is_payment_allowed") boolean isPaymentAllowed) {
        return new CheckPaymentDto(cashback, checkId, limitWidget, tooltip, isPaymentAllowed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPaymentDto)) {
            return false;
        }
        CheckPaymentDto checkPaymentDto = (CheckPaymentDto) other;
        return jl40.l(this.cashback, checkPaymentDto.cashback) && jl40.l(this.checkId, checkPaymentDto.checkId) && jl40.l(this.limitWidget, checkPaymentDto.limitWidget) && jl40.l(this.tooltip, checkPaymentDto.tooltip) && this.isPaymentAllowed == checkPaymentDto.isPaymentAllowed;
    }

    public final CashbackDto getCashback() {
        return this.cashback;
    }

    public final String getCheckId() {
        return this.checkId;
    }

    public final UnconditionalLimitWidgetDto getLimitWidget() {
        return this.limitWidget;
    }

    public final TooltipDto getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        CashbackDto cashbackDto = this.cashback;
        int b = unr0.b((cashbackDto == null ? 0 : cashbackDto.hashCode()) * 31, 31, this.checkId);
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = this.limitWidget;
        int hashCode = (b + (unconditionalLimitWidgetDto == null ? 0 : unconditionalLimitWidgetDto.hashCode())) * 31;
        TooltipDto tooltipDto = this.tooltip;
        return Boolean.hashCode(this.isPaymentAllowed) + ((hashCode + (tooltipDto != null ? tooltipDto.hashCode() : 0)) * 31);
    }

    public final boolean isPaymentAllowed() {
        return this.isPaymentAllowed;
    }

    public String toString() {
        CashbackDto cashbackDto = this.cashback;
        String str = this.checkId;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = this.limitWidget;
        TooltipDto tooltipDto = this.tooltip;
        boolean z = this.isPaymentAllowed;
        StringBuilder sb = new StringBuilder("CheckPaymentDto(cashback=");
        sb.append(cashbackDto);
        sb.append(", checkId=");
        sb.append(str);
        sb.append(", limitWidget=");
        sb.append(unconditionalLimitWidgetDto);
        sb.append(", tooltip=");
        sb.append(tooltipDto);
        sb.append(", isPaymentAllowed=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }
}
