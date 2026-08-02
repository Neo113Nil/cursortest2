package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/core/net/entities/RecommendedUsersParams;", "", "<init>", "()V", "limit", "", "getLimit", "()I", "setLimit", "(I)V", "sort", "", "getSort", "()Ljava/lang/String;", "setSort", "(Ljava/lang/String;)V", "ranking", "", "Lcom/yandex/messaging/core/net/entities/Ranking;", "getRanking", "()[Lcom/yandex/messaging/core/net/entities/Ranking;", "setRanking", "([Lcom/yandex/messaging/core/net/entities/Ranking;)V", "[Lcom/yandex/messaging/core/net/entities/Ranking;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RecommendedUsersParams {

    @Json(name = "limit")
    private int limit = 20;

    @Json(name = "ranking")
    private Ranking[] ranking;

    @Json(name = "sort")
    private String sort;

    public final int getLimit() {
        return this.limit;
    }

    public final Ranking[] getRanking() {
        return this.ranking;
    }

    public final String getSort() {
        return this.sort;
    }

    public final void setLimit(int i) {
        this.limit = i;
    }

    public final void setRanking(Ranking[] rankingArr) {
        this.ranking = rankingArr;
    }

    public final void setSort(String str) {
        this.sort = str;
    }
}
