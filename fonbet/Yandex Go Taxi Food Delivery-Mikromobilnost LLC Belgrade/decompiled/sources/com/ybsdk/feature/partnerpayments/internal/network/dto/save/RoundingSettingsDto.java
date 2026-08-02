package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/RoundingSettingsDto;", "", "stepId", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/RoundingSettingsDto$StepId;", "<init>", "(Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/RoundingSettingsDto$StepId;)V", "getStepId", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/RoundingSettingsDto$StepId;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "StepId", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RoundingSettingsDto {
    private final StepId stepId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/RoundingSettingsDto$StepId;", "", "<init>", "(Ljava/lang/String;I)V", "STRICT10", "STRICT50", "STRICT100", "SMART", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StepId {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StepId[] $VALUES;
        public static final StepId STRICT10 = new StepId("STRICT10", 0);
        public static final StepId STRICT50 = new StepId("STRICT50", 1);
        public static final StepId STRICT100 = new StepId("STRICT100", 2);
        public static final StepId SMART = new StepId("SMART", 3);

        private static final /* synthetic */ StepId[] $values() {
            return new StepId[]{STRICT10, STRICT50, STRICT100, SMART};
        }

        static {
            StepId[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private StepId(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static StepId valueOf(String str) {
            return (StepId) Enum.valueOf(StepId.class, str);
        }

        public static StepId[] values() {
            return (StepId[]) $VALUES.clone();
        }
    }

    public RoundingSettingsDto(@Json(name = "step_id") StepId stepId) {
        this.stepId = stepId;
    }

    public static /* synthetic */ RoundingSettingsDto copy$default(RoundingSettingsDto roundingSettingsDto, StepId stepId, int i, Object obj) {
        if ((i & 1) != 0) {
            stepId = roundingSettingsDto.stepId;
        }
        return roundingSettingsDto.copy(stepId);
    }

    /* renamed from: component1, reason: from getter */
    public final StepId getStepId() {
        return this.stepId;
    }

    public final RoundingSettingsDto copy(@Json(name = "step_id") StepId stepId) {
        return new RoundingSettingsDto(stepId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RoundingSettingsDto) && this.stepId == ((RoundingSettingsDto) other).stepId;
    }

    public final StepId getStepId() {
        return this.stepId;
    }

    public int hashCode() {
        return this.stepId.hashCode();
    }

    public String toString() {
        return "RoundingSettingsDto(stepId=" + this.stepId + Extension.C_BRAKE;
    }
}
