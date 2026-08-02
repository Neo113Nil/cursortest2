package com.ybsdk.network.dto.topup;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import com.ybsdk.network.dto.topup.TopupInfoResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupInfoResponse_LimitJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/topup/TopupInfoResponse$Limit;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "moneyCommonResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopupInfoResponse_LimitJsonAdapter extends JsonAdapter<TopupInfoResponse.Limit> {
    private final JsonAdapter<MoneyCommonResponse> moneyCommonResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("money", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    private final JsonAdapter<String> stringAdapter;

    public TopupInfoResponse_LimitJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.moneyCommonResponseAdapter = moshi.adapter(MoneyCommonResponse.class, emptySet, "money");
        this.stringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TopupInfoResponse.Limit fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        MoneyCommonResponse moneyCommonResponse = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                moneyCommonResponse = this.moneyCommonResponseAdapter.fromJson(jsonReader);
                if (moneyCommonResponse == null) {
                    throw Util.unexpectedNull("money", "money", jsonReader);
                }
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
            }
        }
        jsonReader.endObject();
        if (moneyCommonResponse == null) {
            throw Util.missingProperty("money", "money", jsonReader);
        }
        if (str != null) {
            return new TopupInfoResponse.Limit(moneyCommonResponse, str);
        }
        throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TopupInfoResponse.Limit limit) {
        TopupInfoResponse.Limit limit2 = limit;
        if (limit2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("money");
        this.moneyCommonResponseAdapter.toJson(jsonWriter, (JsonWriter) limit2.getMoney());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) limit2.getDescription());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(TopupInfoResponse.Limit)");
    }
}
