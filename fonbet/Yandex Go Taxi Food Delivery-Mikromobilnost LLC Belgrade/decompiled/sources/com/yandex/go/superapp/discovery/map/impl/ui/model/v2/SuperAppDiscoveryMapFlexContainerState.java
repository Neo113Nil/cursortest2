package com.yandex.go.superapp.discovery.map.impl.ui.model.v2;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/model/v2/SuperAppDiscoveryMapFlexContainerState;", "", JCP.RAW_PREFIX, "LOADING", "SUCCESS", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapFlexContainerState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppDiscoveryMapFlexContainerState[] $VALUES;
    public static final SuperAppDiscoveryMapFlexContainerState ERROR;
    public static final SuperAppDiscoveryMapFlexContainerState LOADING;
    public static final SuperAppDiscoveryMapFlexContainerState NONE;
    public static final SuperAppDiscoveryMapFlexContainerState SUCCESS;

    static {
        SuperAppDiscoveryMapFlexContainerState superAppDiscoveryMapFlexContainerState = new SuperAppDiscoveryMapFlexContainerState(JCP.RAW_PREFIX, 0);
        NONE = superAppDiscoveryMapFlexContainerState;
        SuperAppDiscoveryMapFlexContainerState superAppDiscoveryMapFlexContainerState2 = new SuperAppDiscoveryMapFlexContainerState("LOADING", 1);
        LOADING = superAppDiscoveryMapFlexContainerState2;
        SuperAppDiscoveryMapFlexContainerState superAppDiscoveryMapFlexContainerState3 = new SuperAppDiscoveryMapFlexContainerState("SUCCESS", 2);
        SUCCESS = superAppDiscoveryMapFlexContainerState3;
        SuperAppDiscoveryMapFlexContainerState superAppDiscoveryMapFlexContainerState4 = new SuperAppDiscoveryMapFlexContainerState("ERROR", 3);
        ERROR = superAppDiscoveryMapFlexContainerState4;
        SuperAppDiscoveryMapFlexContainerState[] superAppDiscoveryMapFlexContainerStateArr = {superAppDiscoveryMapFlexContainerState, superAppDiscoveryMapFlexContainerState2, superAppDiscoveryMapFlexContainerState3, superAppDiscoveryMapFlexContainerState4};
        $VALUES = superAppDiscoveryMapFlexContainerStateArr;
        $ENTRIES = a.a(superAppDiscoveryMapFlexContainerStateArr);
    }

    public static SuperAppDiscoveryMapFlexContainerState valueOf(String str) {
        return (SuperAppDiscoveryMapFlexContainerState) Enum.valueOf(SuperAppDiscoveryMapFlexContainerState.class, str);
    }

    public static SuperAppDiscoveryMapFlexContainerState[] values() {
        return (SuperAppDiscoveryMapFlexContainerState[]) $VALUES.clone();
    }
}
