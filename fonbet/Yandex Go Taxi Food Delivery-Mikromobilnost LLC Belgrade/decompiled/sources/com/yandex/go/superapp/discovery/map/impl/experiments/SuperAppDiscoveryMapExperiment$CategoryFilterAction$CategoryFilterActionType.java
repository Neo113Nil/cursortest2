package com.yandex.go.superapp.discovery.map.impl.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tsv0;
import defpackage.ttv0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType", "", "Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType;", "Companion", "ttv0", "OPEN_ORGANIZATIONS_ACTION", "OPEN_SERVICE_ACTION", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ttv0 Companion;
    public static final SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType OPEN_ORGANIZATIONS_ACTION;
    public static final SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType OPEN_SERVICE_ACTION;
    public static final SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType UNKNOWN;

    static {
        SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType = new SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType("OPEN_ORGANIZATIONS_ACTION", 0);
        OPEN_ORGANIZATIONS_ACTION = superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType;
        SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType2 = new SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType("OPEN_SERVICE_ACTION", 1);
        OPEN_SERVICE_ACTION = superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType2;
        SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType3 = new SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType("UNKNOWN", 2);
        UNKNOWN = superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType3;
        SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType[] superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionTypeArr = {superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType, superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType2, superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType3};
        $VALUES = superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionTypeArr);
        Companion = new ttv0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(4));
    }

    public static SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType valueOf(String str) {
        return (SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType) Enum.valueOf(SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType.class, str);
    }

    public static SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType[] values() {
        return (SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType[]) $VALUES.clone();
    }
}
