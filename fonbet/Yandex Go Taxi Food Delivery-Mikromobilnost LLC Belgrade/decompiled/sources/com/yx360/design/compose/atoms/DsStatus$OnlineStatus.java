package com.yx360.design.compose.atoms;

import defpackage.dtm;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yx360/design/compose/atoms/DsStatus$OnlineStatus", "Ldtm;", "", "Lcom/yx360/design/compose/atoms/DsStatus$OnlineStatus;", "Online", "Busy", "Away", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsStatus$OnlineStatus implements dtm {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsStatus$OnlineStatus[] $VALUES;
    public static final DsStatus$OnlineStatus Away;
    public static final DsStatus$OnlineStatus Busy;
    public static final DsStatus$OnlineStatus Online;

    static {
        DsStatus$OnlineStatus dsStatus$OnlineStatus = new DsStatus$OnlineStatus("Online", 0);
        Online = dsStatus$OnlineStatus;
        DsStatus$OnlineStatus dsStatus$OnlineStatus2 = new DsStatus$OnlineStatus("Busy", 1);
        Busy = dsStatus$OnlineStatus2;
        DsStatus$OnlineStatus dsStatus$OnlineStatus3 = new DsStatus$OnlineStatus("Away", 2);
        Away = dsStatus$OnlineStatus3;
        DsStatus$OnlineStatus[] dsStatus$OnlineStatusArr = {dsStatus$OnlineStatus, dsStatus$OnlineStatus2, dsStatus$OnlineStatus3};
        $VALUES = dsStatus$OnlineStatusArr;
        $ENTRIES = kotlin.enums.a.a(dsStatus$OnlineStatusArr);
    }

    public static DsStatus$OnlineStatus valueOf(String str) {
        return (DsStatus$OnlineStatus) Enum.valueOf(DsStatus$OnlineStatus.class, str);
    }

    public static DsStatus$OnlineStatus[] values() {
        return (DsStatus$OnlineStatus[]) $VALUES.clone();
    }
}
