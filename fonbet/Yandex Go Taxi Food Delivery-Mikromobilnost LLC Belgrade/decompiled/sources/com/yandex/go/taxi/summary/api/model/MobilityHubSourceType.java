package com.yandex.go.taxi.summary.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/summary/api/model/MobilityHubSourceType;", "", "HUB", "TRANSPORT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MobilityHubSourceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobilityHubSourceType[] $VALUES;
    public static final MobilityHubSourceType HUB;
    public static final MobilityHubSourceType TRANSPORT;

    static {
        MobilityHubSourceType mobilityHubSourceType = new MobilityHubSourceType("HUB", 0);
        HUB = mobilityHubSourceType;
        MobilityHubSourceType mobilityHubSourceType2 = new MobilityHubSourceType("TRANSPORT", 1);
        TRANSPORT = mobilityHubSourceType2;
        MobilityHubSourceType[] mobilityHubSourceTypeArr = {mobilityHubSourceType, mobilityHubSourceType2};
        $VALUES = mobilityHubSourceTypeArr;
        $ENTRIES = a.a(mobilityHubSourceTypeArr);
    }

    public static MobilityHubSourceType valueOf(String str) {
        return (MobilityHubSourceType) Enum.valueOf(MobilityHubSourceType.class, str);
    }

    public static MobilityHubSourceType[] values() {
        return (MobilityHubSourceType[]) $VALUES.clone();
    }
}
