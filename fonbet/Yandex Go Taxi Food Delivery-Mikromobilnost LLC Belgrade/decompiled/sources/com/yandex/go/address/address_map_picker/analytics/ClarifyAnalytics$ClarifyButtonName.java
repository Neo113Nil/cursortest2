package com.yandex.go.address.address_map_picker.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/go/address/address_map_picker/analytics/ClarifyAnalytics$ClarifyButtonName", "", "Lcom/yandex/go/address/address_map_picker/analytics/ClarifyAnalytics$ClarifyButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Save", "Done", "SaveFavorite", "Retry", "Close", "ChangeAddress", "Geo", "Compass", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClarifyAnalytics$ClarifyButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClarifyAnalytics$ClarifyButtonName[] $VALUES;
    public static final ClarifyAnalytics$ClarifyButtonName Back;
    public static final ClarifyAnalytics$ClarifyButtonName ChangeAddress;
    public static final ClarifyAnalytics$ClarifyButtonName Close;
    public static final ClarifyAnalytics$ClarifyButtonName Compass;
    public static final ClarifyAnalytics$ClarifyButtonName Done;
    public static final ClarifyAnalytics$ClarifyButtonName Geo;
    public static final ClarifyAnalytics$ClarifyButtonName Retry;
    public static final ClarifyAnalytics$ClarifyButtonName Save;
    public static final ClarifyAnalytics$ClarifyButtonName SaveFavorite;
    private final String eventValue;

    static {
        ClarifyAnalytics$ClarifyButtonName clarifyAnalytics$ClarifyButtonName = new ClarifyAnalytics$ClarifyButtonName("Back", 0, "back");
        Back = clarifyAnalytics$ClarifyButtonName;
        ClarifyAnalytics$ClarifyButtonName clarifyAnalytics$ClarifyButtonName2 = new ClarifyAnalytics$ClarifyButtonName("Save", 1, "save");
        Save = clarifyAnalytics$ClarifyButtonName2;
        ClarifyAnalytics$ClarifyButtonName clarifyAnalytics$ClarifyButtonName3 = new ClarifyAnalytics$ClarifyButtonName("Done", 2, "done");
        Done = clarifyAnalytics$ClarifyButtonName3;
        ClarifyAnalytics$ClarifyButtonName clarifyAnalytics$ClarifyButtonName4 = new ClarifyAnalytics$ClarifyButtonName("SaveFavorite", 3, "save_favorite");
        SaveFavorite = clarifyAnalytics$ClarifyButtonName4;
        ClarifyAnalytics$ClarifyButtonName clarifyAnalytics$ClarifyButtonName5 = new ClarifyAnalytics$ClarifyButtonName("Retry", 4, "retry");
        Retry = clarifyAnalytics$ClarifyButtonName5;
        ClarifyAnalytics$ClarifyButtonName clarifyAnalytics$ClarifyButtonName6 = new ClarifyAnalytics$ClarifyButtonName("Close", 5, "close");
        Close = clarifyAnalytics$ClarifyButtonName6;
        ClarifyAnalytics$ClarifyButtonName clarifyAnalytics$ClarifyButtonName7 = new ClarifyAnalytics$ClarifyButtonName("ChangeAddress", 6, "change_address");
        ChangeAddress = clarifyAnalytics$ClarifyButtonName7;
        ClarifyAnalytics$ClarifyButtonName clarifyAnalytics$ClarifyButtonName8 = new ClarifyAnalytics$ClarifyButtonName("Geo", 7, "geo");
        Geo = clarifyAnalytics$ClarifyButtonName8;
        ClarifyAnalytics$ClarifyButtonName clarifyAnalytics$ClarifyButtonName9 = new ClarifyAnalytics$ClarifyButtonName("Compass", 8, "compass");
        Compass = clarifyAnalytics$ClarifyButtonName9;
        ClarifyAnalytics$ClarifyButtonName[] clarifyAnalytics$ClarifyButtonNameArr = {clarifyAnalytics$ClarifyButtonName, clarifyAnalytics$ClarifyButtonName2, clarifyAnalytics$ClarifyButtonName3, clarifyAnalytics$ClarifyButtonName4, clarifyAnalytics$ClarifyButtonName5, clarifyAnalytics$ClarifyButtonName6, clarifyAnalytics$ClarifyButtonName7, clarifyAnalytics$ClarifyButtonName8, clarifyAnalytics$ClarifyButtonName9};
        $VALUES = clarifyAnalytics$ClarifyButtonNameArr;
        $ENTRIES = a.a(clarifyAnalytics$ClarifyButtonNameArr);
    }

    public ClarifyAnalytics$ClarifyButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ClarifyAnalytics$ClarifyButtonName valueOf(String str) {
        return (ClarifyAnalytics$ClarifyButtonName) Enum.valueOf(ClarifyAnalytics$ClarifyButtonName.class, str);
    }

    public static ClarifyAnalytics$ClarifyButtonName[] values() {
        return (ClarifyAnalytics$ClarifyButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
