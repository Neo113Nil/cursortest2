package com.yandex.go.superapp.discovery.map.api.repositories.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/api/repositories/state/SuperAppDiscoveryMapOverlayState;", "", "SELECTED", "DEFAULT", "MINIFY", "HIDDEN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapOverlayState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppDiscoveryMapOverlayState[] $VALUES;
    public static final SuperAppDiscoveryMapOverlayState DEFAULT;
    public static final SuperAppDiscoveryMapOverlayState HIDDEN;
    public static final SuperAppDiscoveryMapOverlayState MINIFY;
    public static final SuperAppDiscoveryMapOverlayState SELECTED;

    static {
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState = new SuperAppDiscoveryMapOverlayState("SELECTED", 0);
        SELECTED = superAppDiscoveryMapOverlayState;
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState2 = new SuperAppDiscoveryMapOverlayState("DEFAULT", 1);
        DEFAULT = superAppDiscoveryMapOverlayState2;
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState3 = new SuperAppDiscoveryMapOverlayState("MINIFY", 2);
        MINIFY = superAppDiscoveryMapOverlayState3;
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState4 = new SuperAppDiscoveryMapOverlayState("HIDDEN", 3);
        HIDDEN = superAppDiscoveryMapOverlayState4;
        SuperAppDiscoveryMapOverlayState[] superAppDiscoveryMapOverlayStateArr = {superAppDiscoveryMapOverlayState, superAppDiscoveryMapOverlayState2, superAppDiscoveryMapOverlayState3, superAppDiscoveryMapOverlayState4};
        $VALUES = superAppDiscoveryMapOverlayStateArr;
        $ENTRIES = a.a(superAppDiscoveryMapOverlayStateArr);
    }

    public static SuperAppDiscoveryMapOverlayState valueOf(String str) {
        return (SuperAppDiscoveryMapOverlayState) Enum.valueOf(SuperAppDiscoveryMapOverlayState.class, str);
    }

    public static SuperAppDiscoveryMapOverlayState[] values() {
        return (SuperAppDiscoveryMapOverlayState[]) $VALUES.clone();
    }
}
