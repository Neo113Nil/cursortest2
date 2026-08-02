package com.yandex.go.places.impl.ui.organizations.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/places/impl/ui/organizations/data/PageRequestState;", "", "LOADING", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PageRequestState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PageRequestState[] $VALUES;
    public static final PageRequestState ERROR;
    public static final PageRequestState LOADING;

    static {
        PageRequestState pageRequestState = new PageRequestState("LOADING", 0);
        LOADING = pageRequestState;
        PageRequestState pageRequestState2 = new PageRequestState("ERROR", 1);
        ERROR = pageRequestState2;
        PageRequestState[] pageRequestStateArr = {pageRequestState, pageRequestState2};
        $VALUES = pageRequestStateArr;
        $ENTRIES = a.a(pageRequestStateArr);
    }

    public static PageRequestState valueOf(String str) {
        return (PageRequestState) Enum.valueOf(PageRequestState.class, str);
    }

    public static PageRequestState[] values() {
        return (PageRequestState[]) $VALUES.clone();
    }
}
