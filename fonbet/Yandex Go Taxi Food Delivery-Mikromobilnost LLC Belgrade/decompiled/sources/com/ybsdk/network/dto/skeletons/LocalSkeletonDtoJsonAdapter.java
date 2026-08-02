package com.ybsdk.network.dto.skeletons;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.data.RawSkeletonId;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/network/dto/skeletons/LocalSkeletonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/skeletons/LocalSkeletonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/data/RawSkeletonId;", "rawSkeletonIdAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalSkeletonDtoJsonAdapter extends JsonAdapter<LocalSkeletonDto> {
    private final JsonReader.Options options = JsonReader.Options.of("skeleton_id", "hash");
    private final JsonAdapter<RawSkeletonId> rawSkeletonIdAdapter;
    private final JsonAdapter<String> stringAdapter;

    public LocalSkeletonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.rawSkeletonIdAdapter = moshi.adapter(RawSkeletonId.class, emptySet, "skeletonId");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "hash");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final LocalSkeletonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                RawSkeletonId fromJson = this.rawSkeletonIdAdapter.fromJson(jsonReader);
                str = fromJson != null ? fromJson.m439unboximpl() : null;
                if (str == null) {
                    throw Util.unexpectedNull("skeletonId", "skeleton_id", jsonReader);
                }
            } else if (selectName == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("hash", "hash", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("skeletonId", "skeleton_id", jsonReader);
        }
        if (str2 != null) {
            return new LocalSkeletonDto(str, str2, null);
        }
        throw Util.missingProperty("hash", "hash", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, LocalSkeletonDto localSkeletonDto) {
        LocalSkeletonDto localSkeletonDto2 = localSkeletonDto;
        if (localSkeletonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("skeleton_id");
        this.rawSkeletonIdAdapter.toJson(jsonWriter, (JsonWriter) RawSkeletonId.m431boximpl(localSkeletonDto2.m469getSkeletonId6QunHn0()));
        jsonWriter.name("hash");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) localSkeletonDto2.getHash());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(LocalSkeletonDto)");
    }
}
