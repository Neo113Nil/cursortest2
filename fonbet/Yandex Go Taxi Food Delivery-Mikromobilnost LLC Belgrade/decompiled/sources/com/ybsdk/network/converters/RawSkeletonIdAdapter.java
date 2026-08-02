package com.ybsdk.network.converters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.ybsdk.feature.divkit.api.data.RawSkeletonId;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/network/converters/RawSkeletonIdAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/data/RawSkeletonId;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson-KoqVNRo", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;", "fromJson", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson-gsuilFU", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/String;)V", "toJson", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RawSkeletonIdAdapter extends JsonAdapter<RawSkeletonId> {
    public static final RawSkeletonIdAdapter a = new RawSkeletonIdAdapter();

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ RawSkeletonId fromJson(JsonReader jsonReader) {
        return RawSkeletonId.m431boximpl(m464fromJsonKoqVNRo(jsonReader));
    }

    @FromJson
    /* renamed from: fromJson-KoqVNRo, reason: not valid java name */
    public String m464fromJsonKoqVNRo(JsonReader reader) {
        return RawSkeletonId.m432constructorimpl(reader.nextString());
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, RawSkeletonId rawSkeletonId) {
        RawSkeletonId rawSkeletonId2 = rawSkeletonId;
        m465toJsongsuilFU(jsonWriter, rawSkeletonId2 != null ? rawSkeletonId2.m439unboximpl() : null);
    }

    @ToJson
    /* renamed from: toJson-gsuilFU, reason: not valid java name */
    public void m465toJsongsuilFU(JsonWriter writer, String value) {
        if (value != null) {
            writer.value(value);
        }
    }
}
