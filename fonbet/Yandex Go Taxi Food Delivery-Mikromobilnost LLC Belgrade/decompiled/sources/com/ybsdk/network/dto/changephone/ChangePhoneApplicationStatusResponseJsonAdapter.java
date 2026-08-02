package com.ybsdk.network.dto.changephone;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.changephone.ChangePhoneApplicationStatusResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse$ChangePhoneStatus;", "changePhoneStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChangePhoneApplicationStatusResponseJsonAdapter extends JsonAdapter<ChangePhoneApplicationStatusResponse> {
    private final JsonAdapter<ChangePhoneApplicationStatusResponse.ChangePhoneStatus> changePhoneStatusAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "support_url");

    public ChangePhoneApplicationStatusResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.changePhoneStatusAdapter = moshi.adapter(ChangePhoneApplicationStatusResponse.ChangePhoneStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChangePhoneApplicationStatusResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ChangePhoneApplicationStatusResponse.ChangePhoneStatus changePhoneStatus = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                changePhoneStatus = this.changePhoneStatusAdapter.fromJson(jsonReader);
                if (changePhoneStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (changePhoneStatus != null) {
            return new ChangePhoneApplicationStatusResponse(changePhoneStatus, str, str2, str3);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChangePhoneApplicationStatusResponse changePhoneApplicationStatusResponse) {
        ChangePhoneApplicationStatusResponse changePhoneApplicationStatusResponse2 = changePhoneApplicationStatusResponse;
        if (changePhoneApplicationStatusResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.changePhoneStatusAdapter.toJson(jsonWriter, (JsonWriter) changePhoneApplicationStatusResponse2.getStatus());
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) changePhoneApplicationStatusResponse2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) changePhoneApplicationStatusResponse2.getDescription());
        jsonWriter.name("support_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) changePhoneApplicationStatusResponse2.getSupportUrl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(58, "GeneratedJsonAdapter(ChangePhoneApplicationStatusResponse)");
    }
}
