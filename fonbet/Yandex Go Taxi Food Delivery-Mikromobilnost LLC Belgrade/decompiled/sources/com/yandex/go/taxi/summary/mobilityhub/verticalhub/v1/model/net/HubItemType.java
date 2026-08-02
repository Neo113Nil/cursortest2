package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubItemType;", "", "SECTION_HEADER", "DEFAULT_OFFER_ITEM", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HubItemType[] $VALUES;
    public static final HubItemType DEFAULT_OFFER_ITEM;
    public static final HubItemType SECTION_HEADER;
    public static final HubItemType UNKNOWN;

    static {
        HubItemType hubItemType = new HubItemType("SECTION_HEADER", 0);
        SECTION_HEADER = hubItemType;
        HubItemType hubItemType2 = new HubItemType("DEFAULT_OFFER_ITEM", 1);
        DEFAULT_OFFER_ITEM = hubItemType2;
        HubItemType hubItemType3 = new HubItemType("UNKNOWN", 2);
        UNKNOWN = hubItemType3;
        HubItemType[] hubItemTypeArr = {hubItemType, hubItemType2, hubItemType3};
        $VALUES = hubItemTypeArr;
        $ENTRIES = kotlin.enums.a.a(hubItemTypeArr);
    }

    public static HubItemType valueOf(String str) {
        return (HubItemType) Enum.valueOf(HubItemType.class, str);
    }

    public static HubItemType[] values() {
        return (HubItemType[]) $VALUES.clone();
    }
}
