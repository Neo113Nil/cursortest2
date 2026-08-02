package com.yandex.go.flex.screens.common.flexible.layout.manager;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/AdapterEvents;", "", "ADD", "MOVE", "REMOVE", "UPDATE", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AdapterEvents {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AdapterEvents[] $VALUES;
    public static final AdapterEvents ADD;
    public static final AdapterEvents MOVE;
    public static final AdapterEvents REMOVE;
    public static final AdapterEvents UPDATE;

    static {
        AdapterEvents adapterEvents = new AdapterEvents("ADD", 0);
        ADD = adapterEvents;
        AdapterEvents adapterEvents2 = new AdapterEvents("MOVE", 1);
        MOVE = adapterEvents2;
        AdapterEvents adapterEvents3 = new AdapterEvents("REMOVE", 2);
        REMOVE = adapterEvents3;
        AdapterEvents adapterEvents4 = new AdapterEvents("UPDATE", 3);
        UPDATE = adapterEvents4;
        AdapterEvents[] adapterEventsArr = {adapterEvents, adapterEvents2, adapterEvents3, adapterEvents4};
        $VALUES = adapterEventsArr;
        $ENTRIES = kotlin.enums.a.a(adapterEventsArr);
    }

    public static AdapterEvents valueOf(String str) {
        return (AdapterEvents) Enum.valueOf(AdapterEvents.class, str);
    }

    public static AdapterEvents[] values() {
        return (AdapterEvents[]) $VALUES.clone();
    }
}
