package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageRequest;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferDirectionType;", "transferDirectionTypeAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam;", "nullablePrerequisiteParamAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest$TransfersPageScenario;", "nullableTransfersPageScenarioAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransfersPageRequestJsonAdapter extends JsonAdapter<TransfersPageRequest> {
    private final JsonAdapter<PrerequisiteParam> nullablePrerequisiteParamAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TransfersPageRequest.TransfersPageScenario> nullableTransfersPageScenarioAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "direction", "prerequisite", "scenario");
    private final JsonAdapter<TransferDirectionType> transferDirectionTypeAdapter;

    public TransfersPageRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.transferDirectionTypeAdapter = moshi.adapter(TransferDirectionType.class, emptySet, "directionType");
        this.nullablePrerequisiteParamAdapter = moshi.adapter(PrerequisiteParam.class, emptySet, "prerequisites");
        this.nullableTransfersPageScenarioAdapter = moshi.adapter(TransfersPageRequest.TransfersPageScenario.class, emptySet, "scenario");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransfersPageRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        TransferDirectionType transferDirectionType = null;
        PrerequisiteParam prerequisiteParam = null;
        TransfersPageRequest.TransfersPageScenario transfersPageScenario = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                transferDirectionType = this.transferDirectionTypeAdapter.fromJson(jsonReader);
                if (transferDirectionType == null) {
                    throw Util.unexpectedNull("directionType", "direction", jsonReader);
                }
            } else if (selectName == 2) {
                prerequisiteParam = this.nullablePrerequisiteParamAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                transfersPageScenario = this.nullableTransfersPageScenarioAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (transferDirectionType != null) {
            return new TransfersPageRequest(str, transferDirectionType, prerequisiteParam, transfersPageScenario);
        }
        throw Util.missingProperty("directionType", "direction", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransfersPageRequest transfersPageRequest) {
        TransfersPageRequest transfersPageRequest2 = transfersPageRequest;
        if (transfersPageRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transfersPageRequest2.getAgreementId());
        jsonWriter.name("direction");
        this.transferDirectionTypeAdapter.toJson(jsonWriter, (JsonWriter) transfersPageRequest2.getDirectionType());
        jsonWriter.name("prerequisite");
        this.nullablePrerequisiteParamAdapter.toJson(jsonWriter, (JsonWriter) transfersPageRequest2.getPrerequisites());
        jsonWriter.name("scenario");
        this.nullableTransfersPageScenarioAdapter.toJson(jsonWriter, (JsonWriter) transfersPageRequest2.getScenario());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(TransfersPageRequest)");
    }
}
