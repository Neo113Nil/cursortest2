package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.feature.transfer.version2.internal.data.dto.FormFieldValidationDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetUinSearchFieldDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetUinSearchFieldDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderDto;", "budgetHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/data/dto/FormFieldValidationDto;", "formFieldValidationDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "actionButtonDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BudgetUinSearchFieldDtoJsonAdapter extends JsonAdapter<BudgetUinSearchFieldDto> {
    private final JsonAdapter<ActionButtonDto> actionButtonDtoAdapter;
    private final JsonAdapter<BudgetHeaderDto> budgetHeaderDtoAdapter;
    private final JsonAdapter<FormFieldValidationDto> formFieldValidationDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("screen_header", "hint", "placeholder", "validation", "button");
    private final JsonAdapter<String> stringAdapter;

    public BudgetUinSearchFieldDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.budgetHeaderDtoAdapter = moshi.adapter(BudgetHeaderDto.class, emptySet, "header");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "hint");
        this.formFieldValidationDtoAdapter = moshi.adapter(FormFieldValidationDto.class, emptySet, "validation");
        this.actionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "button");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BudgetUinSearchFieldDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        BudgetHeaderDto budgetHeaderDto = null;
        String str = null;
        String str2 = null;
        FormFieldValidationDto formFieldValidationDto = null;
        ActionButtonDto actionButtonDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                budgetHeaderDto = this.budgetHeaderDtoAdapter.fromJson(jsonReader);
                if (budgetHeaderDto == null) {
                    throw Util.unexpectedNull("header_", "screen_header", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("hint", "hint", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("placeholder", "placeholder", jsonReader);
                }
            } else if (selectName == 3) {
                formFieldValidationDto = this.formFieldValidationDtoAdapter.fromJson(jsonReader);
                if (formFieldValidationDto == null) {
                    throw Util.unexpectedNull("validation", "validation", jsonReader);
                }
            } else if (selectName == 4 && (actionButtonDto = this.actionButtonDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("button", "button", jsonReader);
            }
        }
        jsonReader.endObject();
        if (budgetHeaderDto == null) {
            throw Util.missingProperty("header_", "screen_header", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("hint", "hint", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("placeholder", "placeholder", jsonReader);
        }
        if (formFieldValidationDto == null) {
            throw Util.missingProperty("validation", "validation", jsonReader);
        }
        if (actionButtonDto != null) {
            return new BudgetUinSearchFieldDto(budgetHeaderDto, str, str2, formFieldValidationDto, actionButtonDto);
        }
        throw Util.missingProperty("button", "button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BudgetUinSearchFieldDto budgetUinSearchFieldDto) {
        BudgetUinSearchFieldDto budgetUinSearchFieldDto2 = budgetUinSearchFieldDto;
        if (budgetUinSearchFieldDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("screen_header");
        this.budgetHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) budgetUinSearchFieldDto2.getHeader());
        jsonWriter.name("hint");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) budgetUinSearchFieldDto2.getHint());
        jsonWriter.name("placeholder");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) budgetUinSearchFieldDto2.getPlaceholder());
        jsonWriter.name("validation");
        this.formFieldValidationDtoAdapter.toJson(jsonWriter, (JsonWriter) budgetUinSearchFieldDto2.getValidation());
        jsonWriter.name("button");
        this.actionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) budgetUinSearchFieldDto2.getButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(BudgetUinSearchFieldDto)");
    }
}
