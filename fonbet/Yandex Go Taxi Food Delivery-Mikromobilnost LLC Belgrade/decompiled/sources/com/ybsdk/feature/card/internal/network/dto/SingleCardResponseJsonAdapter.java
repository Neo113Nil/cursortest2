package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SingleCardResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardHeaderResponse;", "singleCardHeaderResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCarDetailsResponse;", "singleCarDetailsResponseAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsSettingsSectionResponse;", "singleCardDetailsSettingsSectionResponseAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "nullableSingleCardDetailsSettingsSectionResponseAdapter", "", "nullableBooleanAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/Snackbars;", "nullableSnackbarsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingleCardResponseJsonAdapter extends JsonAdapter<SingleCardResponse> {
    private volatile Constructor<SingleCardResponse> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<SingleCardDetailsSettingsSectionResponse> nullableSingleCardDetailsSettingsSectionResponseAdapter;
    private final JsonAdapter<Snackbars> nullableSnackbarsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", "card_details", "settings", "management_settings", "notifications", "card_additional_setting", "bottom_notification", "show_requisites", "snackbars");
    private final JsonAdapter<SingleCarDetailsResponse> singleCarDetailsResponseAdapter;
    private final JsonAdapter<SingleCardDetailsSettingsSectionResponse> singleCardDetailsSettingsSectionResponseAdapter;
    private final JsonAdapter<SingleCardHeaderResponse> singleCardHeaderResponseAdapter;

    public SingleCardResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.singleCardHeaderResponseAdapter = moshi.adapter(SingleCardHeaderResponse.class, emptySet, "header");
        this.singleCarDetailsResponseAdapter = moshi.adapter(SingleCarDetailsResponse.class, emptySet, "cardDetails");
        this.singleCardDetailsSettingsSectionResponseAdapter = moshi.adapter(SingleCardDetailsSettingsSectionResponse.class, emptySet, "settings");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "notificationDivData");
        this.nullableSingleCardDetailsSettingsSectionResponseAdapter = moshi.adapter(SingleCardDetailsSettingsSectionResponse.class, emptySet, "cardAdditionalSetting");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "showRequisites");
        this.nullableSnackbarsAdapter = moshi.adapter(Snackbars.class, emptySet, "snackbars");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SingleCardResponse fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        SingleCardHeaderResponse singleCardHeaderResponse = null;
        SingleCarDetailsResponse singleCarDetailsResponse = null;
        SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse = null;
        SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse2 = null;
        DivDataDto divDataDto = null;
        SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse3 = null;
        DivDataDto divDataDto2 = null;
        Boolean bool = null;
        Snackbars snackbars = null;
        while (true) {
            SingleCardHeaderResponse singleCardHeaderResponse2 = singleCardHeaderResponse;
            SingleCarDetailsResponse singleCarDetailsResponse2 = singleCarDetailsResponse;
            SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse4 = singleCardDetailsSettingsSectionResponse;
            if (!jsonReader.hasNext()) {
                SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse5 = singleCardDetailsSettingsSectionResponse2;
                jsonReader.endObject();
                if (i2 == -289) {
                    if (singleCardHeaderResponse2 == null) {
                        throw Util.missingProperty("header_", "header", jsonReader);
                    }
                    if (singleCarDetailsResponse2 == null) {
                        throw Util.missingProperty("cardDetails", "card_details", jsonReader);
                    }
                    if (singleCardDetailsSettingsSectionResponse4 == null) {
                        throw Util.missingProperty("settings", "settings", jsonReader);
                    }
                    if (singleCardDetailsSettingsSectionResponse5 == null) {
                        throw Util.missingProperty("managementSettings", "management_settings", jsonReader);
                    }
                    Snackbars snackbars2 = snackbars;
                    Boolean bool2 = bool;
                    return new SingleCardResponse(singleCardHeaderResponse2, singleCarDetailsResponse2, singleCardDetailsSettingsSectionResponse4, singleCardDetailsSettingsSectionResponse5, divDataDto, singleCardDetailsSettingsSectionResponse3, divDataDto2, bool2, snackbars2);
                }
                Constructor<SingleCardResponse> constructor = this.constructorRef;
                if (constructor == null) {
                    i = i2;
                    constructor = SingleCardResponse.class.getDeclaredConstructor(SingleCardHeaderResponse.class, SingleCarDetailsResponse.class, SingleCardDetailsSettingsSectionResponse.class, SingleCardDetailsSettingsSectionResponse.class, DivDataDto.class, SingleCardDetailsSettingsSectionResponse.class, DivDataDto.class, Boolean.class, Snackbars.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<SingleCardResponse> constructor2 = constructor;
                if (singleCardHeaderResponse2 == null) {
                    throw Util.missingProperty("header_", "header", jsonReader);
                }
                if (singleCarDetailsResponse2 == null) {
                    throw Util.missingProperty("cardDetails", "card_details", jsonReader);
                }
                if (singleCardDetailsSettingsSectionResponse4 == null) {
                    throw Util.missingProperty("settings", "settings", jsonReader);
                }
                if (singleCardDetailsSettingsSectionResponse5 != null) {
                    return constructor2.newInstance(singleCardHeaderResponse2, singleCarDetailsResponse2, singleCardDetailsSettingsSectionResponse4, singleCardDetailsSettingsSectionResponse5, divDataDto, singleCardDetailsSettingsSectionResponse3, divDataDto2, bool, snackbars, Integer.valueOf(i), null);
                }
                throw Util.missingProperty("managementSettings", "management_settings", jsonReader);
            }
            SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse6 = singleCardDetailsSettingsSectionResponse2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    singleCardDetailsSettingsSectionResponse2 = singleCardDetailsSettingsSectionResponse6;
                    singleCardHeaderResponse = singleCardHeaderResponse2;
                    singleCarDetailsResponse = singleCarDetailsResponse2;
                    singleCardDetailsSettingsSectionResponse = singleCardDetailsSettingsSectionResponse4;
                case 0:
                    singleCardHeaderResponse = this.singleCardHeaderResponseAdapter.fromJson(jsonReader);
                    if (singleCardHeaderResponse == null) {
                        throw Util.unexpectedNull("header_", "header", jsonReader);
                    }
                    singleCardDetailsSettingsSectionResponse2 = singleCardDetailsSettingsSectionResponse6;
                    singleCarDetailsResponse = singleCarDetailsResponse2;
                    singleCardDetailsSettingsSectionResponse = singleCardDetailsSettingsSectionResponse4;
                case 1:
                    singleCarDetailsResponse = this.singleCarDetailsResponseAdapter.fromJson(jsonReader);
                    if (singleCarDetailsResponse == null) {
                        throw Util.unexpectedNull("cardDetails", "card_details", jsonReader);
                    }
                    singleCardDetailsSettingsSectionResponse2 = singleCardDetailsSettingsSectionResponse6;
                    singleCardHeaderResponse = singleCardHeaderResponse2;
                    singleCardDetailsSettingsSectionResponse = singleCardDetailsSettingsSectionResponse4;
                case 2:
                    SingleCardDetailsSettingsSectionResponse fromJson = this.singleCardDetailsSettingsSectionResponseAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("settings", "settings", jsonReader);
                    }
                    singleCardDetailsSettingsSectionResponse = fromJson;
                    singleCardDetailsSettingsSectionResponse2 = singleCardDetailsSettingsSectionResponse6;
                    singleCardHeaderResponse = singleCardHeaderResponse2;
                    singleCarDetailsResponse = singleCarDetailsResponse2;
                case 3:
                    singleCardDetailsSettingsSectionResponse2 = this.singleCardDetailsSettingsSectionResponseAdapter.fromJson(jsonReader);
                    if (singleCardDetailsSettingsSectionResponse2 == null) {
                        throw Util.unexpectedNull("managementSettings", "management_settings", jsonReader);
                    }
                    singleCardHeaderResponse = singleCardHeaderResponse2;
                    singleCarDetailsResponse = singleCarDetailsResponse2;
                    singleCardDetailsSettingsSectionResponse = singleCardDetailsSettingsSectionResponse4;
                case 4:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    singleCardDetailsSettingsSectionResponse2 = singleCardDetailsSettingsSectionResponse6;
                    singleCardHeaderResponse = singleCardHeaderResponse2;
                    singleCarDetailsResponse = singleCarDetailsResponse2;
                    singleCardDetailsSettingsSectionResponse = singleCardDetailsSettingsSectionResponse4;
                case 5:
                    singleCardDetailsSettingsSectionResponse3 = this.nullableSingleCardDetailsSettingsSectionResponseAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    singleCardDetailsSettingsSectionResponse2 = singleCardDetailsSettingsSectionResponse6;
                    singleCardHeaderResponse = singleCardHeaderResponse2;
                    singleCarDetailsResponse = singleCarDetailsResponse2;
                    singleCardDetailsSettingsSectionResponse = singleCardDetailsSettingsSectionResponse4;
                case 6:
                    divDataDto2 = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    singleCardDetailsSettingsSectionResponse2 = singleCardDetailsSettingsSectionResponse6;
                    singleCardHeaderResponse = singleCardHeaderResponse2;
                    singleCarDetailsResponse = singleCarDetailsResponse2;
                    singleCardDetailsSettingsSectionResponse = singleCardDetailsSettingsSectionResponse4;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    singleCardDetailsSettingsSectionResponse2 = singleCardDetailsSettingsSectionResponse6;
                    singleCardHeaderResponse = singleCardHeaderResponse2;
                    singleCarDetailsResponse = singleCarDetailsResponse2;
                    singleCardDetailsSettingsSectionResponse = singleCardDetailsSettingsSectionResponse4;
                case 8:
                    snackbars = this.nullableSnackbarsAdapter.fromJson(jsonReader);
                    i2 &= -257;
                    singleCardDetailsSettingsSectionResponse2 = singleCardDetailsSettingsSectionResponse6;
                    singleCardHeaderResponse = singleCardHeaderResponse2;
                    singleCarDetailsResponse = singleCarDetailsResponse2;
                    singleCardDetailsSettingsSectionResponse = singleCardDetailsSettingsSectionResponse4;
                default:
                    singleCardDetailsSettingsSectionResponse2 = singleCardDetailsSettingsSectionResponse6;
                    singleCardHeaderResponse = singleCardHeaderResponse2;
                    singleCarDetailsResponse = singleCarDetailsResponse2;
                    singleCardDetailsSettingsSectionResponse = singleCardDetailsSettingsSectionResponse4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SingleCardResponse singleCardResponse) {
        SingleCardResponse singleCardResponse2 = singleCardResponse;
        if (singleCardResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.singleCardHeaderResponseAdapter.toJson(jsonWriter, (JsonWriter) singleCardResponse2.getHeader());
        jsonWriter.name("card_details");
        this.singleCarDetailsResponseAdapter.toJson(jsonWriter, (JsonWriter) singleCardResponse2.getCardDetails());
        jsonWriter.name("settings");
        this.singleCardDetailsSettingsSectionResponseAdapter.toJson(jsonWriter, (JsonWriter) singleCardResponse2.getSettings());
        jsonWriter.name("management_settings");
        this.singleCardDetailsSettingsSectionResponseAdapter.toJson(jsonWriter, (JsonWriter) singleCardResponse2.getManagementSettings());
        jsonWriter.name("notifications");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) singleCardResponse2.getNotificationDivData());
        jsonWriter.name("card_additional_setting");
        this.nullableSingleCardDetailsSettingsSectionResponseAdapter.toJson(jsonWriter, (JsonWriter) singleCardResponse2.getCardAdditionalSetting());
        jsonWriter.name("bottom_notification");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) singleCardResponse2.getBottomNotification());
        jsonWriter.name("show_requisites");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) singleCardResponse2.getShowRequisites());
        jsonWriter.name("snackbars");
        this.nullableSnackbarsAdapter.toJson(jsonWriter, (JsonWriter) singleCardResponse2.getSnackbars());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(SingleCardResponse)");
    }
}
