package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest;", "", "agreementId", "", "directionType", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferDirectionType;", "prerequisites", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam;", "scenario", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest$TransfersPageScenario;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferDirectionType;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest$TransfersPageScenario;)V", "getAgreementId", "()Ljava/lang/String;", "getDirectionType", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferDirectionType;", "getPrerequisites", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam;", "getScenario", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest$TransfersPageScenario;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "TransfersPageScenario", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransfersPageRequest {
    private final String agreementId;
    private final TransferDirectionType directionType;
    private final PrerequisiteParam prerequisites;
    private final TransfersPageScenario scenario;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest$TransfersPageScenario;", "", "<init>", "(Ljava/lang/String;I)V", "SELF", "PHONE", "REQUISITES", "MOBILE_PAYMENT", "INTERNET_PAYMENT", "C2G", "FUND", "SAVERS_TOPUP", "INVOICE_HCS", "CROSS_BORDER", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransfersPageScenario {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TransfersPageScenario[] $VALUES;
        public static final TransfersPageScenario SELF = new TransfersPageScenario("SELF", 0);
        public static final TransfersPageScenario PHONE = new TransfersPageScenario("PHONE", 1);
        public static final TransfersPageScenario REQUISITES = new TransfersPageScenario("REQUISITES", 2);
        public static final TransfersPageScenario MOBILE_PAYMENT = new TransfersPageScenario("MOBILE_PAYMENT", 3);
        public static final TransfersPageScenario INTERNET_PAYMENT = new TransfersPageScenario("INTERNET_PAYMENT", 4);
        public static final TransfersPageScenario C2G = new TransfersPageScenario("C2G", 5);
        public static final TransfersPageScenario FUND = new TransfersPageScenario("FUND", 6);
        public static final TransfersPageScenario SAVERS_TOPUP = new TransfersPageScenario("SAVERS_TOPUP", 7);
        public static final TransfersPageScenario INVOICE_HCS = new TransfersPageScenario("INVOICE_HCS", 8);
        public static final TransfersPageScenario CROSS_BORDER = new TransfersPageScenario("CROSS_BORDER", 9);

        private static final /* synthetic */ TransfersPageScenario[] $values() {
            return new TransfersPageScenario[]{SELF, PHONE, REQUISITES, MOBILE_PAYMENT, INTERNET_PAYMENT, C2G, FUND, SAVERS_TOPUP, INVOICE_HCS, CROSS_BORDER};
        }

        static {
            TransfersPageScenario[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private TransfersPageScenario(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TransfersPageScenario valueOf(String str) {
            return (TransfersPageScenario) Enum.valueOf(TransfersPageScenario.class, str);
        }

        public static TransfersPageScenario[] values() {
            return (TransfersPageScenario[]) $VALUES.clone();
        }
    }

    public TransfersPageRequest(@Json(name = "agreement_id") String str, @Json(name = "direction") TransferDirectionType transferDirectionType, @Json(name = "prerequisite") PrerequisiteParam prerequisiteParam, @Json(name = "scenario") TransfersPageScenario transfersPageScenario) {
        this.agreementId = str;
        this.directionType = transferDirectionType;
        this.prerequisites = prerequisiteParam;
        this.scenario = transfersPageScenario;
    }

    public static /* synthetic */ TransfersPageRequest copy$default(TransfersPageRequest transfersPageRequest, String str, TransferDirectionType transferDirectionType, PrerequisiteParam prerequisiteParam, TransfersPageScenario transfersPageScenario, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transfersPageRequest.agreementId;
        }
        if ((i & 2) != 0) {
            transferDirectionType = transfersPageRequest.directionType;
        }
        if ((i & 4) != 0) {
            prerequisiteParam = transfersPageRequest.prerequisites;
        }
        if ((i & 8) != 0) {
            transfersPageScenario = transfersPageRequest.scenario;
        }
        return transfersPageRequest.copy(str, transferDirectionType, prerequisiteParam, transfersPageScenario);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferDirectionType getDirectionType() {
        return this.directionType;
    }

    /* renamed from: component3, reason: from getter */
    public final PrerequisiteParam getPrerequisites() {
        return this.prerequisites;
    }

    /* renamed from: component4, reason: from getter */
    public final TransfersPageScenario getScenario() {
        return this.scenario;
    }

    public final TransfersPageRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "direction") TransferDirectionType directionType, @Json(name = "prerequisite") PrerequisiteParam prerequisites, @Json(name = "scenario") TransfersPageScenario scenario) {
        return new TransfersPageRequest(agreementId, directionType, prerequisites, scenario);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransfersPageRequest)) {
            return false;
        }
        TransfersPageRequest transfersPageRequest = (TransfersPageRequest) other;
        return jl40.l(this.agreementId, transfersPageRequest.agreementId) && this.directionType == transfersPageRequest.directionType && jl40.l(this.prerequisites, transfersPageRequest.prerequisites) && this.scenario == transfersPageRequest.scenario;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final TransferDirectionType getDirectionType() {
        return this.directionType;
    }

    public final PrerequisiteParam getPrerequisites() {
        return this.prerequisites;
    }

    public final TransfersPageScenario getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        String str = this.agreementId;
        int hashCode = (this.directionType.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        PrerequisiteParam prerequisiteParam = this.prerequisites;
        int hashCode2 = (hashCode + (prerequisiteParam == null ? 0 : prerequisiteParam.hashCode())) * 31;
        TransfersPageScenario transfersPageScenario = this.scenario;
        return hashCode2 + (transfersPageScenario != null ? transfersPageScenario.hashCode() : 0);
    }

    public String toString() {
        return "TransfersPageRequest(agreementId=" + this.agreementId + ", directionType=" + this.directionType + ", prerequisites=" + this.prerequisites + ", scenario=" + this.scenario + Extension.C_BRAKE;
    }
}
