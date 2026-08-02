package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentsSaveRequest;", "", "paymentSource", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto;", "paymentTarget", "autoPaymentsSettings", "", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInputDto;", "<init>", "(Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto;Ljava/util/List;)V", "getPaymentSource", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto;", "getPaymentTarget", "getAutoPaymentsSettings", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoPaymentsSaveRequest {
    private final List<AutoPaymentInputDto> autoPaymentsSettings;
    private final PaymentPartyDto paymentSource;
    private final PaymentPartyDto paymentTarget;

    public AutoPaymentsSaveRequest(@Json(name = "payment_source") PaymentPartyDto paymentPartyDto, @Json(name = "payment_target") PaymentPartyDto paymentPartyDto2, @Json(name = "auto_payments_settings") List<AutoPaymentInputDto> list) {
        this.paymentSource = paymentPartyDto;
        this.paymentTarget = paymentPartyDto2;
        this.autoPaymentsSettings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoPaymentsSaveRequest copy$default(AutoPaymentsSaveRequest autoPaymentsSaveRequest, PaymentPartyDto paymentPartyDto, PaymentPartyDto paymentPartyDto2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentPartyDto = autoPaymentsSaveRequest.paymentSource;
        }
        if ((i & 2) != 0) {
            paymentPartyDto2 = autoPaymentsSaveRequest.paymentTarget;
        }
        if ((i & 4) != 0) {
            list = autoPaymentsSaveRequest.autoPaymentsSettings;
        }
        return autoPaymentsSaveRequest.copy(paymentPartyDto, paymentPartyDto2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentPartyDto getPaymentSource() {
        return this.paymentSource;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentPartyDto getPaymentTarget() {
        return this.paymentTarget;
    }

    public final List<AutoPaymentInputDto> component3() {
        return this.autoPaymentsSettings;
    }

    public final AutoPaymentsSaveRequest copy(@Json(name = "payment_source") PaymentPartyDto paymentSource, @Json(name = "payment_target") PaymentPartyDto paymentTarget, @Json(name = "auto_payments_settings") List<AutoPaymentInputDto> autoPaymentsSettings) {
        return new AutoPaymentsSaveRequest(paymentSource, paymentTarget, autoPaymentsSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoPaymentsSaveRequest)) {
            return false;
        }
        AutoPaymentsSaveRequest autoPaymentsSaveRequest = (AutoPaymentsSaveRequest) other;
        return jl40.l(this.paymentSource, autoPaymentsSaveRequest.paymentSource) && jl40.l(this.paymentTarget, autoPaymentsSaveRequest.paymentTarget) && jl40.l(this.autoPaymentsSettings, autoPaymentsSaveRequest.autoPaymentsSettings);
    }

    public final List<AutoPaymentInputDto> getAutoPaymentsSettings() {
        return this.autoPaymentsSettings;
    }

    public final PaymentPartyDto getPaymentSource() {
        return this.paymentSource;
    }

    public final PaymentPartyDto getPaymentTarget() {
        return this.paymentTarget;
    }

    public int hashCode() {
        return this.autoPaymentsSettings.hashCode() + ((this.paymentTarget.hashCode() + (this.paymentSource.hashCode() * 31)) * 31);
    }

    public String toString() {
        PaymentPartyDto paymentPartyDto = this.paymentSource;
        PaymentPartyDto paymentPartyDto2 = this.paymentTarget;
        List<AutoPaymentInputDto> list = this.autoPaymentsSettings;
        StringBuilder sb = new StringBuilder("AutoPaymentsSaveRequest(paymentSource=");
        sb.append(paymentPartyDto);
        sb.append(", paymentTarget=");
        sb.append(paymentPartyDto2);
        sb.append(", autoPaymentsSettings=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
