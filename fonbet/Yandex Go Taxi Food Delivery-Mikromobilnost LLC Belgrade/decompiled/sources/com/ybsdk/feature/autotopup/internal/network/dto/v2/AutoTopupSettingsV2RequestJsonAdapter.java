package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR(\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Request;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "nullableBigDecimalAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ShowOnly;", "nullableAutoTopupSettingsV2ShowOnlyAdapter", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "nullableCommunicationsShownInfoDtoAdapter", "", "intAdapter", "", "", "nullableMapOfStringAnyAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingsV2RequestJsonAdapter extends JsonAdapter<AutoTopupSettingsV2Request> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<AutoTopupSettingsV2ShowOnly> nullableAutoTopupSettingsV2ShowOnlyAdapter;
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;
    private final JsonAdapter<CommunicationsShownInfoDto> nullableCommunicationsShownInfoDtoAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "source", "autotopup_id", "amount", "threshold", "limit", "show_only", "initial_deeplink", "communications_shown_info", "sessions_count_without_fullscreen", "additional_data");

    public AutoTopupSettingsV2RequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.nullableBigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "amount");
        this.nullableAutoTopupSettingsV2ShowOnlyAdapter = moshi.adapter(AutoTopupSettingsV2ShowOnly.class, emptySet, "showOnly");
        this.nullableCommunicationsShownInfoDtoAdapter = moshi.adapter(CommunicationsShownInfoDto.class, emptySet, "communicationsShownInfo");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "sessionsCountWithoutFullscreen");
        this.nullableMapOfStringAnyAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), emptySet, "additionalData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupSettingsV2Request fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal2 = null;
        BigDecimal bigDecimal3 = null;
        AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly = null;
        String str4 = null;
        CommunicationsShownInfoDto communicationsShownInfoDto = null;
        Map<String, Object> map = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bigDecimal = this.nullableBigDecimalAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bigDecimal2 = this.nullableBigDecimalAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bigDecimal3 = this.nullableBigDecimalAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    autoTopupSettingsV2ShowOnly = this.nullableAutoTopupSettingsV2ShowOnlyAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    communicationsShownInfoDto = this.nullableCommunicationsShownInfoDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
                    }
                    break;
                case 10:
                    map = this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (num != null) {
            return new AutoTopupSettingsV2Request(str, str2, str3, bigDecimal, bigDecimal2, bigDecimal3, autoTopupSettingsV2ShowOnly, str4, communicationsShownInfoDto, num.intValue(), map);
        }
        throw Util.missingProperty("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupSettingsV2Request autoTopupSettingsV2Request) {
        AutoTopupSettingsV2Request autoTopupSettingsV2Request2 = autoTopupSettingsV2Request;
        if (autoTopupSettingsV2Request2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Request2.getAgreementId());
        jsonWriter.name("source");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Request2.getSource());
        jsonWriter.name("autotopup_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Request2.getAutotopupId());
        jsonWriter.name("amount");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Request2.getAmount());
        jsonWriter.name("threshold");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Request2.getThreshold());
        jsonWriter.name("limit");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Request2.getLimit());
        jsonWriter.name("show_only");
        this.nullableAutoTopupSettingsV2ShowOnlyAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Request2.getShowOnly());
        jsonWriter.name("initial_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Request2.getInitialDeeplink());
        jsonWriter.name("communications_shown_info");
        this.nullableCommunicationsShownInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Request2.getCommunicationsShownInfo());
        jsonWriter.name("sessions_count_without_fullscreen");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(autoTopupSettingsV2Request2.getSessionsCountWithoutFullscreen()));
        jsonWriter.name("additional_data");
        this.nullableMapOfStringAnyAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Request2.getAdditionalData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(AutoTopupSettingsV2Request)");
    }
}
