package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/CameraPageContentResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/kyc/internal/network/dto/CameraPageContentResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/kyc/internal/network/dto/CameraPageContentDto;", "listOfCameraPageContentDtoAdapter", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraPageContentResponseJsonAdapter extends JsonAdapter<CameraPageContentResponse> {
    private final JsonAdapter<List<CameraPageContentDto>> listOfCameraPageContentDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("finish_scenario_deeplink", "content");
    private final JsonAdapter<String> stringAdapter;

    public CameraPageContentResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "finishScenarioDeeplink");
        this.listOfCameraPageContentDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, CameraPageContentDto.class), emptySet, "content");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CameraPageContentResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<CameraPageContentDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("finishScenarioDeeplink", "finish_scenario_deeplink", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfCameraPageContentDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("content", "content", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("finishScenarioDeeplink", "finish_scenario_deeplink", jsonReader);
        }
        if (list != null) {
            return new CameraPageContentResponse(str, list);
        }
        throw Util.missingProperty("content", "content", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CameraPageContentResponse cameraPageContentResponse) {
        CameraPageContentResponse cameraPageContentResponse2 = cameraPageContentResponse;
        if (cameraPageContentResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("finish_scenario_deeplink");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentResponse2.getFinishScenarioDeeplink());
        jsonWriter.name("content");
        this.listOfCameraPageContentDtoAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentResponse2.getContent());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(CameraPageContentResponse)");
    }
}
