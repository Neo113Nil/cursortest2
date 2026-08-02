package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/B2cTransferPayloadDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/B2cTransferPayloadDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class B2cTransferPayloadDtoJsonAdapter extends JsonAdapter<B2cTransferPayloadDto> {
    private volatile Constructor<B2cTransferPayloadDto> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "bank_id", "receiver_phone", "repayment_plan_token");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public B2cTransferPayloadDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Themes.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themesOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "image");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final B2cTransferPayloadDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        Themes<String> themes = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -57) {
            String str6 = str5;
            String str7 = str4;
            String str8 = str3;
            String str9 = str2;
            String str10 = str;
            Themes<String> themes2 = themes;
            if (themes2 == null) {
                throw Util.missingProperty("image", "image", jsonReader);
            }
            if (str10 != null) {
                return new B2cTransferPayloadDto(themes2, str10, str9, str8, str7, str6);
            }
            throw Util.missingProperty("title", "title", jsonReader);
        }
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        String str15 = str;
        Themes<String> themes3 = themes;
        Constructor<B2cTransferPayloadDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = B2cTransferPayloadDto.class.getDeclaredConstructor(Themes.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<B2cTransferPayloadDto> constructor2 = constructor;
        if (themes3 == null) {
            throw Util.missingProperty("image", "image", jsonReader);
        }
        if (str15 != null) {
            return constructor2.newInstance(themes3, str15, str14, str13, str12, str11, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, B2cTransferPayloadDto b2cTransferPayloadDto) {
        B2cTransferPayloadDto b2cTransferPayloadDto2 = b2cTransferPayloadDto;
        if (b2cTransferPayloadDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) b2cTransferPayloadDto2.getImage());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) b2cTransferPayloadDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) b2cTransferPayloadDto2.getDescription());
        jsonWriter.name("bank_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) b2cTransferPayloadDto2.getBankId());
        jsonWriter.name("receiver_phone");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) b2cTransferPayloadDto2.getReceiverPhone());
        jsonWriter.name("repayment_plan_token");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) b2cTransferPayloadDto2.getRepaymentPlanToken());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(B2cTransferPayloadDto)");
    }
}
