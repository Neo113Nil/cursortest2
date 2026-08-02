package com.yandex.messaging.paging;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/messaging/paging/PagedLoader$LoadState", "", "Lcom/yandex/messaging/paging/PagedLoader$LoadState;", "IDLE", "LOADING", "ERROR", "COMPLETE", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PagedLoader$LoadState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PagedLoader$LoadState[] $VALUES;
    public static final PagedLoader$LoadState COMPLETE;
    public static final PagedLoader$LoadState ERROR;
    public static final PagedLoader$LoadState IDLE;
    public static final PagedLoader$LoadState LOADING;

    static {
        PagedLoader$LoadState pagedLoader$LoadState = new PagedLoader$LoadState("IDLE", 0);
        IDLE = pagedLoader$LoadState;
        PagedLoader$LoadState pagedLoader$LoadState2 = new PagedLoader$LoadState("LOADING", 1);
        LOADING = pagedLoader$LoadState2;
        PagedLoader$LoadState pagedLoader$LoadState3 = new PagedLoader$LoadState("ERROR", 2);
        ERROR = pagedLoader$LoadState3;
        PagedLoader$LoadState pagedLoader$LoadState4 = new PagedLoader$LoadState("COMPLETE", 3);
        COMPLETE = pagedLoader$LoadState4;
        PagedLoader$LoadState[] pagedLoader$LoadStateArr = {pagedLoader$LoadState, pagedLoader$LoadState2, pagedLoader$LoadState3, pagedLoader$LoadState4};
        $VALUES = pagedLoader$LoadStateArr;
        $ENTRIES = a.a(pagedLoader$LoadStateArr);
    }

    public static PagedLoader$LoadState valueOf(String str) {
        return (PagedLoader$LoadState) Enum.valueOf(PagedLoader$LoadState.class, str);
    }

    public static PagedLoader$LoadState[] values() {
        return (PagedLoader$LoadState[]) $VALUES.clone();
    }
}
