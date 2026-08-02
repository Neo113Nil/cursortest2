package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SingleCardHeaderResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardHeaderResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "coloredTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "cardSkinResponseAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "themedParameterOfStringAdapter", "nullableThemedParameterOfStringAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsHeaderDto;", "nullableSingleCardDetailsHeaderDtoAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingleCardHeaderResponseJsonAdapter extends JsonAdapter<SingleCardHeaderResponse> {
    private final JsonAdapter<CardSkinResponse> cardSkinResponseAdapter;
    private final JsonAdapter<ColoredTextDto> coloredTextDtoAdapter;
    private final JsonAdapter<SingleCardDetailsHeaderDto> nullableSingleCardDetailsHeaderDtoAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "card_skin", "nfc_badge", "badge_image", "rename_action");
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public SingleCardHeaderResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.coloredTextDtoAdapter = moshi.adapter(ColoredTextDto.class, emptySet, "title");
        this.cardSkinResponseAdapter = moshi.adapter(CardSkinResponse.class, emptySet, "skin");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "nfcBadge");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "badgeImage");
        this.nullableSingleCardDetailsHeaderDtoAdapter = moshi.adapter(SingleCardDetailsHeaderDto.class, emptySet, "renameAction");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SingleCardHeaderResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ColoredTextDto coloredTextDto = null;
        ColoredTextDto coloredTextDto2 = null;
        CardSkinResponse cardSkinResponse = null;
        ThemedParameter<String> themedParameter = null;
        ThemedParameter<String> themedParameter2 = null;
        SingleCardDetailsHeaderDto singleCardDetailsHeaderDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    coloredTextDto = this.coloredTextDtoAdapter.fromJson(jsonReader);
                    if (coloredTextDto == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    coloredTextDto2 = this.coloredTextDtoAdapter.fromJson(jsonReader);
                    if (coloredTextDto2 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    break;
                case 2:
                    cardSkinResponse = this.cardSkinResponseAdapter.fromJson(jsonReader);
                    if (cardSkinResponse == null) {
                        throw Util.unexpectedNull("skin", "card_skin", jsonReader);
                    }
                    break;
                case 3:
                    themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull("nfcBadge", "nfc_badge", jsonReader);
                    }
                    break;
                case 4:
                    themedParameter2 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    singleCardDetailsHeaderDto = this.nullableSingleCardDetailsHeaderDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (coloredTextDto == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (coloredTextDto2 == null) {
            throw Util.missingProperty("subtitle", "subtitle", jsonReader);
        }
        if (cardSkinResponse == null) {
            throw Util.missingProperty("skin", "card_skin", jsonReader);
        }
        if (themedParameter != null) {
            return new SingleCardHeaderResponse(coloredTextDto, coloredTextDto2, cardSkinResponse, themedParameter, themedParameter2, singleCardDetailsHeaderDto);
        }
        throw Util.missingProperty("nfcBadge", "nfc_badge", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SingleCardHeaderResponse singleCardHeaderResponse) {
        SingleCardHeaderResponse singleCardHeaderResponse2 = singleCardHeaderResponse;
        if (singleCardHeaderResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.coloredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) singleCardHeaderResponse2.getTitle());
        jsonWriter.name("subtitle");
        this.coloredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) singleCardHeaderResponse2.getSubtitle());
        jsonWriter.name("card_skin");
        this.cardSkinResponseAdapter.toJson(jsonWriter, (JsonWriter) singleCardHeaderResponse2.getSkin());
        jsonWriter.name("nfc_badge");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) singleCardHeaderResponse2.getNfcBadge());
        jsonWriter.name("badge_image");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) singleCardHeaderResponse2.getBadgeImage());
        jsonWriter.name("rename_action");
        this.nullableSingleCardDetailsHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) singleCardHeaderResponse2.getRenameAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(SingleCardHeaderResponse)");
    }
}
