package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundNeedConfirmationDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundNeedConfirmationDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/ActionButtonDto;", "actionButtonDtoAdapter", "nullableActionButtonDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundNeedConfirmationDataDtoJsonAdapter extends JsonAdapter<FundNeedConfirmationDataDto> {
    private final JsonAdapter<ActionButtonDto> actionButtonDtoAdapter;
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<ActionButtonDto> nullableActionButtonDtoAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "bottom_divkit_widget", "primary_button", "secondary_button", "background_image");
    private final JsonAdapter<String> stringAdapter;

    public FundNeedConfirmationDataDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "bottomDivkitWidget");
        this.actionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "primaryButton");
        this.nullableActionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "secondaryButton");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "backgroundImage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FundNeedConfirmationDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        DivDataDto divDataDto = null;
        ActionButtonDto actionButtonDto = null;
        ActionButtonDto actionButtonDto2 = null;
        Themes<String> themes = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    break;
                case 2:
                    divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                    if (divDataDto == null) {
                        throw Util.unexpectedNull("bottomDivkitWidget", "bottom_divkit_widget", jsonReader);
                    }
                    break;
                case 3:
                    actionButtonDto = this.actionButtonDtoAdapter.fromJson(jsonReader);
                    if (actionButtonDto == null) {
                        throw Util.unexpectedNull("primaryButton", "primary_button", jsonReader);
                    }
                    break;
                case 4:
                    actionButtonDto2 = this.nullableActionButtonDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("subtitle", "subtitle", jsonReader);
        }
        if (divDataDto == null) {
            throw Util.missingProperty("bottomDivkitWidget", "bottom_divkit_widget", jsonReader);
        }
        if (actionButtonDto != null) {
            return new FundNeedConfirmationDataDto(str, str2, divDataDto, actionButtonDto, actionButtonDto2, themes);
        }
        throw Util.missingProperty("primaryButton", "primary_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FundNeedConfirmationDataDto fundNeedConfirmationDataDto) {
        FundNeedConfirmationDataDto fundNeedConfirmationDataDto2 = fundNeedConfirmationDataDto;
        if (fundNeedConfirmationDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundNeedConfirmationDataDto2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundNeedConfirmationDataDto2.getSubtitle());
        jsonWriter.name("bottom_divkit_widget");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundNeedConfirmationDataDto2.getBottomDivkitWidget());
        jsonWriter.name("primary_button");
        this.actionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) fundNeedConfirmationDataDto2.getPrimaryButton());
        jsonWriter.name("secondary_button");
        this.nullableActionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) fundNeedConfirmationDataDto2.getSecondaryButton());
        jsonWriter.name("background_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) fundNeedConfirmationDataDto2.getBackgroundImage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(FundNeedConfirmationDataDto)");
    }
}
