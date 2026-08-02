package com.yandex.messaging.internal.entities;

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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/internal/entities/ShareZeroSuggestResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/entities/ShareZeroSuggestResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/yandex/messaging/internal/entities/ShareItem;", "listOfShareItemAdapter", "Lcom/squareup/moshi/JsonAdapter;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShareZeroSuggestResponseJsonAdapter extends JsonAdapter<ShareZeroSuggestResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<List<ShareItem>> listOfShareItemAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("items");

    public ShareZeroSuggestResponseJsonAdapter(Moshi moshi) {
        this.listOfShareItemAdapter = moshi.adapter(Types.newParameterizedType(List.class, ShareItem.class), EmptySet.a, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ShareZeroSuggestResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<ShareItem> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (list = this.listOfShareItemAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("items", "items", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new ShareZeroSuggestResponse(list);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ShareZeroSuggestResponse shareZeroSuggestResponse) {
        ShareZeroSuggestResponse shareZeroSuggestResponse2 = shareZeroSuggestResponse;
        if (shareZeroSuggestResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("items");
        this.listOfShareItemAdapter.toJson(jsonWriter, (JsonWriter) shareZeroSuggestResponse2.getItems());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(ShareZeroSuggestResponse)");
    }
}
