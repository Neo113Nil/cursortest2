package com.ybsdk.network.dto.topup;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import com.ybsdk.network.dto.topup.TopupInfoResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/topup/TopupInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/topup/TopupInfoResponse$Limit;", "nullableLimitAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "", "stringAdapter", "", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto;", "nullableListOfWidgetDtoAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopupInfoResponseJsonAdapter extends JsonAdapter<TopupInfoResponse> {
    private final JsonAdapter<TopupInfoResponse.Limit> nullableLimitAdapter;
    private final JsonAdapter<List<WidgetDto>> nullableListOfWidgetDtoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("min_limit", "max_limit", "default_value", "fee_message", "widgets");
    private final JsonAdapter<String> stringAdapter;

    public TopupInfoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableLimitAdapter = moshi.adapter(TopupInfoResponse.Limit.class, emptySet, "minLimit");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "defaultValue");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "feeMessage");
        this.nullableListOfWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, WidgetDto.class), emptySet, "widgets");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TopupInfoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TopupInfoResponse.Limit limit = null;
        TopupInfoResponse.Limit limit2 = null;
        Money money = null;
        String str = null;
        List<WidgetDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                limit = this.nullableLimitAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                limit2 = this.nullableLimitAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                money = this.nullableMoneyAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("feeMessage", "fee_message", jsonReader);
                }
            } else if (selectName == 4) {
                list = this.nullableListOfWidgetDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new TopupInfoResponse(limit, limit2, money, str, list);
        }
        throw Util.missingProperty("feeMessage", "fee_message", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TopupInfoResponse topupInfoResponse) {
        TopupInfoResponse topupInfoResponse2 = topupInfoResponse;
        if (topupInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("min_limit");
        this.nullableLimitAdapter.toJson(jsonWriter, (JsonWriter) topupInfoResponse2.getMinLimit());
        jsonWriter.name("max_limit");
        this.nullableLimitAdapter.toJson(jsonWriter, (JsonWriter) topupInfoResponse2.getMaxLimit());
        jsonWriter.name("default_value");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) topupInfoResponse2.getDefaultValue());
        jsonWriter.name("fee_message");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) topupInfoResponse2.getFeeMessage());
        jsonWriter.name("widgets");
        this.nullableListOfWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) topupInfoResponse2.getWidgets());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(TopupInfoResponse)");
    }
}
