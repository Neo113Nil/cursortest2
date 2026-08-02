package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonGroupDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonGroupDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonDto;", "accountActionButtonDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableAccountActionButtonDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountActionButtonGroupDtoJsonAdapter extends JsonAdapter<AccountActionButtonGroupDto> {
    private final JsonAdapter<AccountActionButtonDto> accountActionButtonDtoAdapter;
    private final JsonAdapter<AccountActionButtonDto> nullableAccountActionButtonDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("first_button", "second_button");

    public AccountActionButtonGroupDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.accountActionButtonDtoAdapter = moshi.adapter(AccountActionButtonDto.class, emptySet, "firstButton");
        this.nullableAccountActionButtonDtoAdapter = moshi.adapter(AccountActionButtonDto.class, emptySet, "secondButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AccountActionButtonGroupDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AccountActionButtonDto accountActionButtonDto = null;
        AccountActionButtonDto accountActionButtonDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                accountActionButtonDto = this.accountActionButtonDtoAdapter.fromJson(jsonReader);
                if (accountActionButtonDto == null) {
                    throw Util.unexpectedNull("firstButton", "first_button", jsonReader);
                }
            } else if (selectName == 1) {
                accountActionButtonDto2 = this.nullableAccountActionButtonDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (accountActionButtonDto != null) {
            return new AccountActionButtonGroupDto(accountActionButtonDto, accountActionButtonDto2);
        }
        throw Util.missingProperty("firstButton", "first_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AccountActionButtonGroupDto accountActionButtonGroupDto) {
        AccountActionButtonGroupDto accountActionButtonGroupDto2 = accountActionButtonGroupDto;
        if (accountActionButtonGroupDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("first_button");
        this.accountActionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) accountActionButtonGroupDto2.getFirstButton());
        jsonWriter.name("second_button");
        this.nullableAccountActionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) accountActionButtonGroupDto2.getSecondButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(AccountActionButtonGroupDto)");
    }
}
