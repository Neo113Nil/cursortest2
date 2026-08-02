package com.yandex.go.taxi.summary.mobilityhub.deeplink;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/deeplink/HubDeeplinkHandler$TransportType", "", "Lcom/yandex/go/taxi/summary/mobilityhub/deeplink/HubDeeplinkHandler$TransportType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TRANSPORT", "PEDESTRIAN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final class HubDeeplinkHandler$TransportType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HubDeeplinkHandler$TransportType[] $VALUES;
    public static final HubDeeplinkHandler$TransportType PEDESTRIAN;
    public static final HubDeeplinkHandler$TransportType TRANSPORT;
    private final String value;

    static {
        HubDeeplinkHandler$TransportType hubDeeplinkHandler$TransportType = new HubDeeplinkHandler$TransportType("TRANSPORT", 0, "transport");
        TRANSPORT = hubDeeplinkHandler$TransportType;
        HubDeeplinkHandler$TransportType hubDeeplinkHandler$TransportType2 = new HubDeeplinkHandler$TransportType("PEDESTRIAN", 1, "pedestrian");
        PEDESTRIAN = hubDeeplinkHandler$TransportType2;
        HubDeeplinkHandler$TransportType[] hubDeeplinkHandler$TransportTypeArr = {hubDeeplinkHandler$TransportType, hubDeeplinkHandler$TransportType2};
        $VALUES = hubDeeplinkHandler$TransportTypeArr;
        $ENTRIES = kotlin.enums.a.a(hubDeeplinkHandler$TransportTypeArr);
    }

    public HubDeeplinkHandler$TransportType(String str, int i, String str2) {
        this.value = str2;
    }

    public static HubDeeplinkHandler$TransportType valueOf(String str) {
        return (HubDeeplinkHandler$TransportType) Enum.valueOf(HubDeeplinkHandler$TransportType.class, str);
    }

    public static HubDeeplinkHandler$TransportType[] values() {
        return (HubDeeplinkHandler$TransportType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
