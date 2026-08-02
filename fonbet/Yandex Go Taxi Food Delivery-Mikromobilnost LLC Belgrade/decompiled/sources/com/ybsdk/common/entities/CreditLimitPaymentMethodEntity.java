package com.ybsdk.common.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity;", "", ACSPConstants.STATUS, "Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$CreditLimitStatus;", "paymentMethod", "Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$PaymentMethod;", "<init>", "(Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$CreditLimitStatus;Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$PaymentMethod;)V", "getStatus", "()Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$CreditLimitStatus;", "getPaymentMethod", "()Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$PaymentMethod;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CreditLimitStatus", "PaymentMethod", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreditLimitPaymentMethodEntity {
    private final PaymentMethod paymentMethod;
    private final CreditLimitStatus status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$CreditLimitStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "CANCELED", "UNKNOWN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreditLimitStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CreditLimitStatus[] $VALUES;

        @Json(name = "success")
        public static final CreditLimitStatus SUCCESS = new CreditLimitStatus("SUCCESS", 0);

        @Json(name = "fail")
        public static final CreditLimitStatus FAIL = new CreditLimitStatus("FAIL", 1);

        @Json(name = "canceled")
        public static final CreditLimitStatus CANCELED = new CreditLimitStatus("CANCELED", 2);

        @Json(name = "unknown")
        public static final CreditLimitStatus UNKNOWN = new CreditLimitStatus("UNKNOWN", 3);

        private static final /* synthetic */ CreditLimitStatus[] $values() {
            return new CreditLimitStatus[]{SUCCESS, FAIL, CANCELED, UNKNOWN};
        }

        static {
            CreditLimitStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CreditLimitStatus(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static CreditLimitStatus valueOf(String str) {
            return (CreditLimitStatus) Enum.valueOf(CreditLimitStatus.class, str);
        }

        public static CreditLimitStatus[] values() {
            return (CreditLimitStatus[]) $VALUES.clone();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/common/entities/CreditLimitPaymentMethodEntity$PaymentMethod;", "", "paymentMethodType", "", "title", "logo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodType", "()Ljava/lang/String;", "getTitle", "getLogo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethod {
        private final String logo;
        private final String paymentMethodType;
        private final String title;

        public PaymentMethod(@Json(name = "paymentMethodType") String str, @Json(name = "title") String str2, @Json(name = "logo") String str3) {
            this.paymentMethodType = str;
            this.title = str2;
            this.logo = str3;
        }

        public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentMethod.paymentMethodType;
            }
            if ((i & 2) != 0) {
                str2 = paymentMethod.title;
            }
            if ((i & 4) != 0) {
                str3 = paymentMethod.logo;
            }
            return paymentMethod.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLogo() {
            return this.logo;
        }

        public final PaymentMethod copy(@Json(name = "paymentMethodType") String paymentMethodType, @Json(name = "title") String title, @Json(name = "logo") String logo) {
            return new PaymentMethod(paymentMethodType, title, logo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) other;
            return jl40.l(this.paymentMethodType, paymentMethod.paymentMethodType) && jl40.l(this.title, paymentMethod.title) && jl40.l(this.logo, paymentMethod.logo);
        }

        public final String getLogo() {
            return this.logo;
        }

        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.logo.hashCode() + unr0.b(this.paymentMethodType.hashCode() * 31, 31, this.title);
        }

        public String toString() {
            String str = this.paymentMethodType;
            String str2 = this.title;
            return oyr.t(b64.v("PaymentMethod(paymentMethodType=", str, ", title=", str2, ", logo="), this.logo, Extension.C_BRAKE);
        }
    }

    public CreditLimitPaymentMethodEntity(@Json(name = "status") CreditLimitStatus creditLimitStatus, @Json(name = "paymentMethod") PaymentMethod paymentMethod) {
        this.status = creditLimitStatus;
        this.paymentMethod = paymentMethod;
    }

    public static /* synthetic */ CreditLimitPaymentMethodEntity copy$default(CreditLimitPaymentMethodEntity creditLimitPaymentMethodEntity, CreditLimitStatus creditLimitStatus, PaymentMethod paymentMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            creditLimitStatus = creditLimitPaymentMethodEntity.status;
        }
        if ((i & 2) != 0) {
            paymentMethod = creditLimitPaymentMethodEntity.paymentMethod;
        }
        return creditLimitPaymentMethodEntity.copy(creditLimitStatus, paymentMethod);
    }

    /* renamed from: component1, reason: from getter */
    public final CreditLimitStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final CreditLimitPaymentMethodEntity copy(@Json(name = "status") CreditLimitStatus status, @Json(name = "paymentMethod") PaymentMethod paymentMethod) {
        return new CreditLimitPaymentMethodEntity(status, paymentMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPaymentMethodEntity)) {
            return false;
        }
        CreditLimitPaymentMethodEntity creditLimitPaymentMethodEntity = (CreditLimitPaymentMethodEntity) other;
        return this.status == creditLimitPaymentMethodEntity.status && jl40.l(this.paymentMethod, creditLimitPaymentMethodEntity.paymentMethod);
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final CreditLimitStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.paymentMethod.hashCode() + (this.status.hashCode() * 31);
    }

    public String toString() {
        return "CreditLimitPaymentMethodEntity(status=" + this.status + ", paymentMethod=" + this.paymentMethod + Extension.C_BRAKE;
    }
}
