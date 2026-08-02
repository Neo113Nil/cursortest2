package com.ybsdk.rconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/CardLandingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/CardLanding;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardLandingJsonAdapter extends JsonAdapter<CardLanding> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_native_card_landing_enabled", "landing_url");
    private final JsonAdapter<String> stringAdapter;

    public CardLandingJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isNativeCardLandingEnabled");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "url");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CardLanding fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isNativeCardLandingEnabled", "is_native_card_landing_enabled", jsonReader);
                }
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("url", "landing_url", jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty("isNativeCardLandingEnabled", "is_native_card_landing_enabled", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (str != null) {
            return new CardLanding(booleanValue, str);
        }
        throw Util.missingProperty("url", "landing_url", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CardLanding cardLanding) {
        CardLanding cardLanding2 = cardLanding;
        if (cardLanding2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_native_card_landing_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(cardLanding2.isNativeCardLandingEnabled()));
        jsonWriter.name("landing_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardLanding2.getUrl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(CardLanding)");
    }
}
