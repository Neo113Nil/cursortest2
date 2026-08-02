package com.ybsdk.feature.autotopup.internal.network.dto.rounding;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSaveRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSaveRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingStatusDto;", "roundingStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "hmacDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoundingSaveRequestJsonAdapter extends JsonAdapter<RoundingSaveRequest> {
    private final JsonAdapter<HmacDto> hmacDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "target_agreement_id", "source_agreement_id", "step_id", "hmac");
    private final JsonAdapter<RoundingStatusDto> roundingStatusDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public RoundingSaveRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.roundingStatusDtoAdapter = moshi.adapter(RoundingStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "targetAgreementId");
        this.hmacDtoAdapter = moshi.adapter(HmacDto.class, emptySet, "hmac");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RoundingSaveRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RoundingStatusDto roundingStatusDto = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        HmacDto hmacDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            RoundingStatusDto roundingStatusDto2 = roundingStatusDto;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                roundingStatusDto = this.roundingStatusDtoAdapter.fromJson(jsonReader);
                if (roundingStatusDto == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("targetAgreementId", "target_agreement_id", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("sourceAgreementId", "source_agreement_id", jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("stepId", "step_id", jsonReader);
                }
            } else if (selectName == 4 && (hmacDto = this.hmacDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("hmac", "hmac", jsonReader);
            }
            roundingStatusDto = roundingStatusDto2;
        }
        RoundingStatusDto roundingStatusDto3 = roundingStatusDto;
        jsonReader.endObject();
        if (roundingStatusDto3 == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("targetAgreementId", "target_agreement_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("sourceAgreementId", "source_agreement_id", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("stepId", "step_id", jsonReader);
        }
        if (hmacDto != null) {
            return new RoundingSaveRequest(roundingStatusDto3, str, str2, str3, hmacDto);
        }
        throw Util.missingProperty("hmac", "hmac", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RoundingSaveRequest roundingSaveRequest) {
        RoundingSaveRequest roundingSaveRequest2 = roundingSaveRequest;
        if (roundingSaveRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.roundingStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSaveRequest2.getStatus());
        jsonWriter.name("target_agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) roundingSaveRequest2.getTargetAgreementId());
        jsonWriter.name("source_agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) roundingSaveRequest2.getSourceAgreementId());
        jsonWriter.name("step_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) roundingSaveRequest2.getStepId());
        jsonWriter.name("hmac");
        this.hmacDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSaveRequest2.getHmac());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(RoundingSaveRequest)");
    }
}
