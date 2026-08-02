package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/network/dto/CheckPaymentResponse;", "", "resolution", "Lcom/ybsdk/network/dto/CheckPaymentResponse$PaymentResolution;", "conditions", "Lcom/ybsdk/network/dto/CheckPaymentResponse$PaymentConditions;", "<init>", "(Lcom/ybsdk/network/dto/CheckPaymentResponse$PaymentResolution;Lcom/ybsdk/network/dto/CheckPaymentResponse$PaymentConditions;)V", "getResolution", "()Lcom/ybsdk/network/dto/CheckPaymentResponse$PaymentResolution;", "getConditions", "()Lcom/ybsdk/network/dto/CheckPaymentResponse$PaymentConditions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentResolution", "PaymentConditions", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckPaymentResponse {
    private final PaymentConditions conditions;
    private final PaymentResolution resolution;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/network/dto/CheckPaymentResponse$PaymentConditions;", "", "<init>", "(Ljava/lang/String;I)V", "TOPUP", "IDENTIFICATION", "KYC", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PaymentConditions {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentConditions[] $VALUES;
        public static final PaymentConditions TOPUP = new PaymentConditions("TOPUP", 0);
        public static final PaymentConditions IDENTIFICATION = new PaymentConditions("IDENTIFICATION", 1);
        public static final PaymentConditions KYC = new PaymentConditions("KYC", 2);

        private static final /* synthetic */ PaymentConditions[] $values() {
            return new PaymentConditions[]{TOPUP, IDENTIFICATION, KYC};
        }

        static {
            PaymentConditions[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PaymentConditions(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PaymentConditions valueOf(String str) {
            return (PaymentConditions) Enum.valueOf(PaymentConditions.class, str);
        }

        public static PaymentConditions[] values() {
            return (PaymentConditions[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/network/dto/CheckPaymentResponse$PaymentResolution;", "", "<init>", "(Ljava/lang/String;I)V", "DENIED", "ALLOWED", "CONDITIONS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PaymentResolution {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentResolution[] $VALUES;
        public static final PaymentResolution DENIED = new PaymentResolution("DENIED", 0);
        public static final PaymentResolution ALLOWED = new PaymentResolution("ALLOWED", 1);
        public static final PaymentResolution CONDITIONS = new PaymentResolution("CONDITIONS", 2);

        private static final /* synthetic */ PaymentResolution[] $values() {
            return new PaymentResolution[]{DENIED, ALLOWED, CONDITIONS};
        }

        static {
            PaymentResolution[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PaymentResolution(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PaymentResolution valueOf(String str) {
            return (PaymentResolution) Enum.valueOf(PaymentResolution.class, str);
        }

        public static PaymentResolution[] values() {
            return (PaymentResolution[]) $VALUES.clone();
        }
    }

    public CheckPaymentResponse(@Json(name = "resolution") PaymentResolution paymentResolution, @Json(name = "condition") PaymentConditions paymentConditions) {
        this.resolution = paymentResolution;
        this.conditions = paymentConditions;
    }

    public static /* synthetic */ CheckPaymentResponse copy$default(CheckPaymentResponse checkPaymentResponse, PaymentResolution paymentResolution, PaymentConditions paymentConditions, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentResolution = checkPaymentResponse.resolution;
        }
        if ((i & 2) != 0) {
            paymentConditions = checkPaymentResponse.conditions;
        }
        return checkPaymentResponse.copy(paymentResolution, paymentConditions);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentResolution getResolution() {
        return this.resolution;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentConditions getConditions() {
        return this.conditions;
    }

    public final CheckPaymentResponse copy(@Json(name = "resolution") PaymentResolution resolution, @Json(name = "condition") PaymentConditions conditions) {
        return new CheckPaymentResponse(resolution, conditions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPaymentResponse)) {
            return false;
        }
        CheckPaymentResponse checkPaymentResponse = (CheckPaymentResponse) other;
        return this.resolution == checkPaymentResponse.resolution && this.conditions == checkPaymentResponse.conditions;
    }

    public final PaymentConditions getConditions() {
        return this.conditions;
    }

    public final PaymentResolution getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        int hashCode = this.resolution.hashCode() * 31;
        PaymentConditions paymentConditions = this.conditions;
        return hashCode + (paymentConditions == null ? 0 : paymentConditions.hashCode());
    }

    public String toString() {
        return "CheckPaymentResponse(resolution=" + this.resolution + ", conditions=" + this.conditions + Extension.C_BRAKE;
    }
}
