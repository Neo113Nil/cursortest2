package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;", "", "partyType", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentPartyType;", "sbpParty", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSbpParty;", "agreement", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupAgreement;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentPartyType;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSbpParty;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupAgreement;)V", "getPartyType", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentPartyType;", "getSbpParty", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSbpParty;", "getAgreement", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupAgreement;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupPaymentParty {
    private final AutoTopupAgreement agreement;
    private final AutoTopupPaymentPartyType partyType;
    private final AutoTopupSbpParty sbpParty;

    public AutoTopupPaymentParty(@Json(name = "party_type") AutoTopupPaymentPartyType autoTopupPaymentPartyType, @Json(name = "sbp_party") AutoTopupSbpParty autoTopupSbpParty, @Json(name = "agreement") AutoTopupAgreement autoTopupAgreement) {
        this.partyType = autoTopupPaymentPartyType;
        this.sbpParty = autoTopupSbpParty;
        this.agreement = autoTopupAgreement;
    }

    public static /* synthetic */ AutoTopupPaymentParty copy$default(AutoTopupPaymentParty autoTopupPaymentParty, AutoTopupPaymentPartyType autoTopupPaymentPartyType, AutoTopupSbpParty autoTopupSbpParty, AutoTopupAgreement autoTopupAgreement, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupPaymentPartyType = autoTopupPaymentParty.partyType;
        }
        if ((i & 2) != 0) {
            autoTopupSbpParty = autoTopupPaymentParty.sbpParty;
        }
        if ((i & 4) != 0) {
            autoTopupAgreement = autoTopupPaymentParty.agreement;
        }
        return autoTopupPaymentParty.copy(autoTopupPaymentPartyType, autoTopupSbpParty, autoTopupAgreement);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupPaymentPartyType getPartyType() {
        return this.partyType;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoTopupSbpParty getSbpParty() {
        return this.sbpParty;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoTopupAgreement getAgreement() {
        return this.agreement;
    }

    public final AutoTopupPaymentParty copy(@Json(name = "party_type") AutoTopupPaymentPartyType partyType, @Json(name = "sbp_party") AutoTopupSbpParty sbpParty, @Json(name = "agreement") AutoTopupAgreement agreement) {
        return new AutoTopupPaymentParty(partyType, sbpParty, agreement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupPaymentParty)) {
            return false;
        }
        AutoTopupPaymentParty autoTopupPaymentParty = (AutoTopupPaymentParty) other;
        return this.partyType == autoTopupPaymentParty.partyType && jl40.l(this.sbpParty, autoTopupPaymentParty.sbpParty) && jl40.l(this.agreement, autoTopupPaymentParty.agreement);
    }

    public final AutoTopupAgreement getAgreement() {
        return this.agreement;
    }

    public final AutoTopupPaymentPartyType getPartyType() {
        return this.partyType;
    }

    public final AutoTopupSbpParty getSbpParty() {
        return this.sbpParty;
    }

    public int hashCode() {
        int hashCode = this.partyType.hashCode() * 31;
        AutoTopupSbpParty autoTopupSbpParty = this.sbpParty;
        int hashCode2 = (hashCode + (autoTopupSbpParty == null ? 0 : autoTopupSbpParty.hashCode())) * 31;
        AutoTopupAgreement autoTopupAgreement = this.agreement;
        return hashCode2 + (autoTopupAgreement != null ? autoTopupAgreement.hashCode() : 0);
    }

    public String toString() {
        return "AutoTopupPaymentParty(partyType=" + this.partyType + ", sbpParty=" + this.sbpParty + ", agreement=" + this.agreement + Extension.C_BRAKE;
    }
}
