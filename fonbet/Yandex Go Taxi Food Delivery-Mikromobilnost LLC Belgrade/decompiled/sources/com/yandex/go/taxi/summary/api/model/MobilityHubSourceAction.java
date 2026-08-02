package com.yandex.go.taxi.summary.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/summary/api/model/MobilityHubSourceAction;", "", "OPENED_FROM_TAXI_VERTICAL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MobilityHubSourceAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobilityHubSourceAction[] $VALUES;
    public static final MobilityHubSourceAction OPENED_FROM_TAXI_VERTICAL;

    static {
        MobilityHubSourceAction mobilityHubSourceAction = new MobilityHubSourceAction("OPENED_FROM_TAXI_VERTICAL", 0);
        OPENED_FROM_TAXI_VERTICAL = mobilityHubSourceAction;
        MobilityHubSourceAction[] mobilityHubSourceActionArr = {mobilityHubSourceAction};
        $VALUES = mobilityHubSourceActionArr;
        $ENTRIES = a.a(mobilityHubSourceActionArr);
    }

    public static MobilityHubSourceAction valueOf(String str) {
        return (MobilityHubSourceAction) Enum.valueOf(MobilityHubSourceAction.class, str);
    }

    public static MobilityHubSourceAction[] values() {
        return (MobilityHubSourceAction[]) $VALUES.clone();
    }
}
