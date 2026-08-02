package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SaveAutoTopupV2Request;", "", "paymentSource", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;", "paymentTarget", "autoPayments", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupV2PaymentInput;", "autotopupId", "", "hmacDeprecated", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getPaymentSource", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;", "getPaymentTarget", "getAutoPayments", "()Ljava/util/List;", "getAutotopupId", "()Ljava/lang/String;", "getHmacDeprecated", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveAutoTopupV2Request {
    private final List<AutoTopupV2PaymentInput> autoPayments;
    private final String autotopupId;
    private final HmacDto hmacDeprecated;
    private final AutoTopupPaymentParty paymentSource;
    private final AutoTopupPaymentParty paymentTarget;

    public SaveAutoTopupV2Request(@Json(name = "payment_source") AutoTopupPaymentParty autoTopupPaymentParty, @Json(name = "payment_target") AutoTopupPaymentParty autoTopupPaymentParty2, @Json(name = "auto_payments") List<AutoTopupV2PaymentInput> list, @Json(name = "autotopup_id") String str, @Json(name = "hmac_deprecated") HmacDto hmacDto) {
        this.paymentSource = autoTopupPaymentParty;
        this.paymentTarget = autoTopupPaymentParty2;
        this.autoPayments = list;
        this.autotopupId = str;
        this.hmacDeprecated = hmacDto;
    }

    public static /* synthetic */ SaveAutoTopupV2Request copy$default(SaveAutoTopupV2Request saveAutoTopupV2Request, AutoTopupPaymentParty autoTopupPaymentParty, AutoTopupPaymentParty autoTopupPaymentParty2, List list, String str, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupPaymentParty = saveAutoTopupV2Request.paymentSource;
        }
        if ((i & 2) != 0) {
            autoTopupPaymentParty2 = saveAutoTopupV2Request.paymentTarget;
        }
        if ((i & 4) != 0) {
            list = saveAutoTopupV2Request.autoPayments;
        }
        if ((i & 8) != 0) {
            str = saveAutoTopupV2Request.autotopupId;
        }
        if ((i & 16) != 0) {
            hmacDto = saveAutoTopupV2Request.hmacDeprecated;
        }
        HmacDto hmacDto2 = hmacDto;
        List list2 = list;
        return saveAutoTopupV2Request.copy(autoTopupPaymentParty, autoTopupPaymentParty2, list2, str, hmacDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupPaymentParty getPaymentSource() {
        return this.paymentSource;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoTopupPaymentParty getPaymentTarget() {
        return this.paymentTarget;
    }

    public final List<AutoTopupV2PaymentInput> component3() {
        return this.autoPayments;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAutotopupId() {
        return this.autotopupId;
    }

    /* renamed from: component5, reason: from getter */
    public final HmacDto getHmacDeprecated() {
        return this.hmacDeprecated;
    }

    public final SaveAutoTopupV2Request copy(@Json(name = "payment_source") AutoTopupPaymentParty paymentSource, @Json(name = "payment_target") AutoTopupPaymentParty paymentTarget, @Json(name = "auto_payments") List<AutoTopupV2PaymentInput> autoPayments, @Json(name = "autotopup_id") String autotopupId, @Json(name = "hmac_deprecated") HmacDto hmacDeprecated) {
        return new SaveAutoTopupV2Request(paymentSource, paymentTarget, autoPayments, autotopupId, hmacDeprecated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveAutoTopupV2Request)) {
            return false;
        }
        SaveAutoTopupV2Request saveAutoTopupV2Request = (SaveAutoTopupV2Request) other;
        return jl40.l(this.paymentSource, saveAutoTopupV2Request.paymentSource) && jl40.l(this.paymentTarget, saveAutoTopupV2Request.paymentTarget) && jl40.l(this.autoPayments, saveAutoTopupV2Request.autoPayments) && jl40.l(this.autotopupId, saveAutoTopupV2Request.autotopupId) && jl40.l(this.hmacDeprecated, saveAutoTopupV2Request.hmacDeprecated);
    }

    public final List<AutoTopupV2PaymentInput> getAutoPayments() {
        return this.autoPayments;
    }

    public final String getAutotopupId() {
        return this.autotopupId;
    }

    public final HmacDto getHmacDeprecated() {
        return this.hmacDeprecated;
    }

    public final AutoTopupPaymentParty getPaymentSource() {
        return this.paymentSource;
    }

    public final AutoTopupPaymentParty getPaymentTarget() {
        return this.paymentTarget;
    }

    public int hashCode() {
        int c = unr0.c((this.paymentTarget.hashCode() + (this.paymentSource.hashCode() * 31)) * 31, 31, this.autoPayments);
        String str = this.autotopupId;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        HmacDto hmacDto = this.hmacDeprecated;
        return hashCode + (hmacDto != null ? hmacDto.hashCode() : 0);
    }

    public String toString() {
        AutoTopupPaymentParty autoTopupPaymentParty = this.paymentSource;
        AutoTopupPaymentParty autoTopupPaymentParty2 = this.paymentTarget;
        List<AutoTopupV2PaymentInput> list = this.autoPayments;
        String str = this.autotopupId;
        HmacDto hmacDto = this.hmacDeprecated;
        StringBuilder sb = new StringBuilder("SaveAutoTopupV2Request(paymentSource=");
        sb.append(autoTopupPaymentParty);
        sb.append(", paymentTarget=");
        sb.append(autoTopupPaymentParty2);
        sb.append(", autoPayments=");
        oyr.D(", autotopupId=", str, ", hmacDeprecated=", sb, list);
        sb.append(hmacDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
