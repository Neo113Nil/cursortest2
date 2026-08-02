package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/rconfig/configs/BackgroundJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/Background;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "nullableThemedParameterOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "themedParameterOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BackgroundJsonAdapter extends JsonAdapter<Background> {
    private volatile Constructor<Background> constructorRef;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", "color");
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public BackgroundJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(ThemedParameter.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "image");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "color");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Background fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedParameter<String> themedParameter = null;
        ThemedParameter<String> themedParameter2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themedParameter = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                i = -2;
            } else if (selectName == 1 && (themedParameter2 = this.themedParameterOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("color", "color", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            if (themedParameter2 != null) {
                return new Background(themedParameter, themedParameter2);
            }
            throw Util.missingProperty("color", "color", jsonReader);
        }
        Constructor<Background> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Background.class.getDeclaredConstructor(ThemedParameter.class, ThemedParameter.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (themedParameter2 != null) {
            return constructor.newInstance(themedParameter, themedParameter2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("color", "color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Background background) {
        Background background2 = background;
        if (background2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) background2.getImage());
        jsonWriter.name("color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) background2.getColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(Background)");
    }
}
