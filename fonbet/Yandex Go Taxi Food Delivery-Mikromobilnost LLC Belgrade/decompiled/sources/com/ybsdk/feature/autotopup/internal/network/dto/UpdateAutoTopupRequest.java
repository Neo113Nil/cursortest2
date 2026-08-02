package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.autotopup.api.dto.PaymentMethodInfoDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/UpdateAutoTopupRequest;", "", "autoTopupId", "", "paymentMethodInfo", "Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "threshold", "switch", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$SwitchState;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$SwitchState;)V", "getAutoTopupId", "()Ljava/lang/String;", "getPaymentMethodInfo", "()Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getThreshold", "getSwitch", "()Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$SwitchState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpdateAutoTopupRequest {
    private final String autoTopupId;
    private final Money money;
    private final PaymentMethodInfoDto paymentMethodInfo;
    private final AutoTopupWidgetDto.SwitchState switch;
    private final Money threshold;

    public UpdateAutoTopupRequest(@Json(name = "autotopup_id") String str, @Json(name = "payment_method_info") PaymentMethodInfoDto paymentMethodInfoDto, @Json(name = "money") Money money, @Json(name = "threshold") Money money2, @Json(name = "switch") AutoTopupWidgetDto.SwitchState switchState) {
        this.autoTopupId = str;
        this.paymentMethodInfo = paymentMethodInfoDto;
        this.money = money;
        this.threshold = money2;
        this.switch = switchState;
    }

    public static /* synthetic */ UpdateAutoTopupRequest copy$default(UpdateAutoTopupRequest updateAutoTopupRequest, String str, PaymentMethodInfoDto paymentMethodInfoDto, Money money, Money money2, AutoTopupWidgetDto.SwitchState switchState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateAutoTopupRequest.autoTopupId;
        }
        if ((i & 2) != 0) {
            paymentMethodInfoDto = updateAutoTopupRequest.paymentMethodInfo;
        }
        if ((i & 4) != 0) {
            money = updateAutoTopupRequest.money;
        }
        if ((i & 8) != 0) {
            money2 = updateAutoTopupRequest.threshold;
        }
        if ((i & 16) != 0) {
            switchState = updateAutoTopupRequest.switch;
        }
        AutoTopupWidgetDto.SwitchState switchState2 = switchState;
        Money money3 = money;
        return updateAutoTopupRequest.copy(str, paymentMethodInfoDto, money3, money2, switchState2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentMethodInfoDto getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getThreshold() {
        return this.threshold;
    }

    /* renamed from: component5, reason: from getter */
    public final AutoTopupWidgetDto.SwitchState getSwitch() {
        return this.switch;
    }

    public final UpdateAutoTopupRequest copy(@Json(name = "autotopup_id") String autoTopupId, @Json(name = "payment_method_info") PaymentMethodInfoDto paymentMethodInfo, @Json(name = "money") Money money, @Json(name = "threshold") Money threshold, @Json(name = "switch") AutoTopupWidgetDto.SwitchState r5) {
        return new UpdateAutoTopupRequest(autoTopupId, paymentMethodInfo, money, threshold, r5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateAutoTopupRequest)) {
            return false;
        }
        UpdateAutoTopupRequest updateAutoTopupRequest = (UpdateAutoTopupRequest) other;
        return jl40.l(this.autoTopupId, updateAutoTopupRequest.autoTopupId) && jl40.l(this.paymentMethodInfo, updateAutoTopupRequest.paymentMethodInfo) && jl40.l(this.money, updateAutoTopupRequest.money) && jl40.l(this.threshold, updateAutoTopupRequest.threshold) && this.switch == updateAutoTopupRequest.switch;
    }

    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final PaymentMethodInfoDto getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public final AutoTopupWidgetDto.SwitchState getSwitch() {
        return this.switch;
    }

    public final Money getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        int hashCode = this.autoTopupId.hashCode() * 31;
        PaymentMethodInfoDto paymentMethodInfoDto = this.paymentMethodInfo;
        int hashCode2 = (hashCode + (paymentMethodInfoDto == null ? 0 : paymentMethodInfoDto.hashCode())) * 31;
        Money money = this.money;
        int hashCode3 = (hashCode2 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.threshold;
        int hashCode4 = (hashCode3 + (money2 == null ? 0 : money2.hashCode())) * 31;
        AutoTopupWidgetDto.SwitchState switchState = this.switch;
        return hashCode4 + (switchState != null ? switchState.hashCode() : 0);
    }

    public String toString() {
        return "UpdateAutoTopupRequest(autoTopupId=" + this.autoTopupId + ", paymentMethodInfo=" + this.paymentMethodInfo + ", money=" + this.money + ", threshold=" + this.threshold + ", switch=" + this.switch + Extension.C_BRAKE;
    }
}
