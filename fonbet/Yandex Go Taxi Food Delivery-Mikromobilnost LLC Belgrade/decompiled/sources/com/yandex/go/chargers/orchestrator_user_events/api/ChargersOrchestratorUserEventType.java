package com.yandex.go.chargers.orchestrator_user_events.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/orchestrator_user_events/api/ChargersOrchestratorUserEventType;", "", "DISCOVERY", "STATION", "OFFER", "ORDER_LEASING", "ORDER_FINISH", "go-client-android.features.chargers.orchestrator_user_events:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOrchestratorUserEventType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersOrchestratorUserEventType[] $VALUES;
    public static final ChargersOrchestratorUserEventType DISCOVERY;
    public static final ChargersOrchestratorUserEventType OFFER;
    public static final ChargersOrchestratorUserEventType ORDER_FINISH;
    public static final ChargersOrchestratorUserEventType ORDER_LEASING;
    public static final ChargersOrchestratorUserEventType STATION;

    static {
        ChargersOrchestratorUserEventType chargersOrchestratorUserEventType = new ChargersOrchestratorUserEventType("DISCOVERY", 0);
        DISCOVERY = chargersOrchestratorUserEventType;
        ChargersOrchestratorUserEventType chargersOrchestratorUserEventType2 = new ChargersOrchestratorUserEventType("STATION", 1);
        STATION = chargersOrchestratorUserEventType2;
        ChargersOrchestratorUserEventType chargersOrchestratorUserEventType3 = new ChargersOrchestratorUserEventType("OFFER", 2);
        OFFER = chargersOrchestratorUserEventType3;
        ChargersOrchestratorUserEventType chargersOrchestratorUserEventType4 = new ChargersOrchestratorUserEventType("ORDER_LEASING", 3);
        ORDER_LEASING = chargersOrchestratorUserEventType4;
        ChargersOrchestratorUserEventType chargersOrchestratorUserEventType5 = new ChargersOrchestratorUserEventType("ORDER_FINISH", 4);
        ORDER_FINISH = chargersOrchestratorUserEventType5;
        ChargersOrchestratorUserEventType[] chargersOrchestratorUserEventTypeArr = {chargersOrchestratorUserEventType, chargersOrchestratorUserEventType2, chargersOrchestratorUserEventType3, chargersOrchestratorUserEventType4, chargersOrchestratorUserEventType5};
        $VALUES = chargersOrchestratorUserEventTypeArr;
        $ENTRIES = a.a(chargersOrchestratorUserEventTypeArr);
    }

    public static ChargersOrchestratorUserEventType valueOf(String str) {
        return (ChargersOrchestratorUserEventType) Enum.valueOf(ChargersOrchestratorUserEventType.class, str);
    }

    public static ChargersOrchestratorUserEventType[] values() {
        return (ChargersOrchestratorUserEventType[]) $VALUES.clone();
    }
}
