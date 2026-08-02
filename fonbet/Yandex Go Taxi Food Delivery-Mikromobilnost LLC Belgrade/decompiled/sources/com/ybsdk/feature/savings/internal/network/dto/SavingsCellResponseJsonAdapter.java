package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsCellResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsCellResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/savings/internal/network/dto/OpeningAccountInfoResponse;", "nullableOpeningAccountInfoResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/CreateAccountInfoResponse;", "nullableCreateAccountInfoResponseAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/ExistingAccountInfoResponse;", "nullableExistingAccountInfoResponseAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/NoAccountsInfoResponse;", "nullableNoAccountsInfoResponseAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/ClosingAccountInfoResponse;", "nullableClosingAccountInfoResponseAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsCellResponseJsonAdapter extends JsonAdapter<SavingsCellResponse> {
    private final JsonAdapter<ClosingAccountInfoResponse> nullableClosingAccountInfoResponseAdapter;
    private final JsonAdapter<CreateAccountInfoResponse> nullableCreateAccountInfoResponseAdapter;
    private final JsonAdapter<ExistingAccountInfoResponse> nullableExistingAccountInfoResponseAdapter;
    private final JsonAdapter<NoAccountsInfoResponse> nullableNoAccountsInfoResponseAdapter;
    private final JsonAdapter<OpeningAccountInfoResponse> nullableOpeningAccountInfoResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("opening_account_info", "create_account_info", "existing_account_info", "no_accounts_info", "closing_account_info");

    public SavingsCellResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableOpeningAccountInfoResponseAdapter = moshi.adapter(OpeningAccountInfoResponse.class, emptySet, "openingAccountInfo");
        this.nullableCreateAccountInfoResponseAdapter = moshi.adapter(CreateAccountInfoResponse.class, emptySet, "createAccountInfoResponse");
        this.nullableExistingAccountInfoResponseAdapter = moshi.adapter(ExistingAccountInfoResponse.class, emptySet, "existingAccountInfo");
        this.nullableNoAccountsInfoResponseAdapter = moshi.adapter(NoAccountsInfoResponse.class, emptySet, "noAccountsInfo");
        this.nullableClosingAccountInfoResponseAdapter = moshi.adapter(ClosingAccountInfoResponse.class, emptySet, "closingAccountInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsCellResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        OpeningAccountInfoResponse openingAccountInfoResponse = null;
        CreateAccountInfoResponse createAccountInfoResponse = null;
        ExistingAccountInfoResponse existingAccountInfoResponse = null;
        NoAccountsInfoResponse noAccountsInfoResponse = null;
        ClosingAccountInfoResponse closingAccountInfoResponse = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                openingAccountInfoResponse = this.nullableOpeningAccountInfoResponseAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                createAccountInfoResponse = this.nullableCreateAccountInfoResponseAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                existingAccountInfoResponse = this.nullableExistingAccountInfoResponseAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                noAccountsInfoResponse = this.nullableNoAccountsInfoResponseAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                closingAccountInfoResponse = this.nullableClosingAccountInfoResponseAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new SavingsCellResponse(openingAccountInfoResponse, createAccountInfoResponse, existingAccountInfoResponse, noAccountsInfoResponse, closingAccountInfoResponse);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsCellResponse savingsCellResponse) {
        SavingsCellResponse savingsCellResponse2 = savingsCellResponse;
        if (savingsCellResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("opening_account_info");
        this.nullableOpeningAccountInfoResponseAdapter.toJson(jsonWriter, (JsonWriter) savingsCellResponse2.getOpeningAccountInfo());
        jsonWriter.name("create_account_info");
        this.nullableCreateAccountInfoResponseAdapter.toJson(jsonWriter, (JsonWriter) savingsCellResponse2.getCreateAccountInfoResponse());
        jsonWriter.name("existing_account_info");
        this.nullableExistingAccountInfoResponseAdapter.toJson(jsonWriter, (JsonWriter) savingsCellResponse2.getExistingAccountInfo());
        jsonWriter.name("no_accounts_info");
        this.nullableNoAccountsInfoResponseAdapter.toJson(jsonWriter, (JsonWriter) savingsCellResponse2.getNoAccountsInfo());
        jsonWriter.name("closing_account_info");
        this.nullableClosingAccountInfoResponseAdapter.toJson(jsonWriter, (JsonWriter) savingsCellResponse2.getClosingAccountInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(SavingsCellResponse)");
    }
}
