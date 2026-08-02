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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001%BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDto;", "", "selectedAutoPaymentSetting", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDto$AutoPaymentSettingsType;", "upToBalance", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/UpToBalanceSettingsDto;", "autofund", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoFundSettingsDto;", "rounding", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/RoundingSettingsDto;", "periodicPayment", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PeriodicPaymentSettingsDto;", "<init>", "(Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDto$AutoPaymentSettingsType;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/UpToBalanceSettingsDto;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoFundSettingsDto;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/RoundingSettingsDto;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PeriodicPaymentSettingsDto;)V", "getSelectedAutoPaymentSetting", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDto$AutoPaymentSettingsType;", "getUpToBalance", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/UpToBalanceSettingsDto;", "getAutofund", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoFundSettingsDto;", "getRounding", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/RoundingSettingsDto;", "getPeriodicPayment", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PeriodicPaymentSettingsDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AutoPaymentSettingsType", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoPaymentSettingsDto {
    private final AutoFundSettingsDto autofund;
    private final PeriodicPaymentSettingsDto periodicPayment;
    private final RoundingSettingsDto rounding;
    private final AutoPaymentSettingsType selectedAutoPaymentSetting;
    private final UpToBalanceSettingsDto upToBalance;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDto$AutoPaymentSettingsType;", "", "<init>", "(Ljava/lang/String;I)V", "UP_TO_BALANCE", "AUTOFUND", "ROUNDING", "PERIODIC", "EXTERNAL_SOURCE_PAYMENT", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AutoPaymentSettingsType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AutoPaymentSettingsType[] $VALUES;
        public static final AutoPaymentSettingsType UP_TO_BALANCE = new AutoPaymentSettingsType("UP_TO_BALANCE", 0);
        public static final AutoPaymentSettingsType AUTOFUND = new AutoPaymentSettingsType("AUTOFUND", 1);
        public static final AutoPaymentSettingsType ROUNDING = new AutoPaymentSettingsType("ROUNDING", 2);
        public static final AutoPaymentSettingsType PERIODIC = new AutoPaymentSettingsType("PERIODIC", 3);
        public static final AutoPaymentSettingsType EXTERNAL_SOURCE_PAYMENT = new AutoPaymentSettingsType("EXTERNAL_SOURCE_PAYMENT", 4);

        private static final /* synthetic */ AutoPaymentSettingsType[] $values() {
            return new AutoPaymentSettingsType[]{UP_TO_BALANCE, AUTOFUND, ROUNDING, PERIODIC, EXTERNAL_SOURCE_PAYMENT};
        }

        static {
            AutoPaymentSettingsType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private AutoPaymentSettingsType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static AutoPaymentSettingsType valueOf(String str) {
            return (AutoPaymentSettingsType) Enum.valueOf(AutoPaymentSettingsType.class, str);
        }

        public static AutoPaymentSettingsType[] values() {
            return (AutoPaymentSettingsType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AutoPaymentSettingsDto(AutoPaymentSettingsType autoPaymentSettingsType, UpToBalanceSettingsDto upToBalanceSettingsDto, AutoFundSettingsDto autoFundSettingsDto, RoundingSettingsDto roundingSettingsDto, PeriodicPaymentSettingsDto periodicPaymentSettingsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(autoPaymentSettingsType, (i & 2) != 0 ? null : upToBalanceSettingsDto, (i & 4) != 0 ? null : autoFundSettingsDto, (i & 8) != 0 ? null : roundingSettingsDto, (i & 16) != 0 ? null : periodicPaymentSettingsDto);
    }

    public static /* synthetic */ AutoPaymentSettingsDto copy$default(AutoPaymentSettingsDto autoPaymentSettingsDto, AutoPaymentSettingsType autoPaymentSettingsType, UpToBalanceSettingsDto upToBalanceSettingsDto, AutoFundSettingsDto autoFundSettingsDto, RoundingSettingsDto roundingSettingsDto, PeriodicPaymentSettingsDto periodicPaymentSettingsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            autoPaymentSettingsType = autoPaymentSettingsDto.selectedAutoPaymentSetting;
        }
        if ((i & 2) != 0) {
            upToBalanceSettingsDto = autoPaymentSettingsDto.upToBalance;
        }
        if ((i & 4) != 0) {
            autoFundSettingsDto = autoPaymentSettingsDto.autofund;
        }
        if ((i & 8) != 0) {
            roundingSettingsDto = autoPaymentSettingsDto.rounding;
        }
        if ((i & 16) != 0) {
            periodicPaymentSettingsDto = autoPaymentSettingsDto.periodicPayment;
        }
        PeriodicPaymentSettingsDto periodicPaymentSettingsDto2 = periodicPaymentSettingsDto;
        AutoFundSettingsDto autoFundSettingsDto2 = autoFundSettingsDto;
        return autoPaymentSettingsDto.copy(autoPaymentSettingsType, upToBalanceSettingsDto, autoFundSettingsDto2, roundingSettingsDto, periodicPaymentSettingsDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoPaymentSettingsType getSelectedAutoPaymentSetting() {
        return this.selectedAutoPaymentSetting;
    }

    /* renamed from: component2, reason: from getter */
    public final UpToBalanceSettingsDto getUpToBalance() {
        return this.upToBalance;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoFundSettingsDto getAutofund() {
        return this.autofund;
    }

    /* renamed from: component4, reason: from getter */
    public final RoundingSettingsDto getRounding() {
        return this.rounding;
    }

    /* renamed from: component5, reason: from getter */
    public final PeriodicPaymentSettingsDto getPeriodicPayment() {
        return this.periodicPayment;
    }

    public final AutoPaymentSettingsDto copy(@Json(name = "selected_auto_payment_setting") AutoPaymentSettingsType selectedAutoPaymentSetting, @Json(name = "up_to_balance") UpToBalanceSettingsDto upToBalance, @Json(name = "autofund") AutoFundSettingsDto autofund, @Json(name = "rounding") RoundingSettingsDto rounding, @Json(name = "periodic_payment") PeriodicPaymentSettingsDto periodicPayment) {
        return new AutoPaymentSettingsDto(selectedAutoPaymentSetting, upToBalance, autofund, rounding, periodicPayment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoPaymentSettingsDto)) {
            return false;
        }
        AutoPaymentSettingsDto autoPaymentSettingsDto = (AutoPaymentSettingsDto) other;
        return this.selectedAutoPaymentSetting == autoPaymentSettingsDto.selectedAutoPaymentSetting && jl40.l(this.upToBalance, autoPaymentSettingsDto.upToBalance) && jl40.l(this.autofund, autoPaymentSettingsDto.autofund) && jl40.l(this.rounding, autoPaymentSettingsDto.rounding) && jl40.l(this.periodicPayment, autoPaymentSettingsDto.periodicPayment);
    }

    public final AutoFundSettingsDto getAutofund() {
        return this.autofund;
    }

    public final PeriodicPaymentSettingsDto getPeriodicPayment() {
        return this.periodicPayment;
    }

    public final RoundingSettingsDto getRounding() {
        return this.rounding;
    }

    public final AutoPaymentSettingsType getSelectedAutoPaymentSetting() {
        return this.selectedAutoPaymentSetting;
    }

    public final UpToBalanceSettingsDto getUpToBalance() {
        return this.upToBalance;
    }

    public int hashCode() {
        int hashCode = this.selectedAutoPaymentSetting.hashCode() * 31;
        UpToBalanceSettingsDto upToBalanceSettingsDto = this.upToBalance;
        int hashCode2 = (hashCode + (upToBalanceSettingsDto == null ? 0 : upToBalanceSettingsDto.hashCode())) * 31;
        AutoFundSettingsDto autoFundSettingsDto = this.autofund;
        int hashCode3 = (hashCode2 + (autoFundSettingsDto == null ? 0 : autoFundSettingsDto.hashCode())) * 31;
        RoundingSettingsDto roundingSettingsDto = this.rounding;
        int hashCode4 = (hashCode3 + (roundingSettingsDto == null ? 0 : roundingSettingsDto.hashCode())) * 31;
        PeriodicPaymentSettingsDto periodicPaymentSettingsDto = this.periodicPayment;
        return hashCode4 + (periodicPaymentSettingsDto != null ? periodicPaymentSettingsDto.hashCode() : 0);
    }

    public String toString() {
        return "AutoPaymentSettingsDto(selectedAutoPaymentSetting=" + this.selectedAutoPaymentSetting + ", upToBalance=" + this.upToBalance + ", autofund=" + this.autofund + ", rounding=" + this.rounding + ", periodicPayment=" + this.periodicPayment + Extension.C_BRAKE;
    }

    public AutoPaymentSettingsDto(@Json(name = "selected_auto_payment_setting") AutoPaymentSettingsType autoPaymentSettingsType, @Json(name = "up_to_balance") UpToBalanceSettingsDto upToBalanceSettingsDto, @Json(name = "autofund") AutoFundSettingsDto autoFundSettingsDto, @Json(name = "rounding") RoundingSettingsDto roundingSettingsDto, @Json(name = "periodic_payment") PeriodicPaymentSettingsDto periodicPaymentSettingsDto) {
        this.selectedAutoPaymentSetting = autoPaymentSettingsType;
        this.upToBalance = upToBalanceSettingsDto;
        this.autofund = autoFundSettingsDto;
        this.rounding = roundingSettingsDto;
        this.periodicPayment = periodicPaymentSettingsDto;
    }
}
