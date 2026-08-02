package com.ybsdk.network.dto.skeletons;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.data.RawSkeletonId;
import com.ybsdk.feature.divkit.api.data.SkeletonAliases;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/skeletons/SkeletonsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/skeletons/SkeletonsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/network/dto/skeletons/SkeletonItem;", "listOfSkeletonItemAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/data/RawSkeletonId;", "listOfRawSkeletonIdAdapter", "Lcom/ybsdk/feature/divkit/api/data/SkeletonAliases;", "nullableSkeletonAliasesAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkeletonsResponseJsonAdapter extends JsonAdapter<SkeletonsResponse> {
    private final JsonAdapter<List<RawSkeletonId>> listOfRawSkeletonIdAdapter;
    private final JsonAdapter<List<SkeletonItem>> listOfSkeletonItemAdapter;
    private final JsonAdapter<SkeletonAliases> nullableSkeletonAliasesAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("skeletons", "skeletons_to_delete", "aliases");

    public SkeletonsResponseJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, SkeletonItem.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfSkeletonItemAdapter = moshi.adapter(newParameterizedType, emptySet, "skeletons");
        this.listOfRawSkeletonIdAdapter = moshi.adapter(Types.newParameterizedType(List.class, RawSkeletonId.class), emptySet, "skeletonsToDelete");
        this.nullableSkeletonAliasesAdapter = moshi.adapter(SkeletonAliases.class, emptySet, "aliases");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SkeletonsResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<SkeletonItem> list = null;
        List<RawSkeletonId> list2 = null;
        SkeletonAliases skeletonAliases = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfSkeletonItemAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("skeletons", "skeletons", jsonReader);
                }
            } else if (selectName == 1) {
                list2 = this.listOfRawSkeletonIdAdapter.fromJson(jsonReader);
                if (list2 == null) {
                    throw Util.unexpectedNull("skeletonsToDelete", "skeletons_to_delete", jsonReader);
                }
            } else if (selectName == 2) {
                skeletonAliases = this.nullableSkeletonAliasesAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("skeletons", "skeletons", jsonReader);
        }
        if (list2 != null) {
            return new SkeletonsResponse(list, list2, skeletonAliases);
        }
        throw Util.missingProperty("skeletonsToDelete", "skeletons_to_delete", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SkeletonsResponse skeletonsResponse) {
        SkeletonsResponse skeletonsResponse2 = skeletonsResponse;
        if (skeletonsResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("skeletons");
        this.listOfSkeletonItemAdapter.toJson(jsonWriter, (JsonWriter) skeletonsResponse2.getSkeletons());
        jsonWriter.name("skeletons_to_delete");
        this.listOfRawSkeletonIdAdapter.toJson(jsonWriter, (JsonWriter) skeletonsResponse2.getSkeletonsToDelete());
        jsonWriter.name("aliases");
        this.nullableSkeletonAliasesAdapter.toJson(jsonWriter, (JsonWriter) skeletonsResponse2.getAliases());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(SkeletonsResponse)");
    }
}
