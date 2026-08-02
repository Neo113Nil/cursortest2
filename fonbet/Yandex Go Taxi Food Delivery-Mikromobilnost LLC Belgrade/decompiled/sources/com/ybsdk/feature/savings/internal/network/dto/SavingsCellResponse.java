package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsCellResponse;", "", "openingAccountInfo", "Lcom/ybsdk/feature/savings/internal/network/dto/OpeningAccountInfoResponse;", "createAccountInfoResponse", "Lcom/ybsdk/feature/savings/internal/network/dto/CreateAccountInfoResponse;", "existingAccountInfo", "Lcom/ybsdk/feature/savings/internal/network/dto/ExistingAccountInfoResponse;", "noAccountsInfo", "Lcom/ybsdk/feature/savings/internal/network/dto/NoAccountsInfoResponse;", "closingAccountInfo", "Lcom/ybsdk/feature/savings/internal/network/dto/ClosingAccountInfoResponse;", "<init>", "(Lcom/ybsdk/feature/savings/internal/network/dto/OpeningAccountInfoResponse;Lcom/ybsdk/feature/savings/internal/network/dto/CreateAccountInfoResponse;Lcom/ybsdk/feature/savings/internal/network/dto/ExistingAccountInfoResponse;Lcom/ybsdk/feature/savings/internal/network/dto/NoAccountsInfoResponse;Lcom/ybsdk/feature/savings/internal/network/dto/ClosingAccountInfoResponse;)V", "getOpeningAccountInfo", "()Lcom/ybsdk/feature/savings/internal/network/dto/OpeningAccountInfoResponse;", "getCreateAccountInfoResponse", "()Lcom/ybsdk/feature/savings/internal/network/dto/CreateAccountInfoResponse;", "getExistingAccountInfo", "()Lcom/ybsdk/feature/savings/internal/network/dto/ExistingAccountInfoResponse;", "getNoAccountsInfo", "()Lcom/ybsdk/feature/savings/internal/network/dto/NoAccountsInfoResponse;", "getClosingAccountInfo", "()Lcom/ybsdk/feature/savings/internal/network/dto/ClosingAccountInfoResponse;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsCellResponse {
    private final ClosingAccountInfoResponse closingAccountInfo;
    private final CreateAccountInfoResponse createAccountInfoResponse;
    private final ExistingAccountInfoResponse existingAccountInfo;
    private final NoAccountsInfoResponse noAccountsInfo;
    private final OpeningAccountInfoResponse openingAccountInfo;

    public SavingsCellResponse(@Json(name = "opening_account_info") OpeningAccountInfoResponse openingAccountInfoResponse, @Json(name = "create_account_info") CreateAccountInfoResponse createAccountInfoResponse, @Json(name = "existing_account_info") ExistingAccountInfoResponse existingAccountInfoResponse, @Json(name = "no_accounts_info") NoAccountsInfoResponse noAccountsInfoResponse, @Json(name = "closing_account_info") ClosingAccountInfoResponse closingAccountInfoResponse) {
        this.openingAccountInfo = openingAccountInfoResponse;
        this.createAccountInfoResponse = createAccountInfoResponse;
        this.existingAccountInfo = existingAccountInfoResponse;
        this.noAccountsInfo = noAccountsInfoResponse;
        this.closingAccountInfo = closingAccountInfoResponse;
    }

    public static /* synthetic */ SavingsCellResponse copy$default(SavingsCellResponse savingsCellResponse, OpeningAccountInfoResponse openingAccountInfoResponse, CreateAccountInfoResponse createAccountInfoResponse, ExistingAccountInfoResponse existingAccountInfoResponse, NoAccountsInfoResponse noAccountsInfoResponse, ClosingAccountInfoResponse closingAccountInfoResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            openingAccountInfoResponse = savingsCellResponse.openingAccountInfo;
        }
        if ((i & 2) != 0) {
            createAccountInfoResponse = savingsCellResponse.createAccountInfoResponse;
        }
        if ((i & 4) != 0) {
            existingAccountInfoResponse = savingsCellResponse.existingAccountInfo;
        }
        if ((i & 8) != 0) {
            noAccountsInfoResponse = savingsCellResponse.noAccountsInfo;
        }
        if ((i & 16) != 0) {
            closingAccountInfoResponse = savingsCellResponse.closingAccountInfo;
        }
        ClosingAccountInfoResponse closingAccountInfoResponse2 = closingAccountInfoResponse;
        ExistingAccountInfoResponse existingAccountInfoResponse2 = existingAccountInfoResponse;
        return savingsCellResponse.copy(openingAccountInfoResponse, createAccountInfoResponse, existingAccountInfoResponse2, noAccountsInfoResponse, closingAccountInfoResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final OpeningAccountInfoResponse getOpeningAccountInfo() {
        return this.openingAccountInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final CreateAccountInfoResponse getCreateAccountInfoResponse() {
        return this.createAccountInfoResponse;
    }

    /* renamed from: component3, reason: from getter */
    public final ExistingAccountInfoResponse getExistingAccountInfo() {
        return this.existingAccountInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final NoAccountsInfoResponse getNoAccountsInfo() {
        return this.noAccountsInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final ClosingAccountInfoResponse getClosingAccountInfo() {
        return this.closingAccountInfo;
    }

    public final SavingsCellResponse copy(@Json(name = "opening_account_info") OpeningAccountInfoResponse openingAccountInfo, @Json(name = "create_account_info") CreateAccountInfoResponse createAccountInfoResponse, @Json(name = "existing_account_info") ExistingAccountInfoResponse existingAccountInfo, @Json(name = "no_accounts_info") NoAccountsInfoResponse noAccountsInfo, @Json(name = "closing_account_info") ClosingAccountInfoResponse closingAccountInfo) {
        return new SavingsCellResponse(openingAccountInfo, createAccountInfoResponse, existingAccountInfo, noAccountsInfo, closingAccountInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsCellResponse)) {
            return false;
        }
        SavingsCellResponse savingsCellResponse = (SavingsCellResponse) other;
        return jl40.l(this.openingAccountInfo, savingsCellResponse.openingAccountInfo) && jl40.l(this.createAccountInfoResponse, savingsCellResponse.createAccountInfoResponse) && jl40.l(this.existingAccountInfo, savingsCellResponse.existingAccountInfo) && jl40.l(this.noAccountsInfo, savingsCellResponse.noAccountsInfo) && jl40.l(this.closingAccountInfo, savingsCellResponse.closingAccountInfo);
    }

    public final ClosingAccountInfoResponse getClosingAccountInfo() {
        return this.closingAccountInfo;
    }

    public final CreateAccountInfoResponse getCreateAccountInfoResponse() {
        return this.createAccountInfoResponse;
    }

    public final ExistingAccountInfoResponse getExistingAccountInfo() {
        return this.existingAccountInfo;
    }

    public final NoAccountsInfoResponse getNoAccountsInfo() {
        return this.noAccountsInfo;
    }

    public final OpeningAccountInfoResponse getOpeningAccountInfo() {
        return this.openingAccountInfo;
    }

    public int hashCode() {
        OpeningAccountInfoResponse openingAccountInfoResponse = this.openingAccountInfo;
        int hashCode = (openingAccountInfoResponse == null ? 0 : openingAccountInfoResponse.hashCode()) * 31;
        CreateAccountInfoResponse createAccountInfoResponse = this.createAccountInfoResponse;
        int hashCode2 = (hashCode + (createAccountInfoResponse == null ? 0 : createAccountInfoResponse.hashCode())) * 31;
        ExistingAccountInfoResponse existingAccountInfoResponse = this.existingAccountInfo;
        int hashCode3 = (hashCode2 + (existingAccountInfoResponse == null ? 0 : existingAccountInfoResponse.hashCode())) * 31;
        NoAccountsInfoResponse noAccountsInfoResponse = this.noAccountsInfo;
        int hashCode4 = (hashCode3 + (noAccountsInfoResponse == null ? 0 : noAccountsInfoResponse.hashCode())) * 31;
        ClosingAccountInfoResponse closingAccountInfoResponse = this.closingAccountInfo;
        return hashCode4 + (closingAccountInfoResponse != null ? closingAccountInfoResponse.hashCode() : 0);
    }

    public String toString() {
        return "SavingsCellResponse(openingAccountInfo=" + this.openingAccountInfo + ", createAccountInfoResponse=" + this.createAccountInfoResponse + ", existingAccountInfo=" + this.existingAccountInfo + ", noAccountsInfo=" + this.noAccountsInfo + ", closingAccountInfo=" + this.closingAccountInfo + Extension.C_BRAKE;
    }
}
