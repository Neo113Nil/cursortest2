package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupSettingsRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupSettingsRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;", "nullableAutoTopupTypeRequestDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Ljava/math/BigDecimal;", "nullableBigDecimalAdapter", "", "intAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetAutoTopupSettingsRequestJsonAdapter extends JsonAdapter<GetAutoTopupSettingsRequest> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<AutoTopupTypeRequestDto> nullableAutoTopupTypeRequestDtoAdapter;
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("autotopup_type", "agreement_id", "autotopup_id", "amount", "threshold", "sessions_count_without_fullscreen");

    public GetAutoTopupSettingsRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableAutoTopupTypeRequestDtoAdapter = moshi.adapter(AutoTopupTypeRequestDto.class, emptySet, "autoTopupType");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.nullableBigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "amount");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "sessionsCountWithoutFullscreen");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetAutoTopupSettingsRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        AutoTopupTypeRequestDto autoTopupTypeRequestDto = null;
        String str = null;
        String str2 = null;
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    autoTopupTypeRequestDto = this.nullableAutoTopupTypeRequestDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bigDecimal = this.nullableBigDecimalAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bigDecimal2 = this.nullableBigDecimalAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (num != null) {
            return new GetAutoTopupSettingsRequest(autoTopupTypeRequestDto, str, str2, bigDecimal, bigDecimal2, num.intValue());
        }
        throw Util.missingProperty("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetAutoTopupSettingsRequest getAutoTopupSettingsRequest) {
        GetAutoTopupSettingsRequest getAutoTopupSettingsRequest2 = getAutoTopupSettingsRequest;
        if (getAutoTopupSettingsRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("autotopup_type");
        this.nullableAutoTopupTypeRequestDtoAdapter.toJson(jsonWriter, (JsonWriter) getAutoTopupSettingsRequest2.getAutoTopupType());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getAutoTopupSettingsRequest2.getAgreementId());
        jsonWriter.name("autotopup_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getAutoTopupSettingsRequest2.getAutoTopupId());
        jsonWriter.name("amount");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) getAutoTopupSettingsRequest2.getAmount());
        jsonWriter.name("threshold");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) getAutoTopupSettingsRequest2.getThreshold());
        jsonWriter.name("sessions_count_without_fullscreen");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(getAutoTopupSettingsRequest2.getSessionsCountWithoutFullscreen()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(GetAutoTopupSettingsRequest)");
    }
}
