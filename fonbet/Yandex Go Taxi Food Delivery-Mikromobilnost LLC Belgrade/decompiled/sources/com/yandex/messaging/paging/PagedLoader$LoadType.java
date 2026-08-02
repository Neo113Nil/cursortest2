package com.yandex.messaging.paging;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/messaging/paging/PagedLoader$LoadType", "", "Lcom/yandex/messaging/paging/PagedLoader$LoadType;", "INIT", "APPEND", "PREPEND", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PagedLoader$LoadType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PagedLoader$LoadType[] $VALUES;
    public static final PagedLoader$LoadType APPEND;
    public static final PagedLoader$LoadType INIT;
    public static final PagedLoader$LoadType PREPEND;

    static {
        PagedLoader$LoadType pagedLoader$LoadType = new PagedLoader$LoadType("INIT", 0);
        INIT = pagedLoader$LoadType;
        PagedLoader$LoadType pagedLoader$LoadType2 = new PagedLoader$LoadType("APPEND", 1);
        APPEND = pagedLoader$LoadType2;
        PagedLoader$LoadType pagedLoader$LoadType3 = new PagedLoader$LoadType("PREPEND", 2);
        PREPEND = pagedLoader$LoadType3;
        PagedLoader$LoadType[] pagedLoader$LoadTypeArr = {pagedLoader$LoadType, pagedLoader$LoadType2, pagedLoader$LoadType3};
        $VALUES = pagedLoader$LoadTypeArr;
        $ENTRIES = a.a(pagedLoader$LoadTypeArr);
    }

    public static PagedLoader$LoadType valueOf(String str) {
        return (PagedLoader$LoadType) Enum.valueOf(PagedLoader$LoadType.class, str);
    }

    public static PagedLoader$LoadType[] values() {
        return (PagedLoader$LoadType[]) $VALUES.clone();
    }
}
