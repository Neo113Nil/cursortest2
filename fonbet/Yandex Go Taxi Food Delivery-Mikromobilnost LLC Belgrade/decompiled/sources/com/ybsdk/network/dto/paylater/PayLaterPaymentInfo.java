package com.ybsdk.network.dto.paylater;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/network/dto/paylater/PayLaterPaymentInfo;", "", "paymentAmount", "", "paymentDate", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;)V", "getPaymentAmount", "()Ljava/lang/String;", "getPaymentDate", "getDescription", "()Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PayLaterPaymentInfo {
    private final ColoredTextDto description;
    private final String paymentAmount;
    private final String paymentDate;

    public PayLaterPaymentInfo(@Json(name = "amount") String str, @Json(name = "payment_date") String str2, @Json(name = "description") ColoredTextDto coloredTextDto) {
        this.paymentAmount = str;
        this.paymentDate = str2;
        this.description = coloredTextDto;
    }

    public static /* synthetic */ PayLaterPaymentInfo copy$default(PayLaterPaymentInfo payLaterPaymentInfo, String str, String str2, ColoredTextDto coloredTextDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payLaterPaymentInfo.paymentAmount;
        }
        if ((i & 2) != 0) {
            str2 = payLaterPaymentInfo.paymentDate;
        }
        if ((i & 4) != 0) {
            coloredTextDto = payLaterPaymentInfo.description;
        }
        return payLaterPaymentInfo.copy(str, str2, coloredTextDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentDate() {
        return this.paymentDate;
    }

    /* renamed from: component3, reason: from getter */
    public final ColoredTextDto getDescription() {
        return this.description;
    }

    public final PayLaterPaymentInfo copy(@Json(name = "amount") String paymentAmount, @Json(name = "payment_date") String paymentDate, @Json(name = "description") ColoredTextDto description) {
        return new PayLaterPaymentInfo(paymentAmount, paymentDate, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayLaterPaymentInfo)) {
            return false;
        }
        PayLaterPaymentInfo payLaterPaymentInfo = (PayLaterPaymentInfo) other;
        return jl40.l(this.paymentAmount, payLaterPaymentInfo.paymentAmount) && jl40.l(this.paymentDate, payLaterPaymentInfo.paymentDate) && jl40.l(this.description, payLaterPaymentInfo.description);
    }

    public final ColoredTextDto getDescription() {
        return this.description;
    }

    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    public final String getPaymentDate() {
        return this.paymentDate;
    }

    public int hashCode() {
        int b = unr0.b(this.paymentAmount.hashCode() * 31, 31, this.paymentDate);
        ColoredTextDto coloredTextDto = this.description;
        return b + (coloredTextDto == null ? 0 : coloredTextDto.hashCode());
    }

    public String toString() {
        String str = this.paymentAmount;
        String str2 = this.paymentDate;
        ColoredTextDto coloredTextDto = this.description;
        StringBuilder v = b64.v("PayLaterPaymentInfo(paymentAmount=", str, ", paymentDate=", str2, ", description=");
        v.append(coloredTextDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ PayLaterPaymentInfo(String str, String str2, ColoredTextDto coloredTextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : coloredTextDto);
    }
}
