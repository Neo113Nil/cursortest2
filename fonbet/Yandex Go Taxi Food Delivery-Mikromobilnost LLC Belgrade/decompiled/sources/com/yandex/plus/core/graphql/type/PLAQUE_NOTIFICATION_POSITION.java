package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p490;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/plus/core/graphql/type/PLAQUE_NOTIFICATION_POSITION;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "p490", "BOTTOM_LEFT", "BOTTOM_RIGHT", "TOP_LEFT", "TOP_RIGHT", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PLAQUE_NOTIFICATION_POSITION {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PLAQUE_NOTIFICATION_POSITION[] $VALUES;
    public static final PLAQUE_NOTIFICATION_POSITION BOTTOM_LEFT;
    public static final PLAQUE_NOTIFICATION_POSITION BOTTOM_RIGHT;
    public static final p490 Companion;
    public static final PLAQUE_NOTIFICATION_POSITION TOP_LEFT;
    public static final PLAQUE_NOTIFICATION_POSITION TOP_RIGHT;
    public static final PLAQUE_NOTIFICATION_POSITION UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        PLAQUE_NOTIFICATION_POSITION plaque_notification_position = new PLAQUE_NOTIFICATION_POSITION("BOTTOM_LEFT", 0, "BOTTOM_LEFT");
        BOTTOM_LEFT = plaque_notification_position;
        PLAQUE_NOTIFICATION_POSITION plaque_notification_position2 = new PLAQUE_NOTIFICATION_POSITION("BOTTOM_RIGHT", 1, "BOTTOM_RIGHT");
        BOTTOM_RIGHT = plaque_notification_position2;
        PLAQUE_NOTIFICATION_POSITION plaque_notification_position3 = new PLAQUE_NOTIFICATION_POSITION("TOP_LEFT", 2, "TOP_LEFT");
        TOP_LEFT = plaque_notification_position3;
        PLAQUE_NOTIFICATION_POSITION plaque_notification_position4 = new PLAQUE_NOTIFICATION_POSITION("TOP_RIGHT", 3, "TOP_RIGHT");
        TOP_RIGHT = plaque_notification_position4;
        PLAQUE_NOTIFICATION_POSITION plaque_notification_position5 = new PLAQUE_NOTIFICATION_POSITION("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = plaque_notification_position5;
        PLAQUE_NOTIFICATION_POSITION[] plaque_notification_positionArr = {plaque_notification_position, plaque_notification_position2, plaque_notification_position3, plaque_notification_position4, plaque_notification_position5};
        $VALUES = plaque_notification_positionArr;
        $ENTRIES = a.a(plaque_notification_positionArr);
        Companion = new p490();
        scc.g("BOTTOM_LEFT", "BOTTOM_RIGHT", "TOP_LEFT", "TOP_RIGHT");
        type = new p4o("PLAQUE_NOTIFICATION_POSITION");
    }

    public PLAQUE_NOTIFICATION_POSITION(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static PLAQUE_NOTIFICATION_POSITION valueOf(String str) {
        return (PLAQUE_NOTIFICATION_POSITION) Enum.valueOf(PLAQUE_NOTIFICATION_POSITION.class, str);
    }

    public static PLAQUE_NOTIFICATION_POSITION[] values() {
        return (PLAQUE_NOTIFICATION_POSITION[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
