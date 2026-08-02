package com.yandex.go.chargers.surge.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/chargers/surge/domain/ChargersScreenWithSurge;", "", "STATION", "OFFER", "surge"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersScreenWithSurge {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersScreenWithSurge[] $VALUES;
    public static final ChargersScreenWithSurge OFFER;
    public static final ChargersScreenWithSurge STATION;

    static {
        ChargersScreenWithSurge chargersScreenWithSurge = new ChargersScreenWithSurge("STATION", 0);
        STATION = chargersScreenWithSurge;
        ChargersScreenWithSurge chargersScreenWithSurge2 = new ChargersScreenWithSurge("OFFER", 1);
        OFFER = chargersScreenWithSurge2;
        ChargersScreenWithSurge[] chargersScreenWithSurgeArr = {chargersScreenWithSurge, chargersScreenWithSurge2};
        $VALUES = chargersScreenWithSurgeArr;
        $ENTRIES = kotlin.enums.a.a(chargersScreenWithSurgeArr);
    }

    public static ChargersScreenWithSurge valueOf(String str) {
        return (ChargersScreenWithSurge) Enum.valueOf(ChargersScreenWithSurge.class, str);
    }

    public static ChargersScreenWithSurge[] values() {
        return (ChargersScreenWithSurge[]) $VALUES.clone();
    }
}
