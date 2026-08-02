package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters;", "", "availability", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters$FilterAvailability;", "paymentAmount", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters$FilterPaymentAmount;", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters$FilterAvailability;Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters$FilterPaymentAmount;)V", "getAvailability", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters$FilterAvailability;", "getPaymentAmount", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters$FilterPaymentAmount;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FilterAvailability", "FilterPaymentAmount", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPlansFilters {
    private final FilterAvailability availability;
    private final FilterPaymentAmount paymentAmount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters$FilterAvailability;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "UNLOCKED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterAvailability {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FilterAvailability[] $VALUES;
        public static final FilterAvailability ALL = new FilterAvailability("ALL", 0);
        public static final FilterAvailability UNLOCKED = new FilterAvailability("UNLOCKED", 1);

        private static final /* synthetic */ FilterAvailability[] $values() {
            return new FilterAvailability[]{ALL, UNLOCKED};
        }

        static {
            FilterAvailability[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private FilterAvailability(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FilterAvailability valueOf(String str) {
            return (FilterAvailability) Enum.valueOf(FilterAvailability.class, str);
        }

        public static FilterAvailability[] values() {
            return (FilterAvailability[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters$FilterPaymentAmount;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "EQUAL_AMOUNT", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterPaymentAmount {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FilterPaymentAmount[] $VALUES;
        public static final FilterPaymentAmount ALL = new FilterPaymentAmount("ALL", 0);
        public static final FilterPaymentAmount EQUAL_AMOUNT = new FilterPaymentAmount("EQUAL_AMOUNT", 1);

        private static final /* synthetic */ FilterPaymentAmount[] $values() {
            return new FilterPaymentAmount[]{ALL, EQUAL_AMOUNT};
        }

        static {
            FilterPaymentAmount[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private FilterPaymentAmount(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FilterPaymentAmount valueOf(String str) {
            return (FilterPaymentAmount) Enum.valueOf(FilterPaymentAmount.class, str);
        }

        public static FilterPaymentAmount[] values() {
            return (FilterPaymentAmount[]) $VALUES.clone();
        }
    }

    public CreditLimitPlansFilters(@Json(name = "availability") FilterAvailability filterAvailability, @Json(name = "payments_amount") FilterPaymentAmount filterPaymentAmount) {
        this.availability = filterAvailability;
        this.paymentAmount = filterPaymentAmount;
    }

    public static /* synthetic */ CreditLimitPlansFilters copy$default(CreditLimitPlansFilters creditLimitPlansFilters, FilterAvailability filterAvailability, FilterPaymentAmount filterPaymentAmount, int i, Object obj) {
        if ((i & 1) != 0) {
            filterAvailability = creditLimitPlansFilters.availability;
        }
        if ((i & 2) != 0) {
            filterPaymentAmount = creditLimitPlansFilters.paymentAmount;
        }
        return creditLimitPlansFilters.copy(filterAvailability, filterPaymentAmount);
    }

    /* renamed from: component1, reason: from getter */
    public final FilterAvailability getAvailability() {
        return this.availability;
    }

    /* renamed from: component2, reason: from getter */
    public final FilterPaymentAmount getPaymentAmount() {
        return this.paymentAmount;
    }

    public final CreditLimitPlansFilters copy(@Json(name = "availability") FilterAvailability availability, @Json(name = "payments_amount") FilterPaymentAmount paymentAmount) {
        return new CreditLimitPlansFilters(availability, paymentAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPlansFilters)) {
            return false;
        }
        CreditLimitPlansFilters creditLimitPlansFilters = (CreditLimitPlansFilters) other;
        return this.availability == creditLimitPlansFilters.availability && this.paymentAmount == creditLimitPlansFilters.paymentAmount;
    }

    public final FilterAvailability getAvailability() {
        return this.availability;
    }

    public final FilterPaymentAmount getPaymentAmount() {
        return this.paymentAmount;
    }

    public int hashCode() {
        return this.paymentAmount.hashCode() + (this.availability.hashCode() * 31);
    }

    public String toString() {
        return "CreditLimitPlansFilters(availability=" + this.availability + ", paymentAmount=" + this.paymentAmount + Extension.C_BRAKE;
    }
}
