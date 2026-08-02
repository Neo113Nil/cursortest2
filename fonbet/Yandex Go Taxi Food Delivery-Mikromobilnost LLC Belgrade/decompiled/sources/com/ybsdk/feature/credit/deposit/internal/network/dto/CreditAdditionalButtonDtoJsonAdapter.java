package com.ybsdk.feature.credit.deposit.internal.network.dto;

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
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditAdditionalButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditAdditionalButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "coloredTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableColoredTextDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "themedParameterOfStringAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditAdditionalButtonDtoJsonAdapter extends JsonAdapter<CreditAdditionalButtonDto> {
    private final JsonAdapter<ColoredTextDto> coloredTextDtoAdapter;
    private volatile Constructor<CreditAdditionalButtonDto> constructorRef;
    private final JsonAdapter<ColoredTextDto> nullableColoredTextDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "action");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public CreditAdditionalButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.coloredTextDtoAdapter = moshi.adapter(ColoredTextDto.class, emptySet, "title");
        this.nullableColoredTextDtoAdapter = moshi.adapter(ColoredTextDto.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "image");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "action");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditAdditionalButtonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ColoredTextDto coloredTextDto = null;
        ColoredTextDto coloredTextDto2 = null;
        ThemedParameter<String> themedParameter = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                coloredTextDto = this.coloredTextDtoAdapter.fromJson(jsonReader);
                if (coloredTextDto == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                coloredTextDto2 = this.nullableColoredTextDtoAdapter.fromJson(jsonReader);
                i = -3;
            } else if (selectName == 2) {
                themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                if (themedParameter == null) {
                    throw Util.unexpectedNull("image", "image", jsonReader);
                }
            } else if (selectName == 3 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("action", "action", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (coloredTextDto == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (themedParameter == null) {
                throw Util.missingProperty("image", "image", jsonReader);
            }
            if (str != null) {
                return new CreditAdditionalButtonDto(coloredTextDto, coloredTextDto2, themedParameter, str);
            }
            throw Util.missingProperty("action", "action", jsonReader);
        }
        Constructor<CreditAdditionalButtonDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CreditAdditionalButtonDto.class.getDeclaredConstructor(ColoredTextDto.class, ColoredTextDto.class, ThemedParameter.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (coloredTextDto == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (themedParameter == null) {
            throw Util.missingProperty("image", "image", jsonReader);
        }
        if (str != null) {
            return constructor.newInstance(coloredTextDto, coloredTextDto2, themedParameter, str, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditAdditionalButtonDto creditAdditionalButtonDto) {
        CreditAdditionalButtonDto creditAdditionalButtonDto2 = creditAdditionalButtonDto;
        if (creditAdditionalButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.coloredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) creditAdditionalButtonDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableColoredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) creditAdditionalButtonDto2.getDescription());
        jsonWriter.name("image");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) creditAdditionalButtonDto2.getImage());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditAdditionalButtonDto2.getAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(CreditAdditionalButtonDto)");
    }
}
