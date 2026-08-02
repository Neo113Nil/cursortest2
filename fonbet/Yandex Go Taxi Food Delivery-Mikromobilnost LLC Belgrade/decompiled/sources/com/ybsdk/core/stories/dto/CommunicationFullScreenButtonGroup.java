package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButtonGroup;", "", "firstButton", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButton;", "secondButton", "legalAgreement", "Lcom/ybsdk/core/stories/dto/LegalAgreement;", "<init>", "(Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButton;Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButton;Lcom/ybsdk/core/stories/dto/LegalAgreement;)V", "getFirstButton", "()Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButton;", "getSecondButton", "getLegalAgreement", "()Lcom/ybsdk/core/stories/dto/LegalAgreement;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommunicationFullScreenButtonGroup {
    private final CommunicationFullScreenButton firstButton;
    private final LegalAgreement legalAgreement;
    private final CommunicationFullScreenButton secondButton;

    public CommunicationFullScreenButtonGroup(@Json(name = "first_button") CommunicationFullScreenButton communicationFullScreenButton, @Json(name = "second_button") CommunicationFullScreenButton communicationFullScreenButton2, @Json(name = "legal_agreement") LegalAgreement legalAgreement) {
        this.firstButton = communicationFullScreenButton;
        this.secondButton = communicationFullScreenButton2;
        this.legalAgreement = legalAgreement;
    }

    public static /* synthetic */ CommunicationFullScreenButtonGroup copy$default(CommunicationFullScreenButtonGroup communicationFullScreenButtonGroup, CommunicationFullScreenButton communicationFullScreenButton, CommunicationFullScreenButton communicationFullScreenButton2, LegalAgreement legalAgreement, int i, Object obj) {
        if ((i & 1) != 0) {
            communicationFullScreenButton = communicationFullScreenButtonGroup.firstButton;
        }
        if ((i & 2) != 0) {
            communicationFullScreenButton2 = communicationFullScreenButtonGroup.secondButton;
        }
        if ((i & 4) != 0) {
            legalAgreement = communicationFullScreenButtonGroup.legalAgreement;
        }
        return communicationFullScreenButtonGroup.copy(communicationFullScreenButton, communicationFullScreenButton2, legalAgreement);
    }

    /* renamed from: component1, reason: from getter */
    public final CommunicationFullScreenButton getFirstButton() {
        return this.firstButton;
    }

    /* renamed from: component2, reason: from getter */
    public final CommunicationFullScreenButton getSecondButton() {
        return this.secondButton;
    }

    /* renamed from: component3, reason: from getter */
    public final LegalAgreement getLegalAgreement() {
        return this.legalAgreement;
    }

    public final CommunicationFullScreenButtonGroup copy(@Json(name = "first_button") CommunicationFullScreenButton firstButton, @Json(name = "second_button") CommunicationFullScreenButton secondButton, @Json(name = "legal_agreement") LegalAgreement legalAgreement) {
        return new CommunicationFullScreenButtonGroup(firstButton, secondButton, legalAgreement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunicationFullScreenButtonGroup)) {
            return false;
        }
        CommunicationFullScreenButtonGroup communicationFullScreenButtonGroup = (CommunicationFullScreenButtonGroup) other;
        return jl40.l(this.firstButton, communicationFullScreenButtonGroup.firstButton) && jl40.l(this.secondButton, communicationFullScreenButtonGroup.secondButton) && jl40.l(this.legalAgreement, communicationFullScreenButtonGroup.legalAgreement);
    }

    public final CommunicationFullScreenButton getFirstButton() {
        return this.firstButton;
    }

    public final LegalAgreement getLegalAgreement() {
        return this.legalAgreement;
    }

    public final CommunicationFullScreenButton getSecondButton() {
        return this.secondButton;
    }

    public int hashCode() {
        int hashCode = this.firstButton.hashCode() * 31;
        CommunicationFullScreenButton communicationFullScreenButton = this.secondButton;
        int hashCode2 = (hashCode + (communicationFullScreenButton == null ? 0 : communicationFullScreenButton.hashCode())) * 31;
        LegalAgreement legalAgreement = this.legalAgreement;
        return hashCode2 + (legalAgreement != null ? legalAgreement.hashCode() : 0);
    }

    public String toString() {
        return "CommunicationFullScreenButtonGroup(firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + ", legalAgreement=" + this.legalAgreement + Extension.C_BRAKE;
    }
}
