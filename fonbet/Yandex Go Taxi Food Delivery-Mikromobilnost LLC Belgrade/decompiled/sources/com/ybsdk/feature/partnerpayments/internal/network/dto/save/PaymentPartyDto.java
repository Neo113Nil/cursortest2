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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto;", "", "partyType", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto$PaymentPartyType;", "sbpParty", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/SbpPartyDto;", "agreementParty", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AgreementPartyDto;", "<init>", "(Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto$PaymentPartyType;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/SbpPartyDto;Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AgreementPartyDto;)V", "getPartyType", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto$PaymentPartyType;", "getSbpParty", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/SbpPartyDto;", "getAgreementParty", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AgreementPartyDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentPartyType", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentPartyDto {
    private final AgreementPartyDto agreementParty;
    private final PaymentPartyType partyType;
    private final SbpPartyDto sbpParty;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto$PaymentPartyType;", "", "<init>", "(Ljava/lang/String;I)V", "SBP_PARTY", "AGREEMENT", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentPartyType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentPartyType[] $VALUES;
        public static final PaymentPartyType SBP_PARTY = new PaymentPartyType("SBP_PARTY", 0);
        public static final PaymentPartyType AGREEMENT = new PaymentPartyType("AGREEMENT", 1);

        private static final /* synthetic */ PaymentPartyType[] $values() {
            return new PaymentPartyType[]{SBP_PARTY, AGREEMENT};
        }

        static {
            PaymentPartyType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PaymentPartyType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PaymentPartyType valueOf(String str) {
            return (PaymentPartyType) Enum.valueOf(PaymentPartyType.class, str);
        }

        public static PaymentPartyType[] values() {
            return (PaymentPartyType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PaymentPartyDto(PaymentPartyType paymentPartyType, SbpPartyDto sbpPartyDto, AgreementPartyDto agreementPartyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentPartyType, (i & 2) != 0 ? null : sbpPartyDto, (i & 4) != 0 ? null : agreementPartyDto);
    }

    public static /* synthetic */ PaymentPartyDto copy$default(PaymentPartyDto paymentPartyDto, PaymentPartyType paymentPartyType, SbpPartyDto sbpPartyDto, AgreementPartyDto agreementPartyDto, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentPartyType = paymentPartyDto.partyType;
        }
        if ((i & 2) != 0) {
            sbpPartyDto = paymentPartyDto.sbpParty;
        }
        if ((i & 4) != 0) {
            agreementPartyDto = paymentPartyDto.agreementParty;
        }
        return paymentPartyDto.copy(paymentPartyType, sbpPartyDto, agreementPartyDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentPartyType getPartyType() {
        return this.partyType;
    }

    /* renamed from: component2, reason: from getter */
    public final SbpPartyDto getSbpParty() {
        return this.sbpParty;
    }

    /* renamed from: component3, reason: from getter */
    public final AgreementPartyDto getAgreementParty() {
        return this.agreementParty;
    }

    public final PaymentPartyDto copy(@Json(name = "party_type") PaymentPartyType partyType, @Json(name = "sbp_party") SbpPartyDto sbpParty, @Json(name = "agreement_party") AgreementPartyDto agreementParty) {
        return new PaymentPartyDto(partyType, sbpParty, agreementParty);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPartyDto)) {
            return false;
        }
        PaymentPartyDto paymentPartyDto = (PaymentPartyDto) other;
        return this.partyType == paymentPartyDto.partyType && jl40.l(this.sbpParty, paymentPartyDto.sbpParty) && jl40.l(this.agreementParty, paymentPartyDto.agreementParty);
    }

    public final AgreementPartyDto getAgreementParty() {
        return this.agreementParty;
    }

    public final PaymentPartyType getPartyType() {
        return this.partyType;
    }

    public final SbpPartyDto getSbpParty() {
        return this.sbpParty;
    }

    public int hashCode() {
        PaymentPartyType paymentPartyType = this.partyType;
        int hashCode = (paymentPartyType == null ? 0 : paymentPartyType.hashCode()) * 31;
        SbpPartyDto sbpPartyDto = this.sbpParty;
        int hashCode2 = (hashCode + (sbpPartyDto == null ? 0 : sbpPartyDto.hashCode())) * 31;
        AgreementPartyDto agreementPartyDto = this.agreementParty;
        return hashCode2 + (agreementPartyDto != null ? agreementPartyDto.hashCode() : 0);
    }

    public String toString() {
        return "PaymentPartyDto(partyType=" + this.partyType + ", sbpParty=" + this.sbpParty + ", agreementParty=" + this.agreementParty + Extension.C_BRAKE;
    }

    public PaymentPartyDto(@Json(name = "party_type") PaymentPartyType paymentPartyType, @Json(name = "sbp_party") SbpPartyDto sbpPartyDto, @Json(name = "agreement_party") AgreementPartyDto agreementPartyDto) {
        this.partyType = paymentPartyType;
        this.sbpParty = sbpPartyDto;
        this.agreementParty = agreementPartyDto;
    }

    public PaymentPartyDto() {
        this(null, null, null, 7, null);
    }
}
