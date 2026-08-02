package com.ybsdk.widgets.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/widgets/common/Tooltip$PreferredGravity", "", "Lcom/ybsdk/widgets/common/Tooltip$PreferredGravity;", "<init>", "(Ljava/lang/String;I)V", "START", "CENTER", "END", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Tooltip$PreferredGravity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Tooltip$PreferredGravity[] $VALUES;
    public static final Tooltip$PreferredGravity START = new Tooltip$PreferredGravity("START", 0);
    public static final Tooltip$PreferredGravity CENTER = new Tooltip$PreferredGravity("CENTER", 1);
    public static final Tooltip$PreferredGravity END = new Tooltip$PreferredGravity("END", 2);

    private static final /* synthetic */ Tooltip$PreferredGravity[] $values() {
        return new Tooltip$PreferredGravity[]{START, CENTER, END};
    }

    static {
        Tooltip$PreferredGravity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Tooltip$PreferredGravity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Tooltip$PreferredGravity valueOf(String str) {
        return (Tooltip$PreferredGravity) Enum.valueOf(Tooltip$PreferredGravity.class, str);
    }

    public static Tooltip$PreferredGravity[] values() {
        return (Tooltip$PreferredGravity[]) $VALUES.clone();
    }
}
