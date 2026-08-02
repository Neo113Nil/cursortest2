package com.yandex.go.search.model;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/search/model/DecideLaterConfig;", "Ljava/io/Serializable;", "", "isZeroSuggestTop", "Z", "isSearchResultBottom", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DecideLaterConfig implements Serializable {
    public static final DecideLaterConfig a = new DecideLaterConfig(false, false);
    public final boolean isSearchResultBottom;
    public final boolean isZeroSuggestTop;

    public DecideLaterConfig(boolean z, boolean z2) {
        this.isZeroSuggestTop = z;
        this.isSearchResultBottom = z2;
    }

    public DecideLaterConfig() {
        this(false, false);
    }
}
