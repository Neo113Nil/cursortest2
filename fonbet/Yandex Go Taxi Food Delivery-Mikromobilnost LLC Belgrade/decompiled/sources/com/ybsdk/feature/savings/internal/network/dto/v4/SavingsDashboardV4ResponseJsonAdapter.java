package com.ybsdk.feature.savings.internal.network.dto.v4;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import com.ybsdk.feature.savings.internal.network.dto.DivkitWidgetDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsDashboardV4ResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsDashboardV4Response;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsAccountsHeaderInfoDtoV4;", "savingsAccountsHeaderInfoDtoV4Adapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "listOfStringAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/DivkitWidgetDto;", "listOfDivkitWidgetDtoAdapter", "Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "nullableListOfEducationsV2DtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsShelfDtoV4;", "nullableListOfSavingsShelfDtoV4Adapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "themedParameterOfStringAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsDashboardV4ResponseJsonAdapter extends JsonAdapter<SavingsDashboardV4Response> {
    private final JsonAdapter<List<DivkitWidgetDto>> listOfDivkitWidgetDtoAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<List<EducationsV2Dto>> nullableListOfEducationsV2DtoAdapter;
    private final JsonAdapter<List<SavingsShelfDtoV4>> nullableListOfSavingsShelfDtoV4Adapter;
    private final JsonReader.Options options = JsonReader.Options.of("header_info", "layout", "divkit_widgets", "educations_v2", "shelves", "common_div_data", "background_color");
    private final JsonAdapter<SavingsAccountsHeaderInfoDtoV4> savingsAccountsHeaderInfoDtoV4Adapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public SavingsDashboardV4ResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.savingsAccountsHeaderInfoDtoV4Adapter = moshi.adapter(SavingsAccountsHeaderInfoDtoV4.class, emptySet, "headerInfo");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "layout");
        this.listOfDivkitWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DivkitWidgetDto.class), emptySet, "divWidgets");
        this.nullableListOfEducationsV2DtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, EducationsV2Dto.class), emptySet, "educations");
        this.nullableListOfSavingsShelfDtoV4Adapter = moshi.adapter(Types.newParameterizedType(List.class, SavingsShelfDtoV4.class), emptySet, "shelves");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "commonDivData");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsDashboardV4Response fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SavingsAccountsHeaderInfoDtoV4 savingsAccountsHeaderInfoDtoV4 = null;
        List<String> list = null;
        List<DivkitWidgetDto> list2 = null;
        List<EducationsV2Dto> list3 = null;
        List<SavingsShelfDtoV4> list4 = null;
        DivDataDto divDataDto = null;
        ThemedParameter<String> themedParameter = null;
        while (jsonReader.hasNext()) {
            SavingsAccountsHeaderInfoDtoV4 savingsAccountsHeaderInfoDtoV42 = savingsAccountsHeaderInfoDtoV4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    savingsAccountsHeaderInfoDtoV4 = this.savingsAccountsHeaderInfoDtoV4Adapter.fromJson(jsonReader);
                    if (savingsAccountsHeaderInfoDtoV4 == null) {
                        throw Util.unexpectedNull("headerInfo", "header_info", jsonReader);
                    }
                    continue;
                case 1:
                    list = this.listOfStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("layout", "layout", jsonReader);
                    }
                    break;
                case 2:
                    list2 = this.listOfDivkitWidgetDtoAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("divWidgets", "divkit_widgets", jsonReader);
                    }
                    break;
                case 3:
                    list3 = this.nullableListOfEducationsV2DtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list4 = this.nullableListOfSavingsShelfDtoV4Adapter.fromJson(jsonReader);
                    break;
                case 5:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    break;
            }
            savingsAccountsHeaderInfoDtoV4 = savingsAccountsHeaderInfoDtoV42;
        }
        SavingsAccountsHeaderInfoDtoV4 savingsAccountsHeaderInfoDtoV43 = savingsAccountsHeaderInfoDtoV4;
        jsonReader.endObject();
        if (savingsAccountsHeaderInfoDtoV43 == null) {
            throw Util.missingProperty("headerInfo", "header_info", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("layout", "layout", jsonReader);
        }
        if (list2 == null) {
            throw Util.missingProperty("divWidgets", "divkit_widgets", jsonReader);
        }
        if (themedParameter != null) {
            return new SavingsDashboardV4Response(savingsAccountsHeaderInfoDtoV43, list, list2, list3, list4, divDataDto, themedParameter);
        }
        throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsDashboardV4Response savingsDashboardV4Response) {
        SavingsDashboardV4Response savingsDashboardV4Response2 = savingsDashboardV4Response;
        if (savingsDashboardV4Response2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header_info");
        this.savingsAccountsHeaderInfoDtoV4Adapter.toJson(jsonWriter, (JsonWriter) savingsDashboardV4Response2.getHeaderInfo());
        jsonWriter.name("layout");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsDashboardV4Response2.getLayout());
        jsonWriter.name("divkit_widgets");
        this.listOfDivkitWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsDashboardV4Response2.getDivWidgets());
        jsonWriter.name("educations_v2");
        this.nullableListOfEducationsV2DtoAdapter.toJson(jsonWriter, (JsonWriter) savingsDashboardV4Response2.getEducations());
        jsonWriter.name("shelves");
        this.nullableListOfSavingsShelfDtoV4Adapter.toJson(jsonWriter, (JsonWriter) savingsDashboardV4Response2.getShelves());
        jsonWriter.name("common_div_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsDashboardV4Response2.getCommonDivData());
        jsonWriter.name("background_color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsDashboardV4Response2.getBackgroundColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(SavingsDashboardV4Response)");
    }
}
