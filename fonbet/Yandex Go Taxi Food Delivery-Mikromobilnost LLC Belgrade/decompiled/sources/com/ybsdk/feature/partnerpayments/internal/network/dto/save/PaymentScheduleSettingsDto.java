package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentScheduleSettingsDto;", "", "type", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentScheduleSettingsDto$PaymentScheduleType;", "weekly", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/WeeklyPaymentScheduleSettingsDto;", "monthly", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/MonthlyPaymentScheduleSettingsDto;", "<init>", "(Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentScheduleSettingsDto$PaymentScheduleType;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/WeeklyPaymentScheduleSettingsDto;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/MonthlyPaymentScheduleSettingsDto;)V", "getType", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentScheduleSettingsDto$PaymentScheduleType;", "getWeekly", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/WeeklyPaymentScheduleSettingsDto;", "getMonthly", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/MonthlyPaymentScheduleSettingsDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentScheduleType", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentScheduleSettingsDto {
    private final MonthlyPaymentScheduleSettingsDto monthly;
    private final PaymentScheduleType type;
    private final WeeklyPaymentScheduleSettingsDto weekly;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentScheduleSettingsDto$PaymentScheduleType;", "", "<init>", "(Ljava/lang/String;I)V", "WEEKLY", "MONTHLY", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentScheduleType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentScheduleType[] $VALUES;
        public static final PaymentScheduleType WEEKLY = new PaymentScheduleType("WEEKLY", 0);
        public static final PaymentScheduleType MONTHLY = new PaymentScheduleType("MONTHLY", 1);

        private static final /* synthetic */ PaymentScheduleType[] $values() {
            return new PaymentScheduleType[]{WEEKLY, MONTHLY};
        }

        static {
            PaymentScheduleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PaymentScheduleType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PaymentScheduleType valueOf(String str) {
            return (PaymentScheduleType) Enum.valueOf(PaymentScheduleType.class, str);
        }

        public static PaymentScheduleType[] values() {
            return (PaymentScheduleType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PaymentScheduleSettingsDto(PaymentScheduleType paymentScheduleType, WeeklyPaymentScheduleSettingsDto weeklyPaymentScheduleSettingsDto, MonthlyPaymentScheduleSettingsDto monthlyPaymentScheduleSettingsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentScheduleType, (i & 2) != 0 ? null : weeklyPaymentScheduleSettingsDto, (i & 4) != 0 ? null : monthlyPaymentScheduleSettingsDto);
    }

    public static /* synthetic */ PaymentScheduleSettingsDto copy$default(PaymentScheduleSettingsDto paymentScheduleSettingsDto, PaymentScheduleType paymentScheduleType, WeeklyPaymentScheduleSettingsDto weeklyPaymentScheduleSettingsDto, MonthlyPaymentScheduleSettingsDto monthlyPaymentScheduleSettingsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentScheduleType = paymentScheduleSettingsDto.type;
        }
        if ((i & 2) != 0) {
            weeklyPaymentScheduleSettingsDto = paymentScheduleSettingsDto.weekly;
        }
        if ((i & 4) != 0) {
            monthlyPaymentScheduleSettingsDto = paymentScheduleSettingsDto.monthly;
        }
        return paymentScheduleSettingsDto.copy(paymentScheduleType, weeklyPaymentScheduleSettingsDto, monthlyPaymentScheduleSettingsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentScheduleType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final WeeklyPaymentScheduleSettingsDto getWeekly() {
        return this.weekly;
    }

    /* renamed from: component3, reason: from getter */
    public final MonthlyPaymentScheduleSettingsDto getMonthly() {
        return this.monthly;
    }

    public final PaymentScheduleSettingsDto copy(@Json(name = "type") PaymentScheduleType type, @Json(name = "weekly") WeeklyPaymentScheduleSettingsDto weekly, @Json(name = "monthly") MonthlyPaymentScheduleSettingsDto monthly) {
        return new PaymentScheduleSettingsDto(type, weekly, monthly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentScheduleSettingsDto)) {
            return false;
        }
        PaymentScheduleSettingsDto paymentScheduleSettingsDto = (PaymentScheduleSettingsDto) other;
        return this.type == paymentScheduleSettingsDto.type && jl40.l(this.weekly, paymentScheduleSettingsDto.weekly) && jl40.l(this.monthly, paymentScheduleSettingsDto.monthly);
    }

    public final MonthlyPaymentScheduleSettingsDto getMonthly() {
        return this.monthly;
    }

    public final PaymentScheduleType getType() {
        return this.type;
    }

    public final WeeklyPaymentScheduleSettingsDto getWeekly() {
        return this.weekly;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        WeeklyPaymentScheduleSettingsDto weeklyPaymentScheduleSettingsDto = this.weekly;
        int hashCode2 = (hashCode + (weeklyPaymentScheduleSettingsDto == null ? 0 : weeklyPaymentScheduleSettingsDto.hashCode())) * 31;
        MonthlyPaymentScheduleSettingsDto monthlyPaymentScheduleSettingsDto = this.monthly;
        return hashCode2 + (monthlyPaymentScheduleSettingsDto != null ? monthlyPaymentScheduleSettingsDto.hashCode() : 0);
    }

    public String toString() {
        return "PaymentScheduleSettingsDto(type=" + this.type + ", weekly=" + this.weekly + ", monthly=" + this.monthly + Extension.C_BRAKE;
    }

    public PaymentScheduleSettingsDto(@Json(name = "type") PaymentScheduleType paymentScheduleType, @Json(name = "weekly") WeeklyPaymentScheduleSettingsDto weeklyPaymentScheduleSettingsDto, @Json(name = "monthly") MonthlyPaymentScheduleSettingsDto monthlyPaymentScheduleSettingsDto) {
        this.type = paymentScheduleType;
        this.weekly = weeklyPaymentScheduleSettingsDto;
        this.monthly = monthlyPaymentScheduleSettingsDto;
    }
}
