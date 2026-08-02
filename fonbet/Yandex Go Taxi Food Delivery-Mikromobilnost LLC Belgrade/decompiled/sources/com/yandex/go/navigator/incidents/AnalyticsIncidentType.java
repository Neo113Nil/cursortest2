package com.yandex.go.navigator.incidents;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/navigator/incidents/AnalyticsIncidentType;", "", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Police", "RoadWorks", "Camera", "Accident", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnalyticsIncidentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnalyticsIncidentType[] $VALUES;
    public static final AnalyticsIncidentType Accident;
    public static final AnalyticsIncidentType Camera;
    public static final AnalyticsIncidentType Police;
    public static final AnalyticsIncidentType RoadWorks;
    private final String type;

    static {
        AnalyticsIncidentType analyticsIncidentType = new AnalyticsIncidentType("Police", 0, "police");
        Police = analyticsIncidentType;
        AnalyticsIncidentType analyticsIncidentType2 = new AnalyticsIncidentType("RoadWorks", 1, "road_works");
        RoadWorks = analyticsIncidentType2;
        AnalyticsIncidentType analyticsIncidentType3 = new AnalyticsIncidentType("Camera", 2, "camera");
        Camera = analyticsIncidentType3;
        AnalyticsIncidentType analyticsIncidentType4 = new AnalyticsIncidentType("Accident", 3, "accident");
        Accident = analyticsIncidentType4;
        AnalyticsIncidentType[] analyticsIncidentTypeArr = {analyticsIncidentType, analyticsIncidentType2, analyticsIncidentType3, analyticsIncidentType4};
        $VALUES = analyticsIncidentTypeArr;
        $ENTRIES = a.a(analyticsIncidentTypeArr);
    }

    public AnalyticsIncidentType(String str, int i, String str2) {
        this.type = str2;
    }

    public static AnalyticsIncidentType valueOf(String str) {
        return (AnalyticsIncidentType) Enum.valueOf(AnalyticsIncidentType.class, str);
    }

    public static AnalyticsIncidentType[] values() {
        return (AnalyticsIncidentType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
