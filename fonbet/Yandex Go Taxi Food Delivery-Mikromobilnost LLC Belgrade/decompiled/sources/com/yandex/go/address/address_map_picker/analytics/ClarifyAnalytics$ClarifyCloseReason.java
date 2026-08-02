package com.yandex.go.address.address_map_picker.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/address/address_map_picker/analytics/ClarifyAnalytics$ClarifyCloseReason", "", "Lcom/yandex/go/address/address_map_picker/analytics/ClarifyAnalytics$ClarifyCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Save", "Done", "Retry", "Close", "ChangeAddress", "Map", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClarifyAnalytics$ClarifyCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClarifyAnalytics$ClarifyCloseReason[] $VALUES;
    public static final ClarifyAnalytics$ClarifyCloseReason Back;
    public static final ClarifyAnalytics$ClarifyCloseReason ChangeAddress;
    public static final ClarifyAnalytics$ClarifyCloseReason Close;
    public static final ClarifyAnalytics$ClarifyCloseReason Done;
    public static final ClarifyAnalytics$ClarifyCloseReason Map;
    public static final ClarifyAnalytics$ClarifyCloseReason Retry;
    public static final ClarifyAnalytics$ClarifyCloseReason Save;
    private final String eventValue;

    static {
        ClarifyAnalytics$ClarifyCloseReason clarifyAnalytics$ClarifyCloseReason = new ClarifyAnalytics$ClarifyCloseReason("Back", 0, "back");
        Back = clarifyAnalytics$ClarifyCloseReason;
        ClarifyAnalytics$ClarifyCloseReason clarifyAnalytics$ClarifyCloseReason2 = new ClarifyAnalytics$ClarifyCloseReason("Save", 1, "save");
        Save = clarifyAnalytics$ClarifyCloseReason2;
        ClarifyAnalytics$ClarifyCloseReason clarifyAnalytics$ClarifyCloseReason3 = new ClarifyAnalytics$ClarifyCloseReason("Done", 2, "done");
        Done = clarifyAnalytics$ClarifyCloseReason3;
        ClarifyAnalytics$ClarifyCloseReason clarifyAnalytics$ClarifyCloseReason4 = new ClarifyAnalytics$ClarifyCloseReason("Retry", 3, "retry");
        Retry = clarifyAnalytics$ClarifyCloseReason4;
        ClarifyAnalytics$ClarifyCloseReason clarifyAnalytics$ClarifyCloseReason5 = new ClarifyAnalytics$ClarifyCloseReason("Close", 4, "close");
        Close = clarifyAnalytics$ClarifyCloseReason5;
        ClarifyAnalytics$ClarifyCloseReason clarifyAnalytics$ClarifyCloseReason6 = new ClarifyAnalytics$ClarifyCloseReason("ChangeAddress", 5, "change_address");
        ChangeAddress = clarifyAnalytics$ClarifyCloseReason6;
        ClarifyAnalytics$ClarifyCloseReason clarifyAnalytics$ClarifyCloseReason7 = new ClarifyAnalytics$ClarifyCloseReason("Map", 6, PolicyMappingsExtension.MAP);
        Map = clarifyAnalytics$ClarifyCloseReason7;
        ClarifyAnalytics$ClarifyCloseReason[] clarifyAnalytics$ClarifyCloseReasonArr = {clarifyAnalytics$ClarifyCloseReason, clarifyAnalytics$ClarifyCloseReason2, clarifyAnalytics$ClarifyCloseReason3, clarifyAnalytics$ClarifyCloseReason4, clarifyAnalytics$ClarifyCloseReason5, clarifyAnalytics$ClarifyCloseReason6, clarifyAnalytics$ClarifyCloseReason7};
        $VALUES = clarifyAnalytics$ClarifyCloseReasonArr;
        $ENTRIES = a.a(clarifyAnalytics$ClarifyCloseReasonArr);
    }

    public ClarifyAnalytics$ClarifyCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ClarifyAnalytics$ClarifyCloseReason valueOf(String str) {
        return (ClarifyAnalytics$ClarifyCloseReason) Enum.valueOf(ClarifyAnalytics$ClarifyCloseReason.class, str);
    }

    public static ClarifyAnalytics$ClarifyCloseReason[] values() {
        return (ClarifyAnalytics$ClarifyCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
