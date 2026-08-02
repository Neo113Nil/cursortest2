package com.yandex.go.superapp.discovery.map.impl.experiments;

import defpackage.bnv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xtv0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType", "", "Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType;", "Companion", "xtv0", "UNSUPPORTED", "CLOSE", "SUPERAPP_SEARCH", "DEEPLINK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType CLOSE;
    public static final xtv0 Companion;
    public static final SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType DEEPLINK;
    public static final SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType SUPERAPP_SEARCH;
    public static final SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType UNSUPPORTED;

    static {
        SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType = new SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType("UNSUPPORTED", 0);
        UNSUPPORTED = superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType;
        SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType2 = new SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType("CLOSE", 1);
        CLOSE = superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType2;
        SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType3 = new SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType("SUPERAPP_SEARCH", 2);
        SUPERAPP_SEARCH = superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType3;
        SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType4 = new SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType("DEEPLINK", 3);
        DEEPLINK = superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType4;
        SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType[] superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionTypeArr = {superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType, superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType2, superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType3, superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType4};
        $VALUES = superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionTypeArr);
        Companion = new xtv0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bnv0(20));
    }

    public static SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType valueOf(String str) {
        return (SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType) Enum.valueOf(SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType.class, str);
    }

    public static SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType[] values() {
        return (SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType[]) $VALUES.clone();
    }
}
