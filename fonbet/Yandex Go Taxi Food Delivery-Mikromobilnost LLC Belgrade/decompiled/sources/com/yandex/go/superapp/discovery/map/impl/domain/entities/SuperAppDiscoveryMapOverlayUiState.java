package com.yandex.go.superapp.discovery.map.impl.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/domain/entities/SuperAppDiscoveryMapOverlayUiState;", "", "SHOWED", "HIDDEN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapOverlayUiState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppDiscoveryMapOverlayUiState[] $VALUES;
    public static final SuperAppDiscoveryMapOverlayUiState HIDDEN;
    public static final SuperAppDiscoveryMapOverlayUiState SHOWED;

    static {
        SuperAppDiscoveryMapOverlayUiState superAppDiscoveryMapOverlayUiState = new SuperAppDiscoveryMapOverlayUiState("SHOWED", 0);
        SHOWED = superAppDiscoveryMapOverlayUiState;
        SuperAppDiscoveryMapOverlayUiState superAppDiscoveryMapOverlayUiState2 = new SuperAppDiscoveryMapOverlayUiState("HIDDEN", 1);
        HIDDEN = superAppDiscoveryMapOverlayUiState2;
        SuperAppDiscoveryMapOverlayUiState[] superAppDiscoveryMapOverlayUiStateArr = {superAppDiscoveryMapOverlayUiState, superAppDiscoveryMapOverlayUiState2};
        $VALUES = superAppDiscoveryMapOverlayUiStateArr;
        $ENTRIES = a.a(superAppDiscoveryMapOverlayUiStateArr);
    }

    public static SuperAppDiscoveryMapOverlayUiState valueOf(String str) {
        return (SuperAppDiscoveryMapOverlayUiState) Enum.valueOf(SuperAppDiscoveryMapOverlayUiState.class, str);
    }

    public static SuperAppDiscoveryMapOverlayUiState[] values() {
        return (SuperAppDiscoveryMapOverlayUiState[]) $VALUES.clone();
    }
}
