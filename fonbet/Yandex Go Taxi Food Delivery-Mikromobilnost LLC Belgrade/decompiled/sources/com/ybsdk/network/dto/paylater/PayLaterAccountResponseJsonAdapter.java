package com.ybsdk.network.dto.paylater;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.network.dto.paylater.PayLaterAccountResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/paylater/PayLaterAccountResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/paylater/PayLaterAccountResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/paylater/PayLaterAccountResponse$PreScoreResolution;", "preScoreResolutionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "nullableColoredTextDtoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayLaterAccountResponseJsonAdapter extends JsonAdapter<PayLaterAccountResponse> {
    private volatile Constructor<PayLaterAccountResponse> constructorRef;
    private final JsonAdapter<ColoredTextDto> nullableColoredTextDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("resolution", "url", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "description_type");
    private final JsonAdapter<PayLaterAccountResponse.PreScoreResolution> preScoreResolutionAdapter;
    private final JsonAdapter<String> stringAdapter;

    public PayLaterAccountResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.preScoreResolutionAdapter = moshi.adapter(PayLaterAccountResponse.PreScoreResolution.class, emptySet, "preScoreResolution");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "accountUrl");
        this.nullableColoredTextDtoAdapter = moshi.adapter(ColoredTextDto.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "descriptionType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PayLaterAccountResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PayLaterAccountResponse.PreScoreResolution preScoreResolution = null;
        String str = null;
        ColoredTextDto coloredTextDto = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                preScoreResolution = this.preScoreResolutionAdapter.fromJson(jsonReader);
                if (preScoreResolution == null) {
                    throw Util.unexpectedNull("preScoreResolution", "resolution", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("accountUrl", "url", jsonReader);
                }
            } else if (selectName == 2) {
                coloredTextDto = this.nullableColoredTextDtoAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -13) {
            if (preScoreResolution == null) {
                throw Util.missingProperty("preScoreResolution", "resolution", jsonReader);
            }
            if (str != null) {
                return new PayLaterAccountResponse(preScoreResolution, str, coloredTextDto, str2);
            }
            throw Util.missingProperty("accountUrl", "url", jsonReader);
        }
        Constructor<PayLaterAccountResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PayLaterAccountResponse.class.getDeclaredConstructor(PayLaterAccountResponse.PreScoreResolution.class, String.class, ColoredTextDto.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (preScoreResolution == null) {
            throw Util.missingProperty("preScoreResolution", "resolution", jsonReader);
        }
        if (str != null) {
            return constructor.newInstance(preScoreResolution, str, coloredTextDto, str2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("accountUrl", "url", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PayLaterAccountResponse payLaterAccountResponse) {
        PayLaterAccountResponse payLaterAccountResponse2 = payLaterAccountResponse;
        if (payLaterAccountResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("resolution");
        this.preScoreResolutionAdapter.toJson(jsonWriter, (JsonWriter) payLaterAccountResponse2.getPreScoreResolution());
        jsonWriter.name("url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) payLaterAccountResponse2.getAccountUrl());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableColoredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) payLaterAccountResponse2.getDescription());
        jsonWriter.name("description_type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) payLaterAccountResponse2.getDescriptionType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(PayLaterAccountResponse)");
    }
}
