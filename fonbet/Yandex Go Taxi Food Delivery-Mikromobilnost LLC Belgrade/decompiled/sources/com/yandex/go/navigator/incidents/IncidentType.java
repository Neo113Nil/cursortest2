package com.yandex.go.navigator.incidents;

import defpackage.k4o;
import defpackage.kyh0;
import defpackage.v2h0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/navigator/incidents/IncidentType;", "", "", "notSelectedIconRes", CA20Status.STATUS_USER_I, "a", "()I", "selectedIconRes", "b", "titleRes", "c", "Camera", "Police", "RoadWorks", "Accident", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IncidentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IncidentType[] $VALUES;
    public static final IncidentType Accident;
    public static final IncidentType Camera;
    public static final IncidentType Police;
    public static final IncidentType RoadWorks;
    private final int notSelectedIconRes;
    private final int selectedIconRes;
    private final int titleRes;

    static {
        IncidentType incidentType = new IncidentType(0, v2h0.ic_event_alt_camera, v2h0.ic_event_alt_camera_accent, kyh0.navigator_incidents_camera_button, "Camera");
        Camera = incidentType;
        IncidentType incidentType2 = new IncidentType(1, v2h0.ic_event_alt_police, v2h0.ic_event_alt_police_accent, kyh0.navigator_incidents_police_button, "Police");
        Police = incidentType2;
        IncidentType incidentType3 = new IncidentType(2, v2h0.ic_event_alt_reconstruction, v2h0.ic_event_alt_reconstruction_accent, kyh0.navigator_incidents_road_works_button, "RoadWorks");
        RoadWorks = incidentType3;
        IncidentType incidentType4 = new IncidentType(3, v2h0.ic_event_alt_accident, v2h0.ic_event_alt_accident_accent, kyh0.navigator_incidents_accident_button, "Accident");
        Accident = incidentType4;
        IncidentType[] incidentTypeArr = {incidentType, incidentType2, incidentType3, incidentType4};
        $VALUES = incidentTypeArr;
        $ENTRIES = a.a(incidentTypeArr);
    }

    public IncidentType(int i, int i2, int i3, int i4, String str) {
        this.notSelectedIconRes = i2;
        this.selectedIconRes = i3;
        this.titleRes = i4;
    }

    public static IncidentType valueOf(String str) {
        return (IncidentType) Enum.valueOf(IncidentType.class, str);
    }

    public static IncidentType[] values() {
        return (IncidentType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getNotSelectedIconRes() {
        return this.notSelectedIconRes;
    }

    /* renamed from: b, reason: from getter */
    public final int getSelectedIconRes() {
        return this.selectedIconRes;
    }

    /* renamed from: c, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }
}
