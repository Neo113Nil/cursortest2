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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountGoalDto;", "nullableSavingsAccountGoalDtoAdapter", "", "nullableBooleanAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsAccountSettingsRequestJsonAdapter extends JsonAdapter<SavingsAccountSettingsRequest> {
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<SavingsAccountGoalDto> nullableSavingsAccountGoalDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "title", "design", "goal", "should_delete_goal", "spendings_lock");
    private final JsonAdapter<String> stringAdapter;

    public SavingsAccountSettingsRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableSavingsAccountGoalDtoAdapter = moshi.adapter(SavingsAccountGoalDto.class, emptySet, "goal");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "shouldDeleteGoal");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsAccountSettingsRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        SavingsAccountGoalDto savingsAccountGoalDto = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    savingsAccountGoalDto = this.nullableSavingsAccountGoalDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new SavingsAccountSettingsRequest(str, str2, str3, savingsAccountGoalDto, bool, bool2);
        }
        throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsAccountSettingsRequest savingsAccountSettingsRequest) {
        SavingsAccountSettingsRequest savingsAccountSettingsRequest2 = savingsAccountSettingsRequest;
        if (savingsAccountSettingsRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountSettingsRequest2.getAgreementId());
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountSettingsRequest2.getTitle());
        jsonWriter.name("design");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountSettingsRequest2.getThemeId());
        jsonWriter.name("goal");
        this.nullableSavingsAccountGoalDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountSettingsRequest2.getGoal());
        jsonWriter.name("should_delete_goal");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountSettingsRequest2.getShouldDeleteGoal());
        jsonWriter.name("spendings_lock");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountSettingsRequest2.getLocked());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(SavingsAccountSettingsRequest)");
    }
}
