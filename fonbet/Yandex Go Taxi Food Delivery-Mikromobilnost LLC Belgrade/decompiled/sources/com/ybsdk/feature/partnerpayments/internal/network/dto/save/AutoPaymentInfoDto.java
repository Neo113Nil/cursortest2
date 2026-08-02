package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInfoDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInfoDto$AutoPaymentStatus;", "settings", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDto;", "<init>", "(Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInfoDto$AutoPaymentStatus;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDto;)V", "getStatus", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInfoDto$AutoPaymentStatus;", "getSettings", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AutoPaymentStatus", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoPaymentInfoDto {
    private final AutoPaymentSettingsDto settings;
    private final AutoPaymentStatus status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInfoDto$AutoPaymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AutoPaymentStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AutoPaymentStatus[] $VALUES;
        public static final AutoPaymentStatus ENABLED = new AutoPaymentStatus("ENABLED", 0);
        public static final AutoPaymentStatus DISABLED = new AutoPaymentStatus("DISABLED", 1);

        private static final /* synthetic */ AutoPaymentStatus[] $values() {
            return new AutoPaymentStatus[]{ENABLED, DISABLED};
        }

        static {
            AutoPaymentStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private AutoPaymentStatus(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static AutoPaymentStatus valueOf(String str) {
            return (AutoPaymentStatus) Enum.valueOf(AutoPaymentStatus.class, str);
        }

        public static AutoPaymentStatus[] values() {
            return (AutoPaymentStatus[]) $VALUES.clone();
        }
    }

    public AutoPaymentInfoDto(@Json(name = "status") AutoPaymentStatus autoPaymentStatus, @Json(name = "settings") AutoPaymentSettingsDto autoPaymentSettingsDto) {
        this.status = autoPaymentStatus;
        this.settings = autoPaymentSettingsDto;
    }

    public static /* synthetic */ AutoPaymentInfoDto copy$default(AutoPaymentInfoDto autoPaymentInfoDto, AutoPaymentStatus autoPaymentStatus, AutoPaymentSettingsDto autoPaymentSettingsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            autoPaymentStatus = autoPaymentInfoDto.status;
        }
        if ((i & 2) != 0) {
            autoPaymentSettingsDto = autoPaymentInfoDto.settings;
        }
        return autoPaymentInfoDto.copy(autoPaymentStatus, autoPaymentSettingsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoPaymentStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoPaymentSettingsDto getSettings() {
        return this.settings;
    }

    public final AutoPaymentInfoDto copy(@Json(name = "status") AutoPaymentStatus status, @Json(name = "settings") AutoPaymentSettingsDto settings) {
        return new AutoPaymentInfoDto(status, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoPaymentInfoDto)) {
            return false;
        }
        AutoPaymentInfoDto autoPaymentInfoDto = (AutoPaymentInfoDto) other;
        return this.status == autoPaymentInfoDto.status && jl40.l(this.settings, autoPaymentInfoDto.settings);
    }

    public final AutoPaymentSettingsDto getSettings() {
        return this.settings;
    }

    public final AutoPaymentStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.settings.hashCode() + (this.status.hashCode() * 31);
    }

    public String toString() {
        return "AutoPaymentInfoDto(status=" + this.status + ", settings=" + this.settings + Extension.C_BRAKE;
    }
}
