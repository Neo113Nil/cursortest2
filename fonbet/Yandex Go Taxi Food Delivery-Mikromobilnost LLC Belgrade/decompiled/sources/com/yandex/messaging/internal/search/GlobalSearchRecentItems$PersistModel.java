package com.yandex.messaging.internal.search;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.tjt;
import java.util.List;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/yandex/messaging/internal/search/GlobalSearchRecentItems$PersistModel", "", "", "Ltjt;", "list", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getList", "()Ljava/util/List;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GlobalSearchRecentItems$PersistModel {
    public static final int $stable = 0;
    private final List<tjt> list;

    /* JADX WARN: Multi-variable type inference failed */
    public GlobalSearchRecentItems$PersistModel(@Json(name = "list") List<? extends tjt> list) {
        this.list = list;
    }

    public final List<tjt> getList() {
        return this.list;
    }
}
