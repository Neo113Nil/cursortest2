package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.PaymentMethodDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDto;", "", "title", "", "buttonText", "paymentMethods", "", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getButtonText", "getPaymentMethods", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsNoticeDto {
    private final String buttonText;
    private final List<PaymentMethodDto> paymentMethods;
    private final String title;

    public SavingsNoticeDto(@Json(name = "title") String str, @Json(name = "button_text") String str2, @Json(name = "payment_methods_list") List<PaymentMethodDto> list) {
        this.title = str;
        this.buttonText = str2;
        this.paymentMethods = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavingsNoticeDto copy$default(SavingsNoticeDto savingsNoticeDto, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsNoticeDto.title;
        }
        if ((i & 2) != 0) {
            str2 = savingsNoticeDto.buttonText;
        }
        if ((i & 4) != 0) {
            list = savingsNoticeDto.paymentMethods;
        }
        return savingsNoticeDto.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    public final List<PaymentMethodDto> component3() {
        return this.paymentMethods;
    }

    public final SavingsNoticeDto copy(@Json(name = "title") String title, @Json(name = "button_text") String buttonText, @Json(name = "payment_methods_list") List<PaymentMethodDto> paymentMethods) {
        return new SavingsNoticeDto(title, buttonText, paymentMethods);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsNoticeDto)) {
            return false;
        }
        SavingsNoticeDto savingsNoticeDto = (SavingsNoticeDto) other;
        return jl40.l(this.title, savingsNoticeDto.title) && jl40.l(this.buttonText, savingsNoticeDto.buttonText) && jl40.l(this.paymentMethods, savingsNoticeDto.paymentMethods);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final List<PaymentMethodDto> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.paymentMethods.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.buttonText);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.buttonText;
        return ly3.s(b64.v("SavingsNoticeDto(title=", str, ", buttonText=", str2, ", paymentMethods="), this.paymentMethods, Extension.C_BRAKE);
    }
}
