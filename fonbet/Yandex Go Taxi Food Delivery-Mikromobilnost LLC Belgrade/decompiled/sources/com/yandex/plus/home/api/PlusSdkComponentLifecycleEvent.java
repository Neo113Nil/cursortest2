package com.yandex.plus.home.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/plus/home/api/PlusSdkComponentLifecycleEvent;", "", "FIRST_COMPONENT_CREATED", "FIRST_COMPONENT_STARTED", "LAST_COMPONENT_STOPPED", "LAST_COMPONENT_DESTROYED", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusSdkComponentLifecycleEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusSdkComponentLifecycleEvent[] $VALUES;
    public static final PlusSdkComponentLifecycleEvent FIRST_COMPONENT_CREATED;
    public static final PlusSdkComponentLifecycleEvent FIRST_COMPONENT_STARTED;
    public static final PlusSdkComponentLifecycleEvent LAST_COMPONENT_DESTROYED;
    public static final PlusSdkComponentLifecycleEvent LAST_COMPONENT_STOPPED;

    static {
        PlusSdkComponentLifecycleEvent plusSdkComponentLifecycleEvent = new PlusSdkComponentLifecycleEvent("FIRST_COMPONENT_CREATED", 0);
        FIRST_COMPONENT_CREATED = plusSdkComponentLifecycleEvent;
        PlusSdkComponentLifecycleEvent plusSdkComponentLifecycleEvent2 = new PlusSdkComponentLifecycleEvent("FIRST_COMPONENT_STARTED", 1);
        FIRST_COMPONENT_STARTED = plusSdkComponentLifecycleEvent2;
        PlusSdkComponentLifecycleEvent plusSdkComponentLifecycleEvent3 = new PlusSdkComponentLifecycleEvent("LAST_COMPONENT_STOPPED", 2);
        LAST_COMPONENT_STOPPED = plusSdkComponentLifecycleEvent3;
        PlusSdkComponentLifecycleEvent plusSdkComponentLifecycleEvent4 = new PlusSdkComponentLifecycleEvent("LAST_COMPONENT_DESTROYED", 3);
        LAST_COMPONENT_DESTROYED = plusSdkComponentLifecycleEvent4;
        PlusSdkComponentLifecycleEvent[] plusSdkComponentLifecycleEventArr = {plusSdkComponentLifecycleEvent, plusSdkComponentLifecycleEvent2, plusSdkComponentLifecycleEvent3, plusSdkComponentLifecycleEvent4};
        $VALUES = plusSdkComponentLifecycleEventArr;
        $ENTRIES = a.a(plusSdkComponentLifecycleEventArr);
    }

    public static PlusSdkComponentLifecycleEvent valueOf(String str) {
        return (PlusSdkComponentLifecycleEvent) Enum.valueOf(PlusSdkComponentLifecycleEvent.class, str);
    }

    public static PlusSdkComponentLifecycleEvent[] values() {
        return (PlusSdkComponentLifecycleEvent[]) $VALUES.clone();
    }
}
