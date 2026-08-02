package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/RecommendedUsersParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/RecommendedUsersParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "Lcom/yandex/messaging/core/net/entities/Ranking;", "nullableArrayOfRankingAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RecommendedUsersParamsJsonAdapter extends JsonAdapter<RecommendedUsersParams> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Ranking[]> nullableArrayOfRankingAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("limit", "sort", "ranking");

    public RecommendedUsersParamsJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "limit");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "sort");
        this.nullableArrayOfRankingAdapter = moshi.adapter(Types.arrayOf(Ranking.class), emptySet, "ranking");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RecommendedUsersParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Ranking[] rankingArr = null;
        boolean z = false;
        boolean z2 = false;
        String str = null;
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
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                z = true;
            } else if (selectName == 2) {
                rankingArr = this.nullableArrayOfRankingAdapter.fromJson(jsonReader);
                z2 = true;
            }
        }
        jsonReader.endObject();
        RecommendedUsersParams recommendedUsersParams = new RecommendedUsersParams();
        recommendedUsersParams.setLimit(num != null ? num.intValue() : recommendedUsersParams.getLimit());
        if (z) {
            recommendedUsersParams.setSort(str);
        }
        if (z2) {
            recommendedUsersParams.setRanking(rankingArr);
        }
        return recommendedUsersParams;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RecommendedUsersParams recommendedUsersParams) {
        RecommendedUsersParams recommendedUsersParams2 = recommendedUsersParams;
        if (recommendedUsersParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(recommendedUsersParams2.getLimit()));
        jsonWriter.name("sort");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) recommendedUsersParams2.getSort());
        jsonWriter.name("ranking");
        this.nullableArrayOfRankingAdapter.toJson(jsonWriter, (JsonWriter) recommendedUsersParams2.getRanking());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(RecommendedUsersParams)");
    }
}
