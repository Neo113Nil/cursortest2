package com.yandex.go.superapp.discovery.map.impl.experiments.v2;

import defpackage.cyv0;
import defpackage.eyv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType", "", "Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType;", "Companion", "eyv0", "UNSUPPORTED", "CLOSE", "SUPERAPP_SEARCH", "DEEPLINK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType CLOSE;
    public static final eyv0 Companion;
    public static final SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType DEEPLINK;
    public static final SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType SUPERAPP_SEARCH;
    public static final SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType UNSUPPORTED;

    static {
        SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType = new SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType("UNSUPPORTED", 0);
        UNSUPPORTED = superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType;
        SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType2 = new SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType("CLOSE", 1);
        CLOSE = superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType2;
        SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType3 = new SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType("SUPERAPP_SEARCH", 2);
        SUPERAPP_SEARCH = superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType3;
        SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType4 = new SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType("DEEPLINK", 3);
        DEEPLINK = superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType4;
        SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType[] superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionTypeArr = {superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType, superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType2, superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType3, superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType4};
        $VALUES = superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(superAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionTypeArr);
        Companion = new eyv0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(3));
    }

    public static SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType valueOf(String str) {
        return (SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType) Enum.valueOf(SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType.class, str);
    }

    public static SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType[] values() {
        return (SuperAppDiscoveryMapV2Experiment$SearchbarAction$SearchbarActionType[]) $VALUES.clone();
    }
}
