package com.yandex.go.routeselector.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/routeselector/analytics/EditPointAnalytics$ButtonName", "", "Lcom/yandex/go/routeselector/analytics/EditPointAnalytics$ButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Done", "Suggest", "Entrance", "Back", "Geo", "go-client-android.features.routeselector:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EditPointAnalytics$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EditPointAnalytics$ButtonName[] $VALUES;
    public static final EditPointAnalytics$ButtonName Back;
    public static final EditPointAnalytics$ButtonName Done;
    public static final EditPointAnalytics$ButtonName Entrance;
    public static final EditPointAnalytics$ButtonName Geo;
    public static final EditPointAnalytics$ButtonName Suggest;
    private final String eventValue;

    static {
        EditPointAnalytics$ButtonName editPointAnalytics$ButtonName = new EditPointAnalytics$ButtonName("Done", 0, "done");
        Done = editPointAnalytics$ButtonName;
        EditPointAnalytics$ButtonName editPointAnalytics$ButtonName2 = new EditPointAnalytics$ButtonName("Suggest", 1, "suggest");
        Suggest = editPointAnalytics$ButtonName2;
        EditPointAnalytics$ButtonName editPointAnalytics$ButtonName3 = new EditPointAnalytics$ButtonName("Entrance", 2, "entrance");
        Entrance = editPointAnalytics$ButtonName3;
        EditPointAnalytics$ButtonName editPointAnalytics$ButtonName4 = new EditPointAnalytics$ButtonName("Back", 3, "back");
        Back = editPointAnalytics$ButtonName4;
        EditPointAnalytics$ButtonName editPointAnalytics$ButtonName5 = new EditPointAnalytics$ButtonName("Geo", 4, "geo");
        Geo = editPointAnalytics$ButtonName5;
        EditPointAnalytics$ButtonName[] editPointAnalytics$ButtonNameArr = {editPointAnalytics$ButtonName, editPointAnalytics$ButtonName2, editPointAnalytics$ButtonName3, editPointAnalytics$ButtonName4, editPointAnalytics$ButtonName5};
        $VALUES = editPointAnalytics$ButtonNameArr;
        $ENTRIES = a.a(editPointAnalytics$ButtonNameArr);
    }

    public EditPointAnalytics$ButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EditPointAnalytics$ButtonName valueOf(String str) {
        return (EditPointAnalytics$ButtonName) Enum.valueOf(EditPointAnalytics$ButtonName.class, str);
    }

    public static EditPointAnalytics$ButtonName[] values() {
        return (EditPointAnalytics$ButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
