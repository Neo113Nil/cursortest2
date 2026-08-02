package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingThemeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingTheme;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardClaimingThemeJsonAdapter extends JsonAdapter<CardClaimingTheme> {
    private final JsonReader.Options options = JsonReader.Options.of("card_skin_image_url", "input_header_color", "input_placeholder_color", "input_background_color", "input_text_color_focus", "input_text_color_unfocus");
    private final JsonAdapter<String> stringAdapter;

    public CardClaimingThemeJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "cardSkin");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CardClaimingTheme fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            String str10 = str4;
            if (!jsonReader.hasNext()) {
                String str11 = str5;
                jsonReader.endObject();
                if (str7 == null) {
                    throw Util.missingProperty("cardSkin", "card_skin_image_url", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("inputHeaderColor", "input_header_color", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("inputPlaceholderColor", "input_placeholder_color", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("inputBackgroundColor", "input_background_color", jsonReader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("inputTextColorFocus", "input_text_color_focus", jsonReader);
                }
                if (str6 != null) {
                    return new CardClaimingTheme(str7, str8, str9, str10, str11, str6);
                }
                throw Util.missingProperty("inputTextColorUnfocus", "input_text_color_unfocus", jsonReader);
            }
            String str12 = str5;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("cardSkin", "card_skin_image_url", jsonReader);
                    }
                    str5 = str12;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("inputHeaderColor", "input_header_color", jsonReader);
                    }
                    str5 = str12;
                    str = str7;
                    str3 = str9;
                    str4 = str10;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("inputPlaceholderColor", "input_placeholder_color", jsonReader);
                    }
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str4 = str10;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("inputBackgroundColor", "input_background_color", jsonReader);
                    }
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("inputTextColorFocus", "input_text_color_focus", jsonReader);
                    }
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                case 5:
                    str6 = this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("inputTextColorUnfocus", "input_text_color_unfocus", jsonReader);
                    }
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                default:
                    str5 = str12;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CardClaimingTheme cardClaimingTheme) {
        CardClaimingTheme cardClaimingTheme2 = cardClaimingTheme;
        if (cardClaimingTheme2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("card_skin_image_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingTheme2.getCardSkin());
        jsonWriter.name("input_header_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingTheme2.getInputHeaderColor());
        jsonWriter.name("input_placeholder_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingTheme2.getInputPlaceholderColor());
        jsonWriter.name("input_background_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingTheme2.getInputBackgroundColor());
        jsonWriter.name("input_text_color_focus");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingTheme2.getInputTextColorFocus());
        jsonWriter.name("input_text_color_unfocus");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingTheme2.getInputTextColorUnfocus());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(CardClaimingTheme)");
    }
}
