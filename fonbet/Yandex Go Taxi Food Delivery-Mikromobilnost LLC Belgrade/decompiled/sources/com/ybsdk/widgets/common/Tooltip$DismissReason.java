package com.ybsdk.widgets.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/widgets/common/Tooltip$DismissReason", "", "Lcom/ybsdk/widgets/common/Tooltip$DismissReason;", "<init>", "(Ljava/lang/String;I)V", "CLICK", "TIMEOUT", "OUTSIDE_ACTION", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Tooltip$DismissReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Tooltip$DismissReason[] $VALUES;
    public static final Tooltip$DismissReason CLICK = new Tooltip$DismissReason("CLICK", 0);
    public static final Tooltip$DismissReason TIMEOUT = new Tooltip$DismissReason("TIMEOUT", 1);
    public static final Tooltip$DismissReason OUTSIDE_ACTION = new Tooltip$DismissReason("OUTSIDE_ACTION", 2);

    private static final /* synthetic */ Tooltip$DismissReason[] $values() {
        return new Tooltip$DismissReason[]{CLICK, TIMEOUT, OUTSIDE_ACTION};
    }

    static {
        Tooltip$DismissReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Tooltip$DismissReason(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Tooltip$DismissReason valueOf(String str) {
        return (Tooltip$DismissReason) Enum.valueOf(Tooltip$DismissReason.class, str);
    }

    public static Tooltip$DismissReason[] values() {
        return (Tooltip$DismissReason[]) $VALUES.clone();
    }
}
