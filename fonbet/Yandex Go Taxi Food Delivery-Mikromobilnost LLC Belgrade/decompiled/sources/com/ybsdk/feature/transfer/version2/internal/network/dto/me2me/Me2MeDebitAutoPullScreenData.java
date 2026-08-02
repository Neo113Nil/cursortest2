package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay.AgreementSheetItemDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenData;", "", "agreement", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/AgreementSheetItemDto;", "initialContent", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullPageContent;", "successContent", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/AgreementSheetItemDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullPageContent;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullPageContent;)V", "getAgreement", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/AgreementSheetItemDto;", "getInitialContent", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullPageContent;", "getSuccessContent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Me2MeDebitAutoPullScreenData {
    private final AgreementSheetItemDto agreement;
    private final Me2MeDebitAutoPullPageContent initialContent;
    private final Me2MeDebitAutoPullPageContent successContent;

    public Me2MeDebitAutoPullScreenData(@Json(name = "agreement") AgreementSheetItemDto agreementSheetItemDto, @Json(name = "initial_content") Me2MeDebitAutoPullPageContent me2MeDebitAutoPullPageContent, @Json(name = "success_content") Me2MeDebitAutoPullPageContent me2MeDebitAutoPullPageContent2) {
        this.agreement = agreementSheetItemDto;
        this.initialContent = me2MeDebitAutoPullPageContent;
        this.successContent = me2MeDebitAutoPullPageContent2;
    }

    public static /* synthetic */ Me2MeDebitAutoPullScreenData copy$default(Me2MeDebitAutoPullScreenData me2MeDebitAutoPullScreenData, AgreementSheetItemDto agreementSheetItemDto, Me2MeDebitAutoPullPageContent me2MeDebitAutoPullPageContent, Me2MeDebitAutoPullPageContent me2MeDebitAutoPullPageContent2, int i, Object obj) {
        if ((i & 1) != 0) {
            agreementSheetItemDto = me2MeDebitAutoPullScreenData.agreement;
        }
        if ((i & 2) != 0) {
            me2MeDebitAutoPullPageContent = me2MeDebitAutoPullScreenData.initialContent;
        }
        if ((i & 4) != 0) {
            me2MeDebitAutoPullPageContent2 = me2MeDebitAutoPullScreenData.successContent;
        }
        return me2MeDebitAutoPullScreenData.copy(agreementSheetItemDto, me2MeDebitAutoPullPageContent, me2MeDebitAutoPullPageContent2);
    }

    /* renamed from: component1, reason: from getter */
    public final AgreementSheetItemDto getAgreement() {
        return this.agreement;
    }

    /* renamed from: component2, reason: from getter */
    public final Me2MeDebitAutoPullPageContent getInitialContent() {
        return this.initialContent;
    }

    /* renamed from: component3, reason: from getter */
    public final Me2MeDebitAutoPullPageContent getSuccessContent() {
        return this.successContent;
    }

    public final Me2MeDebitAutoPullScreenData copy(@Json(name = "agreement") AgreementSheetItemDto agreement, @Json(name = "initial_content") Me2MeDebitAutoPullPageContent initialContent, @Json(name = "success_content") Me2MeDebitAutoPullPageContent successContent) {
        return new Me2MeDebitAutoPullScreenData(agreement, initialContent, successContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Me2MeDebitAutoPullScreenData)) {
            return false;
        }
        Me2MeDebitAutoPullScreenData me2MeDebitAutoPullScreenData = (Me2MeDebitAutoPullScreenData) other;
        return jl40.l(this.agreement, me2MeDebitAutoPullScreenData.agreement) && jl40.l(this.initialContent, me2MeDebitAutoPullScreenData.initialContent) && jl40.l(this.successContent, me2MeDebitAutoPullScreenData.successContent);
    }

    public final AgreementSheetItemDto getAgreement() {
        return this.agreement;
    }

    public final Me2MeDebitAutoPullPageContent getInitialContent() {
        return this.initialContent;
    }

    public final Me2MeDebitAutoPullPageContent getSuccessContent() {
        return this.successContent;
    }

    public int hashCode() {
        return this.successContent.hashCode() + ((this.initialContent.hashCode() + (this.agreement.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "Me2MeDebitAutoPullScreenData(agreement=" + this.agreement + ", initialContent=" + this.initialContent + ", successContent=" + this.successContent + Extension.C_BRAKE;
    }
}
