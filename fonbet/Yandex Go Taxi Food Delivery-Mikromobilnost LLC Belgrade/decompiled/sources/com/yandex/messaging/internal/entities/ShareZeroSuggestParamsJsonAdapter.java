package com.yandex.messaging.internal.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.Ranking;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/internal/entities/ShareZeroSuggestParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/entities/ShareZeroSuggestParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/yandex/messaging/core/net/entities/Ranking;", "arrayOfRankingAdapter", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShareZeroSuggestParamsJsonAdapter extends JsonAdapter<ShareZeroSuggestParams> {
    public static final int $stable = 8;
    private final JsonAdapter<Ranking[]> arrayOfRankingAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("limit", "ranking");

    public ShareZeroSuggestParamsJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "limit");
        this.arrayOfRankingAdapter = moshi.adapter(Types.arrayOf(Ranking.class), emptySet, "ranking");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ShareZeroSuggestParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Ranking[] rankingArr = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("limit", "limit", jsonReader);
                }
            } else if (selectName == 1 && (rankingArr = this.arrayOfRankingAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("ranking", "ranking", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("limit", "limit", jsonReader);
        }
        int intValue = num.intValue();
        if (rankingArr != null) {
            return new ShareZeroSuggestParams(intValue, rankingArr);
        }
        throw Util.missingProperty("ranking", "ranking", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ShareZeroSuggestParams shareZeroSuggestParams) {
        ShareZeroSuggestParams shareZeroSuggestParams2 = shareZeroSuggestParams;
        if (shareZeroSuggestParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(shareZeroSuggestParams2.getLimit()));
        jsonWriter.name("ranking");
        this.arrayOfRankingAdapter.toJson(jsonWriter, (JsonWriter) shareZeroSuggestParams2.getRanking());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(ShareZeroSuggestParams)");
    }
}
