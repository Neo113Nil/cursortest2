package com.yandex.go.due_timetable.experiment.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wez0;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due_timetable/experiment/model/TimetableMainAction;", "", "Companion", "wez0", "CONFIRM_ORDER", "PROCEED_TO_SUMMARY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimetableMainAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimetableMainAction[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TimetableMainAction CONFIRM_ORDER;
    public static final wez0 Companion;
    public static final TimetableMainAction PROCEED_TO_SUMMARY;

    static {
        TimetableMainAction timetableMainAction = new TimetableMainAction("CONFIRM_ORDER", 0);
        CONFIRM_ORDER = timetableMainAction;
        TimetableMainAction timetableMainAction2 = new TimetableMainAction("PROCEED_TO_SUMMARY", 1);
        PROCEED_TO_SUMMARY = timetableMainAction2;
        TimetableMainAction[] timetableMainActionArr = {timetableMainAction, timetableMainAction2};
        $VALUES = timetableMainActionArr;
        $ENTRIES = kotlin.enums.a.a(timetableMainActionArr);
        Companion = new wez0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(24));
    }

    public static TimetableMainAction valueOf(String str) {
        return (TimetableMainAction) Enum.valueOf(TimetableMainAction.class, str);
    }

    public static TimetableMainAction[] values() {
        return (TimetableMainAction[]) $VALUES.clone();
    }
}
