package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.Ranking;
import defpackage.jl40;
import defpackage.oyr;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ(\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/internal/entities/ShareZeroSuggestParams;", "", "limit", "", "ranking", "", "Lcom/yandex/messaging/core/net/entities/Ranking;", "<init>", "(I[Lcom/yandex/messaging/core/net/entities/Ranking;)V", "getLimit", "()I", "getRanking", "()[Lcom/yandex/messaging/core/net/entities/Ranking;", "[Lcom/yandex/messaging/core/net/entities/Ranking;", "component1", "component2", "copy", "(I[Lcom/yandex/messaging/core/net/entities/Ranking;)Lcom/yandex/messaging/internal/entities/ShareZeroSuggestParams;", "equals", "", "other", "hashCode", "toString", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ShareZeroSuggestParams {
    public static final int $stable = 8;

    @Json(name = "limit")
    private final int limit;

    @Json(name = "ranking")
    private final Ranking[] ranking;

    public ShareZeroSuggestParams(int i, Ranking[] rankingArr) {
        this.limit = i;
        this.ranking = rankingArr;
    }

    public static /* synthetic */ ShareZeroSuggestParams copy$default(ShareZeroSuggestParams shareZeroSuggestParams, int i, Ranking[] rankingArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shareZeroSuggestParams.limit;
        }
        if ((i2 & 2) != 0) {
            rankingArr = shareZeroSuggestParams.ranking;
        }
        return shareZeroSuggestParams.copy(i, rankingArr);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component2, reason: from getter */
    public final Ranking[] getRanking() {
        return this.ranking;
    }

    public final ShareZeroSuggestParams copy(int limit, Ranking[] ranking) {
        return new ShareZeroSuggestParams(limit, ranking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareZeroSuggestParams)) {
            return false;
        }
        ShareZeroSuggestParams shareZeroSuggestParams = (ShareZeroSuggestParams) other;
        return this.limit == shareZeroSuggestParams.limit && jl40.l(this.ranking, shareZeroSuggestParams.ranking);
    }

    public final int getLimit() {
        return this.limit;
    }

    public final Ranking[] getRanking() {
        return this.ranking;
    }

    public int hashCode() {
        return Arrays.hashCode(this.ranking) + (Integer.hashCode(this.limit) * 31);
    }

    public String toString() {
        return oyr.l(this.limit, "ShareZeroSuggestParams(limit=", ", ranking=", Arrays.toString(this.ranking), Extension.C_BRAKE);
    }
}
