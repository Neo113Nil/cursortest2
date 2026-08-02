package com.yandex.go.navigator.models;

import defpackage.k4o;
import defpackage.nhe0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/navigator/models/PredefinedButtonsIds;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "nhe0", "ALT_ROUTE", "OVERVIEW_BUTTON", "SETTINGS_BUTTON", "PLACE_REPORT_BUTTON", "PETROL_STATION_BUTTON", "SHARE_BUTTON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PredefinedButtonsIds {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PredefinedButtonsIds[] $VALUES;
    public static final PredefinedButtonsIds ALT_ROUTE;
    public static final nhe0 Companion;
    public static final PredefinedButtonsIds OVERVIEW_BUTTON;
    public static final PredefinedButtonsIds PETROL_STATION_BUTTON;
    public static final PredefinedButtonsIds PLACE_REPORT_BUTTON;
    public static final PredefinedButtonsIds SETTINGS_BUTTON;
    public static final PredefinedButtonsIds SHARE_BUTTON;
    private final String id;

    static {
        PredefinedButtonsIds predefinedButtonsIds = new PredefinedButtonsIds("ALT_ROUTE", 0, "alt_route_button");
        ALT_ROUTE = predefinedButtonsIds;
        PredefinedButtonsIds predefinedButtonsIds2 = new PredefinedButtonsIds("OVERVIEW_BUTTON", 1, "overview_button");
        OVERVIEW_BUTTON = predefinedButtonsIds2;
        PredefinedButtonsIds predefinedButtonsIds3 = new PredefinedButtonsIds("SETTINGS_BUTTON", 2, "settings_button");
        SETTINGS_BUTTON = predefinedButtonsIds3;
        PredefinedButtonsIds predefinedButtonsIds4 = new PredefinedButtonsIds("PLACE_REPORT_BUTTON", 3, "place_report_button");
        PLACE_REPORT_BUTTON = predefinedButtonsIds4;
        PredefinedButtonsIds predefinedButtonsIds5 = new PredefinedButtonsIds("PETROL_STATION_BUTTON", 4, "petrol_station_button");
        PETROL_STATION_BUTTON = predefinedButtonsIds5;
        PredefinedButtonsIds predefinedButtonsIds6 = new PredefinedButtonsIds("SHARE_BUTTON", 5, "share_button");
        SHARE_BUTTON = predefinedButtonsIds6;
        PredefinedButtonsIds[] predefinedButtonsIdsArr = {predefinedButtonsIds, predefinedButtonsIds2, predefinedButtonsIds3, predefinedButtonsIds4, predefinedButtonsIds5, predefinedButtonsIds6};
        $VALUES = predefinedButtonsIdsArr;
        $ENTRIES = kotlin.enums.a.a(predefinedButtonsIdsArr);
        Companion = new nhe0();
    }

    public PredefinedButtonsIds(String str, int i, String str2) {
        this.id = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static PredefinedButtonsIds valueOf(String str) {
        return (PredefinedButtonsIds) Enum.valueOf(PredefinedButtonsIds.class, str);
    }

    public static PredefinedButtonsIds[] values() {
        return (PredefinedButtonsIds[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
