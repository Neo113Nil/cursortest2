package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/ValidateAutoTopupV2Request;", "", "paymentSource", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;", "paymentTarget", "autoPayment", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentInfo;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentInfo;)V", "getPaymentSource", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;", "getPaymentTarget", "getAutoPayment", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ValidateAutoTopupV2Request {
    private final AutoTopupPaymentInfo autoPayment;
    private final AutoTopupPaymentParty paymentSource;
    private final AutoTopupPaymentParty paymentTarget;

    public ValidateAutoTopupV2Request(@Json(name = "payment_source") AutoTopupPaymentParty autoTopupPaymentParty, @Json(name = "payment_target") AutoTopupPaymentParty autoTopupPaymentParty2, @Json(name = "auto_payment") AutoTopupPaymentInfo autoTopupPaymentInfo) {
        this.paymentSource = autoTopupPaymentParty;
        this.paymentTarget = autoTopupPaymentParty2;
        this.autoPayment = autoTopupPaymentInfo;
    }

    public static /* synthetic */ ValidateAutoTopupV2Request copy$default(ValidateAutoTopupV2Request validateAutoTopupV2Request, AutoTopupPaymentParty autoTopupPaymentParty, AutoTopupPaymentParty autoTopupPaymentParty2, AutoTopupPaymentInfo autoTopupPaymentInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupPaymentParty = validateAutoTopupV2Request.paymentSource;
        }
        if ((i & 2) != 0) {
            autoTopupPaymentParty2 = validateAutoTopupV2Request.paymentTarget;
        }
        if ((i & 4) != 0) {
            autoTopupPaymentInfo = validateAutoTopupV2Request.autoPayment;
        }
        return validateAutoTopupV2Request.copy(autoTopupPaymentParty, autoTopupPaymentParty2, autoTopupPaymentInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupPaymentParty getPaymentSource() {
        return this.paymentSource;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoTopupPaymentParty getPaymentTarget() {
        return this.paymentTarget;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoTopupPaymentInfo getAutoPayment() {
        return this.autoPayment;
    }

    public final ValidateAutoTopupV2Request copy(@Json(name = "payment_source") AutoTopupPaymentParty paymentSource, @Json(name = "payment_target") AutoTopupPaymentParty paymentTarget, @Json(name = "auto_payment") AutoTopupPaymentInfo autoPayment) {
        return new ValidateAutoTopupV2Request(paymentSource, paymentTarget, autoPayment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateAutoTopupV2Request)) {
            return false;
        }
        ValidateAutoTopupV2Request validateAutoTopupV2Request = (ValidateAutoTopupV2Request) other;
        return jl40.l(this.paymentSource, validateAutoTopupV2Request.paymentSource) && jl40.l(this.paymentTarget, validateAutoTopupV2Request.paymentTarget) && jl40.l(this.autoPayment, validateAutoTopupV2Request.autoPayment);
    }

    public final AutoTopupPaymentInfo getAutoPayment() {
        return this.autoPayment;
    }

    public final AutoTopupPaymentParty getPaymentSource() {
        return this.paymentSource;
    }

    public final AutoTopupPaymentParty getPaymentTarget() {
        return this.paymentTarget;
    }

    public int hashCode() {
        return this.autoPayment.hashCode() + ((this.paymentTarget.hashCode() + (this.paymentSource.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "ValidateAutoTopupV2Request(paymentSource=" + this.paymentSource + ", paymentTarget=" + this.paymentTarget + ", autoPayment=" + this.autoPayment + Extension.C_BRAKE;
    }
}
