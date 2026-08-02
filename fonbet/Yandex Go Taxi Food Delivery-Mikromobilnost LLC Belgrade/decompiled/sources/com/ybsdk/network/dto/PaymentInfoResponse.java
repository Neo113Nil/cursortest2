package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/network/dto/PaymentInfoResponse;", "", "paymentInfoDetails", "Lcom/ybsdk/network/dto/PaymentInfoDetails;", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/PaymentInfoResponse$Status;", "widgets", "", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto;", "<init>", "(Lcom/ybsdk/network/dto/PaymentInfoDetails;Lcom/ybsdk/network/dto/PaymentInfoResponse$Status;Ljava/util/List;)V", "getPaymentInfoDetails", "()Lcom/ybsdk/network/dto/PaymentInfoDetails;", "getStatus", "()Lcom/ybsdk/network/dto/PaymentInfoResponse$Status;", "getWidgets", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Status", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentInfoResponse {
    private final PaymentInfoDetails paymentInfoDetails;
    private final Status status;
    private final List<AutoTopupWidgetDto> widgets;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/network/dto/PaymentInfoResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "CREATED", "PROCESSING", "FAILED", "SUCCESS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status CREATED = new Status("CREATED", 0);
        public static final Status PROCESSING = new Status("PROCESSING", 1);
        public static final Status FAILED = new Status("FAILED", 2);
        public static final Status SUCCESS = new Status("SUCCESS", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{CREATED, PROCESSING, FAILED, SUCCESS};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public PaymentInfoResponse(@Json(name = "payment_info") PaymentInfoDetails paymentInfoDetails, @Json(name = "status") Status status, @Json(name = "widgets") List<AutoTopupWidgetDto> list) {
        this.paymentInfoDetails = paymentInfoDetails;
        this.status = status;
        this.widgets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentInfoResponse copy$default(PaymentInfoResponse paymentInfoResponse, PaymentInfoDetails paymentInfoDetails, Status status, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentInfoDetails = paymentInfoResponse.paymentInfoDetails;
        }
        if ((i & 2) != 0) {
            status = paymentInfoResponse.status;
        }
        if ((i & 4) != 0) {
            list = paymentInfoResponse.widgets;
        }
        return paymentInfoResponse.copy(paymentInfoDetails, status, list);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentInfoDetails getPaymentInfoDetails() {
        return this.paymentInfoDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final List<AutoTopupWidgetDto> component3() {
        return this.widgets;
    }

    public final PaymentInfoResponse copy(@Json(name = "payment_info") PaymentInfoDetails paymentInfoDetails, @Json(name = "status") Status status, @Json(name = "widgets") List<AutoTopupWidgetDto> widgets) {
        return new PaymentInfoResponse(paymentInfoDetails, status, widgets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInfoResponse)) {
            return false;
        }
        PaymentInfoResponse paymentInfoResponse = (PaymentInfoResponse) other;
        return jl40.l(this.paymentInfoDetails, paymentInfoResponse.paymentInfoDetails) && this.status == paymentInfoResponse.status && jl40.l(this.widgets, paymentInfoResponse.widgets);
    }

    public final PaymentInfoDetails getPaymentInfoDetails() {
        return this.paymentInfoDetails;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<AutoTopupWidgetDto> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + (this.paymentInfoDetails.hashCode() * 31)) * 31;
        List<AutoTopupWidgetDto> list = this.widgets;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        PaymentInfoDetails paymentInfoDetails = this.paymentInfoDetails;
        Status status = this.status;
        List<AutoTopupWidgetDto> list = this.widgets;
        StringBuilder sb = new StringBuilder("PaymentInfoResponse(paymentInfoDetails=");
        sb.append(paymentInfoDetails);
        sb.append(", status=");
        sb.append(status);
        sb.append(", widgets=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
